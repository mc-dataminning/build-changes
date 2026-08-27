import io.netty.buffer.ByteBuf;

public record atd(String c, String d, String e) {
   public static final yv<ByteBuf, atd> a = yv.a(yt.k, atd::b, yt.k, atd::c, yt.k, atd::d, atd::new);
   public static final String b = "minecraft";

   public static atd a(String $$0) {
      return new atd("minecraft", $$0, aa.b().b());
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
