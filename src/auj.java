import io.netty.buffer.ByteBuf;

public record auj(String c, String d, String e) {
   public static final yw<ByteBuf, auj> a = yw.a(yu.p, auj::b, yu.p, auj::c, yu.p, auj::d, auj::new);
   public static final String b = "minecraft";

   public static auj a(String $$0) {
      return new auj("minecraft", $$0, ac.b().b());
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
