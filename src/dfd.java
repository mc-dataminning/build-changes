import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class dfd extends deh {
   public dfd(dee $$0) {
      super($$0);
   }

   @Nullable
   private static Pair<daa, daa> c(def $$0) {
      if ($$0.e() != 2) {
         return null;
      } else {
         daa $$1 = null;

         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            daa $$3 = $$0.a($$2);
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

   private static boolean a(daa $$0, daa $$1) {
      return $$1.a($$0.h()) && $$0.M() == 1 && $$1.M() == 1 && $$0.c(kl.d) && $$1.c(kl.d) && $$0.c(kl.e) && $$1.c(kl.e);
   }

   public boolean a(def $$0, djz $$1) {
      return c($$0) != null;
   }

   public daa a(def $$0, ji.a $$1) {
      Pair<daa, daa> $$2 = c($$0);
      if ($$2 == null) {
         return daa.k;
      } else {
         daa $$3 = (daa)$$2.getFirst();
         daa $$4 = (daa)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         daa $$9 = new daa($$3.h());
         $$9.b(kl.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         dgt $$10 = dgp.b($$3);
         dgt $$11 = dgp.b($$4);
         dgp.a($$9, $$3x -> $$1.e(mi.aR).c().filter($$0xx -> $$0xx.a(axi.o)).forEach($$3xx -> {
               int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
               if ($$4x > 0) {
                  $$3x.b($$3xx, $$4x);
               }
            }));
         return $$9;
      }
   }

   @Override
   public dfb<dfd> a() {
      return dfb.n;
   }
}
