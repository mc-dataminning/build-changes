import io.netty.buffer.ByteBuf;

public record atw(String c, String d, String e) {
   public static final zn<ByteBuf, atw> a = zn.a(zl.l, atw::b, zl.l, atw::c, zl.l, atw::d, atw::new);
   public static final String b = "minecraft";

   public static atw a(String $$0) {
      return new atw("minecraft", $$0, aa.b().b());
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
