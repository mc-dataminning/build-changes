import java.util.Map;

public class cpu extends cqc {
   public cpu(cpl $$0) {
      super("", $$0, cqd.a(Map.of('#', cps.a(cmu.qL), 'x', cps.a(cmu.rR)), "###", "#x#", "###"), new cmr(cmu.uc));
   }

   @Override
   public boolean a(cik $$0, cti $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cmr $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            efu $$3 = cmy.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cmr a(cik $$0, iu $$1) {
      cmr $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static cmr a(cik $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cmr $$2 = $$0.a($$1);
         if ($$2.a(cmu.rR)) {
            return $$2;
         }
      }

      return cmr.f;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public cpz<?> ar_() {
      return cpz.f;
   }
}
