import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class cxu extends cwj implements bkh {
   public static final MapCodec<cxu> a = b(cxu::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dka e = djq.aL;
   public static final Object2FloatMap<cth> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final emf h = emc.b();
   private static final emf[] i = ac.a(new emf[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = emc.a(h, cwj.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), elq.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<cxu> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cmu.cw);
      a(0.3F, cmu.ct);
      a(0.3F, cmu.cu);
      a(0.3F, cmu.cz);
      a(0.3F, cmu.cx);
      a(0.3F, cmu.cy);
      a(0.3F, cmu.cv);
      a(0.3F, cmu.cB);
      a(0.3F, cmu.cA);
      a(0.3F, cmu.W);
      a(0.3F, cmu.X);
      a(0.3F, cmu.Y);
      a(0.3F, cmu.Z);
      a(0.3F, cmu.aa);
      a(0.3F, cmu.ab);
      a(0.3F, cmu.ac);
      a(0.3F, cmu.ad);
      a(0.3F, cmu.ve);
      a(0.3F, cmu.rU);
      a(0.3F, cmu.cM);
      a(0.3F, cmu.dJ);
      a(0.3F, cmu.rW);
      a(0.3F, cmu.rV);
      a(0.3F, cmu.cR);
      a(0.3F, cmu.wi);
      a(0.3F, cmu.wj);
      a(0.3F, cmu.ps);
      a(0.3F, cmu.dK);
      a(0.3F, cmu.dL);
      a(0.3F, cmu.dP);
      a(0.3F, cmu.dN);
      a(0.3F, cmu.bJ);
      a(0.3F, cmu.vb);
      a(0.3F, cmu.vc);
      a(0.5F, cmu.qK);
      a(0.5F, cmu.ia);
      a(0.5F, cmu.cC);
      a(0.5F, cmu.eV);
      a(0.5F, cmu.dI);
      a(0.5F, cmu.fU);
      a(0.5F, cmu.dF);
      a(0.5F, cmu.dG);
      a(0.5F, cmu.dH);
      a(0.5F, cmu.rT);
      a(0.5F, cmu.fV);
      a(0.65F, cmu.cS);
      a(0.65F, cmu.ga);
      a(0.65F, cmu.fj);
      a(0.65F, cmu.fk);
      a(0.65F, cmu.fT);
      a(0.65F, cmu.oq);
      a(0.65F, cmu.vd);
      a(0.65F, cmu.tY);
      a(0.65F, cmu.re);
      a(0.65F, cmu.tZ);
      a(0.65F, cmu.pt);
      a(0.65F, cmu.dz);
      a(0.65F, cmu.dA);
      a(0.65F, cmu.fP);
      a(0.65F, cmu.dB);
      a(0.65F, cmu.dC);
      a(0.65F, cmu.sg);
      a(0.65F, cmu.dD);
      a(0.65F, cmu.dE);
      a(0.65F, cmu.wm);
      a(0.65F, cmu.dj);
      a(0.65F, cmu.dk);
      a(0.65F, cmu.dl);
      a(0.65F, cmu.dm);
      a(0.65F, cmu.dn);
      a(0.65F, cmu.do);
      a(0.65F, cmu.dp);
      a(0.65F, cmu.dq);
      a(0.65F, cmu.dr);
      a(0.65F, cmu.ds);
      a(0.65F, cmu.dt);
      a(0.65F, cmu.du);
      a(0.65F, cmu.dv);
      a(0.65F, cmu.cN);
      a(0.65F, cmu.hW);
      a(0.65F, cmu.hX);
      a(0.65F, cmu.hY);
      a(0.65F, cmu.hZ);
      a(0.65F, cmu.ib);
      a(0.65F, cmu.dy);
      a(0.65F, cmu.cO);
      a(0.65F, cmu.dM);
      a(0.65F, cmu.dO);
      a(0.85F, cmu.hC);
      a(0.85F, cmu.fN);
      a(0.85F, cmu.fO);
      a(0.85F, cmu.iW);
      a(0.85F, cmu.iX);
      a(0.85F, cmu.cP);
      a(0.85F, cmu.pu);
      a(0.85F, cmu.ua);
      a(0.85F, cmu.rP);
      a(0.85F, cmu.dw);
      a(0.85F, cmu.dx);
      a(1.0F, cmu.ry);
      a(1.0F, cmu.um);
   }

   private static void a(float $$0, cth $$1) {
      f.put($$1.k(), $$0);
   }

   public cxu(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(cti $$0, hx $$1, boolean $$2) {
      dja $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? arm.eR : arm.eQ, arn.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ic.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      aup $$7 = $$0.F_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            jx.N,
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
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return i[$$0.c(e)];
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2) {
      return h;
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      return i[0];
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      int $$6 = $$0.c(e);
      cmr $$7 = $$3.b($$4);
      if ($$6 < 8 && f.containsKey($$7.d())) {
         if ($$6 < 7 && !$$1.B) {
            dja $$8 = a($$3, $$0, $$1, $$2, $$7);
            $$1.c(1500, $$2, $$0 != $$8 ? 1 : 0);
            $$3.b(arw.c.b($$7.d()));
            if (!$$3.fT().d) {
               $$7.h(1);
            }
         }

         return bjv.a($$1.B);
      } else if ($$6 == 8) {
         a($$3, $$0, $$1, $$2);
         return bjv.a($$1.B);
      } else {
         return bjv.d;
      }
   }

   public static dja a(blp $$0, dja $$1, amz $$2, cmr $$3, hx $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.d())) {
         dja $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dja a(blp $$0, dja $$1, cti $$2, hx $$3) {
      if (!$$2.B) {
         elm $$4 = elm.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cbo $$5 = new cbo($$2, $$4.a(), $$4.b(), $$4.c(), new cmr(cmu.rv));
         $$5.u();
         $$2.b($$5);
      }

      dja $$6 = a($$0, $$1, (ctj)$$2, $$3);
      $$2.a(null, $$3, arm.eP, arn.e, 1.0F, 1.0F);
      return $$6;
   }

   static dja a(@Nullable blp $$0, dja $$1, ctj $$2, hx $$3) {
      dja $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dnk.c, $$3, dnk.a.a($$0, $$4));
      return $$4;
   }

   static dja a(@Nullable blp $$0, dja $$1, ctj $$2, hx $$3, cmr $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.F_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dja $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dnk.c, $$3, dnk.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, arm.eS, arn.e, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   @Override
   public bkg a(dja $$0, ctj $$1, hx $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new cxu.c($$0, $$1, $$2, new cmr(cmu.rv));
      } else {
         return (bkg)($$3 < 7 ? new cxu.b($$0, $$1, $$2) : new cxu.a());
      }
   }

   static class a extends bkd implements bkg {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ic $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cmr $$1, @Nullable ic $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cmr $$1, ic $$2) {
         return false;
      }
   }

   static class b extends bkd implements bkg {
      private final dja c;
      private final ctj d;
      private final hx e;
      private boolean f;

      public b(dja $$0, ctj $$1, hx $$2) {
         super(1);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public int[] a(ic $$0) {
         return $$0 == ic.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cmr $$1, @Nullable ic $$2) {
         return !this.f && $$2 == ic.b && cxu.f.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, cmr $$1, ic $$2) {
         return false;
      }

      @Override
      public void e() {
         cmr $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            dja $$1 = cxu.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bkd implements bkg {
      private final dja c;
      private final ctj d;
      private final hx e;
      private boolean f;

      public c(dja $$0, ctj $$1, hx $$2, cmr $$3) {
         super($$3);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public int[] a(ic $$0) {
         return $$0 == ic.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cmr $$1, @Nullable ic $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cmr $$1, ic $$2) {
         return !this.f && $$2 == ic.a && $$1.a(cmu.rv);
      }

      @Override
      public void e() {
         cxu.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
