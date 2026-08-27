import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cdq {
   private static final float a = 0.3F;

   public static eid a(bjt $$0, Predicate<bjt> $$1) {
      eif $$2 = $$0.do();
      cqz $$3 = $$0.dL();
      eif $$4 = $$0.dj();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F);
   }

   public static eid a(bjt $$0, Predicate<bjt> $$1, double $$2) {
      eif $$3 = $$0.f(0.0F).a($$2);
      cqz $$4 = $$0.dL();
      eif $$5 = $$0.bp();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F);
   }

   private static eid a(eif $$0, bjt $$1, Predicate<bjt> $$2, eif $$3, cqz $$4, float $$5) {
      eif $$6 = $$0.e($$3);
      eid $$7 = $$4.a(new cqi($$0, $$6, cqi.a.a, cqi.b.a, $$1));
      if ($$7.c() != eid.a.a) {
         $$6 = $$7.e();
      }

      eid $$8 = a($$4, $$1, $$0, $$6, $$1.cG().b($$3).g(1.0), $$2, $$5);
      if ($$8 != null) {
         $$7 = $$8;
      }

      return $$7;
   }

   @Nullable
   public static eic a(bjt $$0, eif $$1, eif $$2, eia $$3, Predicate<bjt> $$4, double $$5) {
      cqz $$6 = $$0.dL();
      double $$7 = $$5;
      bjt $$8 = null;
      eif $$9 = null;

      for (bjt $$10 : $$6.a($$0, $$3, $$4)) {
         eia $$11 = $$10.cG().g((double)$$10.bD());
         Optional<eif> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            eif $$13 = $$12.get();
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

      return $$8 == null ? null : new eic($$8, $$9);
   }

   @Nullable
   public static eic a(cqz $$0, bjt $$1, eif $$2, eif $$3, eia $$4, Predicate<bjt> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static eic a(cqz $$0, bjt $$1, eif $$2, eif $$3, eia $$4, Predicate<bjt> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bjt $$8 = null;

      for (bjt $$9 : $$0.a($$1, $$4, $$5)) {
         eia $$10 = $$9.cG().g((double)$$6);
         Optional<eif> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new eic($$8);
   }

   public static void a(bjt $$0, float $$1) {
      eif $$2 = $$0.do();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(asy.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(asy.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(asy.i($$1, $$0.O, $$0.dD()));
         $$0.r(asy.i($$1, $$0.N, $$0.dB()));
      }
   }

   public static bia a(bkj $$0, cke $$1) {
      return $$0.eS().a($$1) ? bia.a : bia.b;
   }

   public static cdd a(bkj $$0, ckj $$1, float $$2) {
      chx $$3 = (chx)($$1.d() instanceof chx ? $$1.d() : ckm.nH);
      cdd $$4 = $$3.a($$0.dL(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(ckm.uw) && $$4 instanceof cdf) {
         ((cdf)$$4).a($$1);
      }

      return $$4;
   }
}
