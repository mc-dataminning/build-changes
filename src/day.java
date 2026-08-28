import java.util.Map;

public class day extends dbi {
   public day(dao $$0) {
      super("", $$0, dbj.a(Map.of('#', daw.a(cwq.qP), 'x', daw.a(cwq.sl)), "###", "#x#", "###"), new cwm(cwq.uB));
   }

   @Override
   public boolean a(dap $$0, dfm $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cwm $$2 = a($$0);
         if ($$2.f()) {
            return false;
         } else {
            etp $$3 = cwz.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cwm a(dap $$0, js.a $$1) {
      cwm $$2 = a($$0).c(1);
      $$2.b(ku.N, czj.b);
      return $$2;
   }

   private static cwm a(dap $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cwm $$2 = $$0.a($$1);
         if ($$2.b(ku.L)) {
            return $$2;
         }
      }

      return cwm.k;
   }

   @Override
   public boolean ao_() {
      return true;
   }

   @Override
   public dbf<?> ap_() {
      return dbf.f;
   }
}
