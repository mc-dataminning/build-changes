import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dgf extends den {
   public static final MapCodec<dgf> a = b(dgf::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dsv> c = List.of(dsu.bp, dsu.bq, dsu.br, dsu.bs, dsu.bt, dsu.bu);

   @Override
   public MapCodec<dgf> a() {
      return a;
   }

   public dgf(dsd.d $$0) {
      super($$0);
      dse $$1 = this.E.b().a(dix.aE, je.c);

      for (dsv $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      if ($$2.c_($$3) instanceof dps $$7) {
         if (!$$0.a(awy.aW)) {
            return bqy.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bqy.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bqy.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bqy.a($$2.B);
            }
         }
      } else {
         return bqy.e;
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.c_($$2) instanceof dps $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bqw.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bqw.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bqw.a($$1.B);
         }
      } else {
         return bqw.e;
      }
   }

   private OptionalInt a(evp $$0, dse $$1) {
      return a($$0, $$1.c(dix.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<evs> a(evp $$0, je $$1) {
      je $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         iz $$3 = $$0.a().a($$2);
         evt $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new evs((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new evs((float)$$5, (float)$$6));
            case e -> Optional.of(new evs((float)$$7, (float)$$6));
            case f -> Optional.of(new evs((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dca $$0, iz $$1, cmz $$2, dps $$3, cur $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(awk.c.b($$4.g()));
         avz $$6 = $$4.a(cuu.uw) ? awa.fa : awa.eZ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(dca $$0, iz $$1, cmz $$2, dps $$3, int $$4) {
      if (!$$0.B) {
         cur $$5 = $$3.a($$4, 1);
         avz $$6 = $$5.a(cuu.uw) ? awa.fd : awa.fc;
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         if (!$$2.gc().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dwx.c, $$1);
      }
   }

   @Nullable
   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dps($$0, $$1);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(dix.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dps $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cur $$8 = $$6.a($$7);
               if (!$$8.e()) {
                  bqs.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(dix.aE, $$0.g().g());
   }

   @Override
   public dse a(dse $$0, dlo $$1) {
      return $$0.a(dix.aE, $$1.a($$0.c(dix.aE)));
   }

   @Override
   public dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(dix.aE)));
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dps $$3 ? $$3.j() + 1 : 0;
      }
   }
}
