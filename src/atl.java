import io.netty.buffer.ByteBuf;

public record atl(String c, String d, String e) {
   public static final yx<ByteBuf, atl> a = yx.a(yv.l, atl::b, yv.l, atl::c, yv.l, atl::d, atl::new);
   public static final String b = "minecraft";

   public static atl a(String $$0) {
      return new atl("minecraft", $$0, ab.b().b());
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
