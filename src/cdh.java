import java.util.function.Function;
import javax.annotation.Nullable;

public class cdh {
   public static int[][] a(hb $$0) {
      hb $$1 = $$0.h();
      hb $$2 = $$1.g();
      hb $$3 = $$0.g();
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

   public static boolean a(cou $$0, biw $$1, eha $$2) {
      for (ehy $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.w_().a($$2);
   }

   public static boolean a(cou $$0, ehf $$1, biw $$2, bji $$3) {
      return a($$0, $$2, $$2.e($$3).c($$1));
   }

   public static ehy a(coq $$0, gv $$1) {
      dey $$2 = $$0.a_($$1);
      return !$$2.a(apj.aO) && (!($$2.b() instanceof dax) || !$$2.c(dax.a)) ? $$2.k($$0, $$1) : ehv.a();
   }

   public static double a(gv $$0, int $$1, Function<gv, ehy> $$2) {
      gv.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         ehy $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(hb.a.b);
         }

         $$4++;
         $$3.c(hb.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ehf a(bik<?> $$0, cou $$1, gv $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((coq)$$1, $$2), () -> a((coq)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            ehf $$5 = ehf.a($$2, $$4);
            eha $$6 = $$0.n().a($$5);

            for (ehy $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bik.bt || !$$1.a_($$2).a(apj.ci) && !$$1.a_($$2.c()).a(apj.ci)) {
               return !$$1.w_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
