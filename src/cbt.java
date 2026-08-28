public class cbt extends ccs {
   private final chb g;

   public cbt(chb $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.n() && !this.g.gm() && super.b();
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
   protected boolean a(dfp $$0, jh $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dvv $$2 = $$0.a_($$1);
         if ($$2.a(dis.cv)) {
            return dtf.a($$0, $$1) < 1;
         } else {
            return $$2.a(dis.cD) && $$2.c(dlw.b) ? true : $$2.a(axc.S, $$0x -> $$0x.d(dij.b).map($$0xx -> $$0xx != dwi.a).orElse(true));
         }
      }
   }
}
