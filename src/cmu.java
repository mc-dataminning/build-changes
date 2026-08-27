import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cmu {
   private static final float a = 0.3F;

   public static ews a(brv $$0, Predicate<brv> $$1) {
      ewu $$2 = $$0.dx();
      dca $$3 = $$0.dU();
      ewu $$4 = $$0.ds();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dbj.a.a);
   }

   public static ews a(brv $$0, Predicate<brv> $$1, dbj.a $$2) {
      ewu $$3 = $$0.dx();
      dca $$4 = $$0.dU();
      ewu $$5 = $$0.ds();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ews a(brv $$0, Predicate<brv> $$1, double $$2) {
      ewu $$3 = $$0.f(0.0F).a($$2);
      dca $$4 = $$0.dU();
      ewu $$5 = $$0.bC();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dbj.a.a);
   }

   private static ews a(ewu $$0, brv $$1, Predicate<brv> $$2, ewu $$3, dca $$4, float $$5, dbj.a $$6) {
      ewu $$7 = $$0.e($$3);
      ews $$8 = $$4.a(new dbj($$0, $$7, $$6, dbj.b.a, $$1));
      if ($$8.c() != ews.a.a) {
         $$7 = $$8.e();
      }

      ews $$9 = a($$4, $$1, $$0, $$7, $$1.cP().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static ewr a(brv $$0, ewu $$1, ewu $$2, ewp $$3, Predicate<brv> $$4, double $$5) {
      dca $$6 = $$0.dU();
      double $$7 = $$5;
      brv $$8 = null;
      ewu $$9 = null;

      for (brv $$10 : $$6.a($$0, $$3, $$4)) {
         ewp $$11 = $$10.cP().g((double)$$10.bP());
         Optional<ewu> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ewu $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.de() == $$0.de()) {
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

      return $$8 == null ? null : new ewr($$8, $$9);
   }

   @Nullable
   public static ewr a(dca $$0, brv $$1, ewu $$2, ewu $$3, ewp $$4, Predicate<brv> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ewr a(dca $$0, brv $$1, ewu $$2, ewu $$3, ewp $$4, Predicate<brv> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      brv $$8 = null;

      for (brv $$9 : $$0.a($$1, $$4, $$5)) {
         ewp $$10 = $$9.cP().g((double)$$6);
         Optional<ewu> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new ewr($$8);
   }

   public static void a(brv $$0, float $$1) {
      ewu $$2 = $$0.dx();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(aym.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(aym.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dM() - $$0.Q < -180.0F) {
            $$0.Q -= 360.0F;
         }

         while ($$0.dM() - $$0.Q >= 180.0F) {
            $$0.Q += 360.0F;
         }

         while ($$0.dK() - $$0.P < -180.0F) {
            $$0.P -= 360.0F;
         }

         while ($$0.dK() - $$0.P >= 180.0F) {
            $$0.P += 360.0F;
         }

         $$0.s(aym.i($$1, $$0.Q, $$0.dM()));
         $$0.r(aym.i($$1, $$0.P, $$0.dK()));
      }
   }

   public static bpz a(bso $$0, cuc $$1) {
      return $$0.fg().a($$1) ? bpz.a : bpz.b;
   }

   public static cme a(bso $$0, cuh $$1, float $$2) {
      crx $$3 = (crx)($$1.f() instanceof crx ? $$1.f() : cuk.pL);
      cme $$4 = $$3.a($$0.dU(), $$1, $$0);
      $$4.a($$0, $$2);
      return $$4;
   }
}
