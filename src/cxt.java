import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxt extends cwb {
   public static final MapCodec<cxt> a = b(cxt::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<djx> c = List.of(djw.bp, djw.bq, djw.br, djw.bs, djw.bt, djw.bu);

   @Override
   public MapCodec<cxt> a() {
      return a;
   }

   public cxt(djf.d $$0) {
      super($$0);
      djg $$1 = this.E.b().a(dak.aE, ic.c);

      for (djx $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.c_($$2) instanceof dhd $$6) {
         Optional<elr> $$8 = a($$5, $$0.c(dak.aE));
         if ($$8.isEmpty()) {
            return bka.d;
         } else {
            int $$9 = a($$8.get());
            if ($$0.c(c.get($$9))) {
               a($$1, $$2, $$3, $$6, $$9);
               return bka.a($$1.B);
            } else {
               cmx $$10 = $$3.b($$4);
               if ($$10.a(aso.av)) {
                  a($$1, $$2, $$3, $$6, $$10, $$9);
                  return bka.a($$1.B);
               } else {
                  return bka.b;
               }
            }
         }
      } else {
         return bka.d;
      }
   }

   private static Optional<elr> a(elo $$0, ic $$1) {
      ic $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         hx $$3 = $$0.a().a($$2);
         els $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new elr((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new elr((float)$$5, (float)$$6));
            case e -> Optional.of(new elr((float)$$7, (float)$$6));
            case f -> Optional.of(new elr((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(elr $$0) {
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

   private static void a(cto $$0, hx $$1, cfh $$2, dhd $$3, cmx $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(asb.c.b($$4.d()));
         arq $$6 = $$4.a(cna.up) ? arr.eC : arr.eB;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, ars.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(cto $$0, hx $$1, cfh $$2, dhd $$3, int $$4) {
      if (!$$0.B) {
         cmx $$5 = $$3.a($$4, 1);
         arq $$6 = $$5.a(cna.up) ? arr.eF : arr.eE;
         $$0.a(null, $$1, $$6, ars.e, 1.0F, 1.0F);
         if (!$$2.fS().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dnq.c, $$1);
      }
   }

   @Nullable
   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhd($$0, $$1);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(dak.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dhd $$6 && !$$6.ai_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cmx $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bjw.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(dak.aE, $$0.g().g());
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(dak.aE, $$1.a($$0.c(dak.aE)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(dak.aE)));
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      if ($$1.y_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dhd $$3 ? $$3.g() + 1 : 0;
      }
   }
}
