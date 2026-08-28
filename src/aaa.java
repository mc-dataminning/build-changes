import io.netty.buffer.ByteBuf;

public record aaa(ale c, byte[] d) implements zl<zr> {
   public static final zc<wb, aaa> a = zl.a(aaa::a, aaa::new);
   private static final int e = 5120;
   public static final zc<ByteBuf, byte[]> b = za.a(5120);

   private aaa(wb $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(wb $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zn<aaa> a() {
      return aad.i;
   }

   public void a(zr $$0) {
      $$0.a(this);
   }

   public ale b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
