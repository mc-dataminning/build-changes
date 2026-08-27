import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bub extends bgb implements bvu {
   private static final Logger bY = LogUtils.getLogger();
   public static final aby<Integer> b = acb.a(bub.class, aca.b);
   private static final bqm bZ = bqm.a().a(64.0);
   private static final int ca = 200;
   private static final int cb = 400;
   private static final float cc = 0.25F;
   private static final String cd = "DragonDeathTime";
   private static final String ce = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final btz[] cf;
   public final btz e;
   private final btz cg;
   private final btz ch;
   private final btz ci;
   private final btz cj;
   private final btz ck;
   private final btz cl;
   private final btz cm;
   public float bS;
   public float bT;
   public boolean bU;
   public int bV;
   public float bW;
   @Nullable
   public bua bX;
   @Nullable
   private dfn cn;
   private gu co = gu.b;
   private final bus cp;
   private int cq = 100;
   private float cr;
   private final dxr[] cs = new dxr[24];
   private final int[] ct = new int[24];
   private final dxo cu = new dxo();

   public bub(bfn<? extends bub> $$0, cmm $$1) {
      super(bfn.C, $$1);
      this.e = new btz(this, "head", 1.0F, 1.0F);
      this.cg = new btz(this, "neck", 3.0F, 3.0F);
      this.ch = new btz(this, "body", 5.0F, 3.0F);
      this.ci = new btz(this, "tail", 2.0F, 2.0F);
      this.cj = new btz(this, "tail", 2.0F, 2.0F);
      this.ck = new btz(this, "tail", 2.0F, 2.0F);
      this.cl = new btz(this, "wing", 4.0F, 2.0F);
      this.cm = new btz(this, "wing", 4.0F, 2.0F);
      this.cf = new btz[]{this.e, this.cg, this.ch, this.ci, this.cj, this.ck, this.cl, this.cm};
      this.t(this.eI());
      this.ae = true;
      this.as = true;
      this.cp = new bus(this);
   }

   public void a(dfn $$0) {
      this.cn = $$0;
   }

   @Override
   public void h(gu $$0) {
      this.co = $$0;
   }

   public gu q() {
      return this.co;
   }

   public static bhf.a r() {
      return bgb.y().a(bhg.a, 200.0);
   }

   @Override
   public boolean aP() {
      float $$0 = apa.b(this.bT * (float) (Math.PI * 2));
      float $$1 = apa.b(this.bS * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aO() {
      if (this.dI().B && !this.aQ()) {
         this.dI().a(this.dn(), this.dp(), this.dt(), amh.gW, this.cY(), 5.0F, 0.8F + this.af.i() * 0.3F, false);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.aj().a(b, bur.k.b());
   }

   public double[] a(int $$0, float $$1) {
      if (this.es()) {
         $$1 = 0.0F;
      }

      $$1 = 1.0F - $$1;
      int $$2 = this.d - $$0 & 63;
      int $$3 = this.d - $$0 - 1 & 63;
      double[] $$4 = new double[3];
      double $$5 = this.c[$$2][0];
      double $$6 = apa.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = apa.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void b_() {
      this.aC();
      if (this.dI().B) {
         this.t(this.er());
         if (!this.aQ() && !this.cp.a().a() && --this.cq < 0) {
            this.dI().a(this.dn(), this.dp(), this.dt(), amh.gX, this.cY(), 2.5F, 0.8F + this.af.i() * 0.3F, false);
            this.cq = 200 + this.af.a(200);
         }
      }

      if (this.cn == null && this.dI() instanceof aif $$0) {
         dfn $$1 = $$0.B();
         if ($$1 != null && this.ct().equals($$1.i())) {
            this.cn = $$1;
         }
      }

      this.bS = this.bT;
      if (this.es()) {
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         float $$3 = (this.af.i() - 0.5F) * 4.0F;
         float $$4 = (this.af.i() - 0.5F) * 8.0F;
         this.dI().a(iv.x, this.dn() + (double)$$2, this.dp() + 2.0 + (double)$$3, this.dt() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.fZ();
         eei $$5 = this.dl();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.cp.a().a()) {
            this.bT += 0.1F;
         } else if (this.bU) {
            this.bT += $$6 * 0.5F;
         } else {
            this.bT += $$6;
         }

         this.a_(apa.g(this.dy()));
         if (this.fQ()) {
            this.bT = 0.5F;
         } else {
            if (this.d < 0) {
               for (int $$7 = 0; $$7 < this.c.length; $$7++) {
                  this.c[$$7][0] = (double)this.dy();
                  this.c[$$7][1] = this.dp();
               }
            }

            if (++this.d == this.c.length) {
               this.d = 0;
            }

            this.c[this.d][0] = (double)this.dy();
            this.c[this.d][1] = this.dp();
            if (this.dI().B) {
               if (this.bo > 0) {
                  double $$8 = this.dn() + (this.bp - this.dn()) / (double)this.bo;
                  double $$9 = this.dp() + (this.bq - this.dp()) / (double)this.bo;
                  double $$10 = this.dt() + (this.br - this.dt()) / (double)this.bo;
                  double $$11 = apa.d(this.bs - (double)this.dy());
                  this.a_(this.dy() + (float)$$11 / (float)this.bo);
                  this.b_(this.dA() + (float)(this.bt - (double)this.dA()) / (float)this.bo);
                  this.bo--;
                  this.e($$8, $$9, $$10);
                  this.a(this.dy(), this.dA());
               }

               this.cp.a().b();
            } else {
               bul $$12 = this.cp.a();
               $$12.c();
               if (this.cp.a() != $$12) {
                  $$12 = this.cp.a();
                  $$12.c();
               }

               eei $$13 = $$12.g();
               if ($$13 != null) {
                  double $$14 = $$13.c - this.dn();
                  double $$15 = $$13.d - this.dp();
                  double $$16 = $$13.e - this.dt();
                  double $$17 = $$14 * $$14 + $$15 * $$15 + $$16 * $$16;
                  float $$18 = $$12.f();
                  double $$19 = Math.sqrt($$14 * $$14 + $$16 * $$16);
                  if ($$19 > 0.0) {
                     $$15 = apa.a($$15 / $$19, (double)(-$$18), (double)$$18);
                  }

                  this.f(this.dl().b(0.0, $$15 * 0.01, 0.0));
                  this.a_(apa.g(this.dy()));
                  eei $$20 = $$13.a(this.dn(), this.dp(), this.dt()).d();
                  eei $$21 = new eei((double)apa.a(this.dy() * (float) (Math.PI / 180.0)), this.dl().d, (double)(-apa.b(this.dy() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$22 = Math.max(((float)$$21.b($$20) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$14) > 1.0E-5F || Math.abs($$16) > 1.0E-5F) {
                     float $$23 = apa.a(apa.g(180.0F - (float)apa.d($$14, $$16) * (180.0F / (float)Math.PI) - this.dy()), -50.0F, 50.0F);
                     this.bW *= 0.8F;
                     this.bW = this.bW + $$23 * $$12.h();
                     this.a_(this.dy() + this.bW * 0.1F);
                  }

                  float $$24 = (float)(2.0 / ($$17 + 1.0));
                  float $$25 = 0.06F;
                  this.a(0.06F * ($$22 * $$24 + (1.0F - $$24)), new eei(0.0, 0.0, -1.0));
                  if (this.bU) {
                     this.a(bgf.a, this.dl().a(0.8F));
                  } else {
                     this.a(bgf.a, this.dl());
                  }

                  eei $$26 = this.dl().d();
                  double $$27 = 0.8 + 0.15 * ($$26.b($$21) + 1.0) / 2.0;
                  this.f(this.dl().d($$27, 0.91F, $$27));
               }
            }

            this.aV = this.dy();
            eei[] $$28 = new eei[this.cf.length];

            for (int $$29 = 0; $$29 < this.cf.length; $$29++) {
               $$28[$$29] = new eei(this.cf[$$29].dn(), this.cf[$$29].dp(), this.cf[$$29].dt());
            }

            float $$30 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$31 = apa.b($$30);
            float $$32 = apa.a($$30);
            float $$33 = this.dy() * (float) (Math.PI / 180.0);
            float $$34 = apa.a($$33);
            float $$35 = apa.b($$33);
            this.a(this.ch, (double)($$34 * 0.5F), 0.0, (double)(-$$35 * 0.5F));
            this.a(this.cl, (double)($$35 * 4.5F), 2.0, (double)($$34 * 4.5F));
            this.a(this.cm, (double)($$35 * -4.5F), 2.0, (double)($$34 * -4.5F));
            if (!this.dI().B && this.aL == 0) {
               this.b(this.dI().a(this, this.cl.cE().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bfm.e));
               this.b(this.dI().a(this, this.cm.cE().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bfm.e));
               this.c(this.dI().a(this, this.e.cE().g(1.0), bfm.e));
               this.c(this.dI().a(this, this.cg.cE().g(1.0), bfm.e));
            }

            float $$36 = apa.a(this.dy() * (float) (Math.PI / 180.0) - this.bW * 0.01F);
            float $$37 = apa.b(this.dy() * (float) (Math.PI / 180.0) - this.bW * 0.01F);
            float $$38 = this.fY();
            this.a(this.e, (double)($$36 * 6.5F * $$31), (double)($$38 + $$32 * 6.5F), (double)(-$$37 * 6.5F * $$31));
            this.a(this.cg, (double)($$36 * 5.5F * $$31), (double)($$38 + $$32 * 5.5F), (double)(-$$37 * 5.5F * $$31));
            double[] $$39 = this.a(5, 1.0F);

            for (int $$40 = 0; $$40 < 3; $$40++) {
               btz $$41 = null;
               if ($$40 == 0) {
                  $$41 = this.ci;
               }

               if ($$40 == 1) {
                  $$41 = this.cj;
               }

               if ($$40 == 2) {
                  $$41 = this.ck;
               }

               double[] $$42 = this.a(12 + $$40 * 2, 1.0F);
               float $$43 = this.dy() * (float) (Math.PI / 180.0) + this.i($$42[0] - $$39[0]) * (float) (Math.PI / 180.0);
               float $$44 = apa.a($$43);
               float $$45 = apa.b($$43);
               float $$46 = 1.5F;
               float $$47 = (float)($$40 + 1) * 2.0F;
               this.a(
                  $$41,
                  (double)(-($$34 * 1.5F + $$44 * $$47) * $$31),
                  $$42[1] - $$39[1] - (double)(($$47 + 1.5F) * $$32) + 1.5,
                  (double)(($$35 * 1.5F + $$45 * $$47) * $$31)
               );
            }

            if (!this.dI().B) {
               this.bU = this.b(this.e.cE()) | this.b(this.cg.cE()) | this.b(this.ch.cE());
               if (this.cn != null) {
                  this.cn.b(this);
               }
            }

            for (int $$48 = 0; $$48 < this.cf.length; $$48++) {
               this.cf[$$48].J = $$28[$$48].c;
               this.cf[$$48].K = $$28[$$48].d;
               this.cf[$$48].L = $$28[$$48].e;
               this.cf[$$48].ab = $$28[$$48].c;
               this.cf[$$48].ac = $$28[$$48].d;
               this.cf[$$48].ad = $$28[$$48].e;
            }
         }
      }
   }

   private void a(btz $$0, double $$1, double $$2, double $$3) {
      $$0.e(this.dn() + $$1, this.dp() + $$2, this.dt() + $$3);
   }

   private float fY() {
      if (this.cp.a().a()) {
         return -1.0F;
      } else {
         double[] $$0 = this.a(5, 1.0F);
         double[] $$1 = this.a(0, 1.0F);
         return (float)($$0[1] - $$1[1]);
      }
   }

   private void fZ() {
      if (this.bX != null) {
         if (this.bX.dD()) {
            this.bX = null;
         } else if (this.ag % 10 == 0 && this.er() < this.eI()) {
            this.t(this.er() + 1.0F);
         }
      }

      if (this.af.a(10) == 0) {
         List<bua> $$0 = this.dI().a(bua.class, this.cE().g(32.0));
         bua $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bua $$3 : $$0) {
            double $$4 = $$3.f(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.bX = $$1;
      }
   }

   private void b(List<bfj> $$0) {
      double $$1 = (this.ch.cE().a + this.ch.cE().d) / 2.0;
      double $$2 = (this.ch.cE().c + this.ch.cE().f) / 2.0;

      for (bfj $$3 : $$0) {
         if ($$3 instanceof bfz) {
            double $$4 = $$3.dn() - $$1;
            double $$5 = $$3.dt() - $$2;
            double $$6 = Math.max($$4 * $$4 + $$5 * $$5, 0.1);
            $$3.j($$4 / $$6 * 4.0, 0.2F, $$5 / $$6 * 4.0);
            if (!this.cp.a().a() && ((bfz)$$3).ee() < $$3.ag - 2) {
               $$3.a(this.dJ().b((bfz)this), 5.0F);
               this.a(this, $$3);
            }
         }
      }
   }

   private void c(List<bfj> $$0) {
      for (bfj $$1 : $$0) {
         if ($$1 instanceof bfz) {
            $$1.a(this.dJ().b((bfz)this), 10.0F);
            this.a(this, $$1);
         }
      }
   }

   private float i(double $$0) {
      return (float)apa.d($$0);
   }

   private boolean b(eed $$0) {
      int $$1 = apa.a($$0.a);
      int $$2 = apa.a($$0.b);
      int $$3 = apa.a($$0.c);
      int $$4 = apa.a($$0.d);
      int $$5 = apa.a($$0.e);
      int $$6 = apa.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               gu $$12 = new gu($$9, $$10, $$11);
               dcb $$13 = this.dI().a_($$12);
               if (!$$13.i() && !$$13.a(amw.aB)) {
                  if (this.dI().X().b(cmi.c) && !$$13.a(amw.aA)) {
                     $$8 = this.dI().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         gu $$14 = new gu($$1 + this.af.a($$4 - $$1 + 1), $$2 + this.af.a($$5 - $$2 + 1), $$3 + this.af.a($$6 - $$3 + 1));
         this.dI().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(btz $$0, ben $$1, float $$2) {
      if (this.cp.a().i() == bur.j) {
         return false;
      } else {
         $$2 = this.cp.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof byo || $$1.a(amy.y)) {
               float $$3 = this.er();
               this.g($$1, $$2);
               if (this.es() && !this.cp.a().a()) {
                  this.t(1.0F);
                  this.cp.a(bur.j);
               }

               if (this.cp.a().a()) {
                  this.cr = this.cr + $$3 - this.er();
                  if (this.cr > 0.25F * this.eI()) {
                     this.cr = 0.0F;
                     this.cp.a(bur.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      return !this.dI().B ? this.a(this.ch, $$0, $$1) : false;
   }

   protected boolean g(ben $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void ah() {
      this.a(bfj.c.a);
      this.a(dgl.p);
      if (this.cn != null) {
         this.cn.b(this);
         this.cn.a(this);
      }
   }

   @Override
   protected void dX() {
      if (this.cn != null) {
         this.cn.b(this);
      }

      this.bV++;
      if (this.bV >= 180 && this.bV <= 200) {
         float $$0 = (this.af.i() - 0.5F) * 8.0F;
         float $$1 = (this.af.i() - 0.5F) * 4.0F;
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         this.dI().a(iv.w, this.dn() + (double)$$0, this.dp() + 2.0 + (double)$$1, this.dt() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dI().X().b(cmi.f);
      int $$4 = 500;
      if (this.cn != null && !this.cn.f()) {
         $$4 = 12000;
      }

      if (this.dI() instanceof aif) {
         if (this.bV > 150 && this.bV % 5 == 0 && $$3) {
            bfp.a((aif)this.dI(), this.dg(), apa.d((float)$$4 * 0.08F));
         }

         if (this.bV == 1 && !this.aQ()) {
            this.dI().b(1028, this.di(), 0);
         }
      }

      this.a(bgf.a, new eei(0.0, 0.1F, 0.0));
      if (this.bV == 200 && this.dI() instanceof aif) {
         if ($$3) {
            bfp.a((aif)this.dI(), this.dg(), apa.d((float)$$4 * 0.2F));
         }

         if (this.cn != null) {
            this.cn.a(this);
         }

         this.a(bfj.c.a);
         this.a(dgl.p);
      }
   }

   public int w() {
      if (this.cs[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = apa.d(60.0F * apa.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = apa.d(60.0F * apa.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = apa.d(40.0F * apa.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = apa.d(40.0F * apa.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = apa.d(20.0F * apa.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = apa.d(20.0F * apa.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.dI().t_() + 10, this.dI().a(dhk.a.f, new gu($$3, 0, $$4)).v() + $$1);
            this.cs[$$0] = new dxr($$3, $$9, $$4);
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

      return this.r(this.dn(), this.dp(), this.dt());
   }

   public int r(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      dxr $$5 = new dxr(apa.a($$0), apa.a($$1), apa.a($$2));
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
   public dxt a(int $$0, int $$1, @Nullable dxr $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         dxr $$4 = this.cs[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      dxr $$5 = this.cs[$$0];
      dxr $$6 = this.cs[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cu.a();
      this.cu.a($$5);
      dxr $$7 = $$5;
      int $$8 = 0;
      if (this.cn == null || this.cn.e() == 0) {
         $$8 = 12;
      }

      while (!this.cu.e()) {
         dxr $$9 = this.cu.c();
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
               dxr $$13 = this.cs[$$12];
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

   private dxt a(dxr $$0, dxr $$1) {
      List<dxr> $$2 = Lists.newArrayList();
      dxr $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new dxt($$2, new gu($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cp.a().i().b());
      $$0.a("DragonDeathTime", this.bV);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cp.a(bur.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bV = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void du() {
   }

   public btz[] fV() {
      return this.cf;
   }

   @Override
   public boolean bo() {
      return false;
   }

   @Override
   public ami cY() {
      return ami.f;
   }

   @Override
   protected amg s() {
      return amh.gT;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.gY;
   }

   @Override
   protected float eR() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      bul $$3 = this.cp.a();
      bur<? extends bul> $$4 = $$3.i();
      double $$7;
      if ($$4 == bur.d || $$4 == bur.e) {
         gu $$5 = this.dI().a(dhk.a.f, dkn.a(this.co));
         double $$6 = Math.max(Math.sqrt($$5.b(this.dg())) / 4.0, 1.0);
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

   public eei C(float $$0) {
      bul $$1 = this.cp.a();
      bur<? extends bul> $$2 = $$1.i();
      eei $$8;
      if ($$2 == bur.d || $$2 == bur.e) {
         gu $$3 = this.dI().a(dhk.a.f, dkn.a(this.co));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.dg())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dA();
         float $$7 = 1.5F;
         this.b_(-$$5 * 1.5F * 5.0F);
         $$8 = this.f($$0);
         this.b_($$6);
      } else if ($$1.a()) {
         float $$9 = this.dA();
         float $$10 = 1.5F;
         this.b_(-45.0F);
         $$8 = this.f($$0);
         this.b_($$9);
      } else {
         $$8 = this.f($$0);
      }

      return $$8;
   }

   public void a(bua $$0, gu $$1, ben $$2) {
      byo $$3;
      if ($$2.d() instanceof byo) {
         $$3 = (byo)$$2.d();
      } else {
         $$3 = this.dI().a(bZ, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.bX) {
         this.a(this.e, this.dJ().d($$0, $$3), 10.0F);
      }

      this.cp.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aby<?> $$0) {
      if (b.equals($$0) && this.dI().B) {
         this.cp.a(bur.a(this.aj().b(b)));
      }

      super.a($$0);
   }

   public bus fW() {
      return this.cp;
   }

   @Nullable
   public dfn fX() {
      return this.cn;
   }

   @Override
   public boolean b(bfa $$0, @Nullable bfj $$1) {
      return false;
   }

   @Override
   protected boolean l(bfj $$0) {
      return false;
   }

   @Override
   public boolean cq() {
      return false;
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      btz[] $$1 = this.fV();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.a());
      }
   }

   @Override
   public boolean c(bfz $$0) {
      return $$0.ek();
   }

   @Override
   public double bx() {
      return (double)this.ch.de();
   }
}
