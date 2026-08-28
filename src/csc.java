import java.util.function.Function;
import javax.annotation.Nullable;

public class csc {
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

   public static boolean a(dgr $$0, bwg $$1, fbt $$2) {
      for (fcs $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.F_().a($$2);
   }

   public static boolean a(dgr $$0, fby $$1, bwg $$2, bws $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static fcs a(dgn $$0, jh $$1) {
      dxv $$2 = $$0.a_($$1);
      return !$$2.a(axu.aS) && (!($$2.b() instanceof dtc) || !$$2.c(dtc.b)) ? $$2.g($$0, $$1) : fcp.a();
   }

   public static double a(jh $$0, int $$1, Function<jh, fcs> $$2) {
      jh.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         fcs $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jm.a.b);
         }

         $$4++;
         $$3.c(jm.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static fby a(bvr<?> $$0, dgr $$1, jh $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dgn)$$1, $$2), () -> a((dgn)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            fby $$5 = fby.a($$2, $$4);
            fbt $$6 = $$0.n().a($$5);

            for (fcs $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bvr.bS || !$$1.a_($$2).a(axu.ct) && !$$1.a_($$2.d()).a(axu.ct)) {
               return !$$1.F_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
