public class bpi extends bqh {
   private final bun g;

   public bpi(bun $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.p() && !this.g.fZ() && super.a();
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
   protected boolean a(cpp $$0, gu $$1) {
      if (!$$0.t($$1.c())) {
         return false;
      } else {
         dfa $$2 = $$0.a_($$1);
         if ($$2.a(csn.cv)) {
            return dct.a($$0, $$1) < 1;
         } else {
            return $$2.a(csn.cD) && $$2.c(cvp.b) ? true : $$2.a(apl.R, $$0x -> $$0x.d(csf.a).map($$0xx -> $$0xx != dfn.a).orElse(true));
         }
      }
   }
}
