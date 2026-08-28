import io.netty.buffer.ByteBuf;

public record aul(String c, String d, String e) {
   public static final yy<ByteBuf, aul> a = yy.a(yw.p, aul::b, yw.p, aul::c, yw.p, aul::d, aul::new);
   public static final String b = "minecraft";

   public static aul a(String $$0) {
      return new aul("minecraft", $$0, ac.b().b());
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
