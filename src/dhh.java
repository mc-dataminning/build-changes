import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dhh extends dfw implements brd {
   public static final MapCodec<dhh> a = b(dhh::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dua e = dtq.aL;
   public static final Object2FloatMap<dct> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final exp h = exm.b();
   private static final exp[] i = ad.a(new exp[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = exm.a(h, dfw.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), exa.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cur.cx);
      a(0.3F, cur.cu);
      a(0.3F, cur.cv);
      a(0.3F, cur.cA);
      a(0.3F, cur.cy);
      a(0.3F, cur.cz);
      a(0.3F, cur.cw);
      a(0.3F, cur.cC);
      a(0.3F, cur.cB);
      a(0.3F, cur.W);
      a(0.3F, cur.X);
      a(0.3F, cur.Y);
      a(0.3F, cur.Z);
      a(0.3F, cur.aa);
      a(0.3F, cur.ab);
      a(0.3F, cur.ac);
      a(0.3F, cur.ad);
      a(0.3F, cur.vl);
      a(0.3F, cur.rX);
      a(0.3F, cur.cN);
      a(0.3F, cur.dK);
      a(0.3F, cur.rZ);
      a(0.3F, cur.rY);
      a(0.3F, cur.cS);
      a(0.3F, cur.wu);
      a(0.3F, cur.wv);
      a(0.3F, cur.pv);
      a(0.3F, cur.dL);
      a(0.3F, cur.dM);
      a(0.3F, cur.dQ);
      a(0.3F, cur.dO);
      a(0.3F, cur.bK);
      a(0.3F, cur.vi);
      a(0.3F, cur.vj);
      a(0.5F, cur.qN);
      a(0.5F, cur.ib);
      a(0.5F, cur.cD);
      a(0.5F, cur.eW);
      a(0.5F, cur.dJ);
      a(0.5F, cur.fV);
      a(0.5F, cur.dG);
      a(0.5F, cur.dH);
      a(0.5F, cur.dI);
      a(0.5F, cur.rW);
      a(0.5F, cur.fW);
      a(0.65F, cur.cT);
      a(0.65F, cur.gb);
      a(0.65F, cur.fk);
      a(0.65F, cur.fl);
      a(0.65F, cur.fU);
      a(0.65F, cur.ou);
      a(0.65F, cur.vk);
      a(0.65F, cur.uf);
      a(0.65F, cur.rh);
      a(0.65F, cur.ug);
      a(0.65F, cur.pw);
      a(0.65F, cur.dA);
      a(0.65F, cur.dB);
      a(0.65F, cur.fQ);
      a(0.65F, cur.dC);
      a(0.65F, cur.dD);
      a(0.65F, cur.sj);
      a(0.65F, cur.dE);
      a(0.65F, cur.dF);
      a(0.65F, cur.wy);
      a(0.65F, cur.dk);
      a(0.65F, cur.dl);
      a(0.65F, cur.dm);
      a(0.65F, cur.dn);
      a(0.65F, cur.do);
      a(0.65F, cur.dp);
      a(0.65F, cur.dq);
      a(0.65F, cur.dr);
      a(0.65F, cur.ds);
      a(0.65F, cur.dt);
      a(0.65F, cur.du);
      a(0.65F, cur.dv);
      a(0.65F, cur.dw);
      a(0.65F, cur.cO);
      a(0.65F, cur.hX);
      a(0.65F, cur.hY);
      a(0.65F, cur.hZ);
      a(0.65F, cur.ia);
      a(0.65F, cur.ic);
      a(0.65F, cur.dz);
      a(0.65F, cur.cP);
      a(0.65F, cur.dN);
      a(0.65F, cur.dP);
      a(0.85F, cur.hD);
      a(0.85F, cur.fO);
      a(0.85F, cur.fP);
      a(0.85F, cur.iX);
      a(0.85F, cur.iY);
      a(0.85F, cur.cQ);
      a(0.85F, cur.px);
      a(0.85F, cur.uh);
      a(0.85F, cur.rS);
      a(0.85F, cur.dx);
      a(0.85F, cur.dy);
      a(1.0F, cur.rB);
      a(1.0F, cur.ut);
   }

   private static void a(float $$0, dct $$1) {
      f.put($$1.r(), $$0);
   }

   public dhh(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(dcu $$0, jd $$1, boolean $$2) {
      dta $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? avo.fu : avo.ft, avp.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ji.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      ayv $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            lm.P,
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
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2) {
      return h;
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      return i[0];
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.g())) {
         if ($$7 < 7 && !$$2.B) {
            dta $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(avy.c.b($$0.g()));
            $$0.a(1, $$4);
         }

         return bqs.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bqq.a($$1.B);
      } else {
         return bqq.e;
      }
   }

   public static dta a(bsq $$0, dta $$1, aqt $$2, cuo $$3, jd $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.g())) {
         dta $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dta a(bsq $$0, dta $$1, dcu $$2, jd $$3) {
      if (!$$2.B) {
         eww $$4 = eww.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cjf $$5 = new cjf($$2, $$4.a(), $$4.b(), $$4.c(), new cuo(cur.ry));
         $$5.v();
         $$2.b($$5);
      }

      dta $$6 = a($$0, $$1, (dcv)$$2, $$3);
      $$2.a(null, $$3, avo.fs, avp.e, 1.0F, 1.0F);
      return $$6;
   }

   static dta a(@Nullable bsq $$0, dta $$1, dcv $$2, jd $$3) {
      dta $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dxw.c, $$3, dxw.a.a($$0, $$4));
      return $$4;
   }

   static dta a(@Nullable bsq $$0, dta $$1, dcv $$2, jd $$3, cuo $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.g());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dta $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dxw.c, $$3, dxw.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, avo.fv, avp.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   @Override
   public brc a(dta $$0, dcv $$1, jd $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dhh.c($$0, $$1, $$2, new cuo(cur.ry));
      } else {
         return (brc)($$3 < 7 ? new dhh.b($$0, $$1, $$2) : new dhh.a());
      }
   }

   static class a extends bqz implements brc {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ji $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cuo $$1, @Nullable ji $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cuo $$1, ji $$2) {
         return false;
      }
   }

   static class b extends bqz implements brc {
      private final dta b;
      private final dcv c;
      private final jd d;
      private boolean e;

      public b(dta $$0, dcv $$1, jd $$2) {
         super(1);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public int[] a(ji $$0) {
         return $$0 == ji.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cuo $$1, @Nullable ji $$2) {
         return !this.e && $$2 == ji.b && dhh.f.containsKey($$1.g());
      }

      @Override
      public boolean b(int $$0, cuo $$1, ji $$2) {
         return false;
      }

      @Override
      public void e() {
         cuo $$0 = this.a(0);
         if (!$$0.e()) {
            this.e = true;
            dta $$1 = dhh.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bqz implements brc {
      private final dta b;
      private final dcv c;
      private final jd d;
      private boolean e;

      public c(dta $$0, dcv $$1, jd $$2, cuo $$3) {
         super($$3);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public int[] a(ji $$0) {
         return $$0 == ji.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cuo $$1, @Nullable ji $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cuo $$1, ji $$2) {
         return !this.e && $$2 == ji.a && $$1.a(cur.ry);
      }

      @Override
      public void e() {
         dhh.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
