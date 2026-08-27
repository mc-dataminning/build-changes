public class cmi extends cmp {
   public cmi(cly $$0) {
      super(
         "",
         $$0,
         3,
         3,
         hp.a(cmg.a, cmg.a(cji.qa), cmg.a(cji.qa), cmg.a(cji.qa), cmg.a(cji.qa), cmg.a(cji.rf), cmg.a(cji.qa), cmg.a(cji.qa), cmg.a(cji.qa), cmg.a(cji.qa)),
         new cjf(cji.tp)
      );
   }

   @Override
   public boolean a(cez $$0, cpv $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cjf $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            ebw $$3 = cjm.a($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cjf a(cez $$0, hu $$1) {
      cjf $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static cjf a(cez $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cjf $$2 = $$0.a($$1);
         if ($$2.a(cji.rf)) {
            return $$2;
         }
      }

      return cjf.b;
   }

   @Override
   public boolean am_() {
      return true;
   }

   @Override
   public cmm<?> an_() {
      return cmm.f;
   }
}
