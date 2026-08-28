import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class dfn extends der {
   public dfn(deo $$0) {
      super($$0);
   }

   @Nullable
   private static Pair<dak, dak> c(dep $$0) {
      if ($$0.e() != 2) {
         return null;
      } else {
         dak $$1 = null;

         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            dak $$3 = $$0.a($$2);
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

   private static boolean a(dak $$0, dak $$1) {
      return $$1.a($$0.h()) && $$0.M() == 1 && $$1.M() == 1 && $$0.c(kl.d) && $$1.c(kl.d) && $$0.c(kl.e) && $$1.c(kl.e);
   }

   public boolean a(dep $$0, dkj $$1) {
      return c($$0) != null;
   }

   public dak a(dep $$0, ji.a $$1) {
      Pair<dak, dak> $$2 = c($$0);
      if ($$2 == null) {
         return dak.l;
      } else {
         dak $$3 = (dak)$$2.getFirst();
         dak $$4 = (dak)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         dak $$9 = new dak($$3.h());
         $$9.b(kl.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dhd $$10 = dgz.b($$3);
         dhd $$11 = dgz.b($$4);
         dgz.a($$9, $$3x -> $$1.e(mi.aR).c().filter($$0xx -> $$0xx.a(axp.o)).forEach($$3xx -> {
               int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
               if ($$4x > 0) {
                  $$3x.b($$3xx, $$4x);
               }
            }));
         return $$9;
      }
   }

   @Override
   public dfl<dfn> a() {
      return dfl.n;
   }
}
