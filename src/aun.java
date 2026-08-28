import io.netty.buffer.ByteBuf;

public record aun(String c, String d, String e) {
   public static final za<ByteBuf, aun> a = za.a(yy.p, aun::b, yy.p, aun::c, yy.p, aun::d, aun::new);
   public static final String b = "minecraft";

   public static aun a(String $$0) {
      return new aun("minecraft", $$0, ac.b().b());
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
