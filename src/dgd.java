import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dgd extends del {
   public static final MapCodec<dgd> a = b(dgd::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dst> c = List.of(dss.bp, dss.bq, dss.br, dss.bs, dss.bt, dss.bu);

   @Override
   public MapCodec<dgd> a() {
      return a;
   }

   public dgd(dsb.d $$0) {
      super($$0);
      dsc $$1 = this.E.b().a(div.aE, je.c);

      for (dst $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if ($$2.c_($$3) instanceof dpq $$7) {
         if (!$$0.a(awy.aW)) {
            return bqw.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bqw.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bqw.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bqw.a($$2.B);
            }
         }
      } else {
         return bqw.e;
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.c_($$2) instanceof dpq $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bqu.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bqu.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bqu.a($$1.B);
         }
      } else {
         return bqu.e;
      }
   }

   private OptionalInt a(evn $$0, dsc $$1) {
      return a($$0, $$1.c(div.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<evq> a(evn $$0, je $$1) {
      je $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         iz $$3 = $$0.a().a($$2);
         evr $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new evq((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new evq((float)$$5, (float)$$6));
            case e -> Optional.of(new evq((float)$$7, (float)$$6));
            case f -> Optional.of(new evq((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dby $$0, iz $$1, cmx $$2, dpq $$3, cup $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(awk.c.b($$4.g()));
         avz $$6 = $$4.a(cus.uw) ? awa.fa : awa.eZ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(dby $$0, iz $$1, cmx $$2, dpq $$3, int $$4) {
      if (!$$0.B) {
         cup $$5 = $$3.a($$4, 1);
         avz $$6 = $$5.a(cus.uw) ? awa.fd : awa.fc;
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         if (!$$2.gc().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dwv.c, $$1);
      }
   }

   @Nullable
   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dpq($$0, $$1);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(div.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dpq $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cup $$8 = $$6.a($$7);
               if (!$$8.e()) {
                  bqq.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(div.aE, $$0.g().g());
   }

   @Override
   public dsc a(dsc $$0, dlm $$1) {
      return $$0.a(div.aE, $$1.a($$0.c(div.aE)));
   }

   @Override
   public dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(div.aE)));
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dpq $$3 ? $$3.j() + 1 : 0;
      }
   }
}
