import io.netty.buffer.ByteBuf;

public record auj(String c, String d, String e) {
   public static final zh<ByteBuf, auj> a = zh.a(zf.n, auj::b, zf.n, auj::c, zf.n, auj::d, auj::new);
   public static final String b = "minecraft";

   public static auj a(String $$0) {
      return new auj("minecraft", $$0, ab.b().b());
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
