import java.util.function.Function;
import javax.annotation.Nullable;

public class cuq {
   public static int[][] a(jb $$0) {
      jb $$1 = $$0.h();
      jb $$2 = $$1.g();
      jb $$3 = $$0.g();
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

   public static boolean a(djf $$0, bxu $$1, ffl $$2) {
      for (fgk $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.E_().a($$2);
   }

   public static boolean a(djf $$0, ffq $$1, bxu $$2, byg $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static fgk a(djb $$0, iv $$1) {
      ebe $$2 = $$0.a_($$1);
      return !$$2.a(axe.aS) && (!($$2.b() instanceof dwe) || !$$2.c(dwe.b)) ? $$2.g($$0, $$1) : fgh.a();
   }

   public static double a(iv $$0, int $$1, Function<iv, fgk> $$2) {
      iv.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         fgk $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jb.a.b);
         }

         $$4++;
         $$3.c(jb.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ffq a(bxc<?> $$0, djf $$1, iv $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((djb)$$1, $$2), () -> a((djb)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            ffq $$5 = ffq.a($$2, $$4);
            ffl $$6 = $$0.n().a($$5);

            for (fgk $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bxc.bT || !$$1.a_($$2).a(axe.cx) && !$$1.a_($$2.d()).a(axe.cx)) {
               return !$$1.E_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
