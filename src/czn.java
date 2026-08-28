import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class czn extends czk {
   private static final czp a = czp.a(cvo.ux);

   public czn(czh $$0) {
      super($$0);
   }

   public boolean a(czi $$0, dds $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvl $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cuf) {
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

   public cvl a(czi $$0, jp.a $$1) {
      IntList $$2 = new IntArrayList();
      cvl $$3 = null;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvl $$5 = $$0.a($$4);
         cvg $$6 = $$5.h();
         if ($$6 instanceof cuf) {
            $$2.add(((cuf)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a(kr.W, cye.a, $$2, cye::a);
         return $$3;
      } else {
         return cvl.k;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public czy<?> as_() {
      return czy.i;
   }
}
