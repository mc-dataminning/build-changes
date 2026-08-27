public class coe extends com {
   public coe(cnu $$0) {
      super(
         "",
         $$0,
         3,
         3,
         il.a(coc.a, coc.a(cle.qa), coc.a(cle.qa), coc.a(cle.qa), coc.a(cle.qa), coc.a(cle.rg), coc.a(cle.qa), coc.a(cle.qa), coc.a(cle.qa), coc.a(cle.qa)),
         new clb(cle.tq)
      );
   }

   @Override
   public boolean a(cgu $$0, crs $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         clb $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            edq $$3 = cli.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public clb a(cgu $$0, ip $$1) {
      clb $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static clb a(cgu $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         clb $$2 = $$0.a($$1);
         if ($$2.a(cle.rg)) {
            return $$2;
         }
      }

      return clb.b;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public coj<?> aq_() {
      return coj.f;
   }
}
