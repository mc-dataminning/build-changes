import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cnr {
   private static final float a = 0.3F;

   public static exa a(bsr $$0, Predicate<bsr> $$1) {
      exc $$2 = $$0.dr();
      dcw $$3 = $$0.dO();
      exc $$4 = $$0.dm();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dcf.a.a);
   }

   public static exa a(bsr $$0, Predicate<bsr> $$1, dcf.a $$2) {
      exc $$3 = $$0.dr();
      dcw $$4 = $$0.dO();
      exc $$5 = $$0.dm();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static exa a(bsr $$0, Predicate<bsr> $$1, double $$2) {
      exc $$3 = $$0.g(0.0F).a($$2);
      dcw $$4 = $$0.dO();
      exc $$5 = $$0.by();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dcf.a.a);
   }

   private static exa a(exc $$0, bsr $$1, Predicate<bsr> $$2, exc $$3, dcw $$4, float $$5, dcf.a $$6) {
      exc $$7 = $$0.e($$3);
      exa $$8 = $$4.a(new dcf($$0, $$7, $$6, dcf.b.a, $$1));
      if ($$8.c() != exa.a.a) {
         $$7 = $$8.e();
      }

      exa $$9 = a($$4, $$1, $$0, $$7, $$1.cK().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static ewz a(bsr $$0, exc $$1, exc $$2, ewx $$3, Predicate<bsr> $$4, double $$5) {
      dcw $$6 = $$0.dO();
      double $$7 = $$5;
      bsr $$8 = null;
      exc $$9 = null;

      for (bsr $$10 : $$6.a($$0, $$3, $$4)) {
         ewx $$11 = $$10.cK().g((double)$$10.bL());
         Optional<exc> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            exc $$13 = $$12.get();
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

      return $$8 == null ? null : new ewz($$8, $$9);
   }

   @Nullable
   public static ewz a(dcw $$0, bsr $$1, exc $$2, exc $$3, ewx $$4, Predicate<bsr> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ewz a(dcw $$0, bsr $$1, exc $$2, exc $$3, ewx $$4, Predicate<bsr> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bsr $$8 = null;

      for (bsr $$9 : $$0.a($$1, $$4, $$5)) {
         ewx $$10 = $$9.cK().g((double)$$6);
         Optional<exc> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new ewz($$8);
   }

   public static void a(bsr $$0, float $$1) {
      exc $$2 = $$0.dr();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.t((float)(ayo.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.u((float)(ayo.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dG() - $$0.P < -180.0F) {
            $$0.P -= 360.0F;
         }

         while ($$0.dG() - $$0.P >= 180.0F) {
            $$0.P += 360.0F;
         }

         while ($$0.dE() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dE() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         $$0.u(ayo.i($$1, $$0.P, $$0.dG()));
         $$0.t(ayo.i($$1, $$0.O, $$0.dE()));
      }
   }

   public static bqq a(btn $$0, cul $$1) {
      return $$0.eT().a($$1) ? bqq.a : bqq.b;
   }

   public static cnd a(btn $$0, cuq $$1, float $$2, @Nullable cuq $$3) {
      csj $$4 = (csj)($$1.g() instanceof csj ? $$1.g() : cut.ow);
      cnd $$5 = $$4.a($$0.dO(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
