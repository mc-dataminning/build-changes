import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clw extends bxe implements cnr {
   private static final Logger bJ = LogUtils.getLogger();
   public static final akj<Integer> a = akn.a(clw.class, akl.b);
   private static final chr bK = chr.a().a(64.0);
   private static final int bL = 200;
   private static final int bM = 400;
   private static final float bN = 0.25F;
   private static final String bO = "DragonDeathTime";
   private static final String bP = "DragonPhase";
   public final clu b = new clu();
   private final clt[] bQ;
   public final clt c;
   private final clt bR;
   private final clt bS;
   private final clt bT;
   private final clt bU;
   private final clt bV;
   private final clt bW;
   private final clt bX;
   public float d;
   public float bE;
   public boolean bF;
   public int bG;
   public float bH;
   @Nullable
   public clv bI;
   @Nullable
   private edz bY;
   private iu bZ = iu.c;
   private final cmn ca;
   private int cb = 100;
   private float cc;
   private final ews[] cd = new ews[24];
   private final int[] ce = new int[24];
   private final ewq cf = new ewq();

   public clw(bwm<? extends clw> $$0, div $$1) {
      super(bwm.P, $$1);
      this.c = new clt(this, "head", 1.0F, 1.0F);
      this.bR = new clt(this, "neck", 3.0F, 3.0F);
      this.bS = new clt(this, "body", 5.0F, 3.0F);
      this.bT = new clt(this, "tail", 2.0F, 2.0F);
      this.bU = new clt(this, "tail", 2.0F, 2.0F);
      this.bV = new clt(this, "tail", 2.0F, 2.0F);
      this.bW = new clt(this, "wing", 4.0F, 2.0F);
      this.bX = new clt(this, "wing", 4.0F, 2.0F);
      this.bQ = new clt[]{this.c, this.bR, this.bS, this.bT, this.bU, this.bV, this.bW, this.bX};
      this.d(this.eT());
      this.ad = true;
      this.ca = new cmn(this);
   }

   public void a(edz $$0) {
      this.bY = $$0;
   }

   @Override
   public void c(iu $$0) {
      this.bZ = $$0;
   }

   public iu j() {
      return this.bZ;
   }

   public static byh.a m() {
      return bxe.E().a(byi.s, 200.0);
   }

   @Override
   public boolean ba() {
      float $$0 = azm.b(this.bE * (float) (Math.PI * 2));
      float $$1 = azm.b(this.d * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aZ() {
      if (this.dV().C && !this.bb()) {
         this.dV().a(this.dA(), this.dC(), this.dG(), awn.iz, this.dm(), 5.0F, 0.8F + this.ae.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, cmm.k.b());
   }

   @Override
   public void k_() {
      this.aO();
      if (this.dV().C) {
         this.d(this.eF());
         if (!this.bb() && !this.ca.a().a() && --this.cb < 0) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.iA, this.dm(), 2.5F, 0.8F + this.ae.i() * 0.3F, false);
            this.cb = 200 + this.ae.a(200);
         }
      }

      if (this.bY == null && this.dV() instanceof arq $$0) {
         edz $$1 = $$0.F();
         if ($$1 != null && this.cG().equals($$1.i())) {
            this.bY = $$1;
         }
      }

      this.d = this.bE;
      if (this.eG()) {
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         float $$3 = (this.ae.i() - 0.5F) * 4.0F;
         float $$4 = (this.ae.i() - 0.5F) * 8.0F;
         this.dV().a(lx.w, this.dA() + (double)$$2, this.dC() + 2.0 + (double)$$3, this.dG() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gn();
         fei $$5 = this.dy();
         float $$6 = 0.2F / ((float)$$5.i() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.e);
         if (this.ca.a().a()) {
            this.bE += 0.1F;
         } else if (this.bF) {
            this.bE += $$6 * 0.5F;
         } else {
            this.bE += $$6;
         }

         this.w(azm.h(this.dL()));
         if (this.gf()) {
            this.bE = 0.5F;
         } else {
            this.b.a(this.dC(), this.dL());
            if (this.dV() instanceof arq $$7) {
               cmg $$9 = this.ca.a();
               $$9.a($$7);
               if (this.ca.a() != $$9) {
                  $$9 = this.ca.a();
                  $$9.a($$7);
               }

               fei $$10 = $$9.f();
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
                  fei $$17 = $$10.a(this.dA(), this.dC(), this.dG()).d();
                  fei $$18 = new fei((double)azm.a(this.dL() * (float) (Math.PI / 180.0)), this.dy().e, (double)(-azm.b(this.dL() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$19 = Math.max(((float)$$18.b($$17) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$11) > 1.0E-5F || Math.abs($$13) > 1.0E-5F) {
                     float $$20 = azm.a(azm.h(180.0F - (float)azm.d($$11, $$13) * (180.0F / (float)Math.PI) - this.dL()), -50.0F, 50.0F);
                     this.bH *= 0.8F;
                     this.bH = this.bH + $$20 * $$9.g();
                     this.w(this.dL() + this.bH * 0.1F);
                  }

                  float $$21 = (float)(2.0 / ($$14 + 1.0));
                  float $$22 = 0.06F;
                  this.a(0.06F * ($$19 * $$21 + (1.0F - $$21)), new fei(0.0, 0.0, -1.0));
                  if (this.bF) {
                     this.a(bxg.a, this.dy().c(0.8F));
                  } else {
                     this.a(bxg.a, this.dy());
                  }

                  fei $$23 = this.dy().d();
                  double $$24 = 0.8 + 0.15 * ($$23.b($$18) + 1.0) / 2.0;
                  this.i(this.dy().d($$24, 0.91F, $$24));
               }
            } else {
               this.bj.e();
               this.ca.a().b();
            }

            if (!this.dV().w_()) {
               this.aK();
            }

            this.aV = this.dL();
            fei[] $$25 = new fei[this.bQ.length];

            for (int $$26 = 0; $$26 < this.bQ.length; $$26++) {
               $$25[$$26] = new fei(this.bQ[$$26].dA(), this.bQ[$$26].dC(), this.bQ[$$26].dG());
            }

            float $$27 = (float)(this.b.a(5).a() - this.b.a(10).a()) * 10.0F * (float) (Math.PI / 180.0);
            float $$28 = azm.b($$27);
            float $$29 = azm.a($$27);
            float $$30 = this.dL() * (float) (Math.PI / 180.0);
            float $$31 = azm.a($$30);
            float $$32 = azm.b($$30);
            this.a(this.bS, (double)($$31 * 0.5F), 0.0, (double)(-$$32 * 0.5F));
            this.a(this.bW, (double)($$32 * 4.5F), 2.0, (double)($$31 * 4.5F));
            this.a(this.bX, (double)($$32 * -4.5F), 2.0, (double)($$31 * -4.5F));
            if (this.dV() instanceof arq $$33 && this.aN == 0) {
               this.a($$33, $$33.a(this, this.bW.cR().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bwk.e));
               this.a($$33, $$33.a(this, this.bX.cR().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bwk.e));
               this.b($$33, $$33.a(this, this.c.cR().g(1.0), bwk.e));
               this.b($$33, $$33.a(this, this.bR.cR().g(1.0), bwk.e));
            }

            float $$34 = azm.a(this.dL() * (float) (Math.PI / 180.0) - this.bH * 0.01F);
            float $$35 = azm.b(this.dL() * (float) (Math.PI / 180.0) - this.bH * 0.01F);
            float $$36 = this.gm();
            this.a(this.c, (double)($$34 * 6.5F * $$28), (double)($$36 + $$29 * 6.5F), (double)(-$$35 * 6.5F * $$28));
            this.a(this.bR, (double)($$34 * 5.5F * $$28), (double)($$36 + $$29 * 5.5F), (double)(-$$35 * 5.5F * $$28));
            clu.a $$37 = this.b.a(5);

            for (int $$38 = 0; $$38 < 3; $$38++) {
               clt $$39 = null;
               if ($$38 == 0) {
                  $$39 = this.bT;
               }

               if ($$38 == 1) {
                  $$39 = this.bU;
               }

               if ($$38 == 2) {
                  $$39 = this.bV;
               }

               clu.a $$40 = this.b.a(12 + $$38 * 2);
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
               this.bF = this.a($$46, this.c.cR()) | this.a($$46, this.bR.cR()) | this.a($$46, this.bS.cR());
               if (this.bY != null) {
                  this.bY.b(this);
               }
            }

            for (int $$47 = 0; $$47 < this.bQ.length; $$47++) {
               this.bQ[$$47].K = $$25[$$47].d;
               this.bQ[$$47].L = $$25[$$47].e;
               this.bQ[$$47].M = $$25[$$47].f;
               this.bQ[$$47].aa = $$25[$$47].d;
               this.bQ[$$47].ab = $$25[$$47].e;
               this.bQ[$$47].ac = $$25[$$47].f;
            }
         }
      }
   }

   private void a(clt $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dA() + $$1, this.dC() + $$2, this.dG() + $$3);
   }

   private float gm() {
      if (this.ca.a().a()) {
         return -1.0F;
      } else {
         clu.a $$0 = this.b.a(5);
         clu.a $$1 = this.b.a(0);
         return (float)($$0.a() - $$1.a());
      }
   }

   private void gn() {
      if (this.bI != null) {
         if (this.bI.dQ()) {
            this.bI = null;
         } else if (this.af % 10 == 0 && this.eF() < this.eT()) {
            this.d(this.eF() + 1.0F);
         }
      }

      if (this.ae.a(10) == 0) {
         List<clv> $$0 = this.dV().a(clv.class, this.cR().g(32.0));
         clv $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (clv $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.bI = $$1;
      }
   }

   private void a(arq $$0, List<bwd> $$1) {
      double $$2 = (this.bS.cR().a + this.bS.cR().d) / 2.0;
      double $$3 = (this.bS.cR().c + this.bS.cR().f) / 2.0;

      for (bwd $$4 : $$1) {
         if ($$4 instanceof bxc) {
            bxc $$5 = (bxc)$$4;
            double $$6 = $$4.dA() - $$2;
            double $$7 = $$4.dG() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.j($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.ca.a().a() && $$5.es() < $$4.af - 2) {
               bus $$9 = this.dW().b((bxc)this);
               $$4.a($$0, $$9, 5.0F);
               dfn.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(arq $$0, List<bwd> $$1) {
      for (bwd $$2 : $$1) {
         if ($$2 instanceof bxc) {
            bus $$3 = this.dW().b((bxc)this);
            $$2.a($$0, $$3, 10.0F);
            dfn.a($$0, $$2, $$3);
         }
      }
   }

   private float i(double $$0) {
      return (float)azm.d($$0);
   }

   private boolean a(arq $$0, fed $$1) {
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
               dzz $$14 = $$0.a_($$13);
               if (!$$14.l() && !$$14.a(axc.aG)) {
                  if ($$0.O().c(dir.c) && !$$14.a(axc.aF)) {
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

   public boolean a(arq $$0, clt $$1, bus $$2, float $$3) {
      if (this.ca.a().h() == cmm.j) {
         return false;
      } else {
         $$3 = this.ca.a().a($$2, $$3);
         if ($$1 != this.c) {
            $$3 = $$3 / 4.0F + Math.min($$3, 1.0F);
         }

         if ($$3 < 0.01F) {
            return false;
         } else {
            if ($$2.d() instanceof cqy || $$2.a(axd.y)) {
               float $$4 = this.eF();
               this.d($$0, $$2, $$3);
               if (this.eG() && !this.ca.a().a()) {
                  this.d(1.0F);
                  this.ca.a(cmm.j);
               }

               if (this.ca.a().a()) {
                  this.cc = this.cc + $$4 - this.eF();
                  if (this.cc > 0.25F * this.eT()) {
                     this.cc = 0.0F;
                     this.ca.a(cmm.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      return this.a($$0, this.bS, $$1, $$2);
   }

   protected void d(arq $$0, bus $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }

   @Override
   public void c(arq $$0) {
      this.a(bwd.e.a);
      this.a(eez.p);
      if (this.bY != null) {
         this.bY.b(this);
         this.bY.a(this);
      }
   }

   @Override
   protected void em() {
      if (this.bY != null) {
         this.bY.b(this);
      }

      this.bG++;
      if (this.bG >= 180 && this.bG <= 200) {
         float $$0 = (this.ae.i() - 0.5F) * 8.0F;
         float $$1 = (this.ae.i() - 0.5F) * 4.0F;
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         this.dV().a(lx.v, this.dA() + (double)$$0, this.dC() + 2.0 + (double)$$1, this.dG() + (double)$$2, 0.0, 0.0, 0.0);
      }

      int $$3 = 500;
      if (this.bY != null && !this.bY.f()) {
         $$3 = 12000;
      }

      if (this.dV() instanceof arq $$4) {
         if (this.bG > 150 && this.bG % 5 == 0 && $$4.O().c(dir.f)) {
            bwr.a($$4, this.dt(), azm.d((float)$$3 * 0.08F));
         }

         if (this.bG == 1 && !this.bb()) {
            $$4.b(1028, this.dv(), 0);
         }
      }

      fei $$5 = new fei(0.0, 0.1F, 0.0);
      this.a(bxg.a, $$5);

      for (clt $$6 : this.bQ) {
         $$6.by();
         $$6.b($$6.dt().e($$5));
      }

      if (this.bG == 200 && this.dV() instanceof arq $$7) {
         if ($$7.O().c(dir.f)) {
            bwr.a($$7, this.dt(), azm.d((float)$$3 * 0.2F));
         }

         if (this.bY != null) {
            this.bY.a(this);
         }

         this.a(bwd.e.a);
         this.a(eez.p);
      }
   }

   public int n() {
      if (this.cd[0] == null) {
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

            int $$9 = Math.max(73, this.dV().a(efy.a.f, new iu($$3, 0, $$4)).v() + $$1);
            this.cd[$$0] = new ews($$3, $$9, $$4);
         }

         this.ce[0] = 6146;
         this.ce[1] = 8197;
         this.ce[2] = 8202;
         this.ce[3] = 16404;
         this.ce[4] = 32808;
         this.ce[5] = 32848;
         this.ce[6] = 65696;
         this.ce[7] = 131392;
         this.ce[8] = 131712;
         this.ce[9] = 263424;
         this.ce[10] = 526848;
         this.ce[11] = 525313;
         this.ce[12] = 1581057;
         this.ce[13] = 3166214;
         this.ce[14] = 2138120;
         this.ce[15] = 6373424;
         this.ce[16] = 4358208;
         this.ce[17] = 12910976;
         this.ce[18] = 9044480;
         this.ce[19] = 9706496;
         this.ce[20] = 15216640;
         this.ce[21] = 13688832;
         this.ce[22] = 11763712;
         this.ce[23] = 8257536;
      }

      return this.q(this.dA(), this.dC(), this.dG());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      ews $$5 = new ews(azm.a($$0), azm.a($$1), azm.a($$2));
      int $$6 = 0;
      if (this.bY == null || this.bY.e() == 0) {
         $$6 = 12;
      }

      for (int $$7 = $$6; $$7 < 24; $$7++) {
         if (this.cd[$$7] != null) {
            float $$8 = this.cd[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public ewu a(int $$0, int $$1, @Nullable ews $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         ews $$4 = this.cd[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      ews $$5 = this.cd[$$0];
      ews $$6 = this.cd[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cf.a();
      this.cf.a($$5);
      ews $$7 = $$5;
      int $$8 = 0;
      if (this.bY == null || this.bY.e() == 0) {
         $$8 = 12;
      }

      while (!this.cf.e()) {
         ews $$9 = this.cf.c();
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
            if (this.cd[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for (int $$12 = $$8; $$12 < 24; $$12++) {
            if ((this.ce[$$10] & 1 << $$12) > 0) {
               ews $$13 = this.cd[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.cf.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.cf.a($$13);
                     }
                  }
               }
            }
         }
      }

      if ($$7 == $$5) {
         return null;
      } else {
         bJ.debug("Failed to find path from {} to {}", $$0, $$1);
         if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
         }

         return this.a($$5, $$7);
      }
   }

   private ewu a(ews $$0, ews $$1) {
      List<ews> $$2 = Lists.newArrayList();
      ews $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new ewu($$2, new iu($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.ca.a().h().b());
      $$0.a("DragonDeathTime", this.bG);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.ca.a(cmm.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bG = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dH() {
   }

   public clt[] q() {
      return this.bQ;
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
      return awn.iw;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.iB;
   }

   @Override
   protected float fd() {
      return 5.0F;
   }

   public fei J(float $$0) {
      cmg $$1 = this.ca.a();
      cmm<? extends cmg> $$2 = $$1.h();
      fei $$8;
      if ($$2 == cmm.d || $$2 == cmm.e) {
         iu $$3 = this.dV().a(efy.a.f, ejd.a(this.bZ));
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

   public void a(arq $$0, clv $$1, iu $$2, bus $$3) {
      cqy $$5;
      if ($$3.d() instanceof cqy $$4) {
         $$5 = $$4;
      } else {
         $$5 = $$0.a(bK, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
      }

      if ($$1 == this.bI) {
         this.a($$0, this.c, this.dW().d($$1, $$5), 10.0F);
      }

      this.ca.a().a($$1, $$2, $$3, $$5);
   }

   @Override
   public void a(akj<?> $$0) {
      if (a.equals($$0) && this.dV().C) {
         this.ca.a(cmm.a(this.au().a(a)));
      }

      super.a($$0);
   }

   public cmn t() {
      return this.ca;
   }

   @Nullable
   public edz x() {
      return this.bY;
   }

   @Override
   public boolean b(bvh $$0, @Nullable bwd $$1) {
      return false;
   }

   @Override
   protected boolean o(bwd $$0) {
      return false;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      clt[] $$1 = this.q();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b() + 1);
      }
   }

   @Override
   public boolean c(bxc $$0) {
      return $$0.ey();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
