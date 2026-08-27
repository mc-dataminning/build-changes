import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class cun extends ctc implements bho {
   public static final MapCodec<cun> a = b(cun::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dgd e = dft.aL;
   public static final Object2FloatMap<cqa> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final eia h = ehx.b();
   private static final eia[] i = ac.a(new eia[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ehx.a(h, ctc.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), ehl.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<cun> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cjo.cb);
      a(0.3F, cjo.bY);
      a(0.3F, cjo.bZ);
      a(0.3F, cjo.ce);
      a(0.3F, cjo.cc);
      a(0.3F, cjo.cd);
      a(0.3F, cjo.ca);
      a(0.3F, cjo.cg);
      a(0.3F, cjo.cf);
      a(0.3F, cjo.J);
      a(0.3F, cjo.K);
      a(0.3F, cjo.L);
      a(0.3F, cjo.M);
      a(0.3F, cjo.N);
      a(0.3F, cjo.O);
      a(0.3F, cjo.P);
      a(0.3F, cjo.Q);
      a(0.3F, cjo.ur);
      a(0.3F, cjo.ri);
      a(0.3F, cjo.cr);
      a(0.3F, cjo.do);
      a(0.3F, cjo.rk);
      a(0.3F, cjo.rj);
      a(0.3F, cjo.cw);
      a(0.3F, cjo.vv);
      a(0.3F, cjo.vw);
      a(0.3F, cjo.oH);
      a(0.3F, cjo.dp);
      a(0.3F, cjo.dq);
      a(0.3F, cjo.du);
      a(0.3F, cjo.ds);
      a(0.3F, cjo.bo);
      a(0.3F, cjo.uo);
      a(0.3F, cjo.up);
      a(0.5F, cjo.pZ);
      a(0.5F, cjo.hF);
      a(0.5F, cjo.ch);
      a(0.5F, cjo.eA);
      a(0.5F, cjo.dn);
      a(0.5F, cjo.fz);
      a(0.5F, cjo.dk);
      a(0.5F, cjo.dl);
      a(0.5F, cjo.dm);
      a(0.5F, cjo.rh);
      a(0.5F, cjo.fA);
      a(0.65F, cjo.cx);
      a(0.65F, cjo.fF);
      a(0.65F, cjo.eO);
      a(0.65F, cjo.eP);
      a(0.65F, cjo.fy);
      a(0.65F, cjo.nF);
      a(0.65F, cjo.uq);
      a(0.65F, cjo.tl);
      a(0.65F, cjo.qt);
      a(0.65F, cjo.tm);
      a(0.65F, cjo.oI);
      a(0.65F, cjo.de);
      a(0.65F, cjo.df);
      a(0.65F, cjo.fu);
      a(0.65F, cjo.dg);
      a(0.65F, cjo.dh);
      a(0.65F, cjo.ru);
      a(0.65F, cjo.di);
      a(0.65F, cjo.dj);
      a(0.65F, cjo.vz);
      a(0.65F, cjo.cO);
      a(0.65F, cjo.cP);
      a(0.65F, cjo.cQ);
      a(0.65F, cjo.cR);
      a(0.65F, cjo.cS);
      a(0.65F, cjo.cT);
      a(0.65F, cjo.cU);
      a(0.65F, cjo.cV);
      a(0.65F, cjo.cW);
      a(0.65F, cjo.cX);
      a(0.65F, cjo.cY);
      a(0.65F, cjo.cZ);
      a(0.65F, cjo.da);
      a(0.65F, cjo.cs);
      a(0.65F, cjo.hB);
      a(0.65F, cjo.hC);
      a(0.65F, cjo.hD);
      a(0.65F, cjo.hE);
      a(0.65F, cjo.hG);
      a(0.65F, cjo.dd);
      a(0.65F, cjo.ct);
      a(0.65F, cjo.dr);
      a(0.65F, cjo.dt);
      a(0.85F, cjo.hh);
      a(0.85F, cjo.fs);
      a(0.85F, cjo.ft);
      a(0.85F, cjo.iB);
      a(0.85F, cjo.iC);
      a(0.85F, cjo.cu);
      a(0.85F, cjo.oJ);
      a(0.85F, cjo.tn);
      a(0.85F, cjo.re);
      a(0.85F, cjo.db);
      a(0.85F, cjo.dc);
      a(1.0F, cjo.qN);
      a(1.0F, cjo.tz);
   }

   private static void a(float $$0, cqa $$1) {
      f.put($$1.k(), $$0);
   }

   public cun(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(cqb $$0, gw $$1, boolean $$2) {
      dfd $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? apg.eI : apg.eH, aph.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ha.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      ash $$7 = $$0.D_();

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
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return i[$$0.c(e)];
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2) {
      return h;
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return i[0];
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      int $$6 = $$0.c(e);
      cjl $$7 = $$3.b($$4);
      if ($$6 < 8 && f.containsKey($$7.d())) {
         if ($$6 < 7 && !$$1.B) {
            dfd $$8 = a($$3, $$0, $$1, $$2, $$7);
            $$1.c(1500, $$2, $$0 != $$8 ? 1 : 0);
            $$3.b(apq.c.b($$7.d()));
            if (!$$3.fT().d) {
               $$7.h(1);
            }
         }

         return bhe.a($$1.B);
      } else if ($$6 == 8) {
         a($$3, $$0, $$1, $$2);
         return bhe.a($$1.B);
      } else {
         return bhe.d;
      }
   }

   public static dfd a(biw $$0, dfd $$1, akt $$2, cjl $$3, gw $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.d())) {
         dfd $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dfd a(biw $$0, dfd $$1, cqb $$2, gw $$3) {
      if (!$$2.B) {
         ehh $$4 = ehh.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         byt $$5 = new byt($$2, $$4.a(), $$4.b(), $$4.c(), new cjl(cjo.qK));
         $$5.t();
         $$2.b($$5);
      }

      dfd $$6 = a($$0, $$1, (cqc)$$2, $$3);
      $$2.a(null, $$3, apg.eG, aph.e, 1.0F, 1.0F);
      return $$6;
   }

   static dfd a(@Nullable biw $$0, dfd $$1, cqc $$2, gw $$3) {
      dfd $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(djn.c, $$3, djn.a.a($$0, $$4));
      return $$4;
   }

   static dfd a(@Nullable biw $$0, dfd $$1, cqc $$2, gw $$3, cjl $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.D_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dfd $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(djn.c, $$3, djn.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, apg.eJ, aph.e, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   @Override
   public bhn a(dfd $$0, cqc $$1, gw $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new cun.c($$0, $$1, $$2, new cjl(cjo.qK));
      } else {
         return (bhn)($$3 < 7 ? new cun.b($$0, $$1, $$2) : new cun.a());
      }
   }

   static class a extends bhl implements bhn {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ha $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cjl $$1, @Nullable ha $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cjl $$1, ha $$2) {
         return false;
      }
   }

   static class b extends bhl implements bhn {
      private final dfd c;
      private final cqc d;
      private final gw e;
      private boolean f;

      public b(dfd $$0, cqc $$1, gw $$2) {
         super(1);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int ag_() {
         return 1;
      }

      @Override
      public int[] a(ha $$0) {
         return $$0 == ha.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cjl $$1, @Nullable ha $$2) {
         return !this.f && $$2 == ha.b && cun.f.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, cjl $$1, ha $$2) {
         return false;
      }

      @Override
      public void e() {
         cjl $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            dfd $$1 = cun.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bhl implements bhn {
      private final dfd c;
      private final cqc d;
      private final gw e;
      private boolean f;

      public c(dfd $$0, cqc $$1, gw $$2, cjl $$3) {
         super($$3);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int ag_() {
         return 1;
      }

      @Override
      public int[] a(ha $$0) {
         return $$0 == ha.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cjl $$1, @Nullable ha $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cjl $$1, ha $$2) {
         return !this.f && $$2 == ha.a && $$1.a(cjo.qK);
      }

      @Override
      public void e() {
         cun.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
