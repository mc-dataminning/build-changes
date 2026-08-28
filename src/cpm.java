import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cpm {
   private static final float a = 0.3F;

   public static ezp a(bui $$0, Predicate<bui> $$1) {
      ezr $$2 = $$0.dB();
      dff $$3 = $$0.dY();
      ezr $$4 = $$0.dw();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, den.a.a);
   }

   public static ezp a(bui $$0, Predicate<bui> $$1, den.a $$2) {
      ezr $$3 = $$0.dB();
      dff $$4 = $$0.dY();
      ezr $$5 = $$0.dw();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ezp a(bui $$0, Predicate<bui> $$1, double $$2) {
      ezr $$3 = $$0.g(0.0F).c($$2);
      dff $$4 = $$0.dY();
      ezr $$5 = $$0.bH();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, den.a.a);
   }

   private static ezp a(ezr $$0, bui $$1, Predicate<bui> $$2, ezr $$3, dff $$4, float $$5, den.a $$6) {
      ezr $$7 = $$0.e($$3);
      ezp $$8 = $$4.b(new den($$0, $$7, $$6, den.b.a, $$1));
      if ($$8.d() != ezp.a.a) {
         $$7 = $$8.g();
      }

      ezp $$9 = a($$4, $$1, $$0, $$7, $$1.cT().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static ezo a(bui $$0, ezr $$1, ezr $$2, ezm $$3, Predicate<bui> $$4, double $$5) {
      dff $$6 = $$0.dY();
      double $$7 = $$5;
      bui $$8 = null;
      ezr $$9 = null;

      for (bui $$10 : $$6.a($$0, $$3, $$4)) {
         ezm $$11 = $$10.cT().g((double)$$10.bU());
         Optional<ezr> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ezr $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.di() == $$0.di()) {
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

      return $$8 == null ? null : new ezo($$8, $$9);
   }

   @Nullable
   public static ezo a(dff $$0, bui $$1, ezr $$2, ezr $$3, ezm $$4, Predicate<bui> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ezo a(dff $$0, bui $$1, ezr $$2, ezr $$3, ezm $$4, Predicate<bui> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<ezr> $$8 = Optional.empty();
      bui $$9 = null;

      for (bui $$10 : $$0.a($$1, $$4, $$5)) {
         ezm $$11 = $$10.cT().g((double)$$6);
         Optional<ezr> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new ezo($$9, $$8.get());
   }

   public static void a(bui $$0, float $$1) {
      ezr $$2 = $$0.dB();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(azn.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(azn.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dQ() - $$0.P < -180.0F) {
            $$0.P -= 360.0F;
         }

         while ($$0.dQ() - $$0.P >= 180.0F) {
            $$0.P += 360.0F;
         }

         while ($$0.dO() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dO() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         $$0.w(azn.h($$1, $$0.P, $$0.dQ()));
         $$0.v(azn.h($$1, $$0.O, $$0.dO()));
      }
   }

   public static bsg a(bve $$0, cwb $$1) {
      return $$0.fc().a($$1) ? bsg.a : bsg.b;
   }

   public static coy a(bve $$0, cwf $$1, float $$2, @Nullable cwf $$3) {
      cug $$4 = (cug)($$1.h() instanceof cug ? $$1.h() : cwj.ox);
      coy $$5 = $$4.a($$0.dY(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
