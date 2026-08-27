import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class ccp {
   public static ehn a(bis $$0, Predicate<bis> $$1) {
      ehp $$2 = $$0.do();
      cpx $$3 = $$0.dL();
      ehp $$4 = $$0.dj();
      return a($$4, $$0, $$1, $$2, $$3);
   }

   public static ehn a(bis $$0, Predicate<bis> $$1, double $$2) {
      ehp $$3 = $$0.f(0.0F).a($$2);
      cpx $$4 = $$0.dL();
      ehp $$5 = $$0.bp();
      return a($$5, $$0, $$1, $$3, $$4);
   }

   private static ehn a(ehp $$0, bis $$1, Predicate<bis> $$2, ehp $$3, cpx $$4) {
      ehp $$5 = $$0.e($$3);
      ehn $$6 = $$4.a(new cpg($$0, $$5, cpg.a.a, cpg.b.a, $$1));
      if ($$6.c() != ehn.a.a) {
         $$5 = $$6.e();
      }

      ehn $$7 = a($$4, $$1, $$0, $$5, $$1.cG().b($$3).g(1.0), $$2);
      if ($$7 != null) {
         $$6 = $$7;
      }

      return $$6;
   }

   @Nullable
   public static ehm a(bis $$0, ehp $$1, ehp $$2, ehk $$3, Predicate<bis> $$4, double $$5) {
      cpx $$6 = $$0.dL();
      double $$7 = $$5;
      bis $$8 = null;
      ehp $$9 = null;

      for (bis $$10 : $$6.a($$0, $$3, $$4)) {
         ehk $$11 = $$10.cG().g((double)$$10.bD());
         Optional<ehp> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ehp $$13 = $$12.get();
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

      return $$8 == null ? null : new ehm($$8, $$9);
   }

   @Nullable
   public static ehm a(cpx $$0, bis $$1, ehp $$2, ehp $$3, ehk $$4, Predicate<bis> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ehm a(cpx $$0, bis $$1, ehp $$2, ehp $$3, ehk $$4, Predicate<bis> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bis $$8 = null;

      for (bis $$9 : $$0.a($$1, $$4, $$5)) {
         ehk $$10 = $$9.cG().g((double)$$6);
         Optional<ehp> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new ehm($$8);
   }

   public static void a(bis $$0, float $$1) {
      ehp $$2 = $$0.do();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(ary.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(ary.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(ary.i($$1, $$0.O, $$0.dD()));
         $$0.r(ary.i($$1, $$0.N, $$0.dB()));
      }
   }

   public static bgz a(bji $$0, cjc $$1) {
      return $$0.eS().a($$1) ? bgz.a : bgz.b;
   }

   public static ccc a(bji $$0, cjh $$1, float $$2) {
      cgv $$3 = (cgv)($$1.d() instanceof cgv ? $$1.d() : cjk.nH);
      ccc $$4 = $$3.a($$0.dL(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cjk.uw) && $$4 instanceof cce) {
         ((cce)$$4).a($$1);
      }

      return $$4;
   }
}
