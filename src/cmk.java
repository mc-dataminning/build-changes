public class cmk extends cmr {
   public cmk(cma $$0) {
      super(
         "",
         $$0,
         3,
         3,
         hp.a(cmi.a, cmi.a(cjk.qa), cmi.a(cjk.qa), cmi.a(cjk.qa), cmi.a(cjk.qa), cmi.a(cjk.rf), cmi.a(cjk.qa), cmi.a(cjk.qa), cmi.a(cjk.qa), cmi.a(cjk.qa)),
         new cjh(cjk.tp)
      );
   }

   @Override
   public boolean a(cfb $$0, cpx $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cjh $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            eby $$3 = cjo.a($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cjh a(cfb $$0, hu $$1) {
      cjh $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static cjh a(cfb $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cjh $$2 = $$0.a($$1);
         if ($$2.a(cjk.rf)) {
            return $$2;
         }
      }

      return cjh.b;
   }

   @Override
   public boolean am_() {
      return true;
   }

   @Override
   public cmo<?> an_() {
      return cmo.f;
   }
}
