import java.util.function.Function;
import javax.annotation.Nullable;

public class crw {
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

   public static boolean a(dgj $$0, bvy $$1, fbs $$2) {
      for (fcr $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.A_().a($$2);
   }

   public static boolean a(dgj $$0, fbx $$1, bvy $$2, bwk $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static fcr a(dgf $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      return !$$2.a(awp.aS) && (!($$2.b() instanceof dsx) || !$$2.c(dsx.b)) ? $$2.g($$0, $$1) : fco.a();
   }

   public static double a(ji $$0, int $$1, Function<ji, fcr> $$2) {
      ji.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         fcr $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jn.a.b);
         }

         $$4++;
         $$3.c(jn.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static fbx a(bvi<?> $$0, dgj $$1, ji $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dgf)$$1, $$2), () -> a((dgf)$$1, $$2.e()));
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

            if ($$0 != bvi.bR || !$$1.a_($$2).a(awp.cv) && !$$1.a_($$2.d()).a(awp.cv)) {
               return !$$1.A_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
