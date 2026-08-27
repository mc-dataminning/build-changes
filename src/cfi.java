import java.util.function.Function;
import javax.annotation.Nullable;

public class cfi {
   public static int[][] a(hx $$0) {
      hx $$1 = $$0.h();
      hx $$2 = $$1.g();
      hx $$3 = $$0.g();
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

   public static boolean a(crc $$0, bky $$1, ejd $$2) {
      for (ekb $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(crc $$0, eji $$1, bky $$2, blk $$3) {
      return a($$0, $$2, $$2.e($$3).c($$1));
   }

   public static ekb a(cqy $$0, ht $$1) {
      dgw $$2 = $$0.a_($$1);
      return !$$2.a(arc.aO) && (!($$2.b() instanceof dde) || !$$2.c(dde.b)) ? $$2.k($$0, $$1) : ejy.a();
   }

   public static double a(ht $$0, int $$1, Function<ht, ekb> $$2) {
      ht.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         ekb $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(hx.a.b);
         }

         $$4++;
         $$3.c(hx.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static eji a(bkm<?> $$0, crc $$1, ht $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cqy)$$1, $$2), () -> a((cqy)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            eji $$5 = eji.a($$2, $$4);
            ejd $$6 = $$0.n().a($$5);

            for (ekb $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bkm.bt || !$$1.a_($$2).a(arc.ci) && !$$1.a_($$2.c()).a(arc.ci)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
