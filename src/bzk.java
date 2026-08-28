public class bzk extends caj {
   private final cer g;

   public bzk(cer $$0, double $$1) {
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
   protected boolean a(dcg $$0, ja $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dsh $$2 = $$0.a_($$1);
         if ($$2.a(dfh.cv)) {
            return dpu.a($$0, $$1) < 1;
         } else {
            return $$2.a(dfh.cD) && $$2.c(dim.b) ? true : $$2.a(avu.R, $$0x -> $$0x.d(dey.b).map($$0xx -> $$0xx != dsu.a).orElse(true));
         }
      }
   }
}
