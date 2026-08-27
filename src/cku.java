import java.util.function.Function;
import javax.annotation.Nullable;

public class cku {
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

   public static boolean a(cwl $$0, bpp $$1, epo $$2) {
      for (eqm $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(cwl $$0, ept $$1, bpp $$2, bqa $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static eqm a(cwh $$0, ib $$1) {
      dnb $$2 = $$0.a_($$1);
      return !$$2.a(aun.aP) && (!($$2.b() instanceof dio) || !$$2.c(dio.b)) ? $$2.k($$0, $$1) : eqj.a();
   }

   public static double a(ib $$0, int $$1, Function<ib, eqm> $$2) {
      ib.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         eqm $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ih.a.b);
         }

         $$4++;
         $$3.c(ih.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ept a(bpd<?> $$0, cwl $$1, ib $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cwh)$$1, $$2), () -> a((cwh)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            ept $$5 = ept.a($$2, $$4);
            epo $$6 = $$0.n().a($$5);

            for (eqm $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bpd.by || !$$1.a_($$2).a(aun.ck) && !$$1.a_($$2.c()).a(aun.ck)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
