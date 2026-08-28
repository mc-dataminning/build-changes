public class ccr extends cdq {
   private final chz g;

   public ccr(chz $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.p() && !this.g.gm() && super.b();
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
   protected boolean a(dhk $$0, jh $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dxu $$2 = $$0.a_($$1);
         if ($$2.a(dkn.cD)) {
            return dvd.a($$0, $$1) < 1;
         } else {
            return $$2.a(dkn.cL) && $$2.c(dnt.b) ? true : $$2.a(axu.T, $$0x -> $$0x.d(dke.b).map($$0xx -> $$0xx != dyh.a).orElse(true));
         }
      }
   }
}
