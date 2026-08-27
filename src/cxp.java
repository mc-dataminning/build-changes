import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cxp extends cxm {
   private static final cxr a = cxr.a(ctr.uv);

   public cxp(cxk $$0) {
      super($$0);
   }

   public boolean a(cpj $$0, dax $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csi) {
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

   public cto a(cpj $$0, iz.a $$1) {
      IntList $$2 = new IntArrayList();
      cto $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         ctj $$6 = $$5.g();
         if ($$6 instanceof csi) {
            $$2.add(((csi)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kb.S, cwh.a, $$2, cwh::a);
         return $$3;
      } else {
         return cto.i;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cxy<?> ao_() {
      return cxy.i;
   }
}
