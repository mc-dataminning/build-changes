import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cng extends byh implements cpc {
   private static final Logger bK = LogUtils.getLogger();
   public static final aku<Integer> a = aky.a(cng.class, akw.b);
   private static final ciu bL = ciu.a().a(64.0);
   private static final int bM = 200;
   private static final int bN = 400;
   private static final float bO = 0.25F;
   private static final String bP = "DragonDeathTime";
   private static final String bQ = "DragonPhase";
   private static final int bR = 0;
   public final cne b = new cne();
   private final cnd[] bS;
   public final cnd c;
   private final cnd bT;
   private final cnd bU;
   private final cnd bV;
   private final cnd bW;
   private final cnd bX;
   private final cnd bY;
   private final cnd bZ;
   public float d;
   public float e;
   public boolean f;
   public int bH = 0;
   public float bI;
   @Nullable
   public cnf bJ;
   @Nullable
   private efq ca;
   private iw cb = iw.c;
   private final cnx cc;
   private int cd = 100;
   private float ce;
   private final eym[] cf = new eym[24];
   private final int[] cg = new int[24];
   private final eyk ch = new eyk();

   public cng(bxn<? extends cng> $$0, dkj $$1) {
      super(bxn.Q, $$1);
      this.c = new cnd(this, "head", 1.0F, 1.0F);
      this.bT = new cnd(this, "neck", 3.0F, 3.0F);
      this.bU = new cnd(this, "body", 5.0F, 3.0F);
      this.bV = new cnd(this, "tail", 2.0F, 2.0F);
      this.bW = new cnd(this, "tail", 2.0F, 2.0F);
      this.bX = new cnd(this, "tail", 2.0F, 2.0F);
      this.bY = new cnd(this, "wing", 4.0F, 2.0F);
      this.bZ = new cnd(this, "wing", 4.0F, 2.0F);
      this.bS = new cnd[]{this.c, this.bT, this.bU, this.bV, this.bW, this.bX, this.bY, this.bZ};
      this.d(this.eU());
      this.ad = true;
      this.cc = new cnx(this);
   }

   public void a(efq $$0) {
      this.ca = $$0;
   }

   @Override
   public void c(iw $$0) {
      this.cb = $$0;
   }

   public iw j() {
      return this.cb;
   }

   public static bzk.a m() {
      return byh.E().a(bzl.s, 200.0);
   }

   @Override
   public boolean aZ() {
      float $$0 = azz.b(this.e * (float) (Math.PI * 2));
      float $$1 = azz.b(this.d * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aY() {
      if (this.dV().C && !this.ba()) {
         this.dV().a(this.dA(), this.dC(), this.dG(), awy.iB, this.dm(), 5.0F, 0.8F + this.ae.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(a, cnw.k.b());
   }

   @Override
   public void k_() {
      this.aN();
      if (this.dV().C) {
         this.d(this.eG());
         if (!this.ba() && !this.cc.a().a() && --this.cd < 0) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awy.iC, this.dm(), 2.5F, 0.8F + this.ae.i() * 0.3F, false);
            this.cd = 200 + this.ae.a(200);
         }
      }

      if (this.ca == null && this.dV() instanceof asb $$0) {
         efq $$1 = $$0.F();
         if ($$1 != null && this.cG().equals($$1.i())) {
            this.ca = $$1;
         }
      }

      this.d = this.e;
      if (this.eH()) {
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         float $$3 = (this.ae.i() - 0.5F) * 4.0F;
         float $$4 = (this.ae.i() - 0.5F) * 8.0F;
         this.dV().a(lz.w, this.dA() + (double)$$2, this.dC() + 2.0 + (double)$$3, this.dG() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gr();
         fgc $$5 = this.dy();
         float $$6 = 0.2F / ((float)$$5.i() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.e);
         if (this.cc.a().a()) {
            this.e += 0.1F;
         } else if (this.f) {
            this.e += $$6 * 0.5F;
         } else {
            this.e += $$6;
         }

         this.w(azz.h(this.dL()));
         if (this.gj()) {
            this.e = 0.5F;
         } else {
            this.b.a(this.dC(), this.dL());
            if (this.dV() instanceof asb $$7) {
               cnq $$9 = this.cc.a();
               $$9.a($$7);
               if (this.cc.a() != $$9) {
                  $$9 = this.cc.a();
                  $$9.a($$7);
               }

               fgc $$10 = $$9.f();
               if ($$10 != null) {
                  double $$11 = $$10.d - this.dA();
                  double $$12 = $$10.e - this.dC();
                  double $$13 = $$10.f - this.dG();
                  double $$14 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
                  float $$15 = $$9.e();
                  double $$16 = Math.sqrt($$11 * $$11 + $$13 * $$13);
                  if ($$16 > 0.0) {
                     $$12 = azz.a($$12 / $$16, (double)(-$$15), (double)$$15);
                  }

                  this.i(this.dy().b(0.0, $$12 * 0.01, 0.0));
                  this.w(azz.h(this.dL()));
                  fgc $$17 = $$10.a(this.dA(), this.dC(), this.dG()).d();
                  fgc $$18 = new fgc((double)azz.a(this.dL() * (float) (Math.PI / 180.0)), this.dy().e, (double)(-azz.b(this.dL() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$19 = Math.max(((float)$$18.b($$17) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$11) > 1.0E-5F || Math.abs($$13) > 1.0E-5F) {
                     float $$20 = azz.a(azz.h(180.0F - (float)azz.d($$11, $$13) * (180.0F / (float)Math.PI) - this.dL()), -50.0F, 50.0F);
                     this.bI *= 0.8F;
                     this.bI = this.bI + $$20 * $$9.g();
                     this.w(this.dL() + this.bI * 0.1F);
                  }

                  float $$21 = (float)(2.0 / ($$14 + 1.0));
                  float $$22 = 0.06F;
                  this.a(0.06F * ($$19 * $$21 + (1.0F - $$21)), new fgc(0.0, 0.0, -1.0));
                  if (this.f) {
                     this.a(byj.a, this.dy().c(0.8F));
                  } else {
                     this.a(byj.a, this.dy());
                  }

                  fgc $$23 = this.dy().d();
                  double $$24 = 0.8 + 0.15 * ($$23.b($$18) + 1.0) / 2.0;
                  this.i(this.dy().d($$24, 0.91F, $$24));
               }
            } else {
               this.bj.e();
               this.cc.a().b();
            }

            if (!this.dV().A_()) {
               this.aI();
            }

            this.aV = this.dL();
            fgc[] $$25 = new fgc[this.bS.length];

            for (int $$26 = 0; $$26 < this.bS.length; $$26++) {
               $$25[$$26] = new fgc(this.bS[$$26].dA(), this.bS[$$26].dC(), this.bS[$$26].dG());
            }

            float $$27 = (float)(this.b.a(5).a() - this.b.a(10).a()) * 10.0F * (float) (Math.PI / 180.0);
            float $$28 = azz.b($$27);
            float $$29 = azz.a($$27);
            float $$30 = this.dL() * (float) (Math.PI / 180.0);
            float $$31 = azz.a($$30);
            float $$32 = azz.b($$30);
            this.a(this.bU, (double)($$31 * 0.5F), 0.0, (double)(-$$32 * 0.5F));
            this.a(this.bY, (double)($$32 * 4.5F), 2.0, (double)($$31 * 4.5F));
            this.a(this.bZ, (double)($$32 * -4.5F), 2.0, (double)($$31 * -4.5F));
            if (this.dV() instanceof asb $$33 && this.aN == 0) {
               this.a($$33, $$33.a(this, this.bY.cR().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bxl.e));
               this.a($$33, $$33.a(this, this.bZ.cR().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bxl.e));
               this.b($$33, $$33.a(this, this.c.cR().g(1.0), bxl.e));
               this.b($$33, $$33.a(this, this.bT.cR().g(1.0), bxl.e));
            }

            float $$34 = azz.a(this.dL() * (float) (Math.PI / 180.0) - this.bI * 0.01F);
            float $$35 = azz.b(this.dL() * (float) (Math.PI / 180.0) - this.bI * 0.01F);
            float $$36 = this.gq();
            this.a(this.c, (double)($$34 * 6.5F * $$28), (double)($$36 + $$29 * 6.5F), (double)(-$$35 * 6.5F * $$28));
            this.a(this.bT, (double)($$34 * 5.5F * $$28), (double)($$36 + $$29 * 5.5F), (double)(-$$35 * 5.5F * $$28));
            cne.a $$37 = this.b.a(5);

            for (int $$38 = 0; $$38 < 3; $$38++) {
               cnd $$39 = null;
               if ($$38 == 0) {
                  $$39 = this.bV;
               }

               if ($$38 == 1) {
                  $$39 = this.bW;
               }

               if ($$38 == 2) {
                  $$39 = this.bX;
               }

               cne.a $$40 = this.b.a(12 + $$38 * 2);
               float $$41 = this.dL() * (float) (Math.PI / 180.0) + this.i((double)($$40.b() - $$37.b())) * (float) (Math.PI / 180.0);
               float $$42 = azz.a($$41);
               float $$43 = azz.b($$41);
               float $$44 = 1.5F;
               float $$45 = (float)($$38 + 1) * 2.0F;
               this.a(
                  $$39,
                  (double)(-($$31 * 1.5F + $$42 * $$45) * $$28),
                  $$40.a() - $$37.a() - (double)(($$45 + 1.5F) * $$29) + 1.5,
                  (double)(($$32 * 1.5F + $$43 * $$45) * $$28)
               );
            }

            if (this.dV() instanceof asb $$46) {
               this.f = this.a($$46, this.c.cR()) | this.a($$46, this.bT.cR()) | this.a($$46, this.bU.cR());
               if (this.ca != null) {
                  this.ca.b(this);
               }
            }

            for (int $$47 = 0; $$47 < this.bS.length; $$47++) {
               this.bS[$$47].K = $$25[$$47].d;
               this.bS[$$47].L = $$25[$$47].e;
               this.bS[$$47].M = $$25[$$47].f;
               this.bS[$$47].aa = $$25[$$47].d;
               this.bS[$$47].ab = $$25[$$47].e;
               this.bS[$$47].ac = $$25[$$47].f;
            }
         }
      }
   }

   private void a(cnd $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dA() + $$1, this.dC() + $$2, this.dG() + $$3);
   }

   private float gq() {
      if (this.cc.a().a()) {
         return -1.0F;
      } else {
         cne.a $$0 = this.b.a(5);
         cne.a $$1 = this.b.a(0);
         return (float)($$0.a() - $$1.a());
      }
   }

   private void gr() {
      if (this.bJ != null) {
         if (this.bJ.dQ()) {
            this.bJ = null;
         } else if (this.af % 10 == 0 && this.eG() < this.eU()) {
            this.d(this.eG() + 1.0F);
         }
      }

      if (this.ae.a(10) == 0) {
         List<cnf> $$0 = this.dV().a(cnf.class, this.cR().g(32.0));
         cnf $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cnf $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.bJ = $$1;
      }
   }

   private void a(asb $$0, List<bxe> $$1) {
      double $$2 = (this.bU.cR().a + this.bU.cR().d) / 2.0;
      double $$3 = (this.bU.cR().c + this.bU.cR().f) / 2.0;

      for (bxe $$4 : $$1) {
         if ($$4 instanceof byf) {
            byf $$5 = (byf)$$4;
            double $$6 = $$4.dA() - $$2;
            double $$7 = $$4.dG() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.i($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.cc.a().a() && $$5.et() < $$4.af - 2) {
               bvt $$9 = this.dW().b((byf)this);
               $$4.a($$0, $$9, 5.0F);
               dgz.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(asb $$0, List<bxe> $$1) {
      for (bxe $$2 : $$1) {
         if ($$2 instanceof byf) {
            bvt $$3 = this.dW().b((byf)this);
            $$2.a($$0, $$3, 10.0F);
            dgz.a($$0, $$2, $$3);
         }
      }
   }

   private float i(double $$0) {
      return (float)azz.d($$0);
   }

   private boolean a(asb $$0, ffx $$1) {
      int $$2 = azz.a($$1.a);
      int $$3 = azz.a($$1.b);
      int $$4 = azz.a($$1.c);
      int $$5 = azz.a($$1.d);
      int $$6 = azz.a($$1.e);
      int $$7 = azz.a($$1.f);
      boolean $$8 = false;
      boolean $$9 = false;

      for (int $$10 = $$2; $$10 <= $$5; $$10++) {
         for (int $$11 = $$3; $$11 <= $$6; $$11++) {
            for (int $$12 = $$4; $$12 <= $$7; $$12++) {
               iw $$13 = new iw($$10, $$11, $$12);
               ebq $$14 = $$0.a_($$13);
               if (!$$14.l() && !$$14.a(axn.aG)) {
                  if ($$0.O().c(dkf.d) && !$$14.a(axn.aF)) {
                     $$9 = $$0.a($$13, false) || $$9;
                  } else {
                     $$8 = true;
                  }
               }
            }
         }
      }

      if ($$9) {
         iw $$15 = new iw($$2 + this.ae.a($$5 - $$2 + 1), $$3 + this.ae.a($$6 - $$3 + 1), $$4 + this.ae.a($$7 - $$4 + 1));
         $$0.c(2008, $$15, 0);
      }

      return $$8;
   }

   public boolean a(asb $$0, cnd $$1, bvt $$2, float $$3) {
      if (this.cc.a().h() == cnw.j) {
         return false;
      } else {
         $$3 = this.cc.a().a($$2, $$3);
         if ($$1 != this.c) {
            $$3 = $$3 / 4.0F + Math.min($$3, 1.0F);
         }

         if ($$3 < 0.01F) {
            return false;
         } else {
            if ($$2.d() instanceof csi || $$2.a(axo.y)) {
               float $$4 = this.eG();
               this.d($$0, $$2, $$3);
               if (this.eH() && !this.cc.a().a()) {
                  this.d(1.0F);
                  this.cc.a(cnw.j);
               }

               if (this.cc.a().a()) {
                  this.ce = this.ce + $$4 - this.eG();
                  if (this.ce > 0.25F * this.eU()) {
                     this.ce = 0.0F;
                     this.cc.a(cnw.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      return this.a($$0, this.bU, $$1, $$2);
   }

   protected void d(asb $$0, bvt $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }

   @Override
   public void c(asb $$0) {
      this.a(bxe.d.a);
      this.a(egq.p);
      if (this.ca != null) {
         this.ca.b(this);
         this.ca.a(this);
      }
   }

   @Override
   protected void en() {
      if (this.ca != null) {
         this.ca.b(this);
      }

      this.bH++;
      if (this.bH >= 180 && this.bH <= 200) {
         float $$0 = (this.ae.i() - 0.5F) * 8.0F;
         float $$1 = (this.ae.i() - 0.5F) * 4.0F;
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         this.dV().a(lz.v, this.dA() + (double)$$0, this.dC() + 2.0 + (double)$$1, this.dG() + (double)$$2, 0.0, 0.0, 0.0);
      }

      int $$3 = 500;
      if (this.ca != null && !this.ca.f()) {
         $$3 = 12000;
      }

      if (this.dV() instanceof asb $$4) {
         if (this.bH > 150 && this.bH % 5 == 0 && $$4.O().c(dkf.g)) {
            bxs.a($$4, this.dt(), azz.d((float)$$3 * 0.08F));
         }

         if (this.bH == 1 && !this.ba()) {
            $$4.b(1028, this.dv(), 0);
         }
      }

      fgc $$5 = new fgc(0.0, 0.1F, 0.0);
      this.a(byj.a, $$5);

      for (cnd $$6 : this.bS) {
         $$6.bx();
         $$6.b($$6.dt().e($$5));
      }

      if (this.bH == 200 && this.dV() instanceof asb $$7) {
         if ($$7.O().c(dkf.g)) {
            bxs.a($$7, this.dt(), azz.d((float)$$3 * 0.2F));
         }

         if (this.ca != null) {
            this.ca.a(this);
         }

         this.a(bxe.d.a);
         this.a(egq.p);
      }
   }

   public int n() {
      if (this.cf[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = azz.d(60.0F * azz.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = azz.d(60.0F * azz.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = azz.d(40.0F * azz.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = azz.d(40.0F * azz.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = azz.d(20.0F * azz.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = azz.d(20.0F * azz.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(73, this.dV().a(ehp.a.f, new iw($$3, 0, $$4)).v() + $$1);
            this.cf[$$0] = new eym($$3, $$9, $$4);
         }

         this.cg[0] = 6146;
         this.cg[1] = 8197;
         this.cg[2] = 8202;
         this.cg[3] = 16404;
         this.cg[4] = 32808;
         this.cg[5] = 32848;
         this.cg[6] = 65696;
         this.cg[7] = 131392;
         this.cg[8] = 131712;
         this.cg[9] = 263424;
         this.cg[10] = 526848;
         this.cg[11] = 525313;
         this.cg[12] = 1581057;
         this.cg[13] = 3166214;
         this.cg[14] = 2138120;
         this.cg[15] = 6373424;
         this.cg[16] = 4358208;
         this.cg[17] = 12910976;
         this.cg[18] = 9044480;
         this.cg[19] = 9706496;
         this.cg[20] = 15216640;
         this.cg[21] = 13688832;
         this.cg[22] = 11763712;
         this.cg[23] = 8257536;
      }

      return this.q(this.dA(), this.dC(), this.dG());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      eym $$5 = new eym(azz.a($$0), azz.a($$1), azz.a($$2));
      int $$6 = 0;
      if (this.ca == null || this.ca.e() == 0) {
         $$6 = 12;
      }

      for (int $$7 = $$6; $$7 < 24; $$7++) {
         if (this.cf[$$7] != null) {
            float $$8 = this.cf[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public eyo a(int $$0, int $$1, @Nullable eym $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         eym $$4 = this.cf[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      eym $$5 = this.cf[$$0];
      eym $$6 = this.cf[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.ch.a();
      this.ch.a($$5);
      eym $$7 = $$5;
      int $$8 = 0;
      if (this.ca == null || this.ca.e() == 0) {
         $$8 = 12;
      }

      while (!this.ch.e()) {
         eym $$9 = this.ch.c();
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
            if (this.cf[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for (int $$12 = $$8; $$12 < 24; $$12++) {
            if ((this.cg[$$10] & 1 << $$12) > 0) {
               eym $$13 = this.cf[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.ch.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.ch.a($$13);
                     }
                  }
               }
            }
         }
      }

      if ($$7 == $$5) {
         return null;
      } else {
         bK.debug("Failed to find path from {} to {}", $$0, $$1);
         if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
         }

         return this.a($$5, $$7);
      }
   }

   private eyo a(eym $$0, eym $$1) {
      List<eym> $$2 = Lists.newArrayList();
      eym $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new eyo($$2, new iw($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cc.a().h().b());
      $$0.a("DragonDeathTime", this.bH);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.e("DragonPhase").ifPresent($$0x -> this.cc.a(cnw.a($$0x)));
      this.bH = $$0.b("DragonDeathTime", 0);
   }

   @Override
   public void dH() {
   }

   public cnd[] q() {
      return this.bS;
   }

   @Override
   public boolean bF() {
      return false;
   }

   @Override
   public awz dm() {
      return awz.f;
   }

   @Override
   protected awx u() {
      return awy.iy;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.iD;
   }

   @Override
   protected float fe() {
      return 5.0F;
   }

   public fgc J(float $$0) {
      cnq $$1 = this.cc.a();
      cnw<? extends cnq> $$2 = $$1.h();
      fgc $$8;
      if ($$2 == cnw.d || $$2 == cnw.e) {
         iw $$3 = this.dV().a(ehp.a.f, eku.a(this.cb));
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

   public void a(asb $$0, cnf $$1, iw $$2, bvt $$3) {
      csi $$5;
      if ($$3.d() instanceof csi $$4) {
         $$5 = $$4;
      } else {
         $$5 = $$0.a(bL, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
      }

      if ($$1 == this.bJ) {
         this.a($$0, this.c, this.dW().d($$1, $$5), 10.0F);
      }

      this.cc.a().a($$1, $$2, $$3, $$5);
   }

   @Override
   public void a(aku<?> $$0) {
      if (a.equals($$0) && this.dV().C) {
         this.cc.a(cnw.a(this.ar().a(a)));
      }

      super.a($$0);
   }

   public cnx t() {
      return this.cc;
   }

   @Nullable
   public efq x() {
      return this.ca;
   }

   @Override
   public boolean b(bwi $$0, @Nullable bxe $$1) {
      return false;
   }

   @Override
   protected boolean o(bxe $$0) {
      return false;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      cnd[] $$1 = this.q();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b() + 1);
      }
   }

   @Override
   public boolean c(byf $$0) {
      return $$0.ez();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
