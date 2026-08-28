import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class daj extends dag {
   private static final dal a = dal.a(cwf.ux);

   public daj(dad $$0) {
      super($$0);
   }

   public boolean a(dae $$0, dfb $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwb $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cuz) {
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

   public cwb a(dae $$0, js.a $$1) {
      IntList $$2 = new IntArrayList();
      cwb $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwb $$5 = $$0.a($$4);
         cvx $$6 = $$5.h();
         if ($$6 instanceof cuz) {
            $$2.add(((cuz)$$6).b().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(ku.ae, cyq.a, $$2, cyq::a);
         return $$3;
      } else {
         return cwb.k;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dau<?> aq_() {
      return dau.i;
   }
}
