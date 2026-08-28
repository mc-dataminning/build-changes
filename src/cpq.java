import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cpq {
   private static final float a = 0.3F;

   public static faw a(buj $$0, Predicate<buj> $$1) {
      fay $$2 = $$0.dz();
      dgg $$3 = $$0.dW();
      fay $$4 = $$0.du();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dfo.a.a);
   }

   public static faw a(buj $$0, Predicate<buj> $$1, dfo.a $$2) {
      fay $$3 = $$0.dz();
      dgg $$4 = $$0.dW();
      fay $$5 = $$0.du();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static faw a(buj $$0, Predicate<buj> $$1, double $$2) {
      fay $$3 = $$0.g(0.0F).c($$2);
      dgg $$4 = $$0.dW();
      fay $$5 = $$0.bF();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dfo.a.a);
   }

   private static faw a(fay $$0, buj $$1, Predicate<buj> $$2, fay $$3, dgg $$4, float $$5, dfo.a $$6) {
      fay $$7 = $$0.e($$3);
      faw $$8 = $$4.b(new dfo($$0, $$7, $$6, dfo.b.a, $$1));
      if ($$8.d() != faw.a.a) {
         $$7 = $$8.g();
      }

      faw $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fav a(buj $$0, fay $$1, fay $$2, fat $$3, Predicate<buj> $$4, double $$5) {
      dgg $$6 = $$0.dW();
      double $$7 = $$5;
      buj $$8 = null;
      fay $$9 = null;

      for (buj $$10 : $$6.a($$0, $$3, $$4)) {
         fat $$11 = $$10.cR().g((double)$$10.bS());
         Optional<fay> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            fay $$13 = $$12.get();
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

      return $$8 == null ? null : new fav($$8, $$9);
   }

   @Nullable
   public static fav a(dgg $$0, buj $$1, fay $$2, fay $$3, fat $$4, Predicate<buj> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static fav a(dgg $$0, buj $$1, fay $$2, fay $$3, fat $$4, Predicate<buj> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fay> $$8 = Optional.empty();
      buj $$9 = null;

      for (buj $$10 : $$0.a($$1, $$4, $$5)) {
         fat $$11 = $$10.cR().g((double)$$6);
         Optional<fay> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new fav($$9, $$8.get());
   }

   public static void a(buj $$0, float $$1) {
      fay $$2 = $$0.dz();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(ayy.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(ayy.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dO() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dO() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dM() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dM() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.w(ayy.h($$1, $$0.O, $$0.dO()));
         $$0.v(ayy.h($$1, $$0.N, $$0.dM()));
      }
   }

   public static bsh a(bvf $$0, cwj $$1) {
      return $$0.eZ().a($$1) ? bsh.a : bsh.b;
   }

   public static cpc a(bvf $$0, cwn $$1, float $$2, @Nullable cwn $$3) {
      cuo $$4 = (cuo)($$1.h() instanceof cuo ? $$1.h() : cwr.pb);
      cpc $$5 = $$4.a($$0.dW(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
