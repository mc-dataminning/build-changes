import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djz extends diw implements dqq {
   public static final MapCodec<djz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, djz::new)
   );
   protected static final fbs b = djk.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dxm c = dxl.v;
   public static final dxm d = dxl.E;
   public static final dxm e = dxl.J;
   public static final dxs<jn> f = dxl.U;
   private static final fbs g = djk.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(boolean $$0, int $$1, dwu.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.l(this.F.b().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)).b(f, jn.c));
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if ($$2.c_($$3) instanceof dud $$8) {
         cwn $$9 = $$4.b($$5);
         if ($$2.Q().a(dbl.h).a($$9)) {
            if ($$2 instanceof arc $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(awj.av);
               return bsi.b;
            }

            return bsi.c;
         }
      }

      return bsi.f;
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if ($$0.c(c) && $$3 instanceof bvf) {
         $$3.a($$1.ak().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dtx $$5 = $$1.c_($$2);
         if ($$5 instanceof dud) {
            bse.a($$1, $$2, ((dud)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == esy.c;
      return this.m().b(e, Boolean.valueOf($$3)).b(d, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(c, Boolean.valueOf(!$$3)).b(f, $$0.g());
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return $$4 == jn.a ? $$0.b(d, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(dwv $$0) {
      return $$0.a(djm.iH);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avz.dK, awa.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lt.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable buj $$0, dgh $$1, ji $$2, dwv $$3) {
      if ($$1.B_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dgg)$$1, $$2, $$3.c(d), true);
         }
      }

      dtx $$5 = $$1.c_($$2);
      if ($$5 instanceof dud) {
         ((dud)$$5).d();
      }

      $$1.a($$0, ebr.c, $$2);
   }

   @Override
   public boolean a(dgh $$0, ji $$1, dwv $$2, esx $$3) {
      if (!$$2.c(dxl.J) && $$3.a() == esy.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.B_()) {
               $$0.a(null, $$1, avz.kF, awa.e, 1.0F, 1.0F);
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
   protected void a(dgg $$0, dwv $$1, fau $$2, cpo $$3) {
      ji $$4 = $$2.b();
      if ($$0 instanceof arc $$5 && $$3.bY() && $$3.c($$5, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.b(dxl.v, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dgg $$0, ji $$1, boolean $$2, boolean $$3) {
      azg $$4 = $$0.H_();
      lx $$5 = $$2 ? lt.aw : lt.av;
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
            lt.ag,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dgg $$0, ji $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ji $$3 = $$1.c($$2);
         dwv $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fbp.c(g, $$4.b($$0, $$1, fbd.a()), fbc.i);
         if ($$5) {
            dwv $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dwv $$0) {
      return $$0.b(c) && $$0.a(awo.aX) && $$0.c(c);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(e) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dud($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      if ($$0 instanceof arc $$3) {
         if ($$1.c(c)) {
            dbj.a<dbv, dan> $$4 = dbj.a(dbn.e);
            return a($$2, dtz.H, ($$2x, $$3x, $$4x, $$5) -> dud.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, dtz.H, dud::a);
         }
      } else {
         return $$1.c(c) ? a($$2, dtz.H, dud::b) : null;
      }
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   public static boolean i(dwv $$0) {
      return $$0.a(awo.aX, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
