public class ccn extends cdm {
   private final chv g;

   public ccn(chv $$0, double $$1) {
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
   protected boolean a(dhd $$0, jh $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dxn $$2 = $$0.a_($$1);
         if ($$2.a(dkg.cD)) {
            return duw.a($$0, $$1) < 1;
         } else {
            return $$2.a(dkg.cL) && $$2.c(dnm.b) ? true : $$2.a(axu.T, $$0x -> $$0x.d(djx.b).map($$0xx -> $$0xx != dya.a).orElse(true));
         }
      }
   }
}
