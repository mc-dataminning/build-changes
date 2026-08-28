import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cho extends bte implements cjj {
   private static final Logger cf = LogUtils.getLogger();
   public static final ajp<Integer> b = ajt.a(cho.class, ajr.b);
   private static final cdt cg = cdt.a().a(64.0);
   private static final int ch = 200;
   private static final int ci = 400;
   private static final float cj = 0.25F;
   private static final String ck = "DragonDeathTime";
   private static final String cl = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final chm[] cm;
   public final chm e;
   private final chm cn;
   private final chm co;
   private final chm cp;
   private final chm cq;
   private final chm cr;
   private final chm cs;
   private final chm ct;
   public float bZ;
   public float ca;
   public boolean cb;
   public int cc;
   public float cd;
   @Nullable
   public chn ce;
   @Nullable
   private dwj cu;
   private ja cv = ja.c;
   private final cif cw;
   private int cx = 100;
   private float cy;
   private final eov[] cz = new eov[24];
   private final int[] cA = new int[24];
   private final eot cC = new eot();

   public cho(bsn<? extends cho> $$0, dcg $$1) {
      super(bsn.F, $$1);
      this.e = new chm(this, "head", 1.0F, 1.0F);
      this.cn = new chm(this, "neck", 3.0F, 3.0F);
      this.co = new chm(this, "body", 5.0F, 3.0F);
      this.cp = new chm(this, "tail", 2.0F, 2.0F);
      this.cq = new chm(this, "tail", 2.0F, 2.0F);
      this.cr = new chm(this, "tail", 2.0F, 2.0F);
      this.cs = new chm(this, "wing", 4.0F, 2.0F);
      this.ct = new chm(this, "wing", 4.0F, 2.0F);
      this.cm = new chm[]{this.e, this.cn, this.co, this.cp, this.cq, this.cr, this.cs, this.ct};
      this.u(this.eP());
      this.ag = true;
      this.au = true;
      this.cw = new cif(this);
   }

   public void a(dwj $$0) {
      this.cu = $$0;
   }

   @Override
   public void c(ja $$0) {
      this.cv = $$0;
   }

   public ja s() {
      return this.cv;
   }

   public static buj.a t() {
      return bte.A().a(buk.s, 200.0);
   }

   @Override
   public boolean aX() {
      float $$0 = ayg.b(this.ca * (float) (Math.PI * 2));
      float $$1 = ayg.b(this.bZ * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aW() {
      if (this.dR().B && !this.aY()) {
         this.dR().a(this.dw(), this.dy(), this.dC(), avh.id, this.dg(), 5.0F, 0.8F + this.ah.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, cie.k.b());
   }

   public double[] a(int $$0, float $$1) {
      if (this.ez()) {
         $$1 = 0.0F;
      }

      $$1 = 1.0F - $$1;
      int $$2 = this.d - $$0 & 63;
      int $$3 = this.d - $$0 - 1 & 63;
      double[] $$4 = new double[3];
      double $$5 = this.c[$$2][0];
      double $$6 = ayg.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = ayg.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void m_() {
      this.aK();
      if (this.dR().B) {
         this.u(this.ey());
         if (!this.aY() && !this.cw.a().a() && --this.cx < 0) {
            this.dR().a(this.dw(), this.dy(), this.dC(), avh.ie, this.dg(), 2.5F, 0.8F + this.ah.i() * 0.3F, false);
            this.cx = 200 + this.ah.a(200);
         }
      }

      if (this.cu == null && this.dR() instanceof aqm $$0) {
         dwj $$1 = $$0.D();
         if ($$1 != null && this.cB().equals($$1.i())) {
            this.cu = $$1;
         }
      }

      this.bZ = this.ca;
      if (this.ez()) {
         float $$2 = (this.ah.i() - 0.5F) * 8.0F;
         float $$3 = (this.ah.i() - 0.5F) * 4.0F;
         float $$4 = (this.ah.i() - 0.5F) * 8.0F;
         this.dR().a(lj.w, this.dw() + (double)$$2, this.dy() + 2.0 + (double)$$3, this.dC() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gn();
         ewh $$5 = this.du();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.cw.a().a()) {
            this.ca += 0.1F;
         } else if (this.cb) {
            this.ca += $$6 * 0.5F;
         } else {
            this.ca += $$6;
         }

         this.s(ayg.g(this.dH()));
         if (this.gc()) {
            this.ca = 0.5F;
         } else {
            if (this.d < 0) {
               for (int $$7 = 0; $$7 < this.c.length; $$7++) {
                  this.c[$$7][0] = (double)this.dH();
                  this.c[$$7][1] = this.dy();
               }
            }

            if (++this.d == this.c.length) {
               this.d = 0;
            }

            this.c[this.d][0] = (double)this.dH();
            this.c[this.d][1] = this.dy();
            if (this.dR().B) {
               if (this.bs > 0) {
                  this.a(this.bs, this.bt, this.bu, this.bv, this.bw, this.bx);
                  this.bs--;
               }

               this.cw.a().b();
            } else {
               chy $$8 = this.cw.a();
               $$8.c();
               if (this.cw.a() != $$8) {
                  $$8 = this.cw.a();
                  $$8.c();
               }

               ewh $$9 = $$8.g();
               if ($$9 != null) {
                  double $$10 = $$9.c - this.dw();
                  double $$11 = $$9.d - this.dy();
                  double $$12 = $$9.e - this.dC();
                  double $$13 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  float $$14 = $$8.f();
                  double $$15 = Math.sqrt($$10 * $$10 + $$12 * $$12);
                  if ($$15 > 0.0) {
                     $$11 = ayg.a($$11 / $$15, (double)(-$$14), (double)$$14);
                  }

                  this.j(this.du().b(0.0, $$11 * 0.01, 0.0));
                  this.s(ayg.g(this.dH()));
                  ewh $$16 = $$9.a(this.dw(), this.dy(), this.dC()).d();
                  ewh $$17 = new ewh((double)ayg.a(this.dH() * (float) (Math.PI / 180.0)), this.du().d, (double)(-ayg.b(this.dH() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$18 = Math.max(((float)$$17.b($$16) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$10) > 1.0E-5F || Math.abs($$12) > 1.0E-5F) {
                     float $$19 = ayg.a(ayg.g(180.0F - (float)ayg.d($$10, $$12) * (180.0F / (float)Math.PI) - this.dH()), -50.0F, 50.0F);
                     this.cd *= 0.8F;
                     this.cd = this.cd + $$19 * $$8.h();
                     this.s(this.dH() + this.cd * 0.1F);
                  }

                  float $$20 = (float)(2.0 / ($$13 + 1.0));
                  float $$21 = 0.06F;
                  this.a(0.06F * ($$18 * $$20 + (1.0F - $$20)), new ewh(0.0, 0.0, -1.0));
                  if (this.cb) {
                     this.a(bth.a, this.du().a(0.8F));
                  } else {
                     this.a(bth.a, this.du());
                  }

                  ewh $$22 = this.du().d();
                  double $$23 = 0.8 + 0.15 * ($$22.b($$17) + 1.0) / 2.0;
                  this.j(this.du().d($$23, 0.91F, $$23));
               }
            }

            this.aZ = this.dH();
            ewh[] $$24 = new ewh[this.cm.length];

            for (int $$25 = 0; $$25 < this.cm.length; $$25++) {
               $$24[$$25] = new ewh(this.cm[$$25].dw(), this.cm[$$25].dy(), this.cm[$$25].dC());
            }

            float $$26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$27 = ayg.b($$26);
            float $$28 = ayg.a($$26);
            float $$29 = this.dH() * (float) (Math.PI / 180.0);
            float $$30 = ayg.a($$29);
            float $$31 = ayg.b($$29);
            this.a(this.co, (double)($$30 * 0.5F), 0.0, (double)(-$$31 * 0.5F));
            this.a(this.cs, (double)($$31 * 4.5F), 2.0, (double)($$30 * 4.5F));
            this.a(this.ct, (double)($$31 * -4.5F), 2.0, (double)($$30 * -4.5F));
            if (this.dR() instanceof aqm $$32 && this.aP == 0) {
               this.a($$32, $$32.a(this, this.cs.cM().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bsm.e));
               this.a($$32, $$32.a(this, this.ct.cM().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bsm.e));
               this.b($$32.a(this, this.e.cM().g(1.0), bsm.e));
               this.b($$32.a(this, this.cn.cM().g(1.0), bsm.e));
            }

            float $$33 = ayg.a(this.dH() * (float) (Math.PI / 180.0) - this.cd * 0.01F);
            float $$34 = ayg.b(this.dH() * (float) (Math.PI / 180.0) - this.cd * 0.01F);
            float $$35 = this.gm();
            this.a(this.e, (double)($$33 * 6.5F * $$27), (double)($$35 + $$28 * 6.5F), (double)(-$$34 * 6.5F * $$27));
            this.a(this.cn, (double)($$33 * 5.5F * $$27), (double)($$35 + $$28 * 5.5F), (double)(-$$34 * 5.5F * $$27));
            double[] $$36 = this.a(5, 1.0F);

            for (int $$37 = 0; $$37 < 3; $$37++) {
               chm $$38 = null;
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
               float $$40 = this.dH() * (float) (Math.PI / 180.0) + this.i($$39[0] - $$36[0]) * (float) (Math.PI / 180.0);
               float $$41 = ayg.a($$40);
               float $$42 = ayg.b($$40);
               float $$43 = 1.5F;
               float $$44 = (float)($$37 + 1) * 2.0F;
               this.a(
                  $$38,
                  (double)(-($$30 * 1.5F + $$41 * $$44) * $$27),
                  $$39[1] - $$36[1] - (double)(($$44 + 1.5F) * $$28) + 1.5,
                  (double)(($$31 * 1.5F + $$42 * $$44) * $$27)
               );
            }

            if (!this.dR().B) {
               this.cb = this.b(this.e.cM()) | this.b(this.cn.cM()) | this.b(this.co.cM());
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

   private void a(chm $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dw() + $$1, this.dy() + $$2, this.dC() + $$3);
   }

   private float gm() {
      if (this.cw.a().a()) {
         return -1.0F;
      } else {
         double[] $$0 = this.a(5, 1.0F);
         double[] $$1 = this.a(0, 1.0F);
         return (float)($$0[1] - $$1[1]);
      }
   }

   private void gn() {
      if (this.ce != null) {
         if (this.ce.dM()) {
            this.ce = null;
         } else if (this.ai % 10 == 0 && this.ey() < this.eP()) {
            this.u(this.ey() + 1.0F);
         }
      }

      if (this.ah.a(10) == 0) {
         List<chn> $$0 = this.dR().a(chn.class, this.cM().g(32.0));
         chn $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (chn $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.ce = $$1;
      }
   }

   private void a(aqm $$0, List<bsh> $$1) {
      double $$2 = (this.co.cM().a + this.co.cM().d) / 2.0;
      double $$3 = (this.co.cM().c + this.co.cM().f) / 2.0;

      for (bsh $$4 : $$1) {
         if ($$4 instanceof btc) {
            btc $$5 = (btc)$$4;
            double $$6 = $$4.dw() - $$2;
            double $$7 = $$4.dC() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.j($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.cw.a().a() && $$5.el() < $$4.ai - 2) {
               bra $$9 = this.dS().b((btc)this);
               $$4.a($$9, 5.0F);
               czo.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(List<bsh> $$0) {
      for (bsh $$1 : $$0) {
         if ($$1 instanceof btc) {
            bra $$2 = this.dS().b((btc)this);
            $$1.a($$2, 10.0F);
            if (this.dR() instanceof aqm $$3) {
               czo.a($$3, $$1, $$2);
            }
         }
      }
   }

   private float i(double $$0) {
      return (float)ayg.d($$0);
   }

   private boolean b(ewc $$0) {
      int $$1 = ayg.a($$0.a);
      int $$2 = ayg.a($$0.b);
      int $$3 = ayg.a($$0.c);
      int $$4 = ayg.a($$0.d);
      int $$5 = ayg.a($$0.e);
      int $$6 = ayg.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               ja $$12 = new ja($$9, $$10, $$11);
               dsl $$13 = this.dR().a_($$12);
               if (!$$13.i() && !$$13.a(avw.aD)) {
                  if (this.dR().ab().b(dcc.c) && !$$13.a(avw.aC)) {
                     $$8 = this.dR().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         ja $$14 = new ja($$1 + this.ah.a($$4 - $$1 + 1), $$2 + this.ah.a($$5 - $$2 + 1), $$3 + this.ah.a($$6 - $$3 + 1));
         this.dR().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(chm $$0, bra $$1, float $$2) {
      if (this.cw.a().i() == cie.j) {
         return false;
      } else {
         $$2 = this.cw.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cml || $$1.a(avy.z)) {
               float $$3 = this.ey();
               this.g($$1, $$2);
               if (this.ez() && !this.cw.a().a()) {
                  this.u(1.0F);
                  this.cw.a(cie.j);
               }

               if (this.cw.a().a()) {
                  this.cy = this.cy + $$3 - this.ey();
                  if (this.cy > 0.25F * this.eP()) {
                     this.cy = 0.0F;
                     this.cw.a(cie.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      return !this.dR().B ? this.a(this.co, $$0, $$1) : false;
   }

   protected boolean g(bra $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void ap() {
      this.a(bsh.d.a);
      this.a(dxh.p);
      if (this.cu != null) {
         this.cu.b(this);
         this.cu.a(this);
      }
   }

   @Override
   protected void ef() {
      if (this.cu != null) {
         this.cu.b(this);
      }

      this.cc++;
      if (this.cc >= 180 && this.cc <= 200) {
         float $$0 = (this.ah.i() - 0.5F) * 8.0F;
         float $$1 = (this.ah.i() - 0.5F) * 4.0F;
         float $$2 = (this.ah.i() - 0.5F) * 8.0F;
         this.dR().a(lj.v, this.dw() + (double)$$0, this.dy() + 2.0 + (double)$$1, this.dC() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dR().ab().b(dcc.f);
      int $$4 = 500;
      if (this.cu != null && !this.cu.f()) {
         $$4 = 12000;
      }

      if (this.dR() instanceof aqm) {
         if (this.cc > 150 && this.cc % 5 == 0 && $$3) {
            bss.a((aqm)this.dR(), this.dp(), ayg.d((float)$$4 * 0.08F));
         }

         if (this.cc == 1 && !this.aY()) {
            this.dR().b(1028, this.dr(), 0);
         }
      }

      this.a(bth.a, new ewh(0.0, 0.1F, 0.0));
      if (this.cc == 200 && this.dR() instanceof aqm) {
         if ($$3) {
            bss.a((aqm)this.dR(), this.dp(), ayg.d((float)$$4 * 0.2F));
         }

         if (this.cu != null) {
            this.cu.a(this);
         }

         this.a(bsh.d.a);
         this.a(dxh.p);
      }
   }

   public int x() {
      if (this.cz[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = ayg.d(60.0F * ayg.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = ayg.d(60.0F * ayg.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = ayg.d(40.0F * ayg.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = ayg.d(40.0F * ayg.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = ayg.d(20.0F * ayg.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = ayg.d(20.0F * ayg.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.dR().z_() + 10, this.dR().a(dyg.a.f, new ja($$3, 0, $$4)).v() + $$1);
            this.cz[$$0] = new eov($$3, $$9, $$4);
         }

         this.cA[0] = 6146;
         this.cA[1] = 8197;
         this.cA[2] = 8202;
         this.cA[3] = 16404;
         this.cA[4] = 32808;
         this.cA[5] = 32848;
         this.cA[6] = 65696;
         this.cA[7] = 131392;
         this.cA[8] = 131712;
         this.cA[9] = 263424;
         this.cA[10] = 526848;
         this.cA[11] = 525313;
         this.cA[12] = 1581057;
         this.cA[13] = 3166214;
         this.cA[14] = 2138120;
         this.cA[15] = 6373424;
         this.cA[16] = 4358208;
         this.cA[17] = 12910976;
         this.cA[18] = 9044480;
         this.cA[19] = 9706496;
         this.cA[20] = 15216640;
         this.cA[21] = 13688832;
         this.cA[22] = 11763712;
         this.cA[23] = 8257536;
      }

      return this.r(this.dw(), this.dy(), this.dC());
   }

   public int r(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      eov $$5 = new eov(ayg.a($$0), ayg.a($$1), ayg.a($$2));
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
   public eox a(int $$0, int $$1, @Nullable eov $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         eov $$4 = this.cz[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      eov $$5 = this.cz[$$0];
      eov $$6 = this.cz[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cC.a();
      this.cC.a($$5);
      eov $$7 = $$5;
      int $$8 = 0;
      if (this.cu == null || this.cu.e() == 0) {
         $$8 = 12;
      }

      while (!this.cC.e()) {
         eov $$9 = this.cC.c();
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
            if ((this.cA[$$10] & 1 << $$12) > 0) {
               eov $$13 = this.cz[$$12];
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

   private eox a(eov $$0, eov $$1) {
      List<eov> $$2 = Lists.newArrayList();
      eov $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new eox($$2, new ja($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cw.a().i().b());
      $$0.a("DragonDeathTime", this.cc);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cw.a(cie.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.cc = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dD() {
   }

   public chm[] gj() {
      return this.cm;
   }

   @Override
   public boolean bB() {
      return false;
   }

   @Override
   public avi dg() {
      return avi.f;
   }

   @Override
   protected avg v() {
      return avh.ia;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.if;
   }

   @Override
   protected float fc() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      chy $$3 = this.cw.a();
      cie<? extends chy> $$4 = $$3.i();
      double $$7;
      if ($$4 == cie.d || $$4 == cie.e) {
         ja $$5 = this.dR().a(dyg.a.f, ebk.a(this.cv));
         double $$6 = Math.max(Math.sqrt($$5.b(this.dp())) / 4.0, 1.0);
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

   public ewh G(float $$0) {
      chy $$1 = this.cw.a();
      cie<? extends chy> $$2 = $$1.i();
      ewh $$8;
      if ($$2 == cie.d || $$2 == cie.e) {
         ja $$3 = this.dR().a(dyg.a.f, ebk.a(this.cv));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.dp())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dJ();
         float $$7 = 1.5F;
         this.t(-$$5 * 1.5F * 5.0F);
         $$8 = this.g($$0);
         this.t($$6);
      } else if ($$1.a()) {
         float $$9 = this.dJ();
         float $$10 = 1.5F;
         this.t(-45.0F);
         $$8 = this.g($$0);
         this.t($$9);
      } else {
         $$8 = this.g($$0);
      }

      return $$8;
   }

   public void a(chn $$0, ja $$1, bra $$2) {
      cml $$3;
      if ($$2.d() instanceof cml) {
         $$3 = (cml)$$2.d();
      } else {
         $$3 = this.dR().a(cg, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.ce) {
         this.a(this.e, this.dS().d($$0, $$3), 10.0F);
      }

      this.cw.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (b.equals($$0) && this.dR().B) {
         this.cw.a(cie.a(this.ar().a(b)));
      }

      super.a($$0);
   }

   public cif gk() {
      return this.cw;
   }

   @Nullable
   public dwj gl() {
      return this.cu;
   }

   @Override
   public boolean b(brp $$0, @Nullable bsh $$1) {
      return false;
   }

   @Override
   protected boolean o(bsh $$0) {
      return false;
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      chm[] $$1 = this.gj();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b());
      }
   }

   @Override
   public boolean c(btc $$0) {
      return $$0.er();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
