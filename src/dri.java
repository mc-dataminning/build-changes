import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dri extends djy implements drq {
   public static final MapCodec<dri> c = b(dri::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dys<dzb> f = dyl.bp;
   public static final dyu g = dyl.aU;
   public static final dym h = dyl.D;
   protected static final fcs i = dkm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ae.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dpx.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dri> a() {
      return c;
   }

   public dri(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, dzb.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      jh $$1 = $$0.a();
      etx $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == ety.c));
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(h) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (o($$0) != dzb.b) {
         if (o($$0) == dzb.c) {
            $$1.a($$2, $$0.b(f, dzb.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, axf.wB, axg.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bvk $$3) {
      if (!$$0.B_() && q($$2) && $$3.aq() != bvr.bG && $$0.c_($$1) instanceof dwh $$5 && $$0 instanceof ash $$6 && $$5.gq().a($$6, $$1, ecr.P, ecr.a.a($$2))) {
         $$5.f().b($$6, ecr.P, ecr.a.a($$3), $$3.du());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$1.B_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.T().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (o($$0) == dzb.b) {
            b($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dhi $$0, jh $$1, dxv $$2) {
      dkm $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return !$$0.C ? a($$2, duz.J, ($$0x, $$1x, $$2x, $$3) -> eda.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return i;
   }

   @Override
   protected boolean f_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dzb o(dxv $$0) {
      return $$0.c(f);
   }

   public static boolean q(dxv $$0) {
      return o($$0) == dzb.a;
   }

   public static void a(dhi $$0, jh $$1, dxv $$2) {
      $$0.a($$1, $$2.b(f, dzb.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bvk $$0, dhi $$1, jh $$2, dxv $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dzb.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, ecr.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.wA, axg.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bvk $$0, dhi $$1, jh $$2, int $$3) {
      for (jm $$4 : jm.values()) {
         jh $$5 = $$2.a($$4);
         dxv $$6 = $$1.a_($$5);
         if ($$6.a(axu.bX)) {
            $$1.a(eda.b($$3), $$5, ecr.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, axf.I, axg.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if (o($$0) == dzb.b) {
         jm $$4 = jm.b($$3);
         if ($$4 != jm.b && $$4 != jm.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(lm.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dwh $$4) {
         return o($$0) == dzb.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   @Override
   protected boolean g_(dxv $$0) {
      return true;
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, cxp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bsl.a(5));
      }
   }
}
