public class bxp extends byo {
   private final ccw g;

   public bxp(ccw $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.r() && !this.g.gp() && super.a();
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
   protected boolean a(czx $$0, im $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dpy $$2 = $$0.a_($$1);
         if ($$2.a(dcx.cv)) {
            return dnk.a($$0, $$1) < 1;
         } else {
            return $$2.a(dcx.cD) && $$2.c(dgc.b) ? true : $$2.a(avo.R, $$0x -> $$0x.d(dco.b).map($$0xx -> $$0xx != dql.a).orElse(true));
         }
      }
   }
}
