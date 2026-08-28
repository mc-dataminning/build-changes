import java.util.function.Function;
import javax.annotation.Nullable;

public class col {
   public static int[][] a(jf $$0) {
      jf $$1 = $$0.h();
      jf $$2 = $$1.g();
      jf $$3 = $$0.g();
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

   public static boolean a(dbq $$0, btc $$1, ewc $$2) {
      for (exa $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(dbq $$0, ewh $$1, btc $$2, bto $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static exa a(dbm $$0, ja $$1) {
      dsl $$2 = $$0.a_($$1);
      return !$$2.a(avw.aP) && (!($$2.b() instanceof dnv) || !$$2.c(dnv.b)) ? $$2.k($$0, $$1) : ewx.a();
   }

   public static double a(ja $$0, int $$1, Function<ja, exa> $$2) {
      ja.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         exa $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jf.a.b);
         }

         $$4++;
         $$3.c(jf.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ewh a(bsn<?> $$0, dbq $$1, ja $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dbm)$$1, $$2), () -> a((dbm)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            ewh $$5 = ewh.a($$2, $$4);
            ewc $$6 = $$0.n().a($$5);

            for (exa $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bsn.by || !$$1.a_($$2).a(avw.cq) && !$$1.a_($$2.c()).a(avw.cq)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
