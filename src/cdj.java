public class cdj extends cei {
   private final cir g;

   public cdj(cir $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gq() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.x(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.x(this.m());
   }

   @Override
   protected boolean a(dis $$0, iu $$1) {
      if (!$$0.v($$1.d())) {
         return false;
      } else {
         dzo $$2 = $$0.a_($$1);
         if ($$2.a(dlw.cD)) {
            return dwv.a($$0, $$1) < 1;
         } else {
            return $$2.a(dlw.cL) && $$2.c(dpd.b) ? true : $$2.a(axa.T, $$0x -> $$0x.d(dln.b).map($$0xx -> $$0xx != eab.a).orElse(true));
         }
      }
   }
}
