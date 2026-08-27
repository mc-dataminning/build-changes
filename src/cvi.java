import java.util.Map;

public class cvi extends cvq {
   public cvi(cuz $$0) {
      super("", $$0, cvr.a(Map.of('#', cvg.a(crm.qN), 'x', cvg.a(crm.rT)), "###", "#x#", "###"), new crj(crm.uh));
   }

   @Override
   public boolean a(cnf $$0, cyx $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         crj $$2 = a($$0);
         if ($$2.d()) {
            return false;
         } else {
            emf $$3 = crq.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public crj a(cnf $$0, iz $$1) {
      crj $$2 = a($$0).c(1);
      $$2.b(jp.u, cuf.b);
      return $$2;
   }

   private static crj a(cnf $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         crj $$2 = $$0.a($$1);
         if ($$2.a(crm.rT)) {
            return $$2;
         }
      }

      return crj.i;
   }

   @Override
   public boolean ao_() {
      return true;
   }

   @Override
   public cvn<?> ap_() {
      return cvn.f;
   }
}
