public class caa extends caz {
   private final cfh g;

   public caa(cfh $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.s() && !this.g.gk() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.y(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.y(this.m());
   }

   @Override
   protected boolean a(dcz $$0, jd $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dtc $$2 = $$0.a_($$1);
         if ($$2.a(dga.cv)) {
            return dqo.a($$0, $$1) < 1;
         } else {
            return $$2.a(dga.cD) && $$2.c(djf.b) ? true : $$2.a(awe.S, $$0x -> $$0x.d(dfr.b).map($$0xx -> $$0xx != dtp.a).orElse(true));
         }
      }
   }
}
