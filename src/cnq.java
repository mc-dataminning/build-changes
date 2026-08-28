import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class cnq {
   private static final float a = 0.3F;

   public static evo a(bst $$0, Predicate<bst> $$1) {
      evq $$2 = $$0.ds();
      dbx $$3 = $$0.dP();
      evq $$4 = $$0.dn();
      return a($$4, $$0, $$1, $$2, $$3, 0.3F, dbg.a.a);
   }

   public static evo a(bst $$0, Predicate<bst> $$1, dbg.a $$2) {
      evq $$3 = $$0.ds();
      dbx $$4 = $$0.dP();
      evq $$5 = $$0.dn();
      return a($$5, $$0, $$1, $$3, $$4, 0.3F, $$2);
   }

   public static evo a(bst $$0, Predicate<bst> $$1, double $$2) {
      evq $$3 = $$0.f(0.0F).a($$2);
      dbx $$4 = $$0.dP();
      evq $$5 = $$0.bx();
      return a($$5, $$0, $$1, $$3, $$4, 0.0F, dbg.a.a);
   }

   private static evo a(evq $$0, bst $$1, Predicate<bst> $$2, evq $$3, dbx $$4, float $$5, dbg.a $$6) {
      evq $$7 = $$0.e($$3);
      evo $$8 = $$4.a(new dbg($$0, $$7, $$6, dbg.b.a, $$1));
      if ($$8.c() != evo.a.a) {
         $$7 = $$8.e();
      }

      evo $$9 = a($$4, $$1, $$0, $$7, $$1.cK().b($$3).g(1.0), $$2, $$5);
      if ($$9 != null) {
         $$8 = $$9;
      }

      return $$8;
   }

   @Nullable
   public static evn a(bst $$0, evq $$1, evq $$2, evl $$3, Predicate<bst> $$4, double $$5) {
      dbx $$6 = $$0.dP();
      double $$7 = $$5;
      bst $$8 = null;
      evq $$9 = null;

      for (bst $$10 : $$6.a($$0, $$3, $$4)) {
         evl $$11 = $$10.cK().g((double)$$10.bK());
         Optional<evq> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = $$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            evq $$13 = $$12.get();
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

      return $$8 == null ? null : new evn($$8, $$9);
   }

   @Nullable
   public static evn a(dbx $$0, bst $$1, evq $$2, evq $$3, evl $$4, Predicate<bst> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static evn a(dbx $$0, bst $$1, evq $$2, evq $$3, evl $$4, Predicate<bst> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bst $$8 = null;

      for (bst $$9 : $$0.a($$1, $$4, $$5)) {
         evl $$10 = $$9.cK().g((double)$$6);
         Optional<evq> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g($$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new evn($$8);
   }

   public static void a(bst $$0, float $$1) {
      evq $$2 = $$0.ds();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.r((float)(ayy.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.s((float)(ayy.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

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

         $$0.s(ayy.i($$1, $$0.P, $$0.dH()));
         $$0.r(ayy.i($$1, $$0.O, $$0.dF()));
      }
   }

   public static bqs a(bto $$0, cuj $$1) {
      return $$0.eX().a($$1) ? bqs.a : bqs.b;
   }

   public static cnc a(bto $$0, cuo $$1, float $$2) {
      csh $$3 = (csh)($$1.g() instanceof csh ? $$1.g() : cur.ov);
      cnc $$4 = $$3.a($$0.dP(), $$1, $$0);
      $$4.a($$0, $$2);
      return $$4;
   }
}
