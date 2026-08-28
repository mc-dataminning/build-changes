import io.netty.buffer.ByteBuf;

public record aaf(alj c, byte[] d) implements zq<zw> {
   public static final zh<wg, aaf> a = zq.a(aaf::a, aaf::new);
   private static final int e = 5120;
   public static final zh<ByteBuf, byte[]> b = zf.a(5120);

   private aaf(wg $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(wg $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zs<aaf> a() {
      return aai.i;
   }

   public void a(zw $$0) {
      $$0.a(this);
   }

   public alj b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
