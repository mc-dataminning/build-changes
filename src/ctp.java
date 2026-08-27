import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctp extends crz {
   private static final int c = 6;
   public static final int a = 3;
   public static final List<dfr> b = List.of(dfq.bp, dfq.bq, dfq.br, dfq.bs, dfq.bt, dfq.bu);

   public ctp(dez.d $$0) {
      super($$0);
      dfa $$1 = this.C.b().a(cwf.aC, ha.c);

      for (dfr $$2 : b) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.c_($$2) instanceof dcv $$6) {
         Optional<ehd> $$8 = a($$5, $$0.c(cwf.aC));
         if ($$8.isEmpty()) {
            return bgq.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(b.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return bgq.a($$1.B);
            } else {
               ciy $$10 = $$3.b($$4);
               if ($$10.a(apt.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return bgq.a($$1.B);
               } else {
                  return bgq.b;
               }
            }
         }
      } else {
         return bgq.d;
      }
   }

   private static Optional<ehd> a(eha $$0, ha $$1) {
      ha $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         gu $$3 = $$0.a().a($$2);
         ehe $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ehd((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ehd((float)$$5, (float)$$6));
            case e -> Optional.of(new ehd((float)$$7, (float)$$6));
            case f -> Optional.of(new ehd((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(ehd $$0) {
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

   private static void a(cpm $$0, gu $$1, cbn $$2, dcv $$3, ciy $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(apg.c.b($$4.d()));
         aov $$6 = $$4.a(cjb.tC) ? aow.et : aow.es;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, aox.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(cpm $$0, gu $$1, cbn $$2, dcv $$3, int $$4) {
      if (!$$0.B) {
         ciy $$5 = $$3.a($$4, 1);
         aov $$6 = $$5.a(cjb.tC) ? aow.ew : aow.ev;
         $$0.a(null, $$1, $$6, aox.e, 1.0F, 1.0F);
         if (!$$2.fQ().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, djk.c, $$1);
      }
   }

   @Nullable
   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dcv($$0, $$1);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(cwf.aC);
      b.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dcv $$6 && !$$6.ab_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               ciy $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bgm.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dfa a(clg $$0) {
      return this.n().a(cwf.aC, $$0.g().g());
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(cwf.aC, $$1.a($$0.c(cwf.aC)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(cwf.aC)));
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      if ($$1.r_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dcv $$3 ? $$3.g() + 1 : 0;
      }
   }
}
