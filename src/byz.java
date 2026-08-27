public class byz extends bzy {
   private final ceh g;

   public byz(ceh $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.r() && !this.g.gy() && super.a();
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
   protected boolean a(dcd $$0, ir $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dtc $$2 = $$0.a_($$1);
         if ($$2.a(dfe.dg)) {
            return dqj.a($$0, $$1) < 1;
         } else {
            return $$2.a(dfe.dp) && $$2.c(din.b) ? true : $$2.a(awe.R, $$0x -> $$0x.d(deu.b).map($$0xx -> $$0xx != dtp.a).orElse(true));
         }
      }
   }
}
