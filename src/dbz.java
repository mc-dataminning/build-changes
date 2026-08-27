public class dbz extends csf {
   public static final dge d = dfu.aT;
   private final int e;

   protected dbz(int $$0, dfd.d $$1, dft $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(cpq $$0, gw $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bil.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return ars.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dfe $$0) {
      return $$0.c(d);
   }

   @Override
   protected dfe a(dfe $$0, int $$1) {
      return $$0.a(d, Integer.valueOf($$1));
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(d);
   }
}
