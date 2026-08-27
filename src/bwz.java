public class bwz extends bxy {
   private final ccg g;

   public bwz(ccg $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.r() && !this.g.gn() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.x(false);
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.x(this.m());
   }

   @Override
   protected boolean a(cza $$0, ib $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         doz $$2 = $$0.a_($$1);
         if ($$2.a(dca.cv)) {
            return dmm.a($$0, $$1) < 1;
         } else {
            return $$2.a(dca.cD) && $$2.c(dff.b) ? true : $$2.a(avc.R, $$0x -> $$0x.d(dbr.b).map($$0xx -> $$0xx != dpm.a).orElse(true));
         }
      }
   }
}
