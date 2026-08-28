public class cbu extends cct {
   private final chc g;

   public cbu(chc $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.p() && !this.g.gs() && super.b();
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
   protected boolean a(dgm $$0, ji $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dwy $$2 = $$0.a_($$1);
         if ($$2.a(djp.cD)) {
            return duh.a($$0, $$1) < 1;
         } else {
            return $$2.a(djp.cL) && $$2.c(dmv.b) ? true : $$2.a(awp.T, $$0x -> $$0x.d(djg.b).map($$0xx -> $$0xx != dxl.a).orElse(true));
         }
      }
   }
}
