public class bup extends bvo {
   private final bzw g;

   public bup(bzw $$0, double $$1) {
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
   protected boolean a(cvq $$0, hz $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dlf $$2 = $$0.a_($$1);
         if ($$2.a(cyq.cv)) {
            return dja.a($$0, $$1) < 1;
         } else {
            return $$2.a(cyq.cD) && $$2.c(dbv.b) ? true : $$2.a(atz.R, $$0x -> $$0x.d(cyh.b).map($$0xx -> $$0xx != dls.a).orElse(true));
         }
      }
   }
}
