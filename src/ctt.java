import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class ctt extends csk implements bgy {
   public static final int a = 8;
   public static final int b = 0;
   public static final int c = 7;
   public static final dfy d = dfo.aL;
   public static final Object2FloatMap<cpj> e = new Object2FloatOpenHashMap();
   private static final int f = 2;
   private static final ehy g = ehv.b();
   private static final ehy[] h = ac.a(new ehy[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ehv.a(g, csk.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), ehj.e);
      }

      $$0[8] = $$0[7];
   });

   public static void a() {
      e.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, ciz.cb);
      a(0.3F, ciz.bY);
      a(0.3F, ciz.bZ);
      a(0.3F, ciz.ce);
      a(0.3F, ciz.cc);
      a(0.3F, ciz.cd);
      a(0.3F, ciz.ca);
      a(0.3F, ciz.cg);
      a(0.3F, ciz.cf);
      a(0.3F, ciz.J);
      a(0.3F, ciz.K);
      a(0.3F, ciz.L);
      a(0.3F, ciz.M);
      a(0.3F, ciz.N);
      a(0.3F, ciz.O);
      a(0.3F, ciz.P);
      a(0.3F, ciz.Q);
      a(0.3F, ciz.ur);
      a(0.3F, ciz.ri);
      a(0.3F, ciz.cr);
      a(0.3F, ciz.do);
      a(0.3F, ciz.rk);
      a(0.3F, ciz.rj);
      a(0.3F, ciz.cw);
      a(0.3F, ciz.vv);
      a(0.3F, ciz.vw);
      a(0.3F, ciz.oH);
      a(0.3F, ciz.dp);
      a(0.3F, ciz.dq);
      a(0.3F, ciz.du);
      a(0.3F, ciz.ds);
      a(0.3F, ciz.bo);
      a(0.3F, ciz.uo);
      a(0.3F, ciz.up);
      a(0.5F, ciz.pZ);
      a(0.5F, ciz.hF);
      a(0.5F, ciz.ch);
      a(0.5F, ciz.eA);
      a(0.5F, ciz.dn);
      a(0.5F, ciz.fz);
      a(0.5F, ciz.dk);
      a(0.5F, ciz.dl);
      a(0.5F, ciz.dm);
      a(0.5F, ciz.rh);
      a(0.5F, ciz.fA);
      a(0.65F, ciz.cx);
      a(0.65F, ciz.fF);
      a(0.65F, ciz.eO);
      a(0.65F, ciz.eP);
      a(0.65F, ciz.fy);
      a(0.65F, ciz.nF);
      a(0.65F, ciz.uq);
      a(0.65F, ciz.tl);
      a(0.65F, ciz.qt);
      a(0.65F, ciz.tm);
      a(0.65F, ciz.oI);
      a(0.65F, ciz.de);
      a(0.65F, ciz.df);
      a(0.65F, ciz.fu);
      a(0.65F, ciz.dg);
      a(0.65F, ciz.dh);
      a(0.65F, ciz.ru);
      a(0.65F, ciz.di);
      a(0.65F, ciz.dj);
      a(0.65F, ciz.vz);
      a(0.65F, ciz.cO);
      a(0.65F, ciz.cP);
      a(0.65F, ciz.cQ);
      a(0.65F, ciz.cR);
      a(0.65F, ciz.cS);
      a(0.65F, ciz.cT);
      a(0.65F, ciz.cU);
      a(0.65F, ciz.cV);
      a(0.65F, ciz.cW);
      a(0.65F, ciz.cX);
      a(0.65F, ciz.cY);
      a(0.65F, ciz.cZ);
      a(0.65F, ciz.da);
      a(0.65F, ciz.cs);
      a(0.65F, ciz.hB);
      a(0.65F, ciz.hC);
      a(0.65F, ciz.hD);
      a(0.65F, ciz.hE);
      a(0.65F, ciz.hG);
      a(0.65F, ciz.dd);
      a(0.65F, ciz.ct);
      a(0.65F, ciz.dr);
      a(0.65F, ciz.dt);
      a(0.85F, ciz.hh);
      a(0.85F, ciz.fs);
      a(0.85F, ciz.ft);
      a(0.85F, ciz.iB);
      a(0.85F, ciz.iC);
      a(0.85F, ciz.cu);
      a(0.85F, ciz.oJ);
      a(0.85F, ciz.tn);
      a(0.85F, ciz.re);
      a(0.85F, ciz.db);
      a(0.85F, ciz.dc);
      a(1.0F, ciz.qN);
      a(1.0F, ciz.tz);
   }

   private static void a(float $$0, cpj $$1) {
      e.put($$1.k(), $$0);
   }

   public ctt(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   public static void a(cpk $$0, gv $$1, boolean $$2) {
      dey $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? aou.eI : aou.eH, aov.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(hb.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      art $$7 = $$0.y_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            iw.L,
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
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return h[$$0.c(d)];
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2) {
      return g;
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return h[0];
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if ($$0.c(d) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      int $$6 = $$0.c(d);
      ciw $$7 = $$3.b($$4);
      if ($$6 < 8 && e.containsKey($$7.d())) {
         if ($$6 < 7 && !$$1.B) {
            dey $$8 = a($$3, $$0, $$1, $$2, $$7);
            $$1.c(1500, $$2, $$0 != $$8 ? 1 : 0);
            $$3.b(ape.c.b($$7.d()));
            if (!$$3.fR().d) {
               $$7.h(1);
            }
         }

         return bgo.a($$1.B);
      } else if ($$6 == 8) {
         a($$3, $$0, $$1, $$2);
         return bgo.a($$1.B);
      } else {
         return bgo.d;
      }
   }

   public static dey a(big $$0, dey $$1, aki $$2, ciw $$3, gv $$4) {
      int $$5 = $$1.c(d);
      if ($$5 < 7 && e.containsKey($$3.d())) {
         dey $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dey a(big $$0, dey $$1, cpk $$2, gv $$3) {
      if (!$$2.B) {
         ehf $$4 = ehf.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         bye $$5 = new bye($$2, $$4.a(), $$4.b(), $$4.c(), new ciw(ciz.qK));
         $$5.o();
         $$2.b($$5);
      }

      dey $$6 = a($$0, $$1, (cpl)$$2, $$3);
      $$2.a(null, $$3, aou.eG, aov.e, 1.0F, 1.0F);
      return $$6;
   }

   static dey a(@Nullable big $$0, dey $$1, cpl $$2, gv $$3) {
      dey $$4 = $$1.a(d, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dji.c, $$3, dji.a.a($$0, $$4));
      return $$4;
   }

   static dey a(@Nullable big $$0, dey $$1, cpl $$2, gv $$3, ciw $$4) {
      int $$5 = $$1.c(d);
      float $$6 = e.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.y_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dey $$8 = $$1.a(d, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dji.c, $$3, dji.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$0.c(d) == 7) {
         $$1.a($$2, $$0.a(d), 3);
         $$1.a(null, $$2, aou.eJ, aov.e, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return $$0.c(d);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   @Override
   public bgx a(dey $$0, cpl $$1, gv $$2) {
      int $$3 = $$0.c(d);
      if ($$3 == 8) {
         return new ctt.c($$0, $$1, $$2, new ciw(ciz.qK));
      } else {
         return (bgx)($$3 < 7 ? new ctt.b($$0, $$1, $$2) : new ctt.a());
      }
   }

   static class a extends bgv implements bgx {
      public a() {
         super(0);
      }

      @Override
      public int[] a(hb $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, ciw $$1, @Nullable hb $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, ciw $$1, hb $$2) {
         return false;
      }
   }

   static class b extends bgv implements bgx {
      private final dey c;
      private final cpl d;
      private final gv e;
      private boolean f;

      public b(dey $$0, cpl $$1, gv $$2) {
         super(1);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int ac_() {
         return 1;
      }

      @Override
      public int[] a(hb $$0) {
         return $$0 == hb.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, ciw $$1, @Nullable hb $$2) {
         return !this.f && $$2 == hb.b && ctt.e.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, ciw $$1, hb $$2) {
         return false;
      }

      @Override
      public void e() {
         ciw $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            dey $$1 = ctt.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bgv implements bgx {
      private final dey c;
      private final cpl d;
      private final gv e;
      private boolean f;

      public c(dey $$0, cpl $$1, gv $$2, ciw $$3) {
         super($$3);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int ac_() {
         return 1;
      }

      @Override
      public int[] a(hb $$0) {
         return $$0 == hb.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, ciw $$1, @Nullable hb $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, ciw $$1, hb $$2) {
         return !this.f && $$2 == hb.a && $$1.a(ciz.qK);
      }

      @Override
      public void e() {
         ctt.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
