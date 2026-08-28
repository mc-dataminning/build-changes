import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dhz extends dgh {
   public static final MapCodec<dhz> a = b(dhz::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dur> c = List.of(duq.bp, duq.bq, duq.br, duq.bs, duq.bt, duq.bu);

   @Override
   public MapCodec<dhz> a() {
      return a;
   }

   public dhz(dtz.d $$0) {
      super($$0);
      dua $$1 = this.E.b().b(dkr.aE, jj.c);

      for (dur $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if ($$2.c_($$3) instanceof drn $$7) {
         if (!$$0.a(axb.aV)) {
            return brk.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return brk.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return brk.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return brk.a;
            }
         }
      } else {
         return brk.e;
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if ($$1.c_($$2) instanceof drn $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return brk.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return brk.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return brk.a;
         }
      } else {
         return brk.e;
      }
   }

   private OptionalInt a(eya $$0, dua $$1) {
      return a($$0, $$1.c(dkr.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<eyd> a(eya $$0, jj $$1) {
      jj $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         je $$3 = $$0.a().a($$2);
         eye $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new eyd((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new eyd((float)$$5, (float)$$6));
            case e -> Optional.of(new eyd((float)$$7, (float)$$6));
            case f -> Optional.of(new eyd((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dds $$0, je $$1, cnp $$2, drn $$3, cvl $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(awn.c.b($$4.h()));
         awc $$6 = $$4.a(cvo.uy) ? awd.fb : awd.fa;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awe.e, 1.0F, 1.0F);
      }
   }

   private static void a(dds $$0, je $$1, cnp $$2, drn $$3, int $$4) {
      if (!$$0.B) {
         cvl $$5 = $$3.a($$4, 1);
         awc $$6 = $$5.a(cvo.uy) ? awd.fe : awd.fd;
         $$0.a(null, $$1, $$6, awe.e, 1.0F, 1.0F);
         if (!$$2.gc().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dyx.c, $$1);
      }
   }

   @Nullable
   @Override
   public dre a(je $$0, dua $$1) {
      return new drn($$0, $$1);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(dkr.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         boolean $$9;
         label32: {
            if ($$1.c_($$2) instanceof drn $$6 && !$$6.c()) {
               for (int $$7 = 0; $$7 < 6; $$7++) {
                  cvl $$8 = $$6.a($$7);
                  if (!$$8.f()) {
                     brg.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
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
   public dua a(cyw $$0) {
      return this.o().b(dkr.aE, $$0.g().g());
   }

   @Override
   public dua a(dua $$0, dnj $$1) {
      return $$0.b(dkr.aE, $$1.a($$0.c(dkr.aE)));
   }

   @Override
   public dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(dkr.aE)));
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      if ($$1.w_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof drn $$3 ? $$3.j() + 1 : 0;
      }
   }
}
