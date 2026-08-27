import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ccq extends bok implements cej {
   private static final Logger bY = LogUtils.getLogger();
   public static final aie<Integer> b = aih.a(ccq.class, aig.b);
   private static final byy bZ = byy.a().a(64.0);
   private static final int ca = 200;
   private static final int cb = 400;
   private static final float cc = 0.25F;
   private static final String cd = "DragonDeathTime";
   private static final String ce = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final cco[] cf;
   public final cco e;
   private final cco cg;
   private final cco ch;
   private final cco ci;
   private final cco cj;
   private final cco ck;
   private final cco cl;
   private final cco cm;
   public float bS;
   public float bT;
   public boolean bU;
   public int bV;
   public float bW;
   @Nullable
   public ccp bX;
   @Nullable
   private doy cn;
   private hz co = hz.c;
   private final cdh cp;
   private int cq = 100;
   private float cr;
   private final ehj[] cs = new ehj[24];
   private final int[] ct = new int[24];
   private final ehg cu = new ehg();

   public ccq(bnw<? extends ccq> $$0, cvr $$1) {
      super(bnw.E, $$1);
      this.e = new cco(this, "head", 1.0F, 1.0F);
      this.cg = new cco(this, "neck", 3.0F, 3.0F);
      this.ch = new cco(this, "body", 5.0F, 3.0F);
      this.ci = new cco(this, "tail", 2.0F, 2.0F);
      this.cj = new cco(this, "tail", 2.0F, 2.0F);
      this.ck = new cco(this, "tail", 2.0F, 2.0F);
      this.cl = new cco(this, "wing", 4.0F, 2.0F);
      this.cm = new cco(this, "wing", 4.0F, 2.0F);
      this.cf = new cco[]{this.e, this.cg, this.ch, this.ci, this.cj, this.ck, this.cl, this.cm};
      this.t(this.eN());
      this.ae = true;
      this.as = true;
      this.cp = new cdh(this);
   }

   public void a(doy $$0) {
      this.cn = $$0;
   }

   @Override
   public void h(hz $$0) {
      this.co = $$0;
   }

   public hz u() {
      return this.co;
   }

   public static bpo.a w() {
      return bok.C().a(bpp.n, 200.0);
   }

   @Override
   public boolean aT() {
      float $$0 = awi.b(this.bT * (float) (Math.PI * 2));
      float $$1 = awi.b(this.bS * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aS() {
      if (this.dM().B && !this.aU()) {
         this.dM().a(this.dr(), this.dt(), this.dx(), atl.hP, this.db(), 5.0F, 0.8F + this.af.i() * 0.3F, false);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(b, cdg.k.b());
   }

   public double[] a(int $$0, float $$1) {
      if (this.ex()) {
         $$1 = 0.0F;
      }

      $$1 = 1.0F - $$1;
      int $$2 = this.d - $$0 & 63;
      int $$3 = this.d - $$0 - 1 & 63;
      double[] $$4 = new double[3];
      double $$5 = this.c[$$2][0];
      double $$6 = awi.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = awi.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void d_() {
      this.aG();
      if (this.dM().B) {
         this.t(this.ew());
         if (!this.aU() && !this.cp.a().a() && --this.cq < 0) {
            this.dM().a(this.dr(), this.dt(), this.dx(), atl.hQ, this.db(), 2.5F, 0.8F + this.af.i() * 0.3F, false);
            this.cq = 200 + this.af.a(200);
         }
      }

      if (this.cn == null && this.dM() instanceof aow $$0) {
         doy $$1 = $$0.D();
         if ($$1 != null && this.cw().equals($$1.i())) {
            this.cn = $$1;
         }
      }

      this.bS = this.bT;
      if (this.ex()) {
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         float $$3 = (this.af.i() - 0.5F) * 4.0F;
         float $$4 = (this.af.i() - 0.5F) * 8.0F;
         this.dM().a(jz.x, this.dr() + (double)$$2, this.dt() + 2.0 + (double)$$3, this.dx() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gg();
         enz $$5 = this.dp();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.cp.a().a()) {
            this.bT += 0.1F;
         } else if (this.bU) {
            this.bT += $$6 * 0.5F;
         } else {
            this.bT += $$6;
         }

         this.r(awi.g(this.dC()));
         if (this.fW()) {
            this.bT = 0.5F;
         } else {
            if (this.d < 0) {
               for (int $$7 = 0; $$7 < this.c.length; $$7++) {
                  this.c[$$7][0] = (double)this.dC();
                  this.c[$$7][1] = this.dt();
               }
            }

            if (++this.d == this.c.length) {
               this.d = 0;
            }

            this.c[this.d][0] = (double)this.dC();
            this.c[this.d][1] = this.dt();
            if (this.dM().B) {
               if (this.bn > 0) {
                  this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
                  this.bn--;
               }

               this.cp.a().b();
            } else {
               cda $$8 = this.cp.a();
               $$8.c();
               if (this.cp.a() != $$8) {
                  $$8 = this.cp.a();
                  $$8.c();
               }

               enz $$9 = $$8.g();
               if ($$9 != null) {
                  double $$10 = $$9.c - this.dr();
                  double $$11 = $$9.d - this.dt();
                  double $$12 = $$9.e - this.dx();
                  double $$13 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  float $$14 = $$8.f();
                  double $$15 = Math.sqrt($$10 * $$10 + $$12 * $$12);
                  if ($$15 > 0.0) {
                     $$11 = awi.a($$11 / $$15, (double)(-$$14), (double)$$14);
                  }

                  this.g(this.dp().b(0.0, $$11 * 0.01, 0.0));
                  this.r(awi.g(this.dC()));
                  enz $$16 = $$9.a(this.dr(), this.dt(), this.dx()).d();
                  enz $$17 = new enz((double)awi.a(this.dC() * (float) (Math.PI / 180.0)), this.dp().d, (double)(-awi.b(this.dC() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$18 = Math.max(((float)$$17.b($$16) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$10) > 1.0E-5F || Math.abs($$12) > 1.0E-5F) {
                     float $$19 = awi.a(awi.g(180.0F - (float)awi.d($$10, $$12) * (180.0F / (float)Math.PI) - this.dC()), -50.0F, 50.0F);
                     this.bW *= 0.8F;
                     this.bW = this.bW + $$19 * $$8.h();
                     this.r(this.dC() + this.bW * 0.1F);
                  }

                  float $$20 = (float)(2.0 / ($$13 + 1.0));
                  float $$21 = 0.06F;
                  this.a(0.06F * ($$18 * $$20 + (1.0F - $$20)), new enz(0.0, 0.0, -1.0));
                  if (this.bU) {
                     this.a(bon.a, this.dp().a(0.8F));
                  } else {
                     this.a(bon.a, this.dp());
                  }

                  enz $$22 = this.dp().d();
                  double $$23 = 0.8 + 0.15 * ($$22.b($$17) + 1.0) / 2.0;
                  this.g(this.dp().d($$23, 0.91F, $$23));
               }
            }

            this.aU = this.dC();
            enz[] $$24 = new enz[this.cf.length];

            for (int $$25 = 0; $$25 < this.cf.length; $$25++) {
               $$24[$$25] = new enz(this.cf[$$25].dr(), this.cf[$$25].dt(), this.cf[$$25].dx());
            }

            float $$26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$27 = awi.b($$26);
            float $$28 = awi.a($$26);
            float $$29 = this.dC() * (float) (Math.PI / 180.0);
            float $$30 = awi.a($$29);
            float $$31 = awi.b($$29);
            this.a(this.ch, (double)($$30 * 0.5F), 0.0, (double)(-$$31 * 0.5F));
            this.a(this.cl, (double)($$31 * 4.5F), 2.0, (double)($$30 * 4.5F));
            this.a(this.cm, (double)($$31 * -4.5F), 2.0, (double)($$30 * -4.5F));
            if (!this.dM().B && this.aK == 0) {
               this.a(this.dM().a(this, this.cl.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bnv.e));
               this.a(this.dM().a(this, this.cm.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bnv.e));
               this.c(this.dM().a(this, this.e.cH().g(1.0), bnv.e));
               this.c(this.dM().a(this, this.cg.cH().g(1.0), bnv.e));
            }

            float $$32 = awi.a(this.dC() * (float) (Math.PI / 180.0) - this.bW * 0.01F);
            float $$33 = awi.b(this.dC() * (float) (Math.PI / 180.0) - this.bW * 0.01F);
            float $$34 = this.gf();
            this.a(this.e, (double)($$32 * 6.5F * $$27), (double)($$34 + $$28 * 6.5F), (double)(-$$33 * 6.5F * $$27));
            this.a(this.cg, (double)($$32 * 5.5F * $$27), (double)($$34 + $$28 * 5.5F), (double)(-$$33 * 5.5F * $$27));
            double[] $$35 = this.a(5, 1.0F);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               cco $$37 = null;
               if ($$36 == 0) {
                  $$37 = this.ci;
               }

               if ($$36 == 1) {
                  $$37 = this.cj;
               }

               if ($$36 == 2) {
                  $$37 = this.ck;
               }

               double[] $$38 = this.a(12 + $$36 * 2, 1.0F);
               float $$39 = this.dC() * (float) (Math.PI / 180.0) + this.i($$38[0] - $$35[0]) * (float) (Math.PI / 180.0);
               float $$40 = awi.a($$39);
               float $$41 = awi.b($$39);
               float $$42 = 1.5F;
               float $$43 = (float)($$36 + 1) * 2.0F;
               this.a(
                  $$37,
                  (double)(-($$30 * 1.5F + $$40 * $$43) * $$27),
                  $$38[1] - $$35[1] - (double)(($$43 + 1.5F) * $$28) + 1.5,
                  (double)(($$31 * 1.5F + $$41 * $$43) * $$27)
               );
            }

            if (!this.dM().B) {
               this.bU = this.b(this.e.cH()) | this.b(this.cg.cH()) | this.b(this.ch.cH());
               if (this.cn != null) {
                  this.cn.b(this);
               }
            }

            for (int $$44 = 0; $$44 < this.cf.length; $$44++) {
               this.cf[$$44].J = $$24[$$44].c;
               this.cf[$$44].K = $$24[$$44].d;
               this.cf[$$44].L = $$24[$$44].e;
               this.cf[$$44].ab = $$24[$$44].c;
               this.cf[$$44].ac = $$24[$$44].d;
               this.cf[$$44].ad = $$24[$$44].e;
            }
         }
      }
   }

   private void a(cco $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dr() + $$1, this.dt() + $$2, this.dx() + $$3);
   }

   private float gf() {
      if (this.cp.a().a()) {
         return -1.0F;
      } else {
         double[] $$0 = this.a(5, 1.0F);
         double[] $$1 = this.a(0, 1.0F);
         return (float)($$0[1] - $$1[1]);
      }
   }

   private void gg() {
      if (this.bX != null) {
         if (this.bX.dH()) {
            this.bX = null;
         } else if (this.ag % 10 == 0 && this.ew() < this.eN()) {
            this.t(this.ew() + 1.0F);
         }
      }

      if (this.af.a(10) == 0) {
         List<ccp> $$0 = this.dM().a(ccp.class, this.cH().g(32.0));
         ccp $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (ccp $$3 : $$0) {
            double $$4 = $$3.f(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.bX = $$1;
      }
   }

   private void a(List<bnq> $$0) {
      double $$1 = (this.ch.cH().a + this.ch.cH().d) / 2.0;
      double $$2 = (this.ch.cH().c + this.ch.cH().f) / 2.0;

      for (bnq $$3 : $$0) {
         if ($$3 instanceof boi) {
            double $$4 = $$3.dr() - $$1;
            double $$5 = $$3.dx() - $$2;
            double $$6 = Math.max($$4 * $$4 + $$5 * $$5, 0.1);
            $$3.j($$4 / $$6 * 4.0, 0.2F, $$5 / $$6 * 4.0);
            if (!this.cp.a().a() && ((boi)$$3).ej() < $$3.ag - 2) {
               $$3.a(this.dN().b((boi)this), 5.0F);
               this.a(this, $$3);
            }
         }
      }
   }

   private void c(List<bnq> $$0) {
      for (bnq $$1 : $$0) {
         if ($$1 instanceof boi) {
            $$1.a(this.dN().b((boi)this), 10.0F);
            this.a(this, $$1);
         }
      }
   }

   private float i(double $$0) {
      return (float)awi.d($$0);
   }

   private boolean b(enu $$0) {
      int $$1 = awi.a($$0.a);
      int $$2 = awi.a($$0.b);
      int $$3 = awi.a($$0.c);
      int $$4 = awi.a($$0.d);
      int $$5 = awi.a($$0.e);
      int $$6 = awi.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               hz $$12 = new hz($$9, $$10, $$11);
               dlj $$13 = this.dM().a_($$12);
               if (!$$13.i() && !$$13.a(aua.aC)) {
                  if (this.dM().Z().b(cvn.c) && !$$13.a(aua.aB)) {
                     $$8 = this.dM().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         hz $$14 = new hz($$1 + this.af.a($$4 - $$1 + 1), $$2 + this.af.a($$5 - $$2 + 1), $$3 + this.af.a($$6 - $$3 + 1));
         this.dM().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(cco $$0, bmp $$1, float $$2) {
      if (this.cp.a().i() == cdg.j) {
         return false;
      } else {
         $$2 = this.cp.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof chl || $$1.a(auc.z)) {
               float $$3 = this.ew();
               this.g($$1, $$2);
               if (this.ex() && !this.cp.a().a()) {
                  this.t(1.0F);
                  this.cp.a(cdg.j);
               }

               if (this.cp.a().a()) {
                  this.cr = this.cr + $$3 - this.ew();
                  if (this.cr > 0.25F * this.eN()) {
                     this.cr = 0.0F;
                     this.cp.a(cdg.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      return !this.dM().B ? this.a(this.ch, $$0, $$1) : false;
   }

   protected boolean g(bmp $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void al() {
      this.a(bnq.c.a);
      this.b(dpw.p);
      if (this.cn != null) {
         this.cn.b(this);
         this.cn.a(this);
      }
   }

   @Override
   protected void ec() {
      if (this.cn != null) {
         this.cn.b(this);
      }

      this.bV++;
      if (this.bV >= 180 && this.bV <= 200) {
         float $$0 = (this.af.i() - 0.5F) * 8.0F;
         float $$1 = (this.af.i() - 0.5F) * 4.0F;
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         this.dM().a(jz.w, this.dr() + (double)$$0, this.dt() + 2.0 + (double)$$1, this.dx() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dM().Z().b(cvn.f);
      int $$4 = 500;
      if (this.cn != null && !this.cn.f()) {
         $$4 = 12000;
      }

      if (this.dM() instanceof aow) {
         if (this.bV > 150 && this.bV % 5 == 0 && $$3) {
            bny.a((aow)this.dM(), this.dk(), awi.d((float)$$4 * 0.08F));
         }

         if (this.bV == 1 && !this.aU()) {
            this.dM().b(1028, this.dm(), 0);
         }
      }

      this.a(bon.a, new enz(0.0, 0.1F, 0.0));
      if (this.bV == 200 && this.dM() instanceof aow) {
         if ($$3) {
            bny.a((aow)this.dM(), this.dk(), awi.d((float)$$4 * 0.2F));
         }

         if (this.cn != null) {
            this.cn.a(this);
         }

         this.a(bnq.c.a);
         this.b(dpw.p);
      }
   }

   public int A() {
      if (this.cs[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = awi.d(60.0F * awi.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = awi.d(60.0F * awi.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = awi.d(40.0F * awi.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = awi.d(40.0F * awi.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = awi.d(20.0F * awi.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = awi.d(20.0F * awi.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.dM().A_() + 10, this.dM().a(dqv.a.f, new hz($$3, 0, $$4)).v() + $$1);
            this.cs[$$0] = new ehj($$3, $$9, $$4);
         }

         this.ct[0] = 6146;
         this.ct[1] = 8197;
         this.ct[2] = 8202;
         this.ct[3] = 16404;
         this.ct[4] = 32808;
         this.ct[5] = 32848;
         this.ct[6] = 65696;
         this.ct[7] = 131392;
         this.ct[8] = 131712;
         this.ct[9] = 263424;
         this.ct[10] = 526848;
         this.ct[11] = 525313;
         this.ct[12] = 1581057;
         this.ct[13] = 3166214;
         this.ct[14] = 2138120;
         this.ct[15] = 6373424;
         this.ct[16] = 4358208;
         this.ct[17] = 12910976;
         this.ct[18] = 9044480;
         this.ct[19] = 9706496;
         this.ct[20] = 15216640;
         this.ct[21] = 13688832;
         this.ct[22] = 11763712;
         this.ct[23] = 8257536;
      }

      return this.r(this.dr(), this.dt(), this.dx());
   }

   public int r(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      ehj $$5 = new ehj(awi.a($$0), awi.a($$1), awi.a($$2));
      int $$6 = 0;
      if (this.cn == null || this.cn.e() == 0) {
         $$6 = 12;
      }

      for (int $$7 = $$6; $$7 < 24; $$7++) {
         if (this.cs[$$7] != null) {
            float $$8 = this.cs[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public ehl a(int $$0, int $$1, @Nullable ehj $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         ehj $$4 = this.cs[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      ehj $$5 = this.cs[$$0];
      ehj $$6 = this.cs[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cu.a();
      this.cu.a($$5);
      ehj $$7 = $$5;
      int $$8 = 0;
      if (this.cn == null || this.cn.e() == 0) {
         $$8 = 12;
      }

      while (!this.cu.e()) {
         ehj $$9 = this.cu.c();
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
            if (this.cs[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for (int $$12 = $$8; $$12 < 24; $$12++) {
            if ((this.ct[$$10] & 1 << $$12) > 0) {
               ehj $$13 = this.cs[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.cu.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.cu.a($$13);
                     }
                  }
               }
            }
         }
      }

      if ($$7 == $$5) {
         return null;
      } else {
         bY.debug("Failed to find path from {} to {}", $$0, $$1);
         if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
         }

         return this.a($$5, $$7);
      }
   }

   private ehl a(ehj $$0, ehj $$1) {
      List<ehj> $$2 = Lists.newArrayList();
      ehj $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new ehl($$2, new hz($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cp.a().i().b());
      $$0.a("DragonDeathTime", this.bV);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cp.a(cdg.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bV = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dy() {
   }

   public cco[] gc() {
      return this.cf;
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public atm db() {
      return atm.f;
   }

   @Override
   protected atk y() {
      return atl.hM;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.hR;
   }

   @Override
   protected float eW() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      cda $$3 = this.cp.a();
      cdg<? extends cda> $$4 = $$3.i();
      double $$7;
      if ($$4 == cdg.d || $$4 == cdg.e) {
         hz $$5 = this.dM().a(dqv.a.f, dty.a(this.co));
         double $$6 = Math.max(Math.sqrt($$5.b(this.dk())) / 4.0, 1.0);
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

   public enz D(float $$0) {
      cda $$1 = this.cp.a();
      cdg<? extends cda> $$2 = $$1.i();
      enz $$8;
      if ($$2 == cdg.d || $$2 == cdg.e) {
         hz $$3 = this.dM().a(dqv.a.f, dty.a(this.co));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.dk())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dE();
         float $$7 = 1.5F;
         this.s(-$$5 * 1.5F * 5.0F);
         $$8 = this.f($$0);
         this.s($$6);
      } else if ($$1.a()) {
         float $$9 = this.dE();
         float $$10 = 1.5F;
         this.s(-45.0F);
         $$8 = this.f($$0);
         this.s($$9);
      } else {
         $$8 = this.f($$0);
      }

      return $$8;
   }

   public void a(ccp $$0, hz $$1, bmp $$2) {
      chl $$3;
      if ($$2.d() instanceof chl) {
         $$3 = (chl)$$2.d();
      } else {
         $$3 = this.dM().a(bZ, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.bX) {
         this.a(this.e, this.dN().d($$0, $$3), 10.0F);
      }

      this.cp.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aie<?> $$0) {
      if (b.equals($$0) && this.dM().B) {
         this.cp.a(cdg.a(this.an().b(b)));
      }

      super.a($$0);
   }

   public cdh gd() {
      return this.cp;
   }

   @Nullable
   public doy ge() {
      return this.cn;
   }

   @Override
   public boolean b(bnd $$0, @Nullable bnq $$1) {
      return false;
   }

   @Override
   protected boolean n(bnq $$0) {
      return false;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      cco[] $$1 = this.gc();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b());
      }
   }

   @Override
   public boolean c(boi $$0) {
      return $$0.ep();
   }
}
