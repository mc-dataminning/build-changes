import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class csj {
   private static final float a = 0.3F;

   public static ffa a(bwi $$0, Predicate<bwi> $$1) {
      ffc $$2 = $$0.dx();
      djm $$3 = $$0.dU();
      ffc $$4 = $$0.ds();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dit.a.a);
   }

   public static ffa a(bwi $$0, Predicate<bwi> $$1, dit.a $$2) {
      ffc $$3 = $$0.dx();
      djm $$4 = $$0.dU();
      ffc $$5 = $$0.ds();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ffa a(bwi $$0, Predicate<bwi> $$1, double $$2) {
      ffc $$3 = $$0.h(0.0F).c($$2);
      djm $$4 = $$0.dU();
      ffc $$5 = $$0.bC();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dit.a.a);
   }

   private static ffa a(ffc $$0, bwi $$1, Predicate<bwi> $$2, ffc $$3, djm $$4, float $$5, dit.a $$6) {
      ffc $$7 = $$0.e($$3);
      ffa $$8 = $$4.b(new dit($$0, $$7, $$6, dit.b.a, $$1));
      if ($$8.d() != ffa.a.a) {
         $$7 = $$8.g();
      }

      ffa $$9 = a($$4, $$1, $$0, $$7, $$1.cQ().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fez a(bwi $$0, ffc $$1, ffc $$2, fex $$3, Predicate<bwi> $$4, double $$5) {
      djm $$6 = $$0.dU();
      double $$7 = $$5;
      bwi $$8 = null;
      ffc $$9 = null;

      for (bwi $$10 : $$6.a($$0, $$3, $$4)) {
         fex $$11 = $$10.cQ().g((double)$$10.bQ());
         Optional<ffc> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ffc $$13 = $$12.get();
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

      return $$8 == null ? null : new fez($$8, $$9);
   }

   @Nullable
   public static fez a(djm $$0, bwi $$1, ffc $$2, ffc $$3, fex $$4, Predicate<bwi> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static fez a(djm $$0, bwi $$1, ffc $$2, ffc $$3, fex $$4, Predicate<bwi> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<ffc> $$8 = Optional.empty();
      bwi $$9 = null;

      for (bwi $$10 : $$0.a($$1, $$4, $$5)) {
         fex $$11 = $$10.cQ().g((double)$$6);
         Optional<ffc> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new fez($$9, $$8.get());
   }

   public static void a(bwi $$0, float $$1) {
      ffc $$2 = $$0.dx();
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

   public static buf a(bxj $$0, czj $$1) {
      return $$0.fa().a($$1) ? buf.a : buf.b;
   }

   public static cru a(bxj $$0, czn $$1, float $$2, @Nullable czn $$3) {
      cxr $$4 = (cxr)($$1.h() instanceof cxr ? $$1.h() : czr.pk);
      cru $$5 = $$4.a($$0.dU(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
