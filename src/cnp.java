import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cnp {
   private static final float a = 0.3F;

   public static evn a(bss $$0, Predicate<bss> $$1) {
      evp $$2 = $$0.ds();
      dbw $$3 = $$0.dP();
      evp $$4 = $$0.dn();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dbf.a.a);
   }

   public static evn a(bss $$0, Predicate<bss> $$1, dbf.a $$2) {
      evp $$3 = $$0.ds();
      dbw $$4 = $$0.dP();
      evp $$5 = $$0.dn();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static evn a(bss $$0, Predicate<bss> $$1, double $$2) {
      evp $$3 = $$0.f(0.0F).a($$2);
      dbw $$4 = $$0.dP();
      evp $$5 = $$0.bx();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dbf.a.a);
   }

   private static evn a(evp $$0, bss $$1, Predicate<bss> $$2, evp $$3, dbw $$4, float $$5, dbf.a $$6) {
      evp $$7 = $$0.e($$3);
      evn $$8 = $$4.a(new dbf($$0, $$7, $$6, dbf.b.a, $$1));
      if ($$8.c() != evn.a.a) {
         $$7 = $$8.e();
      }

      evn $$9 = a($$4, $$1, $$0, $$7, $$1.cK().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static evm a(bss $$0, evp $$1, evp $$2, evk $$3, Predicate<bss> $$4, double $$5) {
      dbw $$6 = $$0.dP();
      double $$7 = $$5;
      bss $$8 = null;
      evp $$9 = null;

      for (bss $$10 : $$6.a($$0, $$3, $$4)) {
         evk $$11 = $$10.cK().g((double)$$10.bK());
         Optional<evp> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            evp $$13 = $$12.get();
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

      return $$8 == null ? null : new evm($$8, $$9);
   }

   @Nullable
   public static evm a(dbw $$0, bss $$1, evp $$2, evp $$3, evk $$4, Predicate<bss> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static evm a(dbw $$0, bss $$1, evp $$2, evp $$3, evk $$4, Predicate<bss> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bss $$8 = null;

      for (bss $$9 : $$0.a($$1, $$4, $$5)) {
         evk $$10 = $$9.cK().g((double)$$6);
         Optional<evp> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new evm($$8);
   }

   public static void a(bss $$0, float $$1) {
      evp $$2 = $$0.ds();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(ayx.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(ayx.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(ayx.i($$1, $$0.P, $$0.dH()));
         $$0.r(ayx.i($$1, $$0.O, $$0.dF()));
      }
   }

   public static bqr a(btn $$0, cui $$1) {
      return $$0.eX().a($$1) ? bqr.a : bqr.b;
   }

   public static cnb a(btn $$0, cun $$1, float $$2) {
      csg $$3 = (csg)($$1.g() instanceof csg ? $$1.g() : cuq.ov);
      cnb $$4 = $$3.a($$0.dP(), $$1, $$0);
      $$4.a($$0, $$2);
      return $$4;
   }
}
