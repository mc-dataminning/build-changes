import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class djp extends die implements bso {
   public static final MapCodec<djp> a = b(djp::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dwj e = dvz.aL;
   public static final Object2FloatMap<dfa> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final fah h = fae.b();
   private static final fah[] i = ae.a(new fah[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = fae.a(h, die.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), ezr.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cwf.cx);
      a(0.3F, cwf.cu);
      a(0.3F, cwf.cv);
      a(0.3F, cwf.cA);
      a(0.3F, cwf.cy);
      a(0.3F, cwf.cz);
      a(0.3F, cwf.cw);
      a(0.3F, cwf.cC);
      a(0.3F, cwf.cB);
      a(0.3F, cwf.W);
      a(0.3F, cwf.X);
      a(0.3F, cwf.Y);
      a(0.3F, cwf.Z);
      a(0.3F, cwf.aa);
      a(0.3F, cwf.ab);
      a(0.3F, cwf.ac);
      a(0.3F, cwf.ad);
      a(0.3F, cwf.vn);
      a(0.3F, cwf.rY);
      a(0.3F, cwf.cN);
      a(0.3F, cwf.dK);
      a(0.3F, cwf.sa);
      a(0.3F, cwf.rZ);
      a(0.3F, cwf.cS);
      a(0.3F, cwf.wx);
      a(0.3F, cwf.wy);
      a(0.3F, cwf.pw);
      a(0.3F, cwf.dL);
      a(0.3F, cwf.dM);
      a(0.3F, cwf.dQ);
      a(0.3F, cwf.dO);
      a(0.3F, cwf.bK);
      a(0.3F, cwf.vk);
      a(0.3F, cwf.vl);
      a(0.5F, cwf.qO);
      a(0.5F, cwf.ib);
      a(0.5F, cwf.cD);
      a(0.5F, cwf.eW);
      a(0.5F, cwf.dJ);
      a(0.5F, cwf.fV);
      a(0.5F, cwf.dG);
      a(0.5F, cwf.dH);
      a(0.5F, cwf.dI);
      a(0.5F, cwf.rX);
      a(0.5F, cwf.fW);
      a(0.65F, cwf.cT);
      a(0.65F, cwf.gb);
      a(0.65F, cwf.fk);
      a(0.65F, cwf.fl);
      a(0.65F, cwf.fU);
      a(0.65F, cwf.ov);
      a(0.65F, cwf.vm);
      a(0.65F, cwf.uh);
      a(0.65F, cwf.ri);
      a(0.65F, cwf.ui);
      a(0.65F, cwf.px);
      a(0.65F, cwf.dA);
      a(0.65F, cwf.dB);
      a(0.65F, cwf.fQ);
      a(0.65F, cwf.dC);
      a(0.65F, cwf.dD);
      a(0.65F, cwf.sk);
      a(0.65F, cwf.dE);
      a(0.65F, cwf.dF);
      a(0.65F, cwf.wB);
      a(0.65F, cwf.dk);
      a(0.65F, cwf.dl);
      a(0.65F, cwf.dm);
      a(0.65F, cwf.dn);
      a(0.65F, cwf.do);
      a(0.65F, cwf.dp);
      a(0.65F, cwf.dq);
      a(0.65F, cwf.dr);
      a(0.65F, cwf.ds);
      a(0.65F, cwf.dt);
      a(0.65F, cwf.du);
      a(0.65F, cwf.dv);
      a(0.65F, cwf.dw);
      a(0.65F, cwf.cO);
      a(0.65F, cwf.hX);
      a(0.65F, cwf.hY);
      a(0.65F, cwf.hZ);
      a(0.65F, cwf.ia);
      a(0.65F, cwf.ic);
      a(0.65F, cwf.dz);
      a(0.65F, cwf.cP);
      a(0.65F, cwf.dN);
      a(0.65F, cwf.dP);
      a(0.85F, cwf.hD);
      a(0.85F, cwf.fO);
      a(0.85F, cwf.fP);
      a(0.85F, cwf.iX);
      a(0.85F, cwf.iY);
      a(0.85F, cwf.cQ);
      a(0.85F, cwf.py);
      a(0.85F, cwf.uj);
      a(0.85F, cwf.rT);
      a(0.85F, cwf.dx);
      a(0.85F, cwf.dy);
      a(1.0F, cwf.rC);
      a(1.0F, cwf.uv);
   }

   private static void a(float $$0, dfa $$1) {
      f.put($$1.j(), $$0);
   }

   public djp(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   public static void a(dfb $$0, jh $$1, boolean $$2) {
      dvj $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? awl.fv : awl.fu, awm.e, 1.0F, 1.0F, false);
      double $$4 = $$3.f($$0, $$1).b(jm.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      azs $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            lr.P,
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
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2) {
      return h;
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return i[0];
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.h())) {
         if ($$7 < 7 && !$$2.C) {
            dvj $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(awv.c.b($$0.h()));
            $$0.a(1, $$4);
         }

         return bsd.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bsd.a;
      } else {
         return bsd.e;
      }
   }

   public static dvj a(bue $$0, dvj $$1, arn $$2, cwb $$3, jh $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.h())) {
         dvj $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dvj a(bue $$0, dvj $$1, dfb $$2, jh $$3) {
      if (!$$2.C) {
         ezn $$4 = ezn.a($$3, 0.5, 1.01, 0.5).a($$2.A, 0.7F);
         ckv $$5 = new ckv($$2, $$4.a(), $$4.b(), $$4.c(), new cwb(cwf.rz));
         $$5.q();
         $$2.b($$5);
      }

      dvj $$6 = a($$0, $$1, (dfc)$$2, $$3);
      $$2.a(null, $$3, awl.ft, awm.e, 1.0F, 1.0F);
      return $$6;
   }

   static dvj a(@Nullable bue $$0, dvj $$1, dfc $$2, jh $$3) {
      dvj $$4 = $$1.b(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(eag.c, $$3, eag.a.a($$0, $$4));
      return $$4;
   }

   static dvj a(@Nullable bue $$0, dvj $$1, dfc $$2, jh $$3, cwb $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.h());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dvj $$8 = $$1.b(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(eag.c, $$3, eag.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, awl.fw, awm.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   @Override
   public bsn a(dvj $$0, dfc $$1, jh $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new djp.c($$0, $$1, $$2, new cwb(cwf.rz));
      } else {
         return (bsn)($$3 < 7 ? new djp.b($$0, $$1, $$2) : new djp.a());
      }
   }

   static class a extends bsk implements bsn {
      public a() {
         super(0);
      }

      @Override
      public int[] a(jm $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cwb $$1, @Nullable jm $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cwb $$1, jm $$2) {
         return false;
      }
   }

   static class b extends bsk implements bsn {
      private final dvj b;
      private final dfc c;
      private final jh d;
      private boolean e;

      public b(dvj $$0, dfc $$1, jh $$2) {
         super(1);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int am_() {
         return 1;
      }

      @Override
      public int[] a(jm $$0) {
         return $$0 == jm.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cwb $$1, @Nullable jm $$2) {
         return !this.e && $$2 == jm.b && djp.f.containsKey($$1.h());
      }

      @Override
      public boolean b(int $$0, cwb $$1, jm $$2) {
         return false;
      }

      @Override
      public void e() {
         cwb $$0 = this.a(0);
         if (!$$0.f()) {
            this.e = true;
            dvj $$1 = djp.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bsk implements bsn {
      private final dvj b;
      private final dfc c;
      private final jh d;
      private boolean e;

      public c(dvj $$0, dfc $$1, jh $$2, cwb $$3) {
         super($$3);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int am_() {
         return 1;
      }

      @Override
      public int[] a(jm $$0) {
         return $$0 == jm.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cwb $$1, @Nullable jm $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cwb $$1, jm $$2) {
         return !this.e && $$2 == jm.a && $$1.a(cwf.rz);
      }

      @Override
      public void e() {
         djp.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
