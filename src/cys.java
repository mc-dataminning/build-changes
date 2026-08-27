import java.util.ArrayList;
import java.util.List;

public class cys extends cyq {
   private static final cyv a = cyv.a(cuk.sl);
   private static final cyv b = cyv.a(cuk.qN);
   private static final cyv c = cyv.a(cuk.wg);

   public cys(cyo $$0) {
      super($$0);
   }

   public boolean a(cpw $$0, dca $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
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

   public cuh a(cpw $$0, jc.a $$1) {
      List<cxj> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cxj $$6 = $$5.a(ke.S);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cuh $$7 = new cuh(cuk.wf, 3);
      $$7.b(ke.T, new cxk($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuh a(jc.a $$0) {
      return new cuh(cuk.wf);
   }

   @Override
   public cze<?> ao_() {
      return cze.h;
   }
}
