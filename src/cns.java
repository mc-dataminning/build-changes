import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cns {
   private static final float a = 0.3F;

   public static evq a(bsv $$0, Predicate<bsv> $$1) {
      evs $$2 = $$0.ds();
      dbz $$3 = $$0.dP();
      evs $$4 = $$0.dn();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dbi.a.a);
   }

   public static evq a(bsv $$0, Predicate<bsv> $$1, dbi.a $$2) {
      evs $$3 = $$0.ds();
      dbz $$4 = $$0.dP();
      evs $$5 = $$0.dn();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static evq a(bsv $$0, Predicate<bsv> $$1, double $$2) {
      evs $$3 = $$0.f(0.0F).a($$2);
      dbz $$4 = $$0.dP();
      evs $$5 = $$0.bx();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dbi.a.a);
   }

   private static evq a(evs $$0, bsv $$1, Predicate<bsv> $$2, evs $$3, dbz $$4, float $$5, dbi.a $$6) {
      evs $$7 = $$0.e($$3);
      evq $$8 = $$4.a(new dbi($$0, $$7, $$6, dbi.b.a, $$1));
      if ($$8.c() != evq.a.a) {
         $$7 = $$8.e();
      }

      evq $$9 = a($$4, $$1, $$0, $$7, $$1.cK().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static evp a(bsv $$0, evs $$1, evs $$2, evn $$3, Predicate<bsv> $$4, double $$5) {
      dbz $$6 = $$0.dP();
      double $$7 = $$5;
      bsv $$8 = null;
      evs $$9 = null;

      for (bsv $$10 : $$6.a($$0, $$3, $$4)) {
         evn $$11 = $$10.cK().g((double)$$10.bK());
         Optional<evs> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            evs $$13 = $$12.get();
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

      return $$8 == null ? null : new evp($$8, $$9);
   }

   @Nullable
   public static evp a(dbz $$0, bsv $$1, evs $$2, evs $$3, evn $$4, Predicate<bsv> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static evp a(dbz $$0, bsv $$1, evs $$2, evs $$3, evn $$4, Predicate<bsv> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bsv $$8 = null;

      for (bsv $$9 : $$0.a($$1, $$4, $$5)) {
         evn $$10 = $$9.cK().g((double)$$6);
         Optional<evs> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new evp($$8);
   }

   public static void a(bsv $$0, float $$1) {
      evs $$2 = $$0.ds();
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

   public static bqu a(btq $$0, cul $$1) {
      return $$0.eX().a($$1) ? bqu.a : bqu.b;
   }

   public static cne a(btq $$0, cuq $$1, float $$2) {
      csj $$3 = (csj)($$1.g() instanceof csj ? $$1.g() : cut.ov);
      cne $$4 = $$3.a($$0.dP(), $$1, $$0);
      $$4.a($$0, $$2);
      return $$4;
   }
}
