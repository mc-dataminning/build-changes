import java.util.function.Function;
import javax.annotation.Nullable;

public class cnh {
   public static int[][] a(is $$0) {
      is $$1 = $$0.h();
      is $$2 = $$1.g();
      is $$3 = $$0.g();
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

   public static boolean a(czn $$0, bsa $$1, etk $$2) {
      for (eui $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(czn $$0, etp $$1, bsa $$2, bsl $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static eui a(czj $$0, in $$1) {
      dqh $$2 = $$0.a_($$1);
      return !$$2.a(avr.aP) && (!($$2.b() instanceof dlr) || !$$2.c(dlr.b)) ? $$2.k($$0, $$1) : euf.a();
   }

   public static double a(in $$0, int $$1, Function<in, eui> $$2) {
      in.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         eui $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(is.a.b);
         }

         $$4++;
         $$3.c(is.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static etp a(brn<?> $$0, czn $$1, in $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((czj)$$1, $$2), () -> a((czj)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            etp $$5 = etp.a($$2, $$4);
            etk $$6 = $$0.n().a($$5);

            for (eui $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != brn.bx || !$$1.a_($$2).a(avr.cq) && !$$1.a_($$2.c()).a(avr.cq)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
