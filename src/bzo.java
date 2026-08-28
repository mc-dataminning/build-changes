public class bzo extends can {
   private final cev g;

   public bzo(cev $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.s() && !this.g.gn() && super.a();
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
   protected boolean a(dcj $$0, ja $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dsl $$2 = $$0.a_($$1);
         if ($$2.a(dfk.cv)) {
            return dpx.a($$0, $$1) < 1;
         } else {
            return $$2.a(dfk.cD) && $$2.c(dip.b) ? true : $$2.a(avw.R, $$0x -> $$0x.d(dfb.b).map($$0xx -> $$0xx != dsy.a).orElse(true));
         }
      }
   }
}
