import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dla extends djx implements drp {
   public static final MapCodec<dla> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, dla::new)
   );
   protected static final fcr b = dkl.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dyl c = dyk.r;
   public static final dyl d = dyk.z;
   public static final dyl e = dyk.D;
   public static final dyr<jm> f = dyk.S;
   private static final fcr g = dkl.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   public dla(boolean $$0, int $$1, dxt.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.l(this.F.b().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)).b(f, jm.c));
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if ($$2.c_($$3) instanceof dvc $$8) {
         cxo $$9 = $$4.b($$5);
         if ($$2.P().a(dcm.h).a($$9)) {
            if ($$2 instanceof ash $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(axp.av);
               return bti.b;
            }

            return bti.c;
         }
      }

      return bti.f;
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if ($$0.c(c) && $$3 instanceof bwf) {
         $$3.a($$1.aj().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         duw $$5 = $$1.c_($$2);
         if ($$5 instanceof dvc) {
            bte.a($$1, $$2, ((dvc)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == etx.c;
      return this.m().b(e, Boolean.valueOf($$3)).b(d, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(c, Boolean.valueOf(!$$3)).b(f, $$0.g());
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$4 == jm.a ? $$0.b(d, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(dxu $$0) {
      return $$0.a(dkn.iA);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
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

   public static void a(@Nullable bvj $$0, dhi $$1, jh $$2, dxu $$3) {
      if ($$1.B_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dhh)$$1, $$2, $$3.c(d), true);
         }
      }

      duw $$5 = $$1.c_($$2);
      if ($$5 instanceof dvc) {
         ((dvc)$$5).d();
      }

      $$1.a($$0, ecq.c, $$2);
   }

   @Override
   public boolean a(dhi $$0, jh $$1, dxu $$2, etw $$3) {
      if (!$$2.c(dyk.D) && $$3.a() == etx.c) {
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
   protected void a(dhh $$0, dxu $$1, fbt $$2, cqp $$3) {
      jh $$4 = $$2.b();
      if ($$0 instanceof ash $$5 && $$3.bY() && $$3.c($$5, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.b(dyk.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dhh $$0, jh $$1, boolean $$2, boolean $$3) {
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

   public static boolean a(dhh $$0, jh $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         jh $$3 = $$1.c($$2);
         dxu $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fco.c(g, $$4.b($$0, $$1, fcc.a()), fcb.i);
         if ($$5) {
            dxu $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dxu $$0) {
      return $$0.b(c) && $$0.a(axu.aX) && $$0.c(c);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(e) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      if ($$0 instanceof ash $$3) {
         if ($$1.c(c)) {
            dck.a<dcw, dbo> $$4 = dck.a(dco.e);
            return a($$2, duy.H, ($$2x, $$3x, $$4x, $$5) -> dvc.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, duy.H, dvc::a);
         }
      } else {
         return $$1.c(c) ? a($$2, duy.H, dvc::b) : null;
      }
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   public static boolean i(dxu $$0) {
      return $$0.a(axu.aX, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
