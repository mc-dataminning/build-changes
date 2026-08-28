import java.util.Map;

public class dan extends dax {
   public dan(dad $$0) {
      super("", $$0, day.a(Map.of('#', dal.a(cwf.qP), 'x', dal.a(cwf.rV)), "###", "#x#", "###"), new cwb(cwf.ul));
   }

   @Override
   public boolean a(dae $$0, dfb $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cwb $$2 = a($$0);
         if ($$2.f()) {
            return false;
         } else {
            ete $$3 = cwo.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cwb a(dae $$0, js.a $$1) {
      cwb $$2 = a($$0).c(1);
      $$2.b(ku.N, cyy.b);
      return $$2;
   }

   private static cwb a(dae $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cwb $$2 = $$0.a($$1);
         if ($$2.b(ku.L)) {
            return $$2;
         }
      }

      return cwb.k;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public dau<?> aq_() {
      return dau.f;
   }
}
