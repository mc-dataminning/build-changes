public class cmd extends cmk {
   public cmd(clt $$0) {
      super(
         "",
         $$0,
         3,
         3,
         hp.a(cmb.a, cmb.a(cjd.qa), cmb.a(cjd.qa), cmb.a(cjd.qa), cmb.a(cjd.qa), cmb.a(cjd.rf), cmb.a(cjd.qa), cmb.a(cjd.qa), cmb.a(cjd.qa), cmb.a(cjd.qa)),
         new cja(cjd.tp)
      );
   }

   @Override
   public boolean a(ceu $$0, cpq $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cja $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            ebr $$3 = cjh.a($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cja a(ceu $$0, hu $$1) {
      cja $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static cja a(ceu $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cja $$2 = $$0.a($$1);
         if ($$2.a(cjd.rf)) {
            return $$2;
         }
      }

      return cja.b;
   }

   @Override
   public boolean ah_() {
      return true;
   }

   @Override
   public cmh<?> ai_() {
      return cmh.f;
   }
}
