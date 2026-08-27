import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctt extends csd {
   private static final int c = 6;
   public static final int a = 3;
   public static final List<dfv> b = List.of(dfu.bp, dfu.bq, dfu.br, dfu.bs, dfu.bt, dfu.bu);

   public ctt(dfd.d $$0) {
      super($$0);
      dfe $$1 = this.C.b().a(cwj.aC, hc.c);

      for (dfv $$2 : b) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.c_($$2) instanceof dcz $$6) {
         Optional<ehh> $$8 = a($$5, $$0.c(cwj.aC));
         if ($$8.isEmpty()) {
            return bgt.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(b.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return bgt.a($$1.B);
            } else {
               cja $$10 = $$3.b($$4);
               if ($$10.a(apw.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return bgt.a($$1.B);
               } else {
                  return bgt.b;
               }
            }
         }
      } else {
         return bgt.d;
      }
   }

   private static Optional<ehh> a(ehe $$0, hc $$1) {
      hc $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         gw $$3 = $$0.a().a($$2);
         ehi $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ehh((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ehh((float)$$5, (float)$$6));
            case e -> Optional.of(new ehh((float)$$7, (float)$$6));
            case f -> Optional.of(new ehh((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(ehh $$0) {
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

   private static void a(cpq $$0, gw $$1, cbp $$2, dcz $$3, cja $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(apj.c.b($$4.d()));
         aoy $$6 = $$4.a(cjd.tC) ? aoz.et : aoz.es;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, apa.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(cpq $$0, gw $$1, cbp $$2, dcz $$3, int $$4) {
      if (!$$0.B) {
         cja $$5 = $$3.a($$4, 1);
         aoy $$6 = $$5.a(cjd.tC) ? aoz.ew : aoz.ev;
         $$0.a(null, $$1, $$6, apa.e, 1.0F, 1.0F);
         if (!$$2.fQ().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, djo.c, $$1);
      }
   }

   @Nullable
   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dcz($$0, $$1);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(cwj.aC);
      b.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dcz $$6 && !$$6.aa_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cja $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bgp.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(cwj.aC, $$0.g().g());
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(cwj.aC, $$1.a($$0.c(cwj.aC)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(cwj.aC)));
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      if ($$1.r_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dcz $$3 ? $$3.g() + 1 : 0;
      }
   }
}
