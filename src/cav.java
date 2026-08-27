import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cav extends bmq implements cco {
   private static final Logger bZ = LogUtils.getLogger();
   public static final agn<Integer> b = agq.a(cav.class, agp.b);
   private static final bxd ca = bxd.a().a(64.0);
   private static final int cb = 200;
   private static final int cc = 400;
   private static final float cd = 0.25F;
   private static final String ce = "DragonDeathTime";
   private static final String cf = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final cat[] cg;
   public final cat e;
   private final cat ch;
   private final cat ci;
   private final cat cj;
   private final cat ck;
   private final cat cl;
   private final cat cm;
   private final cat cn;
   public float bT;
   public float bU;
   public boolean bV;
   public int bW;
   public float bX;
   @Nullable
   public cau bY;
   @Nullable
   private dnb co;
   private hx cp = hx.b;
   private final cbm cq;
   private int cr = 100;
   private float cs;
   private final efm[] ct = new efm[24];
   private final int[] cu = new int[24];
   private final efj cv = new efj();

   public cav(bmc<? extends cav> $$0, ctx $$1) {
      super(bmc.E, $$1);
      this.e = new cat(this, "head", 1.0F, 1.0F);
      this.ch = new cat(this, "neck", 3.0F, 3.0F);
      this.ci = new cat(this, "body", 5.0F, 3.0F);
      this.cj = new cat(this, "tail", 2.0F, 2.0F);
      this.ck = new cat(this, "tail", 2.0F, 2.0F);
      this.cl = new cat(this, "tail", 2.0F, 2.0F);
      this.cm = new cat(this, "wing", 4.0F, 2.0F);
      this.cn = new cat(this, "wing", 4.0F, 2.0F);
      this.cg = new cat[]{this.e, this.ch, this.ci, this.cj, this.ck, this.cl, this.cm, this.cn};
      this.c(this.eM());
      this.af = true;
      this.at = true;
      this.cq = new cbm(this);
   }

   public void a(dnb $$0) {
      this.co = $$0;
   }

   @Override
   public void d(hx $$0) {
      this.cp = $$0;
   }

   public hx u() {
      return this.cp;
   }

   public static bnt.a w() {
      return bmq.C().a(bnu.n, 200.0);
   }

   @Override
   public boolean aT() {
      float $$0 = aup.b(this.bU * (float) (Math.PI * 2));
      float $$1 = aup.b(this.bT * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aS() {
      if (this.dL().B && !this.aU()) {
         this.dL().a(this.dq(), this.ds(), this.dw(), art.hO, this.db(), 5.0F, 0.8F + this.ag.i() * 0.3F, false);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(b, cbl.k.b());
   }

   public double[] a(int $$0, float $$1) {
      if (this.ew()) {
         $$1 = 0.0F;
      }

      $$1 = 1.0F - $$1;
      int $$2 = this.d - $$0 & 63;
      int $$3 = this.d - $$0 - 1 & 63;
      double[] $$4 = new double[3];
      double $$5 = this.c[$$2][0];
      double $$6 = aup.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = aup.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void d_() {
      this.aG();
      if (this.dL().B) {
         this.c(this.ev());
         if (!this.aU() && !this.cq.a().a() && --this.cr < 0) {
            this.dL().a(this.dq(), this.ds(), this.dw(), art.hP, this.db(), 2.5F, 0.8F + this.ag.i() * 0.3F, false);
            this.cr = 200 + this.ag.a(200);
         }
      }

      if (this.co == null && this.dL() instanceof ane $$0) {
         dnb $$1 = $$0.D();
         if ($$1 != null && this.cw().equals($$1.i())) {
            this.co = $$1;
         }
      }

      this.bT = this.bU;
      if (this.ew()) {
         float $$2 = (this.ag.i() - 0.5F) * 8.0F;
         float $$3 = (this.ag.i() - 0.5F) * 4.0F;
         float $$4 = (this.ag.i() - 0.5F) * 8.0F;
         this.dL().a(jx.x, this.dq() + (double)$$2, this.ds() + 2.0 + (double)$$3, this.dw() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gf();
         emc $$5 = this.do();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.cq.a().a()) {
            this.bU += 0.1F;
         } else if (this.bV) {
            this.bU += $$6 * 0.5F;
         } else {
            this.bU += $$6;
         }

         this.r(aup.g(this.dB()));
         if (this.fV()) {
            this.bU = 0.5F;
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

               this.cq.a().b();
            } else {
               cbf $$8 = this.cq.a();
               $$8.c();
               if (this.cq.a() != $$8) {
                  $$8 = this.cq.a();
                  $$8.c();
               }

               emc $$9 = $$8.g();
               if ($$9 != null) {
                  double $$10 = $$9.c - this.dq();
                  double $$11 = $$9.d - this.ds();
                  double $$12 = $$9.e - this.dw();
                  double $$13 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  float $$14 = $$8.f();
                  double $$15 = Math.sqrt($$10 * $$10 + $$12 * $$12);
                  if ($$15 > 0.0) {
                     $$11 = aup.a($$11 / $$15, (double)(-$$14), (double)$$14);
                  }

                  this.g(this.do().b(0.0, $$11 * 0.01, 0.0));
                  this.r(aup.g(this.dB()));
                  emc $$16 = $$9.a(this.dq(), this.ds(), this.dw()).d();
                  emc $$17 = new emc((double)aup.a(this.dB() * (float) (Math.PI / 180.0)), this.do().d, (double)(-aup.b(this.dB() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$18 = Math.max(((float)$$17.b($$16) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$10) > 1.0E-5F || Math.abs($$12) > 1.0E-5F) {
                     float $$19 = aup.a(aup.g(180.0F - (float)aup.d($$10, $$12) * (180.0F / (float)Math.PI) - this.dB()), -50.0F, 50.0F);
                     this.bX *= 0.8F;
                     this.bX = this.bX + $$19 * $$8.h();
                     this.r(this.dB() + this.bX * 0.1F);
                  }

                  float $$20 = (float)(2.0 / ($$13 + 1.0));
                  float $$21 = 0.06F;
                  this.a(0.06F * ($$18 * $$20 + (1.0F - $$20)), new emc(0.0, 0.0, -1.0));
                  if (this.bV) {
                     this.a(bmu.a, this.do().a(0.8F));
                  } else {
                     this.a(bmu.a, this.do());
                  }

                  emc $$22 = this.do().d();
                  double $$23 = 0.8 + 0.15 * ($$22.b($$17) + 1.0) / 2.0;
                  this.g(this.do().d($$23, 0.91F, $$23));
               }
            }

            this.aU = this.dB();
            emc[] $$24 = new emc[this.cg.length];

            for (int $$25 = 0; $$25 < this.cg.length; $$25++) {
               $$24[$$25] = new emc(this.cg[$$25].dq(), this.cg[$$25].ds(), this.cg[$$25].dw());
            }

            float $$26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$27 = aup.b($$26);
            float $$28 = aup.a($$26);
            float $$29 = this.dB() * (float) (Math.PI / 180.0);
            float $$30 = aup.a($$29);
            float $$31 = aup.b($$29);
            this.a(this.ci, (double)($$30 * 0.5F), 0.0, (double)(-$$31 * 0.5F));
            this.a(this.cm, (double)($$31 * 4.5F), 2.0, (double)($$30 * 4.5F));
            this.a(this.cn, (double)($$31 * -4.5F), 2.0, (double)($$30 * -4.5F));
            if (!this.dL().B && this.aK == 0) {
               this.a(this.dL().a(this, this.cm.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bmb.e));
               this.a(this.dL().a(this, this.cn.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bmb.e));
               this.c(this.dL().a(this, this.e.cH().g(1.0), bmb.e));
               this.c(this.dL().a(this, this.ch.cH().g(1.0), bmb.e));
            }

            float $$32 = aup.a(this.dB() * (float) (Math.PI / 180.0) - this.bX * 0.01F);
            float $$33 = aup.b(this.dB() * (float) (Math.PI / 180.0) - this.bX * 0.01F);
            float $$34 = this.ge();
            this.a(this.e, (double)($$32 * 6.5F * $$27), (double)($$34 + $$28 * 6.5F), (double)(-$$33 * 6.5F * $$27));
            this.a(this.ch, (double)($$32 * 5.5F * $$27), (double)($$34 + $$28 * 5.5F), (double)(-$$33 * 5.5F * $$27));
            double[] $$35 = this.a(5, 1.0F);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               cat $$37 = null;
               if ($$36 == 0) {
                  $$37 = this.cj;
               }

               if ($$36 == 1) {
                  $$37 = this.ck;
               }

               if ($$36 == 2) {
                  $$37 = this.cl;
               }

               double[] $$38 = this.a(12 + $$36 * 2, 1.0F);
               float $$39 = this.dB() * (float) (Math.PI / 180.0) + this.i($$38[0] - $$35[0]) * (float) (Math.PI / 180.0);
               float $$40 = aup.a($$39);
               float $$41 = aup.b($$39);
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
               this.bV = this.a(this.e.cH()) | this.a(this.ch.cH()) | this.a(this.ci.cH());
               if (this.co != null) {
                  this.co.b(this);
               }
            }

            for (int $$44 = 0; $$44 < this.cg.length; $$44++) {
               this.cg[$$44].K = $$24[$$44].c;
               this.cg[$$44].L = $$24[$$44].d;
               this.cg[$$44].M = $$24[$$44].e;
               this.cg[$$44].ac = $$24[$$44].c;
               this.cg[$$44].ad = $$24[$$44].d;
               this.cg[$$44].ae = $$24[$$44].e;
            }
         }
      }
   }

   private void a(cat $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dq() + $$1, this.ds() + $$2, this.dw() + $$3);
   }

   private float ge() {
      if (this.cq.a().a()) {
         return -1.0F;
      } else {
         double[] $$0 = this.a(5, 1.0F);
         double[] $$1 = this.a(0, 1.0F);
         return (float)($$0[1] - $$1[1]);
      }
   }

   private void gf() {
      if (this.bY != null) {
         if (this.bY.dG()) {
            this.bY = null;
         } else if (this.ah % 10 == 0 && this.ev() < this.eM()) {
            this.c(this.ev() + 1.0F);
         }
      }

      if (this.ag.a(10) == 0) {
         List<cau> $$0 = this.dL().a(cau.class, this.cH().g(32.0));
         cau $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cau $$3 : $$0) {
            double $$4 = $$3.f(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.bY = $$1;
      }
   }

   private void a(List<blw> $$0) {
      double $$1 = (this.ci.cH().a + this.ci.cH().d) / 2.0;
      double $$2 = (this.ci.cH().c + this.ci.cH().f) / 2.0;

      for (blw $$3 : $$0) {
         if ($$3 instanceof bmo) {
            double $$4 = $$3.dq() - $$1;
            double $$5 = $$3.dw() - $$2;
            double $$6 = Math.max($$4 * $$4 + $$5 * $$5, 0.1);
            $$3.j($$4 / $$6 * 4.0, 0.2F, $$5 / $$6 * 4.0);
            if (!this.cq.a().a() && ((bmo)$$3).ei() < $$3.ah - 2) {
               $$3.a(this.dM().b((bmo)this), 5.0F);
               this.a(this, $$3);
            }
         }
      }
   }

   private void c(List<blw> $$0) {
      for (blw $$1 : $$0) {
         if ($$1 instanceof bmo) {
            $$1.a(this.dM().b((bmo)this), 10.0F);
            this.a(this, $$1);
         }
      }
   }

   private float i(double $$0) {
      return (float)aup.d($$0);
   }

   private boolean a(elx $$0) {
      int $$1 = aup.a($$0.a);
      int $$2 = aup.a($$0.b);
      int $$3 = aup.a($$0.c);
      int $$4 = aup.a($$0.d);
      int $$5 = aup.a($$0.e);
      int $$6 = aup.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               hx $$12 = new hx($$9, $$10, $$11);
               djp $$13 = this.dL().a_($$12);
               if (!$$13.i() && !$$13.a(asi.aC)) {
                  if (this.dL().Z().b(ctt.c) && !$$13.a(asi.aB)) {
                     $$8 = this.dL().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         hx $$14 = new hx($$1 + this.ag.a($$4 - $$1 + 1), $$2 + this.ag.a($$5 - $$2 + 1), $$3 + this.ag.a($$6 - $$3 + 1));
         this.dL().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(cat $$0, bkv $$1, float $$2) {
      if (this.cq.a().i() == cbl.j) {
         return false;
      } else {
         $$2 = this.cq.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cfq || $$1.a(ask.z)) {
               float $$3 = this.ev();
               this.g($$1, $$2);
               if (this.ew() && !this.cq.a().a()) {
                  this.c(1.0F);
                  this.cq.a(cbl.j);
               }

               if (this.cq.a().a()) {
                  this.cs = this.cs + $$3 - this.ev();
                  if (this.cs > 0.25F * this.eM()) {
                     this.cs = 0.0F;
                     this.cq.a(cbl.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      return !this.dL().B ? this.a(this.ci, $$0, $$1) : false;
   }

   protected boolean g(bkv $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void al() {
      this.a(blw.c.a);
      this.b(dnz.p);
      if (this.co != null) {
         this.co.b(this);
         this.co.a(this);
      }
   }

   @Override
   protected void eb() {
      if (this.co != null) {
         this.co.b(this);
      }

      this.bW++;
      if (this.bW >= 180 && this.bW <= 200) {
         float $$0 = (this.ag.i() - 0.5F) * 8.0F;
         float $$1 = (this.ag.i() - 0.5F) * 4.0F;
         float $$2 = (this.ag.i() - 0.5F) * 8.0F;
         this.dL().a(jx.w, this.dq() + (double)$$0, this.ds() + 2.0 + (double)$$1, this.dw() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dL().Z().b(ctt.f);
      int $$4 = 500;
      if (this.co != null && !this.co.f()) {
         $$4 = 12000;
      }

      if (this.dL() instanceof ane) {
         if (this.bW > 150 && this.bW % 5 == 0 && $$3) {
            bme.a((ane)this.dL(), this.dj(), aup.d((float)$$4 * 0.08F));
         }

         if (this.bW == 1 && !this.aU()) {
            this.dL().b(1028, this.dl(), 0);
         }
      }

      this.a(bmu.a, new emc(0.0, 0.1F, 0.0));
      if (this.bW == 200 && this.dL() instanceof ane) {
         if ($$3) {
            bme.a((ane)this.dL(), this.dj(), aup.d((float)$$4 * 0.2F));
         }

         if (this.co != null) {
            this.co.a(this);
         }

         this.a(blw.c.a);
         this.b(dnz.p);
      }
   }

   public int A() {
      if (this.ct[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = aup.d(60.0F * aup.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = aup.d(60.0F * aup.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = aup.d(40.0F * aup.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = aup.d(40.0F * aup.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = aup.d(20.0F * aup.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = aup.d(20.0F * aup.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.dL().A_() + 10, this.dL().a(doy.a.f, new hx($$3, 0, $$4)).v() + $$1);
            this.ct[$$0] = new efm($$3, $$9, $$4);
         }

         this.cu[0] = 6146;
         this.cu[1] = 8197;
         this.cu[2] = 8202;
         this.cu[3] = 16404;
         this.cu[4] = 32808;
         this.cu[5] = 32848;
         this.cu[6] = 65696;
         this.cu[7] = 131392;
         this.cu[8] = 131712;
         this.cu[9] = 263424;
         this.cu[10] = 526848;
         this.cu[11] = 525313;
         this.cu[12] = 1581057;
         this.cu[13] = 3166214;
         this.cu[14] = 2138120;
         this.cu[15] = 6373424;
         this.cu[16] = 4358208;
         this.cu[17] = 12910976;
         this.cu[18] = 9044480;
         this.cu[19] = 9706496;
         this.cu[20] = 15216640;
         this.cu[21] = 13688832;
         this.cu[22] = 11763712;
         this.cu[23] = 8257536;
      }

      return this.r(this.dq(), this.ds(), this.dw());
   }

   public int r(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      efm $$5 = new efm(aup.a($$0), aup.a($$1), aup.a($$2));
      int $$6 = 0;
      if (this.co == null || this.co.e() == 0) {
         $$6 = 12;
      }

      for (int $$7 = $$6; $$7 < 24; $$7++) {
         if (this.ct[$$7] != null) {
            float $$8 = this.ct[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public efo a(int $$0, int $$1, @Nullable efm $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         efm $$4 = this.ct[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      efm $$5 = this.ct[$$0];
      efm $$6 = this.ct[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cv.a();
      this.cv.a($$5);
      efm $$7 = $$5;
      int $$8 = 0;
      if (this.co == null || this.co.e() == 0) {
         $$8 = 12;
      }

      while (!this.cv.e()) {
         efm $$9 = this.cv.c();
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
            if (this.ct[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for (int $$12 = $$8; $$12 < 24; $$12++) {
            if ((this.cu[$$10] & 1 << $$12) > 0) {
               efm $$13 = this.ct[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.cv.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.cv.a($$13);
                     }
                  }
               }
            }
         }
      }

      if ($$7 == $$5) {
         return null;
      } else {
         bZ.debug("Failed to find path from {} to {}", $$0, $$1);
         if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
         }

         return this.a($$5, $$7);
      }
   }

   private efo a(efm $$0, efm $$1) {
      List<efm> $$2 = Lists.newArrayList();
      efm $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new efo($$2, new hx($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cq.a().i().b());
      $$0.a("DragonDeathTime", this.bW);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cq.a(cbl.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bW = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dx() {
   }

   public cat[] gb() {
      return this.cg;
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public aru db() {
      return aru.f;
   }

   @Override
   protected ars y() {
      return art.hL;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.hQ;
   }

   @Override
   protected float eW() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      cbf $$3 = this.cq.a();
      cbl<? extends cbf> $$4 = $$3.i();
      double $$7;
      if ($$4 == cbl.d || $$4 == cbl.e) {
         hx $$5 = this.dL().a(doy.a.f, dsb.a(this.cp));
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

   public emc C(float $$0) {
      cbf $$1 = this.cq.a();
      cbl<? extends cbf> $$2 = $$1.i();
      emc $$8;
      if ($$2 == cbl.d || $$2 == cbl.e) {
         hx $$3 = this.dL().a(doy.a.f, dsb.a(this.cp));
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

   public void a(cau $$0, hx $$1, bkv $$2) {
      cfq $$3;
      if ($$2.d() instanceof cfq) {
         $$3 = (cfq)$$2.d();
      } else {
         $$3 = this.dL().a(ca, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.bY) {
         this.a(this.e, this.dM().d($$0, $$3), 10.0F);
      }

      this.cq.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(agn<?> $$0) {
      if (b.equals($$0) && this.dL().B) {
         this.cq.a(cbl.a(this.an().b(b)));
      }

      super.a($$0);
   }

   public cbm gc() {
      return this.cq;
   }

   @Nullable
   public dnb gd() {
      return this.co;
   }

   @Override
   public boolean b(blj $$0, @Nullable blw $$1) {
      return false;
   }

   @Override
   protected boolean n(blw $$0) {
      return false;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public void a(zc $$0) {
      super.a($$0);
      cat[] $$1 = this.gb();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.a());
      }
   }

   @Override
   public boolean c(bmo $$0) {
      return $$0.eo();
   }
}
