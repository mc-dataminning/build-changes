import java.util.function.Function;
import javax.annotation.Nullable;

public class cvb {
   public static int[][] a(jc $$0) {
      jc $$1 = $$0.h();
      jc $$2 = $$1.g();
      jc $$3 = $$0.g();
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

   public static boolean a(djr $$0, byf $$1, ffx $$2) {
      for (fgw $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.E_().a($$2);
   }

   public static boolean a(djr $$0, fgc $$1, byf $$2, byr $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static fgw a(djn $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1);
      return !$$2.a(axn.aS) && (!($$2.b() instanceof dwq) || !$$2.c(dwq.b)) ? $$2.g($$0, $$1) : fgt.a();
   }

   public static double a(iw $$0, int $$1, Function<iw, fgw> $$2) {
      iw.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         fgw $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jc.a.b);
         }

         $$4++;
         $$3.c(jc.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static fgc a(bxn<?> $$0, djr $$1, iw $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((djn)$$1, $$2), () -> a((djn)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            fgc $$5 = fgc.a($$2, $$4);
            ffx $$6 = $$0.n().a($$5);

            for (fgw $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bxn.bT || !$$1.a_($$2).a(axn.cx) && !$$1.a_($$2.d()).a(axn.cx)) {
               return !$$1.E_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
