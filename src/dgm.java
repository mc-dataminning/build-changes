import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgm extends dfk implements dna {
   public static final MapCodec<dgm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dgm::new)
   );
   protected static final exv b = dfy.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dtt c = dts.r;
   public static final dtt d = dts.y;
   public static final dtt e = dts.C;
   public static final dtw f = dts.R;
   private static final exv g = dfy.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   public dgm(boolean $$0, int $$1, dtb.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ji.c));
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, ewy $$6) {
      if ($$2.c_($$3) instanceof dqn $$8) {
         cuq $$9 = $$4.b($$5);
         Optional<czb<cym>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$9, $$10.get().b().d())) {
               $$4.a(avz.av);
               return bqt.a;
            }

            return bqt.b;
         }
      }

      return bqt.d;
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if ($$0.c(c) && $$3 instanceof btn) {
         $$3.a($$1.aj().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dqh $$5 = $$1.c_($$2);
         if ($$5 instanceof dqn) {
            bqn.a($$1, $$2, ((dqn)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dcx $$1 = $$0.q();
      jd $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == epf.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.e())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return $$1 == ji.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dtc $$0) {
      return $$0.a(dga.ij);
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return b;
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avp.dI, avq.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lm.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bsr $$0, dcx $$1, jd $$2, dtc $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dcw)$$1, $$2, $$3.c(d), true);
         }
      }

      dqh $$5 = $$1.c_($$2);
      if ($$5 instanceof dqn) {
         ((dqn)$$5).d();
      }

      $$1.a($$0, dxz.c, $$2);
   }

   @Override
   public boolean a(dcx $$0, jd $$1, dtc $$2, epe $$3) {
      if (!$$2.c(dts.C) && $$3.a() == epf.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, avp.kf, avq.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.a(e, Boolean.valueOf(true)).a(c, Boolean.valueOf(false)), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void a(dcw $$0, dtc $$1, ewy $$2, cnp $$3) {
      jd $$4 = $$2.a();
      if (!$$0.B && $$3.bR() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dts.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dcw $$0, jd $$1, boolean $$2, boolean $$3) {
      ayw $$4 = $$0.E_();
      lq $$5 = $$2 ? lm.au : lm.at;
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
            lm.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dcw $$0, jd $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         jd $$3 = $$1.c($$2);
         dtc $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = exs.c(g, $$4.b($$0, $$1, exh.a()), exg.i);
         if ($$5) {
            dtc $$6 = $$0.a_($$3.e());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dtc $$0) {
      return $$0.b(c) && $$0.a(awe.aW) && $$0.c(c);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(e) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dqn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dqj.G, dqn::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dqj.G, dqn::a) : a($$2, dqj.G, dqn::b);
      }
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   public static boolean h(dtc $$0) {
      return $$0.a(awe.aW, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
