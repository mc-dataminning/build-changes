import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dgb extends dej {
   public static final MapCodec<dgb> a = b(dgb::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dsr> c = List.of(dsq.bp, dsq.bq, dsq.br, dsq.bs, dsq.bt, dsq.bu);

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   public dgb(drz.d $$0) {
      super($$0);
      dsa $$1 = this.E.b().a(dit.aE, je.c);

      for (dsr $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if ($$2.c_($$3) instanceof dpo $$7) {
         if (!$$0.a(awx.aW)) {
            return bqu.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bqu.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bqu.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bqu.a($$2.B);
            }
         }
      } else {
         return bqu.e;
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.c_($$2) instanceof dpo $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bqs.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bqs.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bqs.a($$1.B);
         }
      } else {
         return bqs.e;
      }
   }

   private OptionalInt a(evl $$0, dsa $$1) {
      return a($$0, $$1.c(dit.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<evo> a(evl $$0, je $$1) {
      je $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         iz $$3 = $$0.a().a($$2);
         evp $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new evo((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new evo((float)$$5, (float)$$6));
            case e -> Optional.of(new evo((float)$$7, (float)$$6));
            case f -> Optional.of(new evo((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dbw $$0, iz $$1, cmv $$2, dpo $$3, cun $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(awj.c.b($$4.g()));
         avy $$6 = $$4.a(cuq.uw) ? avz.fa : avz.eZ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, awa.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(dbw $$0, iz $$1, cmv $$2, dpo $$3, int $$4) {
      if (!$$0.B) {
         cun $$5 = $$3.a($$4, 1);
         avy $$6 = $$5.a(cuq.uw) ? avz.fd : avz.fc;
         $$0.a(null, $$1, $$6, awa.e, 1.0F, 1.0F);
         if (!$$2.gc().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dwt.c, $$1);
      }
   }

   @Nullable
   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpo($$0, $$1);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(dit.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dpo $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cun $$8 = $$6.a($$7);
               if (!$$8.e()) {
                  bqo.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(dit.aE, $$0.g().g());
   }

   @Override
   public dsa a(dsa $$0, dlk $$1) {
      return $$0.a(dit.aE, $$1.a($$0.c(dit.aE)));
   }

   @Override
   public dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(dit.aE)));
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dpo $$3 ? $$3.j() + 1 : 0;
      }
   }
}
