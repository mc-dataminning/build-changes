import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cix extends bum implements cks {
   private static final Logger cc = LogUtils.getLogger();
   public static final akg<Integer> b = akk.a(cix.class, aki.b);
   private static final cfa cd = cfa.a().a(64.0);
   private static final int ce = 200;
   private static final int cf = 400;
   private static final float cg = 0.25F;
   private static final String ch = "DragonDeathTime";
   private static final String ci = "DragonPhase";
   public final civ c = new civ();
   private final ciu[] cj;
   public final ciu d;
   private final ciu ck;
   private final ciu cl;
   private final ciu cm;
   private final ciu cn;
   private final ciu co;
   private final ciu cp;
   private final ciu cq;
   public float e;
   public float bX;
   public boolean bY;
   public int bZ;
   public float ca;
   @Nullable
   public ciw cb;
   @Nullable
   private dyn cr;
   private je cs = je.c;
   private final cjo ct;
   private int cu = 100;
   private float cv;
   private final erb[] cw = new erb[24];
   private final int[] cx = new int[24];
   private final eqz cy = new eqz();

   public cix(btv<? extends cix> $$0, deg $$1) {
      super(btv.F, $$1);
      this.d = new ciu(this, "head", 1.0F, 1.0F);
      this.ck = new ciu(this, "neck", 3.0F, 3.0F);
      this.cl = new ciu(this, "body", 5.0F, 3.0F);
      this.cm = new ciu(this, "tail", 2.0F, 2.0F);
      this.cn = new ciu(this, "tail", 2.0F, 2.0F);
      this.co = new ciu(this, "tail", 2.0F, 2.0F);
      this.cp = new ciu(this, "wing", 4.0F, 2.0F);
      this.cq = new ciu(this, "wing", 4.0F, 2.0F);
      this.cj = new ciu[]{this.d, this.ck, this.cl, this.cm, this.cn, this.co, this.cp, this.cq};
      this.x(this.eQ());
      this.ae = true;
      this.ct = new cjo(this);
   }

   public void a(dyn $$0) {
      this.cr = $$0;
   }

   @Override
   public void c(je $$0) {
      this.cs = $$0;
   }

   public je q() {
      return this.cs;
   }

   public static bvq.a t() {
      return bum.E().a(bvr.s, 200.0);
   }

   @Override
   public boolean aZ() {
      float $$0 = azd.b(this.bX * (float) (Math.PI * 2));
      float $$1 = azd.b(this.e * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aY() {
      if (this.dS().B && !this.ba()) {
         this.dS().a(this.dx(), this.dz(), this.dD(), awe.ie, this.di(), 5.0F, 0.8F + this.af.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, cjn.k.b());
   }

   @Override
   public void m_() {
      this.aM();
      if (this.dS().B) {
         this.x(this.eA());
         if (!this.ba() && !this.ct.a().a() && --this.cu < 0) {
            this.dS().a(this.dx(), this.dz(), this.dD(), awe.if, this.di(), 2.5F, 0.8F + this.af.i() * 0.3F, false);
            this.cu = 200 + this.af.a(200);
         }
      }

      if (this.cr == null && this.dS() instanceof arh $$0) {
         dyn $$1 = $$0.D();
         if ($$1 != null && this.cD().equals($$1.i())) {
            this.cr = $$1;
         }
      }

      this.e = this.bX;
      if (this.eB()) {
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         float $$3 = (this.af.i() - 0.5F) * 4.0F;
         float $$4 = (this.af.i() - 0.5F) * 8.0F;
         this.dS().a(ln.w, this.dx() + (double)$$2, this.dz() + 2.0 + (double)$$3, this.dD() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gp();
         eys $$5 = this.dv();
         float $$6 = 0.2F / ((float)$$5.i() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.e);
         if (this.ct.a().a()) {
            this.bX += 0.1F;
         } else if (this.bY) {
            this.bX += $$6 * 0.5F;
         } else {
            this.bX += $$6;
         }

         this.v(azd.g(this.dI()));
         if (this.ge()) {
            this.bX = 0.5F;
         } else {
            this.c.a(this.dz(), this.dI());
            if (this.dS().B) {
               if (this.bn > 0) {
                  this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
                  this.bn--;
               }

               this.ct.a().b();
            } else {
               cjh $$7 = this.ct.a();
               $$7.c();
               if (this.ct.a() != $$7) {
                  $$7 = this.ct.a();
                  $$7.c();
               }

               eys $$8 = $$7.g();
               if ($$8 != null) {
                  double $$9 = $$8.d - this.dx();
                  double $$10 = $$8.e - this.dz();
                  double $$11 = $$8.f - this.dD();
                  double $$12 = $$9 * $$9 + $$10 * $$10 + $$11 * $$11;
                  float $$13 = $$7.f();
                  double $$14 = Math.sqrt($$9 * $$9 + $$11 * $$11);
                  if ($$14 > 0.0) {
                     $$10 = azd.a($$10 / $$14, (double)(-$$13), (double)$$13);
                  }

                  this.h(this.dv().b(0.0, $$10 * 0.01, 0.0));
                  this.v(azd.g(this.dI()));
                  eys $$15 = $$8.a(this.dx(), this.dz(), this.dD()).d();
                  eys $$16 = new eys((double)azd.a(this.dI() * (float) (Math.PI / 180.0)), this.dv().e, (double)(-azd.b(this.dI() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$17 = Math.max(((float)$$16.b($$15) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$9) > 1.0E-5F || Math.abs($$11) > 1.0E-5F) {
                     float $$18 = azd.a(azd.g(180.0F - (float)azd.d($$9, $$11) * (180.0F / (float)Math.PI) - this.dI()), -50.0F, 50.0F);
                     this.ca *= 0.8F;
                     this.ca = this.ca + $$18 * $$7.h();
                     this.v(this.dI() + this.ca * 0.1F);
                  }

                  float $$19 = (float)(2.0 / ($$12 + 1.0));
                  float $$20 = 0.06F;
                  this.a(0.06F * ($$17 * $$19 + (1.0F - $$19)), new eys(0.0, 0.0, -1.0));
                  if (this.bY) {
                     this.a(buo.a, this.dv().c(0.8F));
                  } else {
                     this.a(buo.a, this.dv());
                  }

                  eys $$21 = this.dv().d();
                  double $$22 = 0.8 + 0.15 * ($$21.b($$16) + 1.0) / 2.0;
                  this.h(this.dv().d($$22, 0.91F, $$22));
               }
            }

            if (!this.dS().w_()) {
               this.aI();
            }

            this.aT = this.dI();
            eys[] $$23 = new eys[this.cj.length];

            for (int $$24 = 0; $$24 < this.cj.length; $$24++) {
               $$23[$$24] = new eys(this.cj[$$24].dx(), this.cj[$$24].dz(), this.cj[$$24].dD());
            }

            float $$25 = (float)(this.c.a(5).a() - this.c.a(10).a()) * 10.0F * (float) (Math.PI / 180.0);
            float $$26 = azd.b($$25);
            float $$27 = azd.a($$25);
            float $$28 = this.dI() * (float) (Math.PI / 180.0);
            float $$29 = azd.a($$28);
            float $$30 = azd.b($$28);
            this.a(this.cl, (double)($$29 * 0.5F), 0.0, (double)(-$$30 * 0.5F));
            this.a(this.cp, (double)($$30 * 4.5F), 2.0, (double)($$29 * 4.5F));
            this.a(this.cq, (double)($$30 * -4.5F), 2.0, (double)($$29 * -4.5F));
            if (this.dS() instanceof arh $$31 && this.aJ == 0) {
               this.a($$31, $$31.a(this, this.cp.cO().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), btt.e));
               this.a($$31, $$31.a(this, this.cq.cO().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), btt.e));
               this.b($$31.a(this, this.d.cO().g(1.0), btt.e));
               this.b($$31.a(this, this.ck.cO().g(1.0), btt.e));
            }

            float $$32 = azd.a(this.dI() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$33 = azd.b(this.dI() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$34 = this.go();
            this.a(this.d, (double)($$32 * 6.5F * $$26), (double)($$34 + $$27 * 6.5F), (double)(-$$33 * 6.5F * $$26));
            this.a(this.ck, (double)($$32 * 5.5F * $$26), (double)($$34 + $$27 * 5.5F), (double)(-$$33 * 5.5F * $$26));
            civ.a $$35 = this.c.a(5);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               ciu $$37 = null;
               if ($$36 == 0) {
                  $$37 = this.cm;
               }

               if ($$36 == 1) {
                  $$37 = this.cn;
               }

               if ($$36 == 2) {
                  $$37 = this.co;
               }

               civ.a $$38 = this.c.a(12 + $$36 * 2);
               float $$39 = this.dI() * (float) (Math.PI / 180.0) + this.i((double)($$38.b() - $$35.b())) * (float) (Math.PI / 180.0);
               float $$40 = azd.a($$39);
               float $$41 = azd.b($$39);
               float $$42 = 1.5F;
               float $$43 = (float)($$36 + 1) * 2.0F;
               this.a(
                  $$37,
                  (double)(-($$29 * 1.5F + $$40 * $$43) * $$26),
                  $$38.a() - $$35.a() - (double)(($$43 + 1.5F) * $$27) + 1.5,
                  (double)(($$30 * 1.5F + $$41 * $$43) * $$26)
               );
            }

            if (!this.dS().B) {
               this.bY = this.b(this.d.cO()) | this.b(this.ck.cO()) | this.b(this.cl.cO());
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

   private void a(ciu $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dx() + $$1, this.dz() + $$2, this.dD() + $$3);
   }

   private float go() {
      if (this.ct.a().a()) {
         return -1.0F;
      } else {
         civ.a $$0 = this.c.a(5);
         civ.a $$1 = this.c.a(0);
         return (float)($$0.a() - $$1.a());
      }
   }

   private void gp() {
      if (this.cb != null) {
         if (this.cb.dN()) {
            this.cb = null;
         } else if (this.ag % 10 == 0 && this.eA() < this.eQ()) {
            this.x(this.eA() + 1.0F);
         }
      }

      if (this.af.a(10) == 0) {
         List<ciw> $$0 = this.dS().a(ciw.class, this.cO().g(32.0));
         ciw $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (ciw $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.cb = $$1;
      }
   }

   private void a(arh $$0, List<bto> $$1) {
      double $$2 = (this.cl.cO().a + this.cl.cO().d) / 2.0;
      double $$3 = (this.cl.cO().c + this.cl.cO().f) / 2.0;

      for (bto $$4 : $$1) {
         if ($$4 instanceof buk) {
            buk $$5 = (buk)$$4;
            double $$6 = $$4.dx() - $$2;
            double $$7 = $$4.dD() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.j($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.ct.a().a() && $$5.en() < $$4.ag - 2) {
               bsg $$9 = this.dT().b((buk)this);
               $$4.a($$9, 5.0F);
               dbm.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(List<bto> $$0) {
      for (bto $$1 : $$0) {
         if ($$1 instanceof buk) {
            bsg $$2 = this.dT().b((buk)this);
            $$1.a($$2, 10.0F);
            if (this.dS() instanceof arh $$3) {
               dbm.a($$3, $$1, $$2);
            }
         }
      }
   }

   private float i(double $$0) {
      return (float)azd.d($$0);
   }

   private boolean b(eyn $$0) {
      int $$1 = azd.a($$0.a);
      int $$2 = azd.a($$0.b);
      int $$3 = azd.a($$0.c);
      int $$4 = azd.a($$0.d);
      int $$5 = azd.a($$0.e);
      int $$6 = azd.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               je $$12 = new je($$9, $$10, $$11);
               duo $$13 = this.dS().a_($$12);
               if (!$$13.l() && !$$13.a(awt.aE)) {
                  if (this.dS().ac().b(dec.c) && !$$13.a(awt.aD)) {
                     $$8 = this.dS().a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         je $$14 = new je($$1 + this.af.a($$4 - $$1 + 1), $$2 + this.af.a($$5 - $$2 + 1), $$3 + this.af.a($$6 - $$3 + 1));
         this.dS().c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(ciu $$0, bsg $$1, float $$2) {
      if (this.ct.a().i() == cjn.j) {
         return false;
      } else {
         $$2 = this.ct.a().a($$1, $$2);
         if ($$0 != this.d) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cnu || $$1.a(awv.y)) {
               float $$3 = this.eA();
               this.g($$1, $$2);
               if (this.eB() && !this.ct.a().a()) {
                  this.x(1.0F);
                  this.ct.a(cjn.j);
               }

               if (this.ct.a().a()) {
                  this.cv = this.cv + $$3 - this.eA();
                  if (this.cv > 0.25F * this.eQ()) {
                     this.cv = 0.0F;
                     this.ct.a(cjn.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      return !this.dS().B ? this.a(this.cl, $$0, $$1) : false;
   }

   protected boolean g(bsg $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void ar() {
      this.a(bto.c.a);
      this.a(dzl.p);
      if (this.cr != null) {
         this.cr.b(this);
         this.cr.a(this);
      }
   }

   @Override
   protected void eh() {
      if (this.cr != null) {
         this.cr.b(this);
      }

      this.bZ++;
      if (this.bZ >= 180 && this.bZ <= 200) {
         float $$0 = (this.af.i() - 0.5F) * 8.0F;
         float $$1 = (this.af.i() - 0.5F) * 4.0F;
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         this.dS().a(ln.v, this.dx() + (double)$$0, this.dz() + 2.0 + (double)$$1, this.dD() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dS().ac().b(dec.f);
      int $$4 = 500;
      if (this.cr != null && !this.cr.f()) {
         $$4 = 12000;
      }

      if (this.dS() instanceof arh) {
         if (this.bZ > 150 && this.bZ % 5 == 0 && $$3) {
            bua.a((arh)this.dS(), this.dq(), azd.d((float)$$4 * 0.08F));
         }

         if (this.bZ == 1 && !this.ba()) {
            this.dS().b(1028, this.ds(), 0);
         }
      }

      this.a(buo.a, new eys(0.0, 0.1F, 0.0));
      if (this.bZ == 200 && this.dS() instanceof arh) {
         if ($$3) {
            bua.a((arh)this.dS(), this.dq(), azd.d((float)$$4 * 0.2F));
         }

         if (this.cr != null) {
            this.cr.a(this);
         }

         this.a(bto.c.a);
         this.a(dzl.p);
      }
   }

   public int y() {
      if (this.cw[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = azd.d(60.0F * azd.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = azd.d(60.0F * azd.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = azd.d(40.0F * azd.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = azd.d(40.0F * azd.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = azd.d(20.0F * azd.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = azd.d(20.0F * azd.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(73, this.dS().a(eak.a.f, new je($$3, 0, $$4)).v() + $$1);
            this.cw[$$0] = new erb($$3, $$9, $$4);
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

      return this.q(this.dx(), this.dz(), this.dD());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      erb $$5 = new erb(azd.a($$0), azd.a($$1), azd.a($$2));
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
   public erd a(int $$0, int $$1, @Nullable erb $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         erb $$4 = this.cw[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      erb $$5 = this.cw[$$0];
      erb $$6 = this.cw[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cy.a();
      this.cy.a($$5);
      erb $$7 = $$5;
      int $$8 = 0;
      if (this.cr == null || this.cr.e() == 0) {
         $$8 = 12;
      }

      while (!this.cy.e()) {
         erb $$9 = this.cy.c();
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
               erb $$13 = this.cw[$$12];
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

   private erd a(erb $$0, erb $$1) {
      List<erb> $$2 = Lists.newArrayList();
      erb $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new erd($$2, new je($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.ct.a().i().b());
      $$0.a("DragonDeathTime", this.bZ);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.ct.a(cjn.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bZ = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dE() {
   }

   public ciu[] gl() {
      return this.cj;
   }

   @Override
   public boolean bE() {
      return false;
   }

   @Override
   public awf di() {
      return awf.f;
   }

   @Override
   protected awd w() {
      return awe.ib;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.ig;
   }

   @Override
   protected float fd() {
      return 5.0F;
   }

   public eys J(float $$0) {
      cjh $$1 = this.ct.a();
      cjn<? extends cjh> $$2 = $$1.i();
      eys $$8;
      if ($$2 == cjn.d || $$2 == cjn.e) {
         je $$3 = this.dS().a(eak.a.f, edp.a(this.cs));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.dq())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dK();
         float $$7 = 1.5F;
         this.w(-$$5 * 1.5F * 5.0F);
         $$8 = this.g($$0);
         this.w($$6);
      } else if ($$1.a()) {
         float $$9 = this.dK();
         float $$10 = 1.5F;
         this.w(-45.0F);
         $$8 = this.g($$0);
         this.w($$9);
      } else {
         $$8 = this.g($$0);
      }

      return $$8;
   }

   public void a(ciw $$0, je $$1, bsg $$2) {
      cnu $$3;
      if ($$2.d() instanceof cnu) {
         $$3 = (cnu)$$2.d();
      } else {
         $$3 = this.dS().a(cd, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.cb) {
         this.a(this.d, this.dT().d($$0, $$3), 10.0F);
      }

      this.ct.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(akg<?> $$0) {
      if (b.equals($$0) && this.dS().B) {
         this.ct.a(cjn.a(this.at().a(b)));
      }

      super.a($$0);
   }

   public cjo gm() {
      return this.ct;
   }

   @Nullable
   public dyn gn() {
      return this.cr;
   }

   @Override
   public boolean b(bsv $$0, @Nullable bto $$1) {
      return false;
   }

   @Override
   protected boolean o(bto $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public void a(aca $$0) {
      super.a($$0);
      ciu[] $$1 = this.gl();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b());
      }
   }

   @Override
   public boolean c(buk $$0) {
      return $$0.et();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
