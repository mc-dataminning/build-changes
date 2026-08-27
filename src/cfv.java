import java.util.function.Function;
import javax.annotation.Nullable;

public class cfv {
   public static int[][] a(ib $$0) {
      ib $$1 = $$0.h();
      ib $$2 = $$1.g();
      ib $$3 = $$0.g();
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

   public static boolean a(crp $$0, bll $$1, eju $$2) {
      for (eks $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.D_().a($$2);
   }

   public static boolean a(crp $$0, ejz $$1, bll $$2, blx $$3) {
      return a($$0, $$2, $$2.e($$3).c($$1));
   }

   public static eks a(crl $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1);
      return !$$2.a(ark.aO) && (!($$2.b() instanceof ddr) || !$$2.c(ddr.b)) ? $$2.k($$0, $$1) : ekp.a();
   }

   public static double a(hx $$0, int $$1, Function<hx, eks> $$2) {
      hx.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         eks $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ib.a.b);
         }

         $$4++;
         $$3.c(ib.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ejz a(bkz<?> $$0, crp $$1, hx $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((crl)$$1, $$2), () -> a((crl)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            ejz $$5 = ejz.a($$2, $$4);
            eju $$6 = $$0.n().a($$5);

            for (eks $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bkz.bt || !$$1.a_($$2).a(ark.ci) && !$$1.a_($$2.c()).a(ark.ci)) {
               return !$$1.D_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
