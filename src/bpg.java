public class bpg extends bqf {
   private final bul g;

   public bpg(bul $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.p() && !this.g.fZ() && super.a();
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
   protected boolean a(cpn $$0, gv $$1) {
      if (!$$0.t($$1.c())) {
         return false;
      } else {
         dey $$2 = $$0.a_($$1);
         if ($$2.a(csl.cv)) {
            return dcr.a($$0, $$1) < 1;
         } else {
            return $$2.a(csl.cD) && $$2.c(cvn.b) ? true : $$2.a(apj.R, $$0x -> $$0x.d(csd.a).map($$0xx -> $$0xx != dfl.a).orElse(true));
         }
      }
   }
}
