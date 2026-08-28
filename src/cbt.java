public class cbt extends ccs {
   private final chb g;

   public cbt(chb $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.p() && !this.g.gs() && super.b();
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
   protected boolean a(dgl $$0, ji $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dwx $$2 = $$0.a_($$1);
         if ($$2.a(djo.cD)) {
            return dug.a($$0, $$1) < 1;
         } else {
            return $$2.a(djo.cL) && $$2.c(dmu.b) ? true : $$2.a(awp.T, $$0x -> $$0x.d(djf.b).map($$0xx -> $$0xx != dxk.a).orElse(true));
         }
      }
   }
}
