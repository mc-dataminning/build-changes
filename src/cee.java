public class cee extends cfd {
   private final cjn g;

   public cee(cjn $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gu() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.x(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.x(this.m());
   }

   @Override
   protected boolean a(dka $$0, iv $$1) {
      if (!$$0.v($$1.d())) {
         return false;
      } else {
         ebe $$2 = $$0.a_($$1);
         if ($$2.a(dne.cG)) {
            return dyk.a($$0, $$1) < 1;
         } else {
            return $$2.a(dne.cO) && $$2.c(dqn.b) ? true : $$2.a(axe.T, $$0x -> $$0x.d(dmv.b).map($$0xx -> $$0xx != ebr.a).orElse(true));
         }
      }
   }
}
