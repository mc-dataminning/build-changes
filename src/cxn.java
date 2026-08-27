import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxn extends cvv {
   public static final MapCodec<cxn> a = b(cxn::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<djr> c = List.of(djq.bp, djq.bq, djq.br, djq.bs, djq.bt, djq.bu);

   @Override
   public MapCodec<cxn> a() {
      return a;
   }

   public cxn(diz.d $$0) {
      super($$0);
      dja $$1 = this.E.b().a(dae.aE, ic.c);

      for (djr $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.c_($$2) instanceof dgx $$6) {
         Optional<ell> $$8 = a($$5, $$0.c(dae.aE));
         if ($$8.isEmpty()) {
            return bjv.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(c.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return bjv.a($$1.B);
            } else {
               cmr $$10 = $$3.b($$4);
               if ($$10.a(asj.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return bjv.a($$1.B);
               } else {
                  return bjv.b;
               }
            }
         }
      } else {
         return bjv.d;
      }
   }

   private static Optional<ell> a(eli $$0, ic $$1) {
      ic $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         hx $$3 = $$0.a().a($$2);
         elm $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ell((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ell((float)$$5, (float)$$6));
            case e -> Optional.of(new ell((float)$$7, (float)$$6));
            case f -> Optional.of(new ell((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(ell $$0) {
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

   private static void a(cti $$0, hx $$1, cfb $$2, dgx $$3, cmr $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(arw.c.b($$4.d()));
         arl $$6 = $$4.a(cmu.up) ? arm.eC : arm.eB;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, arn.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(cti $$0, hx $$1, cfb $$2, dgx $$3, int $$4) {
      if (!$$0.B) {
         cmr $$5 = $$3.a($$4, 1);
         arl $$6 = $$5.a(cmu.up) ? arm.eF : arm.eE;
         $$0.a(null, $$1, $$6, arn.e, 1.0F, 1.0F);
         if (!$$2.fS().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dnk.c, $$1);
      }
   }

   @Nullable
   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dgx($$0, $$1);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(dae.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dgx $$6 && !$$6.ai_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cmr $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bjr.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(dae.aE, $$0.g().g());
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(dae.aE, $$1.a($$0.c(dae.aE)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(dae.aE)));
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      if ($$1.y_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dgx $$3 ? $$3.g() + 1 : 0;
      }
   }
}
