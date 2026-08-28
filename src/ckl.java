import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckl extends bvz implements cmg {
   private static final Logger cd = LogUtils.getLogger();
   public static final aks<Integer> a = akw.a(ckl.class, aku.b);
   private static final cgo ce = cgo.a().a(64.0);
   private static final int cf = 200;
   private static final int cg = 400;
   private static final float ch = 0.25F;
   private static final String ci = "DragonDeathTime";
   private static final String cj = "DragonPhase";
   public final ckj b = new ckj();
   private final cki[] ck;
   public final cki c;
   private final cki cl;
   private final cki cm;
   private final cki cn;
   private final cki co;
   private final cki cp;
   private final cki cq;
   private final cki cr;
   public float d;
   public float bY;
   public boolean bZ;
   public int ca;
   public float cb;
   @Nullable
   public ckk cc;
   @Nullable
   private ebm cs;
   private jh ct = jh.c;
   private final clc cu;
   private int cv = 100;
   private float cw;
   private final euc[] cx = new euc[24];
   private final int[] cy = new int[24];
   private final eua cz = new eua();

   public ckl(bvi<? extends ckl> $$0, dgz $$1) {
      super(bvi.Q, $$1);
      this.c = new cki(this, "head", 1.0F, 1.0F);
      this.cl = new cki(this, "neck", 3.0F, 3.0F);
      this.cm = new cki(this, "body", 5.0F, 3.0F);
      this.cn = new cki(this, "tail", 2.0F, 2.0F);
      this.co = new cki(this, "tail", 2.0F, 2.0F);
      this.cp = new cki(this, "tail", 2.0F, 2.0F);
      this.cq = new cki(this, "wing", 4.0F, 2.0F);
      this.cr = new cki(this, "wing", 4.0F, 2.0F);
      this.ck = new cki[]{this.c, this.cl, this.cm, this.cn, this.co, this.cp, this.cq, this.cr};
      this.x(this.eS());
      this.ad = true;
      this.cu = new clc(this);
   }

   public void a(ebm $$0) {
      this.cs = $$0;
   }

   @Override
   public void c(jh $$0) {
      this.ct = $$0;
   }

   public jh m() {
      return this.ct;
   }

   public static bxe.a p() {
      return bvz.C().a(bxf.s, 200.0);
   }

   @Override
   public boolean ba() {
      float $$0 = azu.b(this.bY * (float) (Math.PI * 2));
      float $$1 = azu.b(this.d * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aZ() {
      if (this.dW().C && !this.bb()) {
         this.dW().a(this.dB(), this.dD(), this.dH(), awv.iy, this.dn(), 5.0F, 0.8F + this.ae.i() * 0.3F, false);
      }
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(a, clb.k.b());
   }

   @Override
   public void d_() {
      this.aO();
      if (this.dW().C) {
         this.x(this.eE());
         if (!this.bb() && !this.cu.a().a() && --this.cv < 0) {
            this.dW().a(this.dB(), this.dD(), this.dH(), awv.iz, this.dn(), 2.5F, 0.8F + this.ae.i() * 0.3F, false);
            this.cv = 200 + this.ae.a(200);
         }
      }

      if (this.cs == null && this.dW() instanceof arx $$0) {
         ebm $$1 = $$0.F();
         if ($$1 != null && this.cG().equals($$1.i())) {
            this.cs = $$1;
         }
      }

      this.d = this.bY;
      if (this.eF()) {
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         float $$3 = (this.ae.i() - 0.5F) * 4.0F;
         float $$4 = (this.ae.i() - 0.5F) * 8.0F;
         this.dW().a(ls.w, this.dB() + (double)$$2, this.dD() + 2.0 + (double)$$3, this.dH() + (double)$$4, 0.0, 0.0, 0.0);
      } else {
         this.gn();
         fbr $$5 = this.dz();
         float $$6 = 0.2F / ((float)$$5.i() * 10.0F + 1.0F);
         $$6 *= (float)Math.pow(2.0, $$5.e);
         if (this.cu.a().a()) {
            this.bY += 0.1F;
         } else if (this.bZ) {
            this.bY += $$6 * 0.5F;
         } else {
            this.bY += $$6;
         }

         this.v(azu.h(this.dM()));
         if (this.gb()) {
            this.bY = 0.5F;
         } else {
            this.b.a(this.dD(), this.dM());
            if (this.dW() instanceof arx $$7) {
               ckv $$9 = this.cu.a();
               $$9.a($$7);
               if (this.cu.a() != $$9) {
                  $$9 = this.cu.a();
                  $$9.a($$7);
               }

               fbr $$10 = $$9.f();
               if ($$10 != null) {
                  double $$11 = $$10.d - this.dB();
                  double $$12 = $$10.e - this.dD();
                  double $$13 = $$10.f - this.dH();
                  double $$14 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
                  float $$15 = $$9.e();
                  double $$16 = Math.sqrt($$11 * $$11 + $$13 * $$13);
                  if ($$16 > 0.0) {
                     $$12 = azu.a($$12 / $$16, (double)(-$$15), (double)$$15);
                  }

                  this.h(this.dz().b(0.0, $$12 * 0.01, 0.0));
                  this.v(azu.h(this.dM()));
                  fbr $$17 = $$10.a(this.dB(), this.dD(), this.dH()).d();
                  fbr $$18 = new fbr((double)azu.a(this.dM() * (float) (Math.PI / 180.0)), this.dz().e, (double)(-azu.b(this.dM() * (float) (Math.PI / 180.0))))
                     .d();
                  float $$19 = Math.max(((float)$$18.b($$17) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$11) > 1.0E-5F || Math.abs($$13) > 1.0E-5F) {
                     float $$20 = azu.a(azu.h(180.0F - (float)azu.d($$11, $$13) * (180.0F / (float)Math.PI) - this.dM()), -50.0F, 50.0F);
                     this.cb *= 0.8F;
                     this.cb = this.cb + $$20 * $$9.g();
                     this.v(this.dM() + this.cb * 0.1F);
                  }

                  float $$21 = (float)(2.0 / ($$14 + 1.0));
                  float $$22 = 0.06F;
                  this.a(0.06F * ($$19 * $$21 + (1.0F - $$21)), new fbr(0.0, 0.0, -1.0));
                  if (this.bZ) {
                     this.a(bwb.a, this.dz().c(0.8F));
                  } else {
                     this.a(bwb.a, this.dz());
                  }

                  fbr $$23 = this.dz().d();
                  double $$24 = 0.8 + 0.15 * ($$23.b($$18) + 1.0) / 2.0;
                  this.h(this.dz().d($$24, 0.91F, $$24));
               }
            } else {
               if (this.br > 0) {
                  this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
                  this.br--;
               }

               this.cu.a().b();
            }

            if (!this.dW().B_()) {
               this.aK();
            }

            this.aX = this.dM();
            fbr[] $$25 = new fbr[this.ck.length];

            for (int $$26 = 0; $$26 < this.ck.length; $$26++) {
               $$25[$$26] = new fbr(this.ck[$$26].dB(), this.ck[$$26].dD(), this.ck[$$26].dH());
            }

            float $$27 = (float)(this.b.a(5).a() - this.b.a(10).a()) * 10.0F * (float) (Math.PI / 180.0);
            float $$28 = azu.b($$27);
            float $$29 = azu.a($$27);
            float $$30 = this.dM() * (float) (Math.PI / 180.0);
            float $$31 = azu.a($$30);
            float $$32 = azu.b($$30);
            this.a(this.cm, (double)($$31 * 0.5F), 0.0, (double)(-$$32 * 0.5F));
            this.a(this.cq, (double)($$32 * 4.5F), 2.0, (double)($$31 * 4.5F));
            this.a(this.cr, (double)($$32 * -4.5F), 2.0, (double)($$31 * -4.5F));
            if (this.dW() instanceof arx $$33 && this.aN == 0) {
               this.a($$33, $$33.a(this, this.cq.cR().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bvg.e));
               this.a($$33, $$33.a(this, this.cr.cR().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bvg.e));
               this.b($$33, $$33.a(this, this.c.cR().g(1.0), bvg.e));
               this.b($$33, $$33.a(this, this.cl.cR().g(1.0), bvg.e));
            }

            float $$34 = azu.a(this.dM() * (float) (Math.PI / 180.0) - this.cb * 0.01F);
            float $$35 = azu.b(this.dM() * (float) (Math.PI / 180.0) - this.cb * 0.01F);
            float $$36 = this.gm();
            this.a(this.c, (double)($$34 * 6.5F * $$28), (double)($$36 + $$29 * 6.5F), (double)(-$$35 * 6.5F * $$28));
            this.a(this.cl, (double)($$34 * 5.5F * $$28), (double)($$36 + $$29 * 5.5F), (double)(-$$35 * 5.5F * $$28));
            ckj.a $$37 = this.b.a(5);

            for (int $$38 = 0; $$38 < 3; $$38++) {
               cki $$39 = null;
               if ($$38 == 0) {
                  $$39 = this.cn;
               }

               if ($$38 == 1) {
                  $$39 = this.co;
               }

               if ($$38 == 2) {
                  $$39 = this.cp;
               }

               ckj.a $$40 = this.b.a(12 + $$38 * 2);
               float $$41 = this.dM() * (float) (Math.PI / 180.0) + this.i((double)($$40.b() - $$37.b())) * (float) (Math.PI / 180.0);
               float $$42 = azu.a($$41);
               float $$43 = azu.b($$41);
               float $$44 = 1.5F;
               float $$45 = (float)($$38 + 1) * 2.0F;
               this.a(
                  $$39,
                  (double)(-($$31 * 1.5F + $$42 * $$45) * $$28),
                  $$40.a() - $$37.a() - (double)(($$45 + 1.5F) * $$29) + 1.5,
                  (double)(($$32 * 1.5F + $$43 * $$45) * $$28)
               );
            }

            if (this.dW() instanceof arx $$46) {
               this.bZ = this.a($$46, this.c.cR()) | this.a($$46, this.cl.cR()) | this.a($$46, this.cm.cR());
               if (this.cs != null) {
                  this.cs.b(this);
               }
            }

            for (int $$47 = 0; $$47 < this.ck.length; $$47++) {
               this.ck[$$47].K = $$25[$$47].d;
               this.ck[$$47].L = $$25[$$47].e;
               this.ck[$$47].M = $$25[$$47].f;
               this.ck[$$47].aa = $$25[$$47].d;
               this.ck[$$47].ab = $$25[$$47].e;
               this.ck[$$47].ac = $$25[$$47].f;
            }
         }
      }
   }

   private void a(cki $$0, double $$1, double $$2, double $$3) {
      $$0.a_(this.dB() + $$1, this.dD() + $$2, this.dH() + $$3);
   }

   private float gm() {
      if (this.cu.a().a()) {
         return -1.0F;
      } else {
         ckj.a $$0 = this.b.a(5);
         ckj.a $$1 = this.b.a(0);
         return (float)($$0.a() - $$1.a());
      }
   }

   private void gn() {
      if (this.cc != null) {
         if (this.cc.dR()) {
            this.cc = null;
         } else if (this.af % 10 == 0 && this.eE() < this.eS()) {
            this.x(this.eE() + 1.0F);
         }
      }

      if (this.ae.a(10) == 0) {
         List<ckk> $$0 = this.dW().a(ckk.class, this.cR().g(32.0));
         ckk $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for (ckk $$3 : $$0) {
            double $$4 = $$3.g(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.cc = $$1;
      }
   }

   private void a(arx $$0, List<bvb> $$1) {
      double $$2 = (this.cm.cR().a + this.cm.cR().d) / 2.0;
      double $$3 = (this.cm.cR().c + this.cm.cR().f) / 2.0;

      for (bvb $$4 : $$1) {
         if ($$4 instanceof bvx) {
            bvx $$5 = (bvx)$$4;
            double $$6 = $$4.dB() - $$2;
            double $$7 = $$4.dH() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.j($$6 / $$8 * 4.0, 0.2F, $$7 / $$8 * 4.0);
            if (!this.cu.a().a() && $$5.er() < $$4.af - 2) {
               btr $$9 = this.dX().b((bvx)this);
               $$4.a($$0, $$9, 5.0F);
               dds.a($$0, $$4, $$9);
            }
         }
      }
   }

   private void b(arx $$0, List<bvb> $$1) {
      for (bvb $$2 : $$1) {
         if ($$2 instanceof bvx) {
            btr $$3 = this.dX().b((bvx)this);
            $$2.a($$0, $$3, 10.0F);
            dds.a($$0, $$2, $$3);
         }
      }
   }

   private float i(double $$0) {
      return (float)azu.d($$0);
   }

   private boolean a(arx $$0, fbm $$1) {
      int $$2 = azu.a($$1.a);
      int $$3 = azu.a($$1.b);
      int $$4 = azu.a($$1.c);
      int $$5 = azu.a($$1.d);
      int $$6 = azu.a($$1.e);
      int $$7 = azu.a($$1.f);
      boolean $$8 = false;
      boolean $$9 = false;

      for (int $$10 = $$2; $$10 <= $$5; $$10++) {
         for (int $$11 = $$3; $$11 <= $$6; $$11++) {
            for (int $$12 = $$4; $$12 <= $$7; $$12++) {
               jh $$13 = new jh($$10, $$11, $$12);
               dxo $$14 = $$0.a_($$13);
               if (!$$14.l() && !$$14.a(axk.aG)) {
                  if ($$0.O().b(dgv.c) && !$$14.a(axk.aF)) {
                     $$9 = $$0.a($$13, false) || $$9;
                  } else {
                     $$8 = true;
                  }
               }
            }
         }
      }

      if ($$9) {
         jh $$15 = new jh($$2 + this.ae.a($$5 - $$2 + 1), $$3 + this.ae.a($$6 - $$3 + 1), $$4 + this.ae.a($$7 - $$4 + 1));
         $$0.c(2008, $$15, 0);
      }

      return $$8;
   }

   public boolean a(arx $$0, cki $$1, btr $$2, float $$3) {
      if (this.cu.a().h() == clb.j) {
         return false;
      } else {
         $$3 = this.cu.a().a($$2, $$3);
         if ($$1 != this.c) {
            $$3 = $$3 / 4.0F + Math.min($$3, 1.0F);
         }

         if ($$3 < 0.01F) {
            return false;
         } else {
            if ($$2.d() instanceof cpo || $$2.a(axm.y)) {
               float $$4 = this.eE();
               this.c($$0, $$2, $$3);
               if (this.eF() && !this.cu.a().a()) {
                  this.x(1.0F);
                  this.cu.a(clb.j);
               }

               if (this.cu.a().a()) {
                  this.cw = this.cw + $$4 - this.eE();
                  if (this.cw > 0.25F * this.eS()) {
                     this.cw = 0.0F;
                     this.cu.a(clb.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      return this.a($$0, this.cm, $$1, $$2);
   }

   protected void c(arx $$0, btr $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }

   @Override
   public void c(arx $$0) {
      this.a(bvb.d.a);
      this.a(eck.p);
      if (this.cs != null) {
         this.cs.b(this);
         this.cs.a(this);
      }
   }

   @Override
   protected void em() {
      if (this.cs != null) {
         this.cs.b(this);
      }

      this.ca++;
      if (this.ca >= 180 && this.ca <= 200) {
         float $$0 = (this.ae.i() - 0.5F) * 8.0F;
         float $$1 = (this.ae.i() - 0.5F) * 4.0F;
         float $$2 = (this.ae.i() - 0.5F) * 8.0F;
         this.dW().a(ls.v, this.dB() + (double)$$0, this.dD() + 2.0 + (double)$$1, this.dH() + (double)$$2, 0.0, 0.0, 0.0);
      }

      int $$3 = 500;
      if (this.cs != null && !this.cs.f()) {
         $$3 = 12000;
      }

      if (this.dW() instanceof arx $$4) {
         if (this.ca > 150 && this.ca % 5 == 0 && $$4.O().b(dgv.f)) {
            bvn.a($$4, this.du(), azu.d((float)$$3 * 0.08F));
         }

         if (this.ca == 1 && !this.bb()) {
            $$4.b(1028, this.dw(), 0);
         }
      }

      this.a(bwb.a, new fbr(0.0, 0.1F, 0.0));
      if (this.ca == 200 && this.dW() instanceof arx $$5) {
         if ($$5.O().b(dgv.f)) {
            bvn.a($$5, this.du(), azu.d((float)$$3 * 0.2F));
         }

         if (this.cs != null) {
            this.cs.a(this);
         }

         this.a(bvb.d.a);
         this.a(eck.p);
      }
   }

   public int t() {
      if (this.cx[0] == null) {
         for (int $$0 = 0; $$0 < 24; $$0++) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = azu.d(60.0F * azu.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = azu.d(60.0F * azu.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = azu.d(40.0F * azu.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = azu.d(40.0F * azu.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = azu.d(20.0F * azu.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = azu.d(20.0F * azu.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(73, this.dW().a(edj.a.f, new jh($$3, 0, $$4)).v() + $$1);
            this.cx[$$0] = new euc($$3, $$9, $$4);
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

      return this.q(this.dB(), this.dD(), this.dH());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      euc $$5 = new euc(azu.a($$0), azu.a($$1), azu.a($$2));
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
   public eue a(int $$0, int $$1, @Nullable euc $$2) {
      for (int $$3 = 0; $$3 < 24; $$3++) {
         euc $$4 = this.cx[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      euc $$5 = this.cx[$$0];
      euc $$6 = this.cx[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cz.a();
      this.cz.a($$5);
      euc $$7 = $$5;
      int $$8 = 0;
      if (this.cs == null || this.cs.e() == 0) {
         $$8 = 12;
      }

      while (!this.cz.e()) {
         euc $$9 = this.cz.c();
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
               euc $$13 = this.cx[$$12];
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

   private eue a(euc $$0, euc $$1) {
      List<euc> $$2 = Lists.newArrayList();
      euc $$3 = $$1;
      $$2.add(0, $$1);

      while ($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new eue($$2, new jh($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cu.a().h().b());
      $$0.a("DragonDeathTime", this.ca);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cu.a(clb.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.ca = $$0.h("DragonDeathTime");
      }
   }

   @Override
   public void dI() {
   }

   public cki[] x() {
      return this.ck;
   }

   @Override
   public boolean bH() {
      return false;
   }

   @Override
   public aww dn() {
      return aww.f;
   }

   @Override
   protected awu u() {
      return awv.iv;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.iA;
   }

   @Override
   protected float fg() {
      return 5.0F;
   }

   public fbr J(float $$0) {
      ckv $$1 = this.cu.a();
      clb<? extends ckv> $$2 = $$1.h();
      fbr $$8;
      if ($$2 == clb.d || $$2 == clb.e) {
         jh $$3 = this.dW().a(edj.a.f, ego.a(this.ct));
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

   public void a(arx $$0, ckk $$1, jh $$2, btr $$3) {
      cpo $$4;
      if ($$3.d() instanceof cpo) {
         $$4 = (cpo)$$3.d();
      } else {
         $$4 = $$0.a(ce, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
      }

      if ($$1 == this.cc) {
         this.a($$0, this.c, this.dX().d($$1, $$4), 10.0F);
      }

      this.cu.a().a($$1, $$2, $$3, $$4);
   }

   @Override
   public void a(aks<?> $$0) {
      if (a.equals($$0) && this.dW().C) {
         this.cu.a(clb.a(this.au().a(a)));
      }

      super.a($$0);
   }

   public clc gk() {
      return this.cu;
   }

   @Nullable
   public ebm gl() {
      return this.cs;
   }

   @Override
   public boolean b(bug $$0, @Nullable bvb $$1) {
      return false;
   }

   @Override
   protected boolean o(bvb $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public void a(ach $$0) {
      super.a($$0);
      cki[] $$1 = this.x();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2].e($$2 + $$0.b() + 1);
      }
   }

   @Override
   public boolean c(bvx $$0) {
      return $$0.ex();
   }

   @Override
   protected float b(float $$0) {
      return 1.0F;
   }
}
