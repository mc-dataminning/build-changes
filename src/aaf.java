import io.netty.buffer.ByteBuf;

public record aaf(alb c, byte[] d) implements zs<zy> {
   public static final zj<wl, aaf> a = zs.a(aaf::a, aaf::new);
   private static final int e = 5120;
   public static final zj<ByteBuf, byte[]> b = zh.a(5120);

   private aaf(wl $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(wl $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zu<aaf> a() {
      return aai.g;
   }

   public void a(zy $$0) {
      $$0.a(this);
   }

   public alb b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
