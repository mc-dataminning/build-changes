import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dkp extends dix {
   public static final MapCodec<dkp> a = b(dkp::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dxn> c = List.of(dxm.bs, dxm.bt, dxm.bu, dxm.bv, dxm.bw, dxm.bx);

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   public dkp(dwv.d $$0) {
      super($$0);
      dww $$1 = this.F.b().b(dnj.aF, jn.c);

      for (dxn $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      if ($$2.c_($$3) instanceof duh $$7) {
         if (!$$0.a(awy.aZ)) {
            return bsj.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bsj.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bsj.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bsj.a;
            }
         }
      } else {
         return bsj.e;
      }
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if ($$1.c_($$2) instanceof duh $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bsj.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bsj.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bsj.a;
         }
      } else {
         return bsj.e;
      }
   }

   private OptionalInt a(fav $$0, dww $$1) {
      return a($$0, $$1.c(dnj.aF)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<fay> a(fav $$0, jn $$1) {
      jn $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ji $$3 = $$0.b().a($$2);
         faz $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new fay((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new fay((float)$$5, (float)$$6));
            case e -> Optional.of(new fay((float)$$7, (float)$$6));
            case f -> Optional.of(new fay((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dgh $$0, ji $$1, cow $$2, duh $$3, cwo $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(awk.c.b($$4.h()));
         avz $$6 = $$4.a(cws.vv) ? awa.fc : awa.fb;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
      }
   }

   private static void a(dgh $$0, ji $$1, cow $$2, duh $$3, int $$4) {
      if (!$$0.C) {
         cwo $$5 = $$3.a($$4, 1);
         avz $$6 = $$5.a(cws.vv) ? awa.ff : awa.fe;
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         if (!$$2.gi().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, ebs.c, $$1);
      }
   }

   @Nullable
   @Override
   public dty a(ji $$0, dww $$1) {
      return new duh($$0, $$1);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(dnj.aF);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         boolean $$9;
         label32: {
            if ($$1.c_($$2) instanceof duh $$6 && !$$6.c()) {
               for (int $$7 = 0; $$7 < 6; $$7++) {
                  cwo $$8 = $$6.a($$7);
                  if (!$$8.f()) {
                     bsf.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
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
   public dww a(daf $$0) {
      return this.m().b(dnj.aF, $$0.g().g());
   }

   @Override
   public dww a(dww $$0, dqd $$1) {
      return $$0.b(dnj.aF, $$1.a($$0.c(dnj.aF)));
   }

   @Override
   public dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(dnj.aF)));
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      if ($$1.B_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof duh $$3 ? $$3.j() + 1 : 0;
      }
   }
}
