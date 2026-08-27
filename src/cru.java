public class cru extends csq implements css {
   protected static final float a = 4.0F;
   protected static final eib b = csq.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   public cru(dfd.d $$0) {
      super($$0);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      ehi $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return $$1.a_($$2.d()).a(apo.at);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         return csr.a.n();
      } else {
         if ($$1 == hc.b && $$2.a(csr.mZ)) {
            $$3.a($$4, csr.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return new cja(cjd.dv);
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dfe $$0, cbp $$1, cow $$2, gw $$3) {
      return $$1.eR().d() instanceof ckl ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cpq $$0, gw $$1) {
      $$0.a($$1.c(), csr.mZ.n().a(crv.h, dfq.b), 3);
   }
}
