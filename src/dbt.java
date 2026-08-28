import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class dbt extends dbq {
   private static final dbv c = dbv.a(cxo.vl);

   public dbt(dbn $$0) {
      super($$0);
   }

   public boolean a(dbo $$0, dha $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cwi) {
               $$2 = true;
            } else {
               if (!c.a($$5)) {
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

   public cxk a(dbo $$0, js.a $$1) {
      IntList $$2 = new IntArrayList();
      cxk $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxk $$5 = $$0.a($$4);
         cxg $$6 = $$5.h();
         if ($$6 instanceof cwi) {
            $$2.add(((cwi)$$6).b().f());
         } else if (c.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(ku.ae, czz.a, $$2, czz::a);
         return $$3;
      } else {
         return cxk.k;
      }
   }

   @Override
   public dci<dbt> a() {
      return dci.i;
   }
}
