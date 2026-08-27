import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bzh {
   public static eeg a(bfj $$0, Predicate<bfj> $$1) {
      eei $$2 = $$0.dl();
      cmm $$3 = $$0.dI();
      eei $$4 = $$0.dg();
      return a($$4, $$0, $$1, $$2, $$3);
   }

   public static eeg a(bfj $$0, Predicate<bfj> $$1, double $$2) {
      eei $$3 = $$0.f(0.0F).a($$2);
      cmm $$4 = $$0.dI();
      eei $$5 = $$0.bm();
      return a($$5, $$0, $$1, $$3, $$4);
   }

   private static eeg a(eei $$0, bfj $$1, Predicate<bfj> $$2, eei $$3, cmm $$4) {
      eei $$5 = $$0.e($$3);
      eeg $$6 = $$4.a(new clv($$0, $$5, clv.a.a, clv.b.a, $$1));
      if ($$6.c() != eeg.a.a) {
         $$5 = $$6.e();
      }

      eeg $$7 = a($$4, $$1, $$0, $$5, $$1.cE().b($$3).g(1.0), $$2);
      if ($$7 != null) {
         $$6 = $$7;
      }

      return $$6;
   }

   @Nullable
   public static eef a(bfj $$0, eei $$1, eei $$2, eed $$3, Predicate<bfj> $$4, double $$5) {
      cmm $$6 = $$0.dI();
      double $$7 = $$5;
      bfj $$8 = null;
      eei $$9 = null;

      for (bfj $$10 : $$6.a($$0, $$3, $$4)) {
         eed $$11 = $$10.cE().g((double)$$10.bC());
         Optional<eei> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            eei $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.cT() == $$0.cT()) {
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

      return $$8 == null ? null : new eef($$8, $$9);
   }

   @Nullable
   public static eef a(cmm $$0, bfj $$1, eei $$2, eei $$3, eed $$4, Predicate<bfj> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static eef a(cmm $$0, bfj $$1, eei $$2, eei $$3, eed $$4, Predicate<bfj> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bfj $$8 = null;

      for (bfj $$9 : $$0.a($$1, $$4, $$5)) {
         eed $$10 = $$9.cE().g((double)$$6);
         Optional<eei> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new eef($$8);
   }

   public static void a(bfj $$0, float $$1) {
      eei $$2 = $$0.dl();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.a_((float)(apa.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.b_((float)(apa.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dA() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dA() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         while ($$0.dy() - $$0.M < -180.0F) {
            $$0.M -= 360.0F;
         }

         while ($$0.dy() - $$0.M >= 180.0F) {
            $$0.M += 360.0F;
         }

         $$0.b_(apa.i($$1, $$0.N, $$0.dA()));
         $$0.a_(apa.i($$1, $$0.M, $$0.dy()));
      }
   }

   public static bdw a(bfz $$0, cfu $$1) {
      return $$0.eO().a($$1) ? bdw.a : bdw.b;
   }

   public static byu a(bfz $$0, cfz $$1, float $$2) {
      cdn $$3 = (cdn)($$1.d() instanceof cdn ? $$1.d() : cgc.nH);
      byu $$4 = $$3.a($$0.dI(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cgc.uw) && $$4 instanceof byw) {
         ((byw)$$4).a($$1);
      }

      return $$4;
   }
}
