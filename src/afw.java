public record afw(float b, boolean c) implements zf<abt> {
   public static final yw<vv, afw> a = zf.a(afw::a, afw::new);

   private afw(vv $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static afw a(brb $$0) {
      return new afw($$0.f(), $$0.l());
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<afw> a() {
      return agf.cf;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
