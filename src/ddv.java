import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class ddv extends dcz {
   public ddv(dcw $$0) {
      super($$0);
   }

   @Nullable
   private static Pair<cys, cys> c(dcx $$0) {
      if ($$0.e() != 2) {
         return null;
      } else {
         cys $$1 = null;

         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cys $$3 = $$0.a($$2);
            if (!$$3.f()) {
               if ($$1 != null) {
                  return a($$1, $$3) ? Pair.of($$1, $$3) : null;
               }

               $$1 = $$3;
            }
         }

         return null;
      }
   }

   private static boolean a(cys $$0, cys $$1) {
      return $$1.a($$0.h()) && $$0.M() == 1 && $$1.M() == 1 && $$0.c(kj.d) && $$1.c(kj.d) && $$0.c(kj.e) && $$1.c(kj.e);
   }

   public boolean a(dcx $$0, dip $$1) {
      return c($$0) != null;
   }

   public cys a(dcx $$0, jg.a $$1) {
      Pair<cys, cys> $$2 = c($$0);
      if ($$2 == null) {
         return cys.k;
      } else {
         cys $$3 = (cys)$$2.getFirst();
         cys $$4 = (cys)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cys $$9 = new cys($$3.h());
         $$9.b(kj.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dfl $$10 = dfh.b($$3);
         dfl $$11 = dfh.b($$4);
         dfh.a($$9, $$3x -> $$1.e(mg.aP).c().filter($$0xx -> $$0xx.a(axc.o)).forEach($$3xx -> {
               int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
               if ($$4x > 0) {
                  $$3x.b($$3xx, $$4x);
               }
            }));
         return $$9;
      }
   }

   @Override
   public ddt<ddv> a() {
      return ddt.n;
   }
}
