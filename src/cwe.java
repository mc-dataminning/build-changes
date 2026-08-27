import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwe extends cum {
   public static final MapCodec<cwe> a = b(cwe::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dhz> c = List.of(dhy.bp, dhy.bq, dhy.br, dhy.bs, dhy.bt, dhy.bu);

   @Override
   public MapCodec<cwe> a() {
      return a;
   }

   public cwe(dhh.d $$0) {
      super($$0);
      dhi $$1 = this.E.b().a(cyv.aE, hx.c);

      for (dhz $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.c_($$2) instanceof dfm $$6) {
         Optional<ejt> $$8 = a($$5, $$0.c(cyv.aE));
         if ($$8.isEmpty()) {
            return bix.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(c.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return bix.a($$1.B);
            } else {
               clj $$10 = $$3.b($$4);
               if ($$10.a(aro.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return bix.a($$1.B);
               } else {
                  return bix.b;
               }
            }
         }
      } else {
         return bix.d;
      }
   }

   private static Optional<ejt> a(ejq $$0, hx $$1) {
      hx $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ht $$3 = $$0.a().a($$2);
         eju $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ejt((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ejt((float)$$5, (float)$$6));
            case e -> Optional.of(new ejt((float)$$7, (float)$$6));
            case f -> Optional.of(new ejt((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(ejt $$0) {
      int $$1 = $$0.j >= 0.5F ? 0 : 1;
      int $$2 = a($$0.i);
      return $$2 + $$1 * 3;
   }

   private static int a(float $$0) {
      float $$1 = 0.0625F;
      float $$2 = 0.375F;
      if ($$0 < 0.375F) {
         return 0;
      } else {
         float $$3 = 0.6875F;
         return $$0 < 0.6875F ? 1 : 2;
      }
   }

   private static void a(csa $$0, ht $$1, cdu $$2, dfm $$3, clj $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(arb.c.b($$4.d()));
         aqq $$6 = $$4.a(clm.uo) ? aqr.et : aqr.es;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, aqs.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(csa $$0, ht $$1, cdu $$2, dfm $$3, int $$4) {
      if (!$$0.B) {
         clj $$5 = $$3.a($$4, 1);
         aqq $$6 = $$5.a(clm.uo) ? aqr.ew : aqr.ev;
         $$0.a(null, $$1, $$6, aqs.e, 1.0F, 1.0F);
         if (!$$2.fT().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dls.c, $$1);
      }
   }

   @Nullable
   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfm($$0, $$1);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(cyv.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dfm $$6 && !$$6.ai_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               clj $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bit.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(cyv.aE, $$0.g().g());
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(cyv.aE, $$1.a($$0.c(cyv.aE)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(cyv.aE)));
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dfm $$3 ? $$3.g() + 1 : 0;
      }
   }
}
