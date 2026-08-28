import io.netty.buffer.ByteBuf;

public record aua(String c, String d, String e) {
   public static final zb<ByteBuf, aua> a = zb.a(yz.l, aua::b, yz.l, aua::c, yz.l, aua::d, aua::new);
   public static final String b = "minecraft";

   public static aua a(String $$0) {
      return new aua("minecraft", $$0, ab.b().b());
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
