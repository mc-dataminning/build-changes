import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class cao extends bmn implements cch {
   private static final Logger bY = LogUtils.getLogger();
   public static final agm<Integer> b = agp.a(cao.class, ago.b);
   private static final bwz bZ = bwz.a().a(64.0);
   private static final int ca = 200;
   private static final int cb = 400;
   private static final float cc = 0.25F;
   private static final String cd = "DragonDeathTime";
   private static final String ce = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final cam[] cf;
   public final cam e;
   private final cam cg;
   private final cam ch;
   private final cam ci;
   private final cam cj;
   private final cam ck;
   private final cam cl;
   private final cam cm;
   public float bS;
   public float bT;
   public boolean bU;
   public int bV;
   public float bW;
   @Nullable
   public can bX;
   @Nullable
   private dmt cn;
   private hx co = hx.b;
   private final cbf cp;
   private int cq = 100;
   private float cr;
   private final efe[] cs = new efe[24];
   private final int[] ct = new int[24];
   private final efb cu = new efb();

   public cao(blz<? extends cao> $$0, ctp $$1) {
      super(blz.D, $$1);
      this.e = new cam(this, "head", 1.0F, 1.0F);
      this.cg = new cam(this, "neck", 3.0F, 3.0F);
      this.ch = new cam(this, "body", 5.0F, 3.0F);
      this.ci = new cam(this, "tail", 2.0F, 2.0F);
      this.cj = new cam(this, "tail", 2.0F, 2.0F);
      this.ck = new cam(this, "tail", 2.0F, 2.0F);
      this.cl = new cam(this, "wing", 4.0F, 2.0F);
      this.cm = new cam(this, "wing", 4.0F, 2.0F);
      this.cf = new cam[]{this.e, this.cg, this.ch, this.ci, this.cj, this.ck, this.cl, this.cm};
      this.c(this.eM());
      this.af = true;
      this.at = true;
      this.cp = new cbf(this);
   }

   public void a(dmt $$0) {
      this.cn = $$0;
   }

   @Override
   public void h(hx $$0) {
      this.co = $$0;
   }

   public hx u() {
      return this.co;
   }

   public static bnq.a w() {
      return bmn.C().a(bnr.l, 200.0);
   }

   @Override
   public boolean aT() {
      float $$0 = auo.b(this.bT * (float) (Math.PI * 2));
      float $$1 = auo.b(this.bS * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aS() {
      if (this.dM().B && !this.aU()) {
         this.dM().a(this.dr(), this.dt(), this.dx(), ars.hz, this.db(), 5.0F, 0.8F + this.ag.i() * 0.3F, false);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(b, cbe.k.b());
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
      double $$6 = auo.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = auo.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void d_() {
      this.aG();
      if (this.dM().B) {
         this.c(this.ev());
         if (!this.aU() && !this.cp.a().a() && --this.cq < 0) {
            this.dM().a(this.dr(), this.dt(), this.dx(), ars.hA, this.db(), 2.5F, 0.8F + this.ag.i() * 0.3F, false);
            this.cq = 200 + this.ag.a(200);
         }
      }

      if (this.cn == null && this.dM() instanceof and $$0) {
         dmt $$1 = $$0.D();
         if ($$1 != null && this.cw().equals($$1.i())) {
            this.cn = $$1;
         }
      }

      this.bS = this.bT;
      if (this.ew()) {
         float $$2 = (this.ag.i() - 0.5F) * 8.0F;
         float $$3 = (this.ag.i() - 0.5F) * 4.0F;
         float $$4 = (this.ag.i() - 0.5F) * 8.0F;
         this.dM().a(jx.x, this.dr() + (double)$$2, this.dt() + 2.0 + (double)$$3, this.dx() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.ge();
         elt $$5 = this.dp();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.cp.a().a()) {
            this.bT += 0.1F;
         } else if (this.bU) {
            this.bT += $$6 * 0.5F;
         } else {
            this.bT += $$6;
         }

         this.r(auo.g(this.dC()));
         if (this.fU()) {
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
               cay $$8 = this.cp.a();
               $$8.c();
               if (this.cp.a() != $$8) {
                  $$8 = this.cp.a();
                  $$8.c();
               }

               elt $$9 = $$8.g();
               if ($$9 != null) {
                  double $$10 = $$9.c - this.dr();
                  double $$11 = $$9.d - this.dt();
                  double $$12 = $$9.e - this.dx();
                  double $$13 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  float $$14 = $$8.f();
                  double $$15 = Math.sqrt($$10 * $$10 + $$12 * $$12);
                  if ($$15 > 0.0) {
                     $$11 = auo.a($$11 / $$15, (double)(-$$14), (double)$$14);
                  }

                  this.g(this.dp().b(0.0, $$11 * 0.01, 0.0));
                  this.r(auo.g(this.dC()));
                  elt $$16 = $$9.a(this.dr(), this.dt(), this.dx()).d();
                  elt $$17 = new elt((double)auo.a(this.dC() * (float) (Math.PI / 180.0)), this.dp().d, (double)(-auo.b(this.dC() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$18 = Math.max(((float)$$17.b($$16) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$10) > 1.0E-5F || Math.abs($$12) > 1.0E-5F) {
                     float $$19 = auo.a(auo.g(180.0F - (float)auo.d($$10, $$12) * (180.0F / (float)Math.PI) - this.dC()), -50.0F, 50.0F);
                     this.bW *= 0.8F;
                     this.bW = this.bW + $$19 * $$8.h();
                     this.r(this.dC() + this.bW * 0.1F);
                  }

                  float $$20 = (float)(2.0 / ($$13 + 1.0));
                  float $$21 = 0.06F;
                  this.a(0.06F * ($$18 * $$20 + (1.0F - $$20)), new elt(0.0, 0.0, -1.0));
                  if (this.bU) {
                     this.a(bmr.a, this.dp().a(0.8F));
                  } else {
                     this.a(bmr.a, this.dp());
                  }

                  elt $$22 = this.dp().d();
                  double $$23 = 0.8 + 0.15 * ($$22.b($$17) + 1.0) / 2.0;
                  this.g(this.dp().d($$23, 0.91F, $$23));
               }
            }

            this.aU = this.dC();
            elt[] $$24 = new elt[this.cf.length];

            for (int $$25 = 0; $$25 < this.cf.length; $$25++) {
               $$24[$$25] = new elt(this.cf[$$25].dr(), this.cf[$$25].dt(), this.cf[$$25].dx());
            }

            float $$26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$27 = auo.b($$26);
            float $$28 = auo.a($$26);
            float $$29 = this.dC() * (float) (Math.PI / 180.0);
            float $$30 = auo.a($$29);
            float $$31 = auo.b($$29);
            this.a(this.ch, (double)($$30 * 0.5F), 0.0, (double)(-$$31 * 0.5F));
            this.a(this.cl, (double)($$31 * 4.5F), 2.0, (double)($$30 * 4.5F));
            this.a(this.cm, (double)($$31 * -4.5F), 2.0, (double)($$30 * -4.5F));
            if (!this.dM().B && this.aK == 0) {
               this.a(this.dM().a(this, this.cl.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bly.e));
               this.a(this.dM().a(this, this.cm.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bly.e));
               this.c(this.dM().a(this, this.e.cH().g(1.0), bly.e));
               this.c(this.dM().a(this, this.cg.cH().g(1.0), bly.e));
            }

            float $$32 = auo.a(this.dC() * (float) (Math.PI / 180.0) - this.bW * 0.01F);
            float $$33 = auo.b(this.dC() * (float) (Math.PI / 180.0) - this.bW * 0.01F);
            float $$34 = this.gd();
            this.a(this.e, (double)($$32 * 6.5F * $$27), (double)($$34 + $$28 * 6.5F), (double)(-$$33 * 6.5F * $$27));
            this.a(this.cg, (double)($$32 * 5.5F * $$27), (double)($$34 + $$28 * 5.5F), (double)(-$$33 * 5.5F * $$27));
            double[] $$35 = this.a(5, 1.0F);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               cam $$37 = null;
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
               float $$40 = auo.a($$39);
               float $$41 = auo.b($$39);
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

   private void a(cam $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dr() + $$1, this.dt() + $$2, this.dx() + $$3);
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
         if (this.bX.dH()) {
            this.bX = null;
         } else if (this.ah % 10 == 0 && this.ev() < this.eM()) {
            this.c(this.ev() + 1.0F);
         }
      }

      if (this.ag.a(10) == 0) {
         List<can> $$0 = this.dM().a(can.class, this.cH().g(32.0));
         can $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (can $$3 : $$0) {
            double $$4 = $$3.f(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.bX = $$1;
      }
   }

   private void a(List<blv> $$0) {
      double $$1 = (this.ch.cH().a + this.ch.cH().d) / 2.0;
      double $$2 = (this.ch.cH().c + this.ch.cH().f) / 2.0;

      for (blv $$3 : $$0) {
         if ($$3 instanceof bml) {
            double $$4 = $$3.dr() - $$1;
            double $$5 = $$3.dx() - $$2;
            double $$6 = Math.max($$4 * $$4 + $$5 * $$5, 0.1);
            $$3.j($$4 / $$6 * 4.0, 0.2F, $$5 / $$6 * 4.0);
            if (!this.cp.a().a() && ((bml)$$3).ei() < $$3.ah - 2) {
               $$3.a(this.dN().b((bml)this), 5.0F);
               this.a(this, $$3);
            }
         }
      }
   }

   private void c(List<blv> $$0) {
      for (blv $$1 : $$0) {
         if ($$1 instanceof bml) {
            $$1.a(this.dN().b((bml)this), 10.0F);
            this.a(this, $$1);
         }
      }
   }

   private float i(double $$0) {
      return (float)auo.d($$0);
   }

   private boolean b(elo $$0) {
      int $$1 = auo.a($$0.a);
      int $$2 = auo.a($$0.b);
      int $$3 = auo.a($$0.c);
      int $$4 = auo.a($$0.d);
      int $$5 = auo.a($$0.e);
      int $$6 = auo.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               hx $$12 = new hx($$9, $$10, $$11);
               djh $$13 = this.dM().a_($$12);
               if (!$$13.i() && !$$13.a(ash.aC)) {
                  if (this.dM().Z().b(ctl.c) && !$$13.a(ash.aB)) {
                     $$8 = this.dM().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         hx $$14 = new hx($$1 + this.ag.a($$4 - $$1 + 1), $$2 + this.ag.a($$5 - $$2 + 1), $$3 + this.ag.a($$6 - $$3 + 1));
         this.dM().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(cam $$0, bkt $$1, float $$2) {
      if (this.cp.a().i() == cbe.j) {
         return false;
      } else {
         $$2 = this.cp.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cfi || $$1.a(asj.z)) {
               float $$3 = this.ev();
               this.g($$1, $$2);
               if (this.ew() && !this.cp.a().a()) {
                  this.c(1.0F);
                  this.cp.a(cbe.j);
               }

               if (this.cp.a().a()) {
                  this.cr = this.cr + $$3 - this.ev();
                  if (this.cr > 0.25F * this.eM()) {
                     this.cr = 0.0F;
                     this.cp.a(cbe.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      return !this.dM().B ? this.a(this.ch, $$0, $$1) : false;
   }

   protected boolean g(bkt $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void al() {
      this.a(blv.c.a);
      this.a(dnr.p);
      if (this.cn != null) {
         this.cn.b(this);
         this.cn.a(this);
      }
   }

   @Override
   protected void eb() {
      if (this.cn != null) {
         this.cn.b(this);
      }

      this.bV++;
      if (this.bV >= 180 && this.bV <= 200) {
         float $$0 = (this.ag.i() - 0.5F) * 8.0F;
         float $$1 = (this.ag.i() - 0.5F) * 4.0F;
         float $$2 = (this.ag.i() - 0.5F) * 8.0F;
         this.dM().a(jx.w, this.dr() + (double)$$0, this.dt() + 2.0 + (double)$$1, this.dx() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dM().Z().b(ctl.f);
      int $$4 = 500;
      if (this.cn != null && !this.cn.f()) {
         $$4 = 12000;
      }

      if (this.dM() instanceof and) {
         if (this.bV > 150 && this.bV % 5 == 0 && $$3) {
            bmb.a((and)this.dM(), this.dk(), auo.d((float)$$4 * 0.08F));
         }

         if (this.bV == 1 && !this.aU()) {
            this.dM().b(1028, this.dm(), 0);
         }
      }

      this.a(bmr.a, new elt(0.0, 0.1F, 0.0));
      if (this.bV == 200 && this.dM() instanceof and) {
         if ($$3) {
            bmb.a((and)this.dM(), this.dk(), auo.d((float)$$4 * 0.2F));
         }

         if (this.cn != null) {
            this.cn.a(this);
         }

         this.a(blv.c.a);
         this.a(dnr.p);
      }
   }

   public int A() {
      if (this.cs[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = auo.d(60.0F * auo.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = auo.d(60.0F * auo.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = auo.d(40.0F * auo.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = auo.d(40.0F * auo.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = auo.d(20.0F * auo.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = auo.d(20.0F * auo.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.dM().A_() + 10, this.dM().a(doq.a.f, new hx($$3, 0, $$4)).v() + $$1);
            this.cs[$$0] = new efe($$3, $$9, $$4);
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
      efe $$5 = new efe(auo.a($$0), auo.a($$1), auo.a($$2));
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
   public efg a(int $$0, int $$1, @Nullable efe $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         efe $$4 = this.cs[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      efe $$5 = this.cs[$$0];
      efe $$6 = this.cs[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cu.a();
      this.cu.a($$5);
      efe $$7 = $$5;
      int $$8 = 0;
      if (this.cn == null || this.cn.e() == 0) {
         $$8 = 12;
      }

      while (!this.cu.e()) {
         efe $$9 = this.cu.c();
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
               efe $$13 = this.cs[$$12];
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

   private efg a(efe $$0, efe $$1) {
      List<efe> $$2 = Lists.newArrayList();
      efe $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new efg($$2, new hx($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cp.a().i().b());
      $$0.a("DragonDeathTime", this.bV);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cp.a(cbe.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bV = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dy() {
   }

   public cam[] ga() {
      return this.cf;
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public art db() {
      return art.f;
   }

   @Override
   protected arr y() {
      return ars.hw;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.hB;
   }

   @Override
   protected float eW() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      cay $$3 = this.cp.a();
      cbe<? extends cay> $$4 = $$3.i();
      double $$7;
      if ($$4 == cbe.d || $$4 == cbe.e) {
         hx $$5 = this.dM().a(doq.a.f, drt.a(this.co));
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

   public elt D(float $$0) {
      cay $$1 = this.cp.a();
      cbe<? extends cay> $$2 = $$1.i();
      elt $$8;
      if ($$2 == cbe.d || $$2 == cbe.e) {
         hx $$3 = this.dM().a(doq.a.f, drt.a(this.co));
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

   public void a(can $$0, hx $$1, bkt $$2) {
      cfi $$3;
      if ($$2.d() instanceof cfi) {
         $$3 = (cfi)$$2.d();
      } else {
         $$3 = this.dM().a(bZ, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.bX) {
         this.a(this.e, this.dN().d($$0, $$3), 10.0F);
      }

      this.cp.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(agm<?> $$0) {
      if (b.equals($$0) && this.dM().B) {
         this.cp.a(cbe.a(this.an().b(b)));
      }

      super.a($$0);
   }

   public cbf gb() {
      return this.cp;
   }

   @Nullable
   public dmt gc() {
      return this.cn;
   }

   @Override
   public boolean b(bli $$0, @Nullable blv $$1) {
      return false;
   }

   @Override
   protected boolean o(blv $$0) {
      return false;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public void a(zb $$0) {
      super.a($$0);
      cam[] $$1 = this.ga();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.a());
      }
   }

   @Override
   public boolean c(bml $$0) {
      return $$0.eo();
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, this.ch.dh(), 0.0F);
   }
}
