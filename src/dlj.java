import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dlj extends dkg implements dsb {
   public static final MapCodec<dlj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.C), t()
            )
            .apply($$0, dlj::new)
   );
   public static final dzd b = dzc.u;
   public static final dzd c = dzc.D;
   public static final dzd d = dzc.I;
   public static final dzk<jo> e = dzc.T;
   private static final fdo f = dku.b(16.0, 0.0, 7.0);
   private static final fdo g = dku.b(4.0, 0.0, 16.0);
   private static final int h = 5;
   private final boolean i;
   private final int C;

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   public dlj(boolean $$0, int $$1, dyl.d $$2) {
      super($$2);
      this.i = $$0;
      this.C = $$1;
      this.l(this.B.b().b(b, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)).b(e, jo.c));
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if ($$2.c_($$3) instanceof dvs $$8) {
         cxy $$9 = $$4.b($$5);
         if ($$2.Q().a(dcu.h).a($$9)) {
            if ($$2 instanceof arn $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(awu.av);
               return btq.b;
            }

            return btq.c;
         }
      }

      return btq.f;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if ($$0.c(b) && $$3 instanceof bwr) {
         $$3.a($$1.al().b(), (float)this.C);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dhq $$1 = $$0.q();
      jj $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == euu.c;
      return this.m().b(d, Boolean.valueOf($$3)).b(c, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(b, Boolean.valueOf(!$$3)).b(e, $$0.g());
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return $$4 == jo.a ? $$0.b(c, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(dym $$0) {
      return $$0.a(dkw.iH);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return f;
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awk.dK, awl.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lv.ab, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bvs $$0, dhq $$1, jj $$2, dym $$3) {
      if ($$1.w_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dhp)$$1, $$2, $$3.c(c), true);
         }
      }

      dvl $$5 = $$1.c_($$2);
      if ($$5 instanceof dvs) {
         ((dvs)$$5).f();
      }

      $$1.a($$0, edm.c, $$2);
   }

   @Override
   public boolean a(dhq $$0, jj $$1, dym $$2, eut $$3) {
      if (!$$2.c(dzc.I) && $$3.a() == euu.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.w_()) {
               $$0.a(null, $$1, awk.kF, awl.e, 1.0F, 1.0F);
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
   protected void a(dhp $$0, dym $$1, fcq $$2, crb $$3) {
      jj $$4 = $$2.b();
      if ($$0 instanceof arn $$5 && $$3.bY() && $$3.c($$5, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.b(dzc.u, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dhp $$0, jj $$1, boolean $$2, boolean $$3) {
      azs $$4 = $$0.C_();
      lz $$5 = $$2 ? lv.ax : lv.aw;
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
            lv.ah,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dhp $$0, jj $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         jj $$3 = $$1.c($$2);
         dym $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fdl.c(g, $$4.b($$0, $$1, fcz.a()), fcy.i);
         if ($$5) {
            dym $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dym $$0) {
      return $$0.b(b) && $$0.a(awz.aX) && $$0.c(b);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(d) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dvs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      if ($$0 instanceof arn $$3) {
         if ($$1.c(b)) {
            dcs.a<dde, dbw> $$4 = dcs.a(dcw.e);
            return a($$2, dvn.H, ($$2x, $$3x, $$4x, $$5) -> dvs.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, dvn.H, dvs::a);
         }
      } else {
         return $$1.c(b) ? a($$2, dvn.H, dvs::b) : null;
      }
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   public static boolean i(dym $$0) {
      return $$0.a(awz.aX, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
