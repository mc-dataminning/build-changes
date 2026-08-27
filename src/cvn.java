import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cvn extends cvk {
   private static final cvp a = cvp.a(crv.ut);

   public cvn(cvi $$0) {
      super($$0);
   }

   public boolean a(cnm $$0, czg $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof cqm) {
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

   public crs a(cnm $$0, jb $$1) {
      IntList $$2 = new IntArrayList();
      crs $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         crn $$6 = $$5.f();
         if ($$6 instanceof cqm) {
            $$2.add(((cqm)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(jr.J, cug.a, $$2, cug::a);
         return $$3;
      } else {
         return crs.i;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvw<?> ao_() {
      return cvw.i;
   }
}
