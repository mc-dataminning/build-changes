import java.util.function.Function;
import javax.annotation.Nullable;

public class cma {
   public static int[][] a(ij $$0) {
      ij $$1 = $$0.h();
      ij $$2 = $$1.g();
      ij $$3 = $$0.g();
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

   public static boolean a(cyq $$0, bqt $$1, ese $$2) {
      for (etc $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(cyq $$0, esj $$1, bqt $$2, bre $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static etc a(cym $$0, id $$1) {
      dpi $$2 = $$0.a_($$1);
      return !$$2.a(ave.aP) && (!($$2.b() instanceof dkt) || !$$2.c(dkt.b)) ? $$2.k($$0, $$1) : esz.a();
   }

   public static double a(id $$0, int $$1, Function<id, etc> $$2) {
      id.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         etc $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ij.a.b);
         }

         $$4++;
         $$3.c(ij.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static esj a(bqg<?> $$0, cyq $$1, id $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cym)$$1, $$2), () -> a((cym)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            esj $$5 = esj.a($$2, $$4);
            ese $$6 = $$0.n().a($$5);

            for (etc $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bqg.bx || !$$1.a_($$2).a(ave.ck) && !$$1.a_($$2.c()).a(ave.ck)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
