import java.util.function.Function;
import javax.annotation.Nullable;

public class cpr {
   public static int[][] a(jj $$0) {
      jj $$1 = $$0.h();
      jj $$2 = $$1.g();
      jj $$3 = $$0.g();
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

   public static boolean a(ddb $$0, buf $$1, exz $$2) {
      for (eyx $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.A_().a($$2);
   }

   public static boolean a(ddb $$0, eye $$1, buf $$2, bur $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static eyx a(dcx $$0, je $$1) {
      dua $$2 = $$0.a_($$1);
      return !$$2.a(aws.aQ) && (!($$2.b() instanceof dpj) || !$$2.c(dpj.b)) ? $$2.g($$0, $$1) : eyu.a();
   }

   public static double a(je $$0, int $$1, Function<je, eyx> $$2) {
      je.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         eyx $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jj.a.b);
         }

         $$4++;
         $$3.c(jj.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static eye a(btq<?> $$0, ddb $$1, je $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dcx)$$1, $$2), () -> a((dcx)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            eye $$5 = eye.a($$2, $$4);
            exz $$6 = $$0.n().a($$5);

            for (eyx $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != btq.by || !$$1.a_($$2).a(aws.cr) && !$$1.a_($$2.d()).a(aws.cr)) {
               return !$$1.A_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
