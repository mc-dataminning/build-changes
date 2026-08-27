import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cve extends ctm {
   public static final MapCodec<cve> a = b(cve::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dgs> c = List.of(dgr.bp, dgr.bq, dgr.br, dgr.bs, dgr.bt, dgr.bu);

   @Override
   public MapCodec<cve> a() {
      return a;
   }

   public cve(dga.d $$0) {
      super($$0);
      dgb $$1 = this.E.b().a(cxu.aE, hx.c);

      for (dgs $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.c_($$2) instanceof deg $$6) {
         Optional<eie> $$8 = a($$5, $$0.c(cxu.aE));
         if ($$8.isEmpty()) {
            return bib.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(c.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return bib.a($$1.B);
            } else {
               ckj $$10 = $$3.b($$4);
               if ($$10.a(ara.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return bib.a($$1.B);
               } else {
                  return bib.b;
               }
            }
         }
      } else {
         return bib.d;
      }
   }

   private static Optional<eie> a(eib $$0, hx $$1) {
      hx $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ht $$3 = $$0.a().a($$2);
         eif $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new eie((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new eie((float)$$5, (float)$$6));
            case e -> Optional.of(new eie((float)$$7, (float)$$6));
            case f -> Optional.of(new eie((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(eie $$0) {
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

   private static void a(cqz $$0, ht $$1, ccx $$2, deg $$3, ckj $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(aqn.c.b($$4.d()));
         aqc $$6 = $$4.a(ckm.tC) ? aqd.et : aqd.es;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, aqe.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(cqz $$0, ht $$1, ccx $$2, deg $$3, int $$4) {
      if (!$$0.B) {
         ckj $$5 = $$3.a($$4, 1);
         aqc $$6 = $$5.a(ckm.tC) ? aqd.ew : aqd.ev;
         $$0.a(null, $$1, $$6, aqe.e, 1.0F, 1.0F);
         if (!$$2.fS().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dkl.c, $$1);
      }
   }

   @Nullable
   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new deg($$0, $$1);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(cxu.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof deg $$6 && !$$6.ai_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               ckj $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bhx.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(cxu.aE, $$0.g().g());
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(cxu.aE, $$1.a($$0.c(cxu.aE)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(cxu.aE)));
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof deg $$3 ? $$3.g() + 1 : 0;
      }
   }
}
