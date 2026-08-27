import java.util.function.Function;
import javax.annotation.Nullable;

public class cdq {
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

   public static boolean a(cpf $$0, bjg $$1, ehi $$2) {
      for (eig $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.B_().a($$2);
   }

   public static boolean a(cpf $$0, ehn $$1, bjg $$2, bjs $$3) {
      return a($$0, $$2, $$2.e($$3).c($$1));
   }

   public static eig a(cpb $$0, gw $$1) {
      dfj $$2 = $$0.a_($$1);
      return !$$2.a(aps.aO) && (!($$2.b() instanceof dbi) || !$$2.c(dbi.a)) ? $$2.k($$0, $$1) : eid.a();
   }

   public static double a(gw $$0, int $$1, Function<gw, eig> $$2) {
      gw.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         eig $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ha.a.b);
         }

         $$4++;
         $$3.c(ha.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ehn a(biu<?> $$0, cpf $$1, gw $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cpb)$$1, $$2), () -> a((cpb)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            ehn $$5 = ehn.a($$2, $$4);
            ehi $$6 = $$0.n().a($$5);

            for (eig $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != biu.bt || !$$1.a_($$2).a(aps.ci) && !$$1.a_($$2.c()).a(aps.ci)) {
               return !$$1.B_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
