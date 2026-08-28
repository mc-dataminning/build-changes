public class ccs extends cdr {
   private final cia g;

   public ccs(cia $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.p() && !this.g.go() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.y(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.y(this.m());
   }

   @Override
   protected boolean a(dhl $$0, jh $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dxv $$2 = $$0.a_($$1);
         if ($$2.a(dko.cD)) {
            return dve.a($$0, $$1) < 1;
         } else {
            return $$2.a(dko.cL) && $$2.c(dnu.b) ? true : $$2.a(axu.T, $$0x -> $$0x.d(dkf.b).map($$0xx -> $$0xx != dyi.a).orElse(true));
         }
      }
   }
}
