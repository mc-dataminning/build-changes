import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dnh extends dmd implements duc {
   public static final MapCodec<dnh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.D), t()
            )
            .apply($$0, dnh::new)
   );
   public static final ebk b = ebj.u;
   public static final ebk c = ebj.D;
   public static final ebk d = ebj.I;
   public static final ebr<jb> e = ebj.T;
   private static final ffw f = dmr.b(16.0, 0.0, 7.0);
   private static final ffw g = dmr.b(4.0, 0.0, 16.0);
   private static final int h = 5;
   private final boolean i;
   private final int D;

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(boolean $$0, int $$1, eas.d $$2) {
      super($$2);
      this.i = $$0;
      this.D = $$1;
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)).b(e, jb.c));
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      if ($$2.c_($$3) instanceof dxy $$8) {
         czn $$9 = $$4.b($$5);
         if ($$2.Q().a(den.h).a($$9)) {
            if ($$2 instanceof arq $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(awx.av);
               return bug.b;
            }

            return bug.c;
         }
      }

      return bug.f;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$0.c(b) && $$3 instanceof bxj) {
         $$3.a($$1.al().b(), (float)this.D);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      djn $$1 = $$0.q();
      iv $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == exb.c;
      return this.m().b(d, Boolean.valueOf($$3)).b(c, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(b, Boolean.valueOf(!$$3)).b(e, $$0.g());
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return $$4 == jb.a ? $$0.b(c, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(eat $$0) {
      return $$0.a(dmt.iL);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return f;
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.dM, awo.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ly.ab, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bwi $$0, djn $$1, iv $$2, eat $$3) {
      if ($$1.w_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((djm)$$1, $$2, $$3.c(c), true);
         }
      }

      $$1.a($$0, eft.c, $$2);
   }

   @Override
   public boolean a(djn $$0, iv $$1, eat $$2, exa $$3) {
      if (!$$2.c(ebj.I) && $$3.a() == exb.c) {
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
   protected void a(djm $$0, eat $$1, fey $$2, csh $$3) {
      iv $$4 = $$2.b();
      if ($$0 instanceof arq $$5 && $$3.bW() && $$3.c($$5, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.b(ebj.u, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(djm $$0, iv $$1, boolean $$2, boolean $$3) {
      azv $$4 = $$0.C_();
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

   public static boolean a(djm $$0, iv $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iv $$3 = $$1.c($$2);
         eat $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fft.c(g, $$4.b($$0, $$1, ffh.a()), ffg.i);
         if ($$5) {
            eat $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(eat $$0) {
      return $$0.b(b) && $$0.a(axc.aX) && $$0.c(b);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(d) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dxy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      if ($$0 instanceof arq $$3) {
         if ($$1.c(b)) {
            del.a<dex, ddp> $$4 = del.a(dep.e);
            return a($$2, dxt.H, ($$2x, $$3x, $$4x, $$5) -> dxy.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, dxt.H, dxy::a);
         }
      } else {
         return $$1.c(b) ? a($$2, dxt.H, dxy::b) : null;
      }
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   public static boolean i(eat $$0) {
      return $$0.a(axc.aX, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
