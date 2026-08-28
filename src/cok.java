import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cok {
   private static final float a = 0.3F;

   public static eyc a(btj $$0, Predicate<btj> $$1) {
      eye $$2 = $$0.dv();
      dds $$3 = $$0.dS();
      eye $$4 = $$0.dq();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dda.a.a);
   }

   public static eyc a(btj $$0, Predicate<btj> $$1, dda.a $$2) {
      eye $$3 = $$0.dv();
      dds $$4 = $$0.dS();
      eye $$5 = $$0.dq();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static eyc a(btj $$0, Predicate<btj> $$1, double $$2) {
      eye $$3 = $$0.g(0.0F).c($$2);
      dds $$4 = $$0.dS();
      eye $$5 = $$0.bC();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dda.a.a);
   }

   private static eyc a(eye $$0, btj $$1, Predicate<btj> $$2, eye $$3, dds $$4, float $$5, dda.a $$6) {
      eye $$7 = $$0.e($$3);
      eyc $$8 = $$4.b(new dda($$0, $$7, $$6, dda.b.a, $$1));
      if ($$8.c() != eyc.a.a) {
         $$7 = $$8.e();
      }

      eyc $$9 = a($$4, $$1, $$0, $$7, $$1.cO().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static eyb a(btj $$0, eye $$1, eye $$2, exz $$3, Predicate<btj> $$4, double $$5) {
      dds $$6 = $$0.dS();
      double $$7 = $$5;
      btj $$8 = null;
      eye $$9 = null;

      for (btj $$10 : $$6.a($$0, $$3, $$4)) {
         exz $$11 = $$10.cO().g((double)$$10.bP());
         Optional<eye> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            eye $$13 = $$12.get();
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

      return $$8 == null ? null : new eyb($$8, $$9);
   }

   @Nullable
   public static eyb a(dds $$0, btj $$1, eye $$2, eye $$3, exz $$4, Predicate<btj> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static eyb a(dds $$0, btj $$1, eye $$2, eye $$3, exz $$4, Predicate<btj> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      btj $$8 = null;

      for (btj $$9 : $$0.a($$1, $$4, $$5)) {
         exz $$10 = $$9.cO().g((double)$$6);
         Optional<eye> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new eyb($$8);
   }

   public static void a(btj $$0, float $$1) {
      eye $$2 = $$0.dv();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(azc.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(azc.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.w(azc.h($$1, $$0.P, $$0.dK()));
         $$0.v(azc.h($$1, $$0.O, $$0.dI()));
      }
   }

   public static brj a(buf $$0, cvg $$1) {
      return $$0.eW().a($$1) ? brj.a : brj.b;
   }

   public static cnw a(buf $$0, cvl $$1, float $$2, @Nullable cvl $$3) {
      ctg $$4 = (ctg)($$1.h() instanceof ctg ? $$1.h() : cvo.ox);
      cnw $$5 = $$4.a($$0.dS(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
