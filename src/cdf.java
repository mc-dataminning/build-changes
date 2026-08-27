import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdf extends boz implements cey {
   private static final Logger ca = LogUtils.getLogger();
   public static final aii<Integer> b = ail.a(cdf.class, aik.b);
   private static final bzn cb = bzn.a().a(64.0);
   private static final int cc = 200;
   private static final int cd = 400;
   private static final float ce = 0.25F;
   private static final String cf = "DragonDeathTime";
   private static final String cg = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final cdd[] ch;
   public final cdd e;
   private final cdd ci;
   private final cdd cj;
   private final cdd ck;
   private final cdd cl;
   private final cdd cm;
   private final cdd cn;
   private final cdd co;
   public float bU;
   public float bV;
   public boolean bW;
   public int bX;
   public float bY;
   @Nullable
   public cde bZ;
   @Nullable
   private dpt cp;
   private ib cq = ib.c;
   private final cdw cr;
   private int cs = 100;
   private float ct;
   private final eie[] cu = new eie[24];
   private final int[] cv = new int[24];
   private final eib cx = new eib();

   public cdf(bol<? extends cdf> $$0, cwe $$1) {
      super(bol.E, $$1);
      this.e = new cdd(this, "head", 1.0F, 1.0F);
      this.ci = new cdd(this, "neck", 3.0F, 3.0F);
      this.cj = new cdd(this, "body", 5.0F, 3.0F);
      this.ck = new cdd(this, "tail", 2.0F, 2.0F);
      this.cl = new cdd(this, "tail", 2.0F, 2.0F);
      this.cm = new cdd(this, "tail", 2.0F, 2.0F);
      this.cn = new cdd(this, "wing", 4.0F, 2.0F);
      this.co = new cdd(this, "wing", 4.0F, 2.0F);
      this.ch = new cdd[]{this.e, this.ci, this.cj, this.ck, this.cl, this.cm, this.cn, this.co};
      this.t(this.eL());
      this.ae = true;
      this.as = true;
      this.cr = new cdw(this);
   }

   public void a(dpt $$0) {
      this.cp = $$0;
   }

   @Override
   public void h(ib $$0) {
      this.cq = $$0;
   }

   public ib u() {
      return this.cq;
   }

   public static bqd.a w() {
      return boz.C().a(bqe.n, 200.0);
   }

   @Override
   public boolean aT() {
      float $$0 = awm.b(this.bV * (float) (Math.PI * 2));
      float $$1 = awm.b(this.bU * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aS() {
      if (this.dJ().B && !this.aU()) {
         this.dJ().a(this.do(), this.dq(), this.du(), atp.hP, this.cY(), 5.0F, 0.8F + this.af.i() * 0.3F, false);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(b, cdv.k.b());
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
      double $$6 = awm.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = awm.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void d_() {
      this.aG();
      if (this.dJ().B) {
         this.t(this.eu());
         if (!this.aU() && !this.cr.a().a() && --this.cs < 0) {
            this.dJ().a(this.do(), this.dq(), this.du(), atp.hQ, this.cY(), 2.5F, 0.8F + this.af.i() * 0.3F, false);
            this.cs = 200 + this.af.a(200);
         }
      }

      if (this.cp == null && this.dJ() instanceof apa $$0) {
         dpt $$1 = $$0.D();
         if ($$1 != null && this.ct().equals($$1.i())) {
            this.cp = $$1;
         }
      }

      this.bU = this.bV;
      if (this.ev()) {
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         float $$3 = (this.af.i() - 0.5F) * 4.0F;
         float $$4 = (this.af.i() - 0.5F) * 8.0F;
         this.dJ().a(kb.x, this.do() + (double)$$2, this.dq() + 2.0 + (double)$$3, this.du() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gl();
         eov $$5 = this.dm();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.cr.a().a()) {
            this.bV += 0.1F;
         } else if (this.bW) {
            this.bV += $$6 * 0.5F;
         } else {
            this.bV += $$6;
         }

         this.r(awm.g(this.dz()));
         if (this.gb()) {
            this.bV = 0.5F;
         } else {
            if (this.d < 0) {
               for (int $$7 = 0; $$7 < this.c.length; $$7++) {
                  this.c[$$7][0] = (double)this.dz();
                  this.c[$$7][1] = this.dq();
               }
            }

            if (++this.d == this.c.length) {
               this.d = 0;
            }

            this.c[this.d][0] = (double)this.dz();
            this.c[this.d][1] = this.dq();
            if (this.dJ().B) {
               if (this.bo > 0) {
                  this.a(this.bo, this.bp, this.bq, this.br, this.bs, this.bt);
                  this.bo--;
               }

               this.cr.a().b();
            } else {
               cdp $$8 = this.cr.a();
               $$8.c();
               if (this.cr.a() != $$8) {
                  $$8 = this.cr.a();
                  $$8.c();
               }

               eov $$9 = $$8.g();
               if ($$9 != null) {
                  double $$10 = $$9.c - this.do();
                  double $$11 = $$9.d - this.dq();
                  double $$12 = $$9.e - this.du();
                  double $$13 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  float $$14 = $$8.f();
                  double $$15 = Math.sqrt($$10 * $$10 + $$12 * $$12);
                  if ($$15 > 0.0) {
                     $$11 = awm.a($$11 / $$15, (double)(-$$14), (double)$$14);
                  }

                  this.g(this.dm().b(0.0, $$11 * 0.01, 0.0));
                  this.r(awm.g(this.dz()));
                  eov $$16 = $$9.a(this.do(), this.dq(), this.du()).d();
                  eov $$17 = new eov((double)awm.a(this.dz() * (float) (Math.PI / 180.0)), this.dm().d, (double)(-awm.b(this.dz() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$18 = Math.max(((float)$$17.b($$16) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$10) > 1.0E-5F || Math.abs($$12) > 1.0E-5F) {
                     float $$19 = awm.a(awm.g(180.0F - (float)awm.d($$10, $$12) * (180.0F / (float)Math.PI) - this.dz()), -50.0F, 50.0F);
                     this.bY *= 0.8F;
                     this.bY = this.bY + $$19 * $$8.h();
                     this.r(this.dz() + this.bY * 0.1F);
                  }

                  float $$20 = (float)(2.0 / ($$13 + 1.0));
                  float $$21 = 0.06F;
                  this.a(0.06F * ($$18 * $$20 + (1.0F - $$20)), new eov(0.0, 0.0, -1.0));
                  if (this.bW) {
                     this.a(bpc.a, this.dm().a(0.8F));
                  } else {
                     this.a(bpc.a, this.dm());
                  }

                  eov $$22 = this.dm().d();
                  double $$23 = 0.8 + 0.15 * ($$22.b($$17) + 1.0) / 2.0;
                  this.g(this.dm().d($$23, 0.91F, $$23));
               }
            }

            this.aV = this.dz();
            eov[] $$24 = new eov[this.ch.length];

            for (int $$25 = 0; $$25 < this.ch.length; $$25++) {
               $$24[$$25] = new eov(this.ch[$$25].do(), this.ch[$$25].dq(), this.ch[$$25].du());
            }

            float $$26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$27 = awm.b($$26);
            float $$28 = awm.a($$26);
            float $$29 = this.dz() * (float) (Math.PI / 180.0);
            float $$30 = awm.a($$29);
            float $$31 = awm.b($$29);
            this.a(this.cj, (double)($$30 * 0.5F), 0.0, (double)(-$$31 * 0.5F));
            this.a(this.cn, (double)($$31 * 4.5F), 2.0, (double)($$30 * 4.5F));
            this.a(this.co, (double)($$31 * -4.5F), 2.0, (double)($$30 * -4.5F));
            if (!this.dJ().B && this.aL == 0) {
               this.a(this.dJ().a(this, this.cn.cE().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bok.e));
               this.a(this.dJ().a(this, this.co.cE().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bok.e));
               this.c(this.dJ().a(this, this.e.cE().g(1.0), bok.e));
               this.c(this.dJ().a(this, this.ci.cE().g(1.0), bok.e));
            }

            float $$32 = awm.a(this.dz() * (float) (Math.PI / 180.0) - this.bY * 0.01F);
            float $$33 = awm.b(this.dz() * (float) (Math.PI / 180.0) - this.bY * 0.01F);
            float $$34 = this.gk();
            this.a(this.e, (double)($$32 * 6.5F * $$27), (double)($$34 + $$28 * 6.5F), (double)(-$$33 * 6.5F * $$27));
            this.a(this.ci, (double)($$32 * 5.5F * $$27), (double)($$34 + $$28 * 5.5F), (double)(-$$33 * 5.5F * $$27));
            double[] $$35 = this.a(5, 1.0F);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               cdd $$37 = null;
               if ($$36 == 0) {
                  $$37 = this.ck;
               }

               if ($$36 == 1) {
                  $$37 = this.cl;
               }

               if ($$36 == 2) {
                  $$37 = this.cm;
               }

               double[] $$38 = this.a(12 + $$36 * 2, 1.0F);
               float $$39 = this.dz() * (float) (Math.PI / 180.0) + this.i($$38[0] - $$35[0]) * (float) (Math.PI / 180.0);
               float $$40 = awm.a($$39);
               float $$41 = awm.b($$39);
               float $$42 = 1.5F;
               float $$43 = (float)($$36 + 1) * 2.0F;
               this.a(
                  $$37,
                  (double)(-($$30 * 1.5F + $$40 * $$43) * $$27),
                  $$38[1] - $$35[1] - (double)(($$43 + 1.5F) * $$28) + 1.5,
                  (double)(($$31 * 1.5F + $$41 * $$43) * $$27)
               );
            }

            if (!this.dJ().B) {
               this.bW = this.b(this.e.cE()) | this.b(this.ci.cE()) | this.b(this.cj.cE());
               if (this.cp != null) {
                  this.cp.b(this);
               }
            }

            for (int $$44 = 0; $$44 < this.ch.length; $$44++) {
               this.ch[$$44].J = $$24[$$44].c;
               this.ch[$$44].K = $$24[$$44].d;
               this.ch[$$44].L = $$24[$$44].e;
               this.ch[$$44].ab = $$24[$$44].c;
               this.ch[$$44].ac = $$24[$$44].d;
               this.ch[$$44].ad = $$24[$$44].e;
            }
         }
      }
   }

   private void a(cdd $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.do() + $$1, this.dq() + $$2, this.du() + $$3);
   }

   private float gk() {
      if (this.cr.a().a()) {
         return -1.0F;
      } else {
         double[] $$0 = this.a(5, 1.0F);
         double[] $$1 = this.a(0, 1.0F);
         return (float)($$0[1] - $$1[1]);
      }
   }

   private void gl() {
      if (this.bZ != null) {
         if (this.bZ.dE()) {
            this.bZ = null;
         } else if (this.ag % 10 == 0 && this.eu() < this.eL()) {
            this.t(this.eu() + 1.0F);
         }
      }

      if (this.af.a(10) == 0) {
         List<cde> $$0 = this.dJ().a(cde.class, this.cE().g(32.0));
         cde $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cde $$3 : $$0) {
            double $$4 = $$3.f(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.bZ = $$1;
      }
   }

   private void a(List<bof> $$0) {
      double $$1 = (this.cj.cE().a + this.cj.cE().d) / 2.0;
      double $$2 = (this.cj.cE().c + this.cj.cE().f) / 2.0;

      for (bof $$3 : $$0) {
         if ($$3 instanceof box) {
            double $$4 = $$3.do() - $$1;
            double $$5 = $$3.du() - $$2;
            double $$6 = Math.max($$4 * $$4 + $$5 * $$5, 0.1);
            $$3.j($$4 / $$6 * 4.0, 0.2F, $$5 / $$6 * 4.0);
            if (!this.cr.a().a() && ((box)$$3).eh() < $$3.ag - 2) {
               $$3.a(this.dK().b((box)this), 5.0F);
               this.a(this, $$3);
            }
         }
      }
   }

   private void c(List<bof> $$0) {
      for (bof $$1 : $$0) {
         if ($$1 instanceof box) {
            $$1.a(this.dK().b((box)this), 10.0F);
            this.a(this, $$1);
         }
      }
   }

   private float i(double $$0) {
      return (float)awm.d($$0);
   }

   private boolean b(eoq $$0) {
      int $$1 = awm.a($$0.a);
      int $$2 = awm.a($$0.b);
      int $$3 = awm.a($$0.c);
      int $$4 = awm.a($$0.d);
      int $$5 = awm.a($$0.e);
      int $$6 = awm.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               ib $$12 = new ib($$9, $$10, $$11);
               dme $$13 = this.dJ().a_($$12);
               if (!$$13.i() && !$$13.a(aue.aC)) {
                  if (this.dJ().Z().b(cwa.c) && !$$13.a(aue.aB)) {
                     $$8 = this.dJ().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         ib $$14 = new ib($$1 + this.af.a($$4 - $$1 + 1), $$2 + this.af.a($$5 - $$2 + 1), $$3 + this.af.a($$6 - $$3 + 1));
         this.dJ().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(cdd $$0, bne $$1, float $$2) {
      if (this.cr.a().i() == cdv.j) {
         return false;
      } else {
         $$2 = this.cr.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cia || $$1.a(aug.z)) {
               float $$3 = this.eu();
               this.g($$1, $$2);
               if (this.ev() && !this.cr.a().a()) {
                  this.t(1.0F);
                  this.cr.a(cdv.j);
               }

               if (this.cr.a().a()) {
                  this.ct = this.ct + $$3 - this.eu();
                  if (this.ct > 0.25F * this.eL()) {
                     this.ct = 0.0F;
                     this.cr.a(cdv.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      return !this.dJ().B ? this.a(this.cj, $$0, $$1) : false;
   }

   protected boolean g(bne $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void al() {
      this.a(bof.c.a);
      this.b(dqr.p);
      if (this.cp != null) {
         this.cp.b(this);
         this.cp.a(this);
      }
   }

   @Override
   protected void ea() {
      if (this.cp != null) {
         this.cp.b(this);
      }

      this.bX++;
      if (this.bX >= 180 && this.bX <= 200) {
         float $$0 = (this.af.i() - 0.5F) * 8.0F;
         float $$1 = (this.af.i() - 0.5F) * 4.0F;
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         this.dJ().a(kb.w, this.do() + (double)$$0, this.dq() + 2.0 + (double)$$1, this.du() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dJ().Z().b(cwa.f);
      int $$4 = 500;
      if (this.cp != null && !this.cp.f()) {
         $$4 = 12000;
      }

      if (this.dJ() instanceof apa) {
         if (this.bX > 150 && this.bX % 5 == 0 && $$3) {
            bon.a((apa)this.dJ(), this.dh(), awm.d((float)$$4 * 0.08F));
         }

         if (this.bX == 1 && !this.aU()) {
            this.dJ().b(1028, this.dj(), 0);
         }
      }

      this.a(bpc.a, new eov(0.0, 0.1F, 0.0));
      if (this.bX == 200 && this.dJ() instanceof apa) {
         if ($$3) {
            bon.a((apa)this.dJ(), this.dh(), awm.d((float)$$4 * 0.2F));
         }

         if (this.cp != null) {
            this.cp.a(this);
         }

         this.a(bof.c.a);
         this.b(dqr.p);
      }
   }

   public int A() {
      if (this.cu[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = awm.d(60.0F * awm.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = awm.d(60.0F * awm.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = awm.d(40.0F * awm.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = awm.d(40.0F * awm.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = awm.d(20.0F * awm.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = awm.d(20.0F * awm.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.dJ().A_() + 10, this.dJ().a(drq.a.f, new ib($$3, 0, $$4)).v() + $$1);
            this.cu[$$0] = new eie($$3, $$9, $$4);
         }

         this.cv[0] = 6146;
         this.cv[1] = 8197;
         this.cv[2] = 8202;
         this.cv[3] = 16404;
         this.cv[4] = 32808;
         this.cv[5] = 32848;
         this.cv[6] = 65696;
         this.cv[7] = 131392;
         this.cv[8] = 131712;
         this.cv[9] = 263424;
         this.cv[10] = 526848;
         this.cv[11] = 525313;
         this.cv[12] = 1581057;
         this.cv[13] = 3166214;
         this.cv[14] = 2138120;
         this.cv[15] = 6373424;
         this.cv[16] = 4358208;
         this.cv[17] = 12910976;
         this.cv[18] = 9044480;
         this.cv[19] = 9706496;
         this.cv[20] = 15216640;
         this.cv[21] = 13688832;
         this.cv[22] = 11763712;
         this.cv[23] = 8257536;
      }

      return this.r(this.do(), this.dq(), this.du());
   }

   public int r(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      eie $$5 = new eie(awm.a($$0), awm.a($$1), awm.a($$2));
      int $$6 = 0;
      if (this.cp == null || this.cp.e() == 0) {
         $$6 = 12;
      }

      for (int $$7 = $$6; $$7 < 24; $$7++) {
         if (this.cu[$$7] != null) {
            float $$8 = this.cu[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public eig a(int $$0, int $$1, @Nullable eie $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         eie $$4 = this.cu[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      eie $$5 = this.cu[$$0];
      eie $$6 = this.cu[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cx.a();
      this.cx.a($$5);
      eie $$7 = $$5;
      int $$8 = 0;
      if (this.cp == null || this.cp.e() == 0) {
         $$8 = 12;
      }

      while (!this.cx.e()) {
         eie $$9 = this.cx.c();
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
            if (this.cu[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for (int $$12 = $$8; $$12 < 24; $$12++) {
            if ((this.cv[$$10] & 1 << $$12) > 0) {
               eie $$13 = this.cu[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.cx.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.cx.a($$13);
                     }
                  }
               }
            }
         }
      }

      if ($$7 == $$5) {
         return null;
      } else {
         ca.debug("Failed to find path from {} to {}", $$0, $$1);
         if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
         }

         return this.a($$5, $$7);
      }
   }

   private eig a(eie $$0, eie $$1) {
      List<eie> $$2 = Lists.newArrayList();
      eie $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new eig($$2, new ib($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cr.a().i().b());
      $$0.a("DragonDeathTime", this.bX);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cr.a(cdv.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bX = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dv() {
   }

   public cdd[] gh() {
      return this.ch;
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public atq cY() {
      return atq.f;
   }

   @Override
   protected ato y() {
      return atp.hM;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.hR;
   }

   @Override
   protected float eY() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      cdp $$3 = this.cr.a();
      cdv<? extends cdp> $$4 = $$3.i();
      double $$7;
      if ($$4 == cdv.d || $$4 == cdv.e) {
         ib $$5 = this.dJ().a(drq.a.f, dut.a(this.cq));
         double $$6 = Math.max(Math.sqrt($$5.b(this.dh())) / 4.0, 1.0);
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

   public eov D(float $$0) {
      cdp $$1 = this.cr.a();
      cdv<? extends cdp> $$2 = $$1.i();
      eov $$8;
      if ($$2 == cdv.d || $$2 == cdv.e) {
         ib $$3 = this.dJ().a(drq.a.f, dut.a(this.cq));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.dh())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dB();
         float $$7 = 1.5F;
         this.s(-$$5 * 1.5F * 5.0F);
         $$8 = this.f($$0);
         this.s($$6);
      } else if ($$1.a()) {
         float $$9 = this.dB();
         float $$10 = 1.5F;
         this.s(-45.0F);
         $$8 = this.f($$0);
         this.s($$9);
      } else {
         $$8 = this.f($$0);
      }

      return $$8;
   }

   public void a(cde $$0, ib $$1, bne $$2) {
      cia $$3;
      if ($$2.d() instanceof cia) {
         $$3 = (cia)$$2.d();
      } else {
         $$3 = this.dJ().a(cb, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.bZ) {
         this.a(this.e, this.dK().d($$0, $$3), 10.0F);
      }

      this.cr.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aii<?> $$0) {
      if (b.equals($$0) && this.dJ().B) {
         this.cr.a(cdv.a(this.an().b(b)));
      }

      super.a($$0);
   }

   public cdw gi() {
      return this.cr;
   }

   @Nullable
   public dpt gj() {
      return this.cp;
   }

   @Override
   public boolean b(bns $$0, @Nullable bof $$1) {
      return false;
   }

   @Override
   protected boolean n(bof $$0) {
      return false;
   }

   @Override
   public boolean cq() {
      return false;
   }

   @Override
   public void a(aaj $$0) {
      super.a($$0);
      cdd[] $$1 = this.gh();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b());
      }
   }

   @Override
   public boolean c(box $$0) {
      return $$0.en();
   }
}
