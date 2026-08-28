import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cye extends cyb {
   private static final cyg a = cyg.a(cug.uv);

   public cye(cxy $$0) {
      super($$0);
   }

   public boolean a(cxz $$0, dcg $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csx) {
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

   public cud a(cxz $$0, jl.a $$1) {
      IntList $$2 = new IntArrayList();
      cud $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
         cty $$6 = $$5.g();
         if ($$6 instanceof csx) {
            $$2.add(((csx)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kn.T, cwv.a, $$2, cwv::a);
         return $$3;
      } else {
         return cud.l;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyo<?> ap_() {
      return cyo.i;
   }
}
