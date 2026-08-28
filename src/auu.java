import io.netty.buffer.ByteBuf;

public record auu(String c, String d, String e) {
   public static final ze<ByteBuf, auu> a = ze.a(zc.p, auu::b, zc.p, auu::c, zc.p, auu::d, auu::new);
   public static final String b = "minecraft";

   public static auu a(String $$0) {
      return new auu("minecraft", $$0, ac.b().b());
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
