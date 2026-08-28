import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cis extends buh implements ckn {
   private static final Logger cd = LogUtils.getLogger();
   public static final akg<Integer> b = akk.a(cis.class, aki.b);
   private static final cev ce = cev.a().a(64.0);
   private static final int cf = 200;
   private static final int cg = 400;
   private static final float ch = 0.25F;
   private static final String ci = "DragonDeathTime";
   private static final String cj = "DragonPhase";
   public final ciq c = new ciq();
   private final cip[] ck;
   public final cip d;
   private final cip cl;
   private final cip cm;
   private final cip cn;
   private final cip co;
   private final cip cp;
   private final cip cq;
   private final cip cr;
   public float e;
   public float bY;
   public boolean bZ;
   public int ca;
   public float cb;
   @Nullable
   public cir cc;
   @Nullable
   private dxz cs;
   private je ct = je.c;
   private final cjj cu;
   private int cv = 100;
   private float cw;
   private final eqn[] cx = new eqn[24];
   private final int[] cy = new int[24];
   private final eql cz = new eql();

   public cis(btq<? extends cis> $$0, dds $$1) {
      super(btq.F, $$1);
      this.d = new cip(this, "head", 1.0F, 1.0F);
      this.cl = new cip(this, "neck", 3.0F, 3.0F);
      this.cm = new cip(this, "body", 5.0F, 3.0F);
      this.cn = new cip(this, "tail", 2.0F, 2.0F);
      this.co = new cip(this, "tail", 2.0F, 2.0F);
      this.cp = new cip(this, "tail", 2.0F, 2.0F);
      this.cq = new cip(this, "wing", 4.0F, 2.0F);
      this.cr = new cip(this, "wing", 4.0F, 2.0F);
      this.ck = new cip[]{this.d, this.cl, this.cm, this.cn, this.co, this.cp, this.cq, this.cr};
      this.x(this.eQ());
      this.ae = true;
      this.cu = new cjj(this);
   }

   public void a(dxz $$0) {
      this.cs = $$0;
   }

   @Override
   public void c(je $$0) {
      this.ct = $$0;
   }

   public je q() {
      return this.ct;
   }

   public static bvl.a t() {
      return buh.E().a(bvm.s, 200.0);
   }

   @Override
   public boolean aZ() {
      float $$0 = azc.b(this.bY * (float) (Math.PI * 2));
      float $$1 = azc.b(this.e * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aY() {
      if (this.dS().B && !this.ba()) {
         this.dS().a(this.dx(), this.dz(), this.dD(), awd.ie, this.di(), 5.0F, 0.8F + this.af.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, cji.k.b());
   }

   @Override
   public void m_() {
      this.aM();
      if (this.dS().B) {
         this.x(this.eA());
         if (!this.ba() && !this.cu.a().a() && --this.cv < 0) {
            this.dS().a(this.dx(), this.dz(), this.dD(), awd.if, this.di(), 2.5F, 0.8F + this.af.i() * 0.3F, false);
            this.cv = 200 + this.af.a(200);
         }
      }

      if (this.cs == null && this.dS() instanceof arg $$0) {
         dxz $$1 = $$0.D();
         if ($$1 != null && this.cD().equals($$1.i())) {
            this.cs = $$1;
         }
      }

      this.e = this.bY;
      if (this.eB()) {
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         float $$3 = (this.af.i() - 0.5F) * 4.0F;
         float $$4 = (this.af.i() - 0.5F) * 8.0F;
         this.dS().a(ln.w, this.dx() + (double)$$2, this.dz() + 2.0 + (double)$$3, this.dD() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.go();
         eye $$5 = this.dv();
         float $$6 = 0.2F / ((float)$$5.i() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.e);
         if (this.cu.a().a()) {
            this.bY += 0.1F;
         } else if (this.bZ) {
            this.bY += $$6 * 0.5F;
         } else {
            this.bY += $$6;
         }

         this.v(azc.g(this.dI()));
         if (this.gd()) {
            this.bY = 0.5F;
         } else {
            this.c.a(this.dz(), this.dI());
            if (this.dS().B) {
               if (this.bo > 0) {
                  this.a(this.bo, this.bp, this.bq, this.br, this.bs, this.bt);
                  this.bo--;
               }

               this.cu.a().b();
            } else {
               cjc $$7 = this.cu.a();
               $$7.c();
               if (this.cu.a() != $$7) {
                  $$7 = this.cu.a();
                  $$7.c();
               }

               eye $$8 = $$7.g();
               if ($$8 != null) {
                  double $$9 = $$8.d - this.dx();
                  double $$10 = $$8.e - this.dz();
                  double $$11 = $$8.f - this.dD();
                  double $$12 = $$9 * $$9 + $$10 * $$10 + $$11 * $$11;
                  float $$13 = $$7.f();
                  double $$14 = Math.sqrt($$9 * $$9 + $$11 * $$11);
                  if ($$14 > 0.0) {
                     $$10 = azc.a($$10 / $$14, (double)(-$$13), (double)$$13);
                  }

                  this.h(this.dv().b(0.0, $$10 * 0.01, 0.0));
                  this.v(azc.g(this.dI()));
                  eye $$15 = $$8.a(this.dx(), this.dz(), this.dD()).d();
                  eye $$16 = new eye((double)azc.a(this.dI() * (float) (Math.PI / 180.0)), this.dv().e, (double)(-azc.b(this.dI() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$17 = Math.max(((float)$$16.b($$15) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$9) > 1.0E-5F || Math.abs($$11) > 1.0E-5F) {
                     float $$18 = azc.a(azc.g(180.0F - (float)azc.d($$9, $$11) * (180.0F / (float)Math.PI) - this.dI()), -50.0F, 50.0F);
                     this.cb *= 0.8F;
                     this.cb = this.cb + $$18 * $$7.h();
                     this.v(this.dI() + this.cb * 0.1F);
                  }

                  float $$19 = (float)(2.0 / ($$12 + 1.0));
                  float $$20 = 0.06F;
                  this.a(0.06F * ($$17 * $$19 + (1.0F - $$19)), new eye(0.0, 0.0, -1.0));
                  if (this.bZ) {
                     this.a(buj.a, this.dv().c(0.8F));
                  } else {
                     this.a(buj.a, this.dv());
                  }

                  eye $$21 = this.dv().d();
                  double $$22 = 0.8 + 0.15 * ($$21.b($$16) + 1.0) / 2.0;
                  this.h(this.dv().d($$22, 0.91F, $$22));
               }
            }

            if (!this.dS().w_()) {
               this.aI();
            }

            this.aU = this.dI();
            eye[] $$23 = new eye[this.ck.length];

            for (int $$24 = 0; $$24 < this.ck.length; $$24++) {
               $$23[$$24] = new eye(this.ck[$$24].dx(), this.ck[$$24].dz(), this.ck[$$24].dD());
            }

            float $$25 = (float)(this.c.a(5).a() - this.c.a(10).a()) * 10.0F * (float) (Math.PI / 180.0);
            float $$26 = azc.b($$25);
            float $$27 = azc.a($$25);
            float $$28 = this.dI() * (float) (Math.PI / 180.0);
            float $$29 = azc.a($$28);
            float $$30 = azc.b($$28);
            this.a(this.cm, (double)($$29 * 0.5F), 0.0, (double)(-$$30 * 0.5F));
            this.a(this.cq, (double)($$30 * 4.5F), 2.0, (double)($$29 * 4.5F));
            this.a(this.cr, (double)($$30 * -4.5F), 2.0, (double)($$29 * -4.5F));
            if (this.dS() instanceof arg $$31 && this.aK == 0) {
               this.a($$31, $$31.a(this, this.cq.cO().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bto.e));
               this.a($$31, $$31.a(this, this.cr.cO().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bto.e));
               this.b($$31.a(this, this.d.cO().g(1.0), bto.e));
               this.b($$31.a(this, this.cl.cO().g(1.0), bto.e));
            }

            float $$32 = azc.a(this.dI() * (float) (Math.PI / 180.0) - this.cb * 0.01F);
            float $$33 = azc.b(this.dI() * (float) (Math.PI / 180.0) - this.cb * 0.01F);
            float $$34 = this.gn();
            this.a(this.d, (double)($$32 * 6.5F * $$26), (double)($$34 + $$27 * 6.5F), (double)(-$$33 * 6.5F * $$26));
            this.a(this.cl, (double)($$32 * 5.5F * $$26), (double)($$34 + $$27 * 5.5F), (double)(-$$33 * 5.5F * $$26));
            ciq.a $$35 = this.c.a(5);

            for (int $$36 = 0; $$36 < 3; $$36++) {
               cip $$37 = null;
               if ($$36 == 0) {
                  $$37 = this.cn;
               }

               if ($$36 == 1) {
                  $$37 = this.co;
               }

               if ($$36 == 2) {
                  $$37 = this.cp;
               }

               ciq.a $$38 = this.c.a(12 + $$36 * 2);
               float $$39 = this.dI() * (float) (Math.PI / 180.0) + this.i((double)($$38.b() - $$35.b())) * (float) (Math.PI / 180.0);
               float $$40 = azc.a($$39);
               float $$41 = azc.b($$39);
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
               this.bZ = this.b(this.d.cO()) | this.b(this.cl.cO()) | this.b(this.cm.cO());
               if (this.cs != null) {
                  this.cs.b(this);
               }
            }

            for (int $$44 = 0; $$44 < this.ck.length; $$44++) {
               this.ck[$$44].L = $$23[$$44].d;
               this.ck[$$44].M = $$23[$$44].e;
               this.ck[$$44].N = $$23[$$44].f;
               this.ck[$$44].ab = $$23[$$44].d;
               this.ck[$$44].ac = $$23[$$44].e;
               this.ck[$$44].ad = $$23[$$44].f;
            }
         }
      }
   }

   private void a(cip $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dx() + $$1, this.dz() + $$2, this.dD() + $$3);
   }

   private float gn() {
      if (this.cu.a().a()) {
         return -1.0F;
      } else {
         ciq.a $$0 = this.c.a(5);
         ciq.a $$1 = this.c.a(0);
         return (float)($$0.a() - $$1.a());
      }
   }

   private void go() {
      if (this.cc != null) {
         if (this.cc.dN()) {
            this.cc = null;
         } else if (this.ag % 10 == 0 && this.eA() < this.eQ()) {
            this.x(this.eA() + 1.0F);
         }
      }

      if (this.af.a(10) == 0) {
         List<cir> $$0 = this.dS().a(cir.class, this.cO().g(32.0));
         cir $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cir $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.cc = $$1;
      }
   }

   private void a(arg $$0, List<btj> $$1) {
      double $$2 = (this.cm.cO().a + this.cm.cO().d) / 2.0;
      double $$3 = (this.cm.cO().c + this.cm.cO().f) / 2.0;

      for (btj $$4 : $$1) {
         if ($$4 instanceof buf) {
            buf $$5 = (buf)$$4;
            double $$6 = $$4.dx() - $$2;
            double $$7 = $$4.dD() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.j($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.cu.a().a() && $$5.en() < $$4.ag - 2) {
               bsb $$9 = this.dT().b((buf)this);
               $$4.a($$9, 5.0F);
               day.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(List<btj> $$0) {
      for (btj $$1 : $$0) {
         if ($$1 instanceof buf) {
            bsb $$2 = this.dT().b((buf)this);
            $$1.a($$2, 10.0F);
            if (this.dS() instanceof arg $$3) {
               day.a($$3, $$1, $$2);
            }
         }
      }
   }

   private float i(double $$0) {
      return (float)azc.d($$0);
   }

   private boolean b(exz $$0) {
      int $$1 = azc.a($$0.a);
      int $$2 = azc.a($$0.b);
      int $$3 = azc.a($$0.c);
      int $$4 = azc.a($$0.d);
      int $$5 = azc.a($$0.e);
      int $$6 = azc.a($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for (int $$9 = $$1; $$9 <= $$4; $$9++) {
         for (int $$10 = $$2; $$10 <= $$5; $$10++) {
            for (int $$11 = $$3; $$11 <= $$6; $$11++) {
               je $$12 = new je($$9, $$10, $$11);
               dua $$13 = this.dS().a_($$12);
               if (!$$13.l() && !$$13.a(aws.aE)) {
                  if (this.dS().ac().b(ddo.c) && !$$13.a(aws.aD)) {
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

   public boolean a(cip $$0, bsb $$1, float $$2) {
      if (this.cu.a().i() == cji.j) {
         return false;
      } else {
         $$2 = this.cu.a().a($$1, $$2);
         if ($$0 != this.d) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.d() instanceof cnp || $$1.a(awu.y)) {
               float $$3 = this.eA();
               this.g($$1, $$2);
               if (this.eB() && !this.cu.a().a()) {
                  this.x(1.0F);
                  this.cu.a(cji.j);
               }

               if (this.cu.a().a()) {
                  this.cw = this.cw + $$3 - this.eA();
                  if (this.cw > 0.25F * this.eQ()) {
                     this.cw = 0.0F;
                     this.cu.a(cji.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      return !this.dS().B ? this.a(this.cm, $$0, $$1) : false;
   }

   protected boolean g(bsb $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void ar() {
      this.a(btj.c.a);
      this.a(dyx.p);
      if (this.cs != null) {
         this.cs.b(this);
         this.cs.a(this);
      }
   }

   @Override
   protected void eh() {
      if (this.cs != null) {
         this.cs.b(this);
      }

      this.ca++;
      if (this.ca >= 180 && this.ca <= 200) {
         float $$0 = (this.af.i() - 0.5F) * 8.0F;
         float $$1 = (this.af.i() - 0.5F) * 4.0F;
         float $$2 = (this.af.i() - 0.5F) * 8.0F;
         this.dS().a(ln.v, this.dx() + (double)$$0, this.dz() + 2.0 + (double)$$1, this.dD() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.dS().ac().b(ddo.f);
      int $$4 = 500;
      if (this.cs != null && !this.cs.f()) {
         $$4 = 12000;
      }

      if (this.dS() instanceof arg) {
         if (this.ca > 150 && this.ca % 5 == 0 && $$3) {
            btv.a((arg)this.dS(), this.dq(), azc.d((float)$$4 * 0.08F));
         }

         if (this.ca == 1 && !this.ba()) {
            this.dS().b(1028, this.ds(), 0);
         }
      }

      this.a(buj.a, new eye(0.0, 0.1F, 0.0));
      if (this.ca == 200 && this.dS() instanceof arg) {
         if ($$3) {
            btv.a((arg)this.dS(), this.dq(), azc.d((float)$$4 * 0.2F));
         }

         if (this.cs != null) {
            this.cs.a(this);
         }

         this.a(btj.c.a);
         this.a(dyx.p);
      }
   }

   public int y() {
      if (this.cx[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = azc.d(60.0F * azc.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = azc.d(60.0F * azc.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = azc.d(40.0F * azc.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = azc.d(40.0F * azc.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = azc.d(20.0F * azc.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = azc.d(20.0F * azc.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(73, this.dS().a(dzw.a.f, new je($$3, 0, $$4)).v() + $$1);
            this.cx[$$0] = new eqn($$3, $$9, $$4);
         }

         this.cy[0] = 6146;
         this.cy[1] = 8197;
         this.cy[2] = 8202;
         this.cy[3] = 16404;
         this.cy[4] = 32808;
         this.cy[5] = 32848;
         this.cy[6] = 65696;
         this.cy[7] = 131392;
         this.cy[8] = 131712;
         this.cy[9] = 263424;
         this.cy[10] = 526848;
         this.cy[11] = 525313;
         this.cy[12] = 1581057;
         this.cy[13] = 3166214;
         this.cy[14] = 2138120;
         this.cy[15] = 6373424;
         this.cy[16] = 4358208;
         this.cy[17] = 12910976;
         this.cy[18] = 9044480;
         this.cy[19] = 9706496;
         this.cy[20] = 15216640;
         this.cy[21] = 13688832;
         this.cy[22] = 11763712;
         this.cy[23] = 8257536;
      }

      return this.q(this.dx(), this.dz(), this.dD());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      eqn $$5 = new eqn(azc.a($$0), azc.a($$1), azc.a($$2));
      int $$6 = 0;
      if (this.cs == null || this.cs.e() == 0) {
         $$6 = 12;
      }

      for (int $$7 = $$6; $$7 < 24; $$7++) {
         if (this.cx[$$7] != null) {
            float $$8 = this.cx[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public eqp a(int $$0, int $$1, @Nullable eqn $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         eqn $$4 = this.cx[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      eqn $$5 = this.cx[$$0];
      eqn $$6 = this.cx[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cz.a();
      this.cz.a($$5);
      eqn $$7 = $$5;
      int $$8 = 0;
      if (this.cs == null || this.cs.e() == 0) {
         $$8 = 12;
      }

      while (!this.cz.e()) {
         eqn $$9 = this.cz.c();
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
            if (this.cx[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for (int $$12 = $$8; $$12 < 24; $$12++) {
            if ((this.cy[$$10] & 1 << $$12) > 0) {
               eqn $$13 = this.cx[$$12];
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
         cd.debug("Failed to find path from {} to {}", $$0, $$1);
         if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
         }

         return this.a($$5, $$7);
      }
   }

   private eqp a(eqn $$0, eqn $$1) {
      List<eqn> $$2 = Lists.newArrayList();
      eqn $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new eqp($$2, new je($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cu.a().i().b());
      $$0.a("DragonDeathTime", this.ca);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cu.a(cji.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.ca = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dE() {
   }

   public cip[] gk() {
      return this.ck;
   }

   @Override
   public boolean bE() {
      return false;
   }

   @Override
   public awe di() {
      return awe.f;
   }

   @Override
   protected awc w() {
      return awd.ib;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.ig;
   }

   @Override
   protected float fd() {
      return 5.0F;
   }

   public eye J(float $$0) {
      cjc $$1 = this.cu.a();
      cji<? extends cjc> $$2 = $$1.i();
      eye $$8;
      if ($$2 == cji.d || $$2 == cji.e) {
         je $$3 = this.dS().a(dzw.a.f, edb.a(this.ct));
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

   public void a(cir $$0, je $$1, bsb $$2) {
      cnp $$3;
      if ($$2.d() instanceof cnp) {
         $$3 = (cnp)$$2.d();
      } else {
         $$3 = this.dS().a(ce, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.cc) {
         this.a(this.d, this.dT().d($$0, $$3), 10.0F);
      }

      this.cu.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(akg<?> $$0) {
      if (b.equals($$0) && this.dS().B) {
         this.cu.a(cji.a(this.at().a(b)));
      }

      super.a($$0);
   }

   public cjj gl() {
      return this.cu;
   }

   @Nullable
   public dxz gm() {
      return this.cs;
   }

   @Override
   public boolean b(bsq $$0, @Nullable btj $$1) {
      return false;
   }

   @Override
   protected boolean o(btj $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public void a(aca $$0) {
      super.a($$0);
      cip[] $$1 = this.gk();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b());
      }
   }

   @Override
   public boolean c(buf $$0) {
      return $$0.et();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
