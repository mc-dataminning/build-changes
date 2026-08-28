import java.util.function.Function;
import javax.annotation.Nullable;

public class cot {
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

   public static boolean a(dbd $$0, btk $$1, evh $$2) {
      for (ewf $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(dbd $$0, evm $$1, btk $$2, btw $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static ewf a(daz $$0, iz $$1) {
      drx $$2 = $$0.a_($$1);
      return !$$2.a(awl.aP) && (!($$2.b() instanceof dnh) || !$$2.c(dnh.b)) ? $$2.k($$0, $$1) : ewc.a();
   }

   public static double a(iz $$0, int $$1, Function<iz, ewf> $$2) {
      iz.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         ewf $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(je.a.b);
         }

         $$4++;
         $$3.c(je.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static evm a(bsv<?> $$0, dbd $$1, iz $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((daz)$$1, $$2), () -> a((daz)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            evm $$5 = evm.a($$2, $$4);
            evh $$6 = $$0.n().a($$5);

            for (ewf $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bsv.by || !$$1.a_($$2).a(awl.cq) && !$$1.a_($$2.c()).a(awl.cq)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
