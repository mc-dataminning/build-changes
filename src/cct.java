import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cct {
   public static ehf a(biw $$0, Predicate<biw> $$1) {
      ehh $$2 = $$0.do();
      cqb $$3 = $$0.dL();
      ehh $$4 = $$0.dj();
      return a($$4, $$0, $$1, $$2, $$3);
   }

   public static ehf a(biw $$0, Predicate<biw> $$1, double $$2) {
      ehh $$3 = $$0.f(0.0F).a($$2);
      cqb $$4 = $$0.dL();
      ehh $$5 = $$0.bp();
      return a($$5, $$0, $$1, $$3, $$4);
   }

   private static ehf a(ehh $$0, biw $$1, Predicate<biw> $$2, ehh $$3, cqb $$4) {
      ehh $$5 = $$0.e($$3);
      ehf $$6 = $$4.a(new cpk($$0, $$5, cpk.a.a, cpk.b.a, $$1));
      if ($$6.c() != ehf.a.a) {
         $$5 = $$6.e();
      }

      ehf $$7 = a($$4, $$1, $$0, $$5, $$1.cG().b($$3).g(1.0), $$2);
      if ($$7 != null) {
         $$6 = $$7;
      }

      return $$6;
   }

   @Nullable
   public static ehe a(biw $$0, ehh $$1, ehh $$2, ehc $$3, Predicate<biw> $$4, double $$5) {
      cqb $$6 = $$0.dL();
      double $$7 = $$5;
      biw $$8 = null;
      ehh $$9 = null;

      for (biw $$10 : $$6.a($$0, $$3, $$4)) {
         ehc $$11 = $$10.cG().g((double)$$10.bD());
         Optional<ehh> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ehh $$13 = $$12.get();
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

      return $$8 == null ? null : new ehe($$8, $$9);
   }

   @Nullable
   public static ehe a(cqb $$0, biw $$1, ehh $$2, ehh $$3, ehc $$4, Predicate<biw> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ehe a(cqb $$0, biw $$1, ehh $$2, ehh $$3, ehc $$4, Predicate<biw> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      biw $$8 = null;

      for (biw $$9 : $$0.a($$1, $$4, $$5)) {
         ehc $$10 = $$9.cG().g((double)$$6);
         Optional<ehh> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new ehe($$8);
   }

   public static void a(biw $$0, float $$1) {
      ehh $$2 = $$0.do();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(asb.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(asb.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dD() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dD() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dB() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dB() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.s(asb.i($$1, $$0.O, $$0.dD()));
         $$0.r(asb.i($$1, $$0.N, $$0.dB()));
      }
   }

   public static bhd a(bjm $$0, cjg $$1) {
      return $$0.eS().a($$1) ? bhd.a : bhd.b;
   }

   public static ccg a(bjm $$0, cjl $$1, float $$2) {
      cgz $$3 = (cgz)($$1.d() instanceof cgz ? $$1.d() : cjo.nH);
      ccg $$4 = $$3.a($$0.dL(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cjo.uw) && $$4 instanceof cci) {
         ((cci)$$4).a($$1);
      }

      return $$4;
   }
}
