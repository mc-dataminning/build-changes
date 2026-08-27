public class brh extends bsg {
   private final bwm g;

   public brh(bwm $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.s() && !this.g.ge() && super.a();
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
   protected boolean a(crv $$0, ht $$1) {
      if (!$$0.t($$1.c())) {
         return false;
      } else {
         dgw $$2 = $$0.a_($$1);
         if ($$2.a(cuv.cv)) {
            return dey.a($$0, $$1) < 1;
         } else {
            return $$2.a(cuv.cD) && $$2.c(cxz.b) ? true : $$2.a(arc.R, $$0x -> $$0x.d(cum.b).map($$0xx -> $$0xx != dhj.a).orElse(true));
         }
      }
   }
}
