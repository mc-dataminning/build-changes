import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjj extends bux implements cle {
   private static final Logger cc = LogUtils.getLogger();
   public static final akk<Integer> b = ako.a(cjj.class, akm.b);
   private static final cfm cd = cfm.a().a(64.0);
   private static final int ce = 200;
   private static final int cf = 400;
   private static final float cg = 0.25F;
   private static final String ch = "DragonDeathTime";
   private static final String ci = "DragonPhase";
   public final cjh c = new cjh();
   private final cjg[] cj;
   public final cjg d;
   private final cjg ck;
   private final cjg cl;
   private final cjg cm;
   private final cjg cn;
   private final cjg co;
   private final cjg cp;
   private final cjg cq;
   public float e;
   public float bX;
   public boolean bY;
   public int bZ;
   public float ca;
   @Nullable
   public cji cb;
   @Nullable
   private dzc cr;
   private jg cs = jg.c;
   private final cka ct;
   private int cu = 100;
   private float cv;
   private final erq[] cw = new erq[24];
   private final int[] cx = new int[24];
   private final ero cy = new ero();

   public cjj(bug<? extends cjj> $$0, dev $$1) {
      super(bug.F, $$1);
      this.d = new cjg(this, "head", 1.0F, 1.0F);
      this.ck = new cjg(this, "neck", 3.0F, 3.0F);
      this.cl = new cjg(this, "body", 5.0F, 3.0F);
      this.cm = new cjg(this, "tail", 2.0F, 2.0F);
      this.cn = new cjg(this, "tail", 2.0F, 2.0F);
      this.co = new cjg(this, "tail", 2.0F, 2.0F);
      this.cp = new cjg(this, "wing", 4.0F, 2.0F);
      this.cq = new cjg(this, "wing", 4.0F, 2.0F);
      this.cj = new cjg[]{this.d, this.ck, this.cl, this.cm, this.cn, this.co, this.cp, this.cq};
      this.x(this.eV());
      this.ae = true;
      this.ct = new cka(this);
   }

   public void a(dzc $$0) {
      this.cr = $$0;
   }

   @Override
   public void c(jg $$0) {
      this.cs = $$0;
   }

   public jg q() {
      return this.cs;
   }

   public static bwc.a t() {
      return bux.E().a(bwd.s, 200.0);
   }

   @Override
   public boolean bb() {
      float $$0 = azj.b(this.bX * (float) (Math.PI * 2));
      float $$1 = azj.b(this.e * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void ba() {
      if (this.dX().C && !this.bc()) {
         this.dX().a(this.dC(), this.dE(), this.dI(), awk.ie, this.dn(), 5.0F, 0.8F + this.af.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, cjz.k.b());
   }

   @Override
   public void n_() {
      this.aO();
      if (this.dX().C) {
         this.x(this.eG());
         if (!this.bc() && !this.ct.a().a() && --this.cu < 0) {
            this.dX().a(this.dC(), this.dE(), this.dI(), awk.if, this.dn(), 2.5F, 0.8F + this.af.i() * 0.3F, false);
            this.cu = 200 + this.af.a(200);
         }
      }

      if (this.cr == null && this.dX() instanceof arm $$0) {
         dzc $$1 = $$0.D();
         if ($$1 != null && this.cH().equals($$1.i())) {
            this.cr = $$1;
         }
      }

      this.e = this.bX;
      if (this.eH()) {
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         float $$3 = (this.af.i() - 0.5F) * 4.0F;
         float $$4 = (this.af.i() - 0.5F) * 8.0F;
         this.dX().a(lq.w, this.dC() + (double)$$2, this.dE() + 2.0 + (double)$$3, this.dI() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gv();
         ezh $$5 = this.dA();
         float $$6 = 0.2F / ((float)$$5.i() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.e);
         if (this.ct.a().a()) {
            this.bX += 0.1F;
         } else if (this.bY) {
            this.bX += $$6 * 0.5F;
         } else {
            this.bX += $$6;
         }

         this.v(azj.h(this.dN()));
         if (this.gi()) {
            this.bX = 0.5F;
         } else {
            this.c.a(this.dE(), this.dN());
            if (this.dX().C) {
               if (this.bo > 0) {
                  this.a(this.bo, this.bp, this.bq, this.br, this.bs, this.bt);
                  this.bo--;
               }

               this.ct.a().b();
            } else {
               cjt $$7 = this.ct.a();
               $$7.c();
               if (this.ct.a() != $$7) {
                  $$7 = this.ct.a();
                  $$7.c();
               }

               ezh $$8 = $$7.g();
               if ($$8 != null) {
                  double $$9 = $$8.d - this.dC();
                  double $$10 = $$8.e - this.dE();
                  double $$11 = $$8.f - this.dI();
                  double $$12 = $$9 * $$9 + $$10 * $$10 + $$11 * $$11;
                  float $$13 = $$7.f();
                  double $$14 = Math.sqrt($$9 * $$9 + $$11 * $$11);
                  if ($$14 > 0.0) {
                     $$10 = azj.a($$10 / $$14, (double)(-$$13), (double)$$13);
                  }

                  this.h(this.dA().b(0.0, $$10 * 0.01, 0.0));
                  this.v(azj.h(this.dN()));
                  ezh $$15 = $$8.a(this.dC(), this.dE(), this.dI()).d();
                  ezh $$16 = new ezh((double)azj.a(this.dN() * (float) (Math.PI / 180.0)), this.dA().e, (double)(-azj.b(this.dN() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$17 = Math.max(((float)$$16.b($$15) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$9) > 1.0E-5F || Math.abs($$11) > 1.0E-5F) {
                     float $$18 = azj.a(azj.h(180.0F - (float)azj.d($$9, $$11) * (180.0F / (float)Math.PI) - this.dN()), -50.0F, 50.0F);
                     this.ca *= 0.8F;
                     this.ca = this.ca + $$18 * $$7.h();
                     this.v(this.dN() + this.ca * 0.1F);
                  }

                  float $$19 = (float)(2.0 / ($$12 + 1.0));
                  float $$20 = 0.06F;
                  this.a(0.06F * ($$17 * $$19 + (1.0F - $$19)), new ezh(0.0, 0.0, -1.0));
                  if (this.bY) {
                     this.a(buz.a, this.dA().c(0.8F));
                  } else {
                     this.a(buz.a, this.dA());
                  }

                  ezh $$21 = this.dA().d();
                  double $$22 = 0.8 + 0.15 * ($$21.b($$16) + 1.0) / 2.0;
                  this.h(this.dA().d($$22, 0.91F, $$22));
               }
            }

            if (!this.dX().y_()) {
               this.aK();
            }

            this.aU = this.dN();
            ezh[] $$23 = new ezh[this.cj.length];

            for (int $$24 = 0; $$24 < this.cj.length; $$24++) {
               $$23[$$24] = new ezh(this.cj[$$24].dC(), this.cj[$$24].dE(), this.cj[$$24].dI());
            }

            float $$25 = (float)(this.c.a(5).a() - this.c.a(10).a()) * 10.0F * (float) (Math.PI / 180.0);
            float $$26 = azj.b($$25);
            float $$27 = azj.a($$25);
            float $$28 = this.dN() * (float) (Math.PI / 180.0);
            float $$29 = azj.a($$28);
            float $$30 = azj.b($$28);
            this.a(this.cl, (double)($$29 * 0.5F), 0.0, (double)(-$$30 * 0.5F));
            this.a(this.cp, (double)($$30 * 4.5F), 2.0, (double)($$29 * 4.5F));
            this.a(this.cq, (double)($$30 * -4.5F), 2.0, (double)($$29 * -4.5F));
            if (this.dX() instanceof arm $$31 && this.aK == 0) {
               this.a($$31, $$31.a(this, this.cp.cS().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bue.e));
               this.a($$31, $$31.a(this, this.cq.cS().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bue.e));
               this.b($$31.a(this, this.d.cS().g(1.0), bue.e));
               this.b($$31.a(this, this.ck.cS().g(1.0), bue.e));
            }

            float $$32 = azj.a(this.dN() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$33 = azj.b(this.dN() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$34 = this.gu();
            this.a(this.d, (double)($$32 * 6.5F * $$26), (double)($$34 + $$27 * 6.5F), (double)(-$$33 * 6.5F * $$26));
            this.a(this.ck, (double)($$32 * 5.5F * $$26), (double)($$34 + $$27 * 5.5F), (double)(-$$33 * 5.5F * $$26));
            cjh.a $$35 = this.c.a(5);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               cjg $$37 = null;
               if ($$36 == 0) {
                  $$37 = this.cm;
               }

               if ($$36 == 1) {
                  $$37 = this.cn;
               }

               if ($$36 == 2) {
                  $$37 = this.co;
               }

               cjh.a $$38 = this.c.a(12 + $$36 * 2);
               float $$39 = this.dN() * (float) (Math.PI / 180.0) + this.i((double)($$38.b() - $$35.b())) * (float) (Math.PI / 180.0);
               float $$40 = azj.a($$39);
               float $$41 = azj.b($$39);
               float $$42 = 1.5F;
               float $$43 = (float)($$36 + 1) * 2.0F;
               this.a(
                  $$37,
                  (double)(-($$29 * 1.5F + $$40 * $$43) * $$26),
                  $$38.a() - $$35.a() - (double)(($$43 + 1.5F) * $$27) + 1.5,
                  (double)(($$30 * 1.5F + $$41 * $$43) * $$26)
               );
            }

            if (!this.dX().C) {
               this.bY = this.b(this.d.cS()) | this.b(this.ck.cS()) | this.b(this.cl.cS());
               if (this.cr != null) {
                  this.cr.b(this);
               }
            }

            for (int $$44 = 0; $$44 < this.cj.length; $$44++) {
               this.cj[$$44].L = $$23[$$44].d;
               this.cj[$$44].M = $$23[$$44].e;
               this.cj[$$44].N = $$23[$$44].f;
               this.cj[$$44].ab = $$23[$$44].d;
               this.cj[$$44].ac = $$23[$$44].e;
               this.cj[$$44].ad = $$23[$$44].f;
            }
         }
      }
   }

   private void a(cjg $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dC() + $$1, this.dE() + $$2, this.dI() + $$3);
   }

   private float gu() {
      if (this.ct.a().a()) {
         return -1.0F;
      } else {
         cjh.a $$0 = this.c.a(5);
         cjh.a $$1 = this.c.a(0);
         return (float)($$0.a() - $$1.a());
      }
   }

   private void gv() {
      if (this.cb != null) {
         if (this.cb.dS()) {
            this.cb = null;
         } else if (this.ag % 10 == 0 && this.eG() < this.eV()) {
            this.x(this.eG() + 1.0F);
         }
      }

      if (this.af.a(10) == 0) {
         List<cji> $$0 = this.dX().a(cji.class, this.cS().g(32.0));
         cji $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cji $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.cb = $$1;
      }
   }

   private void a(arm $$0, List<btz> $$1) {
      double $$2 = (this.cl.cS().a + this.cl.cS().d) / 2.0;
      double $$3 = (this.cl.cS().c + this.cl.cS().f) / 2.0;

      for (btz $$4 : $$1) {
         if ($$4 instanceof buv) {
            buv $$5 = (buv)$$4;
            double $$6 = $$4.dC() - $$2;
            double $$7 = $$4.dI() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.j($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.ct.a().a() && $$5.et() < $$4.ag - 2) {
               bsp $$9 = this.dY().b((buv)this);
               $$4.a($$9, 5.0F);
               dbo.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(List<btz> $$0) {
      for (btz $$1 : $$0) {
         if ($$1 instanceof buv) {
            bsp $$2 = this.dY().b((buv)this);
            $$1.a($$2, 10.0F);
            if (this.dX() instanceof arm $$3) {
               dbo.a($$3, $$1, $$2);
            }
         }
      }
   }

   private float i(double $$0) {
      return (float)azj.d($$0);
   }

   private boolean b(ezc $$0) {
      int $$1 = azj.a($$0.a);
      int $$2 = azj.a($$0.b);
      int $$3 = azj.a($$0.c);
      int $$4 = azj.a($$0.d);
      int $$5 = azj.a($$0.e);
      int $$6 = azj.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               jg $$12 = new jg($$9, $$10, $$11);
               dvd $$13 = this.dX().a_($$12);
               if (!$$13.l() && !$$13.a(awz.aE)) {
                  if (this.dX().ac().b(der.c) && !$$13.a(awz.aD)) {
                     $$8 = this.dX().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         jg $$14 = new jg($$1 + this.af.a($$4 - $$1 + 1), $$2 + this.af.a($$5 - $$2 + 1), $$3 + this.af.a($$6 - $$3 + 1));
         this.dX().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(cjg $$0, bsp $$1, float $$2) {
      if (this.ct.a().i() == cjz.j) {
         return false;
      } else {
         $$2 = this.ct.a().a($$1, $$2);
         if ($$0 != this.d) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof coh || $$1.a(axb.y)) {
               float $$3 = this.eG();
               this.g($$1, $$2);
               if (this.eH() && !this.ct.a().a()) {
                  this.x(1.0F);
                  this.ct.a(cjz.j);
               }

               if (this.ct.a().a()) {
                  this.cv = this.cv + $$3 - this.eG();
                  if (this.cv > 0.25F * this.eV()) {
                     this.cv = 0.0F;
                     this.ct.a(cjz.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      return !this.dX().C ? this.a(this.cl, $$0, $$1) : false;
   }

   protected boolean g(bsp $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void at() {
      this.a(btz.c.a);
      this.a(eaa.p);
      if (this.cr != null) {
         this.cr.b(this);
         this.cr.a(this);
      }
   }

   @Override
   protected void en() {
      if (this.cr != null) {
         this.cr.b(this);
      }

      this.bZ++;
      if (this.bZ >= 180 && this.bZ <= 200) {
         float $$0 = (this.af.i() - 0.5F) * 8.0F;
         float $$1 = (this.af.i() - 0.5F) * 4.0F;
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         this.dX().a(lq.v, this.dC() + (double)$$0, this.dE() + 2.0 + (double)$$1, this.dI() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dX().ac().b(der.f);
      int $$4 = 500;
      if (this.cr != null && !this.cr.f()) {
         $$4 = 12000;
      }

      if (this.dX() instanceof arm) {
         if (this.bZ > 150 && this.bZ % 5 == 0 && $$3) {
            bul.a((arm)this.dX(), this.dv(), azj.d((float)$$4 * 0.08F));
         }

         if (this.bZ == 1 && !this.bc()) {
            this.dX().b(1028, this.dx(), 0);
         }
      }

      this.a(buz.a, new ezh(0.0, 0.1F, 0.0));
      if (this.bZ == 200 && this.dX() instanceof arm) {
         if ($$3) {
            bul.a((arm)this.dX(), this.dv(), azj.d((float)$$4 * 0.2F));
         }

         if (this.cr != null) {
            this.cr.a(this);
         }

         this.a(btz.c.a);
         this.a(eaa.p);
      }
   }

   public int y() {
      if (this.cw[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = azj.d(60.0F * azj.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = azj.d(60.0F * azj.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = azj.d(40.0F * azj.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = azj.d(40.0F * azj.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = azj.d(20.0F * azj.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = azj.d(20.0F * azj.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(73, this.dX().a(eaz.a.f, new jg($$3, 0, $$4)).v() + $$1);
            this.cw[$$0] = new erq($$3, $$9, $$4);
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

      return this.q(this.dC(), this.dE(), this.dI());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      erq $$5 = new erq(azj.a($$0), azj.a($$1), azj.a($$2));
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
   public ers a(int $$0, int $$1, @Nullable erq $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         erq $$4 = this.cw[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      erq $$5 = this.cw[$$0];
      erq $$6 = this.cw[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cy.a();
      this.cy.a($$5);
      erq $$7 = $$5;
      int $$8 = 0;
      if (this.cr == null || this.cr.e() == 0) {
         $$8 = 12;
      }

      while (!this.cy.e()) {
         erq $$9 = this.cy.c();
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
               erq $$13 = this.cw[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.cy.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.cy.a($$13);
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

   private ers a(erq $$0, erq $$1) {
      List<erq> $$2 = Lists.newArrayList();
      erq $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new ers($$2, new jg($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.ct.a().i().b());
      $$0.a("DragonDeathTime", this.bZ);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.ct.a(cjz.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bZ = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dJ() {
   }

   public cjg[] gr() {
      return this.cj;
   }

   @Override
   public boolean bI() {
      return false;
   }

   @Override
   public awl dn() {
      return awl.f;
   }

   @Override
   protected awj w() {
      return awk.ib;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.ig;
   }

   @Override
   protected float fi() {
      return 5.0F;
   }

   public ezh J(float $$0) {
      cjt $$1 = this.ct.a();
      cjz<? extends cjt> $$2 = $$1.i();
      ezh $$8;
      if ($$2 == cjz.d || $$2 == cjz.e) {
         jg $$3 = this.dX().a(eaz.a.f, eee.a(this.cs));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.dv())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dP();
         float $$7 = 1.5F;
         this.w(-$$5 * 1.5F * 5.0F);
         $$8 = this.g($$0);
         this.w($$6);
      } else if ($$1.a()) {
         float $$9 = this.dP();
         float $$10 = 1.5F;
         this.w(-45.0F);
         $$8 = this.g($$0);
         this.w($$9);
      } else {
         $$8 = this.g($$0);
      }

      return $$8;
   }

   public void a(cji $$0, jg $$1, bsp $$2) {
      coh $$3;
      if ($$2.d() instanceof coh) {
         $$3 = (coh)$$2.d();
      } else {
         $$3 = this.dX().a(cd, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.cb) {
         this.a(this.d, this.dY().d($$0, $$3), 10.0F);
      }

      this.ct.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(akk<?> $$0) {
      if (b.equals($$0) && this.dX().C) {
         this.ct.a(cjz.a(this.av().a(b)));
      }

      super.a($$0);
   }

   public cka gs() {
      return this.ct;
   }

   @Nullable
   public dzc gt() {
      return this.cr;
   }

   @Override
   public boolean b(bte $$0, @Nullable btz $$1) {
      return false;
   }

   @Override
   protected boolean o(btz $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public void a(ace $$0) {
      super.a($$0);
      cjg[] $$1 = this.gr();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b());
      }
   }

   @Override
   public boolean c(buv $$0) {
      return $$0.ez();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
