public class aac {
   public static final zm<zr> a = a("custom_payload");
   public static final zm<zs> b = a("custom_report_details");
   public static final zm<zt> c = a("disconnect");
   public static final zm<zu> d = a("keep_alive");
   public static final zm<zv> e = a("ping");
   public static final zm<zw> f = a("resource_pack_pop");
   public static final zm<zx> g = a("resource_pack_push");
   public static final zm<zy> h = a("server_links");
   public static final zm<zz> i = a("store_cookie");
   public static final zm<aaa> j = a("transfer");
   public static final zm<aab> k = a("update_tags");
   public static final zm<aae> l = b("client_information");
   public static final zm<aaf> m = b("custom_payload");
   public static final zm<aag> n = b("keep_alive");
   public static final zm<aah> o = b("pong");
   public static final zm<aai> p = b("resource_pack");

   private static <T extends zk<zq>> zm<T> a(String $$0) {
      return new zm<>(zl.b, alc.b($$0));
   }

   private static <T extends zk<aad>> zm<T> b(String $$0) {
      return new zm<>(zl.a, alc.b($$0));
   }
}
