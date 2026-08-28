import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dlb extends djy implements drq {
   public static final MapCodec<dlb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, dlb::new)
   );
   protected static final fcs b = dkm.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dym c = dyl.r;
   public static final dym d = dyl.z;
   public static final dym e = dyl.D;
   public static final dys<jm> f = dyl.S;
   private static final fcs g = dkm.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   public dlb(boolean $$0, int $$1, dxu.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.l(this.F.b().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)).b(f, jm.c));
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if ($$2.c_($$3) instanceof dvd $$8) {
         cxp $$9 = $$4.b($$5);
         if ($$2.P().a(dcn.h).a($$9)) {
            if ($$2 instanceof ash $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(axp.av);
               return btj.b;
            }

            return btj.c;
         }
      }

      return btj.f;
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if ($$0.c(c) && $$3 instanceof bwg) {
         $$3.a($$1.aj().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dux $$5 = $$1.c_($$2);
         if ($$5 instanceof dvd) {
            btf.a($$1, $$2, ((dvd)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      dhj $$1 = $$0.q();
      jh $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == ety.c;
      return this.m().b(e, Boolean.valueOf($$3)).b(d, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(c, Boolean.valueOf(!$$3)).b(f, $$0.g());
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return $$4 == jm.a ? $$0.b(d, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(dxv $$0) {
      return $$0.a(dko.iA);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.dK, axg.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ls.Z, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bvk $$0, dhj $$1, jh $$2, dxv $$3) {
      if ($$1.B_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dhi)$$1, $$2, $$3.c(d), true);
         }
      }

      dux $$5 = $$1.c_($$2);
      if ($$5 instanceof dvd) {
         ((dvd)$$5).d();
      }

      $$1.a($$0, ecr.c, $$2);
   }

   @Override
   public boolean a(dhj $$0, jh $$1, dxv $$2, etx $$3) {
      if (!$$2.c(dyl.D) && $$3.a() == ety.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.B_()) {
               $$0.a(null, $$1, axf.kz, axg.e, 1.0F, 1.0F);
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
   protected void a(dhi $$0, dxv $$1, fbu $$2, cqq $$3) {
      jh $$4 = $$2.b();
      if ($$0 instanceof ash $$5 && $$3.bY() && $$3.c($$5, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.b(dyl.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dhi $$0, jh $$1, boolean $$2, boolean $$3) {
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

   public static boolean a(dhi $$0, jh $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         jh $$3 = $$1.c($$2);
         dxv $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fcp.c(g, $$4.b($$0, $$1, fcd.a()), fcc.i);
         if ($$5) {
            dxv $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dxv $$0) {
      return $$0.b(c) && $$0.a(axu.aX) && $$0.c(c);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(e) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      if ($$0 instanceof ash $$3) {
         if ($$1.c(c)) {
            dcl.a<dcx, dbp> $$4 = dcl.a(dcp.e);
            return a($$2, duz.H, ($$2x, $$3x, $$4x, $$5) -> dvd.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, duz.H, dvd::a);
         }
      } else {
         return $$1.c(c) ? a($$2, duz.H, dvd::b) : null;
      }
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   public static boolean i(dxv $$0) {
      return $$0.a(axu.aX, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
