import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dae extends dab {
   private static final dag a = dag.a(cvw.ux);

   public dae(czy $$0) {
      super($$0);
   }

   public boolean a(czz $$0, dej $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cun) {
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

   public cvs a(czz $$0, jq.a $$1) {
      IntList $$2 = new IntArrayList();
      cvs $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
         cvn $$6 = $$5.h();
         if ($$6 instanceof cun) {
            $$2.add(((cun)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(ks.Z, cyl.a, $$2, cyl::a);
         return $$3;
      } else {
         return cvs.k;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dap<?> ar_() {
      return dap.i;
   }
}
