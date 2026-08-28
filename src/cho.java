import com.google.common.annotations.VisibleForTesting;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cho {
   private static final int a = 10;

   public static jj a(azs $$0, int $$1, int $$2) {
      int $$3 = $$0.a(2 * $$1 + 1) - $$1;
      int $$4 = $$0.a(2 * $$2 + 1) - $$2;
      int $$5 = $$0.a(2 * $$1 + 1) - $$1;
      return new jj($$3, $$4, $$5);
   }

   @Nullable
   public static jj a(azs $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      double $$7 = azk.d($$5, $$4) - (float) (Math.PI / 2);
      double $$8 = $$7 + (double)(2.0F * $$0.i() - 1.0F) * $$6;
      double $$9 = Math.sqrt($$0.j()) * (double)azk.g * (double)$$1;
      double $$10 = -$$9 * Math.sin($$8);
      double $$11 = $$9 * Math.cos($$8);
      if (!(Math.abs($$10) > (double)$$1) && !(Math.abs($$11) > (double)$$1)) {
         int $$12 = $$0.a(2 * $$2 + 1) - $$2 + $$3;
         return jj.a($$10, (double)$$12, $$11);
      } else {
         return null;
      }
   }

   @VisibleForTesting
   public static jj a(jj $$0, int $$1, Predicate<jj> $$2) {
      if (!$$2.test($$0)) {
         return $$0;
      } else {
         jj.a $$3 = $$0.k().c(jo.b);

         while ($$3.v() <= $$1 && $$2.test($$3)) {
            $$3.c(jo.b);
         }

         return $$3.j();
      }
   }

   @VisibleForTesting
   public static jj a(jj $$0, int $$1, int $$2, Predicate<jj> $$3) {
      if ($$1 < 0) {
         throw new IllegalArgumentException("aboveSolidAmount was " + $$1 + ", expected >= 0");
      } else if (!$$3.test($$0)) {
         return $$0;
      } else {
         jj.a $$4 = $$0.k().c(jo.b);

         while ($$4.v() <= $$2 && $$3.test($$4)) {
            $$4.c(jo.b);
         }

         int $$5 = $$4.v();

         while ($$4.v() <= $$2 && $$4.v() - $$5 < $$1) {
            $$4.c(jo.b);
            if ($$3.test($$4)) {
               $$4.c(jo.a);
               break;
            }
         }

         return $$4.j();
      }
   }

   @Nullable
   public static fcu a(bwz $$0, Supplier<jj> $$1) {
      return a($$1, $$0::c);
   }

   @Nullable
   public static fcu a(Supplier<jj> $$0, ToDoubleFunction<jj> $$1) {
      double $$2 = Double.NEGATIVE_INFINITY;
      jj $$3 = null;

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jj $$5 = $$0.get();
         if ($$5 != null) {
            double $$6 = $$1.applyAsDouble($$5);
            if ($$6 > $$2) {
               $$2 = $$6;
               $$3 = $$5;
            }
         }
      }

      return $$3 != null ? fcu.c($$3) : null;
   }

   public static jj a(bwz $$0, int $$1, azs $$2, jj $$3) {
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      if ($$0.ge() && $$1 > 1) {
         jj $$6 = $$0.gb();
         if ($$0.dA() > (double)$$6.u()) {
            $$4 -= $$2.a($$1 / 2);
         } else {
            $$4 += $$2.a($$1 / 2);
         }

         if ($$0.dG() > (double)$$6.w()) {
            $$5 -= $$2.a($$1 / 2);
         } else {
            $$5 += $$2.a($$1 / 2);
         }
      }

      return jj.a((double)$$4 + $$0.dA(), (double)$$3.v() + $$0.dC(), (double)$$5 + $$0.dG());
   }
}
