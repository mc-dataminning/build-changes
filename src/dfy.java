import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dfy extends deg {
   public static final MapCodec<dfy> a = b(dfy::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dso> c = List.of(dsn.bp, dsn.bq, dsn.br, dsn.bs, dsn.bt, dsn.bu);

   @Override
   public MapCodec<dfy> a() {
      return a;
   }

   public dfy(drw.d $$0) {
      super($$0);
      drx $$1 = this.E.b().a(diq.aE, je.c);

      for (dso $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if ($$2.c_($$3) instanceof dpl $$7) {
         if (!$$0.a(awu.aW)) {
            return bqr.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bqr.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bqr.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bqr.a($$2.B);
            }
         }
      } else {
         return bqr.e;
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.c_($$2) instanceof dpl $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bqp.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bqp.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bqp.a($$1.B);
         }
      } else {
         return bqp.e;
      }
   }

   private OptionalInt a(evi $$0, drx $$1) {
      return a($$0, $$1.c(diq.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<evl> a(evi $$0, je $$1) {
      je $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         iz $$3 = $$0.a().a($$2);
         evm $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new evl((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new evl((float)$$5, (float)$$6));
            case e -> Optional.of(new evl((float)$$7, (float)$$6));
            case f -> Optional.of(new evl((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dbt $$0, iz $$1, cms $$2, dpl $$3, cuk $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(awg.c.b($$4.g()));
         avv $$6 = $$4.a(cun.uw) ? avw.fa : avw.eZ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, avx.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(dbt $$0, iz $$1, cms $$2, dpl $$3, int $$4) {
      if (!$$0.B) {
         cuk $$5 = $$3.a($$4, 1);
         avv $$6 = $$5.a(cun.uw) ? avw.fd : avw.fc;
         $$0.a(null, $$1, $$6, avx.e, 1.0F, 1.0F);
         if (!$$2.gc().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dwq.c, $$1);
      }
   }

   @Nullable
   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpl($$0, $$1);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(diq.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dpl $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cuk $$8 = $$6.a($$7);
               if (!$$8.e()) {
                  bql.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(diq.aE, $$0.g().g());
   }

   @Override
   public drx a(drx $$0, dlh $$1) {
      return $$0.a(diq.aE, $$1.a($$0.c(diq.aE)));
   }

   @Override
   public drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(diq.aE)));
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dpl $$3 ? $$3.j() + 1 : 0;
      }
   }
}
