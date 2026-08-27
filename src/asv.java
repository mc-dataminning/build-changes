import io.netty.buffer.ByteBuf;

public record asv(String c, String d, String e) {
   public static final yq<ByteBuf, asv> a = yq.a(yo.k, asv::b, yo.k, asv::c, yo.k, asv::d, asv::new);
   public static final String b = "minecraft";

   public static asv a(String $$0) {
      return new asv("minecraft", $$0, aa.b().b());
   }

   public boolean a() {
      return this.c.equals("minecraft");
   }

   @Override
   public String toString() {
      return this.c + ":" + this.d + ":" + this.e;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public String d() {
      return this.e;
   }
}
