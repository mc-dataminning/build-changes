import io.netty.buffer.ByteBuf;

public record aae(ali c, byte[] d) implements zp<zv> {
   public static final zg<wf, aae> a = zp.a(aae::a, aae::new);
   private static final int e = 5120;
   public static final zg<ByteBuf, byte[]> b = ze.a(5120);

   private aae(wf $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(wf $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zr<aae> a() {
      return aah.i;
   }

   public void a(zv $$0) {
      $$0.a(this);
   }

   public ali b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
