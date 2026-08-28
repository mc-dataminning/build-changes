import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clg extends bwt implements cnb {
   private static final Logger bI = LogUtils.getLogger();
   public static final akg<Integer> a = akk.a(clg.class, aki.b);
   private static final chg bJ = chg.a().a(64.0);
   private static final int bK = 200;
   private static final int bL = 400;
   private static final float bM = 0.25F;
   private static final String bN = "DragonDeathTime";
   private static final String bO = "DragonPhase";
   public final cle b = new cle();
   private final cld[] bP;
   public final cld c;
   private final cld bQ;
   private final cld bR;
   private final cld bS;
   private final cld bT;
   private final cld bU;
   private final cld bV;
   private final cld bW;
   public float d;
   public float bD;
   public boolean bE;
   public int bF;
   public float bG;
   @Nullable
   public clf bH;
   @Nullable
   private ecm bX;
   private jj bY = jj.c;
   private final clx bZ;
   private int ca = 100;
   private float cb;
   private final evf[] cc = new evf[24];
   private final int[] cd = new int[24];
   private final evd ce = new evd();

   public clg(bwb<? extends clg> $$0, dhp $$1) {
      super(bwb.P, $$1);
      this.c = new cld(this, "head", 1.0F, 1.0F);
      this.bQ = new cld(this, "neck", 3.0F, 3.0F);
      this.bR = new cld(this, "body", 5.0F, 3.0F);
      this.bS = new cld(this, "tail", 2.0F, 2.0F);
      this.bT = new cld(this, "tail", 2.0F, 2.0F);
      this.bU = new cld(this, "tail", 2.0F, 2.0F);
      this.bV = new cld(this, "wing", 4.0F, 2.0F);
      this.bW = new cld(this, "wing", 4.0F, 2.0F);
      this.bP = new cld[]{this.c, this.bQ, this.bR, this.bS, this.bT, this.bU, this.bV, this.bW};
      this.d(this.eT());
      this.ad = true;
      this.bZ = new clx(this);
   }

   public void a(ecm $$0) {
      this.bX = $$0;
   }

   @Override
   public void c(jj $$0) {
      this.bY = $$0;
   }

   public jj j() {
      return this.bY;
   }

   public static bxw.a m() {
      return bwt.E().a(bxx.s, 200.0);
   }

   @Override
   public boolean ba() {
      float $$0 = azk.b(this.bD * (float) (Math.PI * 2));
      float $$1 = azk.b(this.d * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aZ() {
      if (this.dV().C && !this.bb()) {
         this.dV().a(this.dA(), this.dC(), this.dG(), awk.iy, this.dm(), 5.0F, 0.8F + this.ae.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(a, clw.k.b());
   }

   @Override
   public void k_() {
      this.aO();
      if (this.dV().C) {
         this.d(this.eF());
         if (!this.bb() && !this.bZ.a().a() && --this.ca < 0) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awk.iz, this.dm(), 2.5F, 0.8F + this.ae.i() * 0.3F, false);
            this.ca = 200 + this.ae.a(200);
         }
      }

      if (this.bX == null && this.dV() instanceof arn $$0) {
         ecm $$1 = $$0.F();
         if ($$1 != null && this.cG().equals($$1.i())) {
            this.bX = $$1;
         }
      }

      this.d = this.bD;
      if (this.eG()) {
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         float $$3 = (this.ae.i() - 0.5F) * 4.0F;
         float $$4 = (this.ae.i() - 0.5F) * 8.0F;
         this.dV().a(lv.w, this.dA() + (double)$$2, this.dC() + 2.0 + (double)$$3, this.dG() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gn();
         fcu $$5 = this.dy();
         float $$6 = 0.2F / ((float)$$5.i() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.e);
         if (this.bZ.a().a()) {
            this.bD += 0.1F;
         } else if (this.bE) {
            this.bD += $$6 * 0.5F;
         } else {
            this.bD += $$6;
         }

         this.w(azk.h(this.dL()));
         if (this.gf()) {
            this.bD = 0.5F;
         } else {
            this.b.a(this.dC(), this.dL());
            if (this.dV() instanceof arn $$7) {
               clq $$9 = this.bZ.a();
               $$9.a($$7);
               if (this.bZ.a() != $$9) {
                  $$9 = this.bZ.a();
                  $$9.a($$7);
               }

               fcu $$10 = $$9.f();
               if ($$10 != null) {
                  double $$11 = $$10.d - this.dA();
                  double $$12 = $$10.e - this.dC();
                  double $$13 = $$10.f - this.dG();
                  double $$14 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
                  float $$15 = $$9.e();
                  double $$16 = Math.sqrt($$11 * $$11 + $$13 * $$13);
                  if ($$16 > 0.0) {
                     $$12 = azk.a($$12 / $$16, (double)(-$$15), (double)$$15);
                  }

                  this.i(this.dy().b(0.0, $$12 * 0.01, 0.0));
                  this.w(azk.h(this.dL()));
                  fcu $$17 = $$10.a(this.dA(), this.dC(), this.dG()).d();
                  fcu $$18 = new fcu((double)azk.a(this.dL() * (float) (Math.PI / 180.0)), this.dy().e, (double)(-azk.b(this.dL() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$19 = Math.max(((float)$$18.b($$17) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$11) > 1.0E-5F || Math.abs($$13) > 1.0E-5F) {
                     float $$20 = azk.a(azk.h(180.0F - (float)azk.d($$11, $$13) * (180.0F / (float)Math.PI) - this.dL()), -50.0F, 50.0F);
                     this.bG *= 0.8F;
                     this.bG = this.bG + $$20 * $$9.g();
                     this.w(this.dL() + this.bG * 0.1F);
                  }

                  float $$21 = (float)(2.0 / ($$14 + 1.0));
                  float $$22 = 0.06F;
                  this.a(0.06F * ($$19 * $$21 + (1.0F - $$21)), new fcu(0.0, 0.0, -1.0));
                  if (this.bE) {
                     this.a(bwv.a, this.dy().c(0.8F));
                  } else {
                     this.a(bwv.a, this.dy());
                  }

                  fcu $$23 = this.dy().d();
                  double $$24 = 0.8 + 0.15 * ($$23.b($$18) + 1.0) / 2.0;
                  this.i(this.dy().d($$24, 0.91F, $$24));
               }
            } else {
               this.bi.e();
               this.bZ.a().b();
            }

            if (!this.dV().w_()) {
               this.aK();
            }

            this.aU = this.dL();
            fcu[] $$25 = new fcu[this.bP.length];

            for (int $$26 = 0; $$26 < this.bP.length; $$26++) {
               $$25[$$26] = new fcu(this.bP[$$26].dA(), this.bP[$$26].dC(), this.bP[$$26].dG());
            }

            float $$27 = (float)(this.b.a(5).a() - this.b.a(10).a()) * 10.0F * (float) (Math.PI / 180.0);
            float $$28 = azk.b($$27);
            float $$29 = azk.a($$27);
            float $$30 = this.dL() * (float) (Math.PI / 180.0);
            float $$31 = azk.a($$30);
            float $$32 = azk.b($$30);
            this.a(this.bR, (double)($$31 * 0.5F), 0.0, (double)(-$$32 * 0.5F));
            this.a(this.bV, (double)($$32 * 4.5F), 2.0, (double)($$31 * 4.5F));
            this.a(this.bW, (double)($$32 * -4.5F), 2.0, (double)($$31 * -4.5F));
            if (this.dV() instanceof arn $$33 && this.aM == 0) {
               this.a($$33, $$33.a(this, this.bV.cR().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bvz.e));
               this.a($$33, $$33.a(this, this.bW.cR().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bvz.e));
               this.b($$33, $$33.a(this, this.c.cR().g(1.0), bvz.e));
               this.b($$33, $$33.a(this, this.bQ.cR().g(1.0), bvz.e));
            }

            float $$34 = azk.a(this.dL() * (float) (Math.PI / 180.0) - this.bG * 0.01F);
            float $$35 = azk.b(this.dL() * (float) (Math.PI / 180.0) - this.bG * 0.01F);
            float $$36 = this.gm();
            this.a(this.c, (double)($$34 * 6.5F * $$28), (double)($$36 + $$29 * 6.5F), (double)(-$$35 * 6.5F * $$28));
            this.a(this.bQ, (double)($$34 * 5.5F * $$28), (double)($$36 + $$29 * 5.5F), (double)(-$$35 * 5.5F * $$28));
            cle.a $$37 = this.b.a(5);

            for (int $$38 = 0; $$38 < 3; $$38++) {
               cld $$39 = null;
               if ($$38 == 0) {
                  $$39 = this.bS;
               }

               if ($$38 == 1) {
                  $$39 = this.bT;
               }

               if ($$38 == 2) {
                  $$39 = this.bU;
               }

               cle.a $$40 = this.b.a(12 + $$38 * 2);
               float $$41 = this.dL() * (float) (Math.PI / 180.0) + this.i((double)($$40.b() - $$37.b())) * (float) (Math.PI / 180.0);
               float $$42 = azk.a($$41);
               float $$43 = azk.b($$41);
               float $$44 = 1.5F;
               float $$45 = (float)($$38 + 1) * 2.0F;
               this.a(
                  $$39,
                  (double)(-($$31 * 1.5F + $$42 * $$45) * $$28),
                  $$40.a() - $$37.a() - (double)(($$45 + 1.5F) * $$29) + 1.5,
                  (double)(($$32 * 1.5F + $$43 * $$45) * $$28)
               );
            }

            if (this.dV() instanceof arn $$46) {
               this.bE = this.a($$46, this.c.cR()) | this.a($$46, this.bQ.cR()) | this.a($$46, this.bR.cR());
               if (this.bX != null) {
                  this.bX.b(this);
               }
            }

            for (int $$47 = 0; $$47 < this.bP.length; $$47++) {
               this.bP[$$47].K = $$25[$$47].d;
               this.bP[$$47].L = $$25[$$47].e;
               this.bP[$$47].M = $$25[$$47].f;
               this.bP[$$47].aa = $$25[$$47].d;
               this.bP[$$47].ab = $$25[$$47].e;
               this.bP[$$47].ac = $$25[$$47].f;
            }
         }
      }
   }

   private void a(cld $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dA() + $$1, this.dC() + $$2, this.dG() + $$3);
   }

   private float gm() {
      if (this.bZ.a().a()) {
         return -1.0F;
      } else {
         cle.a $$0 = this.b.a(5);
         cle.a $$1 = this.b.a(0);
         return (float)($$0.a() - $$1.a());
      }
   }

   private void gn() {
      if (this.bH != null) {
         if (this.bH.dQ()) {
            this.bH = null;
         } else if (this.af % 10 == 0 && this.eF() < this.eT()) {
            this.d(this.eF() + 1.0F);
         }
      }

      if (this.ae.a(10) == 0) {
         List<clf> $$0 = this.dV().a(clf.class, this.cR().g(32.0));
         clf $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (clf $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.bH = $$1;
      }
   }

   private void a(arn $$0, List<bvs> $$1) {
      double $$2 = (this.bR.cR().a + this.bR.cR().d) / 2.0;
      double $$3 = (this.bR.cR().c + this.bR.cR().f) / 2.0;

      for (bvs $$4 : $$1) {
         if ($$4 instanceof bwr) {
            bwr $$5 = (bwr)$$4;
            double $$6 = $$4.dA() - $$2;
            double $$7 = $$4.dG() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.j($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.bZ.a().a() && $$5.es() < $$4.af - 2) {
               buh $$9 = this.dW().b((bwr)this);
               $$4.a($$0, $$9, 5.0F);
               dej.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(arn $$0, List<bvs> $$1) {
      for (bvs $$2 : $$1) {
         if ($$2 instanceof bwr) {
            buh $$3 = this.dW().b((bwr)this);
            $$2.a($$0, $$3, 10.0F);
            dej.a($$0, $$2, $$3);
         }
      }
   }

   private float i(double $$0) {
      return (float)azk.d($$0);
   }

   private boolean a(arn $$0, fcp $$1) {
      int $$2 = azk.a($$1.a);
      int $$3 = azk.a($$1.b);
      int $$4 = azk.a($$1.c);
      int $$5 = azk.a($$1.d);
      int $$6 = azk.a($$1.e);
      int $$7 = azk.a($$1.f);
      boolean $$8 = false;
      boolean $$9 = false;

      for (int $$10 = $$2; $$10 <= $$5; $$10++) {
         for (int $$11 = $$3; $$11 <= $$6; $$11++) {
            for (int $$12 = $$4; $$12 <= $$7; $$12++) {
               jj $$13 = new jj($$10, $$11, $$12);
               dym $$14 = $$0.a_($$13);
               if (!$$14.l() && !$$14.a(awz.aG)) {
                  if ($$0.O().c(dhl.c) && !$$14.a(awz.aF)) {
                     $$9 = $$0.a($$13, false) || $$9;
                  } else {
                     $$8 = true;
                  }
               }
            }
         }
      }

      if ($$9) {
         jj $$15 = new jj($$2 + this.ae.a($$5 - $$2 + 1), $$3 + this.ae.a($$6 - $$3 + 1), $$4 + this.ae.a($$7 - $$4 + 1));
         $$0.c(2008, $$15, 0);
      }

      return $$8;
   }

   public boolean a(arn $$0, cld $$1, buh $$2, float $$3) {
      if (this.bZ.a().h() == clw.j) {
         return false;
      } else {
         $$3 = this.bZ.a().a($$2, $$3);
         if ($$1 != this.c) {
            $$3 = $$3 / 4.0F + Math.min($$3, 1.0F);
         }

         if ($$3 < 0.01F) {
            return false;
         } else {
            if ($$2.d() instanceof cqi || $$2.a(axb.y)) {
               float $$4 = this.eF();
               this.c($$0, $$2, $$3);
               if (this.eG() && !this.bZ.a().a()) {
                  this.d(1.0F);
                  this.bZ.a(clw.j);
               }

               if (this.bZ.a().a()) {
                  this.cb = this.cb + $$4 - this.eF();
                  if (this.cb > 0.25F * this.eT()) {
                     this.cb = 0.0F;
                     this.bZ.a(clw.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      return this.a($$0, this.bR, $$1, $$2);
   }

   protected void c(arn $$0, buh $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }

   @Override
   public void c(arn $$0) {
      this.a(bvs.e.a);
      this.a(edm.p);
      if (this.bX != null) {
         this.bX.b(this);
         this.bX.a(this);
      }
   }

   @Override
   protected void em() {
      if (this.bX != null) {
         this.bX.b(this);
      }

      this.bF++;
      if (this.bF >= 180 && this.bF <= 200) {
         float $$0 = (this.ae.i() - 0.5F) * 8.0F;
         float $$1 = (this.ae.i() - 0.5F) * 4.0F;
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         this.dV().a(lv.v, this.dA() + (double)$$0, this.dC() + 2.0 + (double)$$1, this.dG() + (double)$$2, 0.0, 0.0, 0.0);
      }

      int $$3 = 500;
      if (this.bX != null && !this.bX.f()) {
         $$3 = 12000;
      }

      if (this.dV() instanceof arn $$4) {
         if (this.bF > 150 && this.bF % 5 == 0 && $$4.O().c(dhl.f)) {
            bwg.a($$4, this.dt(), azk.d((float)$$3 * 0.08F));
         }

         if (this.bF == 1 && !this.bb()) {
            $$4.b(1028, this.dv(), 0);
         }
      }

      fcu $$5 = new fcu(0.0, 0.1F, 0.0);
      this.a(bwv.a, $$5);

      for (cld $$6 : this.bP) {
         $$6.by();
         $$6.b($$6.dt().e($$5));
      }

      if (this.bF == 200 && this.dV() instanceof arn $$7) {
         if ($$7.O().c(dhl.f)) {
            bwg.a($$7, this.dt(), azk.d((float)$$3 * 0.2F));
         }

         if (this.bX != null) {
            this.bX.a(this);
         }

         this.a(bvs.e.a);
         this.a(edm.p);
      }
   }

   public int n() {
      if (this.cc[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = azk.d(60.0F * azk.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = azk.d(60.0F * azk.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = azk.d(40.0F * azk.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = azk.d(40.0F * azk.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = azk.d(20.0F * azk.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = azk.d(20.0F * azk.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(73, this.dV().a(eel.a.f, new jj($$3, 0, $$4)).v() + $$1);
            this.cc[$$0] = new evf($$3, $$9, $$4);
         }

         this.cd[0] = 6146;
         this.cd[1] = 8197;
         this.cd[2] = 8202;
         this.cd[3] = 16404;
         this.cd[4] = 32808;
         this.cd[5] = 32848;
         this.cd[6] = 65696;
         this.cd[7] = 131392;
         this.cd[8] = 131712;
         this.cd[9] = 263424;
         this.cd[10] = 526848;
         this.cd[11] = 525313;
         this.cd[12] = 1581057;
         this.cd[13] = 3166214;
         this.cd[14] = 2138120;
         this.cd[15] = 6373424;
         this.cd[16] = 4358208;
         this.cd[17] = 12910976;
         this.cd[18] = 9044480;
         this.cd[19] = 9706496;
         this.cd[20] = 15216640;
         this.cd[21] = 13688832;
         this.cd[22] = 11763712;
         this.cd[23] = 8257536;
      }

      return this.q(this.dA(), this.dC(), this.dG());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      evf $$5 = new evf(azk.a($$0), azk.a($$1), azk.a($$2));
      int $$6 = 0;
      if (this.bX == null || this.bX.e() == 0) {
         $$6 = 12;
      }

      for (int $$7 = $$6; $$7 < 24; $$7++) {
         if (this.cc[$$7] != null) {
            float $$8 = this.cc[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public evh a(int $$0, int $$1, @Nullable evf $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         evf $$4 = this.cc[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      evf $$5 = this.cc[$$0];
      evf $$6 = this.cc[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.ce.a();
      this.ce.a($$5);
      evf $$7 = $$5;
      int $$8 = 0;
      if (this.bX == null || this.bX.e() == 0) {
         $$8 = 12;
      }

      while (!this.ce.e()) {
         evf $$9 = this.ce.c();
         if ($$9.equals($$6)) {
            if ($$2 != null) {
               $$2.h = $$6;
               $$6 = $$2;
            }

            return this.a($$5, $$6);
         }

         if ($$9.a($$6) < $$7.a($$6)) {
            $$7 = $$9;
         }

         $$9.i = true;
         int $$10 = 0;

         for (int $$11 = 0; $$11 < 24; $$11++) {
            if (this.cc[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for (int $$12 = $$8; $$12 < 24; $$12++) {
            if ((this.cd[$$10] & 1 << $$12) > 0) {
               evf $$13 = this.cc[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.ce.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.ce.a($$13);
                     }
                  }
               }
            }
         }
      }

      if ($$7 == $$5) {
         return null;
      } else {
         bI.debug("Failed to find path from {} to {}", $$0, $$1);
         if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
         }

         return this.a($$5, $$7);
      }
   }

   private evh a(evf $$0, evf $$1) {
      List<evf> $$2 = Lists.newArrayList();
      evf $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new evh($$2, new jj($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.bZ.a().h().b());
      $$0.a("DragonDeathTime", this.bF);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.bZ.a(clw.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bF = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dH() {
   }

   public cld[] q() {
      return this.bP;
   }

   @Override
   public boolean bG() {
      return false;
   }

   @Override
   public awl dm() {
      return awl.f;
   }

   @Override
   protected awj u() {
      return awk.iv;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.iA;
   }

   @Override
   protected float fd() {
      return 5.0F;
   }

   public fcu K(float $$0) {
      clq $$1 = this.bZ.a();
      clw<? extends clq> $$2 = $$1.h();
      fcu $$8;
      if ($$2 == clw.d || $$2 == clw.e) {
         jj $$3 = this.dV().a(eel.a.f, ehq.a(this.bY));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.dt())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dN();
         float $$7 = 1.5F;
         this.x(-$$5 * 1.5F * 5.0F);
         $$8 = this.h($$0);
         this.x($$6);
      } else if ($$1.a()) {
         float $$9 = this.dN();
         float $$10 = 1.5F;
         this.x(-45.0F);
         $$8 = this.h($$0);
         this.x($$9);
      } else {
         $$8 = this.h($$0);
      }

      return $$8;
   }

   public void a(arn $$0, clf $$1, jj $$2, buh $$3) {
      cqi $$5;
      if ($$3.d() instanceof cqi $$4) {
         $$5 = $$4;
      } else {
         $$5 = $$0.a(bJ, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
      }

      if ($$1 == this.bH) {
         this.a($$0, this.c, this.dW().d($$1, $$5), 10.0F);
      }

      this.bZ.a().a($$1, $$2, $$3, $$5);
   }

   @Override
   public void a(akg<?> $$0) {
      if (a.equals($$0) && this.dV().C) {
         this.bZ.a(clw.a(this.au().a(a)));
      }

      super.a($$0);
   }

   public clx t() {
      return this.bZ;
   }

   @Nullable
   public ecm x() {
      return this.bX;
   }

   @Override
   public boolean b(buw $$0, @Nullable bvs $$1) {
      return false;
   }

   @Override
   protected boolean o(bvs $$0) {
      return false;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public void a(abs $$0) {
      super.a($$0);
      cld[] $$1 = this.q();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b() + 1);
      }
   }

   @Override
   public boolean c(bwr $$0) {
      return $$0.ey();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
