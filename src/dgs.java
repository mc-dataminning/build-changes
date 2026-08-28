import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dgs extends dfh implements bqt {
   public static final MapCodec<dgs> a = b(dgs::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dtk e = dta.aL;
   public static final Object2FloatMap<dce> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final ewy h = ewv.b();
   private static final ewy[] i = ac.a(new ewy[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ewv.a(h, dfh.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), ewj.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dgs> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cuf.cx);
      a(0.3F, cuf.cu);
      a(0.3F, cuf.cv);
      a(0.3F, cuf.cA);
      a(0.3F, cuf.cy);
      a(0.3F, cuf.cz);
      a(0.3F, cuf.cw);
      a(0.3F, cuf.cC);
      a(0.3F, cuf.cB);
      a(0.3F, cuf.W);
      a(0.3F, cuf.X);
      a(0.3F, cuf.Y);
      a(0.3F, cuf.Z);
      a(0.3F, cuf.aa);
      a(0.3F, cuf.ab);
      a(0.3F, cuf.ac);
      a(0.3F, cuf.ad);
      a(0.3F, cuf.vl);
      a(0.3F, cuf.rX);
      a(0.3F, cuf.cN);
      a(0.3F, cuf.dK);
      a(0.3F, cuf.rZ);
      a(0.3F, cuf.rY);
      a(0.3F, cuf.cS);
      a(0.3F, cuf.wu);
      a(0.3F, cuf.wv);
      a(0.3F, cuf.pv);
      a(0.3F, cuf.dL);
      a(0.3F, cuf.dM);
      a(0.3F, cuf.dQ);
      a(0.3F, cuf.dO);
      a(0.3F, cuf.bK);
      a(0.3F, cuf.vi);
      a(0.3F, cuf.vj);
      a(0.5F, cuf.qN);
      a(0.5F, cuf.ib);
      a(0.5F, cuf.cD);
      a(0.5F, cuf.eW);
      a(0.5F, cuf.dJ);
      a(0.5F, cuf.fV);
      a(0.5F, cuf.dG);
      a(0.5F, cuf.dH);
      a(0.5F, cuf.dI);
      a(0.5F, cuf.rW);
      a(0.5F, cuf.fW);
      a(0.65F, cuf.cT);
      a(0.65F, cuf.gb);
      a(0.65F, cuf.fk);
      a(0.65F, cuf.fl);
      a(0.65F, cuf.fU);
      a(0.65F, cuf.ou);
      a(0.65F, cuf.vk);
      a(0.65F, cuf.uf);
      a(0.65F, cuf.rh);
      a(0.65F, cuf.ug);
      a(0.65F, cuf.pw);
      a(0.65F, cuf.dA);
      a(0.65F, cuf.dB);
      a(0.65F, cuf.fQ);
      a(0.65F, cuf.dC);
      a(0.65F, cuf.dD);
      a(0.65F, cuf.sj);
      a(0.65F, cuf.dE);
      a(0.65F, cuf.dF);
      a(0.65F, cuf.wy);
      a(0.65F, cuf.dk);
      a(0.65F, cuf.dl);
      a(0.65F, cuf.dm);
      a(0.65F, cuf.dn);
      a(0.65F, cuf.do);
      a(0.65F, cuf.dp);
      a(0.65F, cuf.dq);
      a(0.65F, cuf.dr);
      a(0.65F, cuf.ds);
      a(0.65F, cuf.dt);
      a(0.65F, cuf.du);
      a(0.65F, cuf.dv);
      a(0.65F, cuf.dw);
      a(0.65F, cuf.cO);
      a(0.65F, cuf.hX);
      a(0.65F, cuf.hY);
      a(0.65F, cuf.hZ);
      a(0.65F, cuf.ia);
      a(0.65F, cuf.ic);
      a(0.65F, cuf.dz);
      a(0.65F, cuf.cP);
      a(0.65F, cuf.dN);
      a(0.65F, cuf.dP);
      a(0.85F, cuf.hD);
      a(0.85F, cuf.fO);
      a(0.85F, cuf.fP);
      a(0.85F, cuf.iX);
      a(0.85F, cuf.iY);
      a(0.85F, cuf.cQ);
      a(0.85F, cuf.px);
      a(0.85F, cuf.uh);
      a(0.85F, cuf.rS);
      a(0.85F, cuf.dx);
      a(0.85F, cuf.dy);
      a(1.0F, cuf.rB);
      a(1.0F, cuf.ut);
   }

   private static void a(float $$0, dce $$1) {
      f.put($$1.r(), $$0);
   }

   public dgs(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(dcf $$0, ja $$1, boolean $$2) {
      dsk $$3 = $$0.a_($$1);
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
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2) {
      return h;
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return i[0];
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.g())) {
         if ($$7 < 7 && !$$2.B) {
            dsk $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(avr.c.b($$0.g()));
            $$0.a(1, $$4);
         }

         return bqi.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bqg.a($$1.B);
      } else {
         return bqg.e;
      }
   }

   public static dsk a(bsg $$0, dsk $$1, aqm $$2, cuc $$3, ja $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.g())) {
         dsk $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dsk a(bsg $$0, dsk $$1, dcf $$2, ja $$3) {
      if (!$$2.B) {
         ewf $$4 = ewf.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         ciu $$5 = new ciu($$2, $$4.a(), $$4.b(), $$4.c(), new cuc(cuf.ry));
         $$5.v();
         $$2.b($$5);
      }

      dsk $$6 = a($$0, $$1, (dcg)$$2, $$3);
      $$2.a(null, $$3, avh.fs, avi.e, 1.0F, 1.0F);
      return $$6;
   }

   static dsk a(@Nullable bsg $$0, dsk $$1, dcg $$2, ja $$3) {
      dsk $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dxg.c, $$3, dxg.a.a($$0, $$4));
      return $$4;
   }

   static dsk a(@Nullable bsg $$0, dsk $$1, dcg $$2, ja $$3, cuc $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.g());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dsk $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dxg.c, $$3, dxg.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, avh.fv, avi.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   @Override
   public bqs a(dsk $$0, dcg $$1, ja $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dgs.c($$0, $$1, $$2, new cuc(cuf.ry));
      } else {
         return (bqs)($$3 < 7 ? new dgs.b($$0, $$1, $$2) : new dgs.a());
      }
   }

   static class a extends bqp implements bqs {
      public a() {
         super(0);
      }

      @Override
      public int[] a(jf $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cuc $$1, @Nullable jf $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cuc $$1, jf $$2) {
         return false;
      }
   }

   static class b extends bqp implements bqs {
      private final dsk b;
      private final dcg c;
      private final ja d;
      private boolean e;

      public b(dsk $$0, dcg $$1, ja $$2) {
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
      public boolean a(int $$0, cuc $$1, @Nullable jf $$2) {
         return !this.e && $$2 == jf.b && dgs.f.containsKey($$1.g());
      }

      @Override
      public boolean b(int $$0, cuc $$1, jf $$2) {
         return false;
      }

      @Override
      public void e() {
         cuc $$0 = this.a(0);
         if (!$$0.e()) {
            this.e = true;
            dsk $$1 = dgs.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bqp implements bqs {
      private final dsk b;
      private final dcg c;
      private final ja d;
      private boolean e;

      public c(dsk $$0, dcg $$1, ja $$2, cuc $$3) {
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
      public boolean a(int $$0, cuc $$1, @Nullable jf $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cuc $$1, jf $$2) {
         return !this.e && $$2 == jf.a && $$1.a(cuf.ry);
      }

      @Override
      public void e() {
         dgs.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
