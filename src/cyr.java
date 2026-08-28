import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cyr extends cyo {
   private static final cyt a = cyt.a(cut.uv);

   public cyr(cym $$0) {
      super($$0);
   }

   public boolean a(cql $$0, dbz $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof ctk) {
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

   public cuq a(cql $$0, jk.a $$1) {
      IntList $$2 = new IntArrayList();
      cuq $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         cul $$6 = $$5.g();
         if ($$6 instanceof ctk) {
            $$2.add(((ctk)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(km.T, cxj.a, $$2, cxj::a);
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
   public cza<?> ao_() {
      return cza.i;
   }
}
