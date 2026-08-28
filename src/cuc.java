import java.util.function.Function;
import javax.annotation.Nullable;

public class cuc {
   public static int[][] a(jb $$0) {
      jb $$1 = $$0.h();
      jb $$2 = $$1.g();
      jb $$3 = $$0.g();
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

   public static boolean a(dir $$0, bxj $$1, fes $$2) {
      for (ffr $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.A_().a($$2);
   }

   public static boolean a(dir $$0, fex $$1, bxj $$2, bxv $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static ffr a(din $$0, iv $$1) {
      eao $$2 = $$0.a_($$1);
      return !$$2.a(axc.aS) && (!($$2.b() instanceof dvo) || !$$2.c(dvo.b)) ? $$2.g($$0, $$1) : ffo.a();
   }

   public static double a(iv $$0, int $$1, Function<iv, ffr> $$2) {
      iv.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         ffr $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jb.a.b);
         }

         $$4++;
         $$3.c(jb.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static fex a(bwr<?> $$0, dir $$1, iv $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((din)$$1, $$2), () -> a((din)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            fex $$5 = fex.a($$2, $$4);
            fes $$6 = $$0.n().a($$5);

            for (ffr $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bwr.bS || !$$1.a_($$2).a(axc.cx) && !$$1.a_($$2.d()).a(axc.cx)) {
               return !$$1.A_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
