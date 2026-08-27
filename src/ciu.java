import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class ciu {
   private static final float a = 0.3F;

   public static eot a(bof $$0, Predicate<bof> $$1) {
      eov $$2 = $$0.dm();
      cwe $$3 = $$0.dJ();
      eov $$4 = $$0.dh();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, cvn.a.a);
   }

   public static eot a(bof $$0, Predicate<bof> $$1, cvn.a $$2) {
      eov $$3 = $$0.dm();
      cwe $$4 = $$0.dJ();
      eov $$5 = $$0.dh();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static eot a(bof $$0, Predicate<bof> $$1, double $$2) {
      eov $$3 = $$0.f(0.0F).a($$2);
      cwe $$4 = $$0.dJ();
      eov $$5 = $$0.br();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, cvn.a.a);
   }

   private static eot a(eov $$0, bof $$1, Predicate<bof> $$2, eov $$3, cwe $$4, float $$5, cvn.a $$6) {
      eov $$7 = $$0.e($$3);
      eot $$8 = $$4.a(new cvn($$0, $$7, $$6, cvn.b.a, $$1));
      if ($$8.c() != eot.a.a) {
         $$7 = $$8.e();
      }

      eot $$9 = a($$4, $$1, $$0, $$7, $$1.cE().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static eos a(bof $$0, eov $$1, eov $$2, eoq $$3, Predicate<bof> $$4, double $$5) {
      cwe $$6 = $$0.dJ();
      double $$7 = $$5;
      bof $$8 = null;
      eov $$9 = null;

      for (bof $$10 : $$6.a($$0, $$3, $$4)) {
         eoq $$11 = $$10.cE().g((double)$$10.bE());
         Optional<eov> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            eov $$13 = $$12.get();
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

      return $$8 == null ? null : new eos($$8, $$9);
   }

   @Nullable
   public static eos a(cwe $$0, bof $$1, eov $$2, eov $$3, eoq $$4, Predicate<bof> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static eos a(cwe $$0, bof $$1, eov $$2, eov $$3, eoq $$4, Predicate<bof> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bof $$8 = null;

      for (bof $$9 : $$0.a($$1, $$4, $$5)) {
         eoq $$10 = $$9.cE().g((double)$$6);
         Optional<eov> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new eos($$8);
   }

   public static void a(bof $$0, float $$1) {
      eov $$2 = $$0.dm();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(awm.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(awm.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dB() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dB() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         while ($$0.dz() - $$0.M < -180.0F) {
            $$0.M -= 360.0F;
         }

         while ($$0.dz() - $$0.M >= 180.0F) {
            $$0.M += 360.0F;
         }

         $$0.s(awm.i($$1, $$0.N, $$0.dB()));
         $$0.r(awm.i($$1, $$0.M, $$0.dz()));
      }
   }

   public static bmk a(box $$0, cpl $$1) {
      return $$0.eR().a($$1) ? bmk.a : bmk.b;
   }

   public static cig a(box $$0, cpq $$1, float $$2) {
      cng $$3 = (cng)($$1.d() instanceof cng ? $$1.d() : cpt.ou);
      cig $$4 = $$3.a($$0.dJ(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cpt.vm) && $$4 instanceof cii) {
         ((cii)$$4).a($$1);
      }

      return $$4;
   }
}
