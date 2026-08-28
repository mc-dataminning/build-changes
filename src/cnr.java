import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cnr {
   private static final float a = 0.3F;

   public static evp a(bsu $$0, Predicate<bsu> $$1) {
      evr $$2 = $$0.ds();
      dby $$3 = $$0.dP();
      evr $$4 = $$0.dn();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dbh.a.a);
   }

   public static evp a(bsu $$0, Predicate<bsu> $$1, dbh.a $$2) {
      evr $$3 = $$0.ds();
      dby $$4 = $$0.dP();
      evr $$5 = $$0.dn();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static evp a(bsu $$0, Predicate<bsu> $$1, double $$2) {
      evr $$3 = $$0.f(0.0F).a($$2);
      dby $$4 = $$0.dP();
      evr $$5 = $$0.bx();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dbh.a.a);
   }

   private static evp a(evr $$0, bsu $$1, Predicate<bsu> $$2, evr $$3, dby $$4, float $$5, dbh.a $$6) {
      evr $$7 = $$0.e($$3);
      evp $$8 = $$4.a(new dbh($$0, $$7, $$6, dbh.b.a, $$1));
      if ($$8.c() != evp.a.a) {
         $$7 = $$8.e();
      }

      evp $$9 = a($$4, $$1, $$0, $$7, $$1.cK().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static evo a(bsu $$0, evr $$1, evr $$2, evm $$3, Predicate<bsu> $$4, double $$5) {
      dby $$6 = $$0.dP();
      double $$7 = $$5;
      bsu $$8 = null;
      evr $$9 = null;

      for (bsu $$10 : $$6.a($$0, $$3, $$4)) {
         evm $$11 = $$10.cK().g((double)$$10.bK());
         Optional<evr> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            evr $$13 = $$12.get();
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

      return $$8 == null ? null : new evo($$8, $$9);
   }

   @Nullable
   public static evo a(dby $$0, bsu $$1, evr $$2, evr $$3, evm $$4, Predicate<bsu> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static evo a(dby $$0, bsu $$1, evr $$2, evr $$3, evm $$4, Predicate<bsu> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bsu $$8 = null;

      for (bsu $$9 : $$0.a($$1, $$4, $$5)) {
         evm $$10 = $$9.cK().g((double)$$6);
         Optional<evr> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new evo($$8);
   }

   public static void a(bsu $$0, float $$1) {
      evr $$2 = $$0.ds();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(ayz.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(ayz.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(ayz.i($$1, $$0.P, $$0.dH()));
         $$0.r(ayz.i($$1, $$0.O, $$0.dF()));
      }
   }

   public static bqt a(btp $$0, cuk $$1) {
      return $$0.eX().a($$1) ? bqt.a : bqt.b;
   }

   public static cnd a(btp $$0, cup $$1, float $$2) {
      csi $$3 = (csi)($$1.g() instanceof csi ? $$1.g() : cus.ov);
      cnd $$4 = $$3.a($$0.dP(), $$1, $$0);
      $$4.a($$0, $$2);
      return $$4;
   }
}
