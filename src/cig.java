import com.google.common.annotations.VisibleForTesting;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cig {
   private static final int a = 10;

   public static iv a(azv $$0, int $$1, int $$2) {
      int $$3 = $$0.a(2 * $$1 + 1) - $$1;
      int $$4 = $$0.a(2 * $$2 + 1) - $$2;
      int $$5 = $$0.a(2 * $$1 + 1) - $$1;
      return new iv($$3, $$4, $$5);
   }

   @Nullable
   public static iv a(azv $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      double $$7 = azm.d($$5, $$4) - (float) (Math.PI / 2);
      double $$8 = $$7 + (double)(2.0F * $$0.i() - 1.0F) * $$6;
      double $$9 = Math.sqrt($$0.j()) * (double)azm.g * (double)$$1;
      double $$10 = -$$9 * Math.sin($$8);
      double $$11 = $$9 * Math.cos($$8);
      if (!(Math.abs($$10) > (double)$$1) && !(Math.abs($$11) > (double)$$1)) {
         int $$12 = $$0.a(2 * $$2 + 1) - $$2 + $$3;
         return iv.a($$10, (double)$$12, $$11);
      } else {
         return null;
      }
   }

   @VisibleForTesting
   public static iv a(iv $$0, int $$1, Predicate<iv> $$2) {
      if (!$$2.test($$0)) {
         return $$0;
      } else {
         iv.a $$3 = $$0.k().c(jb.b);

         while ($$3.v() <= $$1 && $$2.test($$3)) {
            $$3.c(jb.b);
         }

         return $$3.j();
      }
   }

   @VisibleForTesting
   public static iv a(iv $$0, int $$1, int $$2, Predicate<iv> $$3) {
      if ($$1 < 0) {
         throw new IllegalArgumentException("aboveSolidAmount was " + $$1 + ", expected >= 0");
      } else if (!$$3.test($$0)) {
         return $$0;
      } else {
         iv.a $$4 = $$0.k().c(jb.b);

         while ($$4.v() <= $$2 && $$3.test($$4)) {
            $$4.c(jb.b);
         }

         int $$5 = $$4.v();

         while ($$4.v() <= $$2 && $$4.v() - $$5 < $$1) {
            $$4.c(jb.b);
            if ($$3.test($$4)) {
               $$4.c(jb.a);
               break;
            }
         }

         return $$4.j();
      }
   }

   @Nullable
   public static fex a(bxr $$0, Supplier<iv> $$1) {
      return a($$1, $$0::c);
   }

   @Nullable
   public static fex a(Supplier<iv> $$0, ToDoubleFunction<iv> $$1) {
      double $$2 = Double.NEGATIVE_INFINITY;
      iv $$3 = null;

      for (int $$4 = 0; $$4 < 10; $$4++) {
         iv $$5 = $$0.get();
         if ($$5 != null) {
            double $$6 = $$1.applyAsDouble($$5);
            if ($$6 > $$2) {
               $$2 = $$6;
               $$3 = $$5;
            }
         }
      }

      return $$3 != null ? fex.c($$3) : null;
   }

   public static iv a(bxr $$0, int $$1, azv $$2, iv $$3) {
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      if ($$0.gh() && $$1 > 1) {
         iv $$6 = $$0.ge();
         if ($$0.dz() > (double)$$6.u()) {
            $$4 -= $$2.a($$1 / 2);
         } else {
            $$4 += $$2.a($$1 / 2);
         }

         if ($$0.dF() > (double)$$6.w()) {
            $$5 -= $$2.a($$1 / 2);
         } else {
            $$5 += $$2.a($$1 / 2);
         }
      }

      return iv.a((double)$$4 + $$0.dz(), (double)$$3.v() + $$0.dB(), (double)$$5 + $$0.dF());
   }
}
