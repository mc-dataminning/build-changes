import io.netty.buffer.ByteBuf;

public record atv(String c, String d, String e) {
   public static final zm<ByteBuf, atv> a = zm.a(zk.l, atv::b, zk.l, atv::c, zk.l, atv::d, atv::new);
   public static final String b = "minecraft";

   public static atv a(String $$0) {
      return new atv("minecraft", $$0, aa.b().b());
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
