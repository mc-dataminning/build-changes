import java.util.Map;

public class dar extends dbb {
   public dar(dah $$0) {
      super("", $$0, dbc.a(Map.of('#', dap.a(cwj.qP), 'x', dap.a(cwj.sl)), "###", "#x#", "###"), new cwf(cwj.uB));
   }

   @Override
   public boolean a(dai $$0, dff $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cwf $$2 = a($$0);
         if ($$2.f()) {
            return false;
         } else {
            eti $$3 = cws.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cwf a(dai $$0, js.a $$1) {
      cwf $$2 = a($$0).c(1);
      $$2.b(ku.N, czc.b);
      return $$2;
   }

   private static cwf a(dai $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cwf $$2 = $$0.a($$1);
         if ($$2.b(ku.L)) {
            return $$2;
         }
      }

      return cwf.k;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public day<?> aq_() {
      return day.f;
   }
}
