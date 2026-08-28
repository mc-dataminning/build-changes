import java.util.function.Function;
import javax.annotation.Nullable;

public class crd {
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

   public static boolean a(dfs $$0, bvi $$1, faw $$2) {
      for (fbv $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.F_().a($$2);
   }

   public static boolean a(dfs $$0, fbb $$1, bvi $$2, bvu $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static fbv a(dfo $$0, ji $$1) {
      dwy $$2 = $$0.a_($$1);
      return !$$2.a(awp.aS) && (!($$2.b() instanceof dsf) || !$$2.c(dsf.b)) ? $$2.g($$0, $$1) : fbs.a();
   }

   public static double a(ji $$0, int $$1, Function<ji, fbv> $$2) {
      ji.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         fbv $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jn.a.b);
         }

         $$4++;
         $$3.c(jn.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static fbb a(but<?> $$0, dfs $$1, ji $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dfo)$$1, $$2), () -> a((dfo)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            fbb $$5 = fbb.a($$2, $$4);
            faw $$6 = $$0.n().a($$5);

            for (fbv $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != but.bR || !$$1.a_($$2).a(awp.ct) && !$$1.a_($$2.d()).a(awp.ct)) {
               return !$$1.F_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
