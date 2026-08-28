import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cys extends cyp {
   private static final cyu a = cyu.a(cuu.uv);

   public cys(cyn $$0) {
      super($$0);
   }

   public boolean a(cqm $$0, dca $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof ctl) {
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

   public cur a(cqm $$0, jk.a $$1) {
      IntList $$2 = new IntArrayList();
      cur $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         cum $$6 = $$5.g();
         if ($$6 instanceof ctl) {
            $$2.add(((ctl)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(km.T, cxk.a, $$2, cxk::a);
         return $$3;
      } else {
         return cur.l;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public czb<?> ao_() {
      return czb.i;
   }
}
