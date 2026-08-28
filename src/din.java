import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class din extends dgv {
   public static final MapCodec<din> a = b(din::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dvf> c = List.of(dve.bp, dve.bq, dve.br, dve.bs, dve.bt, dve.bu);

   @Override
   public MapCodec<din> a() {
      return a;
   }

   public din(dun.d $$0) {
      super($$0);
      duo $$1 = this.F.b().b(dlf.aF, jj.c);

      for (dvf $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if ($$2.c_($$3) instanceof dsb $$7) {
         if (!$$0.a(axc.aV)) {
            return brp.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return brp.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return brp.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return brp.a;
            }
         }
      } else {
         return brp.e;
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if ($$1.c_($$2) instanceof dsb $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return brp.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return brp.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return brp.a;
         }
      } else {
         return brp.e;
      }
   }

   private OptionalInt a(eyo $$0, duo $$1) {
      return a($$0, $$1.c(dlf.aF)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<eyr> a(eyo $$0, jj $$1) {
      jj $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         je $$3 = $$0.b().a($$2);
         eys $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new eyr((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new eyr((float)$$5, (float)$$6));
            case e -> Optional.of(new eyr((float)$$7, (float)$$6));
            case f -> Optional.of(new eyr((float)(1.0 - $$7), (float)$$6));
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

   private static void a(deg $$0, je $$1, cnu $$2, dsb $$3, cvp $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(awo.c.b($$4.h()));
         awd $$6 = $$4.a(cvt.uy) ? awe.fb : awe.fa;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awf.e, 1.0F, 1.0F);
      }
   }

   private static void a(deg $$0, je $$1, cnu $$2, dsb $$3, int $$4) {
      if (!$$0.B) {
         cvp $$5 = $$3.a($$4, 1);
         awd $$6 = $$5.a(cvt.uy) ? awe.fe : awe.fd;
         $$0.a(null, $$1, $$6, awf.e, 1.0F, 1.0F);
         if (!$$2.gc().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dzl.c, $$1);
      }
   }

   @Nullable
   @Override
   public drs a(je $$0, duo $$1) {
      return new dsb($$0, $$1);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(dlf.aF);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         boolean $$9;
         label32: {
            if ($$1.c_($$2) instanceof dsb $$6 && !$$6.c()) {
               for (int $$7 = 0; $$7 < 6; $$7++) {
                  cvp $$8 = $$6.a($$7);
                  if (!$$8.f()) {
                     brl.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
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
   public duo a(czk $$0) {
      return this.o().b(dlf.aF, $$0.g().g());
   }

   @Override
   public duo a(duo $$0, dnx $$1) {
      return $$0.b(dlf.aF, $$1.a($$0.c(dlf.aF)));
   }

   @Override
   public duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(dlf.aF)));
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      if ($$1.w_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dsb $$3 ? $$3.j() + 1 : 0;
      }
   }
}
