import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cid extends btt implements cjx {
   private static final Logger cd = LogUtils.getLogger();
   public static final akk<Integer> b = ako.a(cid.class, akm.b);
   private static final cei ce = cei.a().a(64.0);
   private static final int cf = 200;
   private static final int cg = 400;
   private static final float ch = 0.25F;
   private static final String ci = "DragonDeathTime";
   private static final String cj = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final cib[] ck;
   public final cib e;
   private final cib cl;
   private final cib cm;
   private final cib cn;
   private final cib co;
   private final cib cp;
   private final cib cq;
   private final cib cr;
   public float bX;
   public float bY;
   public boolean bZ;
   public int ca;
   public float cb;
   @Nullable
   public cic cc;
   @Nullable
   private dvz cs;
   private iz ct = iz.c;
   private final ciu cu;
   private int cv = 100;
   private float cw;
   private final eoj[] cx = new eoj[24];
   private final int[] cz = new int[24];
   private final eoh cA = new eoh();

   public cid(btc<? extends cid> $$0, dca $$1) {
      super(btc.F, $$1);
      this.e = new cib(this, "head", 1.0F, 1.0F);
      this.cl = new cib(this, "neck", 3.0F, 3.0F);
      this.cm = new cib(this, "body", 5.0F, 3.0F);
      this.cn = new cib(this, "tail", 2.0F, 2.0F);
      this.co = new cib(this, "tail", 2.0F, 2.0F);
      this.cp = new cib(this, "tail", 2.0F, 2.0F);
      this.cq = new cib(this, "wing", 4.0F, 2.0F);
      this.cr = new cib(this, "wing", 4.0F, 2.0F);
      this.ck = new cib[]{this.e, this.cl, this.cm, this.cn, this.co, this.cp, this.cq, this.cr};
      this.t(this.eR());
      this.ag = true;
      this.au = true;
      this.cu = new ciu(this);
   }

   public void a(dvz $$0) {
      this.cs = $$0;
   }

   @Override
   public void d(iz $$0) {
      this.ct = $$0;
   }

   public iz s() {
      return this.ct;
   }

   public static buy.a u() {
      return btt.A().a(buz.q, 200.0);
   }

   @Override
   public boolean aV() {
      float $$0 = ayz.b(this.bY * (float) (Math.PI * 2));
      float $$1 = ayz.b(this.bX * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aU() {
      if (this.dP().B && !this.aW()) {
         this.dP().a(this.du(), this.dw(), this.dA(), awa.id, this.de(), 5.0F, 0.8F + this.ah.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, cit.k.b());
   }

   public double[] a(int $$0, float $$1) {
      if (this.eB()) {
         $$1 = 0.0F;
      }

      $$1 = 1.0F - $$1;
      int $$2 = this.d - $$0 & 63;
      int $$3 = this.d - $$0 - 1 & 63;
      double[] $$4 = new double[3];
      double $$5 = this.c[$$2][0];
      double $$6 = ayz.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = ayz.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void n_() {
      this.aI();
      if (this.dP().B) {
         this.t(this.eA());
         if (!this.aW() && !this.cu.a().a() && --this.cv < 0) {
            this.dP().a(this.du(), this.dw(), this.dA(), awa.ie, this.de(), 2.5F, 0.8F + this.ah.i() * 0.3F, false);
            this.cv = 200 + this.ah.a(200);
         }
      }

      if (this.cs == null && this.dP() instanceof arf $$0) {
         dvz $$1 = $$0.D();
         if ($$1 != null && this.cz().equals($$1.i())) {
            this.cs = $$1;
         }
      }

      this.bX = this.bY;
      if (this.eB()) {
         float $$2 = (this.ah.i() - 0.5F) * 8.0F;
         float $$3 = (this.ah.i() - 0.5F) * 4.0F;
         float $$4 = (this.ah.i() - 0.5F) * 8.0F;
         this.dP().a(li.w, this.du() + (double)$$2, this.dw() + 2.0 + (double)$$3, this.dA() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gq();
         evt $$5 = this.ds();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.cu.a().a()) {
            this.bY += 0.1F;
         } else if (this.bZ) {
            this.bY += $$6 * 0.5F;
         } else {
            this.bY += $$6;
         }

         this.r(ayz.g(this.dF()));
         if (this.gg()) {
            this.bY = 0.5F;
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

               this.cu.a().b();
            } else {
               cin $$8 = this.cu.a();
               $$8.c();
               if (this.cu.a() != $$8) {
                  $$8 = this.cu.a();
                  $$8.c();
               }

               evt $$9 = $$8.g();
               if ($$9 != null) {
                  double $$10 = $$9.c - this.du();
                  double $$11 = $$9.d - this.dw();
                  double $$12 = $$9.e - this.dA();
                  double $$13 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  float $$14 = $$8.f();
                  double $$15 = Math.sqrt($$10 * $$10 + $$12 * $$12);
                  if ($$15 > 0.0) {
                     $$11 = ayz.a($$11 / $$15, (double)(-$$14), (double)$$14);
                  }

                  this.h(this.ds().b(0.0, $$11 * 0.01, 0.0));
                  this.r(ayz.g(this.dF()));
                  evt $$16 = $$9.a(this.du(), this.dw(), this.dA()).d();
                  evt $$17 = new evt((double)ayz.a(this.dF() * (float) (Math.PI / 180.0)), this.ds().d, (double)(-ayz.b(this.dF() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$18 = Math.max(((float)$$17.b($$16) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$10) > 1.0E-5F || Math.abs($$12) > 1.0E-5F) {
                     float $$19 = ayz.a(ayz.g(180.0F - (float)ayz.d($$10, $$12) * (180.0F / (float)Math.PI) - this.dF()), -50.0F, 50.0F);
                     this.cb *= 0.8F;
                     this.cb = this.cb + $$19 * $$8.h();
                     this.r(this.dF() + this.cb * 0.1F);
                  }

                  float $$20 = (float)(2.0 / ($$13 + 1.0));
                  float $$21 = 0.06F;
                  this.a(0.06F * ($$18 * $$20 + (1.0F - $$20)), new evt(0.0, 0.0, -1.0));
                  if (this.bZ) {
                     this.a(btw.a, this.ds().a(0.8F));
                  } else {
                     this.a(btw.a, this.ds());
                  }

                  evt $$22 = this.ds().d();
                  double $$23 = 0.8 + 0.15 * ($$22.b($$17) + 1.0) / 2.0;
                  this.h(this.ds().d($$23, 0.91F, $$23));
               }
            }

            this.aY = this.dF();
            evt[] $$24 = new evt[this.ck.length];

            for (int $$25 = 0; $$25 < this.ck.length; $$25++) {
               $$24[$$25] = new evt(this.ck[$$25].du(), this.ck[$$25].dw(), this.ck[$$25].dA());
            }

            float $$26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$27 = ayz.b($$26);
            float $$28 = ayz.a($$26);
            float $$29 = this.dF() * (float) (Math.PI / 180.0);
            float $$30 = ayz.a($$29);
            float $$31 = ayz.b($$29);
            this.a(this.cm, (double)($$30 * 0.5F), 0.0, (double)(-$$31 * 0.5F));
            this.a(this.cq, (double)($$31 * 4.5F), 2.0, (double)($$30 * 4.5F));
            this.a(this.cr, (double)($$31 * -4.5F), 2.0, (double)($$30 * -4.5F));
            if (!this.dP().B && this.aO == 0) {
               this.b(this.dP().a(this, this.cq.cK().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), btb.e));
               this.b(this.dP().a(this, this.cr.cK().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), btb.e));
               this.c(this.dP().a(this, this.e.cK().g(1.0), btb.e));
               this.c(this.dP().a(this, this.cl.cK().g(1.0), btb.e));
            }

            float $$32 = ayz.a(this.dF() * (float) (Math.PI / 180.0) - this.cb * 0.01F);
            float $$33 = ayz.b(this.dF() * (float) (Math.PI / 180.0) - this.cb * 0.01F);
            float $$34 = this.gp();
            this.a(this.e, (double)($$32 * 6.5F * $$27), (double)($$34 + $$28 * 6.5F), (double)(-$$33 * 6.5F * $$27));
            this.a(this.cl, (double)($$32 * 5.5F * $$27), (double)($$34 + $$28 * 5.5F), (double)(-$$33 * 5.5F * $$27));
            double[] $$35 = this.a(5, 1.0F);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               cib $$37 = null;
               if ($$36 == 0) {
                  $$37 = this.cn;
               }

               if ($$36 == 1) {
                  $$37 = this.co;
               }

               if ($$36 == 2) {
                  $$37 = this.cp;
               }

               double[] $$38 = this.a(12 + $$36 * 2, 1.0F);
               float $$39 = this.dF() * (float) (Math.PI / 180.0) + this.i($$38[0] - $$35[0]) * (float) (Math.PI / 180.0);
               float $$40 = ayz.a($$39);
               float $$41 = ayz.b($$39);
               float $$42 = 1.5F;
               float $$43 = (float)($$36 + 1) * 2.0F;
               this.a(
                  $$37,
                  (double)(-($$30 * 1.5F + $$40 * $$43) * $$27),
                  $$38[1] - $$35[1] - (double)(($$43 + 1.5F) * $$28) + 1.5,
                  (double)(($$31 * 1.5F + $$41 * $$43) * $$27)
               );
            }

            if (!this.dP().B) {
               this.bZ = this.b(this.e.cK()) | this.b(this.cl.cK()) | this.b(this.cm.cK());
               if (this.cs != null) {
                  this.cs.b(this);
               }
            }

            for (int $$44 = 0; $$44 < this.ck.length; $$44++) {
               this.ck[$$44].L = $$24[$$44].c;
               this.ck[$$44].M = $$24[$$44].d;
               this.ck[$$44].N = $$24[$$44].e;
               this.ck[$$44].ad = $$24[$$44].c;
               this.ck[$$44].ae = $$24[$$44].d;
               this.ck[$$44].af = $$24[$$44].e;
            }
         }
      }
   }

   private void a(cib $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.du() + $$1, this.dw() + $$2, this.dA() + $$3);
   }

   private float gp() {
      if (this.cu.a().a()) {
         return -1.0F;
      } else {
         double[] $$0 = this.a(5, 1.0F);
         double[] $$1 = this.a(0, 1.0F);
         return (float)($$0[1] - $$1[1]);
      }
   }

   private void gq() {
      if (this.cc != null) {
         if (this.cc.dK()) {
            this.cc = null;
         } else if (this.ai % 10 == 0 && this.eA() < this.eR()) {
            this.t(this.eA() + 1.0F);
         }
      }

      if (this.ah.a(10) == 0) {
         List<cic> $$0 = this.dP().a(cic.class, this.cK().g(32.0));
         cic $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cic $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.cc = $$1;
      }
   }

   private void b(List<bsw> $$0) {
      double $$1 = (this.cm.cK().a + this.cm.cK().d) / 2.0;
      double $$2 = (this.cm.cK().c + this.cm.cK().f) / 2.0;

      for (bsw $$3 : $$0) {
         if ($$3 instanceof btr) {
            double $$4 = $$3.du() - $$1;
            double $$5 = $$3.dA() - $$2;
            double $$6 = Math.max($$4 * $$4 + $$5 * $$5, 0.1);
            $$3.j($$4 / $$6 * 4.0, 0.2F, $$5 / $$6 * 4.0);
            if (!this.cu.a().a() && ((btr)$$3).en() < $$3.ai - 2) {
               $$3.a(this.dQ().b((btr)this), 5.0F);
               this.a(this, $$3);
            }
         }
      }
   }

   private void c(List<bsw> $$0) {
      for (bsw $$1 : $$0) {
         if ($$1 instanceof btr) {
            $$1.a(this.dQ().b((btr)this), 10.0F);
            this.a(this, $$1);
         }
      }
   }

   private float i(double $$0) {
      return (float)ayz.d($$0);
   }

   private boolean b(evo $$0) {
      int $$1 = ayz.a($$0.a);
      int $$2 = ayz.a($$0.b);
      int $$3 = ayz.a($$0.c);
      int $$4 = ayz.a($$0.d);
      int $$5 = ayz.a($$0.e);
      int $$6 = ayz.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               iz $$12 = new iz($$9, $$10, $$11);
               dse $$13 = this.dP().a_($$12);
               if (!$$13.i() && !$$13.a(awp.aD)) {
                  if (this.dP().ab().b(dbw.c) && !$$13.a(awp.aC)) {
                     $$8 = this.dP().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         iz $$14 = new iz($$1 + this.ah.a($$4 - $$1 + 1), $$2 + this.ah.a($$5 - $$2 + 1), $$3 + this.ah.a($$6 - $$3 + 1));
         this.dP().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(cib $$0, brp $$1, float $$2) {
      if (this.cu.a().i() == cit.j) {
         return false;
      } else {
         $$2 = this.cu.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cmz || $$1.a(awr.z)) {
               float $$3 = this.eA();
               this.g($$1, $$2);
               if (this.eB() && !this.cu.a().a()) {
                  this.t(1.0F);
                  this.cu.a(cit.j);
               }

               if (this.cu.a().a()) {
                  this.cw = this.cw + $$3 - this.eA();
                  if (this.cw > 0.25F * this.eR()) {
                     this.cw = 0.0F;
                     this.cu.a(cit.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(brp $$0, float $$1) {
      return !this.dP().B ? this.a(this.cm, $$0, $$1) : false;
   }

   protected boolean g(brp $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void an() {
      this.a(bsw.c.a);
      this.a(dwx.p);
      if (this.cs != null) {
         this.cs.b(this);
         this.cs.a(this);
      }
   }

   @Override
   protected void eg() {
      if (this.cs != null) {
         this.cs.b(this);
      }

      this.ca++;
      if (this.ca >= 180 && this.ca <= 200) {
         float $$0 = (this.ah.i() - 0.5F) * 8.0F;
         float $$1 = (this.ah.i() - 0.5F) * 4.0F;
         float $$2 = (this.ah.i() - 0.5F) * 8.0F;
         this.dP().a(li.v, this.du() + (double)$$0, this.dw() + 2.0 + (double)$$1, this.dA() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dP().ab().b(dbw.f);
      int $$4 = 500;
      if (this.cs != null && !this.cs.f()) {
         $$4 = 12000;
      }

      if (this.dP() instanceof arf) {
         if (this.ca > 150 && this.ca % 5 == 0 && $$3) {
            bth.a((arf)this.dP(), this.dn(), ayz.d((float)$$4 * 0.08F));
         }

         if (this.ca == 1 && !this.aW()) {
            this.dP().b(1028, this.dp(), 0);
         }
      }

      this.a(btw.a, new evt(0.0, 0.1F, 0.0));
      if (this.ca == 200 && this.dP() instanceof arf) {
         if ($$3) {
            bth.a((arf)this.dP(), this.dn(), ayz.d((float)$$4 * 0.2F));
         }

         if (this.cs != null) {
            this.cs.a(this);
         }

         this.a(bsw.c.a);
         this.a(dwx.p);
      }
   }

   public int y() {
      if (this.cx[0] == null) {
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

            int $$9 = Math.max(this.dP().z_() + 10, this.dP().a(dxw.a.f, new iz($$3, 0, $$4)).v() + $$1);
            this.cx[$$0] = new eoj($$3, $$9, $$4);
         }

         this.cz[0] = 6146;
         this.cz[1] = 8197;
         this.cz[2] = 8202;
         this.cz[3] = 16404;
         this.cz[4] = 32808;
         this.cz[5] = 32848;
         this.cz[6] = 65696;
         this.cz[7] = 131392;
         this.cz[8] = 131712;
         this.cz[9] = 263424;
         this.cz[10] = 526848;
         this.cz[11] = 525313;
         this.cz[12] = 1581057;
         this.cz[13] = 3166214;
         this.cz[14] = 2138120;
         this.cz[15] = 6373424;
         this.cz[16] = 4358208;
         this.cz[17] = 12910976;
         this.cz[18] = 9044480;
         this.cz[19] = 9706496;
         this.cz[20] = 15216640;
         this.cz[21] = 13688832;
         this.cz[22] = 11763712;
         this.cz[23] = 8257536;
      }

      return this.r(this.du(), this.dw(), this.dA());
   }

   public int r(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      eoj $$5 = new eoj(ayz.a($$0), ayz.a($$1), ayz.a($$2));
      int $$6 = 0;
      if (this.cs == null || this.cs.e() == 0) {
         $$6 = 12;
      }

      for (int $$7 = $$6; $$7 < 24; $$7++) {
         if (this.cx[$$7] != null) {
            float $$8 = this.cx[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public eol a(int $$0, int $$1, @Nullable eoj $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         eoj $$4 = this.cx[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      eoj $$5 = this.cx[$$0];
      eoj $$6 = this.cx[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cA.a();
      this.cA.a($$5);
      eoj $$7 = $$5;
      int $$8 = 0;
      if (this.cs == null || this.cs.e() == 0) {
         $$8 = 12;
      }

      while (!this.cA.e()) {
         eoj $$9 = this.cA.c();
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
            if (this.cx[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for (int $$12 = $$8; $$12 < 24; $$12++) {
            if ((this.cz[$$10] & 1 << $$12) > 0) {
               eoj $$13 = this.cx[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.cA.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.cA.a($$13);
                     }
                  }
               }
            }
         }
      }

      if ($$7 == $$5) {
         return null;
      } else {
         cd.debug("Failed to find path from {} to {}", $$0, $$1);
         if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
         }

         return this.a($$5, $$7);
      }
   }

   private eol a(eoj $$0, eoj $$1) {
      List<eoj> $$2 = Lists.newArrayList();
      eoj $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new eol($$2, new iz($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cu.a().i().b());
      $$0.a("DragonDeathTime", this.ca);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cu.a(cit.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.ca = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dB() {
   }

   public cib[] gm() {
      return this.ck;
   }

   @Override
   public boolean bz() {
      return false;
   }

   @Override
   public awb de() {
      return awb.f;
   }

   @Override
   protected avz v() {
      return awa.ia;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.if;
   }

   @Override
   protected float fe() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      cin $$3 = this.cu.a();
      cit<? extends cin> $$4 = $$3.i();
      double $$7;
      if ($$4 == cit.d || $$4 == cit.e) {
         iz $$5 = this.dP().a(dxw.a.f, eaz.a(this.ct));
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

   public evt F(float $$0) {
      cin $$1 = this.cu.a();
      cit<? extends cin> $$2 = $$1.i();
      evt $$8;
      if ($$2 == cit.d || $$2 == cit.e) {
         iz $$3 = this.dP().a(dxw.a.f, eaz.a(this.ct));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.dn())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dH();
         float $$7 = 1.5F;
         this.s(-$$5 * 1.5F * 5.0F);
         $$8 = this.f($$0);
         this.s($$6);
      } else if ($$1.a()) {
         float $$9 = this.dH();
         float $$10 = 1.5F;
         this.s(-45.0F);
         $$8 = this.f($$0);
         this.s($$9);
      } else {
         $$8 = this.f($$0);
      }

      return $$8;
   }

   public void a(cic $$0, iz $$1, brp $$2) {
      cmz $$3;
      if ($$2.d() instanceof cmz) {
         $$3 = (cmz)$$2.d();
      } else {
         $$3 = this.dP().a(ce, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.cc) {
         this.a(this.e, this.dQ().d($$0, $$3), 10.0F);
      }

      this.cu.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(akk<?> $$0) {
      if (b.equals($$0) && this.dP().B) {
         this.cu.a(cit.a(this.ap().a(b)));
      }

      super.a($$0);
   }

   public ciu gn() {
      return this.cu;
   }

   @Nullable
   public dvz go() {
      return this.cs;
   }

   @Override
   public boolean b(bse $$0, @Nullable bsw $$1) {
      return false;
   }

   @Override
   protected boolean o(bsw $$0) {
      return false;
   }

   @Override
   public boolean cw() {
      return false;
   }

   @Override
   public void a(acj $$0) {
      super.a($$0);
      cib[] $$1 = this.gm();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b());
      }
   }

   @Override
   public boolean c(btr $$0) {
      return $$0.et();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
