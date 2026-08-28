import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class diu extends dhj implements bsa {
   public static final MapCodec<diu> a = b(diu::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dvo e = dve.aL;
   public static final Object2FloatMap<def> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final ezm h = ezj.b();
   private static final ezm[] i = ad.a(new ezm[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ezj.a(h, dhj.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), eyw.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<diu> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cvt.cx);
      a(0.3F, cvt.cu);
      a(0.3F, cvt.cv);
      a(0.3F, cvt.cA);
      a(0.3F, cvt.cy);
      a(0.3F, cvt.cz);
      a(0.3F, cvt.cw);
      a(0.3F, cvt.cC);
      a(0.3F, cvt.cB);
      a(0.3F, cvt.W);
      a(0.3F, cvt.X);
      a(0.3F, cvt.Y);
      a(0.3F, cvt.Z);
      a(0.3F, cvt.aa);
      a(0.3F, cvt.ab);
      a(0.3F, cvt.ac);
      a(0.3F, cvt.ad);
      a(0.3F, cvt.vn);
      a(0.3F, cvt.rY);
      a(0.3F, cvt.cN);
      a(0.3F, cvt.dK);
      a(0.3F, cvt.sa);
      a(0.3F, cvt.rZ);
      a(0.3F, cvt.cS);
      a(0.3F, cvt.wx);
      a(0.3F, cvt.wy);
      a(0.3F, cvt.pw);
      a(0.3F, cvt.dL);
      a(0.3F, cvt.dM);
      a(0.3F, cvt.dQ);
      a(0.3F, cvt.dO);
      a(0.3F, cvt.bK);
      a(0.3F, cvt.vk);
      a(0.3F, cvt.vl);
      a(0.5F, cvt.qO);
      a(0.5F, cvt.ib);
      a(0.5F, cvt.cD);
      a(0.5F, cvt.eW);
      a(0.5F, cvt.dJ);
      a(0.5F, cvt.fV);
      a(0.5F, cvt.dG);
      a(0.5F, cvt.dH);
      a(0.5F, cvt.dI);
      a(0.5F, cvt.rX);
      a(0.5F, cvt.fW);
      a(0.65F, cvt.cT);
      a(0.65F, cvt.gb);
      a(0.65F, cvt.fk);
      a(0.65F, cvt.fl);
      a(0.65F, cvt.fU);
      a(0.65F, cvt.ov);
      a(0.65F, cvt.vm);
      a(0.65F, cvt.uh);
      a(0.65F, cvt.ri);
      a(0.65F, cvt.ui);
      a(0.65F, cvt.px);
      a(0.65F, cvt.dA);
      a(0.65F, cvt.dB);
      a(0.65F, cvt.fQ);
      a(0.65F, cvt.dC);
      a(0.65F, cvt.dD);
      a(0.65F, cvt.sk);
      a(0.65F, cvt.dE);
      a(0.65F, cvt.dF);
      a(0.65F, cvt.wB);
      a(0.65F, cvt.dk);
      a(0.65F, cvt.dl);
      a(0.65F, cvt.dm);
      a(0.65F, cvt.dn);
      a(0.65F, cvt.do);
      a(0.65F, cvt.dp);
      a(0.65F, cvt.dq);
      a(0.65F, cvt.dr);
      a(0.65F, cvt.ds);
      a(0.65F, cvt.dt);
      a(0.65F, cvt.du);
      a(0.65F, cvt.dv);
      a(0.65F, cvt.dw);
      a(0.65F, cvt.cO);
      a(0.65F, cvt.hX);
      a(0.65F, cvt.hY);
      a(0.65F, cvt.hZ);
      a(0.65F, cvt.ia);
      a(0.65F, cvt.ic);
      a(0.65F, cvt.dz);
      a(0.65F, cvt.cP);
      a(0.65F, cvt.dN);
      a(0.65F, cvt.dP);
      a(0.85F, cvt.hD);
      a(0.85F, cvt.fO);
      a(0.85F, cvt.fP);
      a(0.85F, cvt.iX);
      a(0.85F, cvt.iY);
      a(0.85F, cvt.cQ);
      a(0.85F, cvt.py);
      a(0.85F, cvt.uj);
      a(0.85F, cvt.rT);
      a(0.85F, cvt.dx);
      a(0.85F, cvt.dy);
      a(1.0F, cvt.rC);
      a(1.0F, cvt.uv);
   }

   private static void a(float $$0, def $$1) {
      f.put($$1.q(), $$0);
   }

   public diu(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   public static void a(deg $$0, je $$1, boolean $$2) {
      duo $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? awe.fv : awe.fu, awf.e, 1.0F, 1.0F, false);
      double $$4 = $$3.f($$0, $$1).b(jj.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      azl $$7 = $$0.C_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            ln.P,
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
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2) {
      return h;
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return i[0];
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.h())) {
         if ($$7 < 7 && !$$2.B) {
            duo $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(awo.c.b($$0.h()));
            $$0.a(1, $$4);
         }

         return brp.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return brp.a;
      } else {
         return brp.e;
      }
   }

   public static duo a(bto $$0, duo $$1, arh $$2, cvp $$3, je $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.h())) {
         duo $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static duo a(bto $$0, duo $$1, deg $$2, je $$3) {
      if (!$$2.B) {
         eys $$4 = eys.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cke $$5 = new cke($$2, $$4.a(), $$4.b(), $$4.c(), new cvp(cvt.rz));
         $$5.q();
         $$2.b($$5);
      }

      duo $$6 = a($$0, $$1, (deh)$$2, $$3);
      $$2.a(null, $$3, awe.ft, awf.e, 1.0F, 1.0F);
      return $$6;
   }

   static duo a(@Nullable bto $$0, duo $$1, deh $$2, je $$3) {
      duo $$4 = $$1.b(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dzl.c, $$3, dzl.a.a($$0, $$4));
      return $$4;
   }

   static duo a(@Nullable bto $$0, duo $$1, deh $$2, je $$3, cvp $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.h());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.C_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         duo $$8 = $$1.b(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dzl.c, $$3, dzl.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, awe.fw, awf.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   @Override
   public brz a(duo $$0, deh $$1, je $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new diu.c($$0, $$1, $$2, new cvp(cvt.rz));
      } else {
         return (brz)($$3 < 7 ? new diu.b($$0, $$1, $$2) : new diu.a());
      }
   }

   static class a extends brw implements brz {
      public a() {
         super(0);
      }

      @Override
      public int[] a(jj $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cvp $$1, @Nullable jj $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cvp $$1, jj $$2) {
         return false;
      }
   }

   static class b extends brw implements brz {
      private final duo b;
      private final deh c;
      private final je d;
      private boolean e;

      public b(duo $$0, deh $$1, je $$2) {
         super(1);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public int[] a(jj $$0) {
         return $$0 == jj.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cvp $$1, @Nullable jj $$2) {
         return !this.e && $$2 == jj.b && diu.f.containsKey($$1.h());
      }

      @Override
      public boolean b(int $$0, cvp $$1, jj $$2) {
         return false;
      }

      @Override
      public void e() {
         cvp $$0 = this.a(0);
         if (!$$0.f()) {
            this.e = true;
            duo $$1 = diu.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends brw implements brz {
      private final duo b;
      private final deh c;
      private final je d;
      private boolean e;

      public c(duo $$0, deh $$1, je $$2, cvp $$3) {
         super($$3);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public int[] a(jj $$0) {
         return $$0 == jj.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cvp $$1, @Nullable jj $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cvp $$1, jj $$2) {
         return !this.e && $$2 == jj.a && $$1.a(cvt.rz);
      }

      @Override
      public void e() {
         diu.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
