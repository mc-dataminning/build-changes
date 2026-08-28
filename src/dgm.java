import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dgm extends dfb implements brj {
   public static final MapCodec<dgm> a = b(dgm::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dte e = dsu.aL;
   public static final Object2FloatMap<dbz> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final ewm h = ewj.b();
   private static final ewm[] i = ac.a(new ewm[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ewj.a(h, dfb.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), evx.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cuu.cx);
      a(0.3F, cuu.cu);
      a(0.3F, cuu.cv);
      a(0.3F, cuu.cA);
      a(0.3F, cuu.cy);
      a(0.3F, cuu.cz);
      a(0.3F, cuu.cw);
      a(0.3F, cuu.cC);
      a(0.3F, cuu.cB);
      a(0.3F, cuu.W);
      a(0.3F, cuu.X);
      a(0.3F, cuu.Y);
      a(0.3F, cuu.Z);
      a(0.3F, cuu.aa);
      a(0.3F, cuu.ab);
      a(0.3F, cuu.ac);
      a(0.3F, cuu.ad);
      a(0.3F, cuu.vl);
      a(0.3F, cuu.rX);
      a(0.3F, cuu.cN);
      a(0.3F, cuu.dK);
      a(0.3F, cuu.rZ);
      a(0.3F, cuu.rY);
      a(0.3F, cuu.cS);
      a(0.3F, cuu.wr);
      a(0.3F, cuu.ws);
      a(0.3F, cuu.pv);
      a(0.3F, cuu.dL);
      a(0.3F, cuu.dM);
      a(0.3F, cuu.dQ);
      a(0.3F, cuu.dO);
      a(0.3F, cuu.bK);
      a(0.3F, cuu.vi);
      a(0.3F, cuu.vj);
      a(0.5F, cuu.qN);
      a(0.5F, cuu.ib);
      a(0.5F, cuu.cD);
      a(0.5F, cuu.eW);
      a(0.5F, cuu.dJ);
      a(0.5F, cuu.fV);
      a(0.5F, cuu.dG);
      a(0.5F, cuu.dH);
      a(0.5F, cuu.dI);
      a(0.5F, cuu.rW);
      a(0.5F, cuu.fW);
      a(0.65F, cuu.cT);
      a(0.65F, cuu.gb);
      a(0.65F, cuu.fk);
      a(0.65F, cuu.fl);
      a(0.65F, cuu.fU);
      a(0.65F, cuu.ot);
      a(0.65F, cuu.vk);
      a(0.65F, cuu.uf);
      a(0.65F, cuu.rh);
      a(0.65F, cuu.ug);
      a(0.65F, cuu.pw);
      a(0.65F, cuu.dA);
      a(0.65F, cuu.dB);
      a(0.65F, cuu.fQ);
      a(0.65F, cuu.dC);
      a(0.65F, cuu.dD);
      a(0.65F, cuu.sj);
      a(0.65F, cuu.dE);
      a(0.65F, cuu.dF);
      a(0.65F, cuu.wv);
      a(0.65F, cuu.dk);
      a(0.65F, cuu.dl);
      a(0.65F, cuu.dm);
      a(0.65F, cuu.dn);
      a(0.65F, cuu.do);
      a(0.65F, cuu.dp);
      a(0.65F, cuu.dq);
      a(0.65F, cuu.dr);
      a(0.65F, cuu.ds);
      a(0.65F, cuu.dt);
      a(0.65F, cuu.du);
      a(0.65F, cuu.dv);
      a(0.65F, cuu.dw);
      a(0.65F, cuu.cO);
      a(0.65F, cuu.hX);
      a(0.65F, cuu.hY);
      a(0.65F, cuu.hZ);
      a(0.65F, cuu.ia);
      a(0.65F, cuu.ic);
      a(0.65F, cuu.dz);
      a(0.65F, cuu.cP);
      a(0.65F, cuu.dN);
      a(0.65F, cuu.dP);
      a(0.85F, cuu.hD);
      a(0.85F, cuu.fO);
      a(0.85F, cuu.fP);
      a(0.85F, cuu.iX);
      a(0.85F, cuu.iY);
      a(0.85F, cuu.cQ);
      a(0.85F, cuu.px);
      a(0.85F, cuu.uh);
      a(0.85F, cuu.rS);
      a(0.85F, cuu.dx);
      a(0.85F, cuu.dy);
      a(1.0F, cuu.rB);
      a(1.0F, cuu.ut);
   }

   private static void a(float $$0, dbz $$1) {
      f.put($$1.r(), $$0);
   }

   public dgm(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(dca $$0, iz $$1, boolean $$2) {
      dse $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? awa.fu : awa.ft, awb.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(je.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      azh $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            li.P,
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
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2) {
      return h;
   }

   @Override
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return i[0];
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.g())) {
         if ($$7 < 7 && !$$2.B) {
            dse $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(awk.c.b($$0.g()));
            $$0.a(1, $$4);
         }

         return bqy.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bqw.a($$1.B);
      } else {
         return bqw.e;
      }
   }

   public static dse a(bsw $$0, dse $$1, arf $$2, cur $$3, iz $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.g())) {
         dse $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dse a(bsw $$0, dse $$1, dca $$2, iz $$3) {
      if (!$$2.B) {
         evt $$4 = evt.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cjj $$5 = new cjj($$2, $$4.a(), $$4.b(), $$4.c(), new cur(cuu.ry));
         $$5.v();
         $$2.b($$5);
      }

      dse $$6 = a($$0, $$1, (dcb)$$2, $$3);
      $$2.a(null, $$3, awa.fs, awb.e, 1.0F, 1.0F);
      return $$6;
   }

   static dse a(@Nullable bsw $$0, dse $$1, dcb $$2, iz $$3) {
      dse $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dwx.c, $$3, dwx.a.a($$0, $$4));
      return $$4;
   }

   static dse a(@Nullable bsw $$0, dse $$1, dcb $$2, iz $$3, cur $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.g());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dse $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dwx.c, $$3, dwx.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, awa.fv, awb.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   @Override
   public bri a(dse $$0, dcb $$1, iz $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dgm.c($$0, $$1, $$2, new cur(cuu.ry));
      } else {
         return (bri)($$3 < 7 ? new dgm.b($$0, $$1, $$2) : new dgm.a());
      }
   }

   static class a extends brf implements bri {
      public a() {
         super(0);
      }

      @Override
      public int[] a(je $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cur $$1, @Nullable je $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cur $$1, je $$2) {
         return false;
      }
   }

   static class b extends brf implements bri {
      private final dse b;
      private final dcb c;
      private final iz d;
      private boolean e;

      public b(dse $$0, dcb $$1, iz $$2) {
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
      public int[] a(je $$0) {
         return $$0 == je.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cur $$1, @Nullable je $$2) {
         return !this.e && $$2 == je.b && dgm.f.containsKey($$1.g());
      }

      @Override
      public boolean b(int $$0, cur $$1, je $$2) {
         return false;
      }

      @Override
      public void e() {
         cur $$0 = this.a(0);
         if (!$$0.e()) {
            this.e = true;
            dse $$1 = dgm.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends brf implements bri {
      private final dse b;
      private final dcb c;
      private final iz d;
      private boolean e;

      public c(dse $$0, dcb $$1, iz $$2, cur $$3) {
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
      public int[] a(je $$0) {
         return $$0 == je.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cur $$1, @Nullable je $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cur $$1, je $$2) {
         return !this.e && $$2 == je.a && $$1.a(cuu.ry);
      }

      @Override
      public void e() {
         dgm.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
