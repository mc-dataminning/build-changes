import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cef {
   private static final float a = 0.3F;

   public static ejg a(bki $$0, Predicate<bki> $$1) {
      eji $$2 = $$0.do();
      crs $$3 = $$0.dL();
      eji $$4 = $$0.dj();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F);
   }

   public static ejg a(bki $$0, Predicate<bki> $$1, double $$2) {
      eji $$3 = $$0.f(0.0F).a($$2);
      crs $$4 = $$0.dL();
      eji $$5 = $$0.bp();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F);
   }

   private static ejg a(eji $$0, bki $$1, Predicate<bki> $$2, eji $$3, crs $$4, float $$5) {
      eji $$6 = $$0.e($$3);
      ejg $$7 = $$4.a(new crb($$0, $$6, crb.a.a, crb.b.a, $$1));
      if ($$7.c() != ejg.a.a) {
         $$6 = $$7.e();
      }

      ejg $$8 = a($$4, $$1, $$0, $$6, $$1.cG().b($$3).g(1.0), $$2, $$5);
      if ($$8 != null) {
         $$7 = $$8;
      }

      return $$7;
   }

   @Nullable
   public static ejf a(bki $$0, eji $$1, eji $$2, ejd $$3, Predicate<bki> $$4, double $$5) {
      crs $$6 = $$0.dL();
      double $$7 = $$5;
      bki $$8 = null;
      eji $$9 = null;

      for (bki $$10 : $$6.a($$0, $$3, $$4)) {
         ejd $$11 = $$10.cG().g((double)$$10.bD());
         Optional<eji> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            eji $$13 = $$12.get();
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

      return $$8 == null ? null : new ejf($$8, $$9);
   }

   @Nullable
   public static ejf a(crs $$0, bki $$1, eji $$2, eji $$3, ejd $$4, Predicate<bki> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ejf a(crs $$0, bki $$1, eji $$2, eji $$3, ejd $$4, Predicate<bki> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bki $$8 = null;

      for (bki $$9 : $$0.a($$1, $$4, $$5)) {
         ejd $$10 = $$9.cG().g((double)$$6);
         Optional<eji> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new ejf($$8);
   }

   public static void a(bki $$0, float $$1) {
      eji $$2 = $$0.do();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(ati.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(ati.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(ati.i($$1, $$0.O, $$0.dD()));
         $$0.r(ati.i($$1, $$0.N, $$0.dB()));
      }
   }

   public static bip a(bky $$0, ckw $$1) {
      return $$0.eS().a($$1) ? bip.a : bip.b;
   }

   public static cds a(bky $$0, clb $$1, float $$2) {
      cip $$3 = (cip)($$1.d() instanceof cip ? $$1.d() : cle.nH);
      cds $$4 = $$3.a($$0.dL(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cle.ux) && $$4 instanceof cdu) {
         ((cdu)$$4).a($$1);
      }

      return $$4;
   }
}
