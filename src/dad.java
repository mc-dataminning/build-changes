import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dad extends daa {
   private static final daf a = daf.a(cwb.ux);

   public dad(czx $$0) {
      super($$0);
   }

   public boolean a(czy $$0, dev $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvx $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cuv) {
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

   public cvx a(czy $$0, jr.a $$1) {
      IntList $$2 = new IntArrayList();
      cvx $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvx $$5 = $$0.a($$4);
         cvt $$6 = $$5.h();
         if ($$6 instanceof cuv) {
            $$2.add(((cuv)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kt.ad, cyk.a, $$2, cyk::a);
         return $$3;
      } else {
         return cvx.k;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dao<?> ar_() {
      return dao.i;
   }
}
