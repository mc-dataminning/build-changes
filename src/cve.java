import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cve extends cvb {
   private static final cvg a = cvg.a(crm.ut);

   public cve(cuz $$0) {
      super($$0);
   }

   public boolean a(cnf $$0, cyx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof cqd) {
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

   public crj a(cnf $$0, iz $$1) {
      IntList $$2 = new IntArrayList();
      crj $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         cre $$6 = $$5.f();
         if ($$6 instanceof cqd) {
            $$2.add(((cqd)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(jp.J, ctx.a, $$2, ctx::a);
         return $$3;
      } else {
         return crj.i;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvn<?> ap_() {
      return cvn.i;
   }
}
