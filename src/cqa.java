import java.util.function.Function;
import javax.annotation.Nullable;

public class cqa {
   public static int[][] a(jk $$0) {
      jk $$1 = $$0.h();
      jk $$2 = $$1.g();
      jk $$3 = $$0.g();
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

   public static boolean a(dds $$0, bun $$1, eyr $$2) {
      for (ezq $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.B_().a($$2);
   }

   public static boolean a(dds $$0, eyw $$1, bun $$2, buz $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static ezq a(ddo $$0, jf $$1) {
      dus $$2 = $$0.a_($$1);
      return !$$2.a(awv.aQ) && (!($$2.b() instanceof dqa) || !$$2.c(dqa.b)) ? $$2.g($$0, $$1) : ezn.a();
   }

   public static double a(jf $$0, int $$1, Function<jf, ezq> $$2) {
      jf.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         ezq $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jk.a.b);
         }

         $$4++;
         $$3.c(jk.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static eyw a(bty<?> $$0, dds $$1, jf $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((ddo)$$1, $$2), () -> a((ddo)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            eyw $$5 = eyw.a($$2, $$4);
            eyr $$6 = $$0.n().a($$5);

            for (ezq $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bty.by || !$$1.a_($$2).a(awv.cr) && !$$1.a_($$2.d()).a(awv.cr)) {
               return !$$1.B_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
