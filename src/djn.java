import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class djn extends dhv {
   public static final MapCodec<djn> a = b(djn::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dwf> c = List.of(dwe.bp, dwe.bq, dwe.br, dwe.bs, dwe.bt, dwe.bu);

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   public djn(dvn.d $$0) {
      super($$0);
      dvo $$1 = this.F.b().b(dme.aF, jm.c);

      for (dwf $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if ($$2.c_($$3) instanceof dta $$7) {
         if (!$$0.a(axm.ba)) {
            return bsh.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bsh.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bsh.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bsh.a;
            }
         }
      } else {
         return bsh.e;
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if ($$1.c_($$2) instanceof dta $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bsh.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bsh.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bsh.a;
         }
      } else {
         return bsh.e;
      }
   }

   private OptionalInt a(ezn $$0, dvo $$1) {
      return a($$0, $$1.c(dme.aF)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<ezq> a(ezn $$0, jm $$1) {
      jm $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         jh $$3 = $$0.b().a($$2);
         ezr $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ezq((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ezq((float)$$5, (float)$$6));
            case e -> Optional.of(new ezq((float)$$7, (float)$$6));
            case f -> Optional.of(new ezq((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dff $$0, jh $$1, cor $$2, dta $$3, cwf $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(awy.c.b($$4.h()));
         awn $$6 = $$4.a(cwj.uO) ? awo.fb : awo.fa;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awp.e, 1.0F, 1.0F);
      }
   }

   private static void a(dff $$0, jh $$1, cor $$2, dta $$3, int $$4) {
      if (!$$0.C) {
         cwf $$5 = $$3.a($$4, 1);
         awn $$6 = $$5.a(cwj.uO) ? awo.fe : awo.fd;
         $$0.a(null, $$1, $$6, awp.e, 1.0F, 1.0F);
         if (!$$2.gl().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, eak.c, $$1);
      }
   }

   @Nullable
   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dta($$0, $$1);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(dme.aF);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         boolean $$9;
         label32: {
            if ($$1.c_($$2) instanceof dta $$6 && !$$6.c()) {
               for (int $$7 = 0; $$7 < 6; $$7++) {
                  cwf $$8 = $$6.a($$7);
                  if (!$$8.f()) {
                     bsd.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
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
   public dvo a(czw $$0) {
      return this.m().b(dme.aF, $$0.g().g());
   }

   @Override
   public dvo a(dvo $$0, dow $$1) {
      return $$0.b(dme.aF, $$1.a($$0.c(dme.aF)));
   }

   @Override
   public dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(dme.aF)));
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      if ($$1.y_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dta $$3 ? $$3.j() + 1 : 0;
      }
   }
}
