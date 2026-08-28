import io.netty.buffer.ByteBuf;

public record atz(String c, String d, String e) {
   public static final zb<ByteBuf, atz> a = zb.a(yz.l, atz::b, yz.l, atz::c, yz.l, atz::d, atz::new);
   public static final String b = "minecraft";

   public static atz a(String $$0) {
      return new atz("minecraft", $$0, ab.b().b());
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
