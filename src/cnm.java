public class cnm extends cnt {
   public cnm(cnc $$0) {
      super(
         "",
         $$0,
         3,
         3,
         il.a(cnk.a, cnk.a(ckm.qa), cnk.a(ckm.qa), cnk.a(ckm.qa), cnk.a(ckm.qa), cnk.a(ckm.rf), cnk.a(ckm.qa), cnk.a(ckm.qa), cnk.a(ckm.qa), cnk.a(ckm.qa)),
         new ckj(ckm.tp)
      );
   }

   @Override
   public boolean a(cgd $$0, cqz $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         ckj $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            eco $$3 = ckq.a($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public ckj a(cgd $$0, ip $$1) {
      ckj $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static ckj a(cgd $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         ckj $$2 = $$0.a($$1);
         if ($$2.a(ckm.rf)) {
            return $$2;
         }
      }

      return ckj.b;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public cnq<?> aq_() {
      return cnq.f;
   }
}
