import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dgg extends den {
   public static final MapCodec<dgg> a = b(dgg::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dtt> c = List.of(dts.bp, dts.bq, dts.br, dts.bs, dts.bt, dts.bu);

   @Override
   public MapCodec<dgg> a() {
      return a;
   }

   public dgg(dtb.d $$0) {
      super($$0);
      dtc $$1 = this.E.b().a(djc.aE, iw.c);

      for (dtt $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if ($$2.c_($$3) instanceof dql $$7) {
         if (!$$0.a(awm.aX)) {
            return bqc.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bqc.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bqc.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bqc.a($$2.C);
            }
         }
      } else {
         return bqc.e;
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.c_($$2) instanceof dql $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bqa.d;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bqa.b;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bqa.a($$1.C);
         }
      } else {
         return bqa.d;
      }
   }

   private OptionalInt a(ewq $$0, dtc $$1) {
      return a($$0, $$1.c(djc.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<ewt> a(ewq $$0, iw $$1) {
      iw $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ir $$3 = $$0.a().a($$2);
         ewu $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ewt((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ewt((float)$$5, (float)$$6));
            case e -> Optional.of(new ewt((float)$$7, (float)$$6));
            case f -> Optional.of(new ewt((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dca $$0, ir $$1, cly $$2, dql $$3, cuh $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(avz.c.b($$4.f()));
         avn $$6 = $$4.a(cuk.wh) ? avo.ff : avo.fe;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, avq.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(dca $$0, ir $$1, cly $$2, dql $$3, int $$4) {
      if (!$$0.C) {
         cuh $$5 = $$3.a($$4, 1);
         avn $$6 = $$5.a(cuk.wh) ? avo.fi : avo.fh;
         $$0.a(null, $$1, $$6, avq.e, 1.0F, 1.0F);
         if (!$$2.gl().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dxv.c, $$1);
      }
   }

   @Nullable
   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dql($$0, $$1);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(djc.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dql $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cuh $$8 = $$6.a($$7);
               if (!$$8.d()) {
                  bpw.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(djc.aE, $$0.g().g());
   }

   @Override
   public dtc a(dtc $$0, dmd $$1) {
      return $$0.a(djc.aE, $$1.a($$0.c(djc.aE)));
   }

   @Override
   public dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(djc.aE)));
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dql $$3 ? $$3.j() + 1 : 0;
      }
   }
}
