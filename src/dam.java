import java.util.ArrayList;
import java.util.List;

public class dam extends dak {
   private static final dap a = dap.a(cwj.qP);
   private static final dap b = dap.a(cwj.pv);
   private static final dap c = dap.a(cwj.uN);

   public dam(dah $$0) {
      super($$0);
   }

   public boolean a(dai $$0, dff $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwf $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (a.a($$5)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else if (b.a($$5)) {
               if (++$$3 > 3) {
                  return false;
               }
            } else if (!c.a($$5)) {
               return false;
            }
         }
      }

      return $$2 && $$3 >= 1;
   }

   public cwf a(dai $$0, js.a $$1) {
      List<cyu> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwf $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cyu $$6 = $$5.a(ku.ae);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cwf $$7 = new cwf(cwj.uM, 3);
      $$7.b(ku.af, new cyv($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cwf a(js.a $$0) {
      return new cwf(cwj.uM);
   }

   @Override
   public day<?> aq_() {
      return day.g;
   }
}
