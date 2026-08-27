import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdy extends bpr implements cfs {
   private static final Logger cc = LogUtils.getLogger();
   public static final aim<Integer> b = aiq.a(cdy.class, aio.b);
   private static final caf cd = caf.a().a(64.0);
   private static final int ce = 200;
   private static final int cf = 400;
   private static final float cg = 0.25F;
   private static final String ch = "DragonDeathTime";
   private static final String ci = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final cdw[] cj;
   public final cdw e;
   private final cdw ck;
   private final cdw cl;
   private final cdw cm;
   private final cdw cn;
   private final cdw co;
   private final cdw cp;
   private final cdw cq;
   public float bW;
   public float bX;
   public boolean bY;
   public int bZ;
   public float ca;
   @Nullable
   public cdx cb;
   @Nullable
   private dqr cr;
   private ib cs = ib.c;
   private final cep ct;
   private int cu = 100;
   private float cv;
   private final ejb[] cw = new ejb[24];
   private final int[] cx = new int[24];
   private final eiz cz = new eiz();

   public cdy(bpd<? extends cdy> $$0, cxb $$1) {
      super(bpd.G, $$1);
      this.e = new cdw(this, "head", 1.0F, 1.0F);
      this.ck = new cdw(this, "neck", 3.0F, 3.0F);
      this.cl = new cdw(this, "body", 5.0F, 3.0F);
      this.cm = new cdw(this, "tail", 2.0F, 2.0F);
      this.cn = new cdw(this, "tail", 2.0F, 2.0F);
      this.co = new cdw(this, "tail", 2.0F, 2.0F);
      this.cp = new cdw(this, "wing", 4.0F, 2.0F);
      this.cq = new cdw(this, "wing", 4.0F, 2.0F);
      this.cj = new cdw[]{this.e, this.ck, this.cl, this.cm, this.cn, this.co, this.cp, this.cq};
      this.t(this.eO());
      this.af = true;
      this.at = true;
      this.ct = new cep(this);
   }

   public void a(dqr $$0) {
      this.cr = $$0;
   }

   @Override
   public void h(ib $$0) {
      this.cs = $$0;
   }

   public ib r() {
      return this.cs;
   }

   public static bqv.a s() {
      return bpr.A().a(bqw.q, 200.0);
   }

   @Override
   public boolean aT() {
      float $$0 = aww.b(this.bX * (float) (Math.PI * 2));
      float $$1 = aww.b(this.bW * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aS() {
      if (this.dM().B && !this.aU()) {
         this.dM().a(this.dr(), this.dt(), this.dx(), aty.hW, this.db(), 5.0F, 0.8F + this.ag.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(b, ceo.k.b());
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
      double $$6 = aww.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = aww.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void m_() {
      this.aG();
      if (this.dM().B) {
         this.t(this.ex());
         if (!this.aU() && !this.ct.a().a() && --this.cu < 0) {
            this.dM().a(this.dr(), this.dt(), this.dx(), aty.hX, this.db(), 2.5F, 0.8F + this.ag.i() * 0.3F, false);
            this.cu = 200 + this.ag.a(200);
         }
      }

      if (this.cr == null && this.dM() instanceof apf $$0) {
         dqr $$1 = $$0.D();
         if ($$1 != null && this.cw().equals($$1.i())) {
            this.cr = $$1;
         }
      }

      this.bW = this.bX;
      if (this.ey()) {
         float $$2 = (this.ag.i() - 0.5F) * 8.0F;
         float $$3 = (this.ag.i() - 0.5F) * 4.0F;
         float $$4 = (this.ag.i() - 0.5F) * 8.0F;
         this.dM().a(kc.x, this.dr() + (double)$$2, this.dt() + 2.0 + (double)$$3, this.dx() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gn();
         ept $$5 = this.dp();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.ct.a().a()) {
            this.bX += 0.1F;
         } else if (this.bY) {
            this.bX += $$6 * 0.5F;
         } else {
            this.bX += $$6;
         }

         this.r(aww.g(this.dC()));
         if (this.gd()) {
            this.bX = 0.5F;
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
               if (this.bq > 0) {
                  this.a(this.bq, this.br, this.bs, this.bt, this.bu, this.bv);
                  this.bq--;
               }

               this.ct.a().b();
            } else {
               cei $$8 = this.ct.a();
               $$8.c();
               if (this.ct.a() != $$8) {
                  $$8 = this.ct.a();
                  $$8.c();
               }

               ept $$9 = $$8.g();
               if ($$9 != null) {
                  double $$10 = $$9.c - this.dr();
                  double $$11 = $$9.d - this.dt();
                  double $$12 = $$9.e - this.dx();
                  double $$13 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  float $$14 = $$8.f();
                  double $$15 = Math.sqrt($$10 * $$10 + $$12 * $$12);
                  if ($$15 > 0.0) {
                     $$11 = aww.a($$11 / $$15, (double)(-$$14), (double)$$14);
                  }

                  this.g(this.dp().b(0.0, $$11 * 0.01, 0.0));
                  this.r(aww.g(this.dC()));
                  ept $$16 = $$9.a(this.dr(), this.dt(), this.dx()).d();
                  ept $$17 = new ept((double)aww.a(this.dC() * (float) (Math.PI / 180.0)), this.dp().d, (double)(-aww.b(this.dC() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$18 = Math.max(((float)$$17.b($$16) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$10) > 1.0E-5F || Math.abs($$12) > 1.0E-5F) {
                     float $$19 = aww.a(aww.g(180.0F - (float)aww.d($$10, $$12) * (180.0F / (float)Math.PI) - this.dC()), -50.0F, 50.0F);
                     this.ca *= 0.8F;
                     this.ca = this.ca + $$19 * $$8.h();
                     this.r(this.dC() + this.ca * 0.1F);
                  }

                  float $$20 = (float)(2.0 / ($$13 + 1.0));
                  float $$21 = 0.06F;
                  this.a(0.06F * ($$18 * $$20 + (1.0F - $$20)), new ept(0.0, 0.0, -1.0));
                  if (this.bY) {
                     this.a(bpu.a, this.dp().a(0.8F));
                  } else {
                     this.a(bpu.a, this.dp());
                  }

                  ept $$22 = this.dp().d();
                  double $$23 = 0.8 + 0.15 * ($$22.b($$17) + 1.0) / 2.0;
                  this.g(this.dp().d($$23, 0.91F, $$23));
               }
            }

            this.aX = this.dC();
            ept[] $$24 = new ept[this.cj.length];

            for (int $$25 = 0; $$25 < this.cj.length; $$25++) {
               $$24[$$25] = new ept(this.cj[$$25].dr(), this.cj[$$25].dt(), this.cj[$$25].dx());
            }

            float $$26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$27 = aww.b($$26);
            float $$28 = aww.a($$26);
            float $$29 = this.dC() * (float) (Math.PI / 180.0);
            float $$30 = aww.a($$29);
            float $$31 = aww.b($$29);
            this.a(this.cl, (double)($$30 * 0.5F), 0.0, (double)(-$$31 * 0.5F));
            this.a(this.cp, (double)($$31 * 4.5F), 2.0, (double)($$30 * 4.5F));
            this.a(this.cq, (double)($$31 * -4.5F), 2.0, (double)($$30 * -4.5F));
            if (!this.dM().B && this.aN == 0) {
               this.b(this.dM().a(this, this.cp.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bpc.e));
               this.b(this.dM().a(this, this.cq.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bpc.e));
               this.c(this.dM().a(this, this.e.cH().g(1.0), bpc.e));
               this.c(this.dM().a(this, this.ck.cH().g(1.0), bpc.e));
            }

            float $$32 = aww.a(this.dC() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$33 = aww.b(this.dC() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$34 = this.gm();
            this.a(this.e, (double)($$32 * 6.5F * $$27), (double)($$34 + $$28 * 6.5F), (double)(-$$33 * 6.5F * $$27));
            this.a(this.ck, (double)($$32 * 5.5F * $$27), (double)($$34 + $$28 * 5.5F), (double)(-$$33 * 5.5F * $$27));
            double[] $$35 = this.a(5, 1.0F);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               cdw $$37 = null;
               if ($$36 == 0) {
                  $$37 = this.cm;
               }

               if ($$36 == 1) {
                  $$37 = this.cn;
               }

               if ($$36 == 2) {
                  $$37 = this.co;
               }

               double[] $$38 = this.a(12 + $$36 * 2, 1.0F);
               float $$39 = this.dC() * (float) (Math.PI / 180.0) + this.i($$38[0] - $$35[0]) * (float) (Math.PI / 180.0);
               float $$40 = aww.a($$39);
               float $$41 = aww.b($$39);
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
               this.bY = this.b(this.e.cH()) | this.b(this.ck.cH()) | this.b(this.cl.cH());
               if (this.cr != null) {
                  this.cr.b(this);
               }
            }

            for (int $$44 = 0; $$44 < this.cj.length; $$44++) {
               this.cj[$$44].K = $$24[$$44].c;
               this.cj[$$44].L = $$24[$$44].d;
               this.cj[$$44].M = $$24[$$44].e;
               this.cj[$$44].ac = $$24[$$44].c;
               this.cj[$$44].ad = $$24[$$44].d;
               this.cj[$$44].ae = $$24[$$44].e;
            }
         }
      }
   }

   private void a(cdw $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dr() + $$1, this.dt() + $$2, this.dx() + $$3);
   }

   private float gm() {
      if (this.ct.a().a()) {
         return -1.0F;
      } else {
         double[] $$0 = this.a(5, 1.0F);
         double[] $$1 = this.a(0, 1.0F);
         return (float)($$0[1] - $$1[1]);
      }
   }

   private void gn() {
      if (this.cb != null) {
         if (this.cb.dH()) {
            this.cb = null;
         } else if (this.ah % 10 == 0 && this.ex() < this.eO()) {
            this.t(this.ex() + 1.0F);
         }
      }

      if (this.ag.a(10) == 0) {
         List<cdx> $$0 = this.dM().a(cdx.class, this.cH().g(32.0));
         cdx $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cdx $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.cb = $$1;
      }
   }

   private void b(List<box> $$0) {
      double $$1 = (this.cl.cH().a + this.cl.cH().d) / 2.0;
      double $$2 = (this.cl.cH().c + this.cl.cH().f) / 2.0;

      for (box $$3 : $$0) {
         if ($$3 instanceof bpp) {
            double $$4 = $$3.dr() - $$1;
            double $$5 = $$3.dx() - $$2;
            double $$6 = Math.max($$4 * $$4 + $$5 * $$5, 0.1);
            $$3.j($$4 / $$6 * 4.0, 0.2F, $$5 / $$6 * 4.0);
            if (!this.ct.a().a() && ((bpp)$$3).ek() < $$3.ah - 2) {
               $$3.a(this.dN().b((bpp)this), 5.0F);
               this.a(this, $$3);
            }
         }
      }
   }

   private void c(List<box> $$0) {
      for (box $$1 : $$0) {
         if ($$1 instanceof bpp) {
            $$1.a(this.dN().b((bpp)this), 10.0F);
            this.a(this, $$1);
         }
      }
   }

   private float i(double $$0) {
      return (float)aww.d($$0);
   }

   private boolean b(epo $$0) {
      int $$1 = aww.a($$0.a);
      int $$2 = aww.a($$0.b);
      int $$3 = aww.a($$0.c);
      int $$4 = aww.a($$0.d);
      int $$5 = aww.a($$0.e);
      int $$6 = aww.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               ib $$12 = new ib($$9, $$10, $$11);
               dnb $$13 = this.dM().a_($$12);
               if (!$$13.i() && !$$13.a(aun.aD)) {
                  if (this.dM().Z().b(cwx.c) && !$$13.a(aun.aC)) {
                     $$8 = this.dM().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         ib $$14 = new ib($$1 + this.ag.a($$4 - $$1 + 1), $$2 + this.ag.a($$5 - $$2 + 1), $$3 + this.ag.a($$6 - $$3 + 1));
         this.dM().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(cdw $$0, bnw $$1, float $$2) {
      if (this.ct.a().i() == ceo.j) {
         return false;
      } else {
         $$2 = this.ct.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof ciu || $$1.a(aup.z)) {
               float $$3 = this.ex();
               this.g($$1, $$2);
               if (this.ey() && !this.ct.a().a()) {
                  this.t(1.0F);
                  this.ct.a(ceo.j);
               }

               if (this.ct.a().a()) {
                  this.cv = this.cv + $$3 - this.ex();
                  if (this.cv > 0.25F * this.eO()) {
                     this.cv = 0.0F;
                     this.ct.a(ceo.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      return !this.dM().B ? this.a(this.cl, $$0, $$1) : false;
   }

   protected boolean g(bnw $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void al() {
      this.a(box.c.a);
      this.b(drp.p);
      if (this.cr != null) {
         this.cr.b(this);
         this.cr.a(this);
      }
   }

   @Override
   protected void ed() {
      if (this.cr != null) {
         this.cr.b(this);
      }

      this.bZ++;
      if (this.bZ >= 180 && this.bZ <= 200) {
         float $$0 = (this.ag.i() - 0.5F) * 8.0F;
         float $$1 = (this.ag.i() - 0.5F) * 4.0F;
         float $$2 = (this.ag.i() - 0.5F) * 8.0F;
         this.dM().a(kc.w, this.dr() + (double)$$0, this.dt() + 2.0 + (double)$$1, this.dx() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dM().Z().b(cwx.f);
      int $$4 = 500;
      if (this.cr != null && !this.cr.f()) {
         $$4 = 12000;
      }

      if (this.dM() instanceof apf) {
         if (this.bZ > 150 && this.bZ % 5 == 0 && $$3) {
            bpf.a((apf)this.dM(), this.dk(), aww.d((float)$$4 * 0.08F));
         }

         if (this.bZ == 1 && !this.aU()) {
            this.dM().b(1028, this.dm(), 0);
         }
      }

      this.a(bpu.a, new ept(0.0, 0.1F, 0.0));
      if (this.bZ == 200 && this.dM() instanceof apf) {
         if ($$3) {
            bpf.a((apf)this.dM(), this.dk(), aww.d((float)$$4 * 0.2F));
         }

         if (this.cr != null) {
            this.cr.a(this);
         }

         this.a(box.c.a);
         this.b(drp.p);
      }
   }

   public int y() {
      if (this.cw[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = aww.d(60.0F * aww.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = aww.d(60.0F * aww.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = aww.d(40.0F * aww.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = aww.d(40.0F * aww.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = aww.d(20.0F * aww.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = aww.d(20.0F * aww.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.dM().z_() + 10, this.dM().a(dso.a.f, new ib($$3, 0, $$4)).v() + $$1);
            this.cw[$$0] = new ejb($$3, $$9, $$4);
         }

         this.cx[0] = 6146;
         this.cx[1] = 8197;
         this.cx[2] = 8202;
         this.cx[3] = 16404;
         this.cx[4] = 32808;
         this.cx[5] = 32848;
         this.cx[6] = 65696;
         this.cx[7] = 131392;
         this.cx[8] = 131712;
         this.cx[9] = 263424;
         this.cx[10] = 526848;
         this.cx[11] = 525313;
         this.cx[12] = 1581057;
         this.cx[13] = 3166214;
         this.cx[14] = 2138120;
         this.cx[15] = 6373424;
         this.cx[16] = 4358208;
         this.cx[17] = 12910976;
         this.cx[18] = 9044480;
         this.cx[19] = 9706496;
         this.cx[20] = 15216640;
         this.cx[21] = 13688832;
         this.cx[22] = 11763712;
         this.cx[23] = 8257536;
      }

      return this.r(this.dr(), this.dt(), this.dx());
   }

   public int r(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      ejb $$5 = new ejb(aww.a($$0), aww.a($$1), aww.a($$2));
      int $$6 = 0;
      if (this.cr == null || this.cr.e() == 0) {
         $$6 = 12;
      }

      for (int $$7 = $$6; $$7 < 24; $$7++) {
         if (this.cw[$$7] != null) {
            float $$8 = this.cw[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public ejd a(int $$0, int $$1, @Nullable ejb $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         ejb $$4 = this.cw[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      ejb $$5 = this.cw[$$0];
      ejb $$6 = this.cw[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cz.a();
      this.cz.a($$5);
      ejb $$7 = $$5;
      int $$8 = 0;
      if (this.cr == null || this.cr.e() == 0) {
         $$8 = 12;
      }

      while (!this.cz.e()) {
         ejb $$9 = this.cz.c();
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
            if (this.cw[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for (int $$12 = $$8; $$12 < 24; $$12++) {
            if ((this.cx[$$10] & 1 << $$12) > 0) {
               ejb $$13 = this.cw[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.cz.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.cz.a($$13);
                     }
                  }
               }
            }
         }
      }

      if ($$7 == $$5) {
         return null;
      } else {
         cc.debug("Failed to find path from {} to {}", $$0, $$1);
         if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
         }

         return this.a($$5, $$7);
      }
   }

   private ejd a(ejb $$0, ejb $$1) {
      List<ejb> $$2 = Lists.newArrayList();
      ejb $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new ejd($$2, new ib($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.ct.a().i().b());
      $$0.a("DragonDeathTime", this.bZ);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.ct.a(ceo.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bZ = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dy() {
   }

   public cdw[] gj() {
      return this.cj;
   }

   @Override
   public boolean bw() {
      return false;
   }

   @Override
   public atz db() {
      return atz.f;
   }

   @Override
   protected atx v() {
      return aty.hT;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.hY;
   }

   @Override
   protected float fb() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      cei $$3 = this.ct.a();
      ceo<? extends cei> $$4 = $$3.i();
      double $$7;
      if ($$4 == ceo.d || $$4 == ceo.e) {
         ib $$5 = this.dM().a(dso.a.f, dvr.a(this.cs));
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

   public ept F(float $$0) {
      cei $$1 = this.ct.a();
      ceo<? extends cei> $$2 = $$1.i();
      ept $$8;
      if ($$2 == ceo.d || $$2 == ceo.e) {
         ib $$3 = this.dM().a(dso.a.f, dvr.a(this.cs));
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

   public void a(cdx $$0, ib $$1, bnw $$2) {
      ciu $$3;
      if ($$2.d() instanceof ciu) {
         $$3 = (ciu)$$2.d();
      } else {
         $$3 = this.dM().a(cd, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.cb) {
         this.a(this.e, this.dN().d($$0, $$3), 10.0F);
      }

      this.ct.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aim<?> $$0) {
      if (b.equals($$0) && this.dM().B) {
         this.ct.a(ceo.a(this.an().a(b)));
      }

      super.a($$0);
   }

   public cep gk() {
      return this.ct;
   }

   @Nullable
   public dqr gl() {
      return this.cr;
   }

   @Override
   public boolean b(bok $$0, @Nullable box $$1) {
      return false;
   }

   @Override
   protected boolean o(box $$0) {
      return false;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public void a(aan $$0) {
      super.a($$0);
      cdw[] $$1 = this.gj();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b());
      }
   }

   @Override
   public boolean c(bpp $$0) {
      return $$0.eq();
   }
}
