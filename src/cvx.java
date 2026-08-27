import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvx extends cuf {
   public static final MapCodec<cvx> a = b(cvx::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dhn> c = List.of(dhm.bp, dhm.bq, dhm.br, dhm.bs, dhm.bt, dhm.bu);

   @Override
   public MapCodec<cvx> a() {
      return a;
   }

   public cvx(dgv.d $$0) {
      super($$0);
      dgw $$1 = this.E.b().a(cyo.aE, hx.c);

      for (dhn $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.c_($$2) instanceof dfa $$6) {
         Optional<ejh> $$8 = a($$5, $$0.c(cyo.aE));
         if ($$8.isEmpty()) {
            return biq.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(c.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return biq.a($$1.B);
            } else {
               clb $$10 = $$3.b($$4);
               if ($$10.a(ark.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return biq.a($$1.B);
               } else {
                  return biq.b;
               }
            }
         }
      } else {
         return biq.d;
      }
   }

   private static Optional<ejh> a(eje $$0, hx $$1) {
      hx $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ht $$3 = $$0.a().a($$2);
         eji $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ejh((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ejh((float)$$5, (float)$$6));
            case e -> Optional.of(new ejh((float)$$7, (float)$$6));
            case f -> Optional.of(new ejh((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(ejh $$0) {
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

   private static void a(crs $$0, ht $$1, cdm $$2, dfa $$3, clb $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(aqx.c.b($$4.d()));
         aqm $$6 = $$4.a(cle.tD) ? aqn.et : aqn.es;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, aqo.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(crs $$0, ht $$1, cdm $$2, dfa $$3, int $$4) {
      if (!$$0.B) {
         clb $$5 = $$3.a($$4, 1);
         aqm $$6 = $$5.a(cle.tD) ? aqn.ew : aqn.ev;
         $$0.a(null, $$1, $$6, aqo.e, 1.0F, 1.0F);
         if (!$$2.fS().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dlg.c, $$1);
      }
   }

   @Nullable
   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfa($$0, $$1);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(cyo.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dfa $$6 && !$$6.ai_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               clb $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bim.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(cyo.aE, $$0.g().g());
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(cyo.aE, $$1.a($$0.c(cyo.aE)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(cyo.aE)));
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dfa $$3 ? $$3.g() + 1 : 0;
      }
   }
}
