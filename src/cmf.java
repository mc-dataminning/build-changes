public class cmf extends cmm {
   private static final int a = 40;

   public cmf(cmm.a $$0) {
      super($$0);
   }

   @Override
   public cmr a(cmr $$0, cti $$1, bmf $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof ana $$3) {
         am.A.a($$3, $$0);
         $$3.b(arw.c.b(this));
      }

      if (!$$1.B) {
         $$2.d(ble.s);
      }

      if ($$0.b()) {
         return new cmr(cmu.si);
      } else {
         if ($$2 instanceof cfb $$4 && !$$4.fT().d) {
            cmr $$5 = new cmr(cmu.si);
            if (!$$4.fS().e($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(cmr $$0) {
      return 40;
   }

   @Override
   public cok c(cmr $$0) {
      return cok.c;
   }

   @Override
   public arl an_() {
      return arm.lP;
   }

   @Override
   public arl ao_() {
      return arm.lP;
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      return cmt.a($$0, $$1, $$2);
   }
}
