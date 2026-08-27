import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cga {
   private static final float a = 0.3F;

   public static elq a(blu $$0, Predicate<blu> $$1) {
      els $$2 = $$0.dp();
      cto $$3 = $$0.dM();
      els $$4 = $$0.dk();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, csx.a.a);
   }

   public static elq a(blu $$0, Predicate<blu> $$1, csx.a $$2) {
      els $$3 = $$0.dp();
      cto $$4 = $$0.dM();
      els $$5 = $$0.dk();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static elq a(blu $$0, Predicate<blu> $$1, double $$2) {
      els $$3 = $$0.f(0.0F).a($$2);
      cto $$4 = $$0.dM();
      els $$5 = $$0.br();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, csx.a.a);
   }

   private static elq a(els $$0, blu $$1, Predicate<blu> $$2, els $$3, cto $$4, float $$5, csx.a $$6) {
      els $$7 = $$0.e($$3);
      elq $$8 = $$4.a(new csx($$0, $$7, $$6, csx.b.a, $$1));
      if ($$8.c() != elq.a.a) {
         $$7 = $$8.e();
      }

      elq $$9 = a($$4, $$1, $$0, $$7, $$1.cH().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static elp a(blu $$0, els $$1, els $$2, eln $$3, Predicate<blu> $$4, double $$5) {
      cto $$6 = $$0.dM();
      double $$7 = $$5;
      blu $$8 = null;
      els $$9 = null;

      for (blu $$10 : $$6.a($$0, $$3, $$4)) {
         eln $$11 = $$10.cH().g((double)$$10.bE());
         Optional<els> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            els $$13 = $$12.get();
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

      return $$8 == null ? null : new elp($$8, $$9);
   }

   @Nullable
   public static elp a(cto $$0, blu $$1, els $$2, els $$3, eln $$4, Predicate<blu> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static elp a(cto $$0, blu $$1, els $$2, els $$3, eln $$4, Predicate<blu> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      blu $$8 = null;

      for (blu $$9 : $$0.a($$1, $$4, $$5)) {
         eln $$10 = $$9.cH().g((double)$$6);
         Optional<els> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new elp($$8);
   }

   public static void a(blu $$0, float $$1) {
      els $$2 = $$0.dp();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(aun.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(aun.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(aun.i($$1, $$0.O, $$0.dE()));
         $$0.r(aun.i($$1, $$0.N, $$0.dC()));
      }
   }

   public static bjz a(bmk $$0, cms $$1) {
      return $$0.eT().a($$1) ? bjz.a : bjz.b;
   }

   public static cfn a(bmk $$0, cmx $$1, float $$2) {
      ckl $$3 = (ckl)($$1.d() instanceof ckl ? $$1.d() : cna.os);
      cfn $$4 = $$3.a($$0.dM(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cna.vj) && $$4 instanceof cfp) {
         ((cfp)$$4).a($$1);
      }

      return $$4;
   }
}
