package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */
public class AlipayConfig {
	
	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016091500516448";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCG5eDL201Ld1n5YMW7X4Sr5X7xvTUKEgvZuC35bMLtWpaNJBcWLOH2KD9ueKWWrzSepPcaikrxddHICNdZtkxOlW7whMSSd9I7g0qjGDiKIrzu+GniD9Ita40xtDYhx5mfDq2U8E7EYotQ5CvJjbx23BjpriO3BdSChK60OJf5n3NW8s/257Isu7oHnEK3NJOaZ948qhrDC6zvc6SPQIP8sKZbK2cNx5njyK8OnCKCDZzwVUgvZUfrFvx5i/1mVoftkHuEF9O4KWGTLWFWzA/A8pFkw8M3HL8+HzkilVYHpamdBqdd935x7FI7e5IUdsKkSf/kQ4/K7qxQf91Afa1BAgMBAAECggEAEPRhjZ2xmFOW5mYIVCWMOkKs8tsyCGL+RE4G0TufQE/Lbk/j6vCXMeYbGtplDYxV076uJBLPmouRY0/hKTBlZNcZS3eUcUhIDxzQS7Fmoc396xcjz7rnUrga1e1thE9e+oPQw1B0xfAQzIjxC/MZheLh6rTtXjqIXCMrBhG64C/AiCn+QD3bf2D9khFcNsqR/qRqmVNuq/fkibsUvzSOt8z5ybAbPRwMN9AyavfxcVpjvNhcaWEnFy46jOlGQAPR4fqviNrmEA5dU8FThze35tfMZD6MTf2uZ9J4D2ZoZPpLUp1jm4CFAuX7+1K/Als1St3Ssm0yG70UQHFVt0uidQKBgQC+cOIErR34xATjnFd3IkkHmjTwyK6mpBA2l1WDdaRTEGWixy43oAMF3jNRVsEJMDmPFsRiWc1feEKvmXD1N2QolNBzr5qT2cQfAYo0auRkTEWmGtLuw6+L2usQ9TuD9pLDtOkWaO8Q6eD5em69u+KkPSFjlCLGKhzQjdK564LnFwKBgQC1Vh8D+DOWn72NYYMRwQc+wx2JmnUZE86pS3rywH8SfDsNUPxBUuAasVCMpIteJqoYITtUHJeNMH8G8VQ2e4YgYuU3bTr9s828lRkU2We2cLzbAICV5xKvgKPEKwlU5gHzVfVnp/vDPC4Q46ZZzBfv2Aj0Ul5+kuPyZqnWs7LFZwKBgHy0aJyNTDoRCe6N+wxtLAtJZG9jylIezusgkAOkbnViIFvGODJ+mlwmU85ok8FTje1wCCsrCPwCQRDB1qEMo46bXCDVFdDJYc638GtAr8wp0dXibMui4nofYZxaKZ3RQevbtGJTVnDp5cMX9BpURSYtTYbqgxbmjrXWmO3cFX0DAoGBAIqe2jjbnPwxAuM4PszspZA58bOGKqvP83SBaex2cO19oFrOpPd+1igxkiThiFSh8/dcOBFVhhj9kK2LAFhh1yec0iKr0qOstsLJq5G/nEPgLM6xtJpjOWqGSSqlx41qAuW0uVPTG2ek8oYgsMMGfOnxWO8EpI3X1n8wMfcaCbhTAoGBAI5bpfreyHfmMtnwnM+8Y/NVwgwr3YsqzfEDUNZhaSEJNq7qUBfSn3T5raVb83wneDVVAMRzb8j3KectCOw/GPNtX9Z5r5iJO349K0WaX3TSPuGbWEdOA/01Yc2FBUBZiaYs43Btm+U049nyXGxNKQJsOQ2mMvM2u3kzuNgHcAxc";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgSywWMC7ixkHFQ+Q7vtKx3HNr9s1A8OZaBa9B0MTQYQyViSdixOa0ImWujpiNiP9ce/Z18r4nvnqTwSX8KK29/VwovaqCYQdaJhIE3jO7S1uD4bBA2NIs7itcGrblURrtHRPMva+AmghRa8mV1LP0V6s6UR+ihUcKDtDEMnfiPAPoKKzPSKd5yNZJS5eL1Cjf5ByKxqbdsQk01JqQWY5naz7GCGHdF7gENWwG1fuFTFsObDkFBhOBnz/3bLxsqx2g9Nlg9AiXSpAy309eV4T5wfI5S+/oQY2Icbc5po0w69XegC72wMii8PwzvyWw4QD39+ZGhoV4TMsD0E6nyzQsQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "https://github.com/youcyousyunn/basic";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "https://github.com/youcyousyunn/others";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
//	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do"; // 沙箱环境支付宝网关
	
	// 支付宝网关
	public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

