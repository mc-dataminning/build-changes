import java.util.function.Function;
import javax.annotation.Nullable;

public class cjj {
   public static int[][] a(ie $$0) {
      ie $$1 = $$0.h();
      ie $$2 = $$1.g();
      ie $$3 = $$0.g();
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

   public static boolean a(cvb $$0, boi $$1, enu $$2) {
      for (eos $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.D_().a($$2);
   }

   public static boolean a(cvb $$0, enz $$1, boi $$2, bot $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static eos a(cux $$0, hz $$1) {
      dlj $$2 = $$0.a_($$1);
      return !$$2.a(aua.aO) && (!($$2.b() instanceof dhe) || !$$2.c(dhe.b)) ? $$2.k($$0, $$1) : eop.a();
   }

   public static double a(hz $$0, int $$1, Function<hz, eos> $$2) {
      hz.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         eos $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ie.a.b);
         }

         $$4++;
         $$3.c(ie.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static enz a(bnw<?> $$0, cvb $$1, hz $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cux)$$1, $$2), () -> a((cux)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            enz $$5 = enz.a($$2, $$4);
            enu $$6 = $$0.n().a($$5);

            for (eos $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bnw.bw || !$$1.a_($$2).a(aua.cj) && !$$1.a_($$2.c()).a(aua.cj)) {
               return !$$1.D_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
