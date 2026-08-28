import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dab extends czy {
   private static final dad a = dad.a(cvt.ux);

   public dab(czv $$0) {
      super($$0);
   }

   public boolean a(czw $$0, deg $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cuk) {
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

   public cvp a(czw $$0, jp.a $$1) {
      IntList $$2 = new IntArrayList();
      cvp $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvp $$5 = $$0.a($$4);
         cvk $$6 = $$5.h();
         if ($$6 instanceof cuk) {
            $$2.add(((cuk)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kr.Z, cyi.a, $$2, cyi::a);
         return $$3;
      } else {
         return cvp.k;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dam<?> aq_() {
      return dam.i;
   }
}
