import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class bzm extends bln implements cbf {
   private static final Logger bY = LogUtils.getLogger();
   public static final afs<Integer> b = afv.a(bzm.class, afu.b);
   private static final bvx bZ = bvx.a().a(64.0);
   private static final int ca = 200;
   private static final int cb = 400;
   private static final float cc = 0.25F;
   private static final String cd = "DragonDeathTime";
   private static final String ce = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final bzk[] cf;
   public final bzk e;
   private final bzk cg;
   private final bzk ch;
   private final bzk ci;
   private final bzk cj;
   private final bzk ck;
   private final bzk cl;
   private final bzk cm;
   public float bS;
   public float bT;
   public boolean bU;
   public int bV;
   public float bW;
   @Nullable
   public bzl bX;
   @Nullable
   private dkz cn;
   private hx co = hx.b;
   private final cad cp;
   private int cq = 100;
   private float cr;
   private final edk[] cs = new edk[24];
   private final int[] ct = new int[24];
   private final edh cu = new edh();

   public bzm(bkz<? extends bzm> $$0, csf $$1) {
      super(bkz.C, $$1);
      this.e = new bzk(this, "head", 1.0F, 1.0F);
      this.cg = new bzk(this, "neck", 3.0F, 3.0F);
      this.ch = new bzk(this, "body", 5.0F, 3.0F);
      this.ci = new bzk(this, "tail", 2.0F, 2.0F);
      this.cj = new bzk(this, "tail", 2.0F, 2.0F);
      this.ck = new bzk(this, "tail", 2.0F, 2.0F);
      this.cl = new bzk(this, "wing", 4.0F, 2.0F);
      this.cm = new bzk(this, "wing", 4.0F, 2.0F);
      this.cf = new bzk[]{this.e, this.cg, this.ch, this.ci, this.cj, this.ck, this.cl, this.cm};
      this.c(this.eN());
      this.af = true;
      this.at = true;
      this.cp = new cad(this);
   }

   public void a(dkz $$0) {
      this.cn = $$0;
   }

   @Override
   public void h(hx $$0) {
      this.co = $$0;
   }

   public hx u() {
      return this.co;
   }

   public static bmq.a w() {
      return bln.C().a(bmr.l, 200.0);
   }

   @Override
   public boolean aT() {
      float $$0 = atq.b(this.bT * (float) (Math.PI * 2));
      float $$1 = atq.b(this.bS * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aS() {
      if (this.dN().B && !this.aU()) {
         this.dN().a(this.ds(), this.du(), this.dy(), aqv.hq, this.dc(), 5.0F, 0.8F + this.ag.i() * 0.3F, false);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(b, cac.k.b());
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
      double $$6 = atq.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = atq.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void d_() {
      this.aG();
      if (this.dN().B) {
         this.c(this.ew());
         if (!this.aU() && !this.cp.a().a() && --this.cq < 0) {
            this.dN().a(this.ds(), this.du(), this.dy(), aqv.hr, this.dc(), 2.5F, 0.8F + this.ag.i() * 0.3F, false);
            this.cq = 200 + this.ag.a(200);
         }
      }

      if (this.cn == null && this.dN() instanceof ami $$0) {
         dkz $$1 = $$0.C();
         if ($$1 != null && this.cw().equals($$1.i())) {
            this.cn = $$1;
         }
      }

      this.bS = this.bT;
      if (this.ex()) {
         float $$2 = (this.ag.i() - 0.5F) * 8.0F;
         float $$3 = (this.ag.i() - 0.5F) * 4.0F;
         float $$4 = (this.ag.i() - 0.5F) * 8.0F;
         this.dN().a(jw.x, this.ds() + (double)$$2, this.du() + 2.0 + (double)$$3, this.dy() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gf();
         ejz $$5 = this.dq();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.cp.a().a()) {
            this.bT += 0.1F;
         } else if (this.bU) {
            this.bT += $$6 * 0.5F;
         } else {
            this.bT += $$6;
         }

         this.r(atq.g(this.dD()));
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
               bzw $$8 = this.cp.a();
               $$8.c();
               if (this.cp.a() != $$8) {
                  $$8 = this.cp.a();
                  $$8.c();
               }

               ejz $$9 = $$8.g();
               if ($$9 != null) {
                  double $$10 = $$9.c - this.ds();
                  double $$11 = $$9.d - this.du();
                  double $$12 = $$9.e - this.dy();
                  double $$13 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  float $$14 = $$8.f();
                  double $$15 = Math.sqrt($$10 * $$10 + $$12 * $$12);
                  if ($$15 > 0.0) {
                     $$11 = atq.a($$11 / $$15, (double)(-$$14), (double)$$14);
                  }

                  this.g(this.dq().b(0.0, $$11 * 0.01, 0.0));
                  this.r(atq.g(this.dD()));
                  ejz $$16 = $$9.a(this.ds(), this.du(), this.dy()).d();
                  ejz $$17 = new ejz((double)atq.a(this.dD() * (float) (Math.PI / 180.0)), this.dq().d, (double)(-atq.b(this.dD() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$18 = Math.max(((float)$$17.b($$16) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$10) > 1.0E-5F || Math.abs($$12) > 1.0E-5F) {
                     float $$19 = atq.a(atq.g(180.0F - (float)atq.d($$10, $$12) * (180.0F / (float)Math.PI) - this.dD()), -50.0F, 50.0F);
                     this.bW *= 0.8F;
                     this.bW = this.bW + $$19 * $$8.h();
                     this.r(this.dD() + this.bW * 0.1F);
                  }

                  float $$20 = (float)(2.0 / ($$13 + 1.0));
                  float $$21 = 0.06F;
                  this.a(0.06F * ($$18 * $$20 + (1.0F - $$20)), new ejz(0.0, 0.0, -1.0));
                  if (this.bU) {
                     this.a(blr.a, this.dq().a(0.8F));
                  } else {
                     this.a(blr.a, this.dq());
                  }

                  ejz $$22 = this.dq().d();
                  double $$23 = 0.8 + 0.15 * ($$22.b($$17) + 1.0) / 2.0;
                  this.g(this.dq().d($$23, 0.91F, $$23));
               }
            }

            this.aU = this.dD();
            ejz[] $$24 = new ejz[this.cf.length];

            for (int $$25 = 0; $$25 < this.cf.length; $$25++) {
               $$24[$$25] = new ejz(this.cf[$$25].ds(), this.cf[$$25].du(), this.cf[$$25].dy());
            }

            float $$26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$27 = atq.b($$26);
            float $$28 = atq.a($$26);
            float $$29 = this.dD() * (float) (Math.PI / 180.0);
            float $$30 = atq.a($$29);
            float $$31 = atq.b($$29);
            this.a(this.ch, (double)($$30 * 0.5F), 0.0, (double)(-$$31 * 0.5F));
            this.a(this.cl, (double)($$31 * 4.5F), 2.0, (double)($$30 * 4.5F));
            this.a(this.cm, (double)($$31 * -4.5F), 2.0, (double)($$30 * -4.5F));
            if (!this.dN().B && this.aK == 0) {
               this.b(this.dN().a(this, this.cl.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bky.e));
               this.b(this.dN().a(this, this.cm.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bky.e));
               this.c(this.dN().a(this, this.e.cH().g(1.0), bky.e));
               this.c(this.dN().a(this, this.cg.cH().g(1.0), bky.e));
            }

            float $$32 = atq.a(this.dD() * (float) (Math.PI / 180.0) - this.bW * 0.01F);
            float $$33 = atq.b(this.dD() * (float) (Math.PI / 180.0) - this.bW * 0.01F);
            float $$34 = this.ge();
            this.a(this.e, (double)($$32 * 6.5F * $$27), (double)($$34 + $$28 * 6.5F), (double)(-$$33 * 6.5F * $$27));
            this.a(this.cg, (double)($$32 * 5.5F * $$27), (double)($$34 + $$28 * 5.5F), (double)(-$$33 * 5.5F * $$27));
            double[] $$35 = this.a(5, 1.0F);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               bzk $$37 = null;
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
               float $$40 = atq.a($$39);
               float $$41 = atq.b($$39);
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

   private void a(bzk $$0, double $$1, double $$2, double $$3) {
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
         List<bzl> $$0 = this.dN().a(bzl.class, this.cH().g(32.0));
         bzl $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (bzl $$3 : $$0) {
            double $$4 = $$3.f(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.bX = $$1;
      }
   }

   private void b(List<bkv> $$0) {
      double $$1 = (this.ch.cH().a + this.ch.cH().d) / 2.0;
      double $$2 = (this.ch.cH().c + this.ch.cH().f) / 2.0;

      for (bkv $$3 : $$0) {
         if ($$3 instanceof bll) {
            double $$4 = $$3.ds() - $$1;
            double $$5 = $$3.dy() - $$2;
            double $$6 = Math.max($$4 * $$4 + $$5 * $$5, 0.1);
            $$3.j($$4 / $$6 * 4.0, 0.2F, $$5 / $$6 * 4.0);
            if (!this.cp.a().a() && ((bll)$$3).ej() < $$3.ah - 2) {
               $$3.a(this.dO().b((bll)this), 5.0F);
               this.a(this, $$3);
            }
         }
      }
   }

   private void c(List<bkv> $$0) {
      for (bkv $$1 : $$0) {
         if ($$1 instanceof bll) {
            $$1.a(this.dO().b((bll)this), 10.0F);
            this.a(this, $$1);
         }
      }
   }

   private float i(double $$0) {
      return (float)atq.d($$0);
   }

   private boolean b(eju $$0) {
      int $$1 = atq.a($$0.a);
      int $$2 = atq.a($$0.b);
      int $$3 = atq.a($$0.c);
      int $$4 = atq.a($$0.d);
      int $$5 = atq.a($$0.e);
      int $$6 = atq.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               hx $$12 = new hx($$9, $$10, $$11);
               dhn $$13 = this.dN().a_($$12);
               if (!$$13.i() && !$$13.a(ark.aC)) {
                  if (this.dN().Y().b(csb.c) && !$$13.a(ark.aB)) {
                     $$8 = this.dN().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         hx $$14 = new hx($$1 + this.ag.a($$4 - $$1 + 1), $$2 + this.ag.a($$5 - $$2 + 1), $$3 + this.ag.a($$6 - $$3 + 1));
         this.dN().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(bzk $$0, bjt $$1, float $$2) {
      if (this.cp.a().i() == cac.j) {
         return false;
      } else {
         $$2 = this.cp.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cdz || $$1.a(arm.y)) {
               float $$3 = this.ew();
               this.g($$1, $$2);
               if (this.ex() && !this.cp.a().a()) {
                  this.c(1.0F);
                  this.cp.a(cac.j);
               }

               if (this.cp.a().a()) {
                  this.cr = this.cr + $$3 - this.ew();
                  if (this.cr > 0.25F * this.eN()) {
                     this.cr = 0.0F;
                     this.cp.a(cac.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      return !this.dN().B ? this.a(this.ch, $$0, $$1) : false;
   }

   protected boolean g(bjt $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void al() {
      this.a(bkv.c.a);
      this.a(dlx.p);
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
         this.dN().a(jw.w, this.ds() + (double)$$0, this.du() + 2.0 + (double)$$1, this.dy() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dN().Y().b(csb.f);
      int $$4 = 500;
      if (this.cn != null && !this.cn.f()) {
         $$4 = 12000;
      }

      if (this.dN() instanceof ami) {
         if (this.bV > 150 && this.bV % 5 == 0 && $$3) {
            blb.a((ami)this.dN(), this.dl(), atq.d((float)$$4 * 0.08F));
         }

         if (this.bV == 1 && !this.aU()) {
            this.dN().b(1028, this.dn(), 0);
         }
      }

      this.a(blr.a, new ejz(0.0, 0.1F, 0.0));
      if (this.bV == 200 && this.dN() instanceof ami) {
         if ($$3) {
            blb.a((ami)this.dN(), this.dl(), atq.d((float)$$4 * 0.2F));
         }

         if (this.cn != null) {
            this.cn.a(this);
         }

         this.a(bkv.c.a);
         this.a(dlx.p);
      }
   }

   public int A() {
      if (this.cs[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = atq.d(60.0F * atq.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = atq.d(60.0F * atq.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = atq.d(40.0F * atq.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = atq.d(40.0F * atq.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = atq.d(20.0F * atq.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = atq.d(20.0F * atq.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.dN().A_() + 10, this.dN().a(dmw.a.f, new hx($$3, 0, $$4)).v() + $$1);
            this.cs[$$0] = new edk($$3, $$9, $$4);
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
      edk $$5 = new edk(atq.a($$0), atq.a($$1), atq.a($$2));
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
   public edm a(int $$0, int $$1, @Nullable edk $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         edk $$4 = this.cs[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      edk $$5 = this.cs[$$0];
      edk $$6 = this.cs[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cu.a();
      this.cu.a($$5);
      edk $$7 = $$5;
      int $$8 = 0;
      if (this.cn == null || this.cn.e() == 0) {
         $$8 = 12;
      }

      while (!this.cu.e()) {
         edk $$9 = this.cu.c();
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
               edk $$13 = this.cs[$$12];
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

   private edm a(edk $$0, edk $$1) {
      List<edk> $$2 = Lists.newArrayList();
      edk $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new edm($$2, new hx($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cp.a().i().b());
      $$0.a("DragonDeathTime", this.bV);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cp.a(cac.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bV = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dz() {
   }

   public bzk[] gb() {
      return this.cf;
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public aqw dc() {
      return aqw.f;
   }

   @Override
   protected aqu y() {
      return aqv.hn;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.hs;
   }

   @Override
   protected float eX() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      bzw $$3 = this.cp.a();
      cac<? extends bzw> $$4 = $$3.i();
      double $$7;
      if ($$4 == cac.d || $$4 == cac.e) {
         hx $$5 = this.dN().a(dmw.a.f, dpz.a(this.co));
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

   public ejz D(float $$0) {
      bzw $$1 = this.cp.a();
      cac<? extends bzw> $$2 = $$1.i();
      ejz $$8;
      if ($$2 == cac.d || $$2 == cac.e) {
         hx $$3 = this.dN().a(dmw.a.f, dpz.a(this.co));
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

   public void a(bzl $$0, hx $$1, bjt $$2) {
      cdz $$3;
      if ($$2.d() instanceof cdz) {
         $$3 = (cdz)$$2.d();
      } else {
         $$3 = this.dN().a(bZ, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.bX) {
         this.a(this.e, this.dO().d($$0, $$3), 10.0F);
      }

      this.cp.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(afs<?> $$0) {
      if (b.equals($$0) && this.dN().B) {
         this.cp.a(cac.a(this.an().b(b)));
      }

      super.a($$0);
   }

   public cad gc() {
      return this.cp;
   }

   @Nullable
   public dkz gd() {
      return this.cn;
   }

   @Override
   public boolean b(bki $$0, @Nullable bkv $$1) {
      return false;
   }

   @Override
   protected boolean o(bkv $$0) {
      return false;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public void a(yi $$0) {
      super.a($$0);
      bzk[] $$1 = this.gb();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.a());
      }
   }

   @Override
   public boolean c(bll $$0) {
      return $$0.ep();
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, this.ch.di(), 0.0F);
   }
}
