import java.util.function.Function;
import javax.annotation.Nullable;

public class chn {
   public static int[][] a(ic $$0) {
      ic $$1 = $$0.h();
      ic $$2 = $$1.g();
      ic $$3 = $$0.g();
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

   public static boolean a(cth $$0, bmo $$1, elx $$2) {
      for (emv $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.D_().a($$2);
   }

   public static boolean a(cth $$0, emc $$1, bmo $$2, bna $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static emv a(ctd $$0, hx $$1) {
      djp $$2 = $$0.a_($$1);
      return !$$2.a(asi.aO) && (!($$2.b() instanceof dfk) || !$$2.c(dfk.b)) ? $$2.k($$0, $$1) : ems.a();
   }

   public static double a(hx $$0, int $$1, Function<hx, emv> $$2) {
      hx.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         emv $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ic.a.b);
         }

         $$4++;
         $$3.c(ic.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static emc a(bmc<?> $$0, cth $$1, hx $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((ctd)$$1, $$2), () -> a((ctd)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            emc $$5 = emc.a($$2, $$4);
            elx $$6 = $$0.n().a($$5);

            for (emv $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bmc.bw || !$$1.a_($$2).a(asi.ci) && !$$1.a_($$2.c()).a(asi.ci)) {
               return !$$1.D_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
