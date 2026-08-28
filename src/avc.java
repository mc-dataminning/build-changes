import io.netty.buffer.ByteBuf;

public record avc(String c, String d, String e) {
   public static final zt<ByteBuf, avc> a = zt.a(zr.o, avc::b, zr.o, avc::c, zr.o, avc::d, avc::new);
   public static final String b = "minecraft";

   public static avc a(String $$0) {
      return new avc("minecraft", $$0, ab.b().b());
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
