import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dly extends dkm implements btu {
   public static final MapCodec<dly> a = b(dly::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dyu e = dyl.aM;
   public static final Object2FloatMap<dhh> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final fcs h = fcp.b();
   private static final fcs[] i = ae.a(new fcs[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = fcp.a(h, dkm.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), fcc.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cxt.cD);
      a(0.3F, cxt.cA);
      a(0.3F, cxt.cB);
      a(0.3F, cxt.cG);
      a(0.3F, cxt.cH);
      a(0.3F, cxt.cE);
      a(0.3F, cxt.cF);
      a(0.3F, cxt.cC);
      a(0.3F, cxt.cJ);
      a(0.3F, cxt.cI);
      a(0.3F, cxt.X);
      a(0.3F, cxt.Y);
      a(0.3F, cxt.Z);
      a(0.3F, cxt.aa);
      a(0.3F, cxt.ab);
      a(0.3F, cxt.ac);
      a(0.3F, cxt.ad);
      a(0.3F, cxt.ae);
      a(0.3F, cxt.af);
      a(0.3F, cxt.wb);
      a(0.3F, cxt.sL);
      a(0.3F, cxt.cU);
      a(0.3F, cxt.dR);
      a(0.3F, cxt.sN);
      a(0.3F, cxt.sM);
      a(0.3F, cxt.cZ);
      a(0.3F, cxt.xl);
      a(0.3F, cxt.xm);
      a(0.3F, cxt.pR);
      a(0.3F, cxt.dT);
      a(0.3F, cxt.dV);
      a(0.3F, cxt.dW);
      a(0.3F, cxt.dS);
      a(0.3F, cxt.ea);
      a(0.3F, cxt.dY);
      a(0.3F, cxt.bN);
      a(0.3F, cxt.vY);
      a(0.3F, cxt.vZ);
      a(0.5F, cxt.rl);
      a(0.5F, cxt.ip);
      a(0.5F, cxt.cK);
      a(0.5F, cxt.fi);
      a(0.5F, cxt.dQ);
      a(0.5F, cxt.gi);
      a(0.5F, cxt.dN);
      a(0.5F, cxt.dO);
      a(0.5F, cxt.dP);
      a(0.5F, cxt.sK);
      a(0.5F, cxt.gj);
      a(0.65F, cxt.da);
      a(0.65F, cxt.go);
      a(0.65F, cxt.fx);
      a(0.65F, cxt.fy);
      a(0.65F, cxt.gh);
      a(0.65F, cxt.oQ);
      a(0.65F, cxt.wa);
      a(0.65F, cxt.uV);
      a(0.65F, cxt.rV);
      a(0.65F, cxt.uW);
      a(0.65F, cxt.pS);
      a(0.65F, cxt.dH);
      a(0.65F, cxt.dI);
      a(0.65F, cxt.gd);
      a(0.65F, cxt.dJ);
      a(0.65F, cxt.dK);
      a(0.65F, cxt.sX);
      a(0.65F, cxt.dL);
      a(0.65F, cxt.dM);
      a(0.65F, cxt.xp);
      a(0.65F, cxt.dr);
      a(0.65F, cxt.ds);
      a(0.65F, cxt.dt);
      a(0.65F, cxt.du);
      a(0.65F, cxt.dv);
      a(0.65F, cxt.dw);
      a(0.65F, cxt.dx);
      a(0.65F, cxt.dy);
      a(0.65F, cxt.dz);
      a(0.65F, cxt.dA);
      a(0.65F, cxt.dB);
      a(0.65F, cxt.dC);
      a(0.65F, cxt.dD);
      a(0.65F, cxt.cV);
      a(0.65F, cxt.il);
      a(0.65F, cxt.im);
      a(0.65F, cxt.in);
      a(0.65F, cxt.io);
      a(0.65F, cxt.iq);
      a(0.65F, cxt.dG);
      a(0.65F, cxt.cW);
      a(0.65F, cxt.dU);
      a(0.65F, cxt.dX);
      a(0.65F, cxt.dZ);
      a(0.85F, cxt.hR);
      a(0.85F, cxt.gb);
      a(0.85F, cxt.gc);
      a(0.85F, cxt.jl);
      a(0.85F, cxt.jm);
      a(0.85F, cxt.cX);
      a(0.85F, cxt.pT);
      a(0.85F, cxt.uX);
      a(0.85F, cxt.sG);
      a(0.85F, cxt.dE);
      a(0.85F, cxt.dF);
      a(1.0F, cxt.sp);
      a(1.0F, cxt.vj);
   }

   private static void a(float $$0, dhh $$1) {
      f.put($$1.j(), $$0);
   }

   public dly(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   public static void a(dhi $$0, jh $$1, boolean $$2) {
      dxv $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? axf.fw : axf.fv, axg.e, 1.0F, 1.0F, false);
      double $$4 = $$3.f($$0, $$1).b(jm.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      bam $$7 = $$0.H_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            ls.P,
            (double)$$1.u() + 0.13125F + 0.7375F * (double)$$7.i(),
            (double)$$1.v() + $$4 + (double)$$7.i() * (1.0 - $$4),
            (double)$$1.w() + 0.13125F + 0.7375F * (double)$$7.i(),
            $$9,
            $$10,
            $$11
         );
      }
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2) {
      return h;
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return i[0];
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.h())) {
         if ($$7 < 7 && !$$2.C) {
            dxv $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(axp.c.b($$0.h()));
            $$0.a(1, $$4);
         }

         return btj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return btj.a;
      } else {
         return btj.e;
      }
   }

   public static dxv a(bvk $$0, dxv $$1, ash $$2, cxp $$3, jh $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.h())) {
         dxv $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dxv a(bvk $$0, dxv $$1, dhi $$2, jh $$3) {
      if (!$$2.C) {
         fby $$4 = fby.a($$3, 0.5, 1.01, 0.5).a($$2.A, 0.7F);
         cmb $$5 = new cmb($$2, $$4.a(), $$4.b(), $$4.c(), new cxp(cxt.sm));
         $$5.s();
         $$2.b($$5);
      }

      dxv $$6 = a($$0, $$1, (dhj)$$2, $$3);
      $$2.a(null, $$3, axf.fu, axg.e, 1.0F, 1.0F);
      return $$6;
   }

   static dxv a(@Nullable bvk $$0, dxv $$1, dhj $$2, jh $$3) {
      dxv $$4 = $$1.b(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(ecr.c, $$3, ecr.a.a($$0, $$4));
      return $$4;
   }

   static dxv a(@Nullable bvk $$0, dxv $$1, dhj $$2, jh $$3, cxp $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.h());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.H_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dxv $$8 = $$1.b(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(ecr.c, $$3, ecr.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, axf.fx, axg.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   @Override
   public btt a(dxv $$0, dhj $$1, jh $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dly.c($$0, $$1, $$2, new cxp(cxt.sm));
      } else {
         return (btt)($$3 < 7 ? new dly.b($$0, $$1, $$2) : new dly.a());
      }
   }

   static class a extends btq implements btt {
      public a() {
         super(0);
      }

      @Override
      public int[] a(jm $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cxp $$1, @Nullable jm $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cxp $$1, jm $$2) {
         return false;
      }
   }

   static class b extends btq implements btt {
      private final dxv b;
      private final dhj c;
      private final jh d;
      private boolean e;

      public b(dxv $$0, dhj $$1, jh $$2) {
         super(1);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ao_() {
         return 1;
      }

      @Override
      public int[] a(jm $$0) {
         return $$0 == jm.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cxp $$1, @Nullable jm $$2) {
         return !this.e && $$2 == jm.b && dly.f.containsKey($$1.h());
      }

      @Override
      public boolean b(int $$0, cxp $$1, jm $$2) {
         return false;
      }

      @Override
      public void e() {
         cxp $$0 = this.a(0);
         if (!$$0.f()) {
            this.e = true;
            dxv $$1 = dly.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends btq implements btt {
      private final dxv b;
      private final dhj c;
      private final jh d;
      private boolean e;

      public c(dxv $$0, dhj $$1, jh $$2, cxp $$3) {
         super($$3);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ao_() {
         return 1;
      }

      @Override
      public int[] a(jm $$0) {
         return $$0 == jm.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cxp $$1, @Nullable jm $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cxp $$1, jm $$2) {
         return !this.e && $$2 == jm.a && $$1.a(cxt.sm);
      }

      @Override
      public void e() {
         dly.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
