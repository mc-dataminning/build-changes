import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class doh extends dmo {
   public static final MapCodec<doh> a = b(doh::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<ebv> c = List.of(ebu.bs, ebu.bt, ebu.bu, ebu.bv, ebu.bw, ebu.bx);

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   public doh(ebd.d $$0) {
      super($$0);
      ebe $$1 = this.C.b().b(drd.e, jb.c);

      for (ebv $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if ($$2.c_($$3) instanceof dym $$7) {
         if (!$$0.a(axm.ba)) {
            return bur.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bur.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bur.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bur.a;
            }
         }
      } else {
         return bur.e;
      }
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$1.c_($$2) instanceof dym $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bur.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bur.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bur.a;
         }
      } else {
         return bur.e;
      }
   }

   private OptionalInt a(ffm $$0, ebe $$1) {
      return a($$0, $$1.c(drd.e)).map($$0x -> {
         int $$1x = $$0x.k >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.j);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<ffp> a(ffm $$0, jb $$1) {
      jb $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         iv $$3 = $$0.b().a($$2);
         ffq $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new ffp((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new ffp((float)$$5, (float)$$6));
            case e -> Optional.of(new ffp((float)$$7, (float)$$6));
            case f -> Optional.of(new ffp((float)(1.0 - $$7), (float)$$6));
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

   private static void a(djx $$0, iv $$1, crx $$2, dym $$3, czy $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(awz.c.b($$4.h()));
         awo $$6 = $$4.a(dac.vG) ? awp.fe : awp.fd;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awq.e, 1.0F, 1.0F);
      }
   }

   private static void a(djx $$0, iv $$1, crx $$2, dym $$3, int $$4) {
      if (!$$0.C) {
         czy $$5 = $$3.a($$4, 1);
         awo $$6 = $$5.a(dac.vG) ? awp.fh : awp.fg;
         $$0.a(null, $$1, $$6, awq.e, 1.0F, 1.0F);
         if (!$$2.gj().g($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, ege.c, $$1);
      }
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dym($$0, $$1);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(drd.e);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      bun.a($$0, $$1, $$2);
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(drd.e, $$0.g().g());
   }

   @Override
   public ebe a(ebe $$0, dtw $$1) {
      return $$0.b(drd.e, $$1.a($$0.c(drd.e)));
   }

   @Override
   public ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(drd.e)));
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      if ($$1.A_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dym $$3 ? $$3.j() + 1 : 0;
      }
   }
}
