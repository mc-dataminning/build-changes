import java.util.function.Function;
import javax.annotation.Nullable;

public class cus {
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

   public static boolean a(djh $$0, bxw $$1, ffn $$2) {
      for (fgm $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.E_().a($$2);
   }

   public static boolean a(djh $$0, ffs $$1, bxw $$2, byi $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static fgm a(djd $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1);
      return !$$2.a(axg.aS) && (!($$2.b() instanceof dwg) || !$$2.c(dwg.b)) ? $$2.g($$0, $$1) : fgj.a();
   }

   public static double a(iw $$0, int $$1, Function<iw, fgm> $$2) {
      iw.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         fgm $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jc.a.b);
         }

         $$4++;
         $$3.c(jc.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ffs a(bxe<?> $$0, djh $$1, iw $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((djd)$$1, $$2), () -> a((djd)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            ffs $$5 = ffs.a($$2, $$4);
            ffn $$6 = $$0.n().a($$5);

            for (fgm $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bxe.bT || !$$1.a_($$2).a(axg.cx) && !$$1.a_($$2.d()).a(axg.cx)) {
               return !$$1.E_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
