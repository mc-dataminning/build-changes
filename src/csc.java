import com.google.common.collect.Lists;
import java.util.List;

public class csc extends csk {
   public csc(csi $$0) {
      super($$0);
   }

   public boolean a(clk $$0, cwe $$1) {
      cpq $$2 = cpq.h;
      List<cpq> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpq $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(aum.ba)) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof coh)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cpq a(clk $$0, iy $$1) {
      List<coh> $$2 = Lists.newArrayList();
      cpq $$3 = cpq.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpq $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(aum.ba)) {
               if (!$$3.b()) {
                  return cpq.h;
               }

               $$3 = $$5.q();
            } else {
               if (!($$5.d() instanceof coh $$6)) {
                  return cpq.h;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? coi.a($$3, $$2) : cpq.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csw<?> as_() {
      return csw.c;
   }
}
