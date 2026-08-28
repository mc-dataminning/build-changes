import java.util.function.Function;
import javax.annotation.Nullable;

public class cqk {
   public static int[][] a(jl $$0) {
      jl $$1 = $$0.h();
      jl $$2 = $$1.g();
      jl $$3 = $$0.g();
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

   public static boolean a(dee $$0, buv $$1, ezc $$2) {
      for (fab $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(dee $$0, ezh $$1, buv $$2, bvh $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static fab a(dea $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      return !$$2.a(awz.aQ) && (!($$2.b() instanceof dql) || !$$2.c(dql.b)) ? $$2.g($$0, $$1) : ezy.a();
   }

   public static double a(jg $$0, int $$1, Function<jg, fab> $$2) {
      jg.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         fab $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jl.a.b);
         }

         $$4++;
         $$3.c(jl.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ezh a(bug<?> $$0, dee $$1, jg $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dea)$$1, $$2), () -> a((dea)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            ezh $$5 = ezh.a($$2, $$4);
            ezc $$6 = $$0.n().a($$5);

            for (fab $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bug.by || !$$1.a_($$2).a(awz.cs) && !$$1.a_($$2.d()).a(awz.cs)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
