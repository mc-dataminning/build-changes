import java.util.function.Function;
import javax.annotation.Nullable;

public class coh {
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

   public static boolean a(dbn $$0, bsy $$1, evu $$2) {
      for (ews $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.C_().a($$2);
   }

   public static boolean a(dbn $$0, evz $$1, bsy $$2, btk $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static ews a(dbj $$0, ja $$1) {
      dsh $$2 = $$0.a_($$1);
      return !$$2.a(avu.aP) && (!($$2.b() instanceof dns) || !$$2.c(dns.b)) ? $$2.k($$0, $$1) : ewp.a();
   }

   public static double a(ja $$0, int $$1, Function<ja, ews> $$2) {
      ja.a $$3 = $$0.j();
      int $$4 = 0;

      while ($$4 < $$1) {
         ews $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return (double)($$0.v() + $$4) + $$5.b(jf.a.b);
         }

         $$4++;
         $$3.c(jf.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static evz a(bsj<?> $$0, dbn $$1, ja $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dbj)$$1, $$2), () -> a((dbj)$$1, $$2.d()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
         } else {
            evz $$5 = evz.a($$2, $$4);
            evu $$6 = $$0.n().a($$5);

            for (ews $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bsj.by || !$$1.a_($$2).a(avu.cq) && !$$1.a_($$2.c()).a(avu.cq)) {
               return !$$1.C_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
