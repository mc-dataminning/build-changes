public class bsp extends bto {
   private final bxv g;

   public bsp(bxv $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.u() && !this.g.ge() && super.a();
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
   protected boolean a(ctl $$0, hx $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dja $$2 = $$0.a_($$1);
         if ($$2.a(cwl.cv)) {
            return dgv.a($$0, $$1) < 1;
         } else {
            return $$2.a(cwl.cD) && $$2.c(czq.b) ? true : $$2.a(asb.R, $$0x -> $$0x.d(cwc.b).map($$0xx -> $$0xx != djn.a).orElse(true));
         }
      }
   }
}
