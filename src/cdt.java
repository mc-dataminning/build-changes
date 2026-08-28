public class cdt extends ces {
   private final cjc g;

   public cdt(cjc $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gt() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.x(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.x(this.m());
   }

   @Override
   protected boolean a(djk $$0, iv $$1) {
      if (!$$0.v($$1.d())) {
         return false;
      } else {
         eao $$2 = $$0.a_($$1);
         if ($$2.a(dmo.cG)) {
            return dxu.a($$0, $$1) < 1;
         } else {
            return $$2.a(dmo.cO) && $$2.c(dpx.b) ? true : $$2.a(axc.T, $$0x -> $$0x.d(dmf.b).map($$0xx -> $$0xx != ebb.a).orElse(true));
         }
      }
   }
}
