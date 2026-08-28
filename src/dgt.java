import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dgt extends dfi implements bqu {
   public static final MapCodec<dgt> a = b(dgt::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dtl e = dtb.aL;
   public static final Object2FloatMap<dcf> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final exa h = ewx.b();
   private static final exa[] i = ac.a(new exa[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ewx.a(h, dfi.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), ewl.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dgt> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cug.cx);
      a(0.3F, cug.cu);
      a(0.3F, cug.cv);
      a(0.3F, cug.cA);
      a(0.3F, cug.cy);
      a(0.3F, cug.cz);
      a(0.3F, cug.cw);
      a(0.3F, cug.cC);
      a(0.3F, cug.cB);
      a(0.3F, cug.W);
      a(0.3F, cug.X);
      a(0.3F, cug.Y);
      a(0.3F, cug.Z);
      a(0.3F, cug.aa);
      a(0.3F, cug.ab);
      a(0.3F, cug.ac);
      a(0.3F, cug.ad);
      a(0.3F, cug.vl);
      a(0.3F, cug.rX);
      a(0.3F, cug.cN);
      a(0.3F, cug.dK);
      a(0.3F, cug.rZ);
      a(0.3F, cug.rY);
      a(0.3F, cug.cS);
      a(0.3F, cug.wu);
      a(0.3F, cug.wv);
      a(0.3F, cug.pv);
      a(0.3F, cug.dL);
      a(0.3F, cug.dM);
      a(0.3F, cug.dQ);
      a(0.3F, cug.dO);
      a(0.3F, cug.bK);
      a(0.3F, cug.vi);
      a(0.3F, cug.vj);
      a(0.5F, cug.qN);
      a(0.5F, cug.ib);
      a(0.5F, cug.cD);
      a(0.5F, cug.eW);
      a(0.5F, cug.dJ);
      a(0.5F, cug.fV);
      a(0.5F, cug.dG);
      a(0.5F, cug.dH);
      a(0.5F, cug.dI);
      a(0.5F, cug.rW);
      a(0.5F, cug.fW);
      a(0.65F, cug.cT);
      a(0.65F, cug.gb);
      a(0.65F, cug.fk);
      a(0.65F, cug.fl);
      a(0.65F, cug.fU);
      a(0.65F, cug.ou);
      a(0.65F, cug.vk);
      a(0.65F, cug.uf);
      a(0.65F, cug.rh);
      a(0.65F, cug.ug);
      a(0.65F, cug.pw);
      a(0.65F, cug.dA);
      a(0.65F, cug.dB);
      a(0.65F, cug.fQ);
      a(0.65F, cug.dC);
      a(0.65F, cug.dD);
      a(0.65F, cug.sj);
      a(0.65F, cug.dE);
      a(0.65F, cug.dF);
      a(0.65F, cug.wy);
      a(0.65F, cug.dk);
      a(0.65F, cug.dl);
      a(0.65F, cug.dm);
      a(0.65F, cug.dn);
      a(0.65F, cug.do);
      a(0.65F, cug.dp);
      a(0.65F, cug.dq);
      a(0.65F, cug.dr);
      a(0.65F, cug.ds);
      a(0.65F, cug.dt);
      a(0.65F, cug.du);
      a(0.65F, cug.dv);
      a(0.65F, cug.dw);
      a(0.65F, cug.cO);
      a(0.65F, cug.hX);
      a(0.65F, cug.hY);
      a(0.65F, cug.hZ);
      a(0.65F, cug.ia);
      a(0.65F, cug.ic);
      a(0.65F, cug.dz);
      a(0.65F, cug.cP);
      a(0.65F, cug.dN);
      a(0.65F, cug.dP);
      a(0.85F, cug.hD);
      a(0.85F, cug.fO);
      a(0.85F, cug.fP);
      a(0.85F, cug.iX);
      a(0.85F, cug.iY);
      a(0.85F, cug.cQ);
      a(0.85F, cug.px);
      a(0.85F, cug.uh);
      a(0.85F, cug.rS);
      a(0.85F, cug.dx);
      a(0.85F, cug.dy);
      a(1.0F, cug.rB);
      a(1.0F, cug.ut);
   }

   private static void a(float $$0, dcf $$1) {
      f.put($$1.r(), $$0);
   }

   public dgt(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(dcg $$0, ja $$1, boolean $$2) {
      dsl $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? avh.fu : avh.ft, avi.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(jf.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      ayo $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            lj.P,
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
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2) {
      return h;
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return i[0];
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.g())) {
         if ($$7 < 7 && !$$2.B) {
            dsl $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(avr.c.b($$0.g()));
            $$0.a(1, $$4);
         }

         return bqj.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bqh.a($$1.B);
      } else {
         return bqh.e;
      }
   }

   public static dsl a(bsh $$0, dsl $$1, aqm $$2, cud $$3, ja $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.g())) {
         dsl $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dsl a(bsh $$0, dsl $$1, dcg $$2, ja $$3) {
      if (!$$2.B) {
         ewh $$4 = ewh.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         civ $$5 = new civ($$2, $$4.a(), $$4.b(), $$4.c(), new cud(cug.ry));
         $$5.v();
         $$2.b($$5);
      }

      dsl $$6 = a($$0, $$1, (dch)$$2, $$3);
      $$2.a(null, $$3, avh.fs, avi.e, 1.0F, 1.0F);
      return $$6;
   }

   static dsl a(@Nullable bsh $$0, dsl $$1, dch $$2, ja $$3) {
      dsl $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dxh.c, $$3, dxh.a.a($$0, $$4));
      return $$4;
   }

   static dsl a(@Nullable bsh $$0, dsl $$1, dch $$2, ja $$3, cud $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.g());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dsl $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dxh.c, $$3, dxh.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, avh.fv, avi.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   @Override
   public bqt a(dsl $$0, dch $$1, ja $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dgt.c($$0, $$1, $$2, new cud(cug.ry));
      } else {
         return (bqt)($$3 < 7 ? new dgt.b($$0, $$1, $$2) : new dgt.a());
      }
   }

   static class a extends bqq implements bqt {
      public a() {
         super(0);
      }

      @Override
      public int[] a(jf $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cud $$1, @Nullable jf $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cud $$1, jf $$2) {
         return false;
      }
   }

   static class b extends bqq implements bqt {
      private final dsl b;
      private final dch c;
      private final ja d;
      private boolean e;

      public b(dsl $$0, dch $$1, ja $$2) {
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
      public int[] a(jf $$0) {
         return $$0 == jf.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cud $$1, @Nullable jf $$2) {
         return !this.e && $$2 == jf.b && dgt.f.containsKey($$1.g());
      }

      @Override
      public boolean b(int $$0, cud $$1, jf $$2) {
         return false;
      }

      @Override
      public void e() {
         cud $$0 = this.a(0);
         if (!$$0.e()) {
            this.e = true;
            dsl $$1 = dgt.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bqq implements bqt {
      private final dsl b;
      private final dch c;
      private final ja d;
      private boolean e;

      public c(dsl $$0, dch $$1, ja $$2, cud $$3) {
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
      public int[] a(jf $$0) {
         return $$0 == jf.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cud $$1, @Nullable jf $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cud $$1, jf $$2) {
         return !this.e && $$2 == jf.a && $$1.a(cug.ry);
      }

      @Override
      public void e() {
         dgt.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
