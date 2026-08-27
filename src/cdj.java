import java.util.function.Function;
import javax.annotation.Nullable;

public class cdj {
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

   public static boolean a(cow $$0, biy $$1, egz $$2) {
      for (ehx $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.w_().a($$2);
   }

   public static boolean a(cow $$0, ehe $$1, biy $$2, bjk $$3) {
      return a($$0, $$2, $$2.e($$3).c($$1));
   }

   public static ehx a(cos $$0, gu $$1) {
      dfa $$2 = $$0.a_($$1);
      return !$$2.a(apl.aO) && (!($$2.b() instanceof daz) || !$$2.c(daz.a)) ? $$2.k($$0, $$1) : ehu.a();
   }

   public static double a(gu $$0, int $$1, Function<gu, ehx> $$2) {
      gu.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         ehx $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(ha.a.b);
         }

         $$4++;
         $$3.c(ha.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static ehe a(bim<?> $$0, cow $$1, gu $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((cos)$$1, $$2), () -> a((cos)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            ehe $$5 = ehe.a($$2, $$4);
            egz $$6 = $$0.n().a($$5);

            for (ehx $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bim.bt || !$$1.a_($$2).a(apl.ci) && !$$1.a_($$2.c()).a(apl.ci)) {
               return !$$1.w_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
