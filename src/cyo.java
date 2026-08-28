import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cyo extends cyl {
   private static final cyq a = cyq.a(cuq.uv);

   public cyo(cyj $$0) {
      super($$0);
   }

   public boolean a(cqi $$0, dbw $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cun $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof cth) {
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

   public cun a(cqi $$0, jk.a $$1) {
      IntList $$2 = new IntArrayList();
      cun $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cun $$5 = $$0.a($$4);
         cui $$6 = $$5.g();
         if ($$6 instanceof cth) {
            $$2.add(((cth)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(km.S, cxg.a, $$2, cxg::a);
         return $$3;
      } else {
         return cun.l;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyx<?> ap_() {
      return cyx.i;
   }
}
