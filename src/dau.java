import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dau extends dar {
   private static final daw a = daw.a(cwq.uN);

   public dau(dao $$0) {
      super($$0);
   }

   public boolean a(dap $$0, dfm $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwm $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cvk) {
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

   public cwm a(dap $$0, js.a $$1) {
      IntList $$2 = new IntArrayList();
      cwm $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwm $$5 = $$0.a($$4);
         cwi $$6 = $$5.h();
         if ($$6 instanceof cvk) {
            $$2.add(((cvk)$$6).b().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(ku.ae, czb.a, $$2, czb::a);
         return $$3;
      } else {
         return cwm.k;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dbf<?> ap_() {
      return dbf.i;
   }
}
