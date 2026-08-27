import java.util.function.Function;
import javax.annotation.Nullable;

public class cdl {
   public static int[][] a(hc $$0) {
      hc $$1 = $$0.h();
      hc $$2 = $$1.g();
      hc $$3 = $$0.g();
      return new int[][]{
         {$$1.j(), $$1.l()},
         {$$2.j(), $$2.l()},
         {$$3.j() + $$1.j(), $$3.l() + $$1.l()},
         {$$3.j() + $$2.j(), $$3.l() + $$2.l()},
         {$$0.j() + $$1.j(), $$0.l() + $$1.l()},
         {$$0.j() + $$2.j(), $$0.l() + $$2.l()},
         {$$3.j(), $$3.l()},
         {$$0.j(), $$0.l()}
      };
   }

   public static boolean a(double $$0) {
      return !Double.isInfinite($$0) && $$0 < 1.0;
   }

   public static boolean a(cpa $$0, bjb $$1, ehd $$2) {
      for (eib $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.w_().a($$2);
   }

   public static boolean a(cpa $$0, ehi $$1, bjb $$2, bjn $$3) {
      return a($$0, $$2, $$2.e($$3).c($$1));
   }

   public static eib a(cow $$0, gw $$1) {
      dfe $$2 = $$0.a_($$1);
      return !$$2.a(apo.aO) && (!($$2.b() instanceof dbd) || !$$2.c(dbd.a)) ? $$2.k($$0, $$1) : ehy.a();
   }

   public static double a(gw $$0, int $$1, Function<gw, eib> $$2) {
      gw.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         eib $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(hc.a.b);
         }

         $$4++;
         $$3.c(hc.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ehi a(bip<?> $$0, cpa $$1, gw $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cow)$$1, $$2), () -> a((cow)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            ehi $$5 = ehi.a($$2, $$4);
            ehd $$6 = $$0.n().a($$5);

            for (eib $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bip.bt || !$$1.a_($$2).a(apo.ci) && !$$1.a_($$2.c()).a(apo.ci)) {
               return !$$1.w_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
