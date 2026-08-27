import io.netty.buffer.ByteBuf;

public record asj(String c, String d, String e) {
   public static final ye<ByteBuf, asj> a = ye.a(yc.k, asj::b, yc.k, asj::c, yc.k, asj::d, asj::new);
   public static final String b = "minecraft";

   public static asj a(String $$0) {
      return new asj("minecraft", $$0, aa.b().b());
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
