import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckp extends bwa implements cmk {
   private static final Logger bJ = LogUtils.getLogger();
   public static final ajx<Integer> a = akb.a(ckp.class, ajz.b);
   private static final cgp bK = cgp.a().a(64.0);
   private static final int bL = 200;
   private static final int bM = 400;
   private static final float bN = 0.25F;
   private static final String bO = "DragonDeathTime";
   private static final String bP = "DragonPhase";
   public final ckn b = new ckn();
   private final ckm[] bQ;
   public final ckm c;
   private final ckm bR;
   private final ckm bS;
   private final ckm bT;
   private final ckm bU;
   private final ckm bV;
   private final ckm bW;
   private final ckm bX;
   public float d;
   public float bE;
   public boolean bF;
   public int bG;
   public float bH;
   @Nullable
   public cko bI;
   @Nullable
   private ebp bY;
   private ji bZ = ji.c;
   private final clg ca;
   private int cb = 100;
   private float cc;
   private final eui[] cd = new eui[24];
   private final int[] ce = new int[24];
   private final eug cf = new eug();

   public ckp(bvi<? extends ckp> $$0, dgz $$1) {
      super(bvi.P, $$1);
      this.c = new ckm(this, "head", 1.0F, 1.0F);
      this.bR = new ckm(this, "neck", 3.0F, 3.0F);
      this.bS = new ckm(this, "body", 5.0F, 3.0F);
      this.bT = new ckm(this, "tail", 2.0F, 2.0F);
      this.bU = new ckm(this, "tail", 2.0F, 2.0F);
      this.bV = new ckm(this, "tail", 2.0F, 2.0F);
      this.bW = new ckm(this, "wing", 4.0F, 2.0F);
      this.bX = new ckm(this, "wing", 4.0F, 2.0F);
      this.bQ = new ckm[]{this.c, this.bR, this.bS, this.bT, this.bU, this.bV, this.bW, this.bX};
      this.d(this.eS());
      this.ad = true;
      this.ca = new clg(this);
   }

   public void a(ebp $$0) {
      this.bY = $$0;
   }

   @Override
   public void c(ji $$0) {
      this.bZ = $$0;
   }

   public ji j() {
      return this.bZ;
   }

   public static bxf.a m() {
      return bwa.E().a(bxg.s, 200.0);
   }

   @Override
   public boolean ba() {
      float $$0 = ayz.b(this.bE * (float) (Math.PI * 2));
      float $$1 = ayz.b(this.d * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aZ() {
      if (this.dU().C && !this.bb()) {
         this.dU().a(this.dz(), this.dB(), this.dF(), awa.iy, this.dl(), 5.0F, 0.8F + this.ae.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, clf.k.b());
   }

   @Override
   public void k_() {
      this.aO();
      if (this.dU().C) {
         this.d(this.eE());
         if (!this.bb() && !this.ca.a().a() && --this.cb < 0) {
            this.dU().a(this.dz(), this.dB(), this.dF(), awa.iz, this.dl(), 2.5F, 0.8F + this.ae.i() * 0.3F, false);
            this.cb = 200 + this.ae.a(200);
         }
      }

      if (this.bY == null && this.dU() instanceof ard $$0) {
         ebp $$1 = $$0.F();
         if ($$1 != null && this.cF().equals($$1.i())) {
            this.bY = $$1;
         }
      }

      this.d = this.bE;
      if (this.eF()) {
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         float $$3 = (this.ae.i() - 0.5F) * 4.0F;
         float $$4 = (this.ae.i() - 0.5F) * 8.0F;
         this.dU().a(lt.w, this.dz() + (double)$$2, this.dB() + 2.0 + (double)$$3, this.dF() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gp();
         fbx $$5 = this.dx();
         float $$6 = 0.2F / ((float)$$5.i() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.e);
         if (this.ca.a().a()) {
            this.bE += 0.1F;
         } else if (this.bF) {
            this.bE += $$6 * 0.5F;
         } else {
            this.bE += $$6;
         }

         this.w(ayz.h(this.dK()));
         if (this.gh()) {
            this.bE = 0.5F;
         } else {
            this.b.a(this.dB(), this.dK());
            if (this.dU() instanceof ard $$7) {
               ckz $$9 = this.ca.a();
               $$9.a($$7);
               if (this.ca.a() != $$9) {
                  $$9 = this.ca.a();
                  $$9.a($$7);
               }

               fbx $$10 = $$9.f();
               if ($$10 != null) {
                  double $$11 = $$10.d - this.dz();
                  double $$12 = $$10.e - this.dB();
                  double $$13 = $$10.f - this.dF();
                  double $$14 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
                  float $$15 = $$9.e();
                  double $$16 = Math.sqrt($$11 * $$11 + $$13 * $$13);
                  if ($$16 > 0.0) {
                     $$12 = ayz.a($$12 / $$16, (double)(-$$15), (double)$$15);
                  }

                  this.i(this.dx().b(0.0, $$12 * 0.01, 0.0));
                  this.w(ayz.h(this.dK()));
                  fbx $$17 = $$10.a(this.dz(), this.dB(), this.dF()).d();
                  fbx $$18 = new fbx((double)ayz.a(this.dK() * (float) (Math.PI / 180.0)), this.dx().e, (double)(-ayz.b(this.dK() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$19 = Math.max(((float)$$18.b($$17) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$11) > 1.0E-5F || Math.abs($$13) > 1.0E-5F) {
                     float $$20 = ayz.a(ayz.h(180.0F - (float)ayz.d($$11, $$13) * (180.0F / (float)Math.PI) - this.dK()), -50.0F, 50.0F);
                     this.bH *= 0.8F;
                     this.bH = this.bH + $$20 * $$9.g();
                     this.w(this.dK() + this.bH * 0.1F);
                  }

                  float $$21 = (float)(2.0 / ($$14 + 1.0));
                  float $$22 = 0.06F;
                  this.a(0.06F * ($$19 * $$21 + (1.0F - $$21)), new fbx(0.0, 0.0, -1.0));
                  if (this.bF) {
                     this.a(bwc.a, this.dx().c(0.8F));
                  } else {
                     this.a(bwc.a, this.dx());
                  }

                  fbx $$23 = this.dx().d();
                  double $$24 = 0.8 + 0.15 * ($$23.b($$18) + 1.0) / 2.0;
                  this.i(this.dx().d($$24, 0.91F, $$24));
               }
            } else {
               this.bj.e();
               this.ca.a().b();
            }

            if (!this.dU().w_()) {
               this.aK();
            }

            this.aV = this.dK();
            fbx[] $$25 = new fbx[this.bQ.length];

            for (int $$26 = 0; $$26 < this.bQ.length; $$26++) {
               $$25[$$26] = new fbx(this.bQ[$$26].dz(), this.bQ[$$26].dB(), this.bQ[$$26].dF());
            }

            float $$27 = (float)(this.b.a(5).a() - this.b.a(10).a()) * 10.0F * (float) (Math.PI / 180.0);
            float $$28 = ayz.b($$27);
            float $$29 = ayz.a($$27);
            float $$30 = this.dK() * (float) (Math.PI / 180.0);
            float $$31 = ayz.a($$30);
            float $$32 = ayz.b($$30);
            this.a(this.bS, (double)($$31 * 0.5F), 0.0, (double)(-$$32 * 0.5F));
            this.a(this.bW, (double)($$32 * 4.5F), 2.0, (double)($$31 * 4.5F));
            this.a(this.bX, (double)($$32 * -4.5F), 2.0, (double)($$31 * -4.5F));
            if (this.dU() instanceof ard $$33 && this.aN == 0) {
               this.a($$33, $$33.a(this, this.bW.cQ().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bvg.e));
               this.a($$33, $$33.a(this, this.bX.cQ().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bvg.e));
               this.b($$33, $$33.a(this, this.c.cQ().g(1.0), bvg.e));
               this.b($$33, $$33.a(this, this.bR.cQ().g(1.0), bvg.e));
            }

            float $$34 = ayz.a(this.dK() * (float) (Math.PI / 180.0) - this.bH * 0.01F);
            float $$35 = ayz.b(this.dK() * (float) (Math.PI / 180.0) - this.bH * 0.01F);
            float $$36 = this.go();
            this.a(this.c, (double)($$34 * 6.5F * $$28), (double)($$36 + $$29 * 6.5F), (double)(-$$35 * 6.5F * $$28));
            this.a(this.bR, (double)($$34 * 5.5F * $$28), (double)($$36 + $$29 * 5.5F), (double)(-$$35 * 5.5F * $$28));
            ckn.a $$37 = this.b.a(5);

            for (int $$38 = 0; $$38 < 3; $$38++) {
               ckm $$39 = null;
               if ($$38 == 0) {
                  $$39 = this.bT;
               }

               if ($$38 == 1) {
                  $$39 = this.bU;
               }

               if ($$38 == 2) {
                  $$39 = this.bV;
               }

               ckn.a $$40 = this.b.a(12 + $$38 * 2);
               float $$41 = this.dK() * (float) (Math.PI / 180.0) + this.i((double)($$40.b() - $$37.b())) * (float) (Math.PI / 180.0);
               float $$42 = ayz.a($$41);
               float $$43 = ayz.b($$41);
               float $$44 = 1.5F;
               float $$45 = (float)($$38 + 1) * 2.0F;
               this.a(
                  $$39,
                  (double)(-($$31 * 1.5F + $$42 * $$45) * $$28),
                  $$40.a() - $$37.a() - (double)(($$45 + 1.5F) * $$29) + 1.5,
                  (double)(($$32 * 1.5F + $$43 * $$45) * $$28)
               );
            }

            if (this.dU() instanceof ard $$46) {
               this.bF = this.a($$46, this.c.cQ()) | this.a($$46, this.bR.cQ()) | this.a($$46, this.bS.cQ());
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

   private void a(ckm $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dz() + $$1, this.dB() + $$2, this.dF() + $$3);
   }

   private float go() {
      if (this.ca.a().a()) {
         return -1.0F;
      } else {
         ckn.a $$0 = this.b.a(5);
         ckn.a $$1 = this.b.a(0);
         return (float)($$0.a() - $$1.a());
      }
   }

   private void gp() {
      if (this.bI != null) {
         if (this.bI.dP()) {
            this.bI = null;
         } else if (this.af % 10 == 0 && this.eE() < this.eS()) {
            this.d(this.eE() + 1.0F);
         }
      }

      if (this.ae.a(10) == 0) {
         List<cko> $$0 = this.dU().a(cko.class, this.cQ().g(32.0));
         cko $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cko $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.bI = $$1;
      }
   }

   private void a(ard $$0, List<bva> $$1) {
      double $$2 = (this.bS.cQ().a + this.bS.cQ().d) / 2.0;
      double $$3 = (this.bS.cQ().c + this.bS.cQ().f) / 2.0;

      for (bva $$4 : $$1) {
         if ($$4 instanceof bvy) {
            bvy $$5 = (bvy)$$4;
            double $$6 = $$4.dz() - $$2;
            double $$7 = $$4.dF() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.j($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.ca.a().a() && $$5.er() < $$4.af - 2) {
               btp $$9 = this.dV().b((bvy)this);
               $$4.a($$0, $$9, 5.0F);
               ddt.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(ard $$0, List<bva> $$1) {
      for (bva $$2 : $$1) {
         if ($$2 instanceof bvy) {
            btp $$3 = this.dV().b((bvy)this);
            $$2.a($$0, $$3, 10.0F);
            ddt.a($$0, $$2, $$3);
         }
      }
   }

   private float i(double $$0) {
      return (float)ayz.d($$0);
   }

   private boolean a(ard $$0, fbs $$1) {
      int $$2 = ayz.a($$1.a);
      int $$3 = ayz.a($$1.b);
      int $$4 = ayz.a($$1.c);
      int $$5 = ayz.a($$1.d);
      int $$6 = ayz.a($$1.e);
      int $$7 = ayz.a($$1.f);
      boolean $$8 = false;
      boolean $$9 = false;

      for (int $$10 = $$2; $$10 <= $$5; $$10++) {
         for (int $$11 = $$3; $$11 <= $$6; $$11++) {
            for (int $$12 = $$4; $$12 <= $$7; $$12++) {
               ji $$13 = new ji($$10, $$11, $$12);
               dxq $$14 = $$0.a_($$13);
               if (!$$14.l() && !$$14.a(awp.aG)) {
                  if ($$0.O().b(dgv.c) && !$$14.a(awp.aF)) {
                     $$9 = $$0.a($$13, false) || $$9;
                  } else {
                     $$8 = true;
                  }
               }
            }
         }
      }

      if ($$9) {
         ji $$15 = new ji($$2 + this.ae.a($$5 - $$2 + 1), $$3 + this.ae.a($$6 - $$3 + 1), $$4 + this.ae.a($$7 - $$4 + 1));
         $$0.c(2008, $$15, 0);
      }

      return $$8;
   }

   public boolean a(ard $$0, ckm $$1, btp $$2, float $$3) {
      if (this.ca.a().h() == clf.j) {
         return false;
      } else {
         $$3 = this.ca.a().a($$2, $$3);
         if ($$1 != this.c) {
            $$3 = $$3 / 4.0F + Math.min($$3, 1.0F);
         }

         if ($$3 < 0.01F) {
            return false;
         } else {
            if ($$2.d() instanceof cpr || $$2.a(awr.y)) {
               float $$4 = this.eE();
               this.c($$0, $$2, $$3);
               if (this.eF() && !this.ca.a().a()) {
                  this.d(1.0F);
                  this.ca.a(clf.j);
               }

               if (this.ca.a().a()) {
                  this.cc = this.cc + $$4 - this.eE();
                  if (this.cc > 0.25F * this.eS()) {
                     this.cc = 0.0F;
                     this.ca.a(clf.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      return this.a($$0, this.bS, $$1, $$2);
   }

   protected void c(ard $$0, btp $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }

   @Override
   public void c(ard $$0) {
      this.a(bva.d.a);
      this.a(ecp.p);
      if (this.bY != null) {
         this.bY.b(this);
         this.bY.a(this);
      }
   }

   @Override
   protected void el() {
      if (this.bY != null) {
         this.bY.b(this);
      }

      this.bG++;
      if (this.bG >= 180 && this.bG <= 200) {
         float $$0 = (this.ae.i() - 0.5F) * 8.0F;
         float $$1 = (this.ae.i() - 0.5F) * 4.0F;
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         this.dU().a(lt.v, this.dz() + (double)$$0, this.dB() + 2.0 + (double)$$1, this.dF() + (double)$$2, 0.0, 0.0, 0.0);
      }

      int $$3 = 500;
      if (this.bY != null && !this.bY.f()) {
         $$3 = 12000;
      }

      if (this.dU() instanceof ard $$4) {
         if (this.bG > 150 && this.bG % 5 == 0 && $$4.O().b(dgv.f)) {
            bvn.a($$4, this.ds(), ayz.d((float)$$3 * 0.08F));
         }

         if (this.bG == 1 && !this.bb()) {
            $$4.b(1028, this.du(), 0);
         }
      }

      fbx $$5 = new fbx(0.0, 0.1F, 0.0);
      this.a(bwc.a, $$5);

      for (ckm $$6 : this.bQ) {
         $$6.bx();
         $$6.b($$6.ds().e($$5));
      }

      if (this.bG == 200 && this.dU() instanceof ard $$7) {
         if ($$7.O().b(dgv.f)) {
            bvn.a($$7, this.ds(), ayz.d((float)$$3 * 0.2F));
         }

         if (this.bY != null) {
            this.bY.a(this);
         }

         this.a(bva.d.a);
         this.a(ecp.p);
      }
   }

   public int n() {
      if (this.cd[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = ayz.d(60.0F * ayz.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = ayz.d(60.0F * ayz.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = ayz.d(40.0F * ayz.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = ayz.d(40.0F * ayz.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = ayz.d(20.0F * ayz.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = ayz.d(20.0F * ayz.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(73, this.dU().a(edo.a.f, new ji($$3, 0, $$4)).v() + $$1);
            this.cd[$$0] = new eui($$3, $$9, $$4);
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

      return this.q(this.dz(), this.dB(), this.dF());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      eui $$5 = new eui(ayz.a($$0), ayz.a($$1), ayz.a($$2));
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
   public euk a(int $$0, int $$1, @Nullable eui $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         eui $$4 = this.cd[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      eui $$5 = this.cd[$$0];
      eui $$6 = this.cd[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cf.a();
      this.cf.a($$5);
      eui $$7 = $$5;
      int $$8 = 0;
      if (this.bY == null || this.bY.e() == 0) {
         $$8 = 12;
      }

      while (!this.cf.e()) {
         eui $$9 = this.cf.c();
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
               eui $$13 = this.cd[$$12];
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

   private euk a(eui $$0, eui $$1) {
      List<eui> $$2 = Lists.newArrayList();
      eui $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new euk($$2, new ji($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.ca.a().h().b());
      $$0.a("DragonDeathTime", this.bG);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.ca.a(clf.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bG = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dG() {
   }

   public ckm[] q() {
      return this.bQ;
   }

   @Override
   public boolean bF() {
      return false;
   }

   @Override
   public awb dl() {
      return awb.f;
   }

   @Override
   protected avz u() {
      return awa.iv;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.iA;
   }

   @Override
   protected float fg() {
      return 5.0F;
   }

   public fbx K(float $$0) {
      ckz $$1 = this.ca.a();
      clf<? extends ckz> $$2 = $$1.h();
      fbx $$8;
      if ($$2 == clf.d || $$2 == clf.e) {
         ji $$3 = this.dU().a(edo.a.f, egt.a(this.bZ));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.ds())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dM();
         float $$7 = 1.5F;
         this.x(-$$5 * 1.5F * 5.0F);
         $$8 = this.h($$0);
         this.x($$6);
      } else if ($$1.a()) {
         float $$9 = this.dM();
         float $$10 = 1.5F;
         this.x(-45.0F);
         $$8 = this.h($$0);
         this.x($$9);
      } else {
         $$8 = this.h($$0);
      }

      return $$8;
   }

   public void a(ard $$0, cko $$1, ji $$2, btp $$3) {
      cpr $$5;
      if ($$3.d() instanceof cpr $$4) {
         $$5 = $$4;
      } else {
         $$5 = $$0.a(bK, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
      }

      if ($$1 == this.bI) {
         this.a($$0, this.c, this.dV().d($$1, $$5), 10.0F);
      }

      this.ca.a().a($$1, $$2, $$3, $$5);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (a.equals($$0) && this.dU().C) {
         this.ca.a(clf.a(this.au().a(a)));
      }

      super.a($$0);
   }

   public clg t() {
      return this.ca;
   }

   @Nullable
   public ebp x() {
      return this.bY;
   }

   @Override
   public boolean b(bue $$0, @Nullable bva $$1) {
      return false;
   }

   @Override
   protected boolean o(bva $$0) {
      return false;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      ckm[] $$1 = this.q();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b() + 1);
      }
   }

   @Override
   public boolean c(bvy $$0) {
      return $$0.ex();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
