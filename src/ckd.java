import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckd extends clm implements clq {
   private static final akk<Integer> b = ako.a(ckd.class, akm.b);
   private static final akk<Integer> c = ako.a(ckd.class, akm.b);
   private static final akk<Integer> d = ako.a(ckd.class, akm.b);
   private static final List<akk<Integer>> e = ImmutableList.of(b, c, d);
   private static final akk<Integer> bY = ako.a(ckd.class, akm.b);
   private static final int bZ = 220;
   private final float[] ca = new float[2];
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final int[] ce = new int[2];
   private final int[] cf = new int[2];
   private int cg;
   private final arj ch = (arj)new arj(this.S_(), bro.a.f, bro.b.a).a(true);
   private static final Predicate<buv> ci = $$0 -> !$$0.aq().a(axd.y) && $$0.fO();
   private static final cfm cj = cfm.a().a(20.0).a(ci);

   public ckd(bug<? extends ckd> $$0, dev $$1) {
      super($$0, $$1);
      this.bP = new cat(this, 10, false);
      this.x(this.eV());
      this.bN = 50;
   }

   @Override
   protected ceh b(dev $$0) {
      cef $$1 = new cef(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void D() {
      this.bS.a(0, new ckd.a());
      this.bS.a(2, new ccs(this, 1.0, 40, 20.0F));
      this.bS.a(5, new cdf(this, 1.0));
      this.bS.a(6, new ccb(this, coh.class, 8.0F));
      this.bS.a(7, new cco(this));
      this.bT.a(1, new cdl(this));
      this.bT.a(2, new cdm<>(this, buv.class, 0, false, false, ci));
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Invul", this.gw());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.b($$0.h("Invul"));
      if (this.am()) {
         this.ch.a(this.S_());
      }
   }

   @Override
   public void b(@Nullable xh $$0) {
      super.b($$0);
      this.ch.a(this.S_());
   }

   @Override
   protected awj w() {
      return awk.CC;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.CF;
   }

   @Override
   protected awj o_() {
      return awk.CE;
   }

   @Override
   public void n_() {
      ezh $$0 = this.dA().d(1.0, 0.6, 1.0);
      if (!this.dX().C && this.c(0) > 0) {
         btz $$1 = this.dX().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dE() < $$1.dE() || !this.gx() && this.dE() < $$1.dE() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new ezh($$0.d, $$2, $$0.f);
            ezh $$3 = new ezh($$1.dC() - this.dC(), 0.0, $$1.dI() - this.dI());
            if ($$3.j() > 9.0) {
               ezh $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.h($$0);
      if ($$0.j() > 0.05) {
         this.v((float)azj.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.n_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cd[$$5] = this.cb[$$5];
         this.cc[$$5] = this.ca[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         btz $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dX().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.s($$6 + 1);
            double $$10 = this.t($$6 + 1);
            double $$11 = this.u($$6 + 1);
            double $$12 = $$8.dC() - $$9;
            double $$13 = $$8.dG() - $$10;
            double $$14 = $$8.dI() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(azj.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(azj.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.ca[$$6] = this.a(this.ca[$$6], $$17, 40.0F);
            this.cb[$$6] = this.a(this.cb[$$6], $$16, 10.0F);
         } else {
            this.cb[$$6] = this.a(this.cb[$$6], this.aU, 10.0F);
         }
      }

      boolean $$18 = this.gx();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.s($$19);
         double $$21 = this.t($$19);
         double $$22 = this.u($$19);
         float $$23 = 0.3F * this.el();
         this.dX().a(lq.ae, $$20 + this.af.k() * (double)$$23, $$21 + this.af.k() * (double)$$23, $$22 + this.af.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dX().A.a(4) == 0) {
            this.dX()
               .a(
                  lj.a(lq.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.af.k() * (double)$$23,
                  $$21 + this.af.k() * (double)$$23,
                  $$22 + this.af.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.gw() > 0) {
         float $$24 = 3.3F * this.el();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dX()
               .a(lj.a(lq.u, 0.7F, 0.7F, 0.9F), this.dC() + this.af.k(), this.dE() + (double)(this.af.i() * $$24), this.dI() + this.af.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void ac() {
      if (this.gw() > 0) {
         int $$0 = this.gw() - 1;
         this.ch.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dX().a(this, this.dC(), this.dG(), this.dI(), 7.0F, false, dev.a.c);
            if (!this.bc()) {
               this.dX().b(1023, this.dx(), 0);
            }
         }

         this.b($$0);
         if (this.ag % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.ac();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ag >= this.ce[$$1 - 1]) {
               this.ce[$$1 - 1] = this.ag + 10 + this.af.a(10);
               if ((this.dX().am() == brv.c || this.dX().am() == brv.d) && this.cf[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = azj.a(this.af, this.dC() - 10.0, this.dC() + 10.0);
                  double $$5 = azj.a(this.af, this.dE() - 5.0, this.dE() + 5.0);
                  double $$6 = azj.a(this.af, this.dI() - 10.0, this.dI() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.cf[$$1 - 1] = 0;
               }

               int $$7 = this.c($$1);
               if ($$7 > 0) {
                  buv $$8 = (buv)this.dX().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((btz)$$8) > 900.0) && this.G($$8)) {
                     this.a($$1 + 1, $$8);
                     this.ce[$$1 - 1] = this.ag + 40 + this.af.a(20);
                     this.cf[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<buv> $$9 = this.dX().a(buv.class, cj, this, this.cS().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     buv $$10 = $$9.get(this.af.a($$9.size()));
                     this.a($$1, $$10.ar());
                  }
               }
            }
         }

         if (this.m() != null) {
            this.a(0, this.m().ar());
         } else {
            this.a(0, 0);
         }

         if (this.cg > 0) {
            this.cg--;
            if (this.cg == 0 && this.dX().ac().b(der.c)) {
               boolean $$11 = false;
               int $$12 = azj.d(this.ds() / 2.0F + 1.0F);
               int $$13 = azj.d(this.dt());

               for (jg $$14 : jg.b(this.dB() - $$12, this.dD(), this.dH() - $$12, this.dB() + $$12, this.dD() + $$13, this.dH() + $$12)) {
                  dvd $$15 = this.dX().a_($$14);
                  if (c($$15)) {
                     $$11 = this.dX().a($$14, true, this) || $$11;
                  }
               }

               if ($$11) {
                  this.dX().a(null, 1022, this.dx(), 0);
               }
            }
         }

         if (this.ag % 20 == 0) {
            this.c(1.0F);
         }

         this.ch.a(this.eG() / this.eV());
      }
   }

   public static boolean c(dvd $$0) {
      return !$$0.l() && !$$0.a(awz.aF);
   }

   @Override
   public void q() {
      this.b(220);
      this.ch.a(0.0F);
      this.x(this.eV() / 3.0F);
   }

   @Override
   public void a(dvd $$0, ezh $$1) {
   }

   @Override
   public void d(arn $$0) {
      super.d($$0);
      this.ch.a($$0);
   }

   @Override
   public void e(arn $$0) {
      super.e($$0);
      this.ch.b($$0);
   }

   private double s(int $$0) {
      if ($$0 <= 0) {
         return this.dC();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azj.b($$1);
         return this.dC() + (double)$$2 * 1.3 * (double)this.el();
      }
   }

   private double t(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dE() + (double)($$1 * this.el());
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.dI();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azj.a($$1);
         return this.dI() + (double)$$2 * 1.3 * (double)this.el();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azj.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, buv $$1) {
      this.a($$0, $$1.dC(), $$1.dE() + (double)$$1.cT() * 0.5, $$1.dI(), $$0 == 0 && this.af.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.bc()) {
         this.dX().a(null, 1024, this.dx(), 0);
      }

      double $$5 = this.s($$0);
      double $$6 = this.t($$0);
      double $$7 = this.u($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      ezh $$11 = new ezh($$8, $$9, $$10);
      cpp $$12 = new cpp(this.dX(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dX().b($$12);
   }

   @Override
   public void a(buv $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(axb.t) || $$0.d() instanceof ckd) {
         return false;
      } else if (this.gw() > 0 && !$$0.a(axb.d)) {
         return false;
      } else {
         if (this.gx()) {
            btz $$2 = $$0.c();
            if ($$2 instanceof cop || $$2 instanceof cpt) {
               return false;
            }
         }

         btz $$3 = $$0.d();
         if ($$3 != null && $$3.aq().a(axd.y)) {
            return false;
         } else {
            if (this.cg <= 0) {
               this.cg = 20;
            }

            for (int $$4 = 0; $$4 < this.cf.length; $$4++) {
               this.cf[$$4] = this.cf[$$4] + 3;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void a(arm $$0, bsp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      ckq $$3 = this.a(cwb.uu);
      if ($$3 != null) {
         $$3.y();
      }
   }

   @Override
   public void dJ() {
      if (this.dX().am() == brv.a && this.aa()) {
         this.au();
      } else {
         this.bc = 0;
      }
   }

   @Override
   public boolean b(bte $$0, @Nullable btz $$1) {
      return false;
   }

   public static bwc.a t() {
      return clm.gB().a(bwd.s, 300.0).a(bwd.v, 0.6F).a(bwd.l, 0.6F).a(bwd.m, 40.0).a(bwd.a, 4.0);
   }

   public float[] y() {
      return this.cb;
   }

   public float[] gv() {
      return this.ca;
   }

   public int gw() {
      return this.am.a(bY);
   }

   public void b(int $$0) {
      this.am.a(bY, $$0);
   }

   public int c(int $$0) {
      return this.am.a(e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.am.a(e.get($$0), $$1);
   }

   public boolean gx() {
      return this.eG() <= this.eV() / 2.0F;
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
   public boolean b(bte $$0) {
      return $$0.a(btg.t) ? false : super.b($$0);
   }

   class a extends cbt {
      public a() {
         this.a(EnumSet.of(cbt.a.a, cbt.a.c, cbt.a.b));
      }

      @Override
      public boolean b() {
         return ckd.this.gw() > 0;
      }
   }
}
