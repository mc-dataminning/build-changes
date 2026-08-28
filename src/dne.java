import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dne extends dlm {
   public static final MapCodec<dne> a = b(dne::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<eaq> c = List.of(eap.bs, eap.bt, eap.bu, eap.bv, eap.bw, eap.bx);

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   public dne(dzy.d $$0) {
      super($$0);
      dzz $$1 = this.B.b().b(dqa.e, ja.c);

      for (eaq $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if ($$2.c_($$3) instanceof dxh $$7) {
         if (!$$0.a(axk.aZ)) {
            return bub.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bub.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bub.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bub.a;
            }
         }
      } else {
         return bub.e;
      }
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$1.c_($$2) instanceof dxh $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bub.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bub.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bub.a;
         }
      } else {
         return bub.e;
      }
   }

   private OptionalInt a(fee $$0, dzz $$1) {
      return a($$0, $$1.c(dqa.e)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<feh> a(fee $$0, ja $$1) {
      ja $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         iu $$3 = $$0.b().a($$2);
         fei $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new feh((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new feh((float)$$5, (float)$$6));
            case e -> Optional.of(new feh((float)$$7, (float)$$6));
            case f -> Optional.of(new feh((float)(1.0 - $$7), (float)$$6));
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

   private static void a(div $$0, iu $$1, cqy $$2, dxh $$3, cyy $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(awx.c.b($$4.h()));
         awm $$6 = $$4.a(czc.vB) ? awn.fc : awn.fb;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awo.e, 1.0F, 1.0F);
      }
   }

   private static void a(div $$0, iu $$1, cqy $$2, dxh $$3, int $$4) {
      if (!$$0.C) {
         cyy $$5 = $$3.a($$4, 1);
         awm $$6 = $$5.a(czc.vB) ? awn.ff : awn.fe;
         $$0.a(null, $$1, $$6, awo.e, 1.0F, 1.0F);
         if (!$$2.gi().f($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, eez.c, $$1);
      }
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxh($$0, $$1);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(dqa.e);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      btx.a($$0, $$1, $$2);
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(dqa.e, $$0.g().g());
   }

   @Override
   public dzz a(dzz $$0, dst $$1) {
      return $$0.b(dqa.e, $$1.a($$0.c(dqa.e)));
   }

   @Override
   public dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(dqa.e)));
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      if ($$1.w_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dxh $$3 ? $$3.j() + 1 : 0;
      }
   }
}
