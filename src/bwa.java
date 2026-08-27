public class bwa extends bwz {
   private final cbh g;

   public bwa(cbh $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.r() && !this.g.gn() && super.a();
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
   protected boolean a(cxe $$0, ib $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dnb $$2 = $$0.a_($$1);
         if ($$2.a(dae.cv)) {
            return dkp.a($$0, $$1) < 1;
         } else {
            return $$2.a(dae.cD) && $$2.c(ddj.b) ? true : $$2.a(aun.R, $$0x -> $$0x.d(czv.b).map($$0xx -> $$0xx != dno.a).orElse(true));
         }
      }
   }
}
