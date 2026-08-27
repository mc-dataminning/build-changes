public class bpr extends bqq {
   private final buw g;

   public bpr(buw $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.s() && !this.g.gd() && super.a();
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
   protected boolean a(cqa $$0, gw $$1) {
      if (!$$0.t($$1.c())) {
         return false;
      } else {
         dfl $$2 = $$0.a_($$1);
         if ($$2.a(csy.cv)) {
            return dde.a($$0, $$1) < 1;
         } else {
            return $$2.a(csy.cD) && $$2.c(cwa.b) ? true : $$2.a(apu.R, $$0x -> $$0x.d(csq.a).map($$0xx -> $$0xx != dfy.a).orElse(true));
         }
      }
   }
}
