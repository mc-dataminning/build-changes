import java.util.function.Function;
import javax.annotation.Nullable;

public class coz {
   public static int[][] a(je $$0) {
      je $$1 = $$0.h();
      je $$2 = $$1.g();
      je $$3 = $$0.g();
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

   public static boolean a(dbj $$0, btq $$1, evn $$2) {
      for (ewl $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(dbj $$0, evs $$1, btq $$2, buc $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static ewl a(dbf $$0, iz $$1) {
      dsd $$2 = $$0.a_($$1);
      return !$$2.a(awp.aP) && (!($$2.b() instanceof dnn) || !$$2.c(dnn.b)) ? $$2.k($$0, $$1) : ewi.a();
   }

   public static double a(iz $$0, int $$1, Function<iz, ewl> $$2) {
      iz.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         ewl $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(je.a.b);
         }

         $$4++;
         $$3.c(je.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static evs a(btb<?> $$0, dbj $$1, iz $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dbf)$$1, $$2), () -> a((dbf)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            evs $$5 = evs.a($$2, $$4);
            evn $$6 = $$0.n().a($$5);

            for (ewl $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != btb.by || !$$1.a_($$2).a(awp.cq) && !$$1.a_($$2.c()).a(awp.cq)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
