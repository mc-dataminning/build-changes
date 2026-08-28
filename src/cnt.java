import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cnt {
   private static final float a = 0.3F;

   public static evr a(bsw $$0, Predicate<bsw> $$1) {
      evt $$2 = $$0.ds();
      dca $$3 = $$0.dP();
      evt $$4 = $$0.dn();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dbj.a.a);
   }

   public static evr a(bsw $$0, Predicate<bsw> $$1, dbj.a $$2) {
      evt $$3 = $$0.ds();
      dca $$4 = $$0.dP();
      evt $$5 = $$0.dn();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static evr a(bsw $$0, Predicate<bsw> $$1, double $$2) {
      evt $$3 = $$0.f(0.0F).a($$2);
      dca $$4 = $$0.dP();
      evt $$5 = $$0.bx();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dbj.a.a);
   }

   private static evr a(evt $$0, bsw $$1, Predicate<bsw> $$2, evt $$3, dca $$4, float $$5, dbj.a $$6) {
      evt $$7 = $$0.e($$3);
      evr $$8 = $$4.a(new dbj($$0, $$7, $$6, dbj.b.a, $$1));
      if ($$8.c() != evr.a.a) {
         $$7 = $$8.e();
      }

      evr $$9 = a($$4, $$1, $$0, $$7, $$1.cK().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static evq a(bsw $$0, evt $$1, evt $$2, evo $$3, Predicate<bsw> $$4, double $$5) {
      dca $$6 = $$0.dP();
      double $$7 = $$5;
      bsw $$8 = null;
      evt $$9 = null;

      for (bsw $$10 : $$6.a($$0, $$3, $$4)) {
         evo $$11 = $$10.cK().g((double)$$10.bK());
         Optional<evt> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            evt $$13 = $$12.get();
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

      return $$8 == null ? null : new evq($$8, $$9);
   }

   @Nullable
   public static evq a(dca $$0, bsw $$1, evt $$2, evt $$3, evo $$4, Predicate<bsw> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static evq a(dca $$0, bsw $$1, evt $$2, evt $$3, evo $$4, Predicate<bsw> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bsw $$8 = null;

      for (bsw $$9 : $$0.a($$1, $$4, $$5)) {
         evo $$10 = $$9.cK().g((double)$$6);
         Optional<evt> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new evq($$8);
   }

   public static void a(bsw $$0, float $$1) {
      evt $$2 = $$0.ds();
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

   public static bqv a(btr $$0, cum $$1) {
      return $$0.eX().a($$1) ? bqv.a : bqv.b;
   }

   public static cnf a(btr $$0, cur $$1, float $$2) {
      csk $$3 = (csk)($$1.g() instanceof csk ? $$1.g() : cuu.ov);
      cnf $$4 = $$3.a($$0.dP(), $$1, $$0);
      $$4.a($$0, $$2);
      return $$4;
   }
}
