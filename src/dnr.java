import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dnr extends dly {
   public static final MapCodec<dnr> a = b(dnr::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<ebf> c = List.of(ebe.bs, ebe.bt, ebe.bu, ebe.bv, ebe.bw, ebe.bx);

   @Override
   public MapCodec<dnr> a() {
      return a;
   }

   public dnr(ean.d $$0) {
      super($$0);
      eao $$1 = this.C.b().b(dqn.e, jb.c);

      for (ebf $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if ($$2.c_($$3) instanceof dxw $$7) {
         if (!$$0.a(axk.ba)) {
            return bug.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bug.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bug.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bug.a;
            }
         }
      } else {
         return bug.e;
      }
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$1.c_($$2) instanceof dxw $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bug.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bug.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bug.a;
         }
      } else {
         return bug.e;
      }
   }

   private OptionalInt a(fet $$0, eao $$1) {
      return a($$0, $$1.c(dqn.e)).map($$0x -> {
         int $$1x = $$0x.k >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.j);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<few> a(fet $$0, jb $$1) {
      jb $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         iv $$3 = $$0.b().a($$2);
         fex $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new few((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new few((float)$$5, (float)$$6));
            case e -> Optional.of(new few((float)$$7, (float)$$6));
            case f -> Optional.of(new few((float)(1.0 - $$7), (float)$$6));
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

   private static void a(djh $$0, iv $$1, crj $$2, dxw $$3, czk $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(awx.c.b($$4.h()));
         awm $$6 = $$4.a(czo.vG) ? awn.fe : awn.fd;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awo.e, 1.0F, 1.0F);
      }
   }

   private static void a(djh $$0, iv $$1, crj $$2, dxw $$3, int $$4) {
      if (!$$0.C) {
         czk $$5 = $$3.a($$4, 1);
         awm $$6 = $$5.a(czo.vG) ? awn.fh : awn.fg;
         $$0.a(null, $$1, $$6, awo.e, 1.0F, 1.0F);
         if (!$$2.gi().g($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, efo.c, $$1);
      }
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dxw($$0, $$1);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(dqn.e);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(dqn.e, $$0.g().g());
   }

   @Override
   public eao a(eao $$0, dtg $$1) {
      return $$0.b(dqn.e, $$1.a($$0.c(dqn.e)));
   }

   @Override
   public eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(dqn.e)));
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      if ($$1.w_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dxw $$3 ? $$3.j() + 1 : 0;
      }
   }
}
