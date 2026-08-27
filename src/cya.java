import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class cya extends cwp implements bkm {
   public static final MapCodec<cya> a = b(cya::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dkg e = djw.aL;
   public static final Object2FloatMap<ctn> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final eml h = emi.b();
   private static final eml[] i = ac.a(new eml[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = emi.a(h, cwp.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), elw.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<cya> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cna.cw);
      a(0.3F, cna.ct);
      a(0.3F, cna.cu);
      a(0.3F, cna.cz);
      a(0.3F, cna.cx);
      a(0.3F, cna.cy);
      a(0.3F, cna.cv);
      a(0.3F, cna.cB);
      a(0.3F, cna.cA);
      a(0.3F, cna.W);
      a(0.3F, cna.X);
      a(0.3F, cna.Y);
      a(0.3F, cna.Z);
      a(0.3F, cna.aa);
      a(0.3F, cna.ab);
      a(0.3F, cna.ac);
      a(0.3F, cna.ad);
      a(0.3F, cna.ve);
      a(0.3F, cna.rU);
      a(0.3F, cna.cM);
      a(0.3F, cna.dJ);
      a(0.3F, cna.rW);
      a(0.3F, cna.rV);
      a(0.3F, cna.cR);
      a(0.3F, cna.wi);
      a(0.3F, cna.wj);
      a(0.3F, cna.ps);
      a(0.3F, cna.dK);
      a(0.3F, cna.dL);
      a(0.3F, cna.dP);
      a(0.3F, cna.dN);
      a(0.3F, cna.bJ);
      a(0.3F, cna.vb);
      a(0.3F, cna.vc);
      a(0.5F, cna.qK);
      a(0.5F, cna.ia);
      a(0.5F, cna.cC);
      a(0.5F, cna.eV);
      a(0.5F, cna.dI);
      a(0.5F, cna.fU);
      a(0.5F, cna.dF);
      a(0.5F, cna.dG);
      a(0.5F, cna.dH);
      a(0.5F, cna.rT);
      a(0.5F, cna.fV);
      a(0.65F, cna.cS);
      a(0.65F, cna.ga);
      a(0.65F, cna.fj);
      a(0.65F, cna.fk);
      a(0.65F, cna.fT);
      a(0.65F, cna.oq);
      a(0.65F, cna.vd);
      a(0.65F, cna.tY);
      a(0.65F, cna.re);
      a(0.65F, cna.tZ);
      a(0.65F, cna.pt);
      a(0.65F, cna.dz);
      a(0.65F, cna.dA);
      a(0.65F, cna.fP);
      a(0.65F, cna.dB);
      a(0.65F, cna.dC);
      a(0.65F, cna.sg);
      a(0.65F, cna.dD);
      a(0.65F, cna.dE);
      a(0.65F, cna.wm);
      a(0.65F, cna.dj);
      a(0.65F, cna.dk);
      a(0.65F, cna.dl);
      a(0.65F, cna.dm);
      a(0.65F, cna.dn);
      a(0.65F, cna.do);
      a(0.65F, cna.dp);
      a(0.65F, cna.dq);
      a(0.65F, cna.dr);
      a(0.65F, cna.ds);
      a(0.65F, cna.dt);
      a(0.65F, cna.du);
      a(0.65F, cna.dv);
      a(0.65F, cna.cN);
      a(0.65F, cna.hW);
      a(0.65F, cna.hX);
      a(0.65F, cna.hY);
      a(0.65F, cna.hZ);
      a(0.65F, cna.ib);
      a(0.65F, cna.dy);
      a(0.65F, cna.cO);
      a(0.65F, cna.dM);
      a(0.65F, cna.dO);
      a(0.85F, cna.hC);
      a(0.85F, cna.fN);
      a(0.85F, cna.fO);
      a(0.85F, cna.iW);
      a(0.85F, cna.iX);
      a(0.85F, cna.cP);
      a(0.85F, cna.pu);
      a(0.85F, cna.ua);
      a(0.85F, cna.rP);
      a(0.85F, cna.dw);
      a(0.85F, cna.dx);
      a(1.0F, cna.ry);
      a(1.0F, cna.um);
   }

   private static void a(float $$0, ctn $$1) {
      f.put($$1.k(), $$0);
   }

   public cya(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(cto $$0, hx $$1, boolean $$2) {
      djg $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? arr.eR : arr.eQ, ars.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ic.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      auu $$7 = $$0.F_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            jx.N,
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
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return i[$$0.c(e)];
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2) {
      return h;
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      return i[0];
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      int $$6 = $$0.c(e);
      cmx $$7 = $$3.b($$4);
      if ($$6 < 8 && f.containsKey($$7.d())) {
         if ($$6 < 7 && !$$1.B) {
            djg $$8 = a($$3, $$0, $$1, $$2, $$7);
            $$1.c(1500, $$2, $$0 != $$8 ? 1 : 0);
            $$3.b(asb.c.b($$7.d()));
            if (!$$3.fT().d) {
               $$7.h(1);
            }
         }

         return bka.a($$1.B);
      } else if ($$6 == 8) {
         a($$3, $$0, $$1, $$2);
         return bka.a($$1.B);
      } else {
         return bka.d;
      }
   }

   public static djg a(blu $$0, djg $$1, and $$2, cmx $$3, hx $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.d())) {
         djg $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static djg a(blu $$0, djg $$1, cto $$2, hx $$3) {
      if (!$$2.B) {
         els $$4 = els.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cbt $$5 = new cbt($$2, $$4.a(), $$4.b(), $$4.c(), new cmx(cna.rv));
         $$5.u();
         $$2.b($$5);
      }

      djg $$6 = a($$0, $$1, (ctp)$$2, $$3);
      $$2.a(null, $$3, arr.eP, ars.e, 1.0F, 1.0F);
      return $$6;
   }

   static djg a(@Nullable blu $$0, djg $$1, ctp $$2, hx $$3) {
      djg $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dnq.c, $$3, dnq.a.a($$0, $$4));
      return $$4;
   }

   static djg a(@Nullable blu $$0, djg $$1, ctp $$2, hx $$3, cmx $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.F_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         djg $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dnq.c, $$3, dnq.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, arr.eS, ars.e, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   @Override
   public bkl a(djg $$0, ctp $$1, hx $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new cya.c($$0, $$1, $$2, new cmx(cna.rv));
      } else {
         return (bkl)($$3 < 7 ? new cya.b($$0, $$1, $$2) : new cya.a());
      }
   }

   static class a extends bki implements bkl {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ic $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cmx $$1, @Nullable ic $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cmx $$1, ic $$2) {
         return false;
      }
   }

   static class b extends bki implements bkl {
      private final djg c;
      private final ctp d;
      private final hx e;
      private boolean f;

      public b(djg $$0, ctp $$1, hx $$2) {
         super(1);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public int[] a(ic $$0) {
         return $$0 == ic.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cmx $$1, @Nullable ic $$2) {
         return !this.f && $$2 == ic.b && cya.f.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, cmx $$1, ic $$2) {
         return false;
      }

      @Override
      public void e() {
         cmx $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            djg $$1 = cya.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bki implements bkl {
      private final djg c;
      private final ctp d;
      private final hx e;
      private boolean f;

      public c(djg $$0, ctp $$1, hx $$2, cmx $$3) {
         super($$3);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public int[] a(ic $$0) {
         return $$0 == ic.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cmx $$1, @Nullable ic $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cmx $$1, ic $$2) {
         return !this.f && $$2 == ic.a && $$1.a(cna.rv);
      }

      @Override
      public void e() {
         cya.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
