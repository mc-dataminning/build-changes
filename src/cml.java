import java.util.function.Function;
import javax.annotation.Nullable;

public class cml {
   public static int[][] a(ir $$0) {
      ir $$1 = $$0.h();
      ir $$2 = $$1.g();
      ir $$3 = $$0.g();
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

   public static boolean a(cze $$0, bre $$1, eta $$2) {
      for (ety $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(cze $$0, etf $$1, bre $$2, brp $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static ety a(cza $$0, im $$1) {
      dpy $$2 = $$0.a_($$1);
      return !$$2.a(avo.aP) && (!($$2.b() instanceof dli) || !$$2.c(dli.b)) ? $$2.k($$0, $$1) : etv.a();
   }

   public static double a(im $$0, int $$1, Function<im, ety> $$2) {
      im.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         ety $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ir.a.b);
         }

         $$4++;
         $$3.c(ir.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static etf a(bqr<?> $$0, cze $$1, im $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cza)$$1, $$2), () -> a((cza)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            etf $$5 = etf.a($$2, $$4);
            eta $$6 = $$0.n().a($$5);

            for (ety $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bqr.bx || !$$1.a_($$2).a(avo.ck) && !$$1.a_($$2.c()).a(avo.ck)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
