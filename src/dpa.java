import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dpa extends dno implements bvn {
   public static final MapCodec<dpa> a = b(dpa::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final ecq e = ecg.aO;
   public static final Object2FloatMap<dki> f = new Object2FloatOpenHashMap();
   private static final int g = 12;
   private static final fgw[] h = ag.a(() -> {
      fgw[] $$0 = dno.a(8, $$0x -> fgt.a(fgt.b(), dno.b(12.0, (double)Math.clamp((long)(1 + $$0x * 2), 2, 16), 16.0), fgg.e));
      $$0[8] = $$0[7];
      return $$0;
   });

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, dao.cD);
      a(0.3F, dao.cA);
      a(0.3F, dao.cB);
      a(0.3F, dao.cG);
      a(0.3F, dao.cH);
      a(0.3F, dao.cE);
      a(0.3F, dao.cF);
      a(0.3F, dao.cC);
      a(0.3F, dao.cJ);
      a(0.3F, dao.cI);
      a(0.3F, dao.X);
      a(0.3F, dao.Y);
      a(0.3F, dao.Z);
      a(0.3F, dao.aa);
      a(0.3F, dao.ab);
      a(0.3F, dao.ac);
      a(0.3F, dao.ad);
      a(0.3F, dao.ae);
      a(0.3F, dao.af);
      a(0.3F, dao.ww);
      a(0.3F, dao.tf);
      a(0.3F, dao.cU);
      a(0.3F, dao.dX);
      a(0.3F, dao.th);
      a(0.3F, dao.tg);
      a(0.3F, dao.dd);
      a(0.3F, dao.xG);
      a(0.3F, dao.xH);
      a(0.3F, dao.qj);
      a(0.3F, dao.eb);
      a(0.3F, dao.ed);
      a(0.3F, dao.ee);
      a(0.3F, dao.dY);
      a(0.3F, dao.dZ);
      a(0.3F, dao.ea);
      a(0.3F, dao.ei);
      a(0.3F, dao.eg);
      a(0.3F, dao.bN);
      a(0.3F, dao.wt);
      a(0.3F, dao.wu);
      a(0.3F, dao.da);
      a(0.3F, dao.cW);
      a(0.3F, dao.fr);
      a(0.3F, dao.db);
      a(0.3F, dao.dc);
      a(0.5F, dao.rD);
      a(0.5F, dao.iF);
      a(0.5F, dao.cK);
      a(0.5F, dao.fq);
      a(0.5F, dao.dW);
      a(0.5F, dao.gr);
      a(0.5F, dao.dT);
      a(0.5F, dao.dU);
      a(0.5F, dao.dV);
      a(0.5F, dao.te);
      a(0.5F, dao.gs);
      a(0.65F, dao.de);
      a(0.65F, dao.gE);
      a(0.65F, dao.fG);
      a(0.65F, dao.fH);
      a(0.65F, dao.gq);
      a(0.65F, dao.pi);
      a(0.65F, dao.wv);
      a(0.65F, dao.vp);
      a(0.65F, dao.sp);
      a(0.65F, dao.vq);
      a(0.65F, dao.qk);
      a(0.65F, dao.dN);
      a(0.65F, dao.dO);
      a(0.65F, dao.gm);
      a(0.65F, dao.dP);
      a(0.65F, dao.dQ);
      a(0.65F, dao.tr);
      a(0.65F, dao.dR);
      a(0.65F, dao.dS);
      a(0.65F, dao.xK);
      a(0.65F, dao.dv);
      a(0.65F, dao.dy);
      a(0.65F, dao.dz);
      a(0.65F, dao.dA);
      a(0.65F, dao.dB);
      a(0.65F, dao.dC);
      a(0.65F, dao.dD);
      a(0.65F, dao.dE);
      a(0.65F, dao.dF);
      a(0.65F, dao.dG);
      a(0.65F, dao.dH);
      a(0.65F, dao.dI);
      a(0.65F, dao.dJ);
      a(0.65F, dao.dw);
      a(0.65F, dao.dx);
      a(0.65F, dao.cV);
      a(0.65F, dao.iB);
      a(0.65F, dao.iC);
      a(0.65F, dao.iD);
      a(0.65F, dao.iE);
      a(0.65F, dao.iG);
      a(0.65F, dao.dM);
      a(0.65F, dao.cX);
      a(0.65F, dao.ec);
      a(0.65F, dao.ef);
      a(0.65F, dao.eh);
      a(0.85F, dao.ih);
      a(0.85F, dao.gk);
      a(0.85F, dao.gl);
      a(0.85F, dao.jB);
      a(0.85F, dao.jC);
      a(0.85F, dao.cY);
      a(0.85F, dao.ql);
      a(0.85F, dao.vr);
      a(0.85F, dao.ta);
      a(0.85F, dao.dK);
      a(0.85F, dao.dL);
      a(1.0F, dao.sJ);
      a(1.0F, dao.vD);
   }

   private static void a(float $$0, dki $$1) {
      f.put($$1.h(), $$0);
   }

   public dpa(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, Integer.valueOf(0)));
   }

   public static void a(dkj $$0, iw $$1, boolean $$2) {
      ebq $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? awy.fy : awy.fx, awz.e, 1.0F, 1.0F, false);
      double $$4 = $$3.f($$0, $$1).b(jc.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 2.0;
      double $$6 = 0.1875;
      double $$7 = 0.625;
      bai $$8 = $$0.G_();

      for (int $$9 = 0; $$9 < 10; $$9++) {
         double $$10 = $$8.k() * 0.02;
         double $$11 = $$8.k() * 0.02;
         double $$12 = $$8.k() * 0.02;
         $$0.a(
            lz.R,
            (double)$$1.u() + 0.1875 + 0.625 * (double)$$8.i(),
            (double)$$1.v() + $$4 + (double)$$8.i() * (1.0 - $$4),
            (double)$$1.w() + 0.1875 + 0.625 * (double)$$8.i(),
            $$10,
            $$11,
            $$12
         );
      }
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return h[$$0.c(e)];
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2) {
      return fgt.b();
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return h[0];
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.h())) {
         if ($$7 < 7 && !$$2.C) {
            ebq $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(axi.c.b($$0.h()));
            $$0.a(1, $$4);
         }

         return bvc.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bvc.a;
      } else {
         return bvc.e;
      }
   }

   public static ebq a(bxe $$0, ebq $$1, asb $$2, dak $$3, iw $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.h())) {
         ebq $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static ebq a(bxe $$0, ebq $$1, dkj $$2, iw $$3) {
      if (!$$2.C) {
         fgc $$4 = fgc.a($$3, 0.5, 1.01, 0.5).a($$2.A, 0.7F);
         coo $$5 = new coo($$2, $$4.a(), $$4.b(), $$4.c(), new dak(dao.sG));
         $$5.j();
         $$2.b($$5);
      }

      ebq $$6 = a($$0, $$1, (dkk)$$2, $$3);
      $$2.a(null, $$3, awy.fw, awz.e, 1.0F, 1.0F);
      return $$6;
   }

   static ebq a(@Nullable bxe $$0, ebq $$1, dkk $$2, iw $$3) {
      ebq $$4 = $$1.b(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(egq.c, $$3, egq.a.a($$0, $$4));
      return $$4;
   }

   static ebq a(@Nullable bxe $$0, ebq $$1, dkk $$2, iw $$3, dak $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.h());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.G_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         ebq $$8 = $$1.b(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(egq.c, $$3, egq.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, awy.fz, awz.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   public bvm a(ebq $$0, dkk $$1, iw $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dpa.c($$0, $$1, $$2, new dak(dao.sG));
      } else {
         return (bvm)($$3 < 7 ? new dpa.b($$0, $$1, $$2) : new dpa.a());
      }
   }

   static class a extends bvj implements bvm {
      public a() {
         super(0);
      }

      @Override
      public int[] a(jc $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, dak $$1, @Nullable jc $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, dak $$1, jc $$2) {
         return false;
      }
   }

   static class b extends bvj implements bvm {
      private final ebq b;
      private final dkk c;
      private final iw d;
      private boolean e;

      public b(ebq $$0, dkk $$1, iw $$2) {
         super(1);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ap_() {
         return 1;
      }

      @Override
      public int[] a(jc $$0) {
         return $$0 == jc.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, dak $$1, @Nullable jc $$2) {
         return !this.e && $$2 == jc.b && dpa.f.containsKey($$1.h());
      }

      @Override
      public boolean b(int $$0, dak $$1, jc $$2) {
         return false;
      }

      @Override
      public void e() {
         dak $$0 = this.a(0);
         if (!$$0.f()) {
            this.e = true;
            ebq $$1 = dpa.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bvj implements bvm {
      private final ebq b;
      private final dkk c;
      private final iw d;
      private boolean e;

      public c(ebq $$0, dkk $$1, iw $$2, dak $$3) {
         super($$3);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ap_() {
         return 1;
      }

      @Override
      public int[] a(jc $$0) {
         return $$0 == jc.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, dak $$1, @Nullable jc $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, dak $$1, jc $$2) {
         return !this.e && $$2 == jc.a && $$1.a(dao.sG);
      }

      @Override
      public void e() {
         dpa.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
