import java.util.Map;

public class cyp extends cyx {
   public cyp(cyg $$0) {
      super("", $$0, cyy.a(Map.of('#', cyn.a(cun.qO), 'x', cyn.a(cun.rU)), "###", "#x#", "###"), new cuk(cun.uj));
   }

   @Override
   public boolean a(cqf $$0, dbt $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cuk $$2 = a($$0);
         if ($$2.e()) {
            return false;
         } else {
            epf $$3 = cus.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cuk a(cqf $$0, jk.a $$1) {
      cuk $$2 = a($$0).c(1);
      $$2.b(km.C, cxl.b);
      return $$2;
   }

   private static cuk a(cqf $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cuk $$2 = $$0.a($$1);
         if ($$2.a(cun.rU)) {
            return $$2;
         }
      }

      return cuk.l;
   }

   @Override
   public boolean ao_() {
      return true;
   }

   @Override
   public cyu<?> ap_() {
      return cyu.f;
   }
}
