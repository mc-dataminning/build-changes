import java.util.function.Function;
import javax.annotation.Nullable;

public class ctk {
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

   public static boolean a(dhz $$0, bwz $$1, fdr $$2) {
      for (feq $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.A_().a($$2);
   }

   public static boolean a(dhz $$0, fdw $$1, bwz $$2, bxl $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static feq a(dhv $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1);
      return !$$2.a(axa.aS) && (!($$2.b() instanceof duq) || !$$2.c(duq.b)) ? $$2.g($$0, $$1) : fen.a();
   }

   public static double a(iu $$0, int $$1, Function<iu, feq> $$2) {
      iu.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         feq $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ja.a.b);
         }

         $$4++;
         $$3.c(ja.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static fdw a(bwj<?> $$0, dhz $$1, iu $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dhv)$$1, $$2), () -> a((dhv)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            fdw $$5 = fdw.a($$2, $$4);
            fdr $$6 = $$0.n().a($$5);

            for (feq $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bwj.bS || !$$1.a_($$2).a(axa.cv) && !$$1.a_($$2.d()).a(axa.cv)) {
               return !$$1.A_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
