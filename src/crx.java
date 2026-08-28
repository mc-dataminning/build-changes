import java.util.function.Function;
import javax.annotation.Nullable;

public class crx {
   public static int[][] a(jm $$0) {
      jm $$1 = $$0.h();
      jm $$2 = $$1.g();
      jm $$3 = $$0.g();
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

   public static boolean a(dgj $$0, bwb $$1, fbn $$2) {
      for (fcm $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.F_().a($$2);
   }

   public static boolean a(dgj $$0, fbs $$1, bwb $$2, bwn $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static fcm a(dgf $$0, jh $$1) {
      dxn $$2 = $$0.a_($$1);
      return !$$2.a(axu.aS) && (!($$2.b() instanceof dsu) || !$$2.c(dsu.b)) ? $$2.g($$0, $$1) : fcj.a();
   }

   public static double a(jh $$0, int $$1, Function<jh, fcm> $$2) {
      jh.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         fcm $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jm.a.b);
         }

         $$4++;
         $$3.c(jm.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static fbs a(bvm<?> $$0, dgj $$1, jh $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dgf)$$1, $$2), () -> a((dgf)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            fbs $$5 = fbs.a($$2, $$4);
            fbn $$6 = $$0.n().a($$5);

            for (fcm $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bvm.bS || !$$1.a_($$2).a(axu.ct) && !$$1.a_($$2.d()).a(axu.ct)) {
               return !$$1.F_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
