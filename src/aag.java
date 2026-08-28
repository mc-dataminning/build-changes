import io.netty.buffer.ByteBuf;

public record aag(alp c, byte[] d) implements zr<zx> {
   public static final zi<wh, aag> a = zr.a(aag::a, aag::new);
   private static final int e = 5120;
   public static final zi<ByteBuf, byte[]> b = zg.a(5120);

   private aag(wh $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(wh $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zt<aag> a() {
      return aaj.i;
   }

   public void a(zx $$0) {
      $$0.a(this);
   }

   public alp b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
