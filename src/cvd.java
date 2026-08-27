import java.util.ArrayList;
import java.util.List;

public class cvd extends cvb {
   private static final cvg a = cvg.a(crm.qN);
   private static final cvg b = cvg.a(crm.pt);
   private static final cvg c = cvg.a(crm.ut);

   public cvd(cuz $$0) {
      super($$0);
   }

   public boolean a(cnf $$0, cyx $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
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

   public crj a(cnf $$0, iz $$1) {
      List<ctx> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               ctx $$6 = $$5.a(jp.J);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      crj $$7 = new crj(crm.us, 3);
      $$7.b(jp.K, new cty($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public crj a(iz $$0) {
      return new crj(crm.us);
   }

   @Override
   public cvn<?> ap_() {
      return cvn.g;
   }
}
