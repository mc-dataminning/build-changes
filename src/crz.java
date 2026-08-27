public class crz extends csv implements csx {
   protected static final float a = 4.0F;
   protected static final eig b = csv.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   public crz(dfi.d $$0) {
      super($$0);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      ehn $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return $$1.a_($$2.d()).a(aps.at);
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         return csw.a.n();
      } else {
         if ($$1 == ha.b && $$2.a(csw.mZ)) {
            $$3.a($$4, csw.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return new cjf(cji.dv);
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akq $$0, asc $$1, gw $$2, dfj $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dfj $$0, cbu $$1, cpb $$2, gw $$3) {
      return $$1.eS().d() instanceof ckq ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cpv $$0, gw $$1) {
      $$0.a($$1.c(), csw.mZ.n().a(csa.h, dfv.b), 3);
   }
}
