import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cot {
   private static final float a = 0.3F;

   public static eyu a(btr $$0, Predicate<btr> $$1) {
      eyw $$2 = $$0.dv();
      dej $$3 = $$0.dS();
      eyw $$4 = $$0.dq();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, ddr.a.a);
   }

   public static eyu a(btr $$0, Predicate<btr> $$1, ddr.a $$2) {
      eyw $$3 = $$0.dv();
      dej $$4 = $$0.dS();
      eyw $$5 = $$0.dq();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static eyu a(btr $$0, Predicate<btr> $$1, double $$2) {
      eyw $$3 = $$0.g(0.0F).c($$2);
      dej $$4 = $$0.dS();
      eyw $$5 = $$0.bC();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, ddr.a.a);
   }

   private static eyu a(eyw $$0, btr $$1, Predicate<btr> $$2, eyw $$3, dej $$4, float $$5, ddr.a $$6) {
      eyw $$7 = $$0.e($$3);
      eyu $$8 = $$4.b(new ddr($$0, $$7, $$6, ddr.b.a, $$1));
      if ($$8.d() != eyu.a.a) {
         $$7 = $$8.g();
      }

      eyu $$9 = a($$4, $$1, $$0, $$7, $$1.cO().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static eyt a(btr $$0, eyw $$1, eyw $$2, eyr $$3, Predicate<btr> $$4, double $$5) {
      dej $$6 = $$0.dS();
      double $$7 = $$5;
      btr $$8 = null;
      eyw $$9 = null;

      for (btr $$10 : $$6.a($$0, $$3, $$4)) {
         eyr $$11 = $$10.cO().g((double)$$10.bP());
         Optional<eyw> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            eyw $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.dd() == $$0.dd()) {
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

      return $$8 == null ? null : new eyt($$8, $$9);
   }

   @Nullable
   public static eyt a(dej $$0, btr $$1, eyw $$2, eyw $$3, eyr $$4, Predicate<btr> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static eyt a(dej $$0, btr $$1, eyw $$2, eyw $$3, eyr $$4, Predicate<btr> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      btr $$8 = null;

      for (btr $$9 : $$0.a($$1, $$4, $$5)) {
         eyr $$10 = $$9.cO().g((double)$$6);
         Optional<eyw> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new eyt($$8);
   }

   public static void a(btr $$0, float $$1) {
      eyw $$2 = $$0.dv();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(azf.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(azf.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dK() - $$0.P < -180.0F) {
            $$0.P -= 360.0F;
         }

         while ($$0.dK() - $$0.P >= 180.0F) {
            $$0.P += 360.0F;
         }

         while ($$0.dI() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dI() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         $$0.w(azf.h($$1, $$0.P, $$0.dK()));
         $$0.v(azf.h($$1, $$0.O, $$0.dI()));
      }
   }

   public static brr a(bun $$0, cvn $$1) {
      return $$0.eW().a($$1) ? brr.a : brr.b;
   }

   public static coe a(bun $$0, cvs $$1, float $$2, @Nullable cvs $$3) {
      ctp $$4 = (ctp)($$1.h() instanceof ctp ? $$1.h() : cvw.ox);
      coe $$5 = $$4.a($$0.dS(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
