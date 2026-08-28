import java.util.function.Function;
import javax.annotation.Nullable;

public class cow {
   public static int[][] a(ji $$0) {
      ji $$1 = $$0.h();
      ji $$2 = $$1.g();
      ji $$3 = $$0.g();
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

   public static boolean a(dce $$0, btl $$1, ewr $$2) {
      for (exp $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(dce $$0, eww $$1, btl $$2, bty $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static exp a(dca $$0, jd $$1) {
      dta $$2 = $$0.a_($$1);
      return !$$2.a(awd.aP) && (!($$2.b() instanceof dok) || !$$2.c(dok.b)) ? $$2.k($$0, $$1) : exm.a();
   }

   public static double a(jd $$0, int $$1, Function<jd, exp> $$2) {
      jd.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         exp $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ji.a.b);
         }

         $$4++;
         $$3.c(ji.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static eww a(bsw<?> $$0, dce $$1, jd $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dca)$$1, $$2), () -> a((dca)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            eww $$5 = eww.a($$2, $$4);
            ewr $$6 = $$0.n().a($$5);

            for (exp $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bsw.by || !$$1.a_($$2).a(awd.cq) && !$$1.a_($$2.c()).a(awd.cq)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
