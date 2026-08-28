import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dra extends djq implements dri {
   public static final MapCodec<dra> c = b(dra::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dyk<dyt> f = dyd.bp;
   public static final dym g = dyd.aU;
   public static final dye h = dyd.D;
   protected static final fcm i = dke.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ae.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dpp.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dra> a() {
      return c;
   }

   public dra(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, dyt.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      jh $$1 = $$0.a();
      etp $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == etq.c));
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(h) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (o($$0) != dyt.b) {
         if (o($$0) == dyt.c) {
            $$1.a($$2, $$0.b(f, dyt.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, axf.wA, axg.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, bvf $$3) {
      if (!$$0.B_() && q($$2) && $$3.aq() != bvm.bG && $$0.c_($$1) instanceof dvz $$5 && $$0 instanceof ash $$6 && $$5.go().a($$6, $$1, ecj.P, ecj.a.a($$2))) {
         $$5.f().b($$6, ecj.P, ecj.a.a($$3), $$3.dt());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$1.B_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.T().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (o($$0) == dyt.b) {
            b($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dha $$0, jh $$1, dxn $$2) {
      dke $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return !$$0.C ? a($$2, dur.J, ($$0x, $$1x, $$2x, $$3) -> ecs.c.a($$0x, $$3.gn(), $$3.go())) : null;
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return i;
   }

   @Override
   protected boolean f_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dyt o(dxn $$0) {
      return $$0.c(f);
   }

   public static boolean q(dxn $$0) {
      return o($$0) == dyt.a;
   }

   public static void a(dha $$0, jh $$1, dxn $$2) {
      $$0.a($$1, $$2.b(f, dyt.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bvf $$0, dha $$1, jh $$2, dxn $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dyt.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, ecj.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.wz, axg.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bvf $$0, dha $$1, jh $$2, int $$3) {
      for (jm $$4 : jm.values()) {
         jh $$5 = $$2.a($$4);
         dxn $$6 = $$1.a_($$5);
         if ($$6.a(axu.bX)) {
            $$1.a(ecs.b($$3), $$5, ecj.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, axf.I, axg.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if (o($$0) == dyt.b) {
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
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dvz $$4) {
         return o($$0) == dyt.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   @Override
   protected boolean g_(dxn $$0) {
      return true;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, cxk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bsg.a(5));
      }
   }
}
