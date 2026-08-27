import java.util.Map;

public class cqb extends cqj {
   public cqb(cps $$0) {
      super("", $$0, cqk.a(Map.of('#', cpz.a(cnb.qL), 'x', cpz.a(cnb.rR)), "###", "#x#", "###"), new cmy(cnb.uc));
   }

   @Override
   public boolean a(cir $$0, ctp $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cmy $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            egb $$3 = cnf.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cmy a(cir $$0, iu $$1) {
      cmy $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static cmy a(cir $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cmy $$2 = $$0.a($$1);
         if ($$2.a(cnb.rR)) {
            return $$2;
         }
      }

      return cmy.f;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public cqg<?> ar_() {
      return cqg.f;
   }
}
