import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cko extends clx implements cmb {
   private static final ajx<Integer> a = akb.a(cko.class, ajz.b);
   private static final ajx<Integer> b = akb.a(cko.class, ajz.b);
   private static final ajx<Integer> c = akb.a(cko.class, ajz.b);
   private static final List<ajx<Integer>> d = ImmutableList.of(a, b, c);
   private static final ajx<Integer> bY = akb.a(cko.class, ajz.b);
   private static final int bZ = 220;
   private final float[] ca = new float[2];
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final int[] ce = new int[2];
   private final int[] cf = new int[2];
   private int cg;
   private final aqy ch = (aqy)new aqy(this.p_(), brz.a.f, brz.b.a).a(true);
   private static final cfx.a ci = ($$0, $$1) -> !$$0.aq().a(awt.y) && $$0.fM();
   private static final cfx cj = cfx.a().a(20.0).a(ci);

   public cko(bur<? extends cko> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new cbe(this, 10, false);
      this.x(this.eS());
      this.bN = 50;
   }

   @Override
   protected ces b(dgi $$0) {
      ceq $$1 = new ceq(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   protected void B() {
      this.bS.a(0, new cko.a());
      this.bS.a(2, new cdd(this, 1.0, 40, 20.0F));
      this.bS.a(5, new cdq(this, 1.0));
      this.bS.a(6, new ccm(this, cox.class, 8.0F));
      this.bS.a(7, new ccz(this));
      this.bT.a(1, new cdw(this));
      this.bT.a(2, new cdx<>(this, bvg.class, 0, false, false, ci));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, 0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Invul", this.gp());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.b($$0.h("Invul"));
      if (this.l_()) {
         this.ch.a(this.p_());
      }
   }

   @Override
   public void b(@Nullable wo $$0) {
      super.b($$0);
      this.ch.a(this.p_());
   }

   @Override
   protected avz u() {
      return awa.Dn;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.Dq;
   }

   @Override
   protected avz o_() {
      return awa.Dp;
   }

   @Override
   public void d_() {
      fba $$0 = this.dz().d(1.0, 0.6, 1.0);
      if (!this.dW().C && this.c(0) > 0) {
         buk $$1 = this.dW().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dD() < $$1.dD() || !this.gq() && this.dD() < $$1.dD() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new fba($$0.d, $$2, $$0.f);
            fba $$3 = new fba($$1.dB() - this.dB(), 0.0, $$1.dH() - this.dH());
            if ($$3.j() > 9.0) {
               fba $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.h($$0);
      if ($$0.j() > 0.05) {
         this.v((float)ayz.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.d_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cd[$$5] = this.cb[$$5];
         this.cc[$$5] = this.ca[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         buk $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dW().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.r($$6 + 1);
            double $$10 = this.s($$6 + 1);
            double $$11 = this.t($$6 + 1);
            double $$12 = $$8.dB() - $$9;
            double $$13 = $$8.dF() - $$10;
            double $$14 = $$8.dH() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(ayz.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(ayz.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.ca[$$6] = this.a(this.ca[$$6], $$17, 40.0F);
            this.cb[$$6] = this.a(this.cb[$$6], $$16, 10.0F);
         } else {
            this.cb[$$6] = this.a(this.cb[$$6], this.aX, 10.0F);
         }
      }

      boolean $$18 = this.gq();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.r($$19);
         double $$21 = this.s($$19);
         double $$22 = this.t($$19);
         float $$23 = 0.3F * this.ek();
         this.dW().a(lt.ag, $$20 + this.ae.k() * (double)$$23, $$21 + this.ae.k() * (double)$$23, $$22 + this.ae.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dW().A.a(4) == 0) {
            this.dW()
               .a(
                  lm.a(lt.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.ae.k() * (double)$$23,
                  $$21 + this.ae.k() * (double)$$23,
                  $$22 + this.ae.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.gp() > 0) {
         float $$24 = 3.3F * this.ek();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dW()
               .a(lm.a(lt.u, 0.7F, 0.7F, 0.9F), this.dB() + this.ae.k(), this.dD() + (double)(this.ae.i() * $$24), this.dH() + this.ae.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(arc $$0) {
      if (this.gp() > 0) {
         int $$1 = this.gp() - 1;
         this.ch.a(1.0F - (float)$$1 / 220.0F);
         if ($$1 <= 0) {
            $$0.a(this, this.dB(), this.dF(), this.dH(), 7.0F, false, dgi.a.c);
            if (!this.bb()) {
               $$0.b(1023, this.dw(), 0);
            }
         }

         this.b($$1);
         if (this.af % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.a($$0);

         for (int $$2 = 1; $$2 < 3; $$2++) {
            if (this.af >= this.ce[$$2 - 1]) {
               this.ce[$$2 - 1] = this.af + 10 + this.ae.a(10);
               if (($$0.am() == bsg.c || $$0.am() == bsg.d) && this.cf[$$2 - 1]++ > 15) {
                  float $$3 = 10.0F;
                  float $$4 = 5.0F;
                  double $$5 = ayz.a(this.ae, this.dB() - 10.0, this.dB() + 10.0);
                  double $$6 = ayz.a(this.ae, this.dD() - 5.0, this.dD() + 5.0);
                  double $$7 = ayz.a(this.ae, this.dH() - 10.0, this.dH() + 10.0);
                  this.a($$2 + 1, $$5, $$6, $$7, true);
                  this.cf[$$2 - 1] = 0;
               }

               int $$8 = this.c($$2);
               if ($$8 > 0) {
                  bvg $$9 = (bvg)$$0.a($$8);
                  if ($$9 != null && this.c($$9) && !(this.g((buk)$$9) > 900.0) && this.E($$9)) {
                     this.a($$2 + 1, $$9);
                     this.ce[$$2 - 1] = this.af + 40 + this.ae.a(20);
                     this.cf[$$2 - 1] = 0;
                  } else {
                     this.a($$2, 0);
                  }
               } else {
                  List<bvg> $$10 = $$0.a(bvg.class, cj, this, this.cR().c(20.0, 8.0, 20.0));
                  if (!$$10.isEmpty()) {
                     bvg $$11 = $$10.get(this.ae.a($$10.size()));
                     this.a($$2, $$11.ar());
                  }
               }
            }
         }

         if (this.O_() != null) {
            this.a(0, this.O_().ar());
         } else {
            this.a(0, 0);
         }

         if (this.cg > 0) {
            this.cg--;
            if (this.cg == 0 && $$0.O().b(dge.c)) {
               boolean $$12 = false;
               int $$13 = ayz.d(this.dr() / 2.0F + 1.0F);
               int $$14 = ayz.d(this.ds());

               for (ji $$15 : ji.b(this.dA() - $$13, this.dC(), this.dG() - $$13, this.dA() + $$13, this.dC() + $$14, this.dG() + $$13)) {
                  dwx $$16 = $$0.a_($$15);
                  if (c($$16)) {
                     $$12 = $$0.a($$15, true, this) || $$12;
                  }
               }

               if ($$12) {
                  $$0.a(null, 1022, this.dw(), 0);
               }
            }
         }

         if (this.af % 20 == 0) {
            this.c(1.0F);
         }

         this.ch.a(this.eE() / this.eS());
      }
   }

   public static boolean c(dwx $$0) {
      return !$$0.l() && !$$0.a(awp.aH);
   }

   @Override
   public void m() {
      this.b(220);
      this.ch.a(0.0F);
      this.x(this.eS() / 3.0F);
   }

   @Override
   public void a(dwx $$0, fba $$1) {
   }

   @Override
   public void d(ard $$0) {
      super.d($$0);
      this.ch.a($$0);
   }

   @Override
   public void e(ard $$0) {
      super.e($$0);
      this.ch.b($$0);
   }

   private double r(int $$0) {
      if ($$0 <= 0) {
         return this.dB();
      } else {
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ayz.b($$1);
         return this.dB() + (double)$$2 * 1.3 * (double)this.ek();
      }
   }

   private double s(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dD() + (double)($$1 * this.ek());
   }

   private double t(int $$0) {
      if ($$0 <= 0) {
         return this.dH();
      } else {
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ayz.a($$1);
         return this.dH() + (double)$$2 * 1.3 * (double)this.ek();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ayz.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bvg $$1) {
      this.a($$0, $$1.dB(), $$1.dD() + (double)$$1.cS() * 0.5, $$1.dH(), $$0 == 0 && this.ae.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.bb()) {
         this.dW().a(null, 1024, this.dw(), 0);
      }

      double $$5 = this.r($$0);
      double $$6 = this.s($$0);
      double $$7 = this.t($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      fba $$11 = new fba($$8, $$9, $$10);
      cqe $$12 = new cqe(this.dW(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dW().b($$12);
   }

   @Override
   public void a(bvg $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if ($$1.a(awr.t) || $$1.d() instanceof cko) {
         return false;
      } else if (this.gp() > 0 && !$$1.a(awr.d)) {
         return false;
      } else {
         if (this.gq()) {
            buk $$3 = $$1.c();
            if ($$3 instanceof cpe || $$3 instanceof cqi) {
               return false;
            }
         }

         buk $$4 = $$1.d();
         if ($$4 != null && $$4.aq().a(awt.y)) {
            return false;
         } else {
            if (this.cg <= 0) {
               this.cg = 20;
            }

            for (int $$5 = 0; $$5 < this.cf.length; $$5++) {
               this.cf[$$5] = this.cf[$$5] + 3;
            }

            return super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(arc $$0, bta $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      clb $$3 = this.a($$0, cwt.vr);
      if ($$3 != null) {
         $$3.x();
      }
   }

   @Override
   public void dI() {
      if (this.dW().am() == bsg.a && this.Y()) {
         this.at();
      } else {
         this.bf = 0;
      }
   }

   @Override
   public boolean b(btp $$0, @Nullable buk $$1) {
      return false;
   }

   public static bwn.a p() {
      return clx.gu().a(bwo.s, 300.0).a(bwo.v, 0.6F).a(bwo.l, 0.6F).a(bwo.m, 40.0).a(bwo.a, 4.0);
   }

   public float[] t() {
      return this.cb;
   }

   public float[] x() {
      return this.ca;
   }

   public int gp() {
      return this.al.a(bY);
   }

   public void b(int $$0) {
      this.al.a(bY, $$0);
   }

   public int c(int $$0) {
      return this.al.a(d.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.al.a(d.get($$0), $$1);
   }

   public boolean gq() {
      return this.eE() <= this.eS() / 2.0F;
   }

   @Override
   protected boolean o(buk $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(btp $$0) {
      return $$0.a(btr.t) ? false : super.b($$0);
   }

   class a extends cce {
      public a() {
         this.a(EnumSet.of(cce.a.a, cce.a.c, cce.a.b));
      }

      @Override
      public boolean b() {
         return cko.this.gp() > 0;
      }
   }
}
