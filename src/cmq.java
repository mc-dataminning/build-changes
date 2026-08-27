import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cmq {
   private static final float a = 0.3F;

   public static eui a(bru $$0, Predicate<bru> $$1) {
      euk $$2 = $$0.ds();
      dax $$3 = $$0.dP();
      euk $$4 = $$0.dn();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dag.a.a);
   }

   public static eui a(bru $$0, Predicate<bru> $$1, dag.a $$2) {
      euk $$3 = $$0.ds();
      dax $$4 = $$0.dP();
      euk $$5 = $$0.dn();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static eui a(bru $$0, Predicate<bru> $$1, double $$2) {
      euk $$3 = $$0.f(0.0F).a($$2);
      dax $$4 = $$0.dP();
      euk $$5 = $$0.bx();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dag.a.a);
   }

   private static eui a(euk $$0, bru $$1, Predicate<bru> $$2, euk $$3, dax $$4, float $$5, dag.a $$6) {
      euk $$7 = $$0.e($$3);
      eui $$8 = $$4.a(new dag($$0, $$7, $$6, dag.b.a, $$1));
      if ($$8.c() != eui.a.a) {
         $$7 = $$8.e();
      }

      eui $$9 = a($$4, $$1, $$0, $$7, $$1.cK().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static euh a(bru $$0, euk $$1, euk $$2, euf $$3, Predicate<bru> $$4, double $$5) {
      dax $$6 = $$0.dP();
      double $$7 = $$5;
      bru $$8 = null;
      euk $$9 = null;

      for (bru $$10 : $$6.a($$0, $$3, $$4)) {
         euf $$11 = $$10.cK().g((double)$$10.bK());
         Optional<euk> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            euk $$13 = $$12.get();
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

      return $$8 == null ? null : new euh($$8, $$9);
   }

   @Nullable
   public static euh a(dax $$0, bru $$1, euk $$2, euk $$3, euf $$4, Predicate<bru> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static euh a(dax $$0, bru $$1, euk $$2, euk $$3, euf $$4, Predicate<bru> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bru $$8 = null;

      for (bru $$9 : $$0.a($$1, $$4, $$5)) {
         euf $$10 = $$9.cK().g((double)$$6);
         Optional<euk> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new euh($$8);
   }

   public static void a(bru $$0, float $$1) {
      euk $$2 = $$0.ds();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(ayd.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(ayd.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(ayd.i($$1, $$0.P, $$0.dH()));
         $$0.r(ayd.i($$1, $$0.O, $$0.dF()));
      }
   }

   public static bpt a(bso $$0, ctj $$1) {
      return $$0.eX().a($$1) ? bpt.a : bpt.b;
   }

   public static cmc a(bso $$0, cto $$1, float $$2) {
      crh $$3 = (crh)($$1.g() instanceof crh ? $$1.g() : ctr.ov);
      cmc $$4 = $$3.a($$0.dP(), $$1, $$0);
      $$4.a($$0, $$2);
      return $$4;
   }
}
