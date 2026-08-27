import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfe extends bqv implements cgy {
   private static final Logger cc = LogUtils.getLogger();
   public static final aja<Integer> b = aje.a(cfe.class, ajc.b);
   private static final cbj cd = cbj.a().a(64.0);
   private static final int ce = 200;
   private static final int cf = 400;
   private static final float cg = 0.25F;
   private static final String ch = "DragonDeathTime";
   private static final String ci = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final cfc[] cj;
   public final cfc e;
   private final cfc ck;
   private final cfc cl;
   private final cfc cm;
   private final cfc cn;
   private final cfc co;
   private final cfc cp;
   private final cfc cq;
   public float bW;
   public float bX;
   public boolean bY;
   public int bZ;
   public float ca;
   @Nullable
   public cfd cb;
   @Nullable
   private dtd cr;
   private id cs = id.c;
   private final cfv ct;
   private int cu = 100;
   private float cv;
   private final eln[] cw = new eln[24];
   private final int[] cx = new int[24];
   private final ell cz = new ell();

   public cfe(bqg<? extends cfe> $$0, czg $$1) {
      super(bqg.F, $$1);
      this.e = new cfc(this, "head", 1.0F, 1.0F);
      this.ck = new cfc(this, "neck", 3.0F, 3.0F);
      this.cl = new cfc(this, "body", 5.0F, 3.0F);
      this.cm = new cfc(this, "tail", 2.0F, 2.0F);
      this.cn = new cfc(this, "tail", 2.0F, 2.0F);
      this.co = new cfc(this, "tail", 2.0F, 2.0F);
      this.cp = new cfc(this, "wing", 4.0F, 2.0F);
      this.cq = new cfc(this, "wing", 4.0F, 2.0F);
      this.cj = new cfc[]{this.e, this.ck, this.cl, this.cm, this.cn, this.co, this.cp, this.cq};
      this.t(this.eO());
      this.af = true;
      this.at = true;
      this.ct = new cfv(this);
   }

   public void a(dtd $$0) {
      this.cr = $$0;
   }

   @Override
   public void h(id $$0) {
      this.cs = $$0;
   }

   public id r() {
      return this.cs;
   }

   public static brz.a u() {
      return bqv.A().a(bsa.q, 200.0);
   }

   @Override
   public boolean aT() {
      float $$0 = axm.b(this.bX * (float) (Math.PI * 2));
      float $$1 = axm.b(this.bW * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aS() {
      if (this.dM().B && !this.aU()) {
         this.dM().a(this.dr(), this.dt(), this.dx(), auo.hY, this.db(), 5.0F, 0.8F + this.ag.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(b, cfu.k.b());
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
      double $$6 = axm.d(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = axm.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void n_() {
      this.aG();
      if (this.dM().B) {
         this.t(this.ex());
         if (!this.aU() && !this.ct.a().a() && --this.cu < 0) {
            this.dM().a(this.dr(), this.dt(), this.dx(), auo.hZ, this.db(), 2.5F, 0.8F + this.ag.i() * 0.3F, false);
            this.cu = 200 + this.ag.a(200);
         }
      }

      if (this.cr == null && this.dM() instanceof apu $$0) {
         dtd $$1 = $$0.D();
         if ($$1 != null && this.cw().equals($$1.i())) {
            this.cr = $$1;
         }
      }

      this.bW = this.bX;
      if (this.ey()) {
         float $$2 = (this.ag.i() - 0.5F) * 8.0F;
         float $$3 = (this.ag.i() - 0.5F) * 4.0F;
         float $$4 = (this.ag.i() - 0.5F) * 8.0F;
         this.dM().a(kn.x, this.dr() + (double)$$2, this.dt() + 2.0 + (double)$$3, this.dx() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gn();
         esj $$5 = this.dp();
         float $$6 = 0.2F / ((float)$$5.h() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.d);
         if (this.ct.a().a()) {
            this.bX += 0.1F;
         } else if (this.bY) {
            this.bX += $$6 * 0.5F;
         } else {
            this.bX += $$6;
         }

         this.r(axm.g(this.dC()));
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
               cfo $$8 = this.ct.a();
               $$8.c();
               if (this.ct.a() != $$8) {
                  $$8 = this.ct.a();
                  $$8.c();
               }

               esj $$9 = $$8.g();
               if ($$9 != null) {
                  double $$10 = $$9.c - this.dr();
                  double $$11 = $$9.d - this.dt();
                  double $$12 = $$9.e - this.dx();
                  double $$13 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                  float $$14 = $$8.f();
                  double $$15 = Math.sqrt($$10 * $$10 + $$12 * $$12);
                  if ($$15 > 0.0) {
                     $$11 = axm.a($$11 / $$15, (double)(-$$14), (double)$$14);
                  }

                  this.g(this.dp().b(0.0, $$11 * 0.01, 0.0));
                  this.r(axm.g(this.dC()));
                  esj $$16 = $$9.a(this.dr(), this.dt(), this.dx()).d();
                  esj $$17 = new esj((double)axm.a(this.dC() * (float) (Math.PI / 180.0)), this.dp().d, (double)(-axm.b(this.dC() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$18 = Math.max(((float)$$17.b($$16) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$10) > 1.0E-5F || Math.abs($$12) > 1.0E-5F) {
                     float $$19 = axm.a(axm.g(180.0F - (float)axm.d($$10, $$12) * (180.0F / (float)Math.PI) - this.dC()), -50.0F, 50.0F);
                     this.ca *= 0.8F;
                     this.ca = this.ca + $$19 * $$8.h();
                     this.r(this.dC() + this.ca * 0.1F);
                  }

                  float $$20 = (float)(2.0 / ($$13 + 1.0));
                  float $$21 = 0.06F;
                  this.a(0.06F * ($$18 * $$20 + (1.0F - $$20)), new esj(0.0, 0.0, -1.0));
                  if (this.bY) {
                     this.a(bqy.a, this.dp().a(0.8F));
                  } else {
                     this.a(bqy.a, this.dp());
                  }

                  esj $$22 = this.dp().d();
                  double $$23 = 0.8 + 0.15 * ($$22.b($$17) + 1.0) / 2.0;
                  this.g(this.dp().d($$23, 0.91F, $$23));
               }
            }

            this.aX = this.dC();
            esj[] $$24 = new esj[this.cj.length];

            for (int $$25 = 0; $$25 < this.cj.length; $$25++) {
               $$24[$$25] = new esj(this.cj[$$25].dr(), this.cj[$$25].dt(), this.cj[$$25].dx());
            }

            float $$26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$27 = axm.b($$26);
            float $$28 = axm.a($$26);
            float $$29 = this.dC() * (float) (Math.PI / 180.0);
            float $$30 = axm.a($$29);
            float $$31 = axm.b($$29);
            this.a(this.cl, (double)($$30 * 0.5F), 0.0, (double)(-$$31 * 0.5F));
            this.a(this.cp, (double)($$31 * 4.5F), 2.0, (double)($$30 * 4.5F));
            this.a(this.cq, (double)($$31 * -4.5F), 2.0, (double)($$30 * -4.5F));
            if (!this.dM().B && this.aN == 0) {
               this.b(this.dM().a(this, this.cp.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bqf.e));
               this.b(this.dM().a(this, this.cq.cH().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bqf.e));
               this.c(this.dM().a(this, this.e.cH().g(1.0), bqf.e));
               this.c(this.dM().a(this, this.ck.cH().g(1.0), bqf.e));
            }

            float $$32 = axm.a(this.dC() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$33 = axm.b(this.dC() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$34 = this.gm();
            this.a(this.e, (double)($$32 * 6.5F * $$27), (double)($$34 + $$28 * 6.5F), (double)(-$$33 * 6.5F * $$27));
            this.a(this.ck, (double)($$32 * 5.5F * $$27), (double)($$34 + $$28 * 5.5F), (double)(-$$33 * 5.5F * $$27));
            double[] $$35 = this.a(5, 1.0F);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               cfc $$37 = null;
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
               float $$40 = axm.a($$39);
               float $$41 = axm.b($$39);
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

   private void a(cfc $$0, double $$1, double $$2, double $$3) {
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
         List<cfd> $$0 = this.dM().a(cfd.class, this.cH().g(32.0));
         cfd $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cfd $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.cb = $$1;
      }
   }

   private void b(List<bqa> $$0) {
      double $$1 = (this.cl.cH().a + this.cl.cH().d) / 2.0;
      double $$2 = (this.cl.cH().c + this.cl.cH().f) / 2.0;

      for (bqa $$3 : $$0) {
         if ($$3 instanceof bqt) {
            double $$4 = $$3.dr() - $$1;
            double $$5 = $$3.dx() - $$2;
            double $$6 = Math.max($$4 * $$4 + $$5 * $$5, 0.1);
            $$3.j($$4 / $$6 * 4.0, 0.2F, $$5 / $$6 * 4.0);
            if (!this.ct.a().a() && ((bqt)$$3).ek() < $$3.ah - 2) {
               $$3.a(this.dN().b((bqt)this), 5.0F);
               this.a(this, $$3);
            }
         }
      }
   }

   private void c(List<bqa> $$0) {
      for (bqa $$1 : $$0) {
         if ($$1 instanceof bqt) {
            $$1.a(this.dN().b((bqt)this), 10.0F);
            this.a(this, $$1);
         }
      }
   }

   private float i(double $$0) {
      return (float)axm.d($$0);
   }

   private boolean b(ese $$0) {
      int $$1 = axm.a($$0.a);
      int $$2 = axm.a($$0.b);
      int $$3 = axm.a($$0.c);
      int $$4 = axm.a($$0.d);
      int $$5 = axm.a($$0.e);
      int $$6 = axm.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               id $$12 = new id($$9, $$10, $$11);
               dpi $$13 = this.dM().a_($$12);
               if (!$$13.i() && !$$13.a(ave.aD)) {
                  if (this.dM().aa().b(czc.c) && !$$13.a(ave.aC)) {
                     $$8 = this.dM().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         id $$14 = new id($$1 + this.ag.a($$4 - $$1 + 1), $$2 + this.ag.a($$5 - $$2 + 1), $$3 + this.ag.a($$6 - $$3 + 1));
         this.dM().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(cfc $$0, boy $$1, float $$2) {
      if (this.ct.a().i() == cfu.j) {
         return false;
      } else {
         $$2 = this.ct.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cka || $$1.a(avg.z)) {
               float $$3 = this.ex();
               this.g($$1, $$2);
               if (this.ey() && !this.ct.a().a()) {
                  this.t(1.0F);
                  this.ct.a(cfu.j);
               }

               if (this.ct.a().a()) {
                  this.cv = this.cv + $$3 - this.ex();
                  if (this.cv > 0.25F * this.eO()) {
                     this.cv = 0.0F;
                     this.ct.a(cfu.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      return !this.dM().B ? this.a(this.cl, $$0, $$1) : false;
   }

   protected boolean g(boy $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void al() {
      this.a(bqa.c.a);
      this.a(dub.p);
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
         this.dM().a(kn.w, this.dr() + (double)$$0, this.dt() + 2.0 + (double)$$1, this.dx() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dM().aa().b(czc.f);
      int $$4 = 500;
      if (this.cr != null && !this.cr.f()) {
         $$4 = 12000;
      }

      if (this.dM() instanceof apu) {
         if (this.bZ > 150 && this.bZ % 5 == 0 && $$3) {
            bqj.a((apu)this.dM(), this.dk(), axm.d((float)$$4 * 0.08F));
         }

         if (this.bZ == 1 && !this.aU()) {
            this.dM().b(1028, this.dm(), 0);
         }
      }

      this.a(bqy.a, new esj(0.0, 0.1F, 0.0));
      if (this.bZ == 200 && this.dM() instanceof apu) {
         if ($$3) {
            bqj.a((apu)this.dM(), this.dk(), axm.d((float)$$4 * 0.2F));
         }

         if (this.cr != null) {
            this.cr.a(this);
         }

         this.a(bqa.c.a);
         this.a(dub.p);
      }
   }

   public int y() {
      if (this.cw[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = axm.d(60.0F * axm.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = axm.d(60.0F * axm.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = axm.d(40.0F * axm.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = axm.d(40.0F * axm.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = axm.d(20.0F * axm.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = axm.d(20.0F * axm.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.dM().z_() + 10, this.dM().a(dva.a.f, new id($$3, 0, $$4)).v() + $$1);
            this.cw[$$0] = new eln($$3, $$9, $$4);
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
      eln $$5 = new eln(axm.a($$0), axm.a($$1), axm.a($$2));
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
   public elp a(int $$0, int $$1, @Nullable eln $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         eln $$4 = this.cw[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      eln $$5 = this.cw[$$0];
      eln $$6 = this.cw[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cz.a();
      this.cz.a($$5);
      eln $$7 = $$5;
      int $$8 = 0;
      if (this.cr == null || this.cr.e() == 0) {
         $$8 = 12;
      }

      while (!this.cz.e()) {
         eln $$9 = this.cz.c();
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
               eln $$13 = this.cw[$$12];
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

   private elp a(eln $$0, eln $$1) {
      List<eln> $$2 = Lists.newArrayList();
      eln $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new elp($$2, new id($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.ct.a().i().b());
      $$0.a("DragonDeathTime", this.bZ);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.ct.a(cfu.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bZ = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dy() {
   }

   public cfc[] gj() {
      return this.cj;
   }

   @Override
   public boolean bw() {
      return false;
   }

   @Override
   public aup db() {
      return aup.f;
   }

   @Override
   protected aun v() {
      return auo.hV;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.ia;
   }

   @Override
   protected float fb() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      cfo $$3 = this.ct.a();
      cfu<? extends cfo> $$4 = $$3.i();
      double $$7;
      if ($$4 == cfu.d || $$4 == cfu.e) {
         id $$5 = this.dM().a(dva.a.f, dyd.a(this.cs));
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

   public esj F(float $$0) {
      cfo $$1 = this.ct.a();
      cfu<? extends cfo> $$2 = $$1.i();
      esj $$8;
      if ($$2 == cfu.d || $$2 == cfu.e) {
         id $$3 = this.dM().a(dva.a.f, dyd.a(this.cs));
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

   public void a(cfd $$0, id $$1, boy $$2) {
      cka $$3;
      if ($$2.d() instanceof cka) {
         $$3 = (cka)$$2.d();
      } else {
         $$3 = this.dM().a(cd, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.cb) {
         this.a(this.e, this.dN().d($$0, $$3), 10.0F);
      }

      this.ct.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aja<?> $$0) {
      if (b.equals($$0) && this.dM().B) {
         this.ct.a(cfu.a(this.an().a(b)));
      }

      super.a($$0);
   }

   public cfv gk() {
      return this.ct;
   }

   @Nullable
   public dtd gl() {
      return this.cr;
   }

   @Override
   public boolean b(bpm $$0, @Nullable bqa $$1) {
      return false;
   }

   @Override
   protected boolean o(bqa $$0) {
      return false;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public void a(abb $$0) {
      super.a($$0);
      cfc[] $$1 = this.gj();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b());
      }
   }

   @Override
   public boolean c(bqt $$0) {
      return $$0.eq();
   }
}
