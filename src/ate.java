import io.netty.buffer.ByteBuf;

public record ate(String c, String d, String e) {
   public static final yv<ByteBuf, ate> a = yv.a(yt.k, ate::b, yt.k, ate::c, yt.k, ate::d, ate::new);
   public static final String b = "minecraft";

   public static ate a(String $$0) {
      return new ate("minecraft", $$0, aa.b().b());
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
