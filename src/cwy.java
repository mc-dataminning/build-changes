import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cwy extends cwv {
   private static final cxa a = cxa.a(ctc.uv);

   public cwy(cwt $$0) {
      super($$0);
   }

   public boolean a(cou $$0, dad $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof crt) {
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

   public csz a(cou $$0, iy.a $$1) {
      IntList $$2 = new IntArrayList();
      csz $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         csu $$6 = $$5.f();
         if ($$6 instanceof crt) {
            $$2.add(((crt)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(ka.Q, cvq.a, $$2, cvq::a);
         return $$3;
      } else {
         return csz.i;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cxh<?> ao_() {
      return cxh.i;
   }
}
