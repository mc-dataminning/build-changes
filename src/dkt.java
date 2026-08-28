import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkt extends djq implements dri {
   public static final MapCodec<dkt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, dkt::new)
   );
   protected static final fcm b = dke.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dye c = dyd.r;
   public static final dye d = dyd.z;
   public static final dye e = dyd.D;
   public static final dyk<jm> f = dyd.S;
   private static final fcm g = dke.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   public dkt(boolean $$0, int $$1, dxm.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.l(this.F.b().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)).b(f, jm.c));
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if ($$2.c_($$3) instanceof duv $$8) {
         cxk $$9 = $$4.b($$5);
         if ($$2.P().a(dch.h).a($$9)) {
            if ($$2 instanceof ash $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(axp.av);
               return bte.b;
            }

            return bte.c;
         }
      }

      return bte.f;
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if ($$0.c(c) && $$3 instanceof bwb) {
         $$3.a($$1.aj().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dup $$5 = $$1.c_($$2);
         if ($$5 instanceof duv) {
            bta.a($$1, $$2, ((duv)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      dhb $$1 = $$0.q();
      jh $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == etq.c;
      return this.m().b(e, Boolean.valueOf($$3)).b(d, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(c, Boolean.valueOf(!$$3)).b(f, $$0.g());
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return $$4 == jm.a ? $$0.b(d, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(dxn $$0) {
      return $$0.a(dkg.iA);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.dJ, axg.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ls.Z, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bvf $$0, dhb $$1, jh $$2, dxn $$3) {
      if ($$1.B_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dha)$$1, $$2, $$3.c(d), true);
         }
      }

      dup $$5 = $$1.c_($$2);
      if ($$5 instanceof duv) {
         ((duv)$$5).d();
      }

      $$1.a($$0, ecj.c, $$2);
   }

   @Override
   public boolean a(dhb $$0, jh $$1, dxn $$2, etp $$3) {
      if (!$$2.c(dyd.D) && $$3.a() == etq.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.B_()) {
               $$0.a(null, $$1, axf.ky, axg.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.b(e, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void a(dha $$0, dxn $$1, fbo $$2, cql $$3) {
      jh $$4 = $$2.b();
      if ($$0 instanceof ash $$5 && $$3.bY() && $$3.c($$5, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.b(dyd.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dha $$0, jh $$1, boolean $$2, boolean $$3) {
      bam $$4 = $$0.H_();
      lw $$5 = $$2 ? ls.av : ls.au;
      $$0.b(
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
            ls.af,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dha $$0, jh $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         jh $$3 = $$1.c($$2);
         dxn $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fcj.c(g, $$4.b($$0, $$1, fbx.a()), fbw.i);
         if ($$5) {
            dxn $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dxn $$0) {
      return $$0.b(c) && $$0.a(axu.aX) && $$0.c(c);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(e) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new duv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      if ($$0 instanceof ash $$3) {
         if ($$1.c(c)) {
            dcf.a<dcr, dbl> $$4 = dcf.a(dcj.e);
            return a($$2, dur.H, ($$2x, $$3x, $$4x, $$5) -> duv.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, dur.H, duv::a);
         }
      } else {
         return $$1.c(c) ? a($$2, dur.H, duv::b) : null;
      }
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   public static boolean i(dxn $$0) {
      return $$0.a(axu.aX, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
