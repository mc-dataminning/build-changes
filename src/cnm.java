import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cnm {
   private static final float a = 0.3F;

   public static evk a(bsp $$0, Predicate<bsp> $$1) {
      evm $$2 = $$0.ds();
      dbt $$3 = $$0.dP();
      evm $$4 = $$0.dn();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dbc.a.a);
   }

   public static evk a(bsp $$0, Predicate<bsp> $$1, dbc.a $$2) {
      evm $$3 = $$0.ds();
      dbt $$4 = $$0.dP();
      evm $$5 = $$0.dn();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static evk a(bsp $$0, Predicate<bsp> $$1, double $$2) {
      evm $$3 = $$0.f(0.0F).a($$2);
      dbt $$4 = $$0.dP();
      evm $$5 = $$0.bx();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dbc.a.a);
   }

   private static evk a(evm $$0, bsp $$1, Predicate<bsp> $$2, evm $$3, dbt $$4, float $$5, dbc.a $$6) {
      evm $$7 = $$0.e($$3);
      evk $$8 = $$4.a(new dbc($$0, $$7, $$6, dbc.b.a, $$1));
      if ($$8.c() != evk.a.a) {
         $$7 = $$8.e();
      }

      evk $$9 = a($$4, $$1, $$0, $$7, $$1.cK().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static evj a(bsp $$0, evm $$1, evm $$2, evh $$3, Predicate<bsp> $$4, double $$5) {
      dbt $$6 = $$0.dP();
      double $$7 = $$5;
      bsp $$8 = null;
      evm $$9 = null;

      for (bsp $$10 : $$6.a($$0, $$3, $$4)) {
         evh $$11 = $$10.cK().g((double)$$10.bK());
         Optional<evm> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            evm $$13 = $$12.get();
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

      return $$8 == null ? null : new evj($$8, $$9);
   }

   @Nullable
   public static evj a(dbt $$0, bsp $$1, evm $$2, evm $$3, evh $$4, Predicate<bsp> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static evj a(dbt $$0, bsp $$1, evm $$2, evm $$3, evh $$4, Predicate<bsp> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bsp $$8 = null;

      for (bsp $$9 : $$0.a($$1, $$4, $$5)) {
         evh $$10 = $$9.cK().g((double)$$6);
         Optional<evm> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new evj($$8);
   }

   public static void a(bsp $$0, float $$1) {
      evm $$2 = $$0.ds();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(ayu.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(ayu.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(ayu.i($$1, $$0.P, $$0.dH()));
         $$0.r(ayu.i($$1, $$0.O, $$0.dF()));
      }
   }

   public static bqo a(btk $$0, cuf $$1) {
      return $$0.eX().a($$1) ? bqo.a : bqo.b;
   }

   public static cmy a(btk $$0, cuk $$1, float $$2) {
      csd $$3 = (csd)($$1.g() instanceof csd ? $$1.g() : cun.ov);
      cmy $$4 = $$3.a($$0.dP(), $$1, $$0);
      $$4.a($$0, $$2);
      return $$4;
   }
}
