import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class cwe extends cut implements bja {
   public static final MapCodec<cwe> a = b(cwe::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dhw e = dhm.aL;
   public static final Object2FloatMap<crr> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final ekb h = ejy.b();
   private static final ekb[] i = ac.a(new ekb[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ejy.a(h, cut.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), ejm.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<cwe> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cle.cb);
      a(0.3F, cle.bY);
      a(0.3F, cle.bZ);
      a(0.3F, cle.ce);
      a(0.3F, cle.cc);
      a(0.3F, cle.cd);
      a(0.3F, cle.ca);
      a(0.3F, cle.cg);
      a(0.3F, cle.cf);
      a(0.3F, cle.J);
      a(0.3F, cle.K);
      a(0.3F, cle.L);
      a(0.3F, cle.M);
      a(0.3F, cle.N);
      a(0.3F, cle.O);
      a(0.3F, cle.P);
      a(0.3F, cle.Q);
      a(0.3F, cle.us);
      a(0.3F, cle.rj);
      a(0.3F, cle.cr);
      a(0.3F, cle.do);
      a(0.3F, cle.rl);
      a(0.3F, cle.rk);
      a(0.3F, cle.cw);
      a(0.3F, cle.vw);
      a(0.3F, cle.vx);
      a(0.3F, cle.oH);
      a(0.3F, cle.dp);
      a(0.3F, cle.dq);
      a(0.3F, cle.du);
      a(0.3F, cle.ds);
      a(0.3F, cle.bo);
      a(0.3F, cle.up);
      a(0.3F, cle.uq);
      a(0.5F, cle.pZ);
      a(0.5F, cle.hF);
      a(0.5F, cle.ch);
      a(0.5F, cle.eA);
      a(0.5F, cle.dn);
      a(0.5F, cle.fz);
      a(0.5F, cle.dk);
      a(0.5F, cle.dl);
      a(0.5F, cle.dm);
      a(0.5F, cle.ri);
      a(0.5F, cle.fA);
      a(0.65F, cle.cx);
      a(0.65F, cle.fF);
      a(0.65F, cle.eO);
      a(0.65F, cle.eP);
      a(0.65F, cle.fy);
      a(0.65F, cle.nF);
      a(0.65F, cle.ur);
      a(0.65F, cle.tm);
      a(0.65F, cle.qt);
      a(0.65F, cle.tn);
      a(0.65F, cle.oI);
      a(0.65F, cle.de);
      a(0.65F, cle.df);
      a(0.65F, cle.fu);
      a(0.65F, cle.dg);
      a(0.65F, cle.dh);
      a(0.65F, cle.rv);
      a(0.65F, cle.di);
      a(0.65F, cle.dj);
      a(0.65F, cle.vA);
      a(0.65F, cle.cO);
      a(0.65F, cle.cP);
      a(0.65F, cle.cQ);
      a(0.65F, cle.cR);
      a(0.65F, cle.cS);
      a(0.65F, cle.cT);
      a(0.65F, cle.cU);
      a(0.65F, cle.cV);
      a(0.65F, cle.cW);
      a(0.65F, cle.cX);
      a(0.65F, cle.cY);
      a(0.65F, cle.cZ);
      a(0.65F, cle.da);
      a(0.65F, cle.cs);
      a(0.65F, cle.hB);
      a(0.65F, cle.hC);
      a(0.65F, cle.hD);
      a(0.65F, cle.hE);
      a(0.65F, cle.hG);
      a(0.65F, cle.dd);
      a(0.65F, cle.ct);
      a(0.65F, cle.dr);
      a(0.65F, cle.dt);
      a(0.85F, cle.hh);
      a(0.85F, cle.fs);
      a(0.85F, cle.ft);
      a(0.85F, cle.iB);
      a(0.85F, cle.iC);
      a(0.85F, cle.cu);
      a(0.85F, cle.oJ);
      a(0.85F, cle.to);
      a(0.85F, cle.re);
      a(0.85F, cle.db);
      a(0.85F, cle.dc);
      a(1.0F, cle.qN);
      a(1.0F, cle.tA);
   }

   private static void a(float $$0, crr $$1) {
      f.put($$1.k(), $$0);
   }

   public cwe(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(crs $$0, ht $$1, boolean $$2) {
      dgw $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? aqn.eI : aqn.eH, aqo.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(hx.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      ato $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            js.L,
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
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return i[$$0.c(e)];
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2) {
      return h;
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return i[0];
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      int $$6 = $$0.c(e);
      clb $$7 = $$3.b($$4);
      if ($$6 < 8 && f.containsKey($$7.d())) {
         if ($$6 < 7 && !$$1.B) {
            dgw $$8 = a($$3, $$0, $$1, $$2, $$7);
            $$1.c(1500, $$2, $$0 != $$8 ? 1 : 0);
            $$3.b(aqx.c.b($$7.d()));
            if (!$$3.fT().d) {
               $$7.h(1);
            }
         }

         return biq.a($$1.B);
      } else if ($$6 == 8) {
         a($$3, $$0, $$1, $$2);
         return biq.a($$1.B);
      } else {
         return biq.d;
      }
   }

   public static dgw a(bki $$0, dgw $$1, ama $$2, clb $$3, ht $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.d())) {
         dgw $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dgw a(bki $$0, dgw $$1, crs $$2, ht $$3) {
      if (!$$2.B) {
         eji $$4 = eji.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         caf $$5 = new caf($$2, $$4.a(), $$4.b(), $$4.c(), new clb(cle.qK));
         $$5.t();
         $$2.b($$5);
      }

      dgw $$6 = a($$0, $$1, (crt)$$2, $$3);
      $$2.a(null, $$3, aqn.eG, aqo.e, 1.0F, 1.0F);
      return $$6;
   }

   static dgw a(@Nullable bki $$0, dgw $$1, crt $$2, ht $$3) {
      dgw $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dlg.c, $$3, dlg.a.a($$0, $$4));
      return $$4;
   }

   static dgw a(@Nullable bki $$0, dgw $$1, crt $$2, ht $$3, clb $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dgw $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dlg.c, $$3, dlg.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, aqn.eJ, aqo.e, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   @Override
   public biz a(dgw $$0, crt $$1, ht $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new cwe.c($$0, $$1, $$2, new clb(cle.qK));
      } else {
         return (biz)($$3 < 7 ? new cwe.b($$0, $$1, $$2) : new cwe.a());
      }
   }

   static class a extends bix implements biz {
      public a() {
         super(0);
      }

      @Override
      public int[] a(hx $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, clb $$1, @Nullable hx $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, clb $$1, hx $$2) {
         return false;
      }
   }

   static class b extends bix implements biz {
      private final dgw c;
      private final crt d;
      private final ht e;
      private boolean f;

      public b(dgw $$0, crt $$1, ht $$2) {
         super(1);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int aj_() {
         return 1;
      }

      @Override
      public int[] a(hx $$0) {
         return $$0 == hx.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, clb $$1, @Nullable hx $$2) {
         return !this.f && $$2 == hx.b && cwe.f.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, clb $$1, hx $$2) {
         return false;
      }

      @Override
      public void e() {
         clb $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            dgw $$1 = cwe.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bix implements biz {
      private final dgw c;
      private final crt d;
      private final ht e;
      private boolean f;

      public c(dgw $$0, crt $$1, ht $$2, clb $$3) {
         super($$3);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int aj_() {
         return 1;
      }

      @Override
      public int[] a(hx $$0) {
         return $$0 == hx.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, clb $$1, @Nullable hx $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, clb $$1, hx $$2) {
         return !this.f && $$2 == hx.a && $$1.a(cle.qK);
      }

      @Override
      public void e() {
         cwe.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
