import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class cyb extends cwq implements bkn {
   public static final MapCodec<cyb> a = b(cyb::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dkh e = djx.aL;
   public static final Object2FloatMap<cto> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final emm h = emj.b();
   private static final emm[] i = ac.a(new emm[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = emj.a(h, cwq.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), elx.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<cyb> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cnb.cw);
      a(0.3F, cnb.ct);
      a(0.3F, cnb.cu);
      a(0.3F, cnb.cz);
      a(0.3F, cnb.cx);
      a(0.3F, cnb.cy);
      a(0.3F, cnb.cv);
      a(0.3F, cnb.cB);
      a(0.3F, cnb.cA);
      a(0.3F, cnb.W);
      a(0.3F, cnb.X);
      a(0.3F, cnb.Y);
      a(0.3F, cnb.Z);
      a(0.3F, cnb.aa);
      a(0.3F, cnb.ab);
      a(0.3F, cnb.ac);
      a(0.3F, cnb.ad);
      a(0.3F, cnb.ve);
      a(0.3F, cnb.rU);
      a(0.3F, cnb.cM);
      a(0.3F, cnb.dJ);
      a(0.3F, cnb.rW);
      a(0.3F, cnb.rV);
      a(0.3F, cnb.cR);
      a(0.3F, cnb.wi);
      a(0.3F, cnb.wj);
      a(0.3F, cnb.ps);
      a(0.3F, cnb.dK);
      a(0.3F, cnb.dL);
      a(0.3F, cnb.dP);
      a(0.3F, cnb.dN);
      a(0.3F, cnb.bJ);
      a(0.3F, cnb.vb);
      a(0.3F, cnb.vc);
      a(0.5F, cnb.qK);
      a(0.5F, cnb.ia);
      a(0.5F, cnb.cC);
      a(0.5F, cnb.eV);
      a(0.5F, cnb.dI);
      a(0.5F, cnb.fU);
      a(0.5F, cnb.dF);
      a(0.5F, cnb.dG);
      a(0.5F, cnb.dH);
      a(0.5F, cnb.rT);
      a(0.5F, cnb.fV);
      a(0.65F, cnb.cS);
      a(0.65F, cnb.ga);
      a(0.65F, cnb.fj);
      a(0.65F, cnb.fk);
      a(0.65F, cnb.fT);
      a(0.65F, cnb.oq);
      a(0.65F, cnb.vd);
      a(0.65F, cnb.tY);
      a(0.65F, cnb.re);
      a(0.65F, cnb.tZ);
      a(0.65F, cnb.pt);
      a(0.65F, cnb.dz);
      a(0.65F, cnb.dA);
      a(0.65F, cnb.fP);
      a(0.65F, cnb.dB);
      a(0.65F, cnb.dC);
      a(0.65F, cnb.sg);
      a(0.65F, cnb.dD);
      a(0.65F, cnb.dE);
      a(0.65F, cnb.wm);
      a(0.65F, cnb.dj);
      a(0.65F, cnb.dk);
      a(0.65F, cnb.dl);
      a(0.65F, cnb.dm);
      a(0.65F, cnb.dn);
      a(0.65F, cnb.do);
      a(0.65F, cnb.dp);
      a(0.65F, cnb.dq);
      a(0.65F, cnb.dr);
      a(0.65F, cnb.ds);
      a(0.65F, cnb.dt);
      a(0.65F, cnb.du);
      a(0.65F, cnb.dv);
      a(0.65F, cnb.cN);
      a(0.65F, cnb.hW);
      a(0.65F, cnb.hX);
      a(0.65F, cnb.hY);
      a(0.65F, cnb.hZ);
      a(0.65F, cnb.ib);
      a(0.65F, cnb.dy);
      a(0.65F, cnb.cO);
      a(0.65F, cnb.dM);
      a(0.65F, cnb.dO);
      a(0.85F, cnb.hC);
      a(0.85F, cnb.fN);
      a(0.85F, cnb.fO);
      a(0.85F, cnb.iW);
      a(0.85F, cnb.iX);
      a(0.85F, cnb.cP);
      a(0.85F, cnb.pu);
      a(0.85F, cnb.ua);
      a(0.85F, cnb.rP);
      a(0.85F, cnb.dw);
      a(0.85F, cnb.dx);
      a(1.0F, cnb.ry);
      a(1.0F, cnb.um);
   }

   private static void a(float $$0, cto $$1) {
      f.put($$1.k(), $$0);
   }

   public cyb(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(ctp $$0, hx $$1, boolean $$2) {
      djh $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? ars.eR : ars.eQ, art.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ic.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      auv $$7 = $$0.F_();

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
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return i[$$0.c(e)];
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2) {
      return h;
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      return i[0];
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      int $$6 = $$0.c(e);
      cmy $$7 = $$3.b($$4);
      if ($$6 < 8 && f.containsKey($$7.d())) {
         if ($$6 < 7 && !$$1.B) {
            djh $$8 = a($$3, $$0, $$1, $$2, $$7);
            $$1.c(1500, $$2, $$0 != $$8 ? 1 : 0);
            $$3.b(asc.c.b($$7.d()));
            if (!$$3.fT().d) {
               $$7.h(1);
            }
         }

         return bkb.a($$1.B);
      } else if ($$6 == 8) {
         a($$3, $$0, $$1, $$2);
         return bkb.a($$1.B);
      } else {
         return bkb.d;
      }
   }

   public static djh a(blv $$0, djh $$1, and $$2, cmy $$3, hx $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.d())) {
         djh $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static djh a(blv $$0, djh $$1, ctp $$2, hx $$3) {
      if (!$$2.B) {
         elt $$4 = elt.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cbu $$5 = new cbu($$2, $$4.a(), $$4.b(), $$4.c(), new cmy(cnb.rv));
         $$5.u();
         $$2.b($$5);
      }

      djh $$6 = a($$0, $$1, (ctq)$$2, $$3);
      $$2.a(null, $$3, ars.eP, art.e, 1.0F, 1.0F);
      return $$6;
   }

   static djh a(@Nullable blv $$0, djh $$1, ctq $$2, hx $$3) {
      djh $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dnr.c, $$3, dnr.a.a($$0, $$4));
      return $$4;
   }

   static djh a(@Nullable blv $$0, djh $$1, ctq $$2, hx $$3, cmy $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.F_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         djh $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dnr.c, $$3, dnr.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, ars.eS, art.e, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   @Override
   public bkm a(djh $$0, ctq $$1, hx $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new cyb.c($$0, $$1, $$2, new cmy(cnb.rv));
      } else {
         return (bkm)($$3 < 7 ? new cyb.b($$0, $$1, $$2) : new cyb.a());
      }
   }

   static class a extends bkj implements bkm {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ic $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cmy $$1, @Nullable ic $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cmy $$1, ic $$2) {
         return false;
      }
   }

   static class b extends bkj implements bkm {
      private final djh c;
      private final ctq d;
      private final hx e;
      private boolean f;

      public b(djh $$0, ctq $$1, hx $$2) {
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
      public boolean a(int $$0, cmy $$1, @Nullable ic $$2) {
         return !this.f && $$2 == ic.b && cyb.f.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, cmy $$1, ic $$2) {
         return false;
      }

      @Override
      public void e() {
         cmy $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            djh $$1 = cyb.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bkj implements bkm {
      private final djh c;
      private final ctq d;
      private final hx e;
      private boolean f;

      public c(djh $$0, ctq $$1, hx $$2, cmy $$3) {
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
      public boolean a(int $$0, cmy $$1, @Nullable ic $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cmy $$1, ic $$2) {
         return !this.f && $$2 == ic.a && $$1.a(cnb.rv);
      }

      @Override
      public void e() {
         cyb.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
