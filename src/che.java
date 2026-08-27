import java.util.function.Function;
import javax.annotation.Nullable;

public class che {
   public static int[][] a(ic $$0) {
      ic $$1 = $$0.h();
      ic $$2 = $$1.g();
      ic $$3 = $$0.g();
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

   public static boolean a(csy $$0, bmk $$1, eln $$2) {
      for (eml $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.D_().a($$2);
   }

   public static boolean a(csy $$0, els $$1, bmk $$2, bmw $$3) {
      return a($$0, $$2, $$2.e($$3).c($$1));
   }

   public static eml a(csu $$0, hx $$1) {
      djg $$2 = $$0.a_($$1);
      return !$$2.a(asg.aO) && (!($$2.b() instanceof dfb) || !$$2.c(dfb.b)) ? $$2.k($$0, $$1) : emi.a();
   }

   public static double a(hx $$0, int $$1, Function<hx, eml> $$2) {
      hx.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         eml $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ic.a.b);
         }

         $$4++;
         $$3.c(ic.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static els a(bly<?> $$0, csy $$1, hx $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((csu)$$1, $$2), () -> a((csu)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            els $$5 = els.a($$2, $$4);
            eln $$6 = $$0.n().a($$5);

            for (eml $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bly.bv || !$$1.a_($$2).a(asg.ci) && !$$1.a_($$2.c()).a(asg.ci)) {
               return !$$1.D_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
