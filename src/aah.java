import io.netty.buffer.ByteBuf;

public record aah(all c, byte[] d) implements zs<zy> {
   public static final zj<wi, aah> a = zs.a(aah::a, aah::new);
   private static final int e = 5120;
   public static final zj<ByteBuf, byte[]> b = zh.a(5120);

   private aah(wi $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(wi $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zu<aah> a() {
      return aak.i;
   }

   public void a(zy $$0) {
      $$0.a(this);
   }

   public all b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
