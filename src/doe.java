import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class doe extends dna implements duz {
   public static final MapCodec<doe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.D), t()
            )
            .apply($$0, doe::new)
   );
   public static final ech b = ecg.u;
   public static final ech c = ecg.D;
   public static final ech d = ecg.I;
   public static final eco<jc> e = ecg.T;
   private static final fgw f = dno.b(16.0, 0.0, 7.0);
   private static final fgw g = dno.b(4.0, 0.0, 16.0);
   private static final int h = 5;
   private final boolean i;
   private final int D;

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   public doe(boolean $$0, int $$1, ebp.d $$2) {
      super($$2);
      this.i = $$0;
      this.D = $$1;
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)).b(e, jc.c));
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if ($$2.c_($$3) instanceof dyv $$8) {
         dak $$9 = $$4.b($$5);
         if ($$2.Q().a(dfk.h).a($$9)) {
            if ($$2 instanceof asb $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(axi.av);
               return bvc.b;
            }

            return bvc.c;
         }
      }

      return bvc.f;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if ($$0.c(b) && $$3 instanceof byf) {
         $$3.a($$1.al().b(), (float)this.D);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      dkk $$1 = $$0.q();
      iw $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eyb.c;
      return this.m().b(d, Boolean.valueOf($$3)).b(c, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(b, Boolean.valueOf(!$$3)).b(e, $$0.g());
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return $$4 == jc.a ? $$0.b(c, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(ebq $$0) {
      return $$0.a(dnq.iL);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return f;
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awy.dM, awz.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lz.ab, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bxe $$0, dkk $$1, iw $$2, ebq $$3) {
      if ($$1.A_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dkj)$$1, $$2, $$3.c(c), true);
         }
      }

      $$1.a($$0, egq.c, $$2);
   }

   @Override
   public boolean a(dkk $$0, iw $$1, ebq $$2, eya $$3) {
      if (!$$2.c(ecg.I) && $$3.a() == eyb.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.A_()) {
               $$0.a(null, $$1, awy.kJ, awz.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)).b(b, Boolean.valueOf(false)), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void a(dkj $$0, ebq $$1, ffy $$2, ctd $$3) {
      iw $$4 = $$2.b();
      if ($$0 instanceof asb $$5 && $$3.bX() && $$3.c($$5, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.b(ecg.u, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dkj $$0, iw $$1, boolean $$2, boolean $$3) {
      bai $$4 = $$0.G_();
      md $$5 = $$2 ? lz.ax : lz.aw;
      $$0.a(
         $$5,
         true,
         (double)$$1.u() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1),
         (double)$$1.v() + $$4.j() + $$4.j(),
         (double)$$1.w() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1),
         0.0,
         0.07,
         0.0
      );
      if ($$3) {
         $$0.a(
            lz.ah,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dkj $$0, iw $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iw $$3 = $$1.c($$2);
         ebq $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fgt.c(g, $$4.b($$0, $$1, fgh.a()), fgg.i);
         if ($$5) {
            ebq $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(ebq $$0) {
      return $$0.b(b) && $$0.a(axn.aX) && $$0.c(b);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(d) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dyv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      if ($$0 instanceof asb $$3) {
         if ($$1.c(b)) {
            dfi.a<dfu, dem> $$4 = dfi.a(dfm.e);
            return a($$2, dyq.H, ($$2x, $$3x, $$4x, $$5) -> dyv.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, dyq.H, dyv::a);
         }
      } else {
         return $$1.c(b) ? a($$2, dyq.H, dyv::b) : null;
      }
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   public static boolean i(ebq $$0) {
      return $$0.a(axn.aX, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
