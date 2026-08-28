import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cma extends bxg implements cnv {
   private static final Logger bK = LogUtils.getLogger();
   public static final akj<Integer> a = akn.a(cma.class, akl.b);
   private static final cht bL = cht.a().a(64.0);
   private static final int bM = 200;
   private static final int bN = 400;
   private static final float bO = 0.25F;
   private static final String bP = "DragonDeathTime";
   private static final String bQ = "DragonPhase";
   public final cly b = new cly();
   private final clx[] bR;
   public final clx c;
   private final clx bS;
   private final clx bT;
   private final clx bU;
   private final clx bV;
   private final clx bW;
   private final clx bX;
   private final clx bY;
   public float d;
   public float bF;
   public boolean bG;
   public int bH;
   public float bI;
   @Nullable
   public clz bJ;
   @Nullable
   private eeh bZ;
   private iu ca = iu.c;
   private final cmr cb;
   private int cc = 100;
   private float cd;
   private final exa[] ce = new exa[24];
   private final int[] cf = new int[24];
   private final ewy cg = new ewy();

   public cma(bwo<? extends cma> $$0, dja $$1) {
      super(bwo.P, $$1);
      this.c = new clx(this, "head", 1.0F, 1.0F);
      this.bS = new clx(this, "neck", 3.0F, 3.0F);
      this.bT = new clx(this, "body", 5.0F, 3.0F);
      this.bU = new clx(this, "tail", 2.0F, 2.0F);
      this.bV = new clx(this, "tail", 2.0F, 2.0F);
      this.bW = new clx(this, "tail", 2.0F, 2.0F);
      this.bX = new clx(this, "wing", 4.0F, 2.0F);
      this.bY = new clx(this, "wing", 4.0F, 2.0F);
      this.bR = new clx[]{this.c, this.bS, this.bT, this.bU, this.bV, this.bW, this.bX, this.bY};
      this.d(this.eU());
      this.ad = true;
      this.cb = new cmr(this);
   }

   public void a(eeh $$0) {
      this.bZ = $$0;
   }

   @Override
   public void c(iu $$0) {
      this.ca = $$0;
   }

   public iu j() {
      return this.ca;
   }

   public static byj.a m() {
      return bxg.E().a(byk.s, 200.0);
   }

   @Override
   public boolean ba() {
      float $$0 = azm.b(this.bF * (float) (Math.PI * 2));
      float $$1 = azm.b(this.d * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aZ() {
      if (this.dV().C && !this.bb()) {
         this.dV().a(this.dA(), this.dC(), this.dG(), awn.iB, this.dm(), 5.0F, 0.8F + this.ae.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, cmq.k.b());
   }

   @Override
   public void k_() {
      this.aO();
      if (this.dV().C) {
         this.d(this.eG());
         if (!this.bb() && !this.cb.a().a() && --this.cc < 0) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.iC, this.dm(), 2.5F, 0.8F + this.ae.i() * 0.3F, false);
            this.cc = 200 + this.ae.a(200);
         }
      }

      if (this.bZ == null && this.dV() instanceof arq $$0) {
         eeh $$1 = $$0.F();
         if ($$1 != null && this.cG().equals($$1.i())) {
            this.bZ = $$1;
         }
      }

      this.d = this.bF;
      if (this.eH()) {
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         float $$3 = (this.ae.i() - 0.5F) * 4.0F;
         float $$4 = (this.ae.i() - 0.5F) * 8.0F;
         this.dV().a(lx.w, this.dA() + (double)$$2, this.dC() + 2.0 + (double)$$3, this.dG() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.go();
         feq $$5 = this.dy();
         float $$6 = 0.2F / ((float)$$5.i() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.e);
         if (this.cb.a().a()) {
            this.bF += 0.1F;
         } else if (this.bG) {
            this.bF += $$6 * 0.5F;
         } else {
            this.bF += $$6;
         }

         this.w(azm.h(this.dL()));
         if (this.gg()) {
            this.bF = 0.5F;
         } else {
            this.b.a(this.dC(), this.dL());
            if (this.dV() instanceof arq $$7) {
               cmk $$9 = this.cb.a();
               $$9.a($$7);
               if (this.cb.a() != $$9) {
                  $$9 = this.cb.a();
                  $$9.a($$7);
               }

               feq $$10 = $$9.f();
               if ($$10 != null) {
                  double $$11 = $$10.d - this.dA();
                  double $$12 = $$10.e - this.dC();
                  double $$13 = $$10.f - this.dG();
                  double $$14 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
                  float $$15 = $$9.e();
                  double $$16 = Math.sqrt($$11 * $$11 + $$13 * $$13);
                  if ($$16 > 0.0) {
                     $$12 = azm.a($$12 / $$16, (double)(-$$15), (double)$$15);
                  }

                  this.i(this.dy().b(0.0, $$12 * 0.01, 0.0));
                  this.w(azm.h(this.dL()));
                  feq $$17 = $$10.a(this.dA(), this.dC(), this.dG()).d();
                  feq $$18 = new feq((double)azm.a(this.dL() * (float) (Math.PI / 180.0)), this.dy().e, (double)(-azm.b(this.dL() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$19 = Math.max(((float)$$18.b($$17) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$11) > 1.0E-5F || Math.abs($$13) > 1.0E-5F) {
                     float $$20 = azm.a(azm.h(180.0F - (float)azm.d($$11, $$13) * (180.0F / (float)Math.PI) - this.dL()), -50.0F, 50.0F);
                     this.bI *= 0.8F;
                     this.bI = this.bI + $$20 * $$9.g();
                     this.w(this.dL() + this.bI * 0.1F);
                  }

                  float $$21 = (float)(2.0 / ($$14 + 1.0));
                  float $$22 = 0.06F;
                  this.a(0.06F * ($$19 * $$21 + (1.0F - $$21)), new feq(0.0, 0.0, -1.0));
                  if (this.bG) {
                     this.a(bxi.a, this.dy().c(0.8F));
                  } else {
                     this.a(bxi.a, this.dy());
                  }

                  feq $$23 = this.dy().d();
                  double $$24 = 0.8 + 0.15 * ($$23.b($$18) + 1.0) / 2.0;
                  this.i(this.dy().d($$24, 0.91F, $$24));
               }
            } else {
               this.bj.e();
               this.cb.a().b();
            }

            if (!this.dV().w_()) {
               this.aK();
            }

            this.aV = this.dL();
            feq[] $$25 = new feq[this.bR.length];

            for (int $$26 = 0; $$26 < this.bR.length; $$26++) {
               $$25[$$26] = new feq(this.bR[$$26].dA(), this.bR[$$26].dC(), this.bR[$$26].dG());
            }

            float $$27 = (float)(this.b.a(5).a() - this.b.a(10).a()) * 10.0F * (float) (Math.PI / 180.0);
            float $$28 = azm.b($$27);
            float $$29 = azm.a($$27);
            float $$30 = this.dL() * (float) (Math.PI / 180.0);
            float $$31 = azm.a($$30);
            float $$32 = azm.b($$30);
            this.a(this.bT, (double)($$31 * 0.5F), 0.0, (double)(-$$32 * 0.5F));
            this.a(this.bX, (double)($$32 * 4.5F), 2.0, (double)($$31 * 4.5F));
            this.a(this.bY, (double)($$32 * -4.5F), 2.0, (double)($$31 * -4.5F));
            if (this.dV() instanceof arq $$33 && this.aN == 0) {
               this.a($$33, $$33.a(this, this.bX.cR().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bwm.e));
               this.a($$33, $$33.a(this, this.bY.cR().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bwm.e));
               this.b($$33, $$33.a(this, this.c.cR().g(1.0), bwm.e));
               this.b($$33, $$33.a(this, this.bS.cR().g(1.0), bwm.e));
            }

            float $$34 = azm.a(this.dL() * (float) (Math.PI / 180.0) - this.bI * 0.01F);
            float $$35 = azm.b(this.dL() * (float) (Math.PI / 180.0) - this.bI * 0.01F);
            float $$36 = this.gn();
            this.a(this.c, (double)($$34 * 6.5F * $$28), (double)($$36 + $$29 * 6.5F), (double)(-$$35 * 6.5F * $$28));
            this.a(this.bS, (double)($$34 * 5.5F * $$28), (double)($$36 + $$29 * 5.5F), (double)(-$$35 * 5.5F * $$28));
            cly.a $$37 = this.b.a(5);

            for (int $$38 = 0; $$38 < 3; $$38++) {
               clx $$39 = null;
               if ($$38 == 0) {
                  $$39 = this.bU;
               }

               if ($$38 == 1) {
                  $$39 = this.bV;
               }

               if ($$38 == 2) {
                  $$39 = this.bW;
               }

               cly.a $$40 = this.b.a(12 + $$38 * 2);
               float $$41 = this.dL() * (float) (Math.PI / 180.0) + this.i((double)($$40.b() - $$37.b())) * (float) (Math.PI / 180.0);
               float $$42 = azm.a($$41);
               float $$43 = azm.b($$41);
               float $$44 = 1.5F;
               float $$45 = (float)($$38 + 1) * 2.0F;
               this.a(
                  $$39,
                  (double)(-($$31 * 1.5F + $$42 * $$45) * $$28),
                  $$40.a() - $$37.a() - (double)(($$45 + 1.5F) * $$29) + 1.5,
                  (double)(($$32 * 1.5F + $$43 * $$45) * $$28)
               );
            }

            if (this.dV() instanceof arq $$46) {
               this.bG = this.a($$46, this.c.cR()) | this.a($$46, this.bS.cR()) | this.a($$46, this.bT.cR());
               if (this.bZ != null) {
                  this.bZ.b(this);
               }
            }

            for (int $$47 = 0; $$47 < this.bR.length; $$47++) {
               this.bR[$$47].K = $$25[$$47].d;
               this.bR[$$47].L = $$25[$$47].e;
               this.bR[$$47].M = $$25[$$47].f;
               this.bR[$$47].aa = $$25[$$47].d;
               this.bR[$$47].ab = $$25[$$47].e;
               this.bR[$$47].ac = $$25[$$47].f;
            }
         }
      }
   }

   private void a(clx $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dA() + $$1, this.dC() + $$2, this.dG() + $$3);
   }

   private float gn() {
      if (this.cb.a().a()) {
         return -1.0F;
      } else {
         cly.a $$0 = this.b.a(5);
         cly.a $$1 = this.b.a(0);
         return (float)($$0.a() - $$1.a());
      }
   }

   private void go() {
      if (this.bJ != null) {
         if (this.bJ.dQ()) {
            this.bJ = null;
         } else if (this.af % 10 == 0 && this.eG() < this.eU()) {
            this.d(this.eG() + 1.0F);
         }
      }

      if (this.ae.a(10) == 0) {
         List<clz> $$0 = this.dV().a(clz.class, this.cR().g(32.0));
         clz $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (clz $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.bJ = $$1;
      }
   }

   private void a(arq $$0, List<bwf> $$1) {
      double $$2 = (this.bT.cR().a + this.bT.cR().d) / 2.0;
      double $$3 = (this.bT.cR().c + this.bT.cR().f) / 2.0;

      for (bwf $$4 : $$1) {
         if ($$4 instanceof bxe) {
            bxe $$5 = (bxe)$$4;
            double $$6 = $$4.dA() - $$2;
            double $$7 = $$4.dG() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.i($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.cb.a().a() && $$5.et() < $$4.af - 2) {
               buu $$9 = this.dW().b((bxe)this);
               $$4.a($$0, $$9, 5.0F);
               dfs.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(arq $$0, List<bwf> $$1) {
      for (bwf $$2 : $$1) {
         if ($$2 instanceof bxe) {
            buu $$3 = this.dW().b((bxe)this);
            $$2.a($$0, $$3, 10.0F);
            dfs.a($$0, $$2, $$3);
         }
      }
   }

   private float i(double $$0) {
      return (float)azm.d($$0);
   }

   private boolean a(arq $$0, fel $$1) {
      int $$2 = azm.a($$1.a);
      int $$3 = azm.a($$1.b);
      int $$4 = azm.a($$1.c);
      int $$5 = azm.a($$1.d);
      int $$6 = azm.a($$1.e);
      int $$7 = azm.a($$1.f);
      boolean $$8 = false;
      boolean $$9 = false;

      for (int $$10 = $$2; $$10 <= $$5; $$10++) {
         for (int $$11 = $$3; $$11 <= $$6; $$11++) {
            for (int $$12 = $$4; $$12 <= $$7; $$12++) {
               iu $$13 = new iu($$10, $$11, $$12);
               eah $$14 = $$0.a_($$13);
               if (!$$14.l() && !$$14.a(axc.aG)) {
                  if ($$0.O().c(diw.d) && !$$14.a(axc.aF)) {
                     $$9 = $$0.a($$13, false) || $$9;
                  } else {
                     $$8 = true;
                  }
               }
            }
         }
      }

      if ($$9) {
         iu $$15 = new iu($$2 + this.ae.a($$5 - $$2 + 1), $$3 + this.ae.a($$6 - $$3 + 1), $$4 + this.ae.a($$7 - $$4 + 1));
         $$0.c(2008, $$15, 0);
      }

      return $$8;
   }

   public boolean a(arq $$0, clx $$1, buu $$2, float $$3) {
      if (this.cb.a().h() == cmq.j) {
         return false;
      } else {
         $$3 = this.cb.a().a($$2, $$3);
         if ($$1 != this.c) {
            $$3 = $$3 / 4.0F + Math.min($$3, 1.0F);
         }

         if ($$3 < 0.01F) {
            return false;
         } else {
            if ($$2.d() instanceof crc || $$2.a(axd.y)) {
               float $$4 = this.eG();
               this.d($$0, $$2, $$3);
               if (this.eH() && !this.cb.a().a()) {
                  this.d(1.0F);
                  this.cb.a(cmq.j);
               }

               if (this.cb.a().a()) {
                  this.cd = this.cd + $$4 - this.eG();
                  if (this.cd > 0.25F * this.eU()) {
                     this.cd = 0.0F;
                     this.cb.a(cmq.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      return this.a($$0, this.bT, $$1, $$2);
   }

   protected void d(arq $$0, buu $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }

   @Override
   public void c(arq $$0) {
      this.a(bwf.e.a);
      this.a(efh.p);
      if (this.bZ != null) {
         this.bZ.b(this);
         this.bZ.a(this);
      }
   }

   @Override
   protected void en() {
      if (this.bZ != null) {
         this.bZ.b(this);
      }

      this.bH++;
      if (this.bH >= 180 && this.bH <= 200) {
         float $$0 = (this.ae.i() - 0.5F) * 8.0F;
         float $$1 = (this.ae.i() - 0.5F) * 4.0F;
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         this.dV().a(lx.v, this.dA() + (double)$$0, this.dC() + 2.0 + (double)$$1, this.dG() + (double)$$2, 0.0, 0.0, 0.0);
      }

      int $$3 = 500;
      if (this.bZ != null && !this.bZ.f()) {
         $$3 = 12000;
      }

      if (this.dV() instanceof arq $$4) {
         if (this.bH > 150 && this.bH % 5 == 0 && $$4.O().c(diw.g)) {
            bwt.a($$4, this.dt(), azm.d((float)$$3 * 0.08F));
         }

         if (this.bH == 1 && !this.bb()) {
            $$4.b(1028, this.dv(), 0);
         }
      }

      feq $$5 = new feq(0.0, 0.1F, 0.0);
      this.a(bxi.a, $$5);

      for (clx $$6 : this.bR) {
         $$6.by();
         $$6.b($$6.dt().e($$5));
      }

      if (this.bH == 200 && this.dV() instanceof arq $$7) {
         if ($$7.O().c(diw.g)) {
            bwt.a($$7, this.dt(), azm.d((float)$$3 * 0.2F));
         }

         if (this.bZ != null) {
            this.bZ.a(this);
         }

         this.a(bwf.e.a);
         this.a(efh.p);
      }
   }

   public int n() {
      if (this.ce[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = azm.d(60.0F * azm.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = azm.d(60.0F * azm.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = azm.d(40.0F * azm.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = azm.d(40.0F * azm.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = azm.d(20.0F * azm.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = azm.d(20.0F * azm.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(73, this.dV().a(egg.a.f, new iu($$3, 0, $$4)).v() + $$1);
            this.ce[$$0] = new exa($$3, $$9, $$4);
         }

         this.cf[0] = 6146;
         this.cf[1] = 8197;
         this.cf[2] = 8202;
         this.cf[3] = 16404;
         this.cf[4] = 32808;
         this.cf[5] = 32848;
         this.cf[6] = 65696;
         this.cf[7] = 131392;
         this.cf[8] = 131712;
         this.cf[9] = 263424;
         this.cf[10] = 526848;
         this.cf[11] = 525313;
         this.cf[12] = 1581057;
         this.cf[13] = 3166214;
         this.cf[14] = 2138120;
         this.cf[15] = 6373424;
         this.cf[16] = 4358208;
         this.cf[17] = 12910976;
         this.cf[18] = 9044480;
         this.cf[19] = 9706496;
         this.cf[20] = 15216640;
         this.cf[21] = 13688832;
         this.cf[22] = 11763712;
         this.cf[23] = 8257536;
      }

      return this.q(this.dA(), this.dC(), this.dG());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      exa $$5 = new exa(azm.a($$0), azm.a($$1), azm.a($$2));
      int $$6 = 0;
      if (this.bZ == null || this.bZ.e() == 0) {
         $$6 = 12;
      }

      for (int $$7 = $$6; $$7 < 24; $$7++) {
         if (this.ce[$$7] != null) {
            float $$8 = this.ce[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public exc a(int $$0, int $$1, @Nullable exa $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         exa $$4 = this.ce[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      exa $$5 = this.ce[$$0];
      exa $$6 = this.ce[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cg.a();
      this.cg.a($$5);
      exa $$7 = $$5;
      int $$8 = 0;
      if (this.bZ == null || this.bZ.e() == 0) {
         $$8 = 12;
      }

      while (!this.cg.e()) {
         exa $$9 = this.cg.c();
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
            if (this.ce[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for (int $$12 = $$8; $$12 < 24; $$12++) {
            if ((this.cf[$$10] & 1 << $$12) > 0) {
               exa $$13 = this.ce[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.cg.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.cg.a($$13);
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

   private exc a(exa $$0, exa $$1) {
      List<exa> $$2 = Lists.newArrayList();
      exa $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new exc($$2, new iu($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cb.a().h().b());
      $$0.a("DragonDeathTime", this.bH);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cb.a(cmq.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bH = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dH() {
   }

   public clx[] q() {
      return this.bR;
   }

   @Override
   public boolean bG() {
      return false;
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return awn.iy;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.iD;
   }

   @Override
   protected float fe() {
      return 5.0F;
   }

   public feq J(float $$0) {
      cmk $$1 = this.cb.a();
      cmq<? extends cmk> $$2 = $$1.h();
      feq $$8;
      if ($$2 == cmq.d || $$2 == cmq.e) {
         iu $$3 = this.dV().a(egg.a.f, ejl.a(this.ca));
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

   public void a(arq $$0, clz $$1, iu $$2, buu $$3) {
      crc $$5;
      if ($$3.d() instanceof crc $$4) {
         $$5 = $$4;
      } else {
         $$5 = $$0.a(bL, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
      }

      if ($$1 == this.bJ) {
         this.a($$0, this.c, this.dW().d($$1, $$5), 10.0F);
      }

      this.cb.a().a($$1, $$2, $$3, $$5);
   }

   @Override
   public void a(akj<?> $$0) {
      if (a.equals($$0) && this.dV().C) {
         this.cb.a(cmq.a(this.au().a(a)));
      }

      super.a($$0);
   }

   public cmr t() {
      return this.cb;
   }

   @Nullable
   public eeh x() {
      return this.bZ;
   }

   @Override
   public boolean b(bvj $$0, @Nullable bwf $$1) {
      return false;
   }

   @Override
   protected boolean o(bwf $$0) {
      return false;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      clx[] $$1 = this.q();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b() + 1);
      }
   }

   @Override
   public boolean c(bxe $$0) {
      return $$0.ez();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
