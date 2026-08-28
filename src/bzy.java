public class bzy extends cax {
   private final cff g;

   public bzy(cff $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.s() && !this.g.gm() && super.b();
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
   protected boolean a(dcx $$0, jd $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dta $$2 = $$0.a_($$1);
         if ($$2.a(dfy.cv)) {
            return dqm.a($$0, $$1) < 1;
         } else {
            return $$2.a(dfy.cD) && $$2.c(djd.b) ? true : $$2.a(awd.R, $$0x -> $$0x.d(dfp.b).map($$0xx -> $$0xx != dtn.a).orElse(true));
         }
      }
   }
}
