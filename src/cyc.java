import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cyc extends cwk {
   public static final MapCodec<cyc> a = b(cyc::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dkg> c = List.of(dkf.bp, dkf.bq, dkf.br, dkf.bs, dkf.bt, dkf.bu);

   @Override
   public MapCodec<cyc> a() {
      return a;
   }

   public cyc(djo.d $$0) {
      super($$0);
      djp $$1 = this.E.b().a(dat.aE, ic.c);

      for (dkg $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if ($$2.c_($$3) instanceof dhm $$7) {
         if (!$$0.a(asq.av)) {
            return bke.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bke.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bke.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bke.a($$2.B);
            }
         }
      } else {
         return bke.e;
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.c_($$2) instanceof dhm $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bkc.d;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bkc.b;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bkc.a($$1.B);
         }
      } else {
         return bkc.d;
      }
   }

   private OptionalInt a(ely $$0, djp $$1) {
      return a($$0, $$1.c(dat.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<emb> a(ely $$0, ic $$1) {
      ic $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         hx $$3 = $$0.a().a($$2);
         emc $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new emb((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new emb((float)$$5, (float)$$6));
            case e -> Optional.of(new emb((float)$$7, (float)$$6));
            case f -> Optional.of(new emb((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
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

   private static void a(ctx $$0, hx $$1, cfq $$2, dhm $$3, cng $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(asd.c.b($$4.d()));
         ars $$6 = $$4.a(cnj.us) ? art.eR : art.eQ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, aru.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(ctx $$0, hx $$1, cfq $$2, dhm $$3, int $$4) {
      if (!$$0.B) {
         cng $$5 = $$3.a($$4, 1);
         ars $$6 = $$5.a(cnj.us) ? art.eU : art.eT;
         $$0.a(null, $$1, $$6, aru.e, 1.0F, 1.0F);
         if (!$$2.fS().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dnz.c, $$1);
      }
   }

   @Nullable
   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dhm($$0, $$1);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(dat.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dhm $$6 && !$$6.aj_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cng $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bjy.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(dat.aE, $$0.g().g());
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(dat.aE, $$1.a($$0.c(dat.aE)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(dat.aE)));
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      if ($$1.y_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dhm $$3 ? $$3.g() + 1 : 0;
      }
   }
}
