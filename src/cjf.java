import java.util.function.Function;
import javax.annotation.Nullable;

public class cjf {
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

   public static boolean a(cux $$0, bog $$1, enn $$2) {
      for (eol $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.D_().a($$2);
   }

   public static boolean a(cux $$0, ens $$1, bog $$2, bor $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static eol a(cut $$0, hz $$1) {
      dlf $$2 = $$0.a_($$1);
      return !$$2.a(atz.aO) && (!($$2.b() instanceof dha) || !$$2.c(dha.b)) ? $$2.k($$0, $$1) : eoi.a();
   }

   public static double a(hz $$0, int $$1, Function<hz, eol> $$2) {
      hz.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         eol $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ie.a.b);
         }

         $$4++;
         $$3.c(ie.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ens a(bnu<?> $$0, cux $$1, hz $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cut)$$1, $$2), () -> a((cut)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            ens $$5 = ens.a($$2, $$4);
            enn $$6 = $$0.n().a($$5);

            for (eol $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bnu.bw || !$$1.a_($$2).a(atz.cj) && !$$1.a_($$2.c()).a(atz.cj)) {
               return !$$1.D_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
