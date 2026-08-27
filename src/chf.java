import java.util.function.Function;
import javax.annotation.Nullable;

public class chf {
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

   public static boolean a(csz $$0, bml $$1, elo $$2) {
      for (emm $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.D_().a($$2);
   }

   public static boolean a(csz $$0, elt $$1, bml $$2, bmx $$3) {
      return a($$0, $$2, $$2.e($$3).c($$1));
   }

   public static emm a(csv $$0, hx $$1) {
      djh $$2 = $$0.a_($$1);
      return !$$2.a(ash.aO) && (!($$2.b() instanceof dfc) || !$$2.c(dfc.b)) ? $$2.k($$0, $$1) : emj.a();
   }

   public static double a(hx $$0, int $$1, Function<hx, emm> $$2) {
      hx.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         emm $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ic.a.b);
         }

         $$4++;
         $$3.c(ic.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static elt a(blz<?> $$0, csz $$1, hx $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((csv)$$1, $$2), () -> a((csv)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            elt $$5 = elt.a($$2, $$4);
            elo $$6 = $$0.n().a($$5);

            for (emm $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != blz.bv || !$$1.a_($$2).a(ash.ci) && !$$1.a_($$2.c()).a(ash.ci)) {
               return !$$1.D_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
