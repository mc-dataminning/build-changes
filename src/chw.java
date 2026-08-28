import com.google.common.annotations.VisibleForTesting;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class chw {
   private static final int a = 10;

   public static iu a(azt $$0, int $$1, int $$2) {
      int $$3 = $$0.a(2 * $$1 + 1) - $$1;
      int $$4 = $$0.a(2 * $$2 + 1) - $$2;
      int $$5 = $$0.a(2 * $$1 + 1) - $$1;
      return new iu($$3, $$4, $$5);
   }

   @Nullable
   public static iu a(azt $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      double $$7 = azk.d($$5, $$4) - (float) (Math.PI / 2);
      double $$8 = $$7 + (double)(2.0F * $$0.i() - 1.0F) * $$6;
      double $$9 = Math.sqrt($$0.j()) * (double)azk.g * (double)$$1;
      double $$10 = -$$9 * Math.sin($$8);
      double $$11 = $$9 * Math.cos($$8);
      if (!(Math.abs($$10) > (double)$$1) && !(Math.abs($$11) > (double)$$1)) {
         int $$12 = $$0.a(2 * $$2 + 1) - $$2 + $$3;
         return iu.a($$10, (double)$$12, $$11);
      } else {
         return null;
      }
   }

   @VisibleForTesting
   public static iu a(iu $$0, int $$1, Predicate<iu> $$2) {
      if (!$$2.test($$0)) {
         return $$0;
      } else {
         iu.a $$3 = $$0.k().c(ja.b);

         while ($$3.v() <= $$1 && $$2.test($$3)) {
            $$3.c(ja.b);
         }

         return $$3.j();
      }
   }

   @VisibleForTesting
   public static iu a(iu $$0, int $$1, int $$2, Predicate<iu> $$3) {
      if ($$1 < 0) {
         throw new IllegalArgumentException("aboveSolidAmount was " + $$1 + ", expected >= 0");
      } else if (!$$3.test($$0)) {
         return $$0;
      } else {
         iu.a $$4 = $$0.k().c(ja.b);

         while ($$4.v() <= $$2 && $$3.test($$4)) {
            $$4.c(ja.b);
         }

         int $$5 = $$4.v();

         while ($$4.v() <= $$2 && $$4.v() - $$5 < $$1) {
            $$4.c(ja.b);
            if ($$3.test($$4)) {
               $$4.c(ja.a);
               break;
            }
         }

         return $$4.j();
      }
   }

   @Nullable
   public static fdw a(bxh $$0, Supplier<iu> $$1) {
      return a($$1, $$0::c);
   }

   @Nullable
   public static fdw a(Supplier<iu> $$0, ToDoubleFunction<iu> $$1) {
      double $$2 = Double.NEGATIVE_INFINITY;
      iu $$3 = null;

      for (int $$4 = 0; $$4 < 10; $$4++) {
         iu $$5 = $$0.get();
         if ($$5 != null) {
            double $$6 = $$1.applyAsDouble($$5);
            if ($$6 > $$2) {
               $$2 = $$6;
               $$3 = $$5;
            }
         }
      }

      return $$3 != null ? fdw.c($$3) : null;
   }

   public static iu a(bxh $$0, int $$1, azt $$2, iu $$3) {
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      if ($$0.ge() && $$1 > 1) {
         iu $$6 = $$0.gb();
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

      return iu.a((double)$$4 + $$0.dA(), (double)$$3.v() + $$0.dC(), (double)$$5 + $$0.dG());
   }
}
