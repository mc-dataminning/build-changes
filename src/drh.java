import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drh extends djx implements drp {
   public static final MapCodec<drh> c = b(drh::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dyr<dza> f = dyk.bp;
   public static final dyt g = dyk.aU;
   public static final dyl h = dyk.D;
   protected static final fcr i = dkl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ae.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dpw.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends drh> a() {
      return c;
   }

   public drh(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, dza.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      jh $$1 = $$0.a();
      etw $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == etx.c));
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(h) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (o($$0) != dza.b) {
         if (o($$0) == dza.c) {
            $$1.a($$2, $$0.b(f, dza.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, axf.wB, axg.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, bvj $$3) {
      if (!$$0.B_() && q($$2) && $$3.aq() != bvq.bG && $$0.c_($$1) instanceof dwg $$5 && $$0 instanceof ash $$6 && $$5.go().a($$6, $$1, ecq.P, ecq.a.a($$2))) {
         $$5.f().b($$6, ecq.P, ecq.a.a($$3), $$3.dt());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$1.B_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.T().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (o($$0) == dza.b) {
            b($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dhh $$0, jh $$1, dxu $$2) {
      dkl $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dwg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return !$$0.C ? a($$2, duy.J, ($$0x, $$1x, $$2x, $$3) -> ecz.c.a($$0x, $$3.gn(), $$3.go())) : null;
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return i;
   }

   @Override
   protected boolean f_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dza o(dxu $$0) {
      return $$0.c(f);
   }

   public static boolean q(dxu $$0) {
      return o($$0) == dza.a;
   }

   public static void a(dhh $$0, jh $$1, dxu $$2) {
      $$0.a($$1, $$2.b(f, dza.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bvj $$0, dhh $$1, jh $$2, dxu $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dza.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, ecq.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.wA, axg.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bvj $$0, dhh $$1, jh $$2, int $$3) {
      for (jm $$4 : jm.values()) {
         jh $$5 = $$2.a($$4);
         dxu $$6 = $$1.a_($$5);
         if ($$6.a(axu.bX)) {
            $$1.a(ecz.b($$3), $$5, ecq.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, axf.I, axg.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if (o($$0) == dza.b) {
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
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dwg $$4) {
         return o($$0) == dza.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   @Override
   protected boolean g_(dxu $$0) {
      return true;
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, cxo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bsk.a(5));
      }
   }
}
