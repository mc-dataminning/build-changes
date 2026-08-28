import java.util.function.Function;
import javax.annotation.Nullable;

public class csn {
   public static int[][] a(jo $$0) {
      jo $$1 = $$0.h();
      jo $$2 = $$1.g();
      jo $$3 = $$0.g();
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

   public static boolean a(dgz $$0, bwr $$1, fcp $$2) {
      for (fdo $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.A_().a($$2);
   }

   public static boolean a(dgz $$0, fcu $$1, bwr $$2, bxd $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static fdo a(dgv $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      return !$$2.a(awz.aS) && (!($$2.b() instanceof dtp) || !$$2.c(dtp.b)) ? $$2.g($$0, $$1) : fdl.a();
   }

   public static double a(jj $$0, int $$1, Function<jj, fdo> $$2) {
      jj.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         fdo $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jo.a.b);
         }

         $$4++;
         $$3.c(jo.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static fcu a(bwb<?> $$0, dgz $$1, jj $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dgv)$$1, $$2), () -> a((dgv)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            fcu $$5 = fcu.a($$2, $$4);
            fcp $$6 = $$0.n().a($$5);

            for (fdo $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bwb.bR || !$$1.a_($$2).a(awz.cv) && !$$1.a_($$2.d()).a(awz.cv)) {
               return !$$1.A_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
