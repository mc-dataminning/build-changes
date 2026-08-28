import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cpi {
   private static final float a = 0.3F;

   public static ezl a(bue $$0, Predicate<bue> $$1) {
      ezn $$2 = $$0.dA();
      dfb $$3 = $$0.dX();
      ezn $$4 = $$0.dv();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dej.a.a);
   }

   public static ezl a(bue $$0, Predicate<bue> $$1, dej.a $$2) {
      ezn $$3 = $$0.dA();
      dfb $$4 = $$0.dX();
      ezn $$5 = $$0.dv();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ezl a(bue $$0, Predicate<bue> $$1, double $$2) {
      ezn $$3 = $$0.g(0.0F).c($$2);
      dfb $$4 = $$0.dX();
      ezn $$5 = $$0.bG();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dej.a.a);
   }

   private static ezl a(ezn $$0, bue $$1, Predicate<bue> $$2, ezn $$3, dfb $$4, float $$5, dej.a $$6) {
      ezn $$7 = $$0.e($$3);
      ezl $$8 = $$4.b(new dej($$0, $$7, $$6, dej.b.a, $$1));
      if ($$8.d() != ezl.a.a) {
         $$7 = $$8.g();
      }

      ezl $$9 = a($$4, $$1, $$0, $$7, $$1.cS().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static ezk a(bue $$0, ezn $$1, ezn $$2, ezi $$3, Predicate<bue> $$4, double $$5) {
      dfb $$6 = $$0.dX();
      double $$7 = $$5;
      bue $$8 = null;
      ezn $$9 = null;

      for (bue $$10 : $$6.a($$0, $$3, $$4)) {
         ezi $$11 = $$10.cS().g((double)$$10.bT());
         Optional<ezn> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ezn $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.dh() == $$0.dh()) {
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

      return $$8 == null ? null : new ezk($$8, $$9);
   }

   @Nullable
   public static ezk a(dfb $$0, bue $$1, ezn $$2, ezn $$3, ezi $$4, Predicate<bue> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ezk a(dfb $$0, bue $$1, ezn $$2, ezn $$3, ezi $$4, Predicate<bue> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<ezn> $$8 = Optional.empty();
      bue $$9 = null;

      for (bue $$10 : $$0.a($$1, $$4, $$5)) {
         ezi $$11 = $$10.cS().g((double)$$6);
         Optional<ezn> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new ezk($$9, $$8.get());
   }

   public static void a(bue $$0, float $$1) {
      ezn $$2 = $$0.dA();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(azk.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(azk.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dP() - $$0.P < -180.0F) {
            $$0.P -= 360.0F;
         }

         while ($$0.dP() - $$0.P >= 180.0F) {
            $$0.P += 360.0F;
         }

         while ($$0.dN() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dN() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         $$0.w(azk.h($$1, $$0.P, $$0.dP()));
         $$0.v(azk.h($$1, $$0.O, $$0.dN()));
      }
   }

   public static bsc a(bva $$0, cvx $$1) {
      return $$0.fb().a($$1) ? bsc.a : bsc.b;
   }

   public static cou a(bva $$0, cwb $$1, float $$2, @Nullable cwb $$3) {
      cuc $$4 = (cuc)($$1.h() instanceof cuc ? $$1.h() : cwf.ox);
      cou $$5 = $$4.a($$0.dX(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
