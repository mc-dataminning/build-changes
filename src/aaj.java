import io.netty.buffer.ByteBuf;

public record aaj(alf c, byte[] d) implements zw<aac> {
   public static final zn<wm, aaj> a = zw.a(aaj::a, aaj::new);
   private static final int e = 5120;
   public static final zn<ByteBuf, byte[]> b = zl.a(5120);

   private aaj(wm $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(wm $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zy<aaj> a() {
      return aam.g;
   }

   public void a(aac $$0) {
      $$0.a(this);
   }

   public alf b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
