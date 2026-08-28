import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cyd extends cya {
   private static final cyf a = cyf.a(cuf.uv);

   public cyd(cxx $$0) {
      super($$0);
   }

   public boolean a(cxy $$0, dcf $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csw) {
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

   public cuc a(cxy $$0, jl.a $$1) {
      IntList $$2 = new IntArrayList();
      cuc $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
         ctx $$6 = $$5.g();
         if ($$6 instanceof csw) {
            $$2.add(((csw)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kn.T, cwu.a, $$2, cwu::a);
         return $$3;
      } else {
         return cuc.l;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyn<?> ap_() {
      return cyn.i;
   }
}
