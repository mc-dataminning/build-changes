import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cfk {
   private static final float a = 0.3F;

   public static ekz a(blf $$0, Predicate<blf> $$1) {
      elb $$2 = $$0.dp();
      csy $$3 = $$0.dM();
      elb $$4 = $$0.dk();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, csh.a.a);
   }

   public static ekz a(blf $$0, Predicate<blf> $$1, csh.a $$2) {
      elb $$3 = $$0.dp();
      csy $$4 = $$0.dM();
      elb $$5 = $$0.dk();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static ekz a(blf $$0, Predicate<blf> $$1, double $$2) {
      elb $$3 = $$0.f(0.0F).a($$2);
      csy $$4 = $$0.dM();
      elb $$5 = $$0.br();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, csh.a.a);
   }

   private static ekz a(elb $$0, blf $$1, Predicate<blf> $$2, elb $$3, csy $$4, float $$5, csh.a $$6) {
      elb $$7 = $$0.e($$3);
      ekz $$8 = $$4.a(new csh($$0, $$7, $$6, csh.b.a, $$1));
      if ($$8.c() != ekz.a.a) {
         $$7 = $$8.e();
      }

      ekz $$9 = a($$4, $$1, $$0, $$7, $$1.cH().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static eky a(blf $$0, elb $$1, elb $$2, ekw $$3, Predicate<blf> $$4, double $$5) {
      csy $$6 = $$0.dM();
      double $$7 = $$5;
      blf $$8 = null;
      elb $$9 = null;

      for (blf $$10 : $$6.a($$0, $$3, $$4)) {
         ekw $$11 = $$10.cH().g((double)$$10.bE());
         Optional<elb> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            elb $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.cW() == $$0.cW()) {
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

      return $$8 == null ? null : new eky($$8, $$9);
   }

   @Nullable
   public static eky a(csy $$0, blf $$1, elb $$2, elb $$3, ekw $$4, Predicate<blf> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static eky a(csy $$0, blf $$1, elb $$2, elb $$3, ekw $$4, Predicate<blf> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      blf $$8 = null;

      for (blf $$9 : $$0.a($$1, $$4, $$5)) {
         ekw $$10 = $$9.cH().g((double)$$6);
         Optional<elb> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new eky($$8);
   }

   public static void a(blf $$0, float $$1) {
      elb $$2 = $$0.dp();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(aty.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(aty.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dE() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dE() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dC() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dC() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.s(aty.i($$1, $$0.O, $$0.dE()));
         $$0.r(aty.i($$1, $$0.N, $$0.dC()));
      }
   }

   public static bjk a(blv $$0, cmc $$1) {
      return $$0.eT().a($$1) ? bjk.a : bjk.b;
   }

   public static cex a(blv $$0, cmh $$1, float $$2) {
      cjv $$3 = (cjv)($$1.d() instanceof cjv ? $$1.d() : cmk.os);
      cex $$4 = $$3.a($$0.dM(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cmk.vj) && $$4 instanceof cez) {
         ((cez)$$4).a($$1);
      }

      return $$4;
   }
}
