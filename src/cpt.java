import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cpt {
   private static final float a = 0.3F;

   public static faz a(bum $$0, Predicate<bum> $$1) {
      fbb $$2 = $$0.dy();
      dgj $$3 = $$0.dV();
      fbb $$4 = $$0.dt();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dfr.a.a);
   }

   public static faz a(bum $$0, Predicate<bum> $$1, dfr.a $$2) {
      fbb $$3 = $$0.dy();
      dgj $$4 = $$0.dV();
      fbb $$5 = $$0.dt();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static faz a(bum $$0, Predicate<bum> $$1, double $$2) {
      fbb $$3 = $$0.g(0.0F).c($$2);
      dgj $$4 = $$0.dV();
      fbb $$5 = $$0.bF();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dfr.a.a);
   }

   private static faz a(fbb $$0, bum $$1, Predicate<bum> $$2, fbb $$3, dgj $$4, float $$5, dfr.a $$6) {
      fbb $$7 = $$0.e($$3);
      faz $$8 = $$4.b(new dfr($$0, $$7, $$6, dfr.b.a, $$1));
      if ($$8.d() != faz.a.a) {
         $$7 = $$8.g();
      }

      faz $$9 = a($$4, $$1, $$0, $$7, $$1.cR().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static fay a(bum $$0, fbb $$1, fbb $$2, faw $$3, Predicate<bum> $$4, double $$5) {
      dgj $$6 = $$0.dV();
      double $$7 = $$5;
      bum $$8 = null;
      fbb $$9 = null;

      for (bum $$10 : $$6.a($$0, $$3, $$4)) {
         faw $$11 = $$10.cR().g((double)$$10.bS());
         Optional<fbb> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            fbb $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.df() == $$0.df()) {
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

      return $$8 == null ? null : new fay($$8, $$9);
   }

   @Nullable
   public static fay a(dgj $$0, bum $$1, fbb $$2, fbb $$3, faw $$4, Predicate<bum> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static fay a(dgj $$0, bum $$1, fbb $$2, fbb $$3, faw $$4, Predicate<bum> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      Optional<fbb> $$8 = Optional.empty();
      bum $$9 = null;

      for (bum $$10 : $$0.a($$1, $$4, $$5)) {
         faw $$11 = $$10.cR().g((double)$$6);
         Optional<fbb> $$12 = $$11.b($$2, $$3);
         if ($$12.isPresent()) {
            double $$13 = $$2.g($$12.get());
            if ($$13 < $$7) {
               $$9 = $$10;
               $$7 = $$13;
               $$8 = $$12;
            }
         }
      }

      return $$9 == null ? null : new fay($$9, $$8.get());
   }

   public static void a(bum $$0, float $$1) {
      fbb $$2 = $$0.dy();
      if ($$2.h() != 0.0) {
         double $$3 = $$2.i();
         $$0.v((float)(ayz.d($$2.f, $$2.d) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.w((float)(ayz.d($$3, $$2.e) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.w(ayz.h($$1, $$0.O, $$0.dN()));
         $$0.v(ayz.h($$1, $$0.N, $$0.dL()));
      }
   }

   public static bsk a(bvi $$0, cwm $$1) {
      return $$0.eZ().a($$1) ? bsk.a : bsk.b;
   }

   public static cpf a(bvi $$0, cwq $$1, float $$2, @Nullable cwq $$3) {
      cur $$4 = (cur)($$1.h() instanceof cur ? $$1.h() : cwu.pb);
      cpf $$5 = $$4.a($$0.dV(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
