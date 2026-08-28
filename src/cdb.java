public class cdb extends cea {
   private final cij g;

   public cdb(cij $$0, double $$1) {
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
   protected boolean a(dhs $$0, jj $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dym $$2 = $$0.a_($$1);
         if ($$2.a(dkw.cD)) {
            return dvt.a($$0, $$1) < 1;
         } else {
            return $$2.a(dkw.cL) && $$2.c(dod.b) ? true : $$2.a(awz.T, $$0x -> $$0x.d(dkn.b).map($$0xx -> $$0xx != dyz.a).orElse(true));
         }
      }
   }
}
