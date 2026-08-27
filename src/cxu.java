import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxu extends cwc {
   public static final MapCodec<cxu> a = b(cxu::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<djy> c = List.of(djx.bp, djx.bq, djx.br, djx.bs, djx.bt, djx.bu);

   @Override
   public MapCodec<cxu> a() {
      return a;
   }

   public cxu(djg.d $$0) {
      super($$0);
      djh $$1 = this.E.b().a(dal.aE, ic.c);

      for (djy $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.c_($$2) instanceof dhe $$6) {
         Optional<els> $$8 = a($$5, $$0.c(dal.aE));
         if ($$8.isEmpty()) {
            return bkb.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(c.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return bkb.a($$1.B);
            } else {
               cmy $$10 = $$3.b($$4);
               if ($$10.a(asp.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return bkb.a($$1.B);
               } else {
                  return bkb.b;
               }
            }
         }
      } else {
         return bkb.d;
      }
   }

   private static Optional<els> a(elp $$0, ic $$1) {
      ic $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         hx $$3 = $$0.a().a($$2);
         elt $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new els((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new els((float)$$5, (float)$$6));
            case e -> Optional.of(new els((float)$$7, (float)$$6));
            case f -> Optional.of(new els((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(els $$0) {
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

   private static void a(ctp $$0, hx $$1, cfi $$2, dhe $$3, cmy $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(asc.c.b($$4.d()));
         arr $$6 = $$4.a(cnb.up) ? ars.eC : ars.eB;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, art.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(ctp $$0, hx $$1, cfi $$2, dhe $$3, int $$4) {
      if (!$$0.B) {
         cmy $$5 = $$3.a($$4, 1);
         arr $$6 = $$5.a(cnb.up) ? ars.eF : ars.eE;
         $$0.a(null, $$1, $$6, art.e, 1.0F, 1.0F);
         if (!$$2.fS().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dnr.c, $$1);
      }
   }

   @Nullable
   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhe($$0, $$1);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(dal.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dhe $$6 && !$$6.ai_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cmy $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bjx.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(dal.aE, $$0.g().g());
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(dal.aE, $$1.a($$0.c(dal.aE)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(dal.aE)));
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      if ($$1.y_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dhe $$3 ? $$3.g() + 1 : 0;
      }
   }
}
