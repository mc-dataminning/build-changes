import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dan extends dak {
   private static final dap a = dap.a(cwj.uN);

   public dan(dah $$0) {
      super($$0);
   }

   public boolean a(dai $$0, dff $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwf $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cvd) {
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

   public cwf a(dai $$0, js.a $$1) {
      IntList $$2 = new IntArrayList();
      cwf $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwf $$5 = $$0.a($$4);
         cwb $$6 = $$5.h();
         if ($$6 instanceof cvd) {
            $$2.add(((cvd)$$6).b().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(ku.ae, cyu.a, $$2, cyu::a);
         return $$3;
      } else {
         return cwf.k;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public day<?> aq_() {
      return day.i;
   }
}
