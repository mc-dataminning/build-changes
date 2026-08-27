import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class cwb extends cvy {
   private static final cwd a = cwd.a(csg.uv);

   public cwb(cvw $$0) {
      super($$0);
   }

   public boolean a(cnx $$0, czu $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof cqx) {
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

   public csd a(cnx $$0, jj $$1) {
      IntList $$2 = new IntArrayList();
      csd $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         cry $$6 = $$5.f();
         if ($$6 instanceof cqx) {
            $$2.add(((cqx)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(jz.J, cuu.a, $$2, cuu::a);
         return $$3;
      } else {
         return csd.i;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cwk<?> ao_() {
      return cwk.i;
   }
}
