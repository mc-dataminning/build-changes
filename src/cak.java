import java.util.function.Function;
import javax.annotation.Nullable;

public class cak {
   public static int[][] a(ha $$0) {
      ha $$1 = $$0.h();
      ha $$2 = $$1.g();
      ha $$3 = $$0.g();
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

   public static boolean a(clw $$0, bfz $$1, eed $$2) {
      for (efb $$4 : $$0.d($$1, $$2)) {
         if (!$$4.b()) {
            return false;
         }
      }

      return $$0.w_().a($$2);
   }

   public static boolean a(clw $$0, eei $$1, bfz $$2, bgl $$3) {
      return a($$0, $$2, $$2.g($$3).c($$1));
   }

   public static efb a(cls $$0, gu $$1) {
      dcb $$2 = $$0.a_($$1);
      return !$$2.a(amw.aN) && (!($$2.b() instanceof cya) || !$$2.c(cya.a)) ? $$2.k($$0, $$1) : eey.a();
   }

   public static double a(gu $$0, int $$1, Function<gu, efb> $$2) {
      gu.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         efb $$5 = $$2.apply($$3);
         if (!$$5.b()) {
            return (double)($$0.v() + $$4) + $$5.b(ha.a.b);
         }

         $$4++;
         $$3.c(ha.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static eei a(bfn<?> $$0, clw $$1, gu $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cls)$$1, $$2), () -> a((cls)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            eei $$5 = eei.a($$2, $$4);
            eed $$6 = $$0.n().a($$5);

            for (efb $$8 : $$1.d(null, $$6)) {
               if (!$$8.b()) {
                  return null;
               }
            }

            if ($$0 != bfn.bt || !$$1.a_($$2).a(amw.cg) && !$$1.a_($$2.c()).a(amw.cg)) {
               return !$$1.w_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
