public class com extends cov {
   public com(coc $$0) {
      super(
         "",
         $$0,
         3,
         3,
         il.a(cok.a, cok.a(clm.qL), cok.a(clm.qL), cok.a(clm.qL), cok.a(clm.qL), cok.a(clm.rR), cok.a(clm.qL), cok.a(clm.qL), cok.a(clm.qL), cok.a(clm.qL)),
         new clj(clm.ub)
      );
   }

   @Override
   public boolean a(chc $$0, csa $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         clj $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            eec $$3 = clq.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public clj a(chc $$0, ip $$1) {
      clj $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static clj a(chc $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         clj $$2 = $$0.a($$1);
         if ($$2.a(clm.rR)) {
            return $$2;
         }
      }

      return clj.b;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public cos<?> aq_() {
      return cos.f;
   }
}
