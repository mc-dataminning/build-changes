import io.netty.buffer.ByteBuf;

public record atk(String c, String d, String e) {
   public static final zc<ByteBuf, atk> a = zc.a(za.l, atk::b, za.l, atk::c, za.l, atk::d, atk::new);
   public static final String b = "minecraft";

   public static atk a(String $$0) {
      return new atk("minecraft", $$0, ab.b().b());
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
