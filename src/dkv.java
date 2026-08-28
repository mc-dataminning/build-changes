import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dkv extends djk implements bst {
   public static final MapCodec<dkv> a = b(dkv::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dxu e = dxl.aO;
   public static final Object2FloatMap<dgf> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final fbs h = fbp.b();
   private static final fbs[] i = af.a(new fbs[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = fbp.a(h, djk.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), fbc.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cwr.cD);
      a(0.3F, cwr.cA);
      a(0.3F, cwr.cB);
      a(0.3F, cwr.cG);
      a(0.3F, cwr.cH);
      a(0.3F, cwr.cE);
      a(0.3F, cwr.cF);
      a(0.3F, cwr.cC);
      a(0.3F, cwr.cJ);
      a(0.3F, cwr.cI);
      a(0.3F, cwr.X);
      a(0.3F, cwr.Y);
      a(0.3F, cwr.Z);
      a(0.3F, cwr.aa);
      a(0.3F, cwr.ab);
      a(0.3F, cwr.ac);
      a(0.3F, cwr.ad);
      a(0.3F, cwr.ae);
      a(0.3F, cwr.af);
      a(0.3F, cwr.wl);
      a(0.3F, cwr.sU);
      a(0.3F, cwr.cU);
      a(0.3F, cwr.dT);
      a(0.3F, cwr.sW);
      a(0.3F, cwr.sV);
      a(0.3F, cwr.cZ);
      a(0.3F, cwr.xv);
      a(0.3F, cwr.xw);
      a(0.3F, cwr.qa);
      a(0.3F, cwr.dV);
      a(0.3F, cwr.dX);
      a(0.3F, cwr.dY);
      a(0.3F, cwr.dU);
      a(0.3F, cwr.ec);
      a(0.3F, cwr.ea);
      a(0.3F, cwr.bN);
      a(0.3F, cwr.wi);
      a(0.3F, cwr.wj);
      a(0.5F, cwr.ru);
      a(0.5F, cwr.iy);
      a(0.5F, cwr.cK);
      a(0.5F, cwr.fk);
      a(0.5F, cwr.dS);
      a(0.5F, cwr.gk);
      a(0.5F, cwr.dP);
      a(0.5F, cwr.dQ);
      a(0.5F, cwr.dR);
      a(0.5F, cwr.sT);
      a(0.5F, cwr.gl);
      a(0.65F, cwr.da);
      a(0.65F, cwr.gx);
      a(0.65F, cwr.fz);
      a(0.65F, cwr.fA);
      a(0.65F, cwr.gj);
      a(0.65F, cwr.oZ);
      a(0.65F, cwr.wk);
      a(0.65F, cwr.ve);
      a(0.65F, cwr.se);
      a(0.65F, cwr.vf);
      a(0.65F, cwr.qb);
      a(0.65F, cwr.dJ);
      a(0.65F, cwr.dK);
      a(0.65F, cwr.gf);
      a(0.65F, cwr.dL);
      a(0.65F, cwr.dM);
      a(0.65F, cwr.tg);
      a(0.65F, cwr.dN);
      a(0.65F, cwr.dO);
      a(0.65F, cwr.xz);
      a(0.65F, cwr.dr);
      a(0.65F, cwr.du);
      a(0.65F, cwr.dv);
      a(0.65F, cwr.dw);
      a(0.65F, cwr.dx);
      a(0.65F, cwr.dy);
      a(0.65F, cwr.dz);
      a(0.65F, cwr.dA);
      a(0.65F, cwr.dB);
      a(0.65F, cwr.dC);
      a(0.65F, cwr.dD);
      a(0.65F, cwr.dE);
      a(0.65F, cwr.dF);
      a(0.65F, cwr.ds);
      a(0.65F, cwr.dt);
      a(0.65F, cwr.cV);
      a(0.65F, cwr.iu);
      a(0.65F, cwr.iv);
      a(0.65F, cwr.iw);
      a(0.65F, cwr.ix);
      a(0.65F, cwr.iz);
      a(0.65F, cwr.dI);
      a(0.65F, cwr.cW);
      a(0.65F, cwr.dW);
      a(0.65F, cwr.dZ);
      a(0.65F, cwr.eb);
      a(0.85F, cwr.ia);
      a(0.85F, cwr.gd);
      a(0.85F, cwr.ge);
      a(0.85F, cwr.ju);
      a(0.85F, cwr.jv);
      a(0.85F, cwr.cX);
      a(0.85F, cwr.qc);
      a(0.85F, cwr.vg);
      a(0.85F, cwr.sP);
      a(0.85F, cwr.dG);
      a(0.85F, cwr.dH);
      a(1.0F, cwr.sy);
      a(1.0F, cwr.vs);
   }

   private static void a(float $$0, dgf $$1) {
      f.put($$1.j(), $$0);
   }

   public dkv(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   public static void a(dgg $$0, ji $$1, boolean $$2) {
      dwv $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? avz.fw : avz.fv, awa.e, 1.0F, 1.0F, false);
      double $$4 = $$3.f($$0, $$1).b(jn.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      azg $$7 = $$0.H_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            lt.Q,
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
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2) {
      return h;
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return i[0];
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.h())) {
         if ($$7 < 7 && !$$2.C) {
            dwv $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(awj.c.b($$0.h()));
            $$0.a(1, $$4);
         }

         return bsi.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bsi.a;
      } else {
         return bsi.e;
      }
   }

   public static dwv a(buj $$0, dwv $$1, arc $$2, cwn $$3, ji $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.h())) {
         dwv $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dwv a(buj $$0, dwv $$1, dgg $$2, ji $$3) {
      if (!$$2.C) {
         fay $$4 = fay.a($$3, 0.5, 1.01, 0.5).a($$2.A, 0.7F);
         cla $$5 = new cla($$2, $$4.a(), $$4.b(), $$4.c(), new cwn(cwr.sv));
         $$5.s();
         $$2.b($$5);
      }

      dwv $$6 = a($$0, $$1, (dgh)$$2, $$3);
      $$2.a(null, $$3, avz.fu, awa.e, 1.0F, 1.0F);
      return $$6;
   }

   static dwv a(@Nullable buj $$0, dwv $$1, dgh $$2, ji $$3) {
      dwv $$4 = $$1.b(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(ebr.c, $$3, ebr.a.a($$0, $$4));
      return $$4;
   }

   static dwv a(@Nullable buj $$0, dwv $$1, dgh $$2, ji $$3, cwn $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.h());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.H_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dwv $$8 = $$1.b(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(ebr.c, $$3, ebr.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, avz.fx, awa.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Override
   public bss a(dwv $$0, dgh $$1, ji $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dkv.c($$0, $$1, $$2, new cwn(cwr.sv));
      } else {
         return (bss)($$3 < 7 ? new dkv.b($$0, $$1, $$2) : new dkv.a());
      }
   }

   static class a extends bsp implements bss {
      public a() {
         super(0);
      }

      @Override
      public int[] a(jn $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cwn $$1, @Nullable jn $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cwn $$1, jn $$2) {
         return false;
      }
   }

   static class b extends bsp implements bss {
      private final dwv b;
      private final dgh c;
      private final ji d;
      private boolean e;

      public b(dwv $$0, dgh $$1, ji $$2) {
         super(1);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int an_() {
         return 1;
      }

      @Override
      public int[] a(jn $$0) {
         return $$0 == jn.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cwn $$1, @Nullable jn $$2) {
         return !this.e && $$2 == jn.b && dkv.f.containsKey($$1.h());
      }

      @Override
      public boolean b(int $$0, cwn $$1, jn $$2) {
         return false;
      }

      @Override
      public void e() {
         cwn $$0 = this.a(0);
         if (!$$0.f()) {
            this.e = true;
            dwv $$1 = dkv.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bsp implements bss {
      private final dwv b;
      private final dgh c;
      private final ji d;
      private boolean e;

      public c(dwv $$0, dgh $$1, ji $$2, cwn $$3) {
         super($$3);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int an_() {
         return 1;
      }

      @Override
      public int[] a(jn $$0) {
         return $$0 == jn.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cwn $$1, @Nullable jn $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cwn $$1, jn $$2) {
         return !this.e && $$2 == jn.a && $$1.a(cwr.sv);
      }

      @Override
      public void e() {
         dkv.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
