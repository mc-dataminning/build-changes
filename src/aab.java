public class aab {
   public static final zn<zs> a = a("custom_payload");
   public static final zn<zt> b = a("disconnect");
   public static final zn<zu> c = a("keep_alive");
   public static final zn<zv> d = a("ping");
   public static final zn<zw> e = a("resource_pack_pop");
   public static final zn<zx> f = a("resource_pack_push");
   public static final zn<zy> g = a("store_cookie");
   public static final zn<zz> h = a("transfer");
   public static final zn<aaa> i = a("update_tags");
   public static final zn<aad> j = b("client_information");
   public static final zn<aae> k = b("custom_payload");
   public static final zn<aaf> l = b("keep_alive");
   public static final zn<aag> m = b("pong");
   public static final zn<aah> n = b("resource_pack");

   private static <T extends zl<zr>> zn<T> a(String $$0) {
      return new zn<>(zm.b, new akt($$0));
   }

   private static <T extends zl<aac>> zn<T> b(String $$0) {
      return new zn<>(zm.a, new akt($$0));
   }
}
