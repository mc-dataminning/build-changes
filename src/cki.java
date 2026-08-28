import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cki extends clr implements clv {
   private static final akl<Integer> b = akp.a(cki.class, akn.b);
   private static final akl<Integer> c = akp.a(cki.class, akn.b);
   private static final akl<Integer> d = akp.a(cki.class, akn.b);
   private static final List<akl<Integer>> e = ImmutableList.of(b, c, d);
   private static final akl<Integer> bY = akp.a(cki.class, akn.b);
   private static final int bZ = 220;
   private final float[] ca = new float[2];
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final float[] cd = new float[2];
   private final int[] ce = new int[2];
   private final int[] cf = new int[2];
   private int cg;
   private final ark ch = (ark)new ark(this.S_(), brt.a.f, brt.b.a).a(true);
   private static final Predicate<bva> ci = $$0 -> !$$0.ar().a(axe.y) && $$0.fO();
   private static final cfr cj = cfr.a().a(20.0).a(ci);

   public cki(bul<? extends cki> $$0, dfb $$1) {
      super($$0, $$1);
      this.bP = new cay(this, 10, false);
      this.x(this.eV());
      this.bN = 50;
   }

   @Override
   protected cem b(dfb $$0) {
      cek $$1 = new cek(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void D() {
      this.bS.a(0, new cki.a());
      this.bS.a(2, new ccx(this, 1.0, 40, 20.0F));
      this.bS.a(5, new cdk(this, 1.0));
      this.bS.a(6, new ccg(this, com.class, 8.0F));
      this.bS.a(7, new cct(this));
      this.bT.a(1, new cdq(this));
      this.bT.a(2, new cdr<>(this, bva.class, 0, false, false, ci));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(d, 0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Invul", this.gv());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.b($$0.h("Invul"));
      if (this.an()) {
         this.ch.a(this.S_());
      }
   }

   @Override
   public void b(@Nullable xi $$0) {
      super.b($$0);
      this.ch.a(this.S_());
   }

   @Override
   protected awk w() {
      return awl.CC;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.CF;
   }

   @Override
   protected awk o_() {
      return awl.CE;
   }

   @Override
   public void n_() {
      ezn $$0 = this.dA().d(1.0, 0.6, 1.0);
      if (!this.dX().C && this.c(0) > 0) {
         bue $$1 = this.dX().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dE() < $$1.dE() || !this.gw() && this.dE() < $$1.dE() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new ezn($$0.d, $$2, $$0.f);
            ezn $$3 = new ezn($$1.dC() - this.dC(), 0.0, $$1.dI() - this.dI());
            if ($$3.j() > 9.0) {
               ezn $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.h($$0);
      if ($$0.j() > 0.05) {
         this.v((float)azk.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.n_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.cd[$$5] = this.cb[$$5];
         this.cc[$$5] = this.ca[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         bue $$8 = null;
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
            float $$16 = (float)(azk.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(azk.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.ca[$$6] = this.a(this.ca[$$6], $$17, 40.0F);
            this.cb[$$6] = this.a(this.cb[$$6], $$16, 10.0F);
         } else {
            this.cb[$$6] = this.a(this.cb[$$6], this.aX, 10.0F);
         }
      }

      boolean $$18 = this.gw();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.s($$19);
         double $$21 = this.t($$19);
         double $$22 = this.u($$19);
         float $$23 = 0.3F * this.el();
         this.dX().a(lr.ae, $$20 + this.af.k() * (double)$$23, $$21 + this.af.k() * (double)$$23, $$22 + this.af.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dX().A.a(4) == 0) {
            this.dX()
               .a(
                  lk.a(lr.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.af.k() * (double)$$23,
                  $$21 + this.af.k() * (double)$$23,
                  $$22 + this.af.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.gv() > 0) {
         float $$24 = 3.3F * this.el();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dX()
               .a(lk.a(lr.u, 0.7F, 0.7F, 0.9F), this.dC() + this.af.k(), this.dE() + (double)(this.af.i() * $$24), this.dI() + this.af.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void ac() {
      if (this.gv() > 0) {
         int $$0 = this.gv() - 1;
         this.ch.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dX().a(this, this.dC(), this.dG(), this.dI(), 7.0F, false, dfb.a.c);
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
               if ((this.dX().ak() == bsa.c || this.dX().ak() == bsa.d) && this.cf[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = azk.a(this.af, this.dC() - 10.0, this.dC() + 10.0);
                  double $$5 = azk.a(this.af, this.dE() - 5.0, this.dE() + 5.0);
                  double $$6 = azk.a(this.af, this.dI() - 10.0, this.dI() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.cf[$$1 - 1] = 0;
               }

               int $$7 = this.c($$1);
               if ($$7 > 0) {
                  bva $$8 = (bva)this.dX().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.g((bue)$$8) > 900.0) && this.G($$8)) {
                     this.a($$1 + 1, $$8);
                     this.ce[$$1 - 1] = this.ag + 40 + this.af.a(20);
                     this.cf[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bva> $$9 = this.dX().a(bva.class, cj, this, this.cS().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bva $$10 = $$9.get(this.af.a($$9.size()));
                     this.a($$1, $$10.as());
                  }
               }
            }
         }

         if (this.m() != null) {
            this.a(0, this.m().as());
         } else {
            this.a(0, 0);
         }

         if (this.cg > 0) {
            this.cg--;
            if (this.cg == 0 && this.dX().ac().b(dex.c)) {
               boolean $$11 = false;
               int $$12 = azk.d(this.ds() / 2.0F + 1.0F);
               int $$13 = azk.d(this.dt());

               for (jh $$14 : jh.b(this.dB() - $$12, this.dD(), this.dH() - $$12, this.dB() + $$12, this.dD() + $$13, this.dH() + $$12)) {
                  dvj $$15 = this.dX().a_($$14);
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

   public static boolean c(dvj $$0) {
      return !$$0.l() && !$$0.a(axa.aF);
   }

   @Override
   public void q() {
      this.b(220);
      this.ch.a(0.0F);
      this.x(this.eV() / 3.0F);
   }

   @Override
   public void a(dvj $$0, ezn $$1) {
   }

   @Override
   public void d(aro $$0) {
      super.d($$0);
      this.ch.a($$0);
   }

   @Override
   public void e(aro $$0) {
      super.e($$0);
      this.ch.b($$0);
   }

   private double s(int $$0) {
      if ($$0 <= 0) {
         return this.dC();
      } else {
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azk.b($$1);
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
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azk.a($$1);
         return this.dI() + (double)$$2 * 1.3 * (double)this.el();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azk.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bva $$1) {
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
      ezn $$11 = new ezn($$8, $$9, $$10);
      cpu $$12 = new cpu(this.dX(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dX().b($$12);
   }

   @Override
   public void a(bva $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(axc.t) || $$0.d() instanceof cki) {
         return false;
      } else if (this.gv() > 0 && !$$0.a(axc.d)) {
         return false;
      } else {
         if (this.gw()) {
            bue $$2 = $$0.c();
            if ($$2 instanceof cou || $$2 instanceof cpy) {
               return false;
            }
         }

         bue $$3 = $$0.d();
         if ($$3 != null && $$3.ar().a(axe.y)) {
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
   protected void a(arn $$0, bsu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      ckv $$3 = this.a(cwf.uu);
      if ($$3 != null) {
         $$3.y();
      }
   }

   @Override
   public void dJ() {
      if (this.dX().ak() == bsa.a && this.aa()) {
         this.av();
      } else {
         this.bf = 0;
      }
   }

   @Override
   public boolean b(btj $$0, @Nullable bue $$1) {
      return false;
   }

   public static bwh.a t() {
      return clr.gA().a(bwi.s, 300.0).a(bwi.v, 0.6F).a(bwi.l, 0.6F).a(bwi.m, 40.0).a(bwi.a, 4.0);
   }

   public float[] y() {
      return this.cb;
   }

   public float[] gu() {
      return this.ca;
   }

   public int gv() {
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

   public boolean gw() {
      return this.eG() <= this.eV() / 2.0F;
   }

   @Override
   protected boolean o(bue $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(btj $$0) {
      return $$0.a(btl.t) ? false : super.b($$0);
   }

   class a extends cby {
      public a() {
         this.a(EnumSet.of(cby.a.a, cby.a.c, cby.a.b));
      }

      @Override
      public boolean b() {
         return cki.this.gv() > 0;
      }
   }
}
