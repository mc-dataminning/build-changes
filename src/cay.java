public class cay extends cbx {
   private final cgg g;

   public cay(cgg $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.go() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.y(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.y(this.m());
   }

   @Override
   protected boolean a(dem $$0, jf $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dus $$2 = $$0.a_($$1);
         if ($$2.a(dho.cv)) {
            return dsc.a($$0, $$1) < 1;
         } else {
            return $$2.a(dho.cD) && $$2.c(dkt.b) ? true : $$2.a(awv.S, $$0x -> $$0x.d(dhf.b).map($$0xx -> $$0xx != dvf.a).orElse(true));
         }
      }
   }
}
