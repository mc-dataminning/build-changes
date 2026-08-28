import java.util.function.Function;
import javax.annotation.Nullable;

public class csb {
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

   public static boolean a(dgq $$0, bwf $$1, fbs $$2) {
      for (fcr $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.F_().a($$2);
   }

   public static boolean a(dgq $$0, fbx $$1, bwf $$2, bwr $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static fcr a(dgm $$0, jh $$1) {
      dxu $$2 = $$0.a_($$1);
      return !$$2.a(axu.aS) && (!($$2.b() instanceof dtb) || !$$2.c(dtb.b)) ? $$2.g($$0, $$1) : fco.a();
   }

   public static double a(jh $$0, int $$1, Function<jh, fcr> $$2) {
      jh.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         fcr $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jm.a.b);
         }

         $$4++;
         $$3.c(jm.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static fbx a(bvq<?> $$0, dgq $$1, jh $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dgm)$$1, $$2), () -> a((dgm)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            fbx $$5 = fbx.a($$2, $$4);
            fbs $$6 = $$0.n().a($$5);

            for (fcr $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bvq.bS || !$$1.a_($$2).a(axu.ct) && !$$1.a_($$2.d()).a(axu.ct)) {
               return !$$1.F_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
