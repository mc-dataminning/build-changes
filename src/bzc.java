public class bzc extends cab {
   private final cej g;

   public bzc(cej $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.s() && !this.g.gp() && super.a();
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
   protected boolean a(dbc $$0, io $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         drd $$2 = $$0.a_($$1);
         if ($$2.a(dec.cv)) {
            return dop.a($$0, $$1) < 1;
         } else {
            return $$2.a(dec.cD) && $$2.c(dhh.b) ? true : $$2.a(avx.R, $$0x -> $$0x.d(ddt.b).map($$0xx -> $$0xx != drq.a).orElse(true));
         }
      }
   }
}
