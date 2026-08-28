import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cyu extends cyr {
   private static final cyw a = cyw.a(cut.uv);

   public cyu(cyo $$0) {
      super($$0);
   }

   public boolean a(cyp $$0, dcw $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuq $$5 = $$0.a($$4);
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

   public cuq a(cyp $$0, jo.a $$1) {
      IntList $$2 = new IntArrayList();
      cuq $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuq $$5 = $$0.a($$4);
         cul $$6 = $$5.g();
         if ($$6 instanceof ctj) {
            $$2.add(((ctj)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kq.U, cxl.a, $$2, cxl::a);
         return $$3;
      } else {
         return cuq.l;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cze<?> at_() {
      return cze.i;
   }
}
