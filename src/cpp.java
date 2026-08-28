import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cpp {
   private static final float a = 0.3F;

   public static ezw a(bul $$0, Predicate<bul> $$1) {
      ezy $$2 = $$0.dy();
      dfm $$3 = $$0.dV();
      ezy $$4 = $$0.dt();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, deu.a.a);
   }

   public static ezw a(bul $$0, Predicate<bul> $$1, deu.a $$2) {
      ezy $$3 = $$0.dy();
      dfm $$4 = $$0.dV();
      ezy $$5 = $$0.dt();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ezw a(bul $$0, Predicate<bul> $$1, double $$2) {
      ezy $$3 = $$0.g(0.0F).c($$2);
      dfm $$4 = $$0.dV();
      ezy $$5 = $$0.bF();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, deu.a.a);
   }

   private static ezw a(ezy $$0, bul $$1, Predicate<bul> $$2, ezy $$3, dfm $$4, float $$5, deu.a $$6) {
      ezy $$7 = $$0.e($$3);
      ezw $$8 = $$4.b(new deu($$0, $$7, $$6, deu.b.a, $$1));
      if ($$8.d() != ezw.a.a) {
         $$7 = $$8.g();
      }

      ezw $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static ezv a(bul $$0, ezy $$1, ezy $$2, ezt $$3, Predicate<bul> $$4, double $$5) {
      dfm $$6 = $$0.dV();
      double $$7 = $$5;
      bul $$8 = null;
      ezy $$9 = null;

      for (bul $$10 : $$6.a($$0, $$3, $$4)) {
         ezt $$11 = $$10.cR().g((double)$$10.bS());
         Optional<ezy> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ezy $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.dg() == $$0.dg()) {
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

      return $$8 == null ? null : new ezv($$8, $$9);
   }

   @Nullable
   public static ezv a(dfm $$0, bul $$1, ezy $$2, ezy $$3, ezt $$4, Predicate<bul> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static ezv a(dfm $$0, bul $$1, ezy $$2, ezy $$3, ezt $$4, Predicate<bul> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<ezy> $$8 = Optional.empty();
      bul $$9 = null;

      for (bul $$10 : $$0.a($$1, $$4, $$5)) {
         ezt $$11 = $$10.cR().g((double)$$6);
         Optional<ezy> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new ezv($$9, $$8.get());
   }

   public static void a(bul $$0, float $$1) {
      ezy $$2 = $$0.dy();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(azm.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(azm.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dN() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dN() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dL() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dL() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.w(azm.h($$1, $$0.O, $$0.dN()));
         $$0.v(azm.h($$1, $$0.N, $$0.dL()));
      }
   }

   public static bsj a(bvh $$0, cwi $$1) {
      return $$0.eX().a($$1) ? bsj.a : bsj.b;
   }

   public static cpb a(bvh $$0, cwm $$1, float $$2, @Nullable cwm $$3) {
      cun $$4 = (cun)($$1.h() instanceof cun ? $$1.h() : cwq.ox);
      cpb $$5 = $$4.a($$0.dV(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
