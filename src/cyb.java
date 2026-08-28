import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cyb extends cxy {
   private static final cyd a = cyd.a(cud.uv);

   public cyb(cxv $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, dcd $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csu) {
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

   public cua a(cxw $$0, jl.a $$1) {
      IntList $$2 = new IntArrayList();
      cua $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
         ctv $$6 = $$5.g();
         if ($$6 instanceof csu) {
            $$2.add(((csu)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kn.T, cws.a, $$2, cws::a);
         return $$3;
      } else {
         return cua.l;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyl<?> ap_() {
      return cyl.i;
   }
}
