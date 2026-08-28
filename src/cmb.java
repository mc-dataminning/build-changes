import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmb extends cqj {
   private static final Predicate<buj> bY = $$0 -> !($$0 instanceof cmb) && $$0.bL();
   private static final Predicate<buj> bZ = $$0 -> bY.test($$0) && !$$0.aq().equals(buq.f);
   private static final Predicate<bvf> ca = $$0 -> !($$0 instanceof cmb) && $$0.bL() && $$0.di();
   private static final double cb = 0.3;
   private static final double cc = 0.35;
   private static final int cd = 8356754;
   private static final float ce = 0.57254905F;
   private static final float cf = 0.5137255F;
   private static final float cg = 0.49803922F;
   public static final int a = 10;
   public static final int b = 40;
   private int ch;
   private int ci;
   private int cj;

   public cmb(buq<? extends cmb> $$0, dgg $$1) {
      super($$0, $$1);
      this.bN = 20;
      this.a(eto.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cbx(this));
      this.bS.a(4, new ccn(this, 1.0, true));
      this.bS.a(5, new cdq(this, 0.4));
      this.bS.a(6, new ccl(this, cov.class, 6.0F));
      this.bS.a(10, new ccl(this, bvh.class, 8.0F));
      this.bT.a(2, new cdv(this, cqj.class).a());
      this.bT.a(3, new cdw<>(this, cov.class, true));
      this.bT.a(4, new cdw<>(this, cob.class, true, ($$0, $$1) -> !$$0.e_()));
      this.bT.a(4, new cdw<>(this, chi.class, true));
   }

   @Override
   protected void T() {
      boolean $$0 = !(this.cX() instanceof bvh) || this.cX().aq().a(aws.c);
      boolean $$1 = !(this.dl() instanceof cqs);
      this.bS.a(ccd.a.a, $$0);
      this.bS.a(ccd.a.c, $$0 && $$1);
      this.bS.a(ccd.a.b, $$0);
      this.bS.a(ccd.a.d, $$0);
   }

   public static bwm.a m() {
      return clw.gu().a(bwn.s, 100.0).a(bwn.v, 0.3).a(bwn.p, 0.75).a(bwn.c, 12.0).a(bwn.d, 1.5).a(bwn.m, 32.0).a(bwn.B, 1.0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ch);
      $$0.a("StunTick", this.ci);
      $$0.a("RoarTick", this.cj);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.ch = $$0.h("AttackTick");
      this.ci = $$0.h("StunTick");
      this.cj = $$0.h("RoarTick");
   }

   @Override
   public avy aj_() {
      return avz.vF;
   }

   @Override
   public int ab() {
      return 45;
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bL()) {
         if (this.fi()) {
            this.g(bwn.v).a(0.0);
         } else {
            double $$0 = this.O_() != null ? 0.35 : 0.3;
            double $$1 = this.g(bwn.v).b();
            this.g(bwn.v).a(ayy.d(0.1, $$1, $$0));
         }

         if (this.dW() instanceof arc $$2 && this.P && $$2.O().b(dgc.c)) {
            boolean $$3 = false;
            fat $$4 = this.cR().g(0.2);

            for (ji $$5 : ji.b(ayy.a($$4.a), ayy.a($$4.b), ayy.a($$4.c), ayy.a($$4.d), ayy.a($$4.e), ayy.a($$4.f))) {
               dwv $$6 = $$2.a_($$5);
               djk $$7 = $$6.b();
               if ($$7 instanceof dnw) {
                  $$3 = $$2.a($$5, true, this) || $$3;
               }
            }

            if (!$$3 && this.aJ()) {
               this.s();
            }
         }

         if (this.cj > 0) {
            this.cj--;
            if (this.cj == 10) {
               this.gA();
            }
         }

         if (this.ch > 0) {
            this.ch--;
         }

         if (this.ci > 0) {
            this.ci--;
            this.gz();
            if (this.ci == 0) {
               this.a(avz.vK, 1.0F, 1.0F);
               this.cj = 20;
            }
         }
      }
   }

   private void gz() {
      if (this.ae.a(6) == 0) {
         double $$0 = this.dB() - (double)this.dr() * Math.sin((double)(this.aX * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         double $$1 = this.dD() + (double)this.ds() - 0.3;
         double $$2 = this.dH() + (double)this.dr() * Math.cos((double)(this.aX * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         this.dW().a(lm.a(lt.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fi() {
      return super.fi() || this.ch > 0 || this.ci > 0 || this.cj > 0;
   }

   @Override
   public boolean E(buj $$0) {
      return this.ci <= 0 && this.cj <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bvf $$0) {
      if (this.cj == 0) {
         if (this.ae.j() < 0.5) {
            this.ci = 40;
            this.a(avz.vJ, 1.0F, 1.0F);
            this.dW().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.T = true;
      }
   }

   private void gA() {
      if (this.bL()) {
         if (this.dW() instanceof arc $$0) {
            Predicate<buj> $$1 = $$0.O().b(dgc.c) ? bY : bZ;

            for (bvf $$3 : this.dW().a(bvf.class, this.cR().g(4.0), $$1)) {
               if (!($$3 instanceof cld)) {
                  $$3.a($$0, this.dX().b((bvf)this), 6.0F);
               }

               if (!($$3 instanceof cov)) {
                  this.b($$3);
               }
            }

            this.a(ebr.u);
         } else {
            for (bvf $$5 : this.dW().a(bvf.class, this.cR().g(4.0), ca)) {
               this.b($$5);
            }

            fay $$6 = this.cR().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dW().a(lt.ad, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(buj $$0) {
      double $$1 = $$0.dB() - this.dB();
      double $$2 = $$0.dH() - this.dH();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ch = 10;
         this.a(avz.vE, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.ci = 40;
      }

      super.b($$0);
   }

   public int p() {
      return this.ch;
   }

   public int x() {
      return this.ci;
   }

   public int gy() {
      return this.cj;
   }

   @Override
   public boolean c(arc $$0, buj $$1) {
      this.ch = 10;
      $$0.a(this, (byte)4);
      this.a(avz.vE, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected avy u() {
      return avz.vD;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.vH;
   }

   @Override
   protected avy o_() {
      return avz.vG;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.vI, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dgj $$0) {
      return !$$0.d(this.cR());
   }

   @Override
   public void a(arc $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gp() {
      return false;
   }

   @Override
   protected fat gf() {
      fat $$0 = super.gf();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
