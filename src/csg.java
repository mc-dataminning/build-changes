import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class csg {
   private static final float a = 0.3F;

   public static fev a(bwi $$0, Predicate<bwi> $$1) {
      fex $$2 = $$0.dx();
      djh $$3 = $$0.dU();
      fex $$4 = $$0.ds();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, diq.a.a);
   }

   public static fev a(bwi $$0, Predicate<bwi> $$1, diq.a $$2) {
      fex $$3 = $$0.dx();
      djh $$4 = $$0.dU();
      fex $$5 = $$0.ds();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static fev a(bwi $$0, Predicate<bwi> $$1, double $$2) {
      fex $$3 = $$0.h(0.0F).c($$2);
      djh $$4 = $$0.dU();
      fex $$5 = $$0.bC();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, diq.a.a);
   }

   private static fev a(fex $$0, bwi $$1, Predicate<bwi> $$2, fex $$3, djh $$4, float $$5, diq.a $$6) {
      fex $$7 = $$0.e($$3);
      fev $$8 = $$4.b(new diq($$0, $$7, $$6, diq.b.a, $$1));
      if ($$8.d() != fev.a.a) {
         $$7 = $$8.g();
      }

      fev $$9 = a($$4, $$1, $$0, $$7, $$1.cQ().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static feu a(bwi $$0, fex $$1, fex $$2, fes $$3, Predicate<bwi> $$4, double $$5) {
      djh $$6 = $$0.dU();
      double $$7 = $$5;
      bwi $$8 = null;
      fex $$9 = null;

      for (bwi $$10 : $$6.a($$0, $$3, $$4)) {
         fes $$11 = $$10.cQ().g((double)$$10.bQ());
         Optional<fex> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            fex $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.de() == $$0.de()) {
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

      return $$8 == null ? null : new feu($$8, $$9);
   }

   @Nullable
   public static feu a(djh $$0, bwi $$1, fex $$2, fex $$3, fes $$4, Predicate<bwi> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static feu a(djh $$0, bwi $$1, fex $$2, fex $$3, fes $$4, Predicate<bwi> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fex> $$8 = Optional.empty();
      bwi $$9 = null;

      for (bwi $$10 : $$0.a($$1, $$4, $$5)) {
         fes $$11 = $$10.cQ().g((double)$$6);
         Optional<fex> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new feu($$9, $$8.get());
   }

   public static void a(bwi $$0, float $$1) {
      fex $$2 = $$0.dx();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.w((float)(azm.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.x((float)(azm.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dM() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dM() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dK() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dK() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.x(azm.h($$1, $$0.O, $$0.dM()));
         $$0.w(azm.h($$1, $$0.N, $$0.dK()));
      }
   }

   public static buf a(bxj $$0, czg $$1) {
      return $$0.fa().a($$1) ? buf.a : buf.b;
   }

   public static crr a(bxj $$0, czk $$1, float $$2, @Nullable czk $$3) {
      cxo $$4 = (cxo)($$1.h() instanceof cxo ? $$1.h() : czo.pk);
      crr $$5 = $$4.a($$0.dU(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
