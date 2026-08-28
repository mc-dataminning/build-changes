import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class coq {
   private static final float a = 0.3F;

   public static eyq a(bto $$0, Predicate<bto> $$1) {
      eys $$2 = $$0.dv();
      deg $$3 = $$0.dS();
      eys $$4 = $$0.dq();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, ddo.a.a);
   }

   public static eyq a(bto $$0, Predicate<bto> $$1, ddo.a $$2) {
      eys $$3 = $$0.dv();
      deg $$4 = $$0.dS();
      eys $$5 = $$0.dq();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static eyq a(bto $$0, Predicate<bto> $$1, double $$2) {
      eys $$3 = $$0.g(0.0F).c($$2);
      deg $$4 = $$0.dS();
      eys $$5 = $$0.bC();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, ddo.a.a);
   }

   private static eyq a(eys $$0, bto $$1, Predicate<bto> $$2, eys $$3, deg $$4, float $$5, ddo.a $$6) {
      eys $$7 = $$0.e($$3);
      eyq $$8 = $$4.b(new ddo($$0, $$7, $$6, ddo.b.a, $$1));
      if ($$8.d() != eyq.a.a) {
         $$7 = $$8.g();
      }

      eyq $$9 = a($$4, $$1, $$0, $$7, $$1.cO().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static eyp a(bto $$0, eys $$1, eys $$2, eyn $$3, Predicate<bto> $$4, double $$5) {
      deg $$6 = $$0.dS();
      double $$7 = $$5;
      bto $$8 = null;
      eys $$9 = null;

      for (bto $$10 : $$6.a($$0, $$3, $$4)) {
         eyn $$11 = $$10.cO().g((double)$$10.bP());
         Optional<eys> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            eys $$13 = $$12.get();
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

      return $$8 == null ? null : new eyp($$8, $$9);
   }

   @Nullable
   public static eyp a(deg $$0, bto $$1, eys $$2, eys $$3, eyn $$4, Predicate<bto> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static eyp a(deg $$0, bto $$1, eys $$2, eys $$3, eyn $$4, Predicate<bto> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bto $$8 = null;

      for (bto $$9 : $$0.a($$1, $$4, $$5)) {
         eyn $$10 = $$9.cO().g((double)$$6);
         Optional<eys> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new eyp($$8);
   }

   public static void a(bto $$0, float $$1) {
      eys $$2 = $$0.dv();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(azd.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(azd.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.w(azd.h($$1, $$0.P, $$0.dK()));
         $$0.v(azd.h($$1, $$0.O, $$0.dI()));
      }
   }

   public static bro a(buk $$0, cvk $$1) {
      return $$0.eW().a($$1) ? bro.a : bro.b;
   }

   public static cob a(buk $$0, cvp $$1, float $$2, @Nullable cvp $$3) {
      ctm $$4 = (ctm)($$1.h() instanceof ctm ? $$1.h() : cvt.ox);
      cob $$5 = $$4.a($$0.dS(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
