public class clz extends cmf {
   public clz(aer $$0, clq $$1) {
      super(
         $$0,
         "",
         $$1,
         3,
         3,
         hn.a(clx.a, clx.a(cja.qa), clx.a(cja.qa), clx.a(cja.qa), clx.a(cja.qa), clx.a(cja.rf), clx.a(cja.qa), clx.a(cja.qa), clx.a(cja.qa), clx.a(cja.qa)),
         new cix(cja.tp)
      );
   }

   @Override
   public boolean a(cer $$0, cpl $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cix $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            ebm $$3 = cje.a($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cix a(cer $$0, hs $$1) {
      cix $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static cix a(cer $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cix $$2 = $$0.a($$1);
         if ($$2.a(cja.rf)) {
            return $$2;
         }
      }

      return cix.b;
   }

   @Override
   public boolean ah_() {
      return true;
   }

   @Override
   public cmc<?> ai_() {
      return cmc.f;
   }
}
