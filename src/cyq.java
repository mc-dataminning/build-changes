import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cyq extends cyn {
   private static final cys a = cys.a(cus.uv);

   public cyq(cyl $$0) {
      super($$0);
   }

   public boolean a(cqk $$0, dby $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof ctj) {
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

   public cup a(cqk $$0, jk.a $$1) {
      IntList $$2 = new IntArrayList();
      cup $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         cuk $$6 = $$5.g();
         if ($$6 instanceof ctj) {
            $$2.add(((ctj)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(km.T, cxi.a, $$2, cxi::a);
         return $$3;
      } else {
         return cup.l;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyz<?> ao_() {
      return cyz.i;
   }
}
