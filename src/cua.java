import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cua extends csk {
   private static final int c = 6;
   public static final int a = 3;
   public static final List<dgc> b = List.of(dgb.bp, dgb.bq, dgb.br, dgb.bs, dgb.bt, dgb.bu);

   public cua(dfk.d $$0) {
      super($$0);
      dfl $$1 = this.C.b().a(cwq.aC, hc.c);

      for (dgc $$2 : b) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.c_($$2) instanceof ddg $$6) {
         Optional<eho> $$8 = a($$5, $$0.c(cwq.aC));
         if ($$8.isEmpty()) {
            return bha.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(b.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return bha.a($$1.B);
            } else {
               cjh $$10 = $$3.b($$4);
               if ($$10.a(aqc.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return bha.a($$1.B);
               } else {
                  return bha.b;
               }
            }
         }
      } else {
         return bha.d;
      }
   }

   private static Optional<eho> a(ehl $$0, hc $$1) {
      hc $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         gw $$3 = $$0.a().a($$2);
         ehp $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new eho((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new eho((float)$$5, (float)$$6));
            case e -> Optional.of(new eho((float)$$7, (float)$$6));
            case f -> Optional.of(new eho((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(eho $$0) {
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

   private static void a(cpx $$0, gw $$1, cbw $$2, ddg $$3, cjh $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(app.c.b($$4.d()));
         ape $$6 = $$4.a(cjk.tC) ? apf.et : apf.es;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, apg.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(cpx $$0, gw $$1, cbw $$2, ddg $$3, int $$4) {
      if (!$$0.B) {
         cjh $$5 = $$3.a($$4, 1);
         ape $$6 = $$5.a(cjk.tC) ? apf.ew : apf.ev;
         $$0.a(null, $$1, $$6, apg.e, 1.0F, 1.0F);
         if (!$$2.fR().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, djv.c, $$1);
      }
   }

   @Nullable
   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddg($$0, $$1);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(cwq.aC);
      b.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof ddg $$6 && !$$6.af_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cjh $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bgw.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(cwq.aC, $$0.g().g());
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(cwq.aC, $$1.a($$0.c(cwq.aC)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(cwq.aC)));
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      if ($$1.w_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof ddg $$3 ? $$3.g() + 1 : 0;
      }
   }
}
