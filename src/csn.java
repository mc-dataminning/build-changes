import com.google.common.collect.Lists;
import java.util.List;

public class csn extends csk {
   private static final csp a = csp.a(cpt.ur);

   public csn(csi $$0) {
      super($$0);
   }

   public boolean a(clk $$0, cwe $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpq $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof coh) {
               $$2 = true;
            } else {
               if (!a.a($$5)) {
                  return false;
               }

               if ($$3) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$3 && $$2;
   }

   public cpq a(clk $$0, iy $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      cpq $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpq $$5 = $$0.a($$4);
         cpl $$6 = $$5.d();
         if ($$6 instanceof coh) {
            $$2.add(((coh)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.b("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return cpq.h;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csw<?> as_() {
      return csw.i;
   }
}
