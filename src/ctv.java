import java.util.function.Function;
import javax.annotation.Nullable;

public class ctv {
   public static int[][] a(ja $$0) {
      ja $$1 = $$0.h();
      ja $$2 = $$1.g();
      ja $$3 = $$0.g();
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

   public static boolean a(dik $$0, bxe $$1, fel $$2) {
      for (ffk $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.A_().a($$2);
   }

   public static boolean a(dik $$0, feq $$1, bxe $$2, bxq $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static ffk a(dig $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      return !$$2.a(axc.aS) && (!($$2.b() instanceof dvh) || !$$2.c(dvh.b)) ? $$2.g($$0, $$1) : ffh.a();
   }

   public static double a(iu $$0, int $$1, Function<iu, ffk> $$2) {
      iu.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         ffk $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ja.a.b);
         }

         $$4++;
         $$3.c(ja.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static feq a(bwo<?> $$0, dik $$1, iu $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dig)$$1, $$2), () -> a((dig)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            feq $$5 = feq.a($$2, $$4);
            fel $$6 = $$0.n().a($$5);

            for (ffk $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bwo.bS || !$$1.a_($$2).a(axc.cw) && !$$1.a_($$2.d()).a(axc.cw)) {
               return !$$1.A_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
