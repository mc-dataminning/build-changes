import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class deb extends ddf {
   public deb(ddc $$0) {
      super($$0);
   }

   @Nullable
   private static Pair<cyy, cyy> c(ddd $$0) {
      if ($$0.e() != 2) {
         return null;
      } else {
         cyy $$1 = null;

         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cyy $$3 = $$0.a($$2);
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

   private static boolean a(cyy $$0, cyy $$1) {
      return $$1.a($$0.h()) && $$0.M() == 1 && $$1.M() == 1 && $$0.c(kj.d) && $$1.c(kj.d) && $$0.c(kj.e) && $$1.c(kj.e);
   }

   public boolean a(ddd $$0, div $$1) {
      return c($$0) != null;
   }

   public cyy a(ddd $$0, jg.a $$1) {
      Pair<cyy, cyy> $$2 = c($$0);
      if ($$2 == null) {
         return cyy.k;
      } else {
         cyy $$3 = (cyy)$$2.getFirst();
         cyy $$4 = (cyy)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cyy $$9 = new cyy($$3.h());
         $$9.b(kj.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dfr $$10 = dfn.b($$3);
         dfr $$11 = dfn.b($$4);
         dfn.a($$9, $$3x -> $$1.e(mg.aQ).c().filter($$0xx -> $$0xx.a(axe.o)).forEach($$3xx -> {
               int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
               if ($$4x > 0) {
                  $$3x.b($$3xx, $$4x);
               }
            }));
         return $$9;
      }
   }

   @Override
   public ddz<deb> a() {
      return ddz.n;
   }
}
