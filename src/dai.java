import java.util.Map;

public class dai extends das {
   public dai(czy $$0) {
      super("", $$0, dat.a(Map.of('#', dag.a(cvw.qP), 'x', dag.a(cvw.rV)), "###", "#x#", "###"), new cvs(cvw.ul));
   }

   @Override
   public boolean a(czz $$0, dej $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cvs $$2 = a($$0);
         if ($$2.f()) {
            return false;
         } else {
            esn $$3 = cwf.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cvs a(czz $$0, jq.a $$1) {
      cvs $$2 = a($$0).c(1);
      $$2.b(ks.I, cyt.b);
      return $$2;
   }

   private static cvs a(czz $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cvs $$2 = $$0.a($$1);
         if ($$2.a(cvw.rV)) {
            return $$2;
         }
      }

      return cvs.k;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public dap<?> ar_() {
      return dap.f;
   }
}
