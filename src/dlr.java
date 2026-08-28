import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dlr extends djy {
   public static final MapCodec<dlr> a = b(dlr::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dym> c = List.of(dyl.bq, dyl.br, dyl.bs, dyl.bt, dyl.bu, dyl.bv);

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   public dlr(dxu.d $$0) {
      super($$0);
      dxv $$1 = this.F.b().b(dok.aF, jm.c);

      for (dym $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if ($$2.c_($$3) instanceof dvg $$7) {
         if (!$$0.a(ayd.bb)) {
            return btj.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return btj.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return btj.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return btj.a;
            }
         }
      } else {
         return btj.e;
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if ($$1.c_($$2) instanceof dvg $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return btj.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return btj.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return btj.a;
         }
      } else {
         return btj.e;
      }
   }

   private OptionalInt a(fbu $$0, dxv $$1) {
      return a($$0, $$1.c(dok.aF)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<fbx> a(fbu $$0, jm $$1) {
      jm $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         jh $$3 = $$0.b().a($$2);
         fby $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new fbx((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new fbx((float)$$5, (float)$$6));
            case e -> Optional.of(new fbx((float)$$7, (float)$$6));
            case f -> Optional.of(new fbx((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dhi $$0, jh $$1, cpx $$2, dvg $$3, cxp $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(axp.c.b($$4.h()));
         axe $$6 = $$4.a(cxt.vm) ? axf.fc : axf.fb;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, axg.e, 1.0F, 1.0F);
      }
   }

   private static void a(dhi $$0, jh $$1, cpx $$2, dvg $$3, int $$4) {
      if (!$$0.C) {
         cxp $$5 = $$3.a($$4, 1);
         axe $$6 = $$5.a(cxt.vm) ? axf.ff : axf.fe;
         $$0.a(null, $$1, $$6, axg.e, 1.0F, 1.0F);
         if (!$$2.gi().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, ecr.c, $$1);
      }
   }

   @Nullable
   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvg($$0, $$1);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(dok.aF);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         boolean $$9;
         label32: {
            if ($$1.c_($$2) instanceof dvg $$6 && !$$6.c()) {
               for (int $$7 = 0; $$7 < 6; $$7++) {
                  cxp $$8 = $$6.a($$7);
                  if (!$$8.f()) {
                     btf.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
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
   public dxv a(dbg $$0) {
      return this.m().b(dok.aF, $$0.g().g());
   }

   @Override
   public dxv a(dxv $$0, drc $$1) {
      return $$0.b(dok.aF, $$1.a($$0.c(dok.aF)));
   }

   @Override
   public dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(dok.aF)));
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      if ($$1.B_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dvg $$3 ? $$3.j() + 1 : 0;
      }
   }
}
