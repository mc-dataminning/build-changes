import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dix extends dhm implements bsd {
   public static final MapCodec<dix> a = b(dix::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dvs e = dvi.aL;
   public static final Object2FloatMap<dei> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final ezq h = ezn.b();
   private static final ezq[] i = ad.a(new ezq[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ezn.a(h, dhm.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), eza.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dix> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cvw.cx);
      a(0.3F, cvw.cu);
      a(0.3F, cvw.cv);
      a(0.3F, cvw.cA);
      a(0.3F, cvw.cy);
      a(0.3F, cvw.cz);
      a(0.3F, cvw.cw);
      a(0.3F, cvw.cC);
      a(0.3F, cvw.cB);
      a(0.3F, cvw.W);
      a(0.3F, cvw.X);
      a(0.3F, cvw.Y);
      a(0.3F, cvw.Z);
      a(0.3F, cvw.aa);
      a(0.3F, cvw.ab);
      a(0.3F, cvw.ac);
      a(0.3F, cvw.ad);
      a(0.3F, cvw.vn);
      a(0.3F, cvw.rY);
      a(0.3F, cvw.cN);
      a(0.3F, cvw.dK);
      a(0.3F, cvw.sa);
      a(0.3F, cvw.rZ);
      a(0.3F, cvw.cS);
      a(0.3F, cvw.wx);
      a(0.3F, cvw.wy);
      a(0.3F, cvw.pw);
      a(0.3F, cvw.dL);
      a(0.3F, cvw.dM);
      a(0.3F, cvw.dQ);
      a(0.3F, cvw.dO);
      a(0.3F, cvw.bK);
      a(0.3F, cvw.vk);
      a(0.3F, cvw.vl);
      a(0.5F, cvw.qO);
      a(0.5F, cvw.ib);
      a(0.5F, cvw.cD);
      a(0.5F, cvw.eW);
      a(0.5F, cvw.dJ);
      a(0.5F, cvw.fV);
      a(0.5F, cvw.dG);
      a(0.5F, cvw.dH);
      a(0.5F, cvw.dI);
      a(0.5F, cvw.rX);
      a(0.5F, cvw.fW);
      a(0.65F, cvw.cT);
      a(0.65F, cvw.gb);
      a(0.65F, cvw.fk);
      a(0.65F, cvw.fl);
      a(0.65F, cvw.fU);
      a(0.65F, cvw.ov);
      a(0.65F, cvw.vm);
      a(0.65F, cvw.uh);
      a(0.65F, cvw.ri);
      a(0.65F, cvw.ui);
      a(0.65F, cvw.px);
      a(0.65F, cvw.dA);
      a(0.65F, cvw.dB);
      a(0.65F, cvw.fQ);
      a(0.65F, cvw.dC);
      a(0.65F, cvw.dD);
      a(0.65F, cvw.sk);
      a(0.65F, cvw.dE);
      a(0.65F, cvw.dF);
      a(0.65F, cvw.wB);
      a(0.65F, cvw.dk);
      a(0.65F, cvw.dl);
      a(0.65F, cvw.dm);
      a(0.65F, cvw.dn);
      a(0.65F, cvw.do);
      a(0.65F, cvw.dp);
      a(0.65F, cvw.dq);
      a(0.65F, cvw.dr);
      a(0.65F, cvw.ds);
      a(0.65F, cvw.dt);
      a(0.65F, cvw.du);
      a(0.65F, cvw.dv);
      a(0.65F, cvw.dw);
      a(0.65F, cvw.cO);
      a(0.65F, cvw.hX);
      a(0.65F, cvw.hY);
      a(0.65F, cvw.hZ);
      a(0.65F, cvw.ia);
      a(0.65F, cvw.ic);
      a(0.65F, cvw.dz);
      a(0.65F, cvw.cP);
      a(0.65F, cvw.dN);
      a(0.65F, cvw.dP);
      a(0.85F, cvw.hD);
      a(0.85F, cvw.fO);
      a(0.85F, cvw.fP);
      a(0.85F, cvw.iX);
      a(0.85F, cvw.iY);
      a(0.85F, cvw.cQ);
      a(0.85F, cvw.py);
      a(0.85F, cvw.uj);
      a(0.85F, cvw.rT);
      a(0.85F, cvw.dx);
      a(0.85F, cvw.dy);
      a(1.0F, cvw.rC);
      a(1.0F, cvw.uv);
   }

   private static void a(float $$0, dei $$1) {
      f.put($$1.q(), $$0);
   }

   public dix(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   public static void a(dej $$0, jf $$1, boolean $$2) {
      dus $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? awg.fv : awg.fu, awh.e, 1.0F, 1.0F, false);
      double $$4 = $$3.f($$0, $$1).b(jk.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      azn $$7 = $$0.D_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            lo.P,
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
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2) {
      return h;
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return i[0];
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.h())) {
         if ($$7 < 7 && !$$2.B) {
            dus $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(awq.c.b($$0.h()));
            $$0.a(1, $$4);
         }

         return brs.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return brs.a;
      } else {
         return brs.e;
      }
   }

   public static dus a(btr $$0, dus $$1, arj $$2, cvs $$3, jf $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.h())) {
         dus $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dus a(btr $$0, dus $$1, dej $$2, jf $$3) {
      if (!$$2.B) {
         eyw $$4 = eyw.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         ckh $$5 = new ckh($$2, $$4.a(), $$4.b(), $$4.c(), new cvs(cvw.rz));
         $$5.q();
         $$2.b($$5);
      }

      dus $$6 = a($$0, $$1, (dek)$$2, $$3);
      $$2.a(null, $$3, awg.ft, awh.e, 1.0F, 1.0F);
      return $$6;
   }

   static dus a(@Nullable btr $$0, dus $$1, dek $$2, jf $$3) {
      dus $$4 = $$1.b(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dzp.c, $$3, dzp.a.a($$0, $$4));
      return $$4;
   }

   static dus a(@Nullable btr $$0, dus $$1, dek $$2, jf $$3, cvs $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.h());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.D_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dus $$8 = $$1.b(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dzp.c, $$3, dzp.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, awg.fw, awh.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   @Override
   public bsc a(dus $$0, dek $$1, jf $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dix.c($$0, $$1, $$2, new cvs(cvw.rz));
      } else {
         return (bsc)($$3 < 7 ? new dix.b($$0, $$1, $$2) : new dix.a());
      }
   }

   static class a extends brz implements bsc {
      public a() {
         super(0);
      }

      @Override
      public int[] a(jk $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cvs $$1, @Nullable jk $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cvs $$1, jk $$2) {
         return false;
      }
   }

   static class b extends brz implements bsc {
      private final dus b;
      private final dek c;
      private final jf d;
      private boolean e;

      public b(dus $$0, dek $$1, jf $$2) {
         super(1);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int al_() {
         return 1;
      }

      @Override
      public int[] a(jk $$0) {
         return $$0 == jk.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cvs $$1, @Nullable jk $$2) {
         return !this.e && $$2 == jk.b && dix.f.containsKey($$1.h());
      }

      @Override
      public boolean b(int $$0, cvs $$1, jk $$2) {
         return false;
      }

      @Override
      public void e() {
         cvs $$0 = this.a(0);
         if (!$$0.f()) {
            this.e = true;
            dus $$1 = dix.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends brz implements bsc {
      private final dus b;
      private final dek c;
      private final jf d;
      private boolean e;

      public c(dus $$0, dek $$1, jf $$2, cvs $$3) {
         super($$3);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int al_() {
         return 1;
      }

      @Override
      public int[] a(jk $$0) {
         return $$0 == jk.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cvs $$1, @Nullable jk $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cvs $$1, jk $$2) {
         return !this.e && $$2 == jk.a && $$1.a(cvw.rz);
      }

      @Override
      public void e() {
         dix.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
