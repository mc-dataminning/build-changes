import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cyl extends cyi {
   private static final cyn a = cyn.a(cun.uv);

   public cyl(cyg $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, dbt $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof cte) {
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

   public cuk a(cqf $$0, jk.a $$1) {
      IntList $$2 = new IntArrayList();
      cuk $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         cuf $$6 = $$5.g();
         if ($$6 instanceof cte) {
            $$2.add(((cte)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(km.S, cxd.a, $$2, cxd::a);
         return $$3;
      } else {
         return cuk.l;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyu<?> ap_() {
      return cyu.i;
   }
}
