public class cma extends cmg {
   public cma(aer $$0, clr $$1) {
      super(
         $$0,
         "",
         $$1,
         3,
         3,
         hn.a(cly.a, cly.a(cjb.qa), cly.a(cjb.qa), cly.a(cjb.qa), cly.a(cjb.qa), cly.a(cjb.rf), cly.a(cjb.qa), cly.a(cjb.qa), cly.a(cjb.qa), cly.a(cjb.qa)),
         new ciy(cjb.tp)
      );
   }

   @Override
   public boolean a(ces $$0, cpm $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         ciy $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            ebn $$3 = cjf.a($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public ciy a(ces $$0, hs $$1) {
      ciy $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static ciy a(ces $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         ciy $$2 = $$0.a($$1);
         if ($$2.a(cjb.rf)) {
            return $$2;
         }
      }

      return ciy.b;
   }

   @Override
   public boolean ai_() {
      return true;
   }

   @Override
   public cmd<?> aj_() {
      return cmd.f;
   }
}
