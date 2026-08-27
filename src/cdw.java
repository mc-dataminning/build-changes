import java.util.function.Function;
import javax.annotation.Nullable;

public class cdw {
   public static int[][] a(ha $$0) {
      ha $$1 = $$0.h();
      ha $$2 = $$1.g();
      ha $$3 = $$0.g();
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

   public static boolean a(cpl $$0, bjm $$1, ehc $$2) {
      for (eia $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.B_().a($$2);
   }

   public static boolean a(cpl $$0, ehh $$1, bjm $$2, bjy $$3) {
      return a($$0, $$2, $$2.e($$3).c($$1));
   }

   public static eia a(cph $$0, gw $$1) {
      dfd $$2 = $$0.a_($$1);
      return !$$2.a(apv.aO) && (!($$2.b() instanceof dbm) || !$$2.c(dbm.b)) ? $$2.k($$0, $$1) : ehx.a();
   }

   public static double a(gw $$0, int $$1, Function<gw, eia> $$2) {
      gw.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         eia $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ha.a.b);
         }

         $$4++;
         $$3.c(ha.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ehh a(bja<?> $$0, cpl $$1, gw $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cph)$$1, $$2), () -> a((cph)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            ehh $$5 = ehh.a($$2, $$4);
            ehc $$6 = $$0.n().a($$5);

            for (eia $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bja.bt || !$$1.a_($$2).a(apv.ci) && !$$1.a_($$2.c()).a(apv.ci)) {
               return !$$1.B_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
