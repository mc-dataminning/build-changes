import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class cqw extends cpn implements beh {
   public static final int a = 8;
   public static final int b = 0;
   public static final int c = 7;
   public static final ddb d = dcr.aL;
   public static final Object2FloatMap<cml> e = new Object2FloatOpenHashMap();
   private static final int f = 2;
   private static final efb g = eey.b();
   private static final efb[] h = ac.a(new efb[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = eey.a(g, cpn.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), eem.e);
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
      a(0.3F, cgc.cb);
      a(0.3F, cgc.bY);
      a(0.3F, cgc.bZ);
      a(0.3F, cgc.ce);
      a(0.3F, cgc.cc);
      a(0.3F, cgc.cd);
      a(0.3F, cgc.ca);
      a(0.3F, cgc.cg);
      a(0.3F, cgc.cf);
      a(0.3F, cgc.J);
      a(0.3F, cgc.K);
      a(0.3F, cgc.L);
      a(0.3F, cgc.M);
      a(0.3F, cgc.N);
      a(0.3F, cgc.O);
      a(0.3F, cgc.P);
      a(0.3F, cgc.Q);
      a(0.3F, cgc.ur);
      a(0.3F, cgc.ri);
      a(0.3F, cgc.cr);
      a(0.3F, cgc.do);
      a(0.3F, cgc.rk);
      a(0.3F, cgc.rj);
      a(0.3F, cgc.cw);
      a(0.3F, cgc.vv);
      a(0.3F, cgc.vw);
      a(0.3F, cgc.oH);
      a(0.3F, cgc.dp);
      a(0.3F, cgc.dq);
      a(0.3F, cgc.du);
      a(0.3F, cgc.ds);
      a(0.3F, cgc.bo);
      a(0.3F, cgc.uo);
      a(0.3F, cgc.up);
      a(0.5F, cgc.pZ);
      a(0.5F, cgc.hF);
      a(0.5F, cgc.ch);
      a(0.5F, cgc.eA);
      a(0.5F, cgc.dn);
      a(0.5F, cgc.fz);
      a(0.5F, cgc.dk);
      a(0.5F, cgc.dl);
      a(0.5F, cgc.dm);
      a(0.5F, cgc.rh);
      a(0.5F, cgc.fA);
      a(0.65F, cgc.cx);
      a(0.65F, cgc.fF);
      a(0.65F, cgc.eO);
      a(0.65F, cgc.eP);
      a(0.65F, cgc.fy);
      a(0.65F, cgc.nF);
      a(0.65F, cgc.uq);
      a(0.65F, cgc.tl);
      a(0.65F, cgc.qt);
      a(0.65F, cgc.tm);
      a(0.65F, cgc.oI);
      a(0.65F, cgc.de);
      a(0.65F, cgc.df);
      a(0.65F, cgc.fu);
      a(0.65F, cgc.dg);
      a(0.65F, cgc.dh);
      a(0.65F, cgc.ru);
      a(0.65F, cgc.di);
      a(0.65F, cgc.dj);
      a(0.65F, cgc.vz);
      a(0.65F, cgc.cO);
      a(0.65F, cgc.cP);
      a(0.65F, cgc.cQ);
      a(0.65F, cgc.cR);
      a(0.65F, cgc.cS);
      a(0.65F, cgc.cT);
      a(0.65F, cgc.cU);
      a(0.65F, cgc.cV);
      a(0.65F, cgc.cW);
      a(0.65F, cgc.cX);
      a(0.65F, cgc.cY);
      a(0.65F, cgc.cZ);
      a(0.65F, cgc.da);
      a(0.65F, cgc.cs);
      a(0.65F, cgc.hB);
      a(0.65F, cgc.hC);
      a(0.65F, cgc.hD);
      a(0.65F, cgc.hE);
      a(0.65F, cgc.hG);
      a(0.65F, cgc.dd);
      a(0.65F, cgc.ct);
      a(0.65F, cgc.dr);
      a(0.65F, cgc.dt);
      a(0.85F, cgc.hh);
      a(0.85F, cgc.fs);
      a(0.85F, cgc.ft);
      a(0.85F, cgc.iB);
      a(0.85F, cgc.iC);
      a(0.85F, cgc.cu);
      a(0.85F, cgc.oJ);
      a(0.85F, cgc.tn);
      a(0.85F, cgc.re);
      a(0.85F, cgc.db);
      a(0.85F, cgc.dc);
      a(1.0F, cgc.qN);
      a(1.0F, cgc.tz);
   }

   private static void a(float $$0, cml $$1) {
      e.put($$1.k(), $$0);
   }

   public cqw(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   public static void a(cmm $$0, gu $$1, boolean $$2) {
      dcb $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? amh.eI : amh.eH, ami.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ha.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      apf $$7 = $$0.y_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            iv.L,
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
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return h[$$0.c(d)];
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2) {
      return g;
   }

   @Override
   public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
      return h[0];
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if ($$0.c(d) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      int $$6 = $$0.c(d);
      cfz $$7 = $$3.b($$4);
      if ($$6 < 8 && e.containsKey($$7.d())) {
         if ($$6 < 7 && !$$1.B) {
            dcb $$8 = a($$3, $$0, $$1, $$2, $$7);
            $$1.c(1500, $$2, $$0 != $$8 ? 1 : 0);
            $$3.b(amr.c.b($$7.d()));
            if (!$$3.fO().d) {
               $$7.h(1);
            }
         }

         return bdx.a($$1.B);
      } else if ($$6 == 8) {
         a($$3, $$0, $$1, $$2);
         return bdx.a($$1.B);
      } else {
         return bdx.d;
      }
   }

   public static dcb a(bfj $$0, dcb $$1, aif $$2, cfz $$3, gu $$4) {
      int $$5 = $$1.c(d);
      if ($$5 < 7 && e.containsKey($$3.d())) {
         dcb $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dcb a(bfj $$0, dcb $$1, cmm $$2, gu $$3) {
      if (!$$2.B) {
         eei $$4 = eei.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         bvh $$5 = new bvh($$2, $$4.a(), $$4.b(), $$4.c(), new cfz(cgc.qK));
         $$5.o();
         $$2.b($$5);
      }

      dcb $$6 = a($$0, $$1, (cmn)$$2, $$3);
      $$2.a(null, $$3, amh.eG, ami.e, 1.0F, 1.0F);
      return $$6;
   }

   static dcb a(@Nullable bfj $$0, dcb $$1, cmn $$2, gu $$3) {
      dcb $$4 = $$1.a(d, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dgl.c, $$3, dgl.a.a($$0, $$4));
      return $$4;
   }

   static dcb a(@Nullable bfj $$0, dcb $$1, cmn $$2, gu $$3, cfz $$4) {
      int $$5 = $$1.c(d);
      float $$6 = e.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.y_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dcb $$8 = $$1.a(d, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dgl.c, $$3, dgl.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$0.c(d) == 7) {
         $$1.a($$2, $$0.a(d), 3);
         $$1.a(null, $$2, amh.eJ, ami.e, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      return $$0.c(d);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }

   @Override
   public beg a(dcb $$0, cmn $$1, gu $$2) {
      int $$3 = $$0.c(d);
      if ($$3 == 8) {
         return new cqw.c($$0, $$1, $$2, new cfz(cgc.qK));
      } else {
         return (beg)($$3 < 7 ? new cqw.b($$0, $$1, $$2) : new cqw.a());
      }
   }

   static class a extends bee implements beg {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ha $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cfz $$1, @Nullable ha $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cfz $$1, ha $$2) {
         return false;
      }
   }

   static class b extends bee implements beg {
      private final dcb c;
      private final cmn d;
      private final gu e;
      private boolean f;

      public b(dcb $$0, cmn $$1, gu $$2) {
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
      public int[] a(ha $$0) {
         return $$0 == ha.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cfz $$1, @Nullable ha $$2) {
         return !this.f && $$2 == ha.b && cqw.e.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, cfz $$1, ha $$2) {
         return false;
      }

      @Override
      public void e() {
         cfz $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            dcb $$1 = cqw.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bee implements beg {
      private final dcb c;
      private final cmn d;
      private final gu e;
      private boolean f;

      public c(dcb $$0, cmn $$1, gu $$2, cfz $$3) {
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
      public int[] a(ha $$0) {
         return $$0 == ha.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cfz $$1, @Nullable ha $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cfz $$1, ha $$2) {
         return !this.f && $$2 == ha.a && $$1.a(cgc.qK);
      }

      @Override
      public void e() {
         cqw.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
