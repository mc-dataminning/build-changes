public class but extends bvs {
   private final caa g;

   public but(caa $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.u() && !this.g.gg() && super.a();
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
   protected boolean a(cvu $$0, hz $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dlj $$2 = $$0.a_($$1);
         if ($$2.a(cyu.cv)) {
            return dje.a($$0, $$1) < 1;
         } else {
            return $$2.a(cyu.cD) && $$2.c(dbz.b) ? true : $$2.a(aua.R, $$0x -> $$0x.d(cyl.b).map($$0xx -> $$0xx != dlw.a).orElse(true));
         }
      }
   }
}
