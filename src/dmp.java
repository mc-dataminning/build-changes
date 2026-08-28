import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dmp extends dlm implements dtj {
   public static final MapCodec<dmp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.C), t()
            )
            .apply($$0, dmp::new)
   );
   public static final eaq b = eap.u;
   public static final eaq c = eap.D;
   public static final eaq d = eap.I;
   public static final eax<ja> e = eap.T;
   private static final ffc f = dma.b(16.0, 0.0, 7.0);
   private static final ffc g = dma.b(4.0, 0.0, 16.0);
   private static final int h = 5;
   private final boolean i;
   private final int C;

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   public dmp(boolean $$0, int $$1, dzy.d $$2) {
      super($$2);
      this.i = $$0;
      this.C = $$1;
      this.l(this.B.b().b(b, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)).b(e, ja.c));
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if ($$2.c_($$3) instanceof dxe $$8) {
         cyy $$9 = $$4.b($$5);
         if ($$2.Q().a(ddy.h).a($$9)) {
            if ($$2 instanceof arq $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(awx.av);
               return bub.b;
            }

            return bub.c;
         }
      }

      return bub.f;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if ($$0.c(b) && $$3 instanceof bxc) {
         $$3.a($$1.al().b(), (float)this.C);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      diw $$1 = $$0.q();
      iu $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == ewh.c;
      return this.m().b(d, Boolean.valueOf($$3)).b(c, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(b, Boolean.valueOf(!$$3)).b(e, $$0.g());
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return $$4 == ja.a ? $$0.b(c, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(dzz $$0) {
      return $$0.a(dmc.iI);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return f;
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.dK, awo.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lx.ab, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bwd $$0, diw $$1, iu $$2, dzz $$3) {
      if ($$1.w_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((div)$$1, $$2, $$3.c(c), true);
         }
      }

      $$1.a($$0, eez.c, $$2);
   }

   @Override
   public boolean a(diw $$0, iu $$1, dzz $$2, ewg $$3) {
      if (!$$2.c(eap.I) && $$3.a() == ewh.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.w_()) {
               $$0.a(null, $$1, awn.kG, awo.e, 1.0F, 1.0F);
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
   protected void a(div $$0, dzz $$1, fee $$2, crs $$3) {
      iu $$4 = $$2.b();
      if ($$0 instanceof arq $$5 && $$3.bY() && $$3.c($$5, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.b(eap.u, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(div $$0, iu $$1, boolean $$2, boolean $$3) {
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

   public static boolean a(div $$0, iu $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iu $$3 = $$1.c($$2);
         dzz $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fez.c(g, $$4.b($$0, $$1, fen.a()), fem.i);
         if ($$5) {
            dzz $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dzz $$0) {
      return $$0.b(b) && $$0.a(axc.aX) && $$0.c(b);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(d) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      if ($$0 instanceof arq $$3) {
         if ($$1.c(b)) {
            ddw.a<dei, dda> $$4 = ddw.a(dea.e);
            return a($$2, dwz.H, ($$2x, $$3x, $$4x, $$5) -> dxe.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, dwz.H, dxe::a);
         }
      } else {
         return $$1.c(b) ? a($$2, dwz.H, dxe::b) : null;
      }
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   public static boolean i(dzz $$0) {
      return $$0.a(axc.aX, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
