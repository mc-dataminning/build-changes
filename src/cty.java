import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cty extends csi {
   private static final int c = 6;
   public static final int a = 3;
   public static final List<dga> b = List.of(dfz.bp, dfz.bq, dfz.br, dfz.bs, dfz.bt, dfz.bu);

   public cty(dfi.d $$0) {
      super($$0);
      dfj $$1 = this.C.b().a(cwo.aC, hc.c);

      for (dga $$2 : b) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.c_($$2) instanceof dde $$6) {
         Optional<ehm> $$8 = a($$5, $$0.c(cwo.aC));
         if ($$8.isEmpty()) {
            return bgy.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(b.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return bgy.a($$1.B);
            } else {
               cjf $$10 = $$3.b($$4);
               if ($$10.a(aqb.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return bgy.a($$1.B);
               } else {
                  return bgy.b;
               }
            }
         }
      } else {
         return bgy.d;
      }
   }

   private static Optional<ehm> a(ehj $$0, hc $$1) {
      hc $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         gw $$3 = $$0.a().a($$2);
         ehn $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ehm((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ehm((float)$$5, (float)$$6));
            case e -> Optional.of(new ehm((float)$$7, (float)$$6));
            case f -> Optional.of(new ehm((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(ehm $$0) {
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

   private static void a(cpv $$0, gw $$1, cbu $$2, dde $$3, cjf $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(apo.c.b($$4.d()));
         apd $$6 = $$4.a(cji.tC) ? ape.et : ape.es;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, apf.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(cpv $$0, gw $$1, cbu $$2, dde $$3, int $$4) {
      if (!$$0.B) {
         cjf $$5 = $$3.a($$4, 1);
         apd $$6 = $$5.a(cji.tC) ? ape.ew : ape.ev;
         $$0.a(null, $$1, $$6, apf.e, 1.0F, 1.0F);
         if (!$$2.fR().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, djt.c, $$1);
      }
   }

   @Nullable
   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dde($$0, $$1);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(cwo.aC);
      b.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dde $$6 && !$$6.af_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cjf $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bgu.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(cwo.aC, $$0.g().g());
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(cwo.aC, $$1.a($$0.c(cwo.aC)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(cwo.aC)));
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      if ($$1.w_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dde $$3 ? $$3.g() + 1 : 0;
      }
   }
}
