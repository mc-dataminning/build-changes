import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class bxn extends bjo implements bzg {
   private static final Logger bY = LogUtils.getLogger();
   public static final aef<Integer> b = aei.a(bxn.class, aeh.b);
   private static final bty bZ = bty.a().a(64.0);
   private static final int ca = 200;
   private static final int cb = 400;
   private static final float cc = 0.25F;
   private static final String cd = "DragonDeathTime";
   private static final String ce = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final bxl[] cf;
   public final bxl e;
   private final bxl cg;
   private final bxl ch;
   private final bxl ci;
   private final bxl cj;
   private final bxl ck;
   private final bxl cl;
   private final bxl cm;
   public float bS;
   public float bT;
   public boolean bU;
   public int bV;
   public float bW;
   @Nullable
   public bxm bX;
   @Nullable
   private dip cn;
   private gw co = gw.b;
   private final bye cp;
   private int cq = 100;
   private float cr;
   private final eat[] cs = new eat[24];
   private final int[] ct = new int[24];
   private final eaq cu = new eaq();

   public bxn(bja<? extends bxn> $$0, cqb $$1) {
      super(bja.C, $$1);
      this.e = new bxl(this, "head", 1.0F, 1.0F);
      this.cg = new bxl(this, "neck", 3.0F, 3.0F);
      this.ch = new bxl(this, "body", 5.0F, 3.0F);
      this.ci = new bxl(this, "tail", 2.0F, 2.0F);
      this.cj = new bxl(this, "tail", 2.0F, 2.0F);
      this.ck = new bxl(this, "tail", 2.0F, 2.0F);
      this.cl = new bxl(this, "wing", 4.0F, 2.0F);
      this.cm = new bxl(this, "wing", 4.0F, 2.0F);
      this.cf = new bxl[]{this.e, this.cg, this.ch, this.ci, this.cj, this.ck, this.cl, this.cm};
      this.c(this.eL());
      this.af = true;
      this.at = true;
      this.cp = new bye(this);
   }

   public void a(dip $$0) {
      this.cn = $$0;
   }

   @Override
   public void h(gw $$0) {
      this.co = $$0;
   }

   public gw s() {
      return this.co;
   }

   public static bkr.a t() {
      return bjo.A().a(bks.l, 200.0);
   }

   @Override
   public boolean aR() {
      float $$0 = asb.b(this.bT * (float) (Math.PI * 2));
      float $$1 = asb.b(this.bS * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aQ() {
      if (this.dL().B && !this.aS()) {
         this.dL().a(this.dq(), this.ds(), this.dw(), apg.gW, this.da(), 5.0F, 0.8F + this.ag.i() * 0.3F, false);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(b, byd.k.b());
   }

   public double[] a(int $$0, float $$1) {
      if (this.ev()) {
         $$1 = 0.0F;
      }

      $$1 = 1.0F - $$1;
      int $$2 = this.d - $$0 & 63;
      int $$3 = this.d - $$0 - 1 & 63;
      double[] $$4 = new double[3];
      double $$5 = this.c[$$2][0];
      double $$6 = asb.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = asb.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void b_() {
      this.aE();
      if (this.dL().B) {
         this.c(this.eu());
         if (!this.aS() && !this.cp.a().a() && --this.cq < 0) {
            this.dL().a(this.dq(), this.ds(), this.dw(), apg.gX, this.da(), 2.5F, 0.8F + this.ag.i() * 0.3F, false);
            this.cq = 200 + this.ag.a(200);
         }
      }

      if (this.cn == null && this.dL() instanceof akt $$0) {
         dip $$1 = $$0.B();
         if ($$1 != null && this.cv().equals($$1.i())) {
            this.cn = $$1;
         }
      }

      this.bS = this.bT;
      if (this.ev()) {
         float $$2 = (this.ag.i() - 0.5F) * 8.0F;
         float $$3 = (this.ag.i() - 0.5F) * 4.0F;
         float $$4 = (this.ag.i() - 0.5F) * 8.0F;
         this.dL().a(iv.x, this.dq() + (double)$$2, this.ds() + 2.0 + (double)$$3, this.dw() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.ge();
         ehh $$5 = this.do();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.cp.a().a()) {
            this.bT += 0.1F;
         } else if (this.bU) {
            this.bT += $$6 * 0.5F;
         } else {
            this.bT += $$6;
         }

         this.r(asb.g(this.dB()));
         if (this.fU()) {
            this.bT = 0.5F;
         } else {
            if (this.d < 0) {
               for (int $$7 = 0; $$7 < this.c.length; $$7++) {
                  this.c[$$7][0] = (double)this.dB();
                  this.c[$$7][1] = this.ds();
               }
            }

            if (++this.d == this.c.length) {
               this.d = 0;
            }

            this.c[this.d][0] = (double)this.dB();
            this.c[this.d][1] = this.ds();
            if (this.dL().B) {
               if (this.bn > 0) {
                  this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
                  this.bn--;
               }

               this.cp.a().b();
            } else {
               bxx $$8 = this.cp.a();
               $$8.c();
               if (this.cp.a() != $$8) {
                  $$8 = this.cp.a();
                  $$8.c();
               }

               ehh $$9 = $$8.g();
               if ($$9 != null) {
                  double $$10 = $$9.c - this.dq();
                  double $$11 = $$9.d - this.ds();
                  double $$12 = $$9.e - this.dw();
                  double $$13 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  float $$14 = $$8.f();
                  double $$15 = Math.sqrt($$10 * $$10 + $$12 * $$12);
                  if ($$15 > 0.0) {
                     $$11 = asb.a($$11 / $$15, (double)(-$$14), (double)$$14);
                  }

                  this.f(this.do().b(0.0, $$11 * 0.01, 0.0));
                  this.r(asb.g(this.dB()));
                  ehh $$16 = $$9.a(this.dq(), this.ds(), this.dw()).d();
                  ehh $$17 = new ehh((double)asb.a(this.dB() * (float) (Math.PI / 180.0)), this.do().d, (double)(-asb.b(this.dB() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$18 = Math.max(((float)$$17.b($$16) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$10) > 1.0E-5F || Math.abs($$12) > 1.0E-5F) {
                     float $$19 = asb.a(asb.g(180.0F - (float)asb.d($$10, $$12) * (180.0F / (float)Math.PI) - this.dB()), -50.0F, 50.0F);
                     this.bW *= 0.8F;
                     this.bW = this.bW + $$19 * $$8.h();
                     this.r(this.dB() + this.bW * 0.1F);
                  }

                  float $$20 = (float)(2.0 / ($$13 + 1.0));
                  float $$21 = 0.06F;
                  this.a(0.06F * ($$18 * $$20 + (1.0F - $$20)), new ehh(0.0, 0.0, -1.0));
                  if (this.bU) {
                     this.a(bjs.a, this.do().a(0.8F));
                  } else {
                     this.a(bjs.a, this.do());
                  }

                  ehh $$22 = this.do().d();
                  double $$23 = 0.8 + 0.15 * ($$22.b($$17) + 1.0) / 2.0;
                  this.f(this.do().d($$23, 0.91F, $$23));
               }
            }

            this.aU = this.dB();
            ehh[] $$24 = new ehh[this.cf.length];

            for (int $$25 = 0; $$25 < this.cf.length; $$25++) {
               $$24[$$25] = new ehh(this.cf[$$25].dq(), this.cf[$$25].ds(), this.cf[$$25].dw());
            }

            float $$26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$27 = asb.b($$26);
            float $$28 = asb.a($$26);
            float $$29 = this.dB() * (float) (Math.PI / 180.0);
            float $$30 = asb.a($$29);
            float $$31 = asb.b($$29);
            this.a(this.ch, (double)($$30 * 0.5F), 0.0, (double)(-$$31 * 0.5F));
            this.a(this.cl, (double)($$31 * 4.5F), 2.0, (double)($$30 * 4.5F));
            this.a(this.cm, (double)($$31 * -4.5F), 2.0, (double)($$30 * -4.5F));
            if (!this.dL().B && this.aK == 0) {
               this.b(this.dL().a(this, this.cl.cG().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), biz.e));
               this.b(this.dL().a(this, this.cm.cG().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), biz.e));
               this.c(this.dL().a(this, this.e.cG().g(1.0), biz.e));
               this.c(this.dL().a(this, this.cg.cG().g(1.0), biz.e));
            }

            float $$32 = asb.a(this.dB() * (float) (Math.PI / 180.0) - this.bW * 0.01F);
            float $$33 = asb.b(this.dB() * (float) (Math.PI / 180.0) - this.bW * 0.01F);
            float $$34 = this.gd();
            this.a(this.e, (double)($$32 * 6.5F * $$27), (double)($$34 + $$28 * 6.5F), (double)(-$$33 * 6.5F * $$27));
            this.a(this.cg, (double)($$32 * 5.5F * $$27), (double)($$34 + $$28 * 5.5F), (double)(-$$33 * 5.5F * $$27));
            double[] $$35 = this.a(5, 1.0F);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               bxl $$37 = null;
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
               float $$39 = this.dB() * (float) (Math.PI / 180.0) + this.i($$38[0] - $$35[0]) * (float) (Math.PI / 180.0);
               float $$40 = asb.a($$39);
               float $$41 = asb.b($$39);
               float $$42 = 1.5F;
               float $$43 = (float)($$36 + 1) * 2.0F;
               this.a(
                  $$37,
                  (double)(-($$30 * 1.5F + $$40 * $$43) * $$27),
                  $$38[1] - $$35[1] - (double)(($$43 + 1.5F) * $$28) + 1.5,
                  (double)(($$31 * 1.5F + $$41 * $$43) * $$27)
               );
            }

            if (!this.dL().B) {
               this.bU = this.b(this.e.cG()) | this.b(this.cg.cG()) | this.b(this.ch.cG());
               if (this.cn != null) {
                  this.cn.b(this);
               }
            }

            for (int $$44 = 0; $$44 < this.cf.length; $$44++) {
               this.cf[$$44].K = $$24[$$44].c;
               this.cf[$$44].L = $$24[$$44].d;
               this.cf[$$44].M = $$24[$$44].e;
               this.cf[$$44].ac = $$24[$$44].c;
               this.cf[$$44].ad = $$24[$$44].d;
               this.cf[$$44].ae = $$24[$$44].e;
            }
         }
      }
   }

   private void a(bxl $$0, double $$1, double $$2, double $$3) {
      $$0.e(this.dq() + $$1, this.ds() + $$2, this.dw() + $$3);
   }

   private float gd() {
      if (this.cp.a().a()) {
         return -1.0F;
      } else {
         double[] $$0 = this.a(5, 1.0F);
         double[] $$1 = this.a(0, 1.0F);
         return (float)($$0[1] - $$1[1]);
      }
   }

   private void ge() {
      if (this.bX != null) {
         if (this.bX.dG()) {
            this.bX = null;
         } else if (this.ah % 10 == 0 && this.eu() < this.eL()) {
            this.c(this.eu() + 1.0F);
         }
      }

      if (this.ag.a(10) == 0) {
         List<bxm> $$0 = this.dL().a(bxm.class, this.cG().g(32.0));
         bxm $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bxm $$3 : $$0) {
            double $$4 = $$3.f(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.bX = $$1;
      }
   }

   private void b(List<biw> $$0) {
      double $$1 = (this.ch.cG().a + this.ch.cG().d) / 2.0;
      double $$2 = (this.ch.cG().c + this.ch.cG().f) / 2.0;

      for (biw $$3 : $$0) {
         if ($$3 instanceof bjm) {
            double $$4 = $$3.dq() - $$1;
            double $$5 = $$3.dw() - $$2;
            double $$6 = Math.max($$4 * $$4 + $$5 * $$5, 0.1);
            $$3.j($$4 / $$6 * 4.0, 0.2F, $$5 / $$6 * 4.0);
            if (!this.cp.a().a() && ((bjm)$$3).eh() < $$3.ah - 2) {
               $$3.a(this.dM().b((bjm)this), 5.0F);
               this.a(this, $$3);
            }
         }
      }
   }

   private void c(List<biw> $$0) {
      for (biw $$1 : $$0) {
         if ($$1 instanceof bjm) {
            $$1.a(this.dM().b((bjm)this), 10.0F);
            this.a(this, $$1);
         }
      }
   }

   private float i(double $$0) {
      return (float)asb.d($$0);
   }

   private boolean b(ehc $$0) {
      int $$1 = asb.a($$0.a);
      int $$2 = asb.a($$0.b);
      int $$3 = asb.a($$0.c);
      int $$4 = asb.a($$0.d);
      int $$5 = asb.a($$0.e);
      int $$6 = asb.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               gw $$12 = new gw($$9, $$10, $$11);
               dfd $$13 = this.dL().a_($$12);
               if (!$$13.i() && !$$13.a(apv.aC)) {
                  if (this.dL().X().b(cpx.c) && !$$13.a(apv.aB)) {
                     $$8 = this.dL().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         gw $$14 = new gw($$1 + this.ag.a($$4 - $$1 + 1), $$2 + this.ag.a($$5 - $$2 + 1), $$3 + this.ag.a($$6 - $$3 + 1));
         this.dL().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(bxl $$0, bhu $$1, float $$2) {
      if (this.cp.a().i() == byd.j) {
         return false;
      } else {
         $$2 = this.cp.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cca || $$1.a(apx.y)) {
               float $$3 = this.eu();
               this.g($$1, $$2);
               if (this.ev() && !this.cp.a().a()) {
                  this.c(1.0F);
                  this.cp.a(byd.j);
               }

               if (this.cp.a().a()) {
                  this.cr = this.cr + $$3 - this.eu();
                  if (this.cr > 0.25F * this.eL()) {
                     this.cr = 0.0F;
                     this.cp.a(byd.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      return !this.dL().B ? this.a(this.ch, $$0, $$1) : false;
   }

   protected boolean g(bhu $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void aj() {
      this.a(biw.c.a);
      this.a(djn.p);
      if (this.cn != null) {
         this.cn.b(this);
         this.cn.a(this);
      }
   }

   @Override
   protected void ea() {
      if (this.cn != null) {
         this.cn.b(this);
      }

      this.bV++;
      if (this.bV >= 180 && this.bV <= 200) {
         float $$0 = (this.ag.i() - 0.5F) * 8.0F;
         float $$1 = (this.ag.i() - 0.5F) * 4.0F;
         float $$2 = (this.ag.i() - 0.5F) * 8.0F;
         this.dL().a(iv.w, this.dq() + (double)$$0, this.ds() + 2.0 + (double)$$1, this.dw() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dL().X().b(cpx.f);
      int $$4 = 500;
      if (this.cn != null && !this.cn.f()) {
         $$4 = 12000;
      }

      if (this.dL() instanceof akt) {
         if (this.bV > 150 && this.bV % 5 == 0 && $$3) {
            bjc.a((akt)this.dL(), this.dj(), asb.d((float)$$4 * 0.08F));
         }

         if (this.bV == 1 && !this.aS()) {
            this.dL().b(1028, this.dl(), 0);
         }
      }

      this.a(bjs.a, new ehh(0.0, 0.1F, 0.0));
      if (this.bV == 200 && this.dL() instanceof akt) {
         if ($$3) {
            bjc.a((akt)this.dL(), this.dj(), asb.d((float)$$4 * 0.2F));
         }

         if (this.cn != null) {
            this.cn.a(this);
         }

         this.a(biw.c.a);
         this.a(djn.p);
      }
   }

   public int y() {
      if (this.cs[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = asb.d(60.0F * asb.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = asb.d(60.0F * asb.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = asb.d(40.0F * asb.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = asb.d(40.0F * asb.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = asb.d(20.0F * asb.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = asb.d(20.0F * asb.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.dL().y_() + 10, this.dL().a(dkm.a.f, new gw($$3, 0, $$4)).v() + $$1);
            this.cs[$$0] = new eat($$3, $$9, $$4);
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

      return this.r(this.dq(), this.ds(), this.dw());
   }

   public int r(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      eat $$5 = new eat(asb.a($$0), asb.a($$1), asb.a($$2));
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
   public eav a(int $$0, int $$1, @Nullable eat $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         eat $$4 = this.cs[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      eat $$5 = this.cs[$$0];
      eat $$6 = this.cs[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cu.a();
      this.cu.a($$5);
      eat $$7 = $$5;
      int $$8 = 0;
      if (this.cn == null || this.cn.e() == 0) {
         $$8 = 12;
      }

      while (!this.cu.e()) {
         eat $$9 = this.cu.c();
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
               eat $$13 = this.cs[$$12];
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

   private eav a(eat $$0, eat $$1) {
      List<eat> $$2 = Lists.newArrayList();
      eat $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new eav($$2, new gw($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cp.a().i().b());
      $$0.a("DragonDeathTime", this.bV);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cp.a(byd.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bV = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dx() {
   }

   public bxl[] ga() {
      return this.cf;
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public aph da() {
      return aph.f;
   }

   @Override
   protected apf w() {
      return apg.gT;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.gY;
   }

   @Override
   protected float eV() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      bxx $$3 = this.cp.a();
      byd<? extends bxx> $$4 = $$3.i();
      double $$7;
      if ($$4 == byd.d || $$4 == byd.e) {
         gw $$5 = this.dL().a(dkm.a.f, dnp.a(this.co));
         double $$6 = Math.max(Math.sqrt($$5.b(this.dj())) / 4.0, 1.0);
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

   public ehh D(float $$0) {
      bxx $$1 = this.cp.a();
      byd<? extends bxx> $$2 = $$1.i();
      ehh $$8;
      if ($$2 == byd.d || $$2 == byd.e) {
         gw $$3 = this.dL().a(dkm.a.f, dnp.a(this.co));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.dj())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dD();
         float $$7 = 1.5F;
         this.s(-$$5 * 1.5F * 5.0F);
         $$8 = this.f($$0);
         this.s($$6);
      } else if ($$1.a()) {
         float $$9 = this.dD();
         float $$10 = 1.5F;
         this.s(-45.0F);
         $$8 = this.f($$0);
         this.s($$9);
      } else {
         $$8 = this.f($$0);
      }

      return $$8;
   }

   public void a(bxm $$0, gw $$1, bhu $$2) {
      cca $$3;
      if ($$2.d() instanceof cca) {
         $$3 = (cca)$$2.d();
      } else {
         $$3 = this.dL().a(bZ, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.bX) {
         this.a(this.e, this.dM().d($$0, $$3), 10.0F);
      }

      this.cp.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aef<?> $$0) {
      if (b.equals($$0) && this.dL().B) {
         this.cp.a(byd.a(this.al().b(b)));
      }

      super.a($$0);
   }

   public bye gb() {
      return this.cp;
   }

   @Nullable
   public dip gc() {
      return this.cn;
   }

   @Override
   public boolean b(bij $$0, @Nullable biw $$1) {
      return false;
   }

   @Override
   protected boolean o(biw $$0) {
      return false;
   }

   @Override
   public boolean cs() {
      return false;
   }

   @Override
   public void a(wy $$0) {
      super.a($$0);
      bxl[] $$1 = this.ga();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.a());
      }
   }

   @Override
   public boolean c(bjm $$0) {
      return $$0.en();
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, this.ch.dg(), 0.0F);
   }
}
