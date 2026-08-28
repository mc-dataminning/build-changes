import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dot extends dna {
   public static final MapCodec<dot> a = b(dot::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<ech> c = List.of(ecg.bs, ecg.bt, ecg.bu, ecg.bv, ecg.bw, ecg.bx);

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   public dot(ebp.d $$0) {
      super($$0);
      ebq $$1 = this.C.b().b(drp.e, jc.c);

      for (ech $$2 : c) {
         $$1 = $$1.b($$2, Boolean.valueOf(false));
      }

      this.l($$1);
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if ($$2.c_($$3) instanceof dyy $$7) {
         if (!$$0.a(axv.bb)) {
            return bvc.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bvc.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bvc.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bvc.a;
            }
         }
      } else {
         return bvc.e;
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$1.c_($$2) instanceof dyy $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bvc.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bvc.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bvc.a;
         }
      } else {
         return bvc.e;
      }
   }

   private OptionalInt a(ffy $$0, ebq $$1) {
      return a($$0, $$1.c(drp.e)).map($$0x -> {
         int $$1x = $$0x.k >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.j);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<fgb> a(ffy $$0, jc $$1) {
      jc $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         iw $$3 = $$0.b().a($$2);
         fgc $$4 = $$0.g().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new fgb((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new fgb((float)$$5, (float)$$6));
            case e -> Optional.of(new fgb((float)$$7, (float)$$6));
            case f -> Optional.of(new fgb((float)(1.0 - $$7), (float)$$6));
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

   private static void a(dkj $$0, iw $$1, csi $$2, dyy $$3, dak $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(axi.c.b($$4.h()));
         awx $$6 = $$4.a(dao.vG) ? awy.fe : awy.fd;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, awz.e, 1.0F, 1.0F);
      }
   }

   private static void a(dkj $$0, iw $$1, csi $$2, dyy $$3, int $$4) {
      if (!$$0.C) {
         dak $$5 = $$3.a($$4, 1);
         awx $$6 = $$5.a(dao.vG) ? awy.fh : awy.fg;
         $$0.a(null, $$1, $$6, awz.e, 1.0F, 1.0F);
         if (!$$2.gj().g($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, egq.c, $$1);
      }
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dyy($$0, $$1);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(drp.e);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      buy.a($$0, $$1, $$2);
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(drp.e, $$0.g().g());
   }

   @Override
   public ebq a(ebq $$0, dui $$1) {
      return $$0.b(drp.e, $$1.a($$0.c(drp.e)));
   }

   @Override
   public ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(drp.e)));
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      if ($$1.A_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dyy $$3 ? $$3.j() + 1 : 0;
      }
   }
}
