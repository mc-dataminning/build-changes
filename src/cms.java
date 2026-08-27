import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cms {
   private static final float a = 0.3F;

   public static euk a(brw $$0, Predicate<brw> $$1) {
      eum $$2 = $$0.ds();
      daz $$3 = $$0.dP();
      eum $$4 = $$0.dn();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dai.a.a);
   }

   public static euk a(brw $$0, Predicate<brw> $$1, dai.a $$2) {
      eum $$3 = $$0.ds();
      daz $$4 = $$0.dP();
      eum $$5 = $$0.dn();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static euk a(brw $$0, Predicate<brw> $$1, double $$2) {
      eum $$3 = $$0.f(0.0F).a($$2);
      daz $$4 = $$0.dP();
      eum $$5 = $$0.bx();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dai.a.a);
   }

   private static euk a(eum $$0, brw $$1, Predicate<brw> $$2, eum $$3, daz $$4, float $$5, dai.a $$6) {
      eum $$7 = $$0.e($$3);
      euk $$8 = $$4.a(new dai($$0, $$7, $$6, dai.b.a, $$1));
      if ($$8.c() != euk.a.a) {
         $$7 = $$8.e();
      }

      euk $$9 = a($$4, $$1, $$0, $$7, $$1.cK().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static euj a(brw $$0, eum $$1, eum $$2, euh $$3, Predicate<brw> $$4, double $$5) {
      daz $$6 = $$0.dP();
      double $$7 = $$5;
      brw $$8 = null;
      eum $$9 = null;

      for (brw $$10 : $$6.a($$0, $$3, $$4)) {
         euh $$11 = $$10.cK().g((double)$$10.bK());
         Optional<eum> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            eum $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.cZ() == $$0.cZ()) {
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

      return $$8 == null ? null : new euj($$8, $$9);
   }

   @Nullable
   public static euj a(daz $$0, brw $$1, eum $$2, eum $$3, euh $$4, Predicate<brw> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static euj a(daz $$0, brw $$1, eum $$2, eum $$3, euh $$4, Predicate<brw> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      brw $$8 = null;

      for (brw $$9 : $$0.a($$1, $$4, $$5)) {
         euh $$10 = $$9.cK().g((double)$$6);
         Optional<eum> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new euj($$8);
   }

   public static void a(brw $$0, float $$1) {
      eum $$2 = $$0.ds();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(ayf.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(ayf.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dH() - $$0.P < -180.0F) {
            $$0.P -= 360.0F;
         }

         while ($$0.dH() - $$0.P >= 180.0F) {
            $$0.P += 360.0F;
         }

         while ($$0.dF() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dF() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         $$0.s(ayf.i($$1, $$0.P, $$0.dH()));
         $$0.r(ayf.i($$1, $$0.O, $$0.dF()));
      }
   }

   public static bpv a(bsq $$0, ctl $$1) {
      return $$0.eX().a($$1) ? bpv.a : bpv.b;
   }

   public static cme a(bsq $$0, ctq $$1, float $$2) {
      crj $$3 = (crj)($$1.g() instanceof crj ? $$1.g() : ctt.ov);
      cme $$4 = $$3.a($$0.dP(), $$1, $$0);
      $$4.a($$0, $$2);
      return $$4;
   }
}
