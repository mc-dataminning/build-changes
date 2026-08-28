import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dju extends dij implements bss {
   public static final MapCodec<dju> a = b(dju::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dwn e = dwe.aL;
   public static final Object2FloatMap<dfe> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final fal h = fai.b();
   private static final fal[] i = ae.a(new fal[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = fai.a(h, dij.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), ezv.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cwj.cx);
      a(0.3F, cwj.cu);
      a(0.3F, cwj.cv);
      a(0.3F, cwj.cA);
      a(0.3F, cwj.cy);
      a(0.3F, cwj.cz);
      a(0.3F, cwj.cw);
      a(0.3F, cwj.cC);
      a(0.3F, cwj.cB);
      a(0.3F, cwj.W);
      a(0.3F, cwj.X);
      a(0.3F, cwj.Y);
      a(0.3F, cwj.Z);
      a(0.3F, cwj.aa);
      a(0.3F, cwj.ab);
      a(0.3F, cwj.ac);
      a(0.3F, cwj.ad);
      a(0.3F, cwj.vD);
      a(0.3F, cwj.so);
      a(0.3F, cwj.cN);
      a(0.3F, cwj.dK);
      a(0.3F, cwj.sq);
      a(0.3F, cwj.sp);
      a(0.3F, cwj.cS);
      a(0.3F, cwj.wN);
      a(0.3F, cwj.wO);
      a(0.3F, cwj.pw);
      a(0.3F, cwj.dL);
      a(0.3F, cwj.dM);
      a(0.3F, cwj.dQ);
      a(0.3F, cwj.dO);
      a(0.3F, cwj.bK);
      a(0.3F, cwj.vA);
      a(0.3F, cwj.vB);
      a(0.5F, cwj.qO);
      a(0.5F, cwj.ib);
      a(0.5F, cwj.cD);
      a(0.5F, cwj.eW);
      a(0.5F, cwj.dJ);
      a(0.5F, cwj.fV);
      a(0.5F, cwj.dG);
      a(0.5F, cwj.dH);
      a(0.5F, cwj.dI);
      a(0.5F, cwj.sn);
      a(0.5F, cwj.fW);
      a(0.65F, cwj.cT);
      a(0.65F, cwj.gb);
      a(0.65F, cwj.fk);
      a(0.65F, cwj.fl);
      a(0.65F, cwj.fU);
      a(0.65F, cwj.ov);
      a(0.65F, cwj.vC);
      a(0.65F, cwj.ux);
      a(0.65F, cwj.ry);
      a(0.65F, cwj.uy);
      a(0.65F, cwj.px);
      a(0.65F, cwj.dA);
      a(0.65F, cwj.dB);
      a(0.65F, cwj.fQ);
      a(0.65F, cwj.dC);
      a(0.65F, cwj.dD);
      a(0.65F, cwj.sA);
      a(0.65F, cwj.dE);
      a(0.65F, cwj.dF);
      a(0.65F, cwj.wR);
      a(0.65F, cwj.dk);
      a(0.65F, cwj.dl);
      a(0.65F, cwj.dm);
      a(0.65F, cwj.dn);
      a(0.65F, cwj.do);
      a(0.65F, cwj.dp);
      a(0.65F, cwj.dq);
      a(0.65F, cwj.dr);
      a(0.65F, cwj.ds);
      a(0.65F, cwj.dt);
      a(0.65F, cwj.du);
      a(0.65F, cwj.dv);
      a(0.65F, cwj.dw);
      a(0.65F, cwj.cO);
      a(0.65F, cwj.hX);
      a(0.65F, cwj.hY);
      a(0.65F, cwj.hZ);
      a(0.65F, cwj.ia);
      a(0.65F, cwj.ic);
      a(0.65F, cwj.dz);
      a(0.65F, cwj.cP);
      a(0.65F, cwj.dN);
      a(0.65F, cwj.dP);
      a(0.85F, cwj.hD);
      a(0.85F, cwj.fO);
      a(0.85F, cwj.fP);
      a(0.85F, cwj.iX);
      a(0.85F, cwj.iY);
      a(0.85F, cwj.cQ);
      a(0.85F, cwj.py);
      a(0.85F, cwj.uz);
      a(0.85F, cwj.sj);
      a(0.85F, cwj.dx);
      a(0.85F, cwj.dy);
      a(1.0F, cwj.rS);
      a(1.0F, cwj.uL);
   }

   private static void a(float $$0, dfe $$1) {
      f.put($$1.j(), $$0);
   }

   public dju(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   public static void a(dff $$0, jh $$1, boolean $$2) {
      dvo $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? awo.fv : awo.fu, awp.e, 1.0F, 1.0F, false);
      double $$4 = $$3.f($$0, $$1).b(jm.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      azv $$7 = $$0.E_();

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
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2) {
      return h;
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return i[0];
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.h())) {
         if ($$7 < 7 && !$$2.C) {
            dvo $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(awy.c.b($$0.h()));
            $$0.a(1, $$4);
         }

         return bsh.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bsh.a;
      } else {
         return bsh.e;
      }
   }

   public static dvo a(bui $$0, dvo $$1, arq $$2, cwf $$3, jh $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.h())) {
         dvo $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dvo a(bui $$0, dvo $$1, dff $$2, jh $$3) {
      if (!$$2.C) {
         ezr $$4 = ezr.a($$3, 0.5, 1.01, 0.5).a($$2.A, 0.7F);
         ckz $$5 = new ckz($$2, $$4.a(), $$4.b(), $$4.c(), new cwf(cwj.rP));
         $$5.q();
         $$2.b($$5);
      }

      dvo $$6 = a($$0, $$1, (dfg)$$2, $$3);
      $$2.a(null, $$3, awo.ft, awp.e, 1.0F, 1.0F);
      return $$6;
   }

   static dvo a(@Nullable bui $$0, dvo $$1, dfg $$2, jh $$3) {
      dvo $$4 = $$1.b(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(eak.c, $$3, eak.a.a($$0, $$4));
      return $$4;
   }

   static dvo a(@Nullable bui $$0, dvo $$1, dfg $$2, jh $$3, cwf $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.h());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dvo $$8 = $$1.b(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(eak.c, $$3, eak.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, awo.fw, awp.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   @Override
   public bsr a(dvo $$0, dfg $$1, jh $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dju.c($$0, $$1, $$2, new cwf(cwj.rP));
      } else {
         return (bsr)($$3 < 7 ? new dju.b($$0, $$1, $$2) : new dju.a());
      }
   }

   static class a extends bso implements bsr {
      public a() {
         super(0);
      }

      @Override
      public int[] a(jm $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cwf $$1, @Nullable jm $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cwf $$1, jm $$2) {
         return false;
      }
   }

   static class b extends bso implements bsr {
      private final dvo b;
      private final dfg c;
      private final jh d;
      private boolean e;

      public b(dvo $$0, dfg $$1, jh $$2) {
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
      public boolean a(int $$0, cwf $$1, @Nullable jm $$2) {
         return !this.e && $$2 == jm.b && dju.f.containsKey($$1.h());
      }

      @Override
      public boolean b(int $$0, cwf $$1, jm $$2) {
         return false;
      }

      @Override
      public void e() {
         cwf $$0 = this.a(0);
         if (!$$0.f()) {
            this.e = true;
            dvo $$1 = dju.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bso implements bsr {
      private final dvo b;
      private final dfg c;
      private final jh d;
      private boolean e;

      public c(dvo $$0, dfg $$1, jh $$2, cwf $$3) {
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
      public boolean a(int $$0, cwf $$1, @Nullable jm $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cwf $$1, jm $$2) {
         return !this.e && $$2 == jm.a && $$1.a(cwj.rP);
      }

      @Override
      public void e() {
         dju.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
