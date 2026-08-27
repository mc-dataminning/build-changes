import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cce {
   public static ehd a(big $$0, Predicate<big> $$1) {
      ehf $$2 = $$0.dn();
      cpk $$3 = $$0.dK();
      ehf $$4 = $$0.di();
      return a($$4, $$0, $$1, $$2, $$3);
   }

   public static ehd a(big $$0, Predicate<big> $$1, double $$2) {
      ehf $$3 = $$0.f(0.0F).a($$2);
      cpk $$4 = $$0.dK();
      ehf $$5 = $$0.bp();
      return a($$5, $$0, $$1, $$3, $$4);
   }

   private static ehd a(ehf $$0, big $$1, Predicate<big> $$2, ehf $$3, cpk $$4) {
      ehf $$5 = $$0.e($$3);
      ehd $$6 = $$4.a(new cot($$0, $$5, cot.a.a, cot.b.a, $$1));
      if ($$6.c() != ehd.a.a) {
         $$5 = $$6.e();
      }

      ehd $$7 = a($$4, $$1, $$0, $$5, $$1.cG().b($$3).g(1.0), $$2);
      if ($$7 != null) {
         $$6 = $$7;
      }

      return $$6;
   }

   @Nullable
   public static ehc a(big $$0, ehf $$1, ehf $$2, eha $$3, Predicate<big> $$4, double $$5) {
      cpk $$6 = $$0.dK();
      double $$7 = $$5;
      big $$8 = null;
      ehf $$9 = null;

      for (big $$10 : $$6.a($$0, $$3, $$4)) {
         eha $$11 = $$10.cG().g((double)$$10.bD());
         Optional<ehf> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ehf $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.cV() == $$0.cV()) {
                  if ($$7 == 0.0) {
                     $$8 = $$10;
                     $$9 = $$13;
                  }
               } else {
                  $$8 = $$10;
                  $$9 = $$13;
                  $$7 = $$14;
               }
            }
         }
      }

      return $$8 == null ? null : new ehc($$8, $$9);
   }

   @Nullable
   public static ehc a(cpk $$0, big $$1, ehf $$2, ehf $$3, eha $$4, Predicate<big> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ehc a(cpk $$0, big $$1, ehf $$2, ehf $$3, eha $$4, Predicate<big> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      big $$8 = null;

      for (big $$9 : $$0.a($$1, $$4, $$5)) {
         eha $$10 = $$9.cG().g((double)$$6);
         Optional<ehf> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new ehc($$8);
   }

   public static void a(big $$0, float $$1) {
      ehf $$2 = $$0.dn();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(aro.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(aro.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dC() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dC() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dA() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dA() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.s(aro.i($$1, $$0.O, $$0.dC()));
         $$0.r(aro.i($$1, $$0.N, $$0.dA()));
      }
   }

   public static bgn a(biw $$0, cir $$1) {
      return $$0.eR().a($$1) ? bgn.a : bgn.b;
   }

   public static cbr a(biw $$0, ciw $$1, float $$2) {
      cgk $$3 = (cgk)($$1.d() instanceof cgk ? $$1.d() : ciz.nH);
      cbr $$4 = $$3.a($$0.dK(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(ciz.uw) && $$4 instanceof cbt) {
         ((cbt)$$4).a($$1);
      }

      return $$4;
   }
}
