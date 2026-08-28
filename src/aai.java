import io.netty.buffer.ByteBuf;

public record aai(ale c, byte[] d) implements zv<aab> {
   public static final zm<wl, aai> a = zv.a(aai::a, aai::new);
   private static final int e = 5120;
   public static final zm<ByteBuf, byte[]> b = zk.a(5120);

   private aai(wl $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(wl $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zx<aai> a() {
      return aal.g;
   }

   public void a(aab $$0) {
      $$0.a(this);
   }

   public ale b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
