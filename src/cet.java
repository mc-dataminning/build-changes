import java.util.function.Function;
import javax.annotation.Nullable;

public class cet {
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

   public static boolean a(cqj $$0, bkj $$1, eia $$2) {
      for (eiy $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(cqj $$0, eif $$1, bkj $$2, bkv $$3) {
      return a($$0, $$2, $$2.e($$3).c($$1));
   }

   public static eiy a(cqf $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1);
      return !$$2.a(aqs.aO) && (!($$2.b() instanceof dck) || !$$2.c(dck.b)) ? $$2.k($$0, $$1) : eiv.a();
   }

   public static double a(ht $$0, int $$1, Function<ht, eiy> $$2) {
      ht.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         eiy $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(hx.a.b);
         }

         $$4++;
         $$3.c(hx.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static eif a(bjx<?> $$0, cqj $$1, ht $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cqf)$$1, $$2), () -> a((cqf)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            eif $$5 = eif.a($$2, $$4);
            eia $$6 = $$0.n().a($$5);

            for (eiy $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bjx.bt || !$$1.a_($$2).a(aqs.ci) && !$$1.a_($$2.c()).a(aqs.ci)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
