import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dji extends dhq {
   public static final MapCodec<dji> a = b(dji::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dwa> c = List.of(dvz.bp, dvz.bq, dvz.br, dvz.bs, dvz.bt, dvz.bu);

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   public dji(dvi.d $$0) {
      super($$0);
      dvj $$1 = this.F.b().b(dlz.aF, jm.c);

      for (dwa $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if ($$2.c_($$3) instanceof dsv $$7) {
         if (!$$0.a(axj.aZ)) {
            return bsd.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bsd.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bsd.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bsd.a;
            }
         }
      } else {
         return bsd.e;
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if ($$1.c_($$2) instanceof dsv $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bsd.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bsd.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bsd.a;
         }
      } else {
         return bsd.e;
      }
   }

   private OptionalInt a(ezj $$0, dvj $$1) {
      return a($$0, $$1.c(dlz.aF)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<ezm> a(ezj $$0, jm $$1) {
      jm $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         jh $$3 = $$0.b().a($$2);
         ezn $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ezm((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ezm((float)$$5, (float)$$6));
            case e -> Optional.of(new ezm((float)$$7, (float)$$6));
            case f -> Optional.of(new ezm((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dfb $$0, jh $$1, com $$2, dsv $$3, cwb $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(awv.c.b($$4.h()));
         awk $$6 = $$4.a(cwf.uy) ? awl.fb : awl.fa;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awm.e, 1.0F, 1.0F);
      }
   }

   private static void a(dfb $$0, jh $$1, com $$2, dsv $$3, int $$4) {
      if (!$$0.C) {
         cwb $$5 = $$3.a($$4, 1);
         awk $$6 = $$5.a(cwf.uy) ? awl.fe : awl.fd;
         $$0.a(null, $$1, $$6, awm.e, 1.0F, 1.0F);
         if (!$$2.gk().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, eag.c, $$1);
      }
   }

   @Nullable
   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dsv($$0, $$1);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(dlz.aF);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         boolean $$9;
         label32: {
            if ($$1.c_($$2) instanceof dsv $$6 && !$$6.c()) {
               for (int $$7 = 0; $$7 < 6; $$7++) {
                  cwb $$8 = $$6.a($$7);
                  if (!$$8.f()) {
                     brz.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
                  }
               }

               $$6.a();
               $$9 = true;
               break label32;
            }

            $$9 = false;
         }

         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$9) {
            $$1.c($$2, this);
         }
      }
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(dlz.aF, $$0.g().g());
   }

   @Override
   public dvj a(dvj $$0, dor $$1) {
      return $$0.b(dlz.aF, $$1.a($$0.c(dlz.aF)));
   }

   @Override
   public dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(dlz.aF)));
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      if ($$1.y_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dsv $$3 ? $$3.j() + 1 : 0;
      }
   }
}
