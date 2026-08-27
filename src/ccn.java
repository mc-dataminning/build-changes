import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class ccn {
   public static ehl a(biq $$0, Predicate<biq> $$1) {
      ehn $$2 = $$0.do();
      cpv $$3 = $$0.dL();
      ehn $$4 = $$0.dj();
      return a($$4, $$0, $$1, $$2, $$3);
   }

   public static ehl a(biq $$0, Predicate<biq> $$1, double $$2) {
      ehn $$3 = $$0.f(0.0F).a($$2);
      cpv $$4 = $$0.dL();
      ehn $$5 = $$0.bp();
      return a($$5, $$0, $$1, $$3, $$4);
   }

   private static ehl a(ehn $$0, biq $$1, Predicate<biq> $$2, ehn $$3, cpv $$4) {
      ehn $$5 = $$0.e($$3);
      ehl $$6 = $$4.a(new cpe($$0, $$5, cpe.a.a, cpe.b.a, $$1));
      if ($$6.c() != ehl.a.a) {
         $$5 = $$6.e();
      }

      ehl $$7 = a($$4, $$1, $$0, $$5, $$1.cG().b($$3).g(1.0), $$2);
      if ($$7 != null) {
         $$6 = $$7;
      }

      return $$6;
   }

   @Nullable
   public static ehk a(biq $$0, ehn $$1, ehn $$2, ehi $$3, Predicate<biq> $$4, double $$5) {
      cpv $$6 = $$0.dL();
      double $$7 = $$5;
      biq $$8 = null;
      ehn $$9 = null;

      for (biq $$10 : $$6.a($$0, $$3, $$4)) {
         ehi $$11 = $$10.cG().g((double)$$10.bD());
         Optional<ehn> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ehn $$13 = $$12.get();
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

      return $$8 == null ? null : new ehk($$8, $$9);
   }

   @Nullable
   public static ehk a(cpv $$0, biq $$1, ehn $$2, ehn $$3, ehi $$4, Predicate<biq> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ehk a(cpv $$0, biq $$1, ehn $$2, ehn $$3, ehi $$4, Predicate<biq> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      biq $$8 = null;

      for (biq $$9 : $$0.a($$1, $$4, $$5)) {
         ehi $$10 = $$9.cG().g((double)$$6);
         Optional<ehn> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new ehk($$8);
   }

   public static void a(biq $$0, float $$1) {
      ehn $$2 = $$0.do();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(arx.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(arx.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(arx.i($$1, $$0.O, $$0.dD()));
         $$0.r(arx.i($$1, $$0.N, $$0.dB()));
      }
   }

   public static bgx a(bjg $$0, cja $$1) {
      return $$0.eS().a($$1) ? bgx.a : bgx.b;
   }

   public static cca a(bjg $$0, cjf $$1, float $$2) {
      cgt $$3 = (cgt)($$1.d() instanceof cgt ? $$1.d() : cji.nH);
      cca $$4 = $$3.a($$0.dL(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cji.uw) && $$4 instanceof ccc) {
         ((ccc)$$4).a($$1);
      }

      return $$4;
   }
}
