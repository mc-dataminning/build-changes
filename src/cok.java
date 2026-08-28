import java.util.function.Function;
import javax.annotation.Nullable;

public class cok {
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

   public static boolean a(dbp $$0, btb $$1, ewa $$2) {
      for (ewy $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(dbp $$0, ewf $$1, btb $$2, btn $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static ewy a(dbl $$0, ja $$1) {
      dsk $$2 = $$0.a_($$1);
      return !$$2.a(avw.aP) && (!($$2.b() instanceof dnu) || !$$2.c(dnu.b)) ? $$2.k($$0, $$1) : ewv.a();
   }

   public static double a(ja $$0, int $$1, Function<ja, ewy> $$2) {
      ja.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         ewy $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jf.a.b);
         }

         $$4++;
         $$3.c(jf.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ewf a(bsm<?> $$0, dbp $$1, ja $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dbl)$$1, $$2), () -> a((dbl)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            ewf $$5 = ewf.a($$2, $$4);
            ewa $$6 = $$0.n().a($$5);

            for (ewy $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bsm.by || !$$1.a_($$2).a(avw.cq) && !$$1.a_($$2.c()).a(avw.cq)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
