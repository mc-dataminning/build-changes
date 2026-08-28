import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cia extends btp implements cjv {
   private static final Logger cf = LogUtils.getLogger();
   public static final ajw<Integer> b = aka.a(cia.class, ajy.b);
   private static final cef cg = cef.a().a(64.0);
   private static final int ch = 200;
   private static final int ci = 400;
   private static final float cj = 0.25F;
   private static final String ck = "DragonDeathTime";
   private static final String cl = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final chy[] cm;
   public final chy e;
   private final chy cn;
   private final chy co;
   private final chy cp;
   private final chy cq;
   private final chy cr;
   private final chy cs;
   private final chy ct;
   public float bZ;
   public float ca;
   public boolean cb;
   public int cc;
   public float cd;
   @Nullable
   public chz ce;
   @Nullable
   private dxb cu;
   private jd cv = jd.c;
   private final cir cw;
   private int cx = 100;
   private float cy;
   private final epo[] cz = new epo[24];
   private final int[] cB = new int[24];
   private final epm cC = new epm();

   public cia(bsx<? extends cia> $$0, dcw $$1) {
      super(bsx.F, $$1);
      this.e = new chy(this, "head", 1.0F, 1.0F);
      this.cn = new chy(this, "neck", 3.0F, 3.0F);
      this.co = new chy(this, "body", 5.0F, 3.0F);
      this.cp = new chy(this, "tail", 2.0F, 2.0F);
      this.cq = new chy(this, "tail", 2.0F, 2.0F);
      this.cr = new chy(this, "tail", 2.0F, 2.0F);
      this.cs = new chy(this, "wing", 4.0F, 2.0F);
      this.ct = new chy(this, "wing", 4.0F, 2.0F);
      this.cm = new chy[]{this.e, this.cn, this.co, this.cp, this.cq, this.cr, this.cs, this.ct};
      this.v(this.eO());
      this.ag = true;
      this.au = true;
      this.cw = new cir(this);
   }

   public void a(dxb $$0) {
      this.cu = $$0;
   }

   @Override
   public void c(jd $$0) {
      this.cv = $$0;
   }

   public jd s() {
      return this.cv;
   }

   public static buv.a t() {
      return btp.C().a(buw.s, 200.0);
   }

   @Override
   public boolean aW() {
      float $$0 = ayo.b(this.ca * (float) (Math.PI * 2));
      float $$1 = ayo.b(this.bZ * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aV() {
      if (this.dP().B && !this.aX()) {
         this.dP().a(this.du(), this.dw(), this.dA(), avp.id, this.df(), 5.0F, 0.8F + this.ah.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(b, ciq.k.b());
   }

   public double[] a(int $$0, float $$1) {
      if (this.ey()) {
         $$1 = 0.0F;
      }

      $$1 = 1.0F - $$1;
      int $$2 = this.d - $$0 & 63;
      int $$3 = this.d - $$0 - 1 & 63;
      double[] $$4 = new double[3];
      double $$5 = this.c[$$2][0];
      double $$6 = ayo.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = ayo.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void m_() {
      this.aJ();
      if (this.dP().B) {
         this.v(this.ex());
         if (!this.aX() && !this.cw.a().a() && --this.cx < 0) {
            this.dP().a(this.du(), this.dw(), this.dA(), avp.ie, this.df(), 2.5F, 0.8F + this.ah.i() * 0.3F, false);
            this.cx = 200 + this.ah.a(200);
         }
      }

      if (this.cu == null && this.dP() instanceof aqu $$0) {
         dxb $$1 = $$0.D();
         if ($$1 != null && this.cA().equals($$1.i())) {
            this.cu = $$1;
         }
      }

      this.bZ = this.ca;
      if (this.ey()) {
         float $$2 = (this.ah.i() - 0.5F) * 8.0F;
         float $$3 = (this.ah.i() - 0.5F) * 4.0F;
         float $$4 = (this.ah.i() - 0.5F) * 8.0F;
         this.dP().a(lm.w, this.du() + (double)$$2, this.dw() + 2.0 + (double)$$3, this.dA() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gl();
         exa $$5 = this.ds();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.cw.a().a()) {
            this.ca += 0.1F;
         } else if (this.cb) {
            this.ca += $$6 * 0.5F;
         } else {
            this.ca += $$6;
         }

         this.t(ayo.g(this.dF()));
         if (this.ga()) {
            this.ca = 0.5F;
         } else {
            if (this.d < 0) {
               for (int $$7 = 0; $$7 < this.c.length; $$7++) {
                  this.c[$$7][0] = (double)this.dF();
                  this.c[$$7][1] = this.dw();
               }
            }

            if (++this.d == this.c.length) {
               this.d = 0;
            }

            this.c[this.d][0] = (double)this.dF();
            this.c[this.d][1] = this.dw();
            if (this.dP().B) {
               if (this.br > 0) {
                  this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
                  this.br--;
               }

               this.cw.a().b();
            } else {
               cik $$8 = this.cw.a();
               $$8.c();
               if (this.cw.a() != $$8) {
                  $$8 = this.cw.a();
                  $$8.c();
               }

               exa $$9 = $$8.g();
               if ($$9 != null) {
                  double $$10 = $$9.c - this.du();
                  double $$11 = $$9.d - this.dw();
                  double $$12 = $$9.e - this.dA();
                  double $$13 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  float $$14 = $$8.f();
                  double $$15 = Math.sqrt($$10 * $$10 + $$12 * $$12);
                  if ($$15 > 0.0) {
                     $$11 = ayo.a($$11 / $$15, (double)(-$$14), (double)$$14);
                  }

                  this.i(this.ds().b(0.0, $$11 * 0.01, 0.0));
                  this.t(ayo.g(this.dF()));
                  exa $$16 = $$9.a(this.du(), this.dw(), this.dA()).d();
                  exa $$17 = new exa((double)ayo.a(this.dF() * (float) (Math.PI / 180.0)), this.ds().d, (double)(-ayo.b(this.dF() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$18 = Math.max(((float)$$17.b($$16) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$10) > 1.0E-5F || Math.abs($$12) > 1.0E-5F) {
                     float $$19 = ayo.a(ayo.g(180.0F - (float)ayo.d($$10, $$12) * (180.0F / (float)Math.PI) - this.dF()), -50.0F, 50.0F);
                     this.cd *= 0.8F;
                     this.cd = this.cd + $$19 * $$8.h();
                     this.t(this.dF() + this.cd * 0.1F);
                  }

                  float $$20 = (float)(2.0 / ($$13 + 1.0));
                  float $$21 = 0.06F;
                  this.a(0.06F * ($$18 * $$20 + (1.0F - $$20)), new exa(0.0, 0.0, -1.0));
                  if (this.cb) {
                     this.a(bts.a, this.ds().a(0.8F));
                  } else {
                     this.a(bts.a, this.ds());
                  }

                  exa $$22 = this.ds().d();
                  double $$23 = 0.8 + 0.15 * ($$22.b($$17) + 1.0) / 2.0;
                  this.i(this.ds().d($$23, 0.91F, $$23));
               }
            }

            this.aY = this.dF();
            exa[] $$24 = new exa[this.cm.length];

            for (int $$25 = 0; $$25 < this.cm.length; $$25++) {
               $$24[$$25] = new exa(this.cm[$$25].du(), this.cm[$$25].dw(), this.cm[$$25].dA());
            }

            float $$26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$27 = ayo.b($$26);
            float $$28 = ayo.a($$26);
            float $$29 = this.dF() * (float) (Math.PI / 180.0);
            float $$30 = ayo.a($$29);
            float $$31 = ayo.b($$29);
            this.a(this.co, (double)($$30 * 0.5F), 0.0, (double)(-$$31 * 0.5F));
            this.a(this.cs, (double)($$31 * 4.5F), 2.0, (double)($$30 * 4.5F));
            this.a(this.ct, (double)($$31 * -4.5F), 2.0, (double)($$30 * -4.5F));
            if (this.dP() instanceof aqu $$32 && this.aO == 0) {
               this.a($$32, $$32.a(this, this.cs.cL().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bsw.e));
               this.a($$32, $$32.a(this, this.ct.cL().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bsw.e));
               this.b($$32.a(this, this.e.cL().g(1.0), bsw.e));
               this.b($$32.a(this, this.cn.cL().g(1.0), bsw.e));
            }

            float $$33 = ayo.a(this.dF() * (float) (Math.PI / 180.0) - this.cd * 0.01F);
            float $$34 = ayo.b(this.dF() * (float) (Math.PI / 180.0) - this.cd * 0.01F);
            float $$35 = this.gk();
            this.a(this.e, (double)($$33 * 6.5F * $$27), (double)($$35 + $$28 * 6.5F), (double)(-$$34 * 6.5F * $$27));
            this.a(this.cn, (double)($$33 * 5.5F * $$27), (double)($$35 + $$28 * 5.5F), (double)(-$$34 * 5.5F * $$27));
            double[] $$36 = this.a(5, 1.0F);

            for (int $$37 = 0; $$37 < 3; $$37++) {
               chy $$38 = null;
               if ($$37 == 0) {
                  $$38 = this.cp;
               }

               if ($$37 == 1) {
                  $$38 = this.cq;
               }

               if ($$37 == 2) {
                  $$38 = this.cr;
               }

               double[] $$39 = this.a(12 + $$37 * 2, 1.0F);
               float $$40 = this.dF() * (float) (Math.PI / 180.0) + this.i($$39[0] - $$36[0]) * (float) (Math.PI / 180.0);
               float $$41 = ayo.a($$40);
               float $$42 = ayo.b($$40);
               float $$43 = 1.5F;
               float $$44 = (float)($$37 + 1) * 2.0F;
               this.a(
                  $$38,
                  (double)(-($$30 * 1.5F + $$41 * $$44) * $$27),
                  $$39[1] - $$36[1] - (double)(($$44 + 1.5F) * $$28) + 1.5,
                  (double)(($$31 * 1.5F + $$42 * $$44) * $$27)
               );
            }

            if (!this.dP().B) {
               this.cb = this.b(this.e.cL()) | this.b(this.cn.cL()) | this.b(this.co.cL());
               if (this.cu != null) {
                  this.cu.b(this);
               }
            }

            for (int $$45 = 0; $$45 < this.cm.length; $$45++) {
               this.cm[$$45].L = $$24[$$45].c;
               this.cm[$$45].M = $$24[$$45].d;
               this.cm[$$45].N = $$24[$$45].e;
               this.cm[$$45].ad = $$24[$$45].c;
               this.cm[$$45].ae = $$24[$$45].d;
               this.cm[$$45].af = $$24[$$45].e;
            }
         }
      }
   }

   private void a(chy $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.du() + $$1, this.dw() + $$2, this.dA() + $$3);
   }

   private float gk() {
      if (this.cw.a().a()) {
         return -1.0F;
      } else {
         double[] $$0 = this.a(5, 1.0F);
         double[] $$1 = this.a(0, 1.0F);
         return (float)($$0[1] - $$1[1]);
      }
   }

   private void gl() {
      if (this.ce != null) {
         if (this.ce.dK()) {
            this.ce = null;
         } else if (this.ai % 10 == 0 && this.ex() < this.eO()) {
            this.v(this.ex() + 1.0F);
         }
      }

      if (this.ah.a(10) == 0) {
         List<chz> $$0 = this.dP().a(chz.class, this.cL().g(32.0));
         chz $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (chz $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.ce = $$1;
      }
   }

   private void a(aqu $$0, List<bsr> $$1) {
      double $$2 = (this.co.cL().a + this.co.cL().d) / 2.0;
      double $$3 = (this.co.cL().c + this.co.cL().f) / 2.0;

      for (bsr $$4 : $$1) {
         if ($$4 instanceof btn) {
            btn $$5 = (btn)$$4;
            double $$6 = $$4.du() - $$2;
            double $$7 = $$4.dA() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.j($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.cw.a().a() && $$5.ek() < $$4.ai - 2) {
               brk $$9 = this.dQ().b((btn)this);
               $$4.a($$9, 5.0F);
               dae.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(List<bsr> $$0) {
      for (bsr $$1 : $$0) {
         if ($$1 instanceof btn) {
            brk $$2 = this.dQ().b((btn)this);
            $$1.a($$2, 10.0F);
            if (this.dP() instanceof aqu $$3) {
               dae.a($$3, $$1, $$2);
            }
         }
      }
   }

   private float i(double $$0) {
      return (float)ayo.d($$0);
   }

   private boolean b(ewv $$0) {
      int $$1 = ayo.a($$0.a);
      int $$2 = ayo.a($$0.b);
      int $$3 = ayo.a($$0.c);
      int $$4 = ayo.a($$0.d);
      int $$5 = ayo.a($$0.e);
      int $$6 = ayo.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               jd $$12 = new jd($$9, $$10, $$11);
               dtc $$13 = this.dP().a_($$12);
               if (!$$13.i() && !$$13.a(awe.aD)) {
                  if (this.dP().ab().b(dcs.c) && !$$13.a(awe.aC)) {
                     $$8 = this.dP().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         jd $$14 = new jd($$1 + this.ah.a($$4 - $$1 + 1), $$2 + this.ah.a($$5 - $$2 + 1), $$3 + this.ah.a($$6 - $$3 + 1));
         this.dP().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(chy $$0, brk $$1, float $$2) {
      if (this.cw.a().i() == ciq.j) {
         return false;
      } else {
         $$2 = this.cw.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cmx || $$1.a(awg.y)) {
               float $$3 = this.ex();
               this.g($$1, $$2);
               if (this.ey() && !this.cw.a().a()) {
                  this.v(1.0F);
                  this.cw.a(ciq.j);
               }

               if (this.cw.a().a()) {
                  this.cy = this.cy + $$3 - this.ex();
                  if (this.cy > 0.25F * this.eO()) {
                     this.cy = 0.0F;
                     this.cw.a(ciq.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      return !this.dP().B ? this.a(this.co, $$0, $$1) : false;
   }

   protected boolean g(brk $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void ap() {
      this.a(bsr.c.a);
      this.a(dxz.p);
      if (this.cu != null) {
         this.cu.b(this);
         this.cu.a(this);
      }
   }

   @Override
   protected void ee() {
      if (this.cu != null) {
         this.cu.b(this);
      }

      this.cc++;
      if (this.cc >= 180 && this.cc <= 200) {
         float $$0 = (this.ah.i() - 0.5F) * 8.0F;
         float $$1 = (this.ah.i() - 0.5F) * 4.0F;
         float $$2 = (this.ah.i() - 0.5F) * 8.0F;
         this.dP().a(lm.v, this.du() + (double)$$0, this.dw() + 2.0 + (double)$$1, this.dA() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dP().ab().b(dcs.f);
      int $$4 = 500;
      if (this.cu != null && !this.cu.f()) {
         $$4 = 12000;
      }

      if (this.dP() instanceof aqu) {
         if (this.cc > 150 && this.cc % 5 == 0 && $$3) {
            btc.a((aqu)this.dP(), this.dn(), ayo.d((float)$$4 * 0.08F));
         }

         if (this.cc == 1 && !this.aX()) {
            this.dP().b(1028, this.dp(), 0);
         }
      }

      this.a(bts.a, new exa(0.0, 0.1F, 0.0));
      if (this.cc == 200 && this.dP() instanceof aqu) {
         if ($$3) {
            btc.a((aqu)this.dP(), this.dn(), ayo.d((float)$$4 * 0.2F));
         }

         if (this.cu != null) {
            this.cu.a(this);
         }

         this.a(bsr.c.a);
         this.a(dxz.p);
      }
   }

   public int x() {
      if (this.cz[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = ayo.d(60.0F * ayo.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = ayo.d(60.0F * ayo.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = ayo.d(40.0F * ayo.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = ayo.d(40.0F * ayo.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = ayo.d(20.0F * ayo.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = ayo.d(20.0F * ayo.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.dP().z_() + 10, this.dP().a(dyy.a.f, new jd($$3, 0, $$4)).v() + $$1);
            this.cz[$$0] = new epo($$3, $$9, $$4);
         }

         this.cB[0] = 6146;
         this.cB[1] = 8197;
         this.cB[2] = 8202;
         this.cB[3] = 16404;
         this.cB[4] = 32808;
         this.cB[5] = 32848;
         this.cB[6] = 65696;
         this.cB[7] = 131392;
         this.cB[8] = 131712;
         this.cB[9] = 263424;
         this.cB[10] = 526848;
         this.cB[11] = 525313;
         this.cB[12] = 1581057;
         this.cB[13] = 3166214;
         this.cB[14] = 2138120;
         this.cB[15] = 6373424;
         this.cB[16] = 4358208;
         this.cB[17] = 12910976;
         this.cB[18] = 9044480;
         this.cB[19] = 9706496;
         this.cB[20] = 15216640;
         this.cB[21] = 13688832;
         this.cB[22] = 11763712;
         this.cB[23] = 8257536;
      }

      return this.q(this.du(), this.dw(), this.dA());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      epo $$5 = new epo(ayo.a($$0), ayo.a($$1), ayo.a($$2));
      int $$6 = 0;
      if (this.cu == null || this.cu.e() == 0) {
         $$6 = 12;
      }

      for (int $$7 = $$6; $$7 < 24; $$7++) {
         if (this.cz[$$7] != null) {
            float $$8 = this.cz[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public epq a(int $$0, int $$1, @Nullable epo $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         epo $$4 = this.cz[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      epo $$5 = this.cz[$$0];
      epo $$6 = this.cz[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cC.a();
      this.cC.a($$5);
      epo $$7 = $$5;
      int $$8 = 0;
      if (this.cu == null || this.cu.e() == 0) {
         $$8 = 12;
      }

      while (!this.cC.e()) {
         epo $$9 = this.cC.c();
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
            if (this.cz[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for (int $$12 = $$8; $$12 < 24; $$12++) {
            if ((this.cB[$$10] & 1 << $$12) > 0) {
               epo $$13 = this.cz[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.cC.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.cC.a($$13);
                     }
                  }
               }
            }
         }
      }

      if ($$7 == $$5) {
         return null;
      } else {
         cf.debug("Failed to find path from {} to {}", $$0, $$1);
         if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
         }

         return this.a($$5, $$7);
      }
   }

   private epq a(epo $$0, epo $$1) {
      List<epo> $$2 = Lists.newArrayList();
      epo $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new epq($$2, new jd($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cw.a().i().b());
      $$0.a("DragonDeathTime", this.cc);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cw.a(ciq.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.cc = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dB() {
   }

   public chy[] gh() {
      return this.cm;
   }

   @Override
   public boolean bA() {
      return false;
   }

   @Override
   public avq df() {
      return avq.f;
   }

   @Override
   protected avo v() {
      return avp.ia;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.if;
   }

   @Override
   protected float fb() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      cik $$3 = this.cw.a();
      ciq<? extends cik> $$4 = $$3.i();
      double $$7;
      if ($$4 == ciq.d || $$4 == ciq.e) {
         jd $$5 = this.dP().a(dyy.a.f, ecc.a(this.cv));
         double $$6 = Math.max(Math.sqrt($$5.b(this.dn())) / 4.0, 1.0);
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

   public exa H(float $$0) {
      cik $$1 = this.cw.a();
      ciq<? extends cik> $$2 = $$1.i();
      exa $$8;
      if ($$2 == ciq.d || $$2 == ciq.e) {
         jd $$3 = this.dP().a(dyy.a.f, ecc.a(this.cv));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.dn())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dH();
         float $$7 = 1.5F;
         this.u(-$$5 * 1.5F * 5.0F);
         $$8 = this.g($$0);
         this.u($$6);
      } else if ($$1.a()) {
         float $$9 = this.dH();
         float $$10 = 1.5F;
         this.u(-45.0F);
         $$8 = this.g($$0);
         this.u($$9);
      } else {
         $$8 = this.g($$0);
      }

      return $$8;
   }

   public void a(chz $$0, jd $$1, brk $$2) {
      cmx $$3;
      if ($$2.d() instanceof cmx) {
         $$3 = (cmx)$$2.d();
      } else {
         $$3 = this.dP().a(cg, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.ce) {
         this.a(this.e, this.dQ().d($$0, $$3), 10.0F);
      }

      this.cw.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ajw<?> $$0) {
      if (b.equals($$0) && this.dP().B) {
         this.cw.a(ciq.a(this.ar().a(b)));
      }

      super.a($$0);
   }

   public cir gi() {
      return this.cw;
   }

   @Nullable
   public dxb gj() {
      return this.cu;
   }

   @Override
   public boolean b(brz $$0, @Nullable bsr $$1) {
      return false;
   }

   @Override
   protected boolean o(bsr $$0) {
      return false;
   }

   @Override
   public boolean cx() {
      return false;
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      chy[] $$1 = this.gh();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b());
      }
   }

   @Override
   public boolean c(btn $$0) {
      return $$0.eq();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
