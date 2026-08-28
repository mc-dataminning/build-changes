import java.util.function.Function;
import javax.annotation.Nullable;

public class crc {
   public static int[][] a(jn $$0) {
      jn $$1 = $$0.h();
      jn $$2 = $$1.g();
      jn $$3 = $$0.g();
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

   public static boolean a(dfr $$0, bvg $$1, fav $$2) {
      for (fbu $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.F_().a($$2);
   }

   public static boolean a(dfr $$0, fba $$1, bvg $$2, bvs $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static fbu a(dfn $$0, ji $$1) {
      dwx $$2 = $$0.a_($$1);
      return !$$2.a(awp.aS) && (!($$2.b() instanceof dse) || !$$2.c(dse.b)) ? $$2.g($$0, $$1) : fbr.a();
   }

   public static double a(ji $$0, int $$1, Function<ji, fbu> $$2) {
      ji.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         fbu $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jn.a.b);
         }

         $$4++;
         $$3.c(jn.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static fba a(bur<?> $$0, dfr $$1, ji $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dfn)$$1, $$2), () -> a((dfn)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            fba $$5 = fba.a($$2, $$4);
            fav $$6 = $$0.n().a($$5);

            for (fbu $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bur.bS || !$$1.a_($$2).a(awp.ct) && !$$1.a_($$2.d()).a(awp.ct)) {
               return !$$1.F_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
