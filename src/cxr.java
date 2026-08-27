import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cxr extends cxo {
   private static final cxt a = cxt.a(ctt.uv);

   public cxr(cxm $$0) {
      super($$0);
   }

   public boolean a(cpl $$0, daz $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csk) {
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

   public ctq a(cpl $$0, iz.a $$1) {
      IntList $$2 = new IntArrayList();
      ctq $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         ctl $$6 = $$5.g();
         if ($$6 instanceof csk) {
            $$2.add(((csk)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kb.S, cwj.a, $$2, cwj::a);
         return $$3;
      } else {
         return ctq.i;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cya<?> ap_() {
      return cya.i;
   }
}
