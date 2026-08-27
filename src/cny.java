import java.util.function.Function;
import javax.annotation.Nullable;

public class cny {
   public static int[][] a(it $$0) {
      it $$1 = $$0.h();
      it $$2 = $$1.g();
      it $$3 = $$0.g();
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

   public static boolean a(daj $$0, bsq $$1, euh $$2) {
      for (evf $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(daj $$0, eum $$1, bsq $$2, btc $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static evf a(daf $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      return !$$2.a(avx.aP) && (!($$2.b() instanceof dmn) || !$$2.c(dmn.b)) ? $$2.k($$0, $$1) : evc.a();
   }

   public static double a(io $$0, int $$1, Function<io, evf> $$2) {
      io.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         evf $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(it.a.b);
         }

         $$4++;
         $$3.c(it.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static eum a(bsc<?> $$0, daj $$1, io $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((daf)$$1, $$2), () -> a((daf)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            eum $$5 = eum.a($$2, $$4);
            euh $$6 = $$0.n().a($$5);

            for (evf $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bsc.by || !$$1.a_($$2).a(avx.cq) && !$$1.a_($$2.c()).a(avx.cq)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
