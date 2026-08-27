public class brp extends bso {
   private final bwu g;

   public brp(bwu $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.u() && !this.g.gf() && super.a();
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
   protected boolean a(csd $$0, ht $$1) {
      if (!$$0.t($$1.c())) {
         return false;
      } else {
         dhi $$2 = $$0.a_($$1);
         if ($$2.a(cvc.cv)) {
            return dfk.a($$0, $$1) < 1;
         } else {
            return $$2.a(cvc.cD) && $$2.c(cyh.b) ? true : $$2.a(arg.R, $$0x -> $$0x.d(cut.b).map($$0xx -> $$0xx != dhv.a).orElse(true));
         }
      }
   }
}
