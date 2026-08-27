public class cmo extends cmv {
   public cmo(cme $$0) {
      super(
         "",
         $$0,
         3,
         3,
         hn.a(cmm.a, cmm.a(cjo.qa), cmm.a(cjo.qa), cmm.a(cjo.qa), cmm.a(cjo.qa), cmm.a(cjo.rf), cmm.a(cjo.qa), cmm.a(cjo.qa), cmm.a(cjo.qa), cmm.a(cjo.qa)),
         new cjl(cjo.tp)
      );
   }

   @Override
   public boolean a(cff $$0, cqb $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cjl $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            ebq $$3 = cjs.a($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cjl a(cff $$0, hr $$1) {
      cjl $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static cjl a(cff $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cjl $$2 = $$0.a($$1);
         if ($$2.a(cjo.rf)) {
            return $$2;
         }
      }

      return cjl.b;
   }

   @Override
   public boolean am_() {
      return true;
   }

   @Override
   public cms<?> an_() {
      return cms.f;
   }
}
