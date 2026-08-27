import io.netty.buffer.ByteBuf;

public record asy(String c, String d, String e) {
   public static final ys<ByteBuf, asy> a = ys.a(yq.k, asy::b, yq.k, asy::c, yq.k, asy::d, asy::new);
   public static final String b = "minecraft";

   public static asy a(String $$0) {
      return new asy("minecraft", $$0, aa.b().b());
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
