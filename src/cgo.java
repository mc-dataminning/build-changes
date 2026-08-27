import java.util.function.Function;
import javax.annotation.Nullable;

public class cgo {
   public static int[][] a(ia $$0) {
      ia $$1 = $$0.h();
      ia $$2 = $$1.g();
      ia $$3 = $$0.g();
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

   public static boolean a(csi $$0, blv $$1, ekw $$2) {
      for (elu $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.D_().a($$2);
   }

   public static boolean a(csi $$0, elb $$1, blv $$2, bmh $$3) {
      return a($$0, $$2, $$2.e($$3).c($$1));
   }

   public static elu a(cse $$0, hv $$1) {
      dip $$2 = $$0.a_($$1);
      return !$$2.a(arr.aO) && (!($$2.b() instanceof del) || !$$2.c(del.b)) ? $$2.k($$0, $$1) : elr.a();
   }

   public static double a(hv $$0, int $$1, Function<hv, elu> $$2) {
      hv.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         elu $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ia.a.b);
         }

         $$4++;
         $$3.c(ia.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static elb a(blj<?> $$0, csi $$1, hv $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cse)$$1, $$2), () -> a((cse)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            elb $$5 = elb.a($$2, $$4);
            ekw $$6 = $$0.n().a($$5);

            for (elu $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != blj.bv || !$$1.a_($$2).a(arr.ci) && !$$1.a_($$2.c()).a(arr.ci)) {
               return !$$1.D_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
