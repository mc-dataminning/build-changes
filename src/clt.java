import java.util.function.Function;
import javax.annotation.Nullable;

public class clt {
   public static int[][] a(ih $$0) {
      ih $$1 = $$0.h();
      ih $$2 = $$1.g();
      ih $$3 = $$0.g();
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

   public static boolean a(cyh $$0, bqo $$1, erv $$2) {
      for (est $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(cyh $$0, esa $$1, bqo $$2, bqz $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static est a(cyd $$0, ib $$1) {
      doz $$2 = $$0.a_($$1);
      return !$$2.a(avc.aP) && (!($$2.b() instanceof dkk) || !$$2.c(dkk.b)) ? $$2.k($$0, $$1) : esq.a();
   }

   public static double a(ib $$0, int $$1, Function<ib, est> $$2) {
      ib.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         est $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ih.a.b);
         }

         $$4++;
         $$3.c(ih.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static esa a(bqb<?> $$0, cyh $$1, ib $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cyd)$$1, $$2), () -> a((cyd)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            esa $$5 = esa.a($$2, $$4);
            erv $$6 = $$0.n().a($$5);

            for (est $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bqb.bx || !$$1.a_($$2).a(avc.ck) && !$$1.a_($$2.c()).a(avc.ck)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
