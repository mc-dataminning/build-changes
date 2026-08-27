import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dfc extends ddk {
   public static final MapCodec<dfc> a = b(dfc::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<drs> c = List.of(drr.bp, drr.bq, drr.br, drr.bs, drr.bt, drr.bu);

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   public dfc(dra.d $$0) {
      super($$0);
      drb $$1 = this.E.b().a(dhu.aE, it.c);

      for (drs $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if ($$2.c_($$3) instanceof dop $$7) {
         if (!$$0.a(awe.aW)) {
            return bpw.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bpw.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bpw.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bpw.a($$2.B);
            }
         }
      } else {
         return bpw.e;
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.c_($$2) instanceof dop $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bpu.d;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bpu.b;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bpu.a($$1.B);
         }
      } else {
         return bpu.d;
      }
   }

   private OptionalInt a(eug $$0, drb $$1) {
      return a($$0, $$1.c(dhu.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<euj> a(eug $$0, it $$1) {
      it $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         io $$3 = $$0.a().a($$2);
         euk $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new euj((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new euj((float)$$5, (float)$$6));
            case e -> Optional.of(new euj((float)$$7, (float)$$6));
            case f -> Optional.of(new euj((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dax $$0, io $$1, clw $$2, dop $$3, cto $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(avr.c.b($$4.g()));
         avg $$6 = $$4.a(ctr.uw) ? avh.fa : avh.eZ;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, avi.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(dax $$0, io $$1, clw $$2, dop $$3, int $$4) {
      if (!$$0.B) {
         cto $$5 = $$3.a($$4, 1);
         avg $$6 = $$5.a(ctr.uw) ? avh.fd : avh.fc;
         $$0.a(null, $$1, $$6, avi.e, 1.0F, 1.0F);
         if (!$$2.gc().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, dvu.c, $$1);
      }
   }

   @Nullable
   @Override
   public dog a(io $$0, drb $$1) {
      return new dop($$0, $$1);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(dhu.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dop $$6 && !$$6.c()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cto $$8 = $$6.a($$7);
               if (!$$8.e()) {
                  bpq.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(dhu.aE, $$0.g().g());
   }

   @Override
   public drb a(drb $$0, dkl $$1) {
      return $$0.a(dhu.aE, $$1.a($$0.c(dhu.aE)));
   }

   @Override
   public drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(dhu.aE)));
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dop $$3 ? $$3.j() + 1 : 0;
      }
   }
}
