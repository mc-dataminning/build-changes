import java.util.function.Function;
import javax.annotation.Nullable;

public class ctq {
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

   public static boolean a(dif $$0, bxc $$1, fed $$2) {
      for (ffc $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.A_().a($$2);
   }

   public static boolean a(dif $$0, fei $$1, bxc $$2, bxo $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static ffc a(dib $$0, iu $$1) {
      dzz $$2 = $$0.a_($$1);
      return !$$2.a(axc.aS) && (!($$2.b() instanceof duz) || !$$2.c(duz.b)) ? $$2.g($$0, $$1) : fez.a();
   }

   public static double a(iu $$0, int $$1, Function<iu, ffc> $$2) {
      iu.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         ffc $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ja.a.b);
         }

         $$4++;
         $$3.c(ja.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static fei a(bwm<?> $$0, dif $$1, iu $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dib)$$1, $$2), () -> a((dib)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            fei $$5 = fei.a($$2, $$4);
            fed $$6 = $$0.n().a($$5);

            for (ffc $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bwm.bS || !$$1.a_($$2).a(axc.cv) && !$$1.a_($$2.d()).a(axc.cv)) {
               return !$$1.A_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
