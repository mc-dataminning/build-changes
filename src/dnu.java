import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dnu extends dmq implements dup {
   public static final MapCodec<dnu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.D), t()
            )
            .apply($$0, dnu::new)
   );
   public static final ebx b = ebw.u;
   public static final ebx c = ebw.D;
   public static final ebx d = ebw.I;
   public static final ece<jc> e = ebw.T;
   private static final fgm f = dne.b(16.0, 0.0, 7.0);
   private static final fgm g = dne.b(4.0, 0.0, 16.0);
   private static final int h = 5;
   private final boolean i;
   private final int D;

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   public dnu(boolean $$0, int $$1, ebf.d $$2) {
      super($$2);
      this.i = $$0;
      this.D = $$1;
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)).b(e, jc.c));
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if ($$2.c_($$3) instanceof dyl $$8) {
         daa $$9 = $$4.b($$5);
         if ($$2.Q().a(dfa.h).a($$9)) {
            if ($$2 instanceof aru $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(axb.av);
               return but.b;
            }

            return but.c;
         }
      }

      return but.f;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if ($$0.c(b) && $$3 instanceof bxw) {
         $$3.a($$1.al().b(), (float)this.D);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      dka $$1 = $$0.q();
      iw $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == exr.c;
      return this.m().b(d, Boolean.valueOf($$3)).b(c, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(b, Boolean.valueOf(!$$3)).b(e, $$0.g());
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return $$4 == jc.a ? $$0.b(c, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(ebg $$0) {
      return $$0.a(dng.iL);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return f;
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awr.dM, aws.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lz.ab, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bwv $$0, dka $$1, iw $$2, ebg $$3) {
      if ($$1.A_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((djz)$$1, $$2, $$3.c(c), true);
         }
      }

      $$1.a($$0, egg.c, $$2);
   }

   @Override
   public boolean a(dka $$0, iw $$1, ebg $$2, exq $$3) {
      if (!$$2.c(ebw.I) && $$3.a() == exr.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.A_()) {
               $$0.a(null, $$1, awr.kJ, aws.e, 1.0F, 1.0F);
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
   protected void a(djz $$0, ebg $$1, ffo $$2, csu $$3) {
      iw $$4 = $$2.b();
      if ($$0 instanceof aru $$5 && $$3.bX() && $$3.c($$5, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.b(ebw.u, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(djz $$0, iw $$1, boolean $$2, boolean $$3) {
      azz $$4 = $$0.G_();
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

   public static boolean a(djz $$0, iw $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iw $$3 = $$1.c($$2);
         ebg $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fgj.c(g, $$4.b($$0, $$1, ffx.a()), ffw.i);
         if ($$5) {
            ebg $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(ebg $$0) {
      return $$0.b(b) && $$0.a(axg.aX) && $$0.c(b);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(d) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      if ($$0 instanceof aru $$3) {
         if ($$1.c(b)) {
            dey.a<dfk, dec> $$4 = dey.a(dfc.e);
            return a($$2, dyg.H, ($$2x, $$3x, $$4x, $$5) -> dyl.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, dyg.H, dyl::a);
         }
      } else {
         return $$1.c(b) ? a($$2, dyg.H, dyl::b) : null;
      }
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   public static boolean i(ebg $$0) {
      return $$0.a(axg.aX, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
