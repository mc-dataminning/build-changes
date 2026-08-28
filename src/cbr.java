public class cbr extends ccq {
   private final cgz g;

   public cbr(cgz $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.p() && !this.g.gp() && super.b();
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
   protected boolean a(dgj $$0, ji $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dwv $$2 = $$0.a_($$1);
         if ($$2.a(djm.cD)) {
            return due.a($$0, $$1) < 1;
         } else {
            return $$2.a(djm.cL) && $$2.c(dms.b) ? true : $$2.a(awo.T, $$0x -> $$0x.d(djd.b).map($$0xx -> $$0xx != dxi.a).orElse(true));
         }
      }
   }
}
