import io.netty.buffer.ByteBuf;

public record arv(String c, String d, String e) {
   public static final xs<ByteBuf, arv> a = xs.a(xq.i, arv::b, xq.i, arv::c, xq.i, arv::d, arv::new);
   public static final String b = "minecraft";

   public static arv a(String $$0) {
      return new arv("minecraft", $$0, aa.b().b());
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
