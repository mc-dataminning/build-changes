import io.netty.buffer.ByteBuf;

public record aug(String c, String d, String e) {
   public static final yt<ByteBuf, aug> a = yt.a(yr.o, aug::b, yr.o, aug::c, yr.o, aug::d, aug::new);
   public static final String b = "minecraft";

   public static aug a(String $$0) {
      return new aug("minecraft", $$0, ab.b().b());
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
