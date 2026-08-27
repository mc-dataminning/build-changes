import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dei extends dcq {
   public static final MapCodec<dei> a = b(dei::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dqy> c = List.of(dqx.bp, dqx.bq, dqx.br, dqx.bs, dqx.bt, dqx.bu);

   @Override
   public MapCodec<dei> a() {
      return a;
   }

   public dei(dqg.d $$0) {
      super($$0);
      dqh $$1 = this.E.b().a(dha.aE, is.c);

      for (dqy $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if ($$2.c_($$3) instanceof dnv $$7) {
         if (!$$0.a(avz.aW)) {
            return bpo.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bpo.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bpo.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bpo.a($$2.B);
            }
         }
      } else {
         return bpo.e;
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.c_($$2) instanceof dnv $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bpm.d;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bpm.b;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bpm.a($$1.B);
         }
      } else {
         return bpm.d;
      }
   }

   private OptionalInt a(etl $$0, dqh $$1) {
      return a($$0, $$1.c(dha.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<eto> a(etl $$0, is $$1) {
      is $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         in $$3 = $$0.a().a($$2);
         etp $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new eto((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new eto((float)$$5, (float)$$6));
            case e -> Optional.of(new eto((float)$$7, (float)$$6));
            case f -> Optional.of(new eto((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dad $$0, in $$1, clh $$2, dnv $$3, csz $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(avm.c.b($$4.f()));
         avb $$6 = $$4.a(ctc.uw) ? avc.fa : avc.eZ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, avd.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(dad $$0, in $$1, clh $$2, dnv $$3, int $$4) {
      if (!$$0.B) {
         csz $$5 = $$3.a($$4, 1);
         avb $$6 = $$5.a(ctc.uw) ? avc.fd : avc.fc;
         $$0.a(null, $$1, $$6, avd.e, 1.0F, 1.0F);
         if (!$$2.ga().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dva.c, $$1);
      }
   }

   @Nullable
   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dnv($$0, $$1);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(dha.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dnv $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               csz $$8 = $$6.a($$7);
               if (!$$8.d()) {
                  bpi.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(dha.aE, $$0.g().g());
   }

   @Override
   public dqh a(dqh $$0, djr $$1) {
      return $$0.a(dha.aE, $$1.a($$0.c(dha.aE)));
   }

   @Override
   public dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(dha.aE)));
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dnv $$3 ? $$3.j() + 1 : 0;
      }
   }
}
