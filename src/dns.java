import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dns extends dmo implements dun {
   public static final MapCodec<dns> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.D), t()
            )
            .apply($$0, dns::new)
   );
   public static final ebv b = ebu.u;
   public static final ebv c = ebu.D;
   public static final ebv d = ebu.I;
   public static final ecc<jb> e = ebu.T;
   private static final fgk f = dnc.b(16.0, 0.0, 7.0);
   private static final fgk g = dnc.b(4.0, 0.0, 16.0);
   private static final int h = 5;
   private final boolean i;
   private final int D;

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   public dns(boolean $$0, int $$1, ebd.d $$2) {
      super($$2);
      this.i = $$0;
      this.D = $$1;
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)).b(e, jb.c));
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if ($$2.c_($$3) instanceof dyj $$8) {
         czy $$9 = $$4.b($$5);
         if ($$2.Q().a(dey.h).a($$9)) {
            if ($$2 instanceof ars $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(awz.av);
               return bur.b;
            }

            return bur.c;
         }
      }

      return bur.f;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if ($$0.c(b) && $$3 instanceof bxu) {
         $$3.a($$1.al().b(), (float)this.D);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      djy $$1 = $$0.q();
      iv $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == exp.c;
      return this.m().b(d, Boolean.valueOf($$3)).b(c, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(b, Boolean.valueOf(!$$3)).b(e, $$0.g());
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return $$4 == jb.a ? $$0.b(c, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(ebe $$0) {
      return $$0.a(dne.iL);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return f;
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awp.dM, awq.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ly.ab, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bwt $$0, djy $$1, iv $$2, ebe $$3) {
      if ($$1.A_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((djx)$$1, $$2, $$3.c(c), true);
         }
      }

      $$1.a($$0, ege.c, $$2);
   }

   @Override
   public boolean a(djy $$0, iv $$1, ebe $$2, exo $$3) {
      if (!$$2.c(ebu.I) && $$3.a() == exp.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.A_()) {
               $$0.a(null, $$1, awp.kJ, awq.e, 1.0F, 1.0F);
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
   protected void a(djx $$0, ebe $$1, ffm $$2, css $$3) {
      iv $$4 = $$2.b();
      if ($$0 instanceof ars $$5 && $$3.bX() && $$3.c($$5, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.b(ebu.u, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(djx $$0, iv $$1, boolean $$2, boolean $$3) {
      azx $$4 = $$0.G_();
      mc $$5 = $$2 ? ly.ax : ly.aw;
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
            ly.ah,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(djx $$0, iv $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iv $$3 = $$1.c($$2);
         ebe $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fgh.c(g, $$4.b($$0, $$1, ffv.a()), ffu.i);
         if ($$5) {
            ebe $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(ebe $$0) {
      return $$0.b(b) && $$0.a(axe.aX) && $$0.c(b);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(d) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dyj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      if ($$0 instanceof ars $$3) {
         if ($$1.c(b)) {
            dew.a<dfi, dea> $$4 = dew.a(dfa.e);
            return a($$2, dye.H, ($$2x, $$3x, $$4x, $$5) -> dyj.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, dye.H, dyj::a);
         }
      } else {
         return $$1.c(b) ? a($$2, dye.H, dyj::b) : null;
      }
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   public static boolean i(ebe $$0) {
      return $$0.a(axe.aX, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
