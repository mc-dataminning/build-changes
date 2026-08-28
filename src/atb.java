import io.netty.buffer.ByteBuf;

public record atb(String c, String d, String e) {
   public static final ys<ByteBuf, atb> a = ys.a(yq.l, atb::b, yq.l, atb::c, yq.l, atb::d, atb::new);
   public static final String b = "minecraft";

   public static atb a(String $$0) {
      return new atb("minecraft", $$0, aa.b().b());
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
