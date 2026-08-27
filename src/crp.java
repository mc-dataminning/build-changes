public class crp extends csl implements csn {
   protected static final float a = 4.0F;
   protected static final ehw b = csl.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   public crp(dey.d $$0) {
      super($$0);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      ehd $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return $$1.a_($$2.d()).a(apl.at);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if (!$$0.a($$3, $$4)) {
         return csm.a.n();
      } else {
         if ($$1 == ha.b && $$2.a(csm.mZ)) {
            $$3.a($$4, csm.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return new cix(cja.dv);
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dez $$0, cbm $$1, cor $$2, gu $$3) {
      return $$1.eR().d() instanceof cki ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cpl $$0, gu $$1) {
      $$0.a($$1.c(), csm.mZ.n().a(crq.h, dfl.b), 3);
   }
}
