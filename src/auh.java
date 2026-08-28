import io.netty.buffer.ByteBuf;

public record auh(String c, String d, String e) {
   public static final yu<ByteBuf, auh> a = yu.a(ys.o, auh::b, ys.o, auh::c, ys.o, auh::d, auh::new);
   public static final String b = "minecraft";

   public static auh a(String $$0) {
      return new auh("minecraft", $$0, ab.b().b());
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
