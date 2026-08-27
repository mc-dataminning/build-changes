public class crh extends crn {
   private static final int a = 40;

   public crh(crn.a $$0) {
      super($$0);
   }

   @Override
   public crs a(crs $$0, czg $$1, bqt $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof apv $$3) {
         am.A.a($$3, $$0);
         $$3.b(auz.c.b(this));
      }

      if (!$$1.B) {
         $$2.e(bpo.s);
      }

      if ($$0.d()) {
         return new crs(crv.sk);
      } else {
         if ($$2 instanceof cka $$4 && !$$4.fM()) {
            crs $$5 = new crs(crv.sk);
            if (!$$4.fZ().e($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(crs $$0) {
      return 40;
   }

   @Override
   public ctk c(crs $$0) {
      return ctk.c;
   }

   @Override
   public aun ak_() {
      return auo.mo;
   }

   @Override
   public aun al_() {
      return auo.mo;
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      return cru.a($$0, $$1, $$2);
   }
}
