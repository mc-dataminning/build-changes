import io.netty.buffer.ByteBuf;

public record auk(String c, String d, String e) {
   public static final zj<ByteBuf, auk> a = zj.a(zh.m, auk::b, zh.m, auk::c, zh.m, auk::d, auk::new);
   public static final String b = "minecraft";

   public static auk a(String $$0) {
      return new auk("minecraft", $$0, ab.b().b());
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
