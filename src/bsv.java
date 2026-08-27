public class bsv extends btu {
   private final byb g;

   public bsv(byb $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.u() && !this.g.ge() && super.a();
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
   protected boolean a(cts $$0, hx $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         djh $$2 = $$0.a_($$1);
         if ($$2.a(cws.cv)) {
            return dhc.a($$0, $$1) < 1;
         } else {
            return $$2.a(cws.cD) && $$2.c(czx.b) ? true : $$2.a(ash.R, $$0x -> $$0x.d(cwj.b).map($$0xx -> $$0xx != dju.a).orElse(true));
         }
      }
   }
}
