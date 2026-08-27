import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class ccf {
   public static ehb a(bii $$0, Predicate<bii> $$1) {
      ehd $$2 = $$0.dn();
      cpl $$3 = $$0.dK();
      ehd $$4 = $$0.di();
      return a($$4, $$0, $$1, $$2, $$3);
   }

   public static ehb a(bii $$0, Predicate<bii> $$1, double $$2) {
      ehd $$3 = $$0.f(0.0F).a($$2);
      cpl $$4 = $$0.dK();
      ehd $$5 = $$0.bp();
      return a($$5, $$0, $$1, $$3, $$4);
   }

   private static ehb a(ehd $$0, bii $$1, Predicate<bii> $$2, ehd $$3, cpl $$4) {
      ehd $$5 = $$0.e($$3);
      ehb $$6 = $$4.a(new cou($$0, $$5, cou.a.a, cou.b.a, $$1));
      if ($$6.c() != ehb.a.a) {
         $$5 = $$6.e();
      }

      ehb $$7 = a($$4, $$1, $$0, $$5, $$1.cG().b($$3).g(1.0), $$2);
      if ($$7 != null) {
         $$6 = $$7;
      }

      return $$6;
   }

   @Nullable
   public static eha a(bii $$0, ehd $$1, ehd $$2, egy $$3, Predicate<bii> $$4, double $$5) {
      cpl $$6 = $$0.dK();
      double $$7 = $$5;
      bii $$8 = null;
      ehd $$9 = null;

      for (bii $$10 : $$6.a($$0, $$3, $$4)) {
         egy $$11 = $$10.cG().g((double)$$10.bD());
         Optional<ehd> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            ehd $$13 = $$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.cV() == $$0.cV()) {
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

      return $$8 == null ? null : new eha($$8, $$9);
   }

   @Nullable
   public static eha a(cpl $$0, bii $$1, ehd $$2, ehd $$3, egy $$4, Predicate<bii> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static eha a(cpl $$0, bii $$1, ehd $$2, ehd $$3, egy $$4, Predicate<bii> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bii $$8 = null;

      for (bii $$9 : $$0.a($$1, $$4, $$5)) {
         egy $$10 = $$9.cG().g((double)$$6);
         Optional<ehd> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new eha($$8);
   }

   public static void a(bii $$0, float $$1) {
      ehd $$2 = $$0.dn();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(arp.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(arp.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while ($$0.dC() - $$0.O < -180.0F) {
            $$0.O -= 360.0F;
         }

         while ($$0.dC() - $$0.O >= 180.0F) {
            $$0.O += 360.0F;
         }

         while ($$0.dA() - $$0.N < -180.0F) {
            $$0.N -= 360.0F;
         }

         while ($$0.dA() - $$0.N >= 180.0F) {
            $$0.N += 360.0F;
         }

         $$0.s(arp.i($$1, $$0.O, $$0.dC()));
         $$0.r(arp.i($$1, $$0.N, $$0.dA()));
      }
   }

   public static bgp a(biy $$0, cis $$1) {
      return $$0.eR().a($$1) ? bgp.a : bgp.b;
   }

   public static cbs a(biy $$0, cix $$1, float $$2) {
      cgl $$3 = (cgl)($$1.d() instanceof cgl ? $$1.d() : cja.nH);
      cbs $$4 = $$3.a($$0.dK(), $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(cja.uw) && $$4 instanceof cbu) {
         ((cbu)$$4).a($$1);
      }

      return $$4;
   }
}
