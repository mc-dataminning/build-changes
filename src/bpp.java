public class bpp extends bqo {
   private final buu g;

   public bpp(buu $$0, double $$1) {
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
   protected boolean a(cpy $$0, gw $$1) {
      if (!$$0.t($$1.c())) {
         return false;
      } else {
         dfj $$2 = $$0.a_($$1);
         if ($$2.a(csw.cv)) {
            return ddc.a($$0, $$1) < 1;
         } else {
            return $$2.a(csw.cD) && $$2.c(cvy.b) ? true : $$2.a(apt.R, $$0x -> $$0x.d(cso.a).map($$0xx -> $$0xx != dfw.a).orElse(true));
         }
      }
   }
}
