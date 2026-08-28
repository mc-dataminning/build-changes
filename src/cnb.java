import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cnb {
   private static final float a = 0.3F;

   public static evx a(bsd $$0, Predicate<bsd> $$1) {
      evz $$2 = $$0.ds();
      dcd $$3 = $$0.dP();
      evz $$4 = $$0.dn();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dbm.a.a);
   }

   public static evx a(bsd $$0, Predicate<bsd> $$1, dbm.a $$2) {
      evz $$3 = $$0.ds();
      dcd $$4 = $$0.dP();
      evz $$5 = $$0.dn();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static evx a(bsd $$0, Predicate<bsd> $$1, double $$2) {
      evz $$3 = $$0.g(0.0F).a($$2);
      dcd $$4 = $$0.dP();
      evz $$5 = $$0.bx();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dbm.a.a);
   }

   private static evx a(evz $$0, bsd $$1, Predicate<bsd> $$2, evz $$3, dcd $$4, float $$5, dbm.a $$6) {
      evz $$7 = $$0.e($$3);
      evx $$8 = $$4.a(new dbm($$0, $$7, $$6, dbm.b.a, $$1));
      if ($$8.c() != evx.a.a) {
         $$7 = $$8.e();
      }

      evx $$9 = a($$4, $$1, $$0, $$7, $$1.cK().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static evw a(bsd $$0, evz $$1, evz $$2, evu $$3, Predicate<bsd> $$4, double $$5) {
      dcd $$6 = $$0.dP();
      double $$7 = $$5;
      bsd $$8 = null;
      evz $$9 = null;

      for (bsd $$10 : $$6.a($$0, $$3, $$4)) {
         evu $$11 = $$10.cK().g((double)$$10.bK());
         Optional<evz> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            evz $$13 = $$12.get();
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

      return $$8 == null ? null : new evw($$8, $$9);
   }

   @Nullable
   public static evw a(dcd $$0, bsd $$1, evz $$2, evz $$3, evu $$4, Predicate<bsd> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static evw a(dcd $$0, bsd $$1, evz $$2, evz $$3, evu $$4, Predicate<bsd> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bsd $$8 = null;

      for (bsd $$9 : $$0.a($$1, $$4, $$5)) {
         evu $$10 = $$9.cK().g((double)$$6);
         Optional<evz> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new evw($$8);
   }

   public static void a(bsd $$0, float $$1) {
      evz $$2 = $$0.ds();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.s((float)(aye.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.t((float)(aye.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.t(aye.i($$1, $$0.P, $$0.dH()));
         $$0.s(aye.i($$1, $$0.O, $$0.dF()));
      }
   }

   public static bqc a(bsy $$0, ctv $$1) {
      return $$0.eT().a($$1) ? bqc.a : bqc.b;
   }

   public static cmn a(bsy $$0, cua $$1, float $$2, @Nullable cua $$3) {
      crt $$4 = (crt)($$1.g() instanceof crt ? $$1.g() : cud.ov);
      cmn $$5 = $$4.a($$0.dP(), $$1, $$0, $$3);
      $$5.a($$2);
      return $$5;
   }
}
