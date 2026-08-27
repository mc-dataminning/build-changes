public class cos extends cpa {
   public cos(coh $$0) {
      super(
         "",
         $$0,
         3,
         3,
         ip.a(coq.a, coq.a(clr.qL), coq.a(clr.qL), coq.a(clr.qL), coq.a(clr.qL), coq.a(clr.rR), coq.a(clr.qL), coq.a(clr.qL), coq.a(clr.qL), coq.a(clr.qL)),
         new clo(clr.ub)
      );
   }

   @Override
   public boolean a(chh $$0, csf $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         clo $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            eeh $$3 = clv.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public clo a(chh $$0, it $$1) {
      clo $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static clo a(chh $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         clo $$2 = $$0.a($$1);
         if ($$2.a(clr.rR)) {
            return $$2;
         }
      }

      return clo.b;
   }

   @Override
   public boolean ar_() {
      return true;
   }

   @Override
   public cox<?> as_() {
      return cox.f;
   }
}
