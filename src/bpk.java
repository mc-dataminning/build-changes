public class bpk extends bqj {
   private final bup g;

   public bpk(bup $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.p() && !this.g.ga() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.y(false);
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.y(this.m());
   }

   @Override
   protected boolean a(cpt $$0, gw $$1) {
      if (!$$0.t($$1.c())) {
         return false;
      } else {
         dfe $$2 = $$0.a_($$1);
         if ($$2.a(csr.cv)) {
            return dcx.a($$0, $$1) < 1;
         } else {
            return $$2.a(csr.cD) && $$2.c(cvt.b) ? true : $$2.a(apo.R, $$0x -> $$0x.d(csj.a).map($$0xx -> $$0xx != dfr.a).orElse(true));
         }
      }
   }
}
