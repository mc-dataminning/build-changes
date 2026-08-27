import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cha extends bsq implements ciu {
   private static final Logger cm = LogUtils.getLogger();
   public static final ajy<Integer> b = akc.a(cha.class, aka.b);
   private static final cde cn = cde.a().a(64.0);
   private static final int co = 200;
   private static final int cp = 400;
   private static final float cq = 0.25F;
   private static final String cr = "DragonDeathTime";
   private static final String cs = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final cgy[] ct;
   public final cgy e;
   private final cgy cu;
   private final cgy cv;
   private final cgy cw;
   private final cgy cx;
   private final cgy cy;
   private final cgy cz;
   private final cgy cA;
   public float cg;
   public float ch;
   public boolean ci;
   public int cj;
   public float ck;
   @Nullable
   public cgz cl;
   @Nullable
   private dwx cB;
   private ir cC = ir.c;
   private final chr cD;
   private int cE = 100;
   private float cF;
   private final epq[] cG = new epq[24];
   private final int[] cH = new int[24];
   private final epo cI = new epo();

   public cha(bsb<? extends cha> $$0, dca $$1) {
      super(bsb.H, $$1);
      this.e = new cgy(this, "head", 1.0F, 1.0F);
      this.cu = new cgy(this, "neck", 3.0F, 3.0F);
      this.cv = new cgy(this, "body", 5.0F, 3.0F);
      this.cw = new cgy(this, "tail", 2.0F, 2.0F);
      this.cx = new cgy(this, "tail", 2.0F, 2.0F);
      this.cy = new cgy(this, "tail", 2.0F, 2.0F);
      this.cz = new cgy(this, "wing", 4.0F, 2.0F);
      this.cA = new cgy(this, "wing", 4.0F, 2.0F);
      this.ct = new cgy[]{this.e, this.cu, this.cv, this.cw, this.cx, this.cy, this.cz, this.cA};
      this.t(this.eZ());
      this.ah = true;
      this.ay = true;
      this.cD = new chr(this);
   }

   public void a(dwx $$0) {
      this.cB = $$0;
   }

   @Override
   public void d(ir $$0) {
      this.cC = $$0;
   }

   public ir r() {
      return this.cC;
   }

   public static btu.a t() {
      return bsq.A().a(btv.q, 200.0);
   }

   @Override
   public boolean aZ() {
      float $$0 = aym.b(this.ch * (float) (Math.PI * 2));
      float $$1 = aym.b(this.cg * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aY() {
      if (this.dU().C && !this.ba()) {
         this.dU().a(this.dz(), this.dB(), this.dF(), avo.iq, this.dj(), 5.0F, 0.8F + this.al.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, chq.k.b());
   }

   public double[] a(int $$0, float $$1) {
      if (this.eJ()) {
         $$1 = 0.0F;
      }

      $$1 = 1.0F - $$1;
      int $$2 = this.d - $$0 & 63;
      int $$3 = this.d - $$0 - 1 & 63;
      double[] $$4 = new double[3];
      double $$5 = this.c[$$2][0];
      double $$6 = aym.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = aym.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void m_() {
      this.aL();
      if (this.dU().C) {
         this.t(this.eI());
         if (!this.ba() && !this.cD.a().a() && --this.cE < 0) {
            this.dU().a(this.dz(), this.dB(), this.dF(), avo.ir, this.dj(), 2.5F, 0.8F + this.al.i() * 0.3F, false);
            this.cE = 200 + this.al.a(200);
         }
      }

      if (this.cB == null && this.dU() instanceof aqt $$0) {
         dwx $$1 = $$0.D();
         if ($$1 != null && this.cE().equals($$1.i())) {
            this.cB = $$1;
         }
      }

      this.cg = this.ch;
      if (this.eJ()) {
         float $$2 = (this.al.i() - 0.5F) * 8.0F;
         float $$3 = (this.al.i() - 0.5F) * 4.0F;
         float $$4 = (this.al.i() - 0.5F) * 8.0F;
         this.dU().a(lb.w, this.dz() + (double)$$2, this.dB() + 2.0 + (double)$$3, this.dF() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gy();
         ewu $$5 = this.dx();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.cD.a().a()) {
            this.ch += 0.1F;
         } else if (this.ci) {
            this.ch += $$6 * 0.5F;
         } else {
            this.ch += $$6;
         }

         this.r(aym.g(this.dK()));
         if (this.go()) {
            this.ch = 0.5F;
         } else {
            if (this.d < 0) {
               for (int $$7 = 0; $$7 < this.c.length; $$7++) {
                  this.c[$$7][0] = (double)this.dK();
                  this.c[$$7][1] = this.dB();
               }
            }

            if (++this.d == this.c.length) {
               this.d = 0;
            }

            this.c[this.d][0] = (double)this.dK();
            this.c[this.d][1] = this.dB();
            if (this.dU().C) {
               if (this.bC > 0) {
                  this.a(this.bC, this.bD, this.bE, this.bF, this.bG, this.bH);
                  this.bC--;
               }

               this.cD.a().b();
            } else {
               chk $$8 = this.cD.a();
               $$8.c();
               if (this.cD.a() != $$8) {
                  $$8 = this.cD.a();
                  $$8.c();
               }

               ewu $$9 = $$8.g();
               if ($$9 != null) {
                  double $$10 = $$9.c - this.dz();
                  double $$11 = $$9.d - this.dB();
                  double $$12 = $$9.e - this.dF();
                  double $$13 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  float $$14 = $$8.f();
                  double $$15 = Math.sqrt($$10 * $$10 + $$12 * $$12);
                  if ($$15 > 0.0) {
                     $$11 = aym.a($$11 / $$15, (double)(-$$14), (double)$$14);
                  }

                  this.g(this.dx().b(0.0, $$11 * 0.01, 0.0));
                  this.r(aym.g(this.dK()));
                  ewu $$16 = $$9.a(this.dz(), this.dB(), this.dF()).d();
                  ewu $$17 = new ewu((double)aym.a(this.dK() * (float) (Math.PI / 180.0)), this.dx().d, (double)(-aym.b(this.dK() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$18 = Math.max(((float)$$17.b($$16) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$10) > 1.0E-5F || Math.abs($$12) > 1.0E-5F) {
                     float $$19 = aym.a(aym.g(180.0F - (float)aym.d($$10, $$12) * (180.0F / (float)Math.PI) - this.dK()), -50.0F, 50.0F);
                     this.ck *= 0.8F;
                     this.ck = this.ck + $$19 * $$8.h();
                     this.r(this.dK() + this.ck * 0.1F);
                  }

                  float $$20 = (float)(2.0 / ($$13 + 1.0));
                  float $$21 = 0.06F;
                  this.a(0.06F * ($$18 * $$20 + (1.0F - $$20)), new ewu(0.0, 0.0, -1.0));
                  if (this.ci) {
                     this.a(bst.a, this.dx().a(0.8F));
                  } else {
                     this.a(bst.a, this.dx());
                  }

                  ewu $$22 = this.dx().d();
                  double $$23 = 0.8 + 0.15 * ($$22.b($$17) + 1.0) / 2.0;
                  this.g(this.dx().d($$23, 0.91F, $$23));
               }
            }

            this.bj = this.dK();
            ewu[] $$24 = new ewu[this.ct.length];

            for (int $$25 = 0; $$25 < this.ct.length; $$25++) {
               $$24[$$25] = new ewu(this.ct[$$25].dz(), this.ct[$$25].dB(), this.ct[$$25].dF());
            }

            float $$26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$27 = aym.b($$26);
            float $$28 = aym.a($$26);
            float $$29 = this.dK() * (float) (Math.PI / 180.0);
            float $$30 = aym.a($$29);
            float $$31 = aym.b($$29);
            this.a(this.cv, (double)($$30 * 0.5F), 0.0, (double)(-$$31 * 0.5F));
            this.a(this.cz, (double)($$31 * 4.5F), 2.0, (double)($$30 * 4.5F));
            this.a(this.cA, (double)($$31 * -4.5F), 2.0, (double)($$30 * -4.5F));
            if (!this.dU().C && this.aZ == 0) {
               this.b(this.dU().a(this, this.cz.cP().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bsa.e));
               this.b(this.dU().a(this, this.cA.cP().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bsa.e));
               this.c(this.dU().a(this, this.e.cP().g(1.0), bsa.e));
               this.c(this.dU().a(this, this.cu.cP().g(1.0), bsa.e));
            }

            float $$32 = aym.a(this.dK() * (float) (Math.PI / 180.0) - this.ck * 0.01F);
            float $$33 = aym.b(this.dK() * (float) (Math.PI / 180.0) - this.ck * 0.01F);
            float $$34 = this.gx();
            this.a(this.e, (double)($$32 * 6.5F * $$27), (double)($$34 + $$28 * 6.5F), (double)(-$$33 * 6.5F * $$27));
            this.a(this.cu, (double)($$32 * 5.5F * $$27), (double)($$34 + $$28 * 5.5F), (double)(-$$33 * 5.5F * $$27));
            double[] $$35 = this.a(5, 1.0F);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               cgy $$37 = null;
               if ($$36 == 0) {
                  $$37 = this.cw;
               }

               if ($$36 == 1) {
                  $$37 = this.cx;
               }

               if ($$36 == 2) {
                  $$37 = this.cy;
               }

               double[] $$38 = this.a(12 + $$36 * 2, 1.0F);
               float $$39 = this.dK() * (float) (Math.PI / 180.0) + this.i($$38[0] - $$35[0]) * (float) (Math.PI / 180.0);
               float $$40 = aym.a($$39);
               float $$41 = aym.b($$39);
               float $$42 = 1.5F;
               float $$43 = (float)($$36 + 1) * 2.0F;
               this.a(
                  $$37,
                  (double)(-($$30 * 1.5F + $$40 * $$43) * $$27),
                  $$38[1] - $$35[1] - (double)(($$43 + 1.5F) * $$28) + 1.5,
                  (double)(($$31 * 1.5F + $$41 * $$43) * $$27)
               );
            }

            if (!this.dU().C) {
               this.ci = this.b(this.e.cP()) | this.b(this.cu.cP()) | this.b(this.cv.cP());
               if (this.cB != null) {
                  this.cB.b(this);
               }
            }

            for (int $$44 = 0; $$44 < this.ct.length; $$44++) {
               this.ct[$$44].M = $$24[$$44].c;
               this.ct[$$44].N = $$24[$$44].d;
               this.ct[$$44].O = $$24[$$44].e;
               this.ct[$$44].ae = $$24[$$44].c;
               this.ct[$$44].af = $$24[$$44].d;
               this.ct[$$44].ag = $$24[$$44].e;
            }
         }
      }
   }

   private void a(cgy $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dz() + $$1, this.dB() + $$2, this.dF() + $$3);
   }

   private float gx() {
      if (this.cD.a().a()) {
         return -1.0F;
      } else {
         double[] $$0 = this.a(5, 1.0F);
         double[] $$1 = this.a(0, 1.0F);
         return (float)($$0[1] - $$1[1]);
      }
   }

   private void gy() {
      if (this.cl != null) {
         if (this.cl.dP()) {
            this.cl = null;
         } else if (this.am % 10 == 0 && this.eI() < this.eZ()) {
            this.t(this.eI() + 1.0F);
         }
      }

      if (this.al.a(10) == 0) {
         List<cgz> $$0 = this.dU().a(cgz.class, this.cP().g(32.0));
         cgz $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cgz $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.cl = $$1;
      }
   }

   private void b(List<brv> $$0) {
      double $$1 = (this.cv.cP().a + this.cv.cP().d) / 2.0;
      double $$2 = (this.cv.cP().c + this.cv.cP().f) / 2.0;

      for (brv $$3 : $$0) {
         if ($$3 instanceof bso) {
            double $$4 = $$3.dz() - $$1;
            double $$5 = $$3.dF() - $$2;
            double $$6 = Math.max($$4 * $$4 + $$5 * $$5, 0.1);
            $$3.j($$4 / $$6 * 4.0, 0.2F, $$5 / $$6 * 4.0);
            if (!this.cD.a().a() && ((bso)$$3).ev() < $$3.am - 2) {
               $$3.a(this.dX().b((bso)this), 5.0F);
               this.a(this, $$3);
            }
         }
      }
   }

   private void c(List<brv> $$0) {
      for (brv $$1 : $$0) {
         if ($$1 instanceof bso) {
            $$1.a(this.dX().b((bso)this), 10.0F);
            this.a(this, $$1);
         }
      }
   }

   private float i(double $$0) {
      return (float)aym.d($$0);
   }

   private boolean b(ewp $$0) {
      int $$1 = aym.a($$0.a);
      int $$2 = aym.a($$0.b);
      int $$3 = aym.a($$0.c);
      int $$4 = aym.a($$0.d);
      int $$5 = aym.a($$0.e);
      int $$6 = aym.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               ir $$12 = new ir($$9, $$10, $$11);
               dtc $$13 = this.dU().a_($$12);
               if (!$$13.i() && !$$13.a(awe.aE)) {
                  if (this.dU().ab().b(dbw.c) && !$$13.a(awe.aD)) {
                     $$8 = this.dU().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         ir $$14 = new ir($$1 + this.al.a($$4 - $$1 + 1), $$2 + this.al.a($$5 - $$2 + 1), $$3 + this.al.a($$6 - $$3 + 1));
         this.dU().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(cgy $$0, bqt $$1, float $$2) {
      if (this.cD.a().i() == chq.j) {
         return false;
      } else {
         $$2 = this.cD.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cly || $$1.a(awg.z)) {
               float $$3 = this.eI();
               this.g($$1, $$2);
               if (this.eJ() && !this.cD.a().a()) {
                  this.t(1.0F);
                  this.cD.a(chq.j);
               }

               if (this.cD.a().a()) {
                  this.cF = this.cF + $$3 - this.eI();
                  if (this.cF > 0.25F * this.eZ()) {
                     this.cF = 0.0F;
                     this.cD.a(chq.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      return !this.dU().C ? this.a(this.cv, $$0, $$1) : false;
   }

   protected boolean g(bqt $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void an() {
      this.a(brv.d.a);
      this.a(dxv.p);
      if (this.cB != null) {
         this.cB.b(this);
         this.cB.a(this);
      }
   }

   @Override
   protected void eo() {
      if (this.cB != null) {
         this.cB.b(this);
      }

      this.cj++;
      if (this.cj >= 180 && this.cj <= 200) {
         float $$0 = (this.al.i() - 0.5F) * 8.0F;
         float $$1 = (this.al.i() - 0.5F) * 4.0F;
         float $$2 = (this.al.i() - 0.5F) * 8.0F;
         this.dU().a(lb.v, this.dz() + (double)$$0, this.dB() + 2.0 + (double)$$1, this.dF() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dU().ab().b(dbw.f);
      int $$4 = 500;
      if (this.cB != null && !this.cB.f()) {
         $$4 = 12000;
      }

      if (this.dU() instanceof aqt) {
         if (this.cj > 150 && this.cj % 5 == 0 && $$3) {
            bse.a((aqt)this.dU(), this.ds(), aym.d((float)$$4 * 0.08F));
         }

         if (this.cj == 1 && !this.ba()) {
            this.dU().b(1028, this.du(), 0);
         }
      }

      this.a(bst.a, new ewu(0.0, 0.1F, 0.0));
      if (this.cj == 200 && this.dU() instanceof aqt) {
         if ($$3) {
            bse.a((aqt)this.dU(), this.ds(), aym.d((float)$$4 * 0.2F));
         }

         if (this.cB != null) {
            this.cB.a(this);
         }

         this.a(brv.d.a);
         this.a(dxv.p);
      }
   }

   public int x() {
      if (this.cG[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = aym.d(60.0F * aym.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = aym.d(60.0F * aym.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = aym.d(40.0F * aym.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = aym.d(40.0F * aym.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = aym.d(20.0F * aym.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = aym.d(20.0F * aym.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.dU().A_() + 10, this.dU().a(dyu.a.f, new ir($$3, 0, $$4)).v() + $$1);
            this.cG[$$0] = new epq($$3, $$9, $$4);
         }

         this.cH[0] = 6146;
         this.cH[1] = 8197;
         this.cH[2] = 8202;
         this.cH[3] = 16404;
         this.cH[4] = 32808;
         this.cH[5] = 32848;
         this.cH[6] = 65696;
         this.cH[7] = 131392;
         this.cH[8] = 131712;
         this.cH[9] = 263424;
         this.cH[10] = 526848;
         this.cH[11] = 525313;
         this.cH[12] = 1581057;
         this.cH[13] = 3166214;
         this.cH[14] = 2138120;
         this.cH[15] = 6373424;
         this.cH[16] = 4358208;
         this.cH[17] = 12910976;
         this.cH[18] = 9044480;
         this.cH[19] = 9706496;
         this.cH[20] = 15216640;
         this.cH[21] = 13688832;
         this.cH[22] = 11763712;
         this.cH[23] = 8257536;
      }

      return this.r(this.dz(), this.dB(), this.dF());
   }

   public int r(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      epq $$5 = new epq(aym.a($$0), aym.a($$1), aym.a($$2));
      int $$6 = 0;
      if (this.cB == null || this.cB.e() == 0) {
         $$6 = 12;
      }

      for (int $$7 = $$6; $$7 < 24; $$7++) {
         if (this.cG[$$7] != null) {
            float $$8 = this.cG[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public eps a(int $$0, int $$1, @Nullable epq $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         epq $$4 = this.cG[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      epq $$5 = this.cG[$$0];
      epq $$6 = this.cG[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cI.a();
      this.cI.a($$5);
      epq $$7 = $$5;
      int $$8 = 0;
      if (this.cB == null || this.cB.e() == 0) {
         $$8 = 12;
      }

      while (!this.cI.e()) {
         epq $$9 = this.cI.c();
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
            if (this.cG[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for (int $$12 = $$8; $$12 < 24; $$12++) {
            if ((this.cH[$$10] & 1 << $$12) > 0) {
               epq $$13 = this.cG[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.cI.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.cI.a($$13);
                     }
                  }
               }
            }
         }
      }

      if ($$7 == $$5) {
         return null;
      } else {
         cm.debug("Failed to find path from {} to {}", $$0, $$1);
         if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
         }

         return this.a($$5, $$7);
      }
   }

   private eps a(epq $$0, epq $$1) {
      List<epq> $$2 = Lists.newArrayList();
      epq $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new eps($$2, new ir($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cD.a().i().b());
      $$0.a("DragonDeathTime", this.cj);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cD.a(chq.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.cj = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dG() {
   }

   public cgy[] gu() {
      return this.ct;
   }

   @Override
   public boolean bE() {
      return false;
   }

   @Override
   public avq dj() {
      return avq.f;
   }

   @Override
   protected avn u() {
      return avo.in;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.is;
   }

   @Override
   protected float fn() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      chk $$3 = this.cD.a();
      chq<? extends chk> $$4 = $$3.i();
      double $$7;
      if ($$4 == chq.d || $$4 == chq.e) {
         ir $$5 = this.dU().a(dyu.a.f, ebz.a(this.cC));
         double $$6 = Math.max(Math.sqrt($$5.b(this.ds())) / 4.0, 1.0);
         $$7 = (double)$$0 / $$6;
      } else if ($$3.a()) {
         $$7 = (double)$$0;
      } else if ($$0 == 6) {
         $$7 = 0.0;
      } else {
         $$7 = $$2[1] - $$1[1];
      }

      return (float)$$7;
   }

   public ewu F(float $$0) {
      chk $$1 = this.cD.a();
      chq<? extends chk> $$2 = $$1.i();
      ewu $$8;
      if ($$2 == chq.d || $$2 == chq.e) {
         ir $$3 = this.dU().a(dyu.a.f, ebz.a(this.cC));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.ds())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dM();
         float $$7 = 1.5F;
         this.s(-$$5 * 1.5F * 5.0F);
         $$8 = this.f($$0);
         this.s($$6);
      } else if ($$1.a()) {
         float $$9 = this.dM();
         float $$10 = 1.5F;
         this.s(-45.0F);
         $$8 = this.f($$0);
         this.s($$9);
      } else {
         $$8 = this.f($$0);
      }

      return $$8;
   }

   public void a(cgz $$0, ir $$1, bqt $$2) {
      cly $$3;
      if ($$2.d() instanceof cly) {
         $$3 = (cly)$$2.d();
      } else {
         $$3 = this.dU().a(cn, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.cl) {
         this.a(this.e, this.dX().d($$0, $$3), 10.0F);
      }

      this.cD.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (b.equals($$0) && this.dU().C) {
         this.cD.a(chq.a(this.ap().a(b)));
      }

      super.a($$0);
   }

   public chr gv() {
      return this.cD;
   }

   @Nullable
   public dwx gw() {
      return this.cB;
   }

   @Override
   public boolean b(brh $$0, @Nullable brv $$1) {
      return false;
   }

   @Override
   protected boolean o(brv $$0) {
      return false;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      cgy[] $$1 = this.gu();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b());
      }
   }

   @Override
   public boolean c(bso $$0) {
      return $$0.eB();
   }
}
