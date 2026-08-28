import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dgm extends deu {
   public static final MapCodec<dgm> a = b(dgm::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dtc> c = List.of(dtb.bp, dtb.bq, dtb.br, dtb.bs, dtb.bt, dtb.bu);

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   public dgm(dsk.d $$0) {
      super($$0);
      dsl $$1 = this.E.b().a(dje.aE, jf.c);

      for (dtc $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if ($$2.c_($$3) instanceof dpz $$7) {
         if (!$$0.a(awf.aW)) {
            return bqj.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bqj.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bqj.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bqj.a($$2.B);
            }
         }
      } else {
         return bqj.e;
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.c_($$2) instanceof dpz $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bqh.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bqh.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bqh.a($$1.B);
         }
      } else {
         return bqh.e;
      }
   }

   private OptionalInt a(ewd $$0, dsl $$1) {
      return a($$0, $$1.c(dje.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<ewg> a(ewd $$0, jf $$1) {
      jf $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ja $$3 = $$0.a().a($$2);
         ewh $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ewg((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ewg((float)$$5, (float)$$6));
            case e -> Optional.of(new ewg((float)$$7, (float)$$6));
            case f -> Optional.of(new ewg((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dcg $$0, ja $$1, cml $$2, dpz $$3, cud $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(avr.c.b($$4.g()));
         avg $$6 = $$4.a(cug.uw) ? avh.fa : avh.eZ;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, avi.e, 1.0F, 1.0F);
      }
   }

   private static void a(dcg $$0, ja $$1, cml $$2, dpz $$3, int $$4) {
      if (!$$0.B) {
         cud $$5 = $$3.a($$4, 1);
         avg $$6 = $$5.a(cug.uw) ? avh.fd : avh.fc;
         $$0.a(null, $$1, $$6, avi.e, 1.0F, 1.0F);
         if (!$$2.ga().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dxh.c, $$1);
      }
   }

   @Nullable
   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dpz($$0, $$1);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(dje.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dpz $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cud $$8 = $$6.a($$7);
               if (!$$8.e()) {
                  bqd.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(dje.aE, $$0.g().g());
   }

   @Override
   public dsl a(dsl $$0, dlv $$1) {
      return $$0.a(dje.aE, $$1.a($$0.c(dje.aE)));
   }

   @Override
   public dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(dje.aE)));
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dpz $$3 ? $$3.j() + 1 : 0;
      }
   }
}
