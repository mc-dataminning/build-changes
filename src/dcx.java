import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class dcx extends dcb {
   public dcx(dby $$0) {
      super($$0);
   }

   @Nullable
   private static Pair<cxy, cxy> c(dbz $$0) {
      if ($$0.e() != 2) {
         return null;
      } else {
         cxy $$1 = null;

         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cxy $$3 = $$0.a($$2);
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

   private static boolean a(cxy $$0, cxy $$1) {
      return $$1.a($$0.h()) && $$0.M() == 1 && $$1.M() == 1 && $$0.c(kx.d) && $$1.c(kx.d) && $$0.c(kx.e) && $$1.c(kx.e);
   }

   public boolean a(dbz $$0, dhp $$1) {
      return c($$0) != null;
   }

   public cxy a(dbz $$0, ju.a $$1) {
      Pair<cxy, cxy> $$2 = c($$0);
      if ($$2 == null) {
         return cxy.k;
      } else {
         cxy $$3 = (cxy)$$2.getFirst();
         cxy $$4 = (cxy)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         cxy $$9 = new cxy($$3.h());
         $$9.b(kx.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         den $$10 = dej.b($$3);
         den $$11 = dej.b($$4);
         dej.a($$9, $$3x -> $$1.e(me.aS).c().filter($$0xx -> $$0xx.a(axc.o)).forEach($$3xx -> {
               int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
               if ($$4x > 0) {
                  $$3x.b($$3xx, $$4x);
               }
            }));
         return $$9;
      }
   }

   @Override
   public dcv<dcx> a() {
      return dcv.n;
   }
}
