import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class ces {
   private static final float a = 0.3F;

   public static ejx a(bkv $$0, Predicate<bkv> $$1) {
      ejz $$2 = $$0.dq();
      csf $$3 = $$0.dN();
      ejz $$4 = $$0.dl();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F);
   }

   public static ejx a(bkv $$0, Predicate<bkv> $$1, double $$2) {
      ejz $$3 = $$0.f(0.0F).a($$2);
      csf $$4 = $$0.dN();
      ejz $$5 = $$0.br();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F);
   }

   private static ejx a(ejz $$0, bkv $$1, Predicate<bkv> $$2, ejz $$3, csf $$4, float $$5) {
      ejz $$6 = $$0.e($$3);
      ejx $$7 = $$4.a(new cro($$0, $$6, cro.a.a, cro.b.a, $$1));
      if ($$7.c() != ejx.a.a) {
         $$6 = $$7.e();
      }

      ejx $$8 = a($$4, $$1, $$0, $$6, $$1.cH().b($$3).g(1.0), $$2, $$5);
      if ($$8 != null) {
         $$7 = $$8;
      }

      return $$7;
   }

   @Nullable
   public static ejw a(bkv $$0, ejz $$1, ejz $$2, eju $$3, Predicate<bkv> $$4, double $$5) {
      csf $$6 = $$0.dN();
      double $$7 = $$5;
      bkv $$8 = null;
      ejz $$9 = null;

      for (bkv $$10 : $$6.a($$0, $$3, $$4)) {
         eju $$11 = $$10.cH().g((double)$$10.bE());
         Optional<ejz> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ejz $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.cX() == $$0.cX()) {
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

      return $$8 == null ? null : new ejw($$8, $$9);
   }

   @Nullable
   public static ejw a(csf $$0, bkv $$1, ejz $$2, ejz $$3, eju $$4, Predicate<bkv> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ejw a(csf $$0, bkv $$1, ejz $$2, ejz $$3, eju $$4, Predicate<bkv> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bkv $$8 = null;

      for (bkv $$9 : $$0.a($$1, $$4, $$5)) {
         eju $$10 = $$9.cH().g((double)$$6);
         Optional<ejz> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new ejw($$8);
   }

   public static void a(bkv $$0, float $$1) {
      ejz $$2 = $$0.dq();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(atq.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(atq.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dF() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dF() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dD() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dD() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.s(atq.i($$1, $$0.O, $$0.dF()));
         $$0.r(atq.i($$1, $$0.N, $$0.dD()));
      }
   }

   public static bja a(bll $$0, clj $$1) {
      return $$0.eU().a($$1) ? bja.a : bja.b;
   }

   public static cef a(bll $$0, clo $$1, float $$2) {
      cjc $$3 = (cjc)($$1.d() instanceof cjc ? $$1.d() : clr.os);
      cef $$4 = $$3.a($$0.dN(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(clr.vi) && $$4 instanceof ceh) {
         ((ceh)$$4).a($$1);
      }

      return $$4;
   }
}
