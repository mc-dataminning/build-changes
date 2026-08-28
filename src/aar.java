import io.netty.buffer.ByteBuf;

public record aar(alz c, byte[] d) implements aac<aai> {
   public static final zt<ws, aar> a = aac.a(aar::a, aar::new);
   private static final int e = 5120;
   public static final zt<ByteBuf, byte[]> b = zr.a(5120);

   private aar(ws $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(ws $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public aae<aar> a() {
      return aau.i;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public alz b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
