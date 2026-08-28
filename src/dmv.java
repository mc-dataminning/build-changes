import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dmv extends dlr implements dtq {
   public static final MapCodec<dmv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.D), t()
            )
            .apply($$0, dmv::new)
   );
   public static final eay b = eax.u;
   public static final eay c = eax.D;
   public static final eay d = eax.I;
   public static final ebf<ja> e = eax.T;
   private static final ffk f = dmf.b(16.0, 0.0, 7.0);
   private static final ffk g = dmf.b(4.0, 0.0, 16.0);
   private static final int h = 5;
   private final boolean i;
   private final int D;

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   public dmv(boolean $$0, int $$1, eag.d $$2) {
      super($$2);
      this.i = $$0;
      this.D = $$1;
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)).b(e, ja.c));
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if ($$2.c_($$3) instanceof dxm $$8) {
         czd $$9 = $$4.b($$5);
         if ($$2.Q().a(ded.h).a($$9)) {
            if ($$2 instanceof arq $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(awx.av);
               return bud.b;
            }

            return bud.c;
         }
      }

      return bud.f;
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if ($$0.c(b) && $$3 instanceof bxe) {
         $$3.a($$1.al().b(), (float)this.D);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      djb $$1 = $$0.q();
      iu $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == ewp.c;
      return this.m().b(d, Boolean.valueOf($$3)).b(c, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(b, Boolean.valueOf(!$$3)).b(e, $$0.g());
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return $$4 == ja.a ? $$0.b(c, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(eah $$0) {
      return $$0.a(dmh.iL);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return f;
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.dM, awo.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lx.ab, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bwf $$0, djb $$1, iu $$2, eah $$3) {
      if ($$1.w_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dja)$$1, $$2, $$3.c(c), true);
         }
      }

      $$1.a($$0, efh.c, $$2);
   }

   @Override
   public boolean a(djb $$0, iu $$1, eah $$2, ewo $$3) {
      if (!$$2.c(eax.I) && $$3.a() == ewp.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.w_()) {
               $$0.a(null, $$1, awn.kJ, awo.e, 1.0F, 1.0F);
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
   protected void a(dja $$0, eah $$1, fem $$2, crx $$3) {
      iu $$4 = $$2.b();
      if ($$0 instanceof arq $$5 && $$3.bY() && $$3.c($$5, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.b(eax.u, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dja $$0, iu $$1, boolean $$2, boolean $$3) {
      azv $$4 = $$0.C_();
      mb $$5 = $$2 ? lx.ax : lx.aw;
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
            lx.ah,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dja $$0, iu $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iu $$3 = $$1.c($$2);
         eah $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = ffh.c(g, $$4.b($$0, $$1, fev.a()), feu.i);
         if ($$5) {
            eah $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(eah $$0) {
      return $$0.b(b) && $$0.a(axc.aX) && $$0.c(b);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(d) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dxm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      if ($$0 instanceof arq $$3) {
         if ($$1.c(b)) {
            deb.a<den, ddf> $$4 = deb.a(def.e);
            return a($$2, dxh.H, ($$2x, $$3x, $$4x, $$5) -> dxm.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, dxh.H, dxm::a);
         }
      } else {
         return $$1.c(b) ? a($$2, dxh.H, dxm::b) : null;
      }
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   public static boolean i(eah $$0) {
      return $$0.a(axc.aX, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
