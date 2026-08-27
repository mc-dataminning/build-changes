public class bsy extends btx {
   private final byf g;

   public bsy(byf $$0, double $$1) {
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
   protected boolean a(cua $$0, hx $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         djp $$2 = $$0.a_($$1);
         if ($$2.a(cxa.cv)) {
            return dhk.a($$0, $$1) < 1;
         } else {
            return $$2.a(cxa.cD) && $$2.c(daf.b) ? true : $$2.a(asi.R, $$0x -> $$0x.d(cwr.b).map($$0xx -> $$0xx != dkc.a).orElse(true));
         }
      }
   }
}
