import java.util.Map;

public class daf extends dap {
   public daf(czv $$0) {
      super("", $$0, daq.a(Map.of('#', dad.a(cvt.qP), 'x', dad.a(cvt.rV)), "###", "#x#", "###"), new cvp(cvt.ul));
   }

   @Override
   public boolean a(czw $$0, deg $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cvp $$2 = a($$0);
         if ($$2.f()) {
            return false;
         } else {
            esj $$3 = cwc.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cvp a(czw $$0, jp.a $$1) {
      cvp $$2 = a($$0).c(1);
      $$2.b(kr.I, cyq.b);
      return $$2;
   }

   private static cvp a(czw $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cvp $$2 = $$0.a($$1);
         if ($$2.a(cvt.rV)) {
            return $$2;
         }
      }

      return cvp.k;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public dam<?> aq_() {
      return dam.f;
   }
}
