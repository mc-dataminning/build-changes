import io.netty.buffer.ByteBuf;

public record aaf(alr c, byte[] d) implements zo<zw> {
   public static final ze<vy, aaf> a = zo.a(aaf::a, aaf::new);
   private static final int e = 5120;
   public static final ze<ByteBuf, byte[]> b = zc.a(5120);

   private aaf(vy $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vy $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zq<aaf> a() {
      return aai.i;
   }

   public void a(zw $$0) {
      $$0.a(this);
   }

   public alr b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
