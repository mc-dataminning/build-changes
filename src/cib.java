import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cib {
   private static final float a = 0.3F;

   public static enq a(bno $$0, Predicate<bno> $$1) {
      ens $$2 = $$0.dp();
      cvn $$3 = $$0.dM();
      ens $$4 = $$0.dk();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, cuw.a.a);
   }

   public static enq a(bno $$0, Predicate<bno> $$1, cuw.a $$2) {
      ens $$3 = $$0.dp();
      cvn $$4 = $$0.dM();
      ens $$5 = $$0.dk();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static enq a(bno $$0, Predicate<bno> $$1, double $$2) {
      ens $$3 = $$0.f(0.0F).a($$2);
      cvn $$4 = $$0.dM();
      ens $$5 = $$0.br();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, cuw.a.a);
   }

   private static enq a(ens $$0, bno $$1, Predicate<bno> $$2, ens $$3, cvn $$4, float $$5, cuw.a $$6) {
      ens $$7 = $$0.e($$3);
      enq $$8 = $$4.a(new cuw($$0, $$7, $$6, cuw.b.a, $$1));
      if ($$8.c() != enq.a.a) {
         $$7 = $$8.e();
      }

      enq $$9 = a($$4, $$1, $$0, $$7, $$1.cH().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static enp a(bno $$0, ens $$1, ens $$2, enn $$3, Predicate<bno> $$4, double $$5) {
      cvn $$6 = $$0.dM();
      double $$7 = $$5;
      bno $$8 = null;
      ens $$9 = null;

      for (bno $$10 : $$6.a($$0, $$3, $$4)) {
         enn $$11 = $$10.cH().g((double)$$10.bE());
         Optional<ens> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ens $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.cW() == $$0.cW()) {
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

      return $$8 == null ? null : new enp($$8, $$9);
   }

   @Nullable
   public static enp a(cvn $$0, bno $$1, ens $$2, ens $$3, enn $$4, Predicate<bno> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static enp a(cvn $$0, bno $$1, ens $$2, ens $$3, enn $$4, Predicate<bno> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bno $$8 = null;

      for (bno $$9 : $$0.a($$1, $$4, $$5)) {
         enn $$10 = $$9.cH().g((double)$$6);
         Optional<ens> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new enp($$8);
   }

   public static void a(bno $$0, float $$1) {
      ens $$2 = $$0.dp();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(awh.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(awh.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dE() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dE() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         while ($$0.dC() - $$0.M < -180.0F) {
            $$0.M -= 360.0F;
         }

         while ($$0.dC() - $$0.M >= 180.0F) {
            $$0.M += 360.0F;
         }

         $$0.s(awh.i($$1, $$0.N, $$0.dE()));
         $$0.r(awh.i($$1, $$0.M, $$0.dC()));
      }
   }

   public static blt a(bog $$0, cou $$1) {
      return $$0.eT().a($$1) ? blt.a : blt.b;
   }

   public static chn a(bog $$0, coz $$1, float $$2) {
      cmn $$3 = (cmn)($$1.d() instanceof cmn ? $$1.d() : cpc.ou);
      chn $$4 = $$3.a($$0.dM(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cpc.vm) && $$4 instanceof chp) {
         ((chp)$$4).a($$1);
      }

      return $$4;
   }
}
