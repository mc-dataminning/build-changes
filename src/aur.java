import io.netty.buffer.ByteBuf;

public record aur(String c, String d, String e) {
   public static final zi<ByteBuf, aur> a = zi.a(zg.o, aur::b, zg.o, aur::c, zg.o, aur::d, aur::new);
   public static final String b = "minecraft";

   public static aur a(String $$0) {
      return new aur("minecraft", $$0, ab.b().b());
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
