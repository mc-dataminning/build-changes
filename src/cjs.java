import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjs extends bvg implements cln {
   private static final Logger cc = LogUtils.getLogger();
   public static final ako<Integer> b = aks.a(cjs.class, akq.b);
   private static final cfv cd = cfv.a().a(64.0);
   private static final int ce = 200;
   private static final int cf = 400;
   private static final float cg = 0.25F;
   private static final String ch = "DragonDeathTime";
   private static final String ci = "DragonPhase";
   public final cjq c = new cjq();
   private final cjp[] cj;
   public final cjp d;
   private final cjp ck;
   private final cjp cl;
   private final cjp cm;
   private final cjp cn;
   private final cjp co;
   private final cjp cp;
   private final cjp cq;
   public float e;
   public float bX;
   public boolean bY;
   public int bZ;
   public float ca;
   @Nullable
   public cjr cb;
   @Nullable
   private dzm cr;
   private jh cs = jh.c;
   private final ckj ct;
   private int cu = 100;
   private float cv;
   private final esa[] cw = new esa[24];
   private final int[] cx = new int[24];
   private final ery cy = new ery();

   public cjs(bup<? extends cjs> $$0, dff $$1) {
      super(bup.F, $$1);
      this.d = new cjp(this, "head", 1.0F, 1.0F);
      this.ck = new cjp(this, "neck", 3.0F, 3.0F);
      this.cl = new cjp(this, "body", 5.0F, 3.0F);
      this.cm = new cjp(this, "tail", 2.0F, 2.0F);
      this.cn = new cjp(this, "tail", 2.0F, 2.0F);
      this.co = new cjp(this, "tail", 2.0F, 2.0F);
      this.cp = new cjp(this, "wing", 4.0F, 2.0F);
      this.cq = new cjp(this, "wing", 4.0F, 2.0F);
      this.cj = new cjp[]{this.d, this.ck, this.cl, this.cm, this.cn, this.co, this.cp, this.cq};
      this.x(this.eW());
      this.ae = true;
      this.ct = new ckj(this);
   }

   public void a(dzm $$0) {
      this.cr = $$0;
   }

   @Override
   public void c(jh $$0) {
      this.cs = $$0;
   }

   public jh q() {
      return this.cs;
   }

   public static bwl.a t() {
      return bvg.E().a(bwm.s, 200.0);
   }

   @Override
   public boolean bc() {
      float $$0 = azn.b(this.bX * (float) (Math.PI * 2));
      float $$1 = azn.b(this.e * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void bb() {
      if (this.dY().C && !this.bd()) {
         this.dY().a(this.dD(), this.dF(), this.dJ(), awo.ie, this.do(), 5.0F, 0.8F + this.af.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(b, cki.k.b());
   }

   @Override
   public void n_() {
      this.aQ();
      if (this.dY().C) {
         this.x(this.eH());
         if (!this.bd() && !this.ct.a().a() && --this.cu < 0) {
            this.dY().a(this.dD(), this.dF(), this.dJ(), awo.if, this.do(), 2.5F, 0.8F + this.af.i() * 0.3F, false);
            this.cu = 200 + this.af.a(200);
         }
      }

      if (this.cr == null && this.dY() instanceof arq $$0) {
         dzm $$1 = $$0.D();
         if ($$1 != null && this.cI().equals($$1.i())) {
            this.cr = $$1;
         }
      }

      this.e = this.bX;
      if (this.eI()) {
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         float $$3 = (this.af.i() - 0.5F) * 4.0F;
         float $$4 = (this.af.i() - 0.5F) * 8.0F;
         this.dY().a(ls.w, this.dD() + (double)$$2, this.dF() + 2.0 + (double)$$3, this.dJ() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gv();
         ezr $$5 = this.dB();
         float $$6 = 0.2F / ((float)$$5.i() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.e);
         if (this.ct.a().a()) {
            this.bX += 0.1F;
         } else if (this.bY) {
            this.bX += $$6 * 0.5F;
         } else {
            this.bX += $$6;
         }

         this.v(azn.h(this.dO()));
         if (this.gi()) {
            this.bX = 0.5F;
         } else {
            this.c.a(this.dF(), this.dO());
            if (this.dY().C) {
               if (this.br > 0) {
                  this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
                  this.br--;
               }

               this.ct.a().b();
            } else {
               ckc $$7 = this.ct.a();
               $$7.c();
               if (this.ct.a() != $$7) {
                  $$7 = this.ct.a();
                  $$7.c();
               }

               ezr $$8 = $$7.g();
               if ($$8 != null) {
                  double $$9 = $$8.d - this.dD();
                  double $$10 = $$8.e - this.dF();
                  double $$11 = $$8.f - this.dJ();
                  double $$12 = $$9 * $$9 + $$10 * $$10 + $$11 * $$11;
                  float $$13 = $$7.f();
                  double $$14 = Math.sqrt($$9 * $$9 + $$11 * $$11);
                  if ($$14 > 0.0) {
                     $$10 = azn.a($$10 / $$14, (double)(-$$13), (double)$$13);
                  }

                  this.h(this.dB().b(0.0, $$10 * 0.01, 0.0));
                  this.v(azn.h(this.dO()));
                  ezr $$15 = $$8.a(this.dD(), this.dF(), this.dJ()).d();
                  ezr $$16 = new ezr((double)azn.a(this.dO() * (float) (Math.PI / 180.0)), this.dB().e, (double)(-azn.b(this.dO() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$17 = Math.max(((float)$$16.b($$15) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$9) > 1.0E-5F || Math.abs($$11) > 1.0E-5F) {
                     float $$18 = azn.a(azn.h(180.0F - (float)azn.d($$9, $$11) * (180.0F / (float)Math.PI) - this.dO()), -50.0F, 50.0F);
                     this.ca *= 0.8F;
                     this.ca = this.ca + $$18 * $$7.h();
                     this.v(this.dO() + this.ca * 0.1F);
                  }

                  float $$19 = (float)(2.0 / ($$12 + 1.0));
                  float $$20 = 0.06F;
                  this.a(0.06F * ($$17 * $$19 + (1.0F - $$19)), new ezr(0.0, 0.0, -1.0));
                  if (this.bY) {
                     this.a(bvi.a, this.dB().c(0.8F));
                  } else {
                     this.a(bvi.a, this.dB());
                  }

                  ezr $$21 = this.dB().d();
                  double $$22 = 0.8 + 0.15 * ($$21.b($$16) + 1.0) / 2.0;
                  this.h(this.dB().d($$22, 0.91F, $$22));
               }
            }

            if (!this.dY().y_()) {
               this.aM();
            }

            this.aX = this.dO();
            ezr[] $$23 = new ezr[this.cj.length];

            for (int $$24 = 0; $$24 < this.cj.length; $$24++) {
               $$23[$$24] = new ezr(this.cj[$$24].dD(), this.cj[$$24].dF(), this.cj[$$24].dJ());
            }

            float $$25 = (float)(this.c.a(5).a() - this.c.a(10).a()) * 10.0F * (float) (Math.PI / 180.0);
            float $$26 = azn.b($$25);
            float $$27 = azn.a($$25);
            float $$28 = this.dO() * (float) (Math.PI / 180.0);
            float $$29 = azn.a($$28);
            float $$30 = azn.b($$28);
            this.a(this.cl, (double)($$29 * 0.5F), 0.0, (double)(-$$30 * 0.5F));
            this.a(this.cp, (double)($$30 * 4.5F), 2.0, (double)($$29 * 4.5F));
            this.a(this.cq, (double)($$30 * -4.5F), 2.0, (double)($$29 * -4.5F));
            if (this.dY() instanceof arq $$31 && this.aN == 0) {
               this.a($$31, $$31.a(this, this.cp.cT().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bun.e));
               this.a($$31, $$31.a(this, this.cq.cT().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bun.e));
               this.b($$31.a(this, this.d.cT().g(1.0), bun.e));
               this.b($$31.a(this, this.ck.cT().g(1.0), bun.e));
            }

            float $$32 = azn.a(this.dO() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$33 = azn.b(this.dO() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$34 = this.gu();
            this.a(this.d, (double)($$32 * 6.5F * $$26), (double)($$34 + $$27 * 6.5F), (double)(-$$33 * 6.5F * $$26));
            this.a(this.ck, (double)($$32 * 5.5F * $$26), (double)($$34 + $$27 * 5.5F), (double)(-$$33 * 5.5F * $$26));
            cjq.a $$35 = this.c.a(5);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               cjp $$37 = null;
               if ($$36 == 0) {
                  $$37 = this.cm;
               }

               if ($$36 == 1) {
                  $$37 = this.cn;
               }

               if ($$36 == 2) {
                  $$37 = this.co;
               }

               cjq.a $$38 = this.c.a(12 + $$36 * 2);
               float $$39 = this.dO() * (float) (Math.PI / 180.0) + this.i((double)($$38.b() - $$35.b())) * (float) (Math.PI / 180.0);
               float $$40 = azn.a($$39);
               float $$41 = azn.b($$39);
               float $$42 = 1.5F;
               float $$43 = (float)($$36 + 1) * 2.0F;
               this.a(
                  $$37,
                  (double)(-($$29 * 1.5F + $$40 * $$43) * $$26),
                  $$38.a() - $$35.a() - (double)(($$43 + 1.5F) * $$27) + 1.5,
                  (double)(($$30 * 1.5F + $$41 * $$43) * $$26)
               );
            }

            if (!this.dY().C) {
               this.bY = this.b(this.d.cT()) | this.b(this.ck.cT()) | this.b(this.cl.cT());
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

   private void a(cjp $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dD() + $$1, this.dF() + $$2, this.dJ() + $$3);
   }

   private float gu() {
      if (this.ct.a().a()) {
         return -1.0F;
      } else {
         cjq.a $$0 = this.c.a(5);
         cjq.a $$1 = this.c.a(0);
         return (float)($$0.a() - $$1.a());
      }
   }

   private void gv() {
      if (this.cb != null) {
         if (this.cb.dT()) {
            this.cb = null;
         } else if (this.ag % 10 == 0 && this.eH() < this.eW()) {
            this.x(this.eH() + 1.0F);
         }
      }

      if (this.af.a(10) == 0) {
         List<cjr> $$0 = this.dY().a(cjr.class, this.cT().g(32.0));
         cjr $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cjr $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.cb = $$1;
      }
   }

   private void a(arq $$0, List<bui> $$1) {
      double $$2 = (this.cl.cT().a + this.cl.cT().d) / 2.0;
      double $$3 = (this.cl.cT().c + this.cl.cT().f) / 2.0;

      for (bui $$4 : $$1) {
         if ($$4 instanceof bve) {
            bve $$5 = (bve)$$4;
            double $$6 = $$4.dD() - $$2;
            double $$7 = $$4.dJ() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.j($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.ct.a().a() && $$5.eu() < $$4.ag - 2) {
               bsy $$9 = this.dZ().b((bve)this);
               $$4.a($$9, 5.0F);
               dby.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(List<bui> $$0) {
      for (bui $$1 : $$0) {
         if ($$1 instanceof bve) {
            bsy $$2 = this.dZ().b((bve)this);
            $$1.a($$2, 10.0F);
            if (this.dY() instanceof arq $$3) {
               dby.a($$3, $$1, $$2);
            }
         }
      }
   }

   private float i(double $$0) {
      return (float)azn.d($$0);
   }

   private boolean b(ezm $$0) {
      int $$1 = azn.a($$0.a);
      int $$2 = azn.a($$0.b);
      int $$3 = azn.a($$0.c);
      int $$4 = azn.a($$0.d);
      int $$5 = azn.a($$0.e);
      int $$6 = azn.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               jh $$12 = new jh($$9, $$10, $$11);
               dvo $$13 = this.dY().a_($$12);
               if (!$$13.l() && !$$13.a(axd.aF)) {
                  if (this.dY().ac().b(dfb.c) && !$$13.a(axd.aE)) {
                     $$8 = this.dY().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         jh $$14 = new jh($$1 + this.af.a($$4 - $$1 + 1), $$2 + this.af.a($$5 - $$2 + 1), $$3 + this.af.a($$6 - $$3 + 1));
         this.dY().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(cjp $$0, bsy $$1, float $$2) {
      if (this.ct.a().i() == cki.j) {
         return false;
      } else {
         $$2 = this.ct.a().a($$1, $$2);
         if ($$0 != this.d) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cor || $$1.a(axf.y)) {
               float $$3 = this.eH();
               this.g($$1, $$2);
               if (this.eI() && !this.ct.a().a()) {
                  this.x(1.0F);
                  this.ct.a(cki.j);
               }

               if (this.ct.a().a()) {
                  this.cv = this.cv + $$3 - this.eH();
                  if (this.cv > 0.25F * this.eW()) {
                     this.cv = 0.0F;
                     this.ct.a(cki.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      return !this.dY().C ? this.a(this.cl, $$0, $$1) : false;
   }

   protected boolean g(bsy $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void au() {
      this.a(bui.c.a);
      this.a(eak.p);
      if (this.cr != null) {
         this.cr.b(this);
         this.cr.a(this);
      }
   }

   @Override
   protected void eo() {
      if (this.cr != null) {
         this.cr.b(this);
      }

      this.bZ++;
      if (this.bZ >= 180 && this.bZ <= 200) {
         float $$0 = (this.af.i() - 0.5F) * 8.0F;
         float $$1 = (this.af.i() - 0.5F) * 4.0F;
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         this.dY().a(ls.v, this.dD() + (double)$$0, this.dF() + 2.0 + (double)$$1, this.dJ() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dY().ac().b(dfb.f);
      int $$4 = 500;
      if (this.cr != null && !this.cr.f()) {
         $$4 = 12000;
      }

      if (this.dY() instanceof arq) {
         if (this.bZ > 150 && this.bZ % 5 == 0 && $$3) {
            buu.a((arq)this.dY(), this.dw(), azn.d((float)$$4 * 0.08F));
         }

         if (this.bZ == 1 && !this.bd()) {
            this.dY().b(1028, this.dy(), 0);
         }
      }

      this.a(bvi.a, new ezr(0.0, 0.1F, 0.0));
      if (this.bZ == 200 && this.dY() instanceof arq) {
         if ($$3) {
            buu.a((arq)this.dY(), this.dw(), azn.d((float)$$4 * 0.2F));
         }

         if (this.cr != null) {
            this.cr.a(this);
         }

         this.a(bui.c.a);
         this.a(eak.p);
      }
   }

   public int y() {
      if (this.cw[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = azn.d(60.0F * azn.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = azn.d(60.0F * azn.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = azn.d(40.0F * azn.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = azn.d(40.0F * azn.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = azn.d(20.0F * azn.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = azn.d(20.0F * azn.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(73, this.dY().a(ebj.a.f, new jh($$3, 0, $$4)).v() + $$1);
            this.cw[$$0] = new esa($$3, $$9, $$4);
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

      return this.q(this.dD(), this.dF(), this.dJ());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      esa $$5 = new esa(azn.a($$0), azn.a($$1), azn.a($$2));
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
   public esc a(int $$0, int $$1, @Nullable esa $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         esa $$4 = this.cw[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      esa $$5 = this.cw[$$0];
      esa $$6 = this.cw[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cy.a();
      this.cy.a($$5);
      esa $$7 = $$5;
      int $$8 = 0;
      if (this.cr == null || this.cr.e() == 0) {
         $$8 = 12;
      }

      while (!this.cy.e()) {
         esa $$9 = this.cy.c();
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
               esa $$13 = this.cw[$$12];
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

   private esc a(esa $$0, esa $$1) {
      List<esa> $$2 = Lists.newArrayList();
      esa $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new esc($$2, new jh($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.ct.a().i().b());
      $$0.a("DragonDeathTime", this.bZ);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.ct.a(cki.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bZ = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dK() {
   }

   public cjp[] gr() {
      return this.cj;
   }

   @Override
   public boolean bJ() {
      return false;
   }

   @Override
   public awp do() {
      return awp.f;
   }

   @Override
   protected awn w() {
      return awo.ib;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.ig;
   }

   @Override
   protected float fj() {
      return 5.0F;
   }

   public ezr J(float $$0) {
      ckc $$1 = this.ct.a();
      cki<? extends ckc> $$2 = $$1.i();
      ezr $$8;
      if ($$2 == cki.d || $$2 == cki.e) {
         jh $$3 = this.dY().a(ebj.a.f, eeo.a(this.cs));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.dw())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dQ();
         float $$7 = 1.5F;
         this.w(-$$5 * 1.5F * 5.0F);
         $$8 = this.g($$0);
         this.w($$6);
      } else if ($$1.a()) {
         float $$9 = this.dQ();
         float $$10 = 1.5F;
         this.w(-45.0F);
         $$8 = this.g($$0);
         this.w($$9);
      } else {
         $$8 = this.g($$0);
      }

      return $$8;
   }

   public void a(cjr $$0, jh $$1, bsy $$2) {
      cor $$3;
      if ($$2.d() instanceof cor) {
         $$3 = (cor)$$2.d();
      } else {
         $$3 = this.dY().a(cd, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.cb) {
         this.a(this.d, this.dZ().d($$0, $$3), 10.0F);
      }

      this.ct.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ako<?> $$0) {
      if (b.equals($$0) && this.dY().C) {
         this.ct.a(cki.a(this.aw().a(b)));
      }

      super.a($$0);
   }

   public ckj gs() {
      return this.ct;
   }

   @Nullable
   public dzm gt() {
      return this.cr;
   }

   @Override
   public boolean b(btn $$0, @Nullable bui $$1) {
      return false;
   }

   @Override
   protected boolean o(bui $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      cjp[] $$1 = this.gr();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b());
      }
   }

   @Override
   public boolean c(bve $$0) {
      return $$0.eA();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
