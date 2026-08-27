public class bru extends bst {
   private final bwz g;

   public bru(bwz $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.u() && !this.g.gf() && super.a();
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
   protected boolean a(csi $$0, hx $$1) {
      if (!$$0.t($$1.c())) {
         return false;
      } else {
         dhn $$2 = $$0.a_($$1);
         if ($$2.a(cvh.cv)) {
            return dfp.a($$0, $$1) < 1;
         } else {
            return $$2.a(cvh.cD) && $$2.c(cym.b) ? true : $$2.a(ark.R, $$0x -> $$0x.d(cuy.b).map($$0xx -> $$0xx != dia.a).orElse(true));
         }
      }
   }
}
