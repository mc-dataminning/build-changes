import com.google.common.annotations.VisibleForTesting;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bvd {
   private static final int a = 10;

   public static ht a(ate $$0, int $$1, int $$2) {
      int $$3 = $$0.a(2 * $$1 + 1) - $$1;
      int $$4 = $$0.a(2 * $$2 + 1) - $$2;
      int $$5 = $$0.a(2 * $$1 + 1) - $$1;
      return new ht($$3, $$4, $$5);
   }

   @Nullable
   public static ht a(ate $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      double $$7 = asy.d($$5, $$4) - (float) (Math.PI / 2);
      double $$8 = $$7 + (double)(2.0F * $$0.i() - 1.0F) * $$6;
      double $$9 = Math.sqrt($$0.j()) * (double)asy.g * (double)$$1;
      double $$10 = -$$9 * Math.sin($$8);
      double $$11 = $$9 * Math.cos($$8);
      if (!(Math.abs($$10) > (double)$$1) && !(Math.abs($$11) > (double)$$1)) {
         int $$12 = $$0.a(2 * $$2 + 1) - $$2 + $$3;
         return ht.a($$10, (double)$$12, $$11);
      } else {
         return null;
      }
   }

   @VisibleForTesting
   public static ht a(ht $$0, int $$1, Predicate<ht> $$2) {
      if (!$$2.test($$0)) {
         return $$0;
      } else {
         ht $$3 = $$0.c();

         while ($$3.v() < $$1 && $$2.test($$3)) {
            $$3 = $$3.c();
         }

         return $$3;
      }
   }

   @VisibleForTesting
   public static ht a(ht $$0, int $$1, int $$2, Predicate<ht> $$3) {
      if ($$1 < 0) {
         throw new IllegalArgumentException("aboveSolidAmount was " + $$1 + ", expected >= 0");
      } else if (!$$3.test($$0)) {
         return $$0;
      } else {
         ht $$4 = $$0.c();

         while ($$4.v() < $$2 && $$3.test($$4)) {
            $$4 = $$4.c();
         }

         ht $$5 = $$4;

         while ($$5.v() < $$2 && $$5.v() - $$4.v() < $$1) {
            ht $$6 = $$5.c();
            if ($$3.test($$6)) {
               break;
            }

            $$5 = $$6;
         }

         return $$5;
      }
   }

   @Nullable
   public static eif a(bks $$0, Supplier<ht> $$1) {
      return a($$1, $$0::h);
   }

   @Nullable
   public static eif a(Supplier<ht> $$0, ToDoubleFunction<ht> $$1) {
      double $$2 = Double.NEGATIVE_INFINITY;
      ht $$3 = null;

      for (int $$4 = 0; $$4 < 10; $$4++) {
         ht $$5 = $$0.get();
         if ($$5 != null) {
            double $$6 = $$1.applyAsDouble($$5);
            if ($$6 > $$2) {
               $$2 = $$6;
               $$3 = $$5;
            }
         }
      }

      return $$3 != null ? eif.c($$3) : null;
   }

   public static ht a(bks $$0, int $$1, ate $$2, ht $$3) {
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      if ($$0.fQ() && $$1 > 1) {
         ht $$6 = $$0.fN();
         if ($$0.dq() > (double)$$6.u()) {
            $$4 -= $$2.a($$1 / 2);
         } else {
            $$4 += $$2.a($$1 / 2);
         }

         if ($$0.dw() > (double)$$6.w()) {
            $$5 -= $$2.a($$1 / 2);
         } else {
            $$5 += $$2.a($$1 / 2);
         }
      }

      return ht.a((double)$$4 + $$0.dq(), (double)$$3.v() + $$0.ds(), (double)$$5 + $$0.dw());
   }
}
