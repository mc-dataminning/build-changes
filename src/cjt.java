import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjt extends bvh implements clo {
   private static final Logger cc = LogUtils.getLogger();
   public static final ajx<Integer> a = akb.a(cjt.class, ajz.b);
   private static final cfw cd = cfw.a().a(64.0);
   private static final int ce = 200;
   private static final int cf = 400;
   private static final float cg = 0.25F;
   private static final String ch = "DragonDeathTime";
   private static final String ci = "DragonPhase";
   public final cjr b = new cjr();
   private final cjq[] cj;
   public final cjq c;
   private final cjq ck;
   private final cjq cl;
   private final cjq cm;
   private final cjq cn;
   private final cjq co;
   private final cjq cp;
   private final cjq cq;
   public float d;
   public float bX;
   public boolean bY;
   public int bZ;
   public float ca;
   @Nullable
   public cjs cb;
   @Nullable
   private eat cr;
   private ji cs = ji.c;
   private final ckk ct;
   private int cu = 100;
   private float cv;
   private final etj[] cw = new etj[24];
   private final int[] cx = new int[24];
   private final eth cy = new eth();

   public cjt(buq<? extends cjt> $$0, dgg $$1) {
      super(buq.P, $$1);
      this.c = new cjq(this, "head", 1.0F, 1.0F);
      this.ck = new cjq(this, "neck", 3.0F, 3.0F);
      this.cl = new cjq(this, "body", 5.0F, 3.0F);
      this.cm = new cjq(this, "tail", 2.0F, 2.0F);
      this.cn = new cjq(this, "tail", 2.0F, 2.0F);
      this.co = new cjq(this, "tail", 2.0F, 2.0F);
      this.cp = new cjq(this, "wing", 4.0F, 2.0F);
      this.cq = new cjq(this, "wing", 4.0F, 2.0F);
      this.cj = new cjq[]{this.c, this.ck, this.cl, this.cm, this.cn, this.co, this.cp, this.cq};
      this.x(this.eS());
      this.ad = true;
      this.ct = new ckk(this);
   }

   public void a(eat $$0) {
      this.cr = $$0;
   }

   @Override
   public void c(ji $$0) {
      this.cs = $$0;
   }

   public ji m() {
      return this.cs;
   }

   public static bwm.a p() {
      return bvh.C().a(bwn.s, 200.0);
   }

   @Override
   public boolean ba() {
      float $$0 = ayy.b(this.bX * (float) (Math.PI * 2));
      float $$1 = ayy.b(this.d * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aZ() {
      if (this.dW().C && !this.bb()) {
         this.dW().a(this.dB(), this.dD(), this.dH(), avz.iy, this.dn(), 5.0F, 0.8F + this.ae.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, ckj.k.b());
   }

   @Override
   public void d_() {
      this.aO();
      if (this.dW().C) {
         this.x(this.eE());
         if (!this.bb() && !this.ct.a().a() && --this.cu < 0) {
            this.dW().a(this.dB(), this.dD(), this.dH(), avz.iz, this.dn(), 2.5F, 0.8F + this.ae.i() * 0.3F, false);
            this.cu = 200 + this.ae.a(200);
         }
      }

      if (this.cr == null && this.dW() instanceof arc $$0) {
         eat $$1 = $$0.F();
         if ($$1 != null && this.cG().equals($$1.i())) {
            this.cr = $$1;
         }
      }

      this.d = this.bX;
      if (this.eF()) {
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         float $$3 = (this.ae.i() - 0.5F) * 4.0F;
         float $$4 = (this.ae.i() - 0.5F) * 8.0F;
         this.dW().a(lt.w, this.dB() + (double)$$2, this.dD() + 2.0 + (double)$$3, this.dH() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.go();
         fay $$5 = this.dz();
         float $$6 = 0.2F / ((float)$$5.i() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.e);
         if (this.ct.a().a()) {
            this.bX += 0.1F;
         } else if (this.bY) {
            this.bX += $$6 * 0.5F;
         } else {
            this.bX += $$6;
         }

         this.v(ayy.h(this.dM()));
         if (this.gc()) {
            this.bX = 0.5F;
         } else {
            this.b.a(this.dD(), this.dM());
            if (this.dW() instanceof arc $$7) {
               ckd $$9 = this.ct.a();
               $$9.a($$7);
               if (this.ct.a() != $$9) {
                  $$9 = this.ct.a();
                  $$9.a($$7);
               }

               fay $$10 = $$9.f();
               if ($$10 != null) {
                  double $$11 = $$10.d - this.dB();
                  double $$12 = $$10.e - this.dD();
                  double $$13 = $$10.f - this.dH();
                  double $$14 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
                  float $$15 = $$9.e();
                  double $$16 = Math.sqrt($$11 * $$11 + $$13 * $$13);
                  if ($$16 > 0.0) {
                     $$12 = ayy.a($$12 / $$16, (double)(-$$15), (double)$$15);
                  }

                  this.h(this.dz().b(0.0, $$12 * 0.01, 0.0));
                  this.v(ayy.h(this.dM()));
                  fay $$17 = $$10.a(this.dB(), this.dD(), this.dH()).d();
                  fay $$18 = new fay((double)ayy.a(this.dM() * (float) (Math.PI / 180.0)), this.dz().e, (double)(-ayy.b(this.dM() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$19 = Math.max(((float)$$18.b($$17) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$11) > 1.0E-5F || Math.abs($$13) > 1.0E-5F) {
                     float $$20 = ayy.a(ayy.h(180.0F - (float)ayy.d($$11, $$13) * (180.0F / (float)Math.PI) - this.dM()), -50.0F, 50.0F);
                     this.ca *= 0.8F;
                     this.ca = this.ca + $$20 * $$9.g();
                     this.v(this.dM() + this.ca * 0.1F);
                  }

                  float $$21 = (float)(2.0 / ($$14 + 1.0));
                  float $$22 = 0.06F;
                  this.a(0.06F * ($$19 * $$21 + (1.0F - $$21)), new fay(0.0, 0.0, -1.0));
                  if (this.bY) {
                     this.a(bvj.a, this.dz().c(0.8F));
                  } else {
                     this.a(bvj.a, this.dz());
                  }

                  fay $$23 = this.dz().d();
                  double $$24 = 0.8 + 0.15 * ($$23.b($$18) + 1.0) / 2.0;
                  this.h(this.dz().d($$24, 0.91F, $$24));
               }
            } else {
               if (this.bq > 0) {
                  this.a(this.bq, this.br, this.bs, this.bt, this.bu, this.bv);
                  this.bq--;
               }

               this.ct.a().b();
            }

            if (!this.dW().B_()) {
               this.aK();
            }

            this.aX = this.dM();
            fay[] $$25 = new fay[this.cj.length];

            for (int $$26 = 0; $$26 < this.cj.length; $$26++) {
               $$25[$$26] = new fay(this.cj[$$26].dB(), this.cj[$$26].dD(), this.cj[$$26].dH());
            }

            float $$27 = (float)(this.b.a(5).a() - this.b.a(10).a()) * 10.0F * (float) (Math.PI / 180.0);
            float $$28 = ayy.b($$27);
            float $$29 = ayy.a($$27);
            float $$30 = this.dM() * (float) (Math.PI / 180.0);
            float $$31 = ayy.a($$30);
            float $$32 = ayy.b($$30);
            this.a(this.cl, (double)($$31 * 0.5F), 0.0, (double)(-$$32 * 0.5F));
            this.a(this.cp, (double)($$32 * 4.5F), 2.0, (double)($$31 * 4.5F));
            this.a(this.cq, (double)($$32 * -4.5F), 2.0, (double)($$31 * -4.5F));
            if (this.dW() instanceof arc $$33 && this.aN == 0) {
               this.a($$33, $$33.a(this, this.cp.cR().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), buo.e));
               this.a($$33, $$33.a(this, this.cq.cR().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), buo.e));
               this.b($$33, $$33.a(this, this.c.cR().g(1.0), buo.e));
               this.b($$33, $$33.a(this, this.ck.cR().g(1.0), buo.e));
            }

            float $$34 = ayy.a(this.dM() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$35 = ayy.b(this.dM() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$36 = this.gn();
            this.a(this.c, (double)($$34 * 6.5F * $$28), (double)($$36 + $$29 * 6.5F), (double)(-$$35 * 6.5F * $$28));
            this.a(this.ck, (double)($$34 * 5.5F * $$28), (double)($$36 + $$29 * 5.5F), (double)(-$$35 * 5.5F * $$28));
            cjr.a $$37 = this.b.a(5);

            for (int $$38 = 0; $$38 < 3; $$38++) {
               cjq $$39 = null;
               if ($$38 == 0) {
                  $$39 = this.cm;
               }

               if ($$38 == 1) {
                  $$39 = this.cn;
               }

               if ($$38 == 2) {
                  $$39 = this.co;
               }

               cjr.a $$40 = this.b.a(12 + $$38 * 2);
               float $$41 = this.dM() * (float) (Math.PI / 180.0) + this.i((double)($$40.b() - $$37.b())) * (float) (Math.PI / 180.0);
               float $$42 = ayy.a($$41);
               float $$43 = ayy.b($$41);
               float $$44 = 1.5F;
               float $$45 = (float)($$38 + 1) * 2.0F;
               this.a(
                  $$39,
                  (double)(-($$31 * 1.5F + $$42 * $$45) * $$28),
                  $$40.a() - $$37.a() - (double)(($$45 + 1.5F) * $$29) + 1.5,
                  (double)(($$32 * 1.5F + $$43 * $$45) * $$28)
               );
            }

            if (this.dW() instanceof arc $$46) {
               this.bY = this.a($$46, this.c.cR()) | this.a($$46, this.ck.cR()) | this.a($$46, this.cl.cR());
               if (this.cr != null) {
                  this.cr.b(this);
               }
            }

            for (int $$47 = 0; $$47 < this.cj.length; $$47++) {
               this.cj[$$47].K = $$25[$$47].d;
               this.cj[$$47].L = $$25[$$47].e;
               this.cj[$$47].M = $$25[$$47].f;
               this.cj[$$47].aa = $$25[$$47].d;
               this.cj[$$47].ab = $$25[$$47].e;
               this.cj[$$47].ac = $$25[$$47].f;
            }
         }
      }
   }

   private void a(cjq $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dB() + $$1, this.dD() + $$2, this.dH() + $$3);
   }

   private float gn() {
      if (this.ct.a().a()) {
         return -1.0F;
      } else {
         cjr.a $$0 = this.b.a(5);
         cjr.a $$1 = this.b.a(0);
         return (float)($$0.a() - $$1.a());
      }
   }

   private void go() {
      if (this.cb != null) {
         if (this.cb.dR()) {
            this.cb = null;
         } else if (this.af % 10 == 0 && this.eE() < this.eS()) {
            this.x(this.eE() + 1.0F);
         }
      }

      if (this.ae.a(10) == 0) {
         List<cjs> $$0 = this.dW().a(cjs.class, this.cR().g(32.0));
         cjs $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (cjs $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.cb = $$1;
      }
   }

   private void a(arc $$0, List<buj> $$1) {
      double $$2 = (this.cl.cR().a + this.cl.cR().d) / 2.0;
      double $$3 = (this.cl.cR().c + this.cl.cR().f) / 2.0;

      for (buj $$4 : $$1) {
         if ($$4 instanceof bvf) {
            bvf $$5 = (bvf)$$4;
            double $$6 = $$4.dB() - $$2;
            double $$7 = $$4.dH() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.j($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.ct.a().a() && $$5.er() < $$4.af - 2) {
               bsz $$9 = this.dX().b((bvf)this);
               $$4.a($$0, $$9, 5.0F);
               dcz.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(arc $$0, List<buj> $$1) {
      for (buj $$2 : $$1) {
         if ($$2 instanceof bvf) {
            bsz $$3 = this.dX().b((bvf)this);
            $$2.a($$0, $$3, 10.0F);
            dcz.a($$0, $$2, $$3);
         }
      }
   }

   private float i(double $$0) {
      return (float)ayy.d($$0);
   }

   private boolean a(arc $$0, fat $$1) {
      int $$2 = ayy.a($$1.a);
      int $$3 = ayy.a($$1.b);
      int $$4 = ayy.a($$1.c);
      int $$5 = ayy.a($$1.d);
      int $$6 = ayy.a($$1.e);
      int $$7 = ayy.a($$1.f);
      boolean $$8 = false;
      boolean $$9 = false;

      for (int $$10 = $$2; $$10 <= $$5; $$10++) {
         for (int $$11 = $$3; $$11 <= $$6; $$11++) {
            for (int $$12 = $$4; $$12 <= $$7; $$12++) {
               ji $$13 = new ji($$10, $$11, $$12);
               dwv $$14 = $$0.a_($$13);
               if (!$$14.l() && !$$14.a(awo.aG)) {
                  if ($$0.O().b(dgc.c) && !$$14.a(awo.aF)) {
                     $$9 = $$0.a($$13, false) || $$9;
                  } else {
                     $$8 = true;
                  }
               }
            }
         }
      }

      if ($$9) {
         ji $$15 = new ji($$2 + this.ae.a($$5 - $$2 + 1), $$3 + this.ae.a($$6 - $$3 + 1), $$4 + this.ae.a($$7 - $$4 + 1));
         $$0.c(2008, $$15, 0);
      }

      return $$8;
   }

   public boolean a(arc $$0, cjq $$1, bsz $$2, float $$3) {
      if (this.ct.a().h() == ckj.j) {
         return false;
      } else {
         $$3 = this.ct.a().a($$2, $$3);
         if ($$1 != this.c) {
            $$3 = $$3 / 4.0F + Math.min($$3, 1.0F);
         }

         if ($$3 < 0.01F) {
            return false;
         } else {
            if ($$2.d() instanceof cov || $$2.a(awq.y)) {
               float $$4 = this.eE();
               this.c($$0, $$2, $$3);
               if (this.eF() && !this.ct.a().a()) {
                  this.x(1.0F);
                  this.ct.a(ckj.j);
               }

               if (this.ct.a().a()) {
                  this.cv = this.cv + $$4 - this.eE();
                  if (this.cv > 0.25F * this.eS()) {
                     this.cv = 0.0F;
                     this.ct.a(ckj.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      return this.a($$0, this.cl, $$1, $$2);
   }

   protected void c(arc $$0, bsz $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }

   @Override
   public void c(arc $$0) {
      this.a(buj.d.a);
      this.a(ebr.p);
      if (this.cr != null) {
         this.cr.b(this);
         this.cr.a(this);
      }
   }

   @Override
   protected void em() {
      if (this.cr != null) {
         this.cr.b(this);
      }

      this.bZ++;
      if (this.bZ >= 180 && this.bZ <= 200) {
         float $$0 = (this.ae.i() - 0.5F) * 8.0F;
         float $$1 = (this.ae.i() - 0.5F) * 4.0F;
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         this.dW().a(lt.v, this.dB() + (double)$$0, this.dD() + 2.0 + (double)$$1, this.dH() + (double)$$2, 0.0, 0.0, 0.0);
      }

      int $$3 = 500;
      if (this.cr != null && !this.cr.f()) {
         $$3 = 12000;
      }

      if (this.dW() instanceof arc $$4) {
         if (this.bZ > 150 && this.bZ % 5 == 0 && $$4.O().b(dgc.f)) {
            buv.a($$4, this.du(), ayy.d((float)$$3 * 0.08F));
         }

         if (this.bZ == 1 && !this.bb()) {
            $$4.b(1028, this.dw(), 0);
         }
      }

      fay $$5 = new fay(0.0, 0.1F, 0.0);
      this.a(bvj.a, $$5);

      for (cjq $$6 : this.cj) {
         $$6.bz();
         $$6.b($$6.du().e($$5));
      }

      if (this.bZ == 200 && this.dW() instanceof arc $$7) {
         if ($$7.O().b(dgc.f)) {
            buv.a($$7, this.du(), ayy.d((float)$$3 * 0.2F));
         }

         if (this.cr != null) {
            this.cr.a(this);
         }

         this.a(buj.d.a);
         this.a(ebr.p);
      }
   }

   public int t() {
      if (this.cw[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = ayy.d(60.0F * ayy.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = ayy.d(60.0F * ayy.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = ayy.d(40.0F * ayy.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = ayy.d(40.0F * ayy.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = ayy.d(20.0F * ayy.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = ayy.d(20.0F * ayy.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(73, this.dW().a(ecq.a.f, new ji($$3, 0, $$4)).v() + $$1);
            this.cw[$$0] = new etj($$3, $$9, $$4);
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

      return this.q(this.dB(), this.dD(), this.dH());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      etj $$5 = new etj(ayy.a($$0), ayy.a($$1), ayy.a($$2));
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
   public etl a(int $$0, int $$1, @Nullable etj $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         etj $$4 = this.cw[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      etj $$5 = this.cw[$$0];
      etj $$6 = this.cw[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cy.a();
      this.cy.a($$5);
      etj $$7 = $$5;
      int $$8 = 0;
      if (this.cr == null || this.cr.e() == 0) {
         $$8 = 12;
      }

      while (!this.cy.e()) {
         etj $$9 = this.cy.c();
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
               etj $$13 = this.cw[$$12];
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

   private etl a(etj $$0, etj $$1) {
      List<etj> $$2 = Lists.newArrayList();
      etj $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new etl($$2, new ji($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.ct.a().h().b());
      $$0.a("DragonDeathTime", this.bZ);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.ct.a(ckj.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bZ = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dI() {
   }

   public cjq[] x() {
      return this.cj;
   }

   @Override
   public boolean bH() {
      return false;
   }

   @Override
   public awa dn() {
      return awa.f;
   }

   @Override
   protected avy u() {
      return avz.iv;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.iA;
   }

   @Override
   protected float fg() {
      return 5.0F;
   }

   public fay J(float $$0) {
      ckd $$1 = this.ct.a();
      ckj<? extends ckd> $$2 = $$1.h();
      fay $$8;
      if ($$2 == ckj.d || $$2 == ckj.e) {
         ji $$3 = this.dW().a(ecq.a.f, efv.a(this.cs));
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.du())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.dO();
         float $$7 = 1.5F;
         this.w(-$$5 * 1.5F * 5.0F);
         $$8 = this.g($$0);
         this.w($$6);
      } else if ($$1.a()) {
         float $$9 = this.dO();
         float $$10 = 1.5F;
         this.w(-45.0F);
         $$8 = this.g($$0);
         this.w($$9);
      } else {
         $$8 = this.g($$0);
      }

      return $$8;
   }

   public void a(arc $$0, cjs $$1, ji $$2, bsz $$3) {
      cov $$4;
      if ($$3.d() instanceof cov) {
         $$4 = (cov)$$3.d();
      } else {
         $$4 = $$0.a(cd, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
      }

      if ($$1 == this.cb) {
         this.a($$0, this.c, this.dX().d($$1, $$4), 10.0F);
      }

      this.ct.a().a($$1, $$2, $$3, $$4);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (a.equals($$0) && this.dW().C) {
         this.ct.a(ckj.a(this.au().a(a)));
      }

      super.a($$0);
   }

   public ckk gl() {
      return this.ct;
   }

   @Nullable
   public eat gm() {
      return this.cr;
   }

   @Override
   public boolean b(bto $$0, @Nullable buj $$1) {
      return false;
   }

   @Override
   protected boolean o(buj $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      cjq[] $$1 = this.x();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b() + 1);
      }
   }

   @Override
   public boolean c(bvf $$0) {
      return $$0.ex();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
