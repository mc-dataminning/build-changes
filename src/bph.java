public class bph extends bqg {
   private final bum g;

   public bph(bum $$0, double $$1) {
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
   protected boolean a(cpo $$0, gu $$1) {
      if (!$$0.t($$1.c())) {
         return false;
      } else {
         dez $$2 = $$0.a_($$1);
         if ($$2.a(csm.cv)) {
            return dcs.a($$0, $$1) < 1;
         } else {
            return $$2.a(csm.cD) && $$2.c(cvo.b) ? true : $$2.a(apl.R, $$0x -> $$0x.d(cse.a).map($$0xx -> $$0xx != dfm.a).orElse(true));
         }
      }
   }
}
