import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class deg extends ddk {
   public deg(ddh $$0) {
      super($$0);
   }

   @Nullable
   private static Pair<czd, czd> c(ddi $$0) {
      if ($$0.e() != 2) {
         return null;
      } else {
         czd $$1 = null;

         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            czd $$3 = $$0.a($$2);
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

   private static boolean a(czd $$0, czd $$1) {
      return $$1.a($$0.h()) && $$0.M() == 1 && $$1.M() == 1 && $$0.c(kj.d) && $$1.c(kj.d) && $$0.c(kj.e) && $$1.c(kj.e);
   }

   public boolean a(ddi $$0, dja $$1) {
      return c($$0) != null;
   }

   public czd a(ddi $$0, jg.a $$1) {
      Pair<czd, czd> $$2 = c($$0);
      if ($$2 == null) {
         return czd.k;
      } else {
         czd $$3 = (czd)$$2.getFirst();
         czd $$4 = (czd)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         czd $$9 = new czd($$3.h());
         $$9.b(kj.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dfw $$10 = dfs.b($$3);
         dfw $$11 = dfs.b($$4);
         dfs.a($$9, $$3x -> $$1.e(mg.aR).c().filter($$0xx -> $$0xx.a(axe.o)).forEach($$3xx -> {
               int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
               if ($$4x > 0) {
                  $$3x.b($$3xx, $$4x);
               }
            }));
         return $$9;
      }
   }

   @Override
   public dee<deg> a() {
      return dee.n;
   }
}
