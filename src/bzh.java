import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class bzh extends bli implements cba {
   private static final Logger bY = LogUtils.getLogger();
   public static final afo<Integer> b = afr.a(bzh.class, afq.b);
   private static final bvs bZ = bvs.a().a(64.0);
   private static final int ca = 200;
   private static final int cb = 400;
   private static final float cc = 0.25F;
   private static final String cd = "DragonDeathTime";
   private static final String ce = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final bzf[] cf;
   public final bzf e;
   private final bzf cg;
   private final bzf ch;
   private final bzf ci;
   private final bzf cj;
   private final bzf ck;
   private final bzf cl;
   private final bzf cm;
   public float bS;
   public float bT;
   public boolean bU;
   public int bV;
   public float bW;
   @Nullable
   public bzg bX;
   @Nullable
   private dku cn;
   private ht co = ht.b;
   private final bzy cp;
   private int cq = 100;
   private float cr;
   private final edf[] cs = new edf[24];
   private final int[] ct = new int[24];
   private final edc cu = new edc();

   public bzh(bku<? extends bzh> $$0, csa $$1) {
      super(bku.C, $$1);
      this.e = new bzf(this, "head", 1.0F, 1.0F);
      this.cg = new bzf(this, "neck", 3.0F, 3.0F);
      this.ch = new bzf(this, "body", 5.0F, 3.0F);
      this.ci = new bzf(this, "tail", 2.0F, 2.0F);
      this.cj = new bzf(this, "tail", 2.0F, 2.0F);
      this.ck = new bzf(this, "tail", 2.0F, 2.0F);
      this.cl = new bzf(this, "wing", 4.0F, 2.0F);
      this.cm = new bzf(this, "wing", 4.0F, 2.0F);
      this.cf = new bzf[]{this.e, this.cg, this.ch, this.ci, this.cj, this.ck, this.cl, this.cm};
      this.c(this.eN());
      this.af = true;
      this.at = true;
      this.cp = new bzy(this);
   }

   public void a(dku $$0) {
      this.cn = $$0;
   }

   @Override
   public void h(ht $$0) {
      this.co = $$0;
   }

   public ht u() {
      return this.co;
   }

   public static bml.a w() {
      return bli.C().a(bmm.l, 200.0);
   }

   @Override
   public boolean aT() {
      float $$0 = atm.b(this.bT * (float) (Math.PI * 2));
      float $$1 = atm.b(this.bS * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aS() {
      if (this.dN().B && !this.aU()) {
         this.dN().a(this.ds(), this.du(), this.dy(), aqr.hq, this.dc(), 5.0F, 0.8F + this.ag.i() * 0.3F, false);
      }
   }

   @Override
   protected void b_() {
      super.b_();
      this.an().a(b, bzx.k.b());
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
      double $$6 = atm.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = atm.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void c_() {
      this.aG();
      if (this.dN().B) {
         this.c(this.ew());
         if (!this.aU() && !this.cp.a().a() && --this.cq < 0) {
            this.dN().a(this.ds(), this.du(), this.dy(), aqr.hr, this.dc(), 2.5F, 0.8F + this.ag.i() * 0.3F, false);
            this.cq = 200 + this.ag.a(200);
         }
      }

      if (this.cn == null && this.dN() instanceof ame $$0) {
         dku $$1 = $$0.C();
         if ($$1 != null && this.cw().equals($$1.i())) {
            this.cn = $$1;
         }
      }

      this.bS = this.bT;
      if (this.ex()) {
         float $$2 = (this.ag.i() - 0.5F) * 8.0F;
         float $$3 = (this.ag.i() - 0.5F) * 4.0F;
         float $$4 = (this.ag.i() - 0.5F) * 8.0F;
         this.dN().a(js.x, this.ds() + (double)$$2, this.du() + 2.0 + (double)$$3, this.dy() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gf();
         eju $$5 = this.dq();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.cp.a().a()) {
            this.bT += 0.1F;
         } else if (this.bU) {
            this.bT += $$6 * 0.5F;
         } else {
            this.bT += $$6;
         }

         this.r(atm.g(this.dD()));
         if (this.fV()) {
            this.bT = 0.5F;
         } else {
            if (this.d < 0) {
               for (int $$7 = 0; $$7 < this.c.length; $$7++) {
                  this.c[$$7][0] = (double)this.dD();
                  this.c[$$7][1] = this.du();
               }
            }

            if (++this.d == this.c.length) {
               this.d = 0;
            }

            this.c[this.d][0] = (double)this.dD();
            this.c[this.d][1] = this.du();
            if (this.dN().B) {
               if (this.bn > 0) {
                  this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
                  this.bn--;
               }

               this.cp.a().b();
            } else {
               bzr $$8 = this.cp.a();
               $$8.c();
               if (this.cp.a() != $$8) {
                  $$8 = this.cp.a();
                  $$8.c();
               }

               eju $$9 = $$8.g();
               if ($$9 != null) {
                  double $$10 = $$9.c - this.ds();
                  double $$11 = $$9.d - this.du();
                  double $$12 = $$9.e - this.dy();
                  double $$13 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  float $$14 = $$8.f();
                  double $$15 = Math.sqrt($$10 * $$10 + $$12 * $$12);
                  if ($$15 > 0.0) {
                     $$11 = atm.a($$11 / $$15, (double)(-$$14), (double)$$14);
                  }

                  this.g(this.dq().b(0.0, $$11 * 0.01, 0.0));
                  this.r(atm.g(this.dD()));
                  eju $$16 = $$9.a(this.ds(), this.du(), this.dy()).d();
                  eju $$17 = new eju((double)atm.a(this.dD() * (float) (Math.PI / 180.0)), this.dq().d, (double)(-atm.b(this.dD() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$18 = Math.max(((float)$$17.b($$16) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$10) > 1.0E-5F || Math.abs($$12) > 1.0E-5F) {
                     float $$19 = atm.a(atm.g(180.0F - (float)atm.d($$10, $$12) * (180.0F / (float)Math.PI) - this.dD()), -50.0F, 50.0F);
                     this.bW *= 0.8F;
                     this.bW = this.bW + $$19 * $$8.h();
                     this.r(this.dD() + this.bW * 0.1F);
                  }

                  float $$20 = (float)(2.0 / ($$13 + 1.0));
                  float $$21 = 0.06F;
                  this.a(0.06F * ($$18 * $$20 + (1.0F - $$20)), new eju(0.0, 0.0, -1.0));
                  if (this.bU) {
                     this.a(blm.a, this.dq().a(0.8F));
                  } else {
                     this.a(blm.a, this.dq());
                  }

                  eju $$22 = this.dq().d();
                  double $$23 = 0.8 + 0.15 * ($$22.b($$17) + 1.0) / 2.0;
                  this.g(this.dq().d($$23, 0.91F, $$23));
               }
            }

            this.aU = this.dD();
            eju[] $$24 = new eju[this.cf.length];

            for (int $$25 = 0; $$25 < this.cf.length; $$25++) {
               $$24[$$25] = new eju(this.cf[$$25].ds(), this.cf[$$25].du(), this.cf[$$25].dy());
            }

            float $$26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$27 = atm.b($$26);
            float $$28 = atm.a($$26);
            float $$29 = this.dD() * (float) (Math.PI / 180.0);
            float $$30 = atm.a($$29);
            float $$31 = atm.b($$29);
            this.a(this.ch, (double)($$30 * 0.5F), 0.0, (double)(-$$31 * 0.5F));
            this.a(this.cl, (double)($$31 * 4.5F), 2.0, (double)($$30 * 4.5F));
            this.a(this.cm, (double)($$31 * -4.5F), 2.0, (double)($$30 * -4.5F));
            if (!this.dN().B && this.aK == 0) {
               this.b(this.dN().a(this, this.cl.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bkt.e));
               this.b(this.dN().a(this, this.cm.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bkt.e));
               this.c(this.dN().a(this, this.e.cH().g(1.0), bkt.e));
               this.c(this.dN().a(this, this.cg.cH().g(1.0), bkt.e));
            }

            float $$32 = atm.a(this.dD() * (float) (Math.PI / 180.0) - this.bW * 0.01F);
            float $$33 = atm.b(this.dD() * (float) (Math.PI / 180.0) - this.bW * 0.01F);
            float $$34 = this.ge();
            this.a(this.e, (double)($$32 * 6.5F * $$27), (double)($$34 + $$28 * 6.5F), (double)(-$$33 * 6.5F * $$27));
            this.a(this.cg, (double)($$32 * 5.5F * $$27), (double)($$34 + $$28 * 5.5F), (double)(-$$33 * 5.5F * $$27));
            double[] $$35 = this.a(5, 1.0F);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               bzf $$37 = null;
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
               float $$39 = this.dD() * (float) (Math.PI / 180.0) + this.i($$38[0] - $$35[0]) * (float) (Math.PI / 180.0);
               float $$40 = atm.a($$39);
               float $$41 = atm.b($$39);
               float $$42 = 1.5F;
               float $$43 = (float)($$36 + 1) * 2.0F;
               this.a(
                  $$37,
                  (double)(-($$30 * 1.5F + $$40 * $$43) * $$27),
                  $$38[1] - $$35[1] - (double)(($$43 + 1.5F) * $$28) + 1.5,
                  (double)(($$31 * 1.5F + $$41 * $$43) * $$27)
               );
            }

            if (!this.dN().B) {
               this.bU = this.b(this.e.cH()) | this.b(this.cg.cH()) | this.b(this.ch.cH());
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

   private void a(bzf $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.ds() + $$1, this.du() + $$2, this.dy() + $$3);
   }

   private float ge() {
      if (this.cp.a().a()) {
         return -1.0F;
      } else {
         double[] $$0 = this.a(5, 1.0F);
         double[] $$1 = this.a(0, 1.0F);
         return (float)($$0[1] - $$1[1]);
      }
   }

   private void gf() {
      if (this.bX != null) {
         if (this.bX.dI()) {
            this.bX = null;
         } else if (this.ah % 10 == 0 && this.ew() < this.eN()) {
            this.c(this.ew() + 1.0F);
         }
      }

      if (this.ag.a(10) == 0) {
         List<bzg> $$0 = this.dN().a(bzg.class, this.cH().g(32.0));
         bzg $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bzg $$3 : $$0) {
            double $$4 = $$3.f(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.bX = $$1;
      }
   }

   private void b(List<bkq> $$0) {
      double $$1 = (this.ch.cH().a + this.ch.cH().d) / 2.0;
      double $$2 = (this.ch.cH().c + this.ch.cH().f) / 2.0;

      for (bkq $$3 : $$0) {
         if ($$3 instanceof blg) {
            double $$4 = $$3.ds() - $$1;
            double $$5 = $$3.dy() - $$2;
            double $$6 = Math.max($$4 * $$4 + $$5 * $$5, 0.1);
            $$3.j($$4 / $$6 * 4.0, 0.2F, $$5 / $$6 * 4.0);
            if (!this.cp.a().a() && ((blg)$$3).ej() < $$3.ah - 2) {
               $$3.a(this.dO().b((blg)this), 5.0F);
               this.a(this, $$3);
            }
         }
      }
   }

   private void c(List<bkq> $$0) {
      for (bkq $$1 : $$0) {
         if ($$1 instanceof blg) {
            $$1.a(this.dO().b((blg)this), 10.0F);
            this.a(this, $$1);
         }
      }
   }

   private float i(double $$0) {
      return (float)atm.d($$0);
   }

   private boolean b(ejp $$0) {
      int $$1 = atm.a($$0.a);
      int $$2 = atm.a($$0.b);
      int $$3 = atm.a($$0.c);
      int $$4 = atm.a($$0.d);
      int $$5 = atm.a($$0.e);
      int $$6 = atm.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               ht $$12 = new ht($$9, $$10, $$11);
               dhi $$13 = this.dN().a_($$12);
               if (!$$13.i() && !$$13.a(arg.aC)) {
                  if (this.dN().Y().b(crw.c) && !$$13.a(arg.aB)) {
                     $$8 = this.dN().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         ht $$14 = new ht($$1 + this.ag.a($$4 - $$1 + 1), $$2 + this.ag.a($$5 - $$2 + 1), $$3 + this.ag.a($$6 - $$3 + 1));
         this.dN().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(bzf $$0, bjo $$1, float $$2) {
      if (this.cp.a().i() == bzx.j) {
         return false;
      } else {
         $$2 = this.cp.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cdu || $$1.a(ari.y)) {
               float $$3 = this.ew();
               this.g($$1, $$2);
               if (this.ex() && !this.cp.a().a()) {
                  this.c(1.0F);
                  this.cp.a(bzx.j);
               }

               if (this.cp.a().a()) {
                  this.cr = this.cr + $$3 - this.ew();
                  if (this.cr > 0.25F * this.eN()) {
                     this.cr = 0.0F;
                     this.cp.a(bzx.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      return !this.dN().B ? this.a(this.ch, $$0, $$1) : false;
   }

   protected boolean g(bjo $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void al() {
      this.a(bkq.c.a);
      this.a(dls.p);
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
         float $$0 = (this.ag.i() - 0.5F) * 8.0F;
         float $$1 = (this.ag.i() - 0.5F) * 4.0F;
         float $$2 = (this.ag.i() - 0.5F) * 8.0F;
         this.dN().a(js.w, this.ds() + (double)$$0, this.du() + 2.0 + (double)$$1, this.dy() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dN().Y().b(crw.f);
      int $$4 = 500;
      if (this.cn != null && !this.cn.f()) {
         $$4 = 12000;
      }

      if (this.dN() instanceof ame) {
         if (this.bV > 150 && this.bV % 5 == 0 && $$3) {
            bkw.a((ame)this.dN(), this.dl(), atm.d((float)$$4 * 0.08F));
         }

         if (this.bV == 1 && !this.aU()) {
            this.dN().b(1028, this.dn(), 0);
         }
      }

      this.a(blm.a, new eju(0.0, 0.1F, 0.0));
      if (this.bV == 200 && this.dN() instanceof ame) {
         if ($$3) {
            bkw.a((ame)this.dN(), this.dl(), atm.d((float)$$4 * 0.2F));
         }

         if (this.cn != null) {
            this.cn.a(this);
         }

         this.a(bkq.c.a);
         this.a(dls.p);
      }
   }

   public int A() {
      if (this.cs[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = atm.d(60.0F * atm.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = atm.d(60.0F * atm.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = atm.d(40.0F * atm.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = atm.d(40.0F * atm.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = atm.d(20.0F * atm.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = atm.d(20.0F * atm.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.dN().z_() + 10, this.dN().a(dmr.a.f, new ht($$3, 0, $$4)).v() + $$1);
            this.cs[$$0] = new edf($$3, $$9, $$4);
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

      return this.r(this.ds(), this.du(), this.dy());
   }

   public int r(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      edf $$5 = new edf(atm.a($$0), atm.a($$1), atm.a($$2));
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
   public edh a(int $$0, int $$1, @Nullable edf $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         edf $$4 = this.cs[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      edf $$5 = this.cs[$$0];
      edf $$6 = this.cs[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cu.a();
      this.cu.a($$5);
      edf $$7 = $$5;
      int $$8 = 0;
      if (this.cn == null || this.cn.e() == 0) {
         $$8 = 12;
      }

      while (!this.cu.e()) {
         edf $$9 = this.cu.c();
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
               edf $$13 = this.cs[$$12];
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

   private edh a(edf $$0, edf $$1) {
      List<edf> $$2 = Lists.newArrayList();
      edf $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new edh($$2, new ht($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cp.a().i().b());
      $$0.a("DragonDeathTime", this.bV);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cp.a(bzx.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bV = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dz() {
   }

   public bzf[] gb() {
      return this.cf;
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public aqs dc() {
      return aqs.f;
   }

   @Override
   protected aqq y() {
      return aqr.hn;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.hs;
   }

   @Override
   protected float eX() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      bzr $$3 = this.cp.a();
      bzx<? extends bzr> $$4 = $$3.i();
      double $$7;
      if ($$4 == bzx.d || $$4 == bzx.e) {
         ht $$5 = this.dN().a(dmr.a.f, dpu.a(this.co));
         double $$6 = Math.max(Math.sqrt($$5.b(this.dl())) / 4.0, 1.0);
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

   public eju D(float $$0) {
      bzr $$1 = this.cp.a();
      bzx<? extends bzr> $$2 = $$1.i();
      eju $$8;
      if ($$2 == bzx.d || $$2 == bzx.e) {
         ht $$3 = this.dN().a(dmr.a.f, dpu.a(this.co));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.dl())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dF();
         float $$7 = 1.5F;
         this.s(-$$5 * 1.5F * 5.0F);
         $$8 = this.f($$0);
         this.s($$6);
      } else if ($$1.a()) {
         float $$9 = this.dF();
         float $$10 = 1.5F;
         this.s(-45.0F);
         $$8 = this.f($$0);
         this.s($$9);
      } else {
         $$8 = this.f($$0);
      }

      return $$8;
   }

   public void a(bzg $$0, ht $$1, bjo $$2) {
      cdu $$3;
      if ($$2.d() instanceof cdu) {
         $$3 = (cdu)$$2.d();
      } else {
         $$3 = this.dN().a(bZ, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.bX) {
         this.a(this.e, this.dO().d($$0, $$3), 10.0F);
      }

      this.cp.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(afo<?> $$0) {
      if (b.equals($$0) && this.dN().B) {
         this.cp.a(bzx.a(this.an().b(b)));
      }

      super.a($$0);
   }

   public bzy gc() {
      return this.cp;
   }

   @Nullable
   public dku gd() {
      return this.cn;
   }

   @Override
   public boolean b(bkd $$0, @Nullable bkq $$1) {
      return false;
   }

   @Override
   protected boolean o(bkq $$0) {
      return false;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      bzf[] $$1 = this.gb();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.a());
      }
   }

   @Override
   public boolean c(blg $$0) {
      return $$0.ep();
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, this.ch.di(), 0.0F);
   }
}
