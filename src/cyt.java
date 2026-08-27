import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cyt extends cyq {
   private static final cyv a = cyv.a(cuk.wg);

   public cyt(cyo $$0) {
      super($$0);
   }

   public boolean a(cpw $$0, dca $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof csz) {
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

   public cuh a(cpw $$0, jc.a $$1) {
      IntList $$2 = new IntArrayList();
      cuh $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         cuc $$6 = $$5.f();
         if ($$6 instanceof csz) {
            $$2.add(((csz)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(ke.S, cxj.a, $$2, cxj::a);
         return $$3;
      } else {
         return cuh.i;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cze<?> ao_() {
      return cze.j;
   }
}
