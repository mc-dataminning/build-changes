public class bza extends bzz {
   private final ceh g;

   public bza(ceh $$0, double $$1) {
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
   protected boolean a(dba $$0, io $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         drb $$2 = $$0.a_($$1);
         if ($$2.a(dea.cv)) {
            return don.a($$0, $$1) < 1;
         } else {
            return $$2.a(dea.cD) && $$2.c(dhf.b) ? true : $$2.a(avw.R, $$0x -> $$0x.d(ddr.b).map($$0xx -> $$0xx != dro.a).orElse(true));
         }
      }
   }
}
