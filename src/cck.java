public class cck extends cdj {
   private final chs g;

   public cck(chs $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gs() && super.b();
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
   protected boolean a(dhc $$0, ji $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dxq $$2 = $$0.a_($$1);
         if ($$2.a(dkg.cD)) {
            return duz.a($$0, $$1) < 1;
         } else {
            return $$2.a(dkg.cL) && $$2.c(dnn.b) ? true : $$2.a(awp.T, $$0x -> $$0x.d(djx.b).map($$0xx -> $$0xx != dyd.a).orElse(true));
         }
      }
   }
}
