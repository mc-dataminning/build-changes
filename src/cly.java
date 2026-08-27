public class cly extends cme {
   public cly(aep $$0, clp $$1) {
      super(
         $$0,
         "",
         $$1,
         3,
         3,
         ho.a(clw.a, clw.a(ciz.qa), clw.a(ciz.qa), clw.a(ciz.qa), clw.a(ciz.qa), clw.a(ciz.rf), clw.a(ciz.qa), clw.a(ciz.qa), clw.a(ciz.qa), clw.a(ciz.qa)),
         new ciw(ciz.tp)
      );
   }

   @Override
   public boolean a(ceq $$0, cpk $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         ciw $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            ebl $$3 = cjd.a($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public ciw a(ceq $$0, ht $$1) {
      ciw $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static ciw a(ceq $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         ciw $$2 = $$0.a($$1);
         if ($$2.a(ciz.rf)) {
            return $$2;
         }
      }

      return ciw.b;
   }

   @Override
   public boolean ai_() {
      return true;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.f;
   }
}
