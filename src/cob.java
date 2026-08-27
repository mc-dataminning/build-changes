import java.util.function.Function;
import javax.annotation.Nullable;

public class cob {
   public static int[][] a(iw $$0) {
      iw $$1 = $$0.h();
      iw $$2 = $$1.g();
      iw $$3 = $$0.g();
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

   public static boolean a(dbk $$0, bso $$1, ewp $$2) {
      for (exn $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.D_().a($$2);
   }

   public static boolean a(dbk $$0, ewu $$1, bso $$2, bsz $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static exn a(dbg $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      return !$$2.a(awe.aR) && (!($$2.b() instanceof doe) || !$$2.c(doe.b)) ? $$2.k($$0, $$1) : exk.a();
   }

   public static double a(ir $$0, int $$1, Function<ir, exn> $$2) {
      ir.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         exn $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(iw.a.b);
         }

         $$4++;
         $$3.d(iw.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ewu a(bsb<?> $$0, dbk $$1, ir $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dbg)$$1, $$2), () -> a((dbg)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            ewu $$5 = ewu.a($$2, $$4);
            ewp $$6 = $$0.n().a($$5);

            for (exn $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bsb.bE || !$$1.a_($$2).a(awe.ct) && !$$1.a_($$2.c()).a(awe.ct)) {
               return !$$1.D_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
