import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dli extends djq {
   public static final MapCodec<dli> a = b(dli::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dyh> c = List.of(dyg.bs, dyg.bt, dyg.bu, dyg.bv, dyg.bw, dyg.bx);

   @Override
   public MapCodec<dli> a() {
      return a;
   }

   public dli(dxp.d $$0) {
      super($$0);
      dxq $$1 = this.B.b().b(dod.e, jn.c);

      for (dyh $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if ($$2.c_($$3) instanceof dvb $$7) {
         if (!$$0.a(awy.aZ)) {
            return bsy.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bsy.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bsy.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bsy.a;
            }
         }
      } else {
         return bsy.e;
      }
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if ($$1.c_($$2) instanceof dvb $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bsy.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bsy.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bsy.a;
         }
      } else {
         return bsy.e;
      }
   }

   private OptionalInt a(fbt $$0, dxq $$1) {
      return a($$0, $$1.c(dod.e)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<fbw> a(fbt $$0, jn $$1) {
      jn $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ji $$3 = $$0.b().a($$2);
         fbx $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new fbw((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new fbw((float)$$5, (float)$$6));
            case e -> Optional.of(new fbw((float)$$7, (float)$$6));
            case f -> Optional.of(new fbw((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dgz $$0, ji $$1, cpr $$2, dvb $$3, cxh $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(awk.c.b($$4.h()));
         avz $$6 = $$4.a(cxl.vx) ? awa.fc : awa.fb;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
      }
   }

   private static void a(dgz $$0, ji $$1, cpr $$2, dvb $$3, int $$4) {
      if (!$$0.C) {
         cxh $$5 = $$3.a($$4, 1);
         avz $$6 = $$5.a(cxl.vx) ? awa.ff : awa.fe;
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         if (!$$2.gl().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, ecp.c, $$1);
      }
   }

   @Nullable
   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dvb($$0, $$1);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(dod.e);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      bsu.a($$0, $$1, $$2);
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(dod.e, $$0.g().g());
   }

   @Override
   public dxq a(dxq $$0, dqw $$1) {
      return $$0.b(dod.e, $$1.a($$0.c(dod.e)));
   }

   @Override
   public dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(dod.e)));
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      if ($$1.w_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dvb $$3 ? $$3.j() + 1 : 0;
      }
   }
}
