import com.google.common.annotations.VisibleForTesting;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cen {
   private static final int a = 10;

   public static jd a(ayw $$0, int $$1, int $$2) {
      int $$3 = $$0.a(2 * $$1 + 1) - $$1;
      int $$4 = $$0.a(2 * $$2 + 1) - $$2;
      int $$5 = $$0.a(2 * $$1 + 1) - $$1;
      return new jd($$3, $$4, $$5);
   }

   @Nullable
   public static jd a(ayw $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      double $$7 = ayo.d($$5, $$4) - (float) (Math.PI / 2);
      double $$8 = $$7 + (double)(2.0F * $$0.i() - 1.0F) * $$6;
      double $$9 = Math.sqrt($$0.j()) * (double)ayo.g * (double)$$1;
      double $$10 = -$$9 * Math.sin($$8);
      double $$11 = $$9 * Math.cos($$8);
      if (!(Math.abs($$10) > (double)$$1) && !(Math.abs($$11) > (double)$$1)) {
         int $$12 = $$0.a(2 * $$2 + 1) - $$2 + $$3;
         return jd.a($$10, (double)$$12, $$11);
      } else {
         return null;
      }
   }

   @VisibleForTesting
   public static jd a(jd $$0, int $$1, Predicate<jd> $$2) {
      if (!$$2.test($$0)) {
         return $$0;
      } else {
         jd $$3 = $$0.d();

         while ($$3.v() < $$1 && $$2.test($$3)) {
            $$3 = $$3.d();
         }

         return $$3;
      }
   }

   @VisibleForTesting
   public static jd a(jd $$0, int $$1, int $$2, Predicate<jd> $$3) {
      if ($$1 < 0) {
         throw new IllegalArgumentException("aboveSolidAmount was " + $$1 + ", expected >= 0");
      } else if (!$$3.test($$0)) {
         return $$0;
      } else {
         jd $$4 = $$0.d();

         while ($$4.v() < $$2 && $$3.test($$4)) {
            $$4 = $$4.d();
         }

         jd $$5 = $$4;

         while ($$5.v() < $$2 && $$5.v() - $$4.v() < $$1) {
            jd $$6 = $$5.d();
            if ($$3.test($$6)) {
               break;
            }

            $$5 = $$6;
         }

         return $$5;
      }
   }

   @Nullable
   public static exc a(btw $$0, Supplier<jd> $$1) {
      return a($$1, $$0::c);
   }

   @Nullable
   public static exc a(Supplier<jd> $$0, ToDoubleFunction<jd> $$1) {
      double $$2 = Double.NEGATIVE_INFINITY;
      jd $$3 = null;

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jd $$5 = $$0.get();
         if ($$5 != null) {
            double $$6 = $$1.applyAsDouble($$5);
            if ($$6 > $$2) {
               $$2 = $$6;
               $$3 = $$5;
            }
         }
      }

      return $$3 != null ? exc.c($$3) : null;
   }

   public static jd a(btw $$0, int $$1, ayw $$2, jd $$3) {
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      if ($$0.fY() && $$1 > 1) {
         jd $$6 = $$0.fV();
         if ($$0.dt() > (double)$$6.u()) {
            $$4 -= $$2.a($$1 / 2);
         } else {
            $$4 += $$2.a($$1 / 2);
         }

         if ($$0.dz() > (double)$$6.w()) {
            $$5 -= $$2.a($$1 / 2);
         } else {
            $$5 += $$2.a($$1 / 2);
         }
      }

      return jd.a((double)$$4 + $$0.dt(), (double)$$3.v() + $$0.dv(), (double)$$5 + $$0.dz());
   }
}
