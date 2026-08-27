import java.util.function.Function;
import javax.annotation.Nullable;

public class cks {
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

   public static boolean a(cwj $$0, bpo $$1, epm $$2) {
      for (eqk $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(cwj $$0, epr $$1, bpo $$2, bpz $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static eqk a(cwf $$0, ib $$1) {
      dmz $$2 = $$0.a_($$1);
      return !$$2.a(aun.aP) && (!($$2.b() instanceof dim) || !$$2.c(dim.b)) ? $$2.k($$0, $$1) : eqh.a();
   }

   public static double a(ib $$0, int $$1, Function<ib, eqk> $$2) {
      ib.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         eqk $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ih.a.b);
         }

         $$4++;
         $$3.c(ih.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static epr a(bpc<?> $$0, cwj $$1, ib $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cwf)$$1, $$2), () -> a((cwf)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            epr $$5 = epr.a($$2, $$4);
            epm $$6 = $$0.n().a($$5);

            for (eqk $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bpc.bx || !$$1.a_($$2).a(aun.ck) && !$$1.a_($$2.c()).a(aun.ck)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
