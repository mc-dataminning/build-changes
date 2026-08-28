import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cme extends cqm {
   private static final Predicate<bum> bY = $$0 -> !($$0 instanceof cme) && $$0.bL();
   private static final Predicate<bum> bZ = $$0 -> bY.test($$0) && !$$0.aq().equals(but.f);
   private static final Predicate<bvi> ca = $$0 -> !($$0 instanceof cme) && $$0.bL() && $$0.dh();
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

   public cme(but<? extends cme> $$0, dgj $$1) {
      super($$0, $$1);
      this.bN = 20;
      this.a(etr.v, 0.0F);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new cca(this));
      this.bS.a(4, new ccq(this, 1.0, true));
      this.bS.a(5, new cdt(this, 0.4));
      this.bS.a(6, new cco(this, coy.class, 6.0F));
      this.bS.a(10, new cco(this, bvk.class, 8.0F));
      this.bT.a(2, new cdy(this, cqm.class).a());
      this.bT.a(3, new cdz<>(this, coy.class, true));
      this.bT.a(4, new cdz<>(this, coe.class, true, ($$0, $$1) -> !$$0.e_()));
      this.bT.a(4, new cdz<>(this, chl.class, true));
   }

   @Override
   protected void W() {
      boolean $$0 = !(this.cW() instanceof bvk) || this.cW().aq().a(awt.c);
      boolean $$1 = !(this.dk() instanceof cqv);
      this.bS.a(ccg.a.a, $$0);
      this.bS.a(ccg.a.c, $$0 && $$1);
      this.bS.a(ccg.a.b, $$0);
      this.bS.a(ccg.a.d, $$0);
   }

   public static bwp.a m() {
      return clz.gx().a(bwq.s, 100.0).a(bwq.v, 0.3).a(bwq.p, 0.75).a(bwq.c, 12.0).a(bwq.d, 1.5).a(bwq.m, 32.0).a(bwq.B, 1.0);
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
   public avz aj_() {
      return awa.vF;
   }

   @Override
   public int af() {
      return 45;
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bL()) {
         if (this.fi()) {
            this.g(bwq.v).a(0.0);
         } else {
            double $$0 = this.O_() != null ? 0.35 : 0.3;
            double $$1 = this.g(bwq.v).b();
            this.g(bwq.v).a(ayz.d(0.1, $$1, $$0));
         }

         if (this.dV() instanceof ard $$2 && this.P && $$2.O().b(dgf.c)) {
            boolean $$3 = false;
            faw $$4 = this.cR().g(0.2);

            for (ji $$5 : ji.b(ayz.a($$4.a), ayz.a($$4.b), ayz.a($$4.c), ayz.a($$4.d), ayz.a($$4.e), ayz.a($$4.f))) {
               dwy $$6 = $$2.a_($$5);
               djn $$7 = $$6.b();
               if ($$7 instanceof dnz) {
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
               this.gD();
            }
         }

         if (this.ch > 0) {
            this.ch--;
         }

         if (this.ci > 0) {
            this.ci--;
            this.gC();
            if (this.ci == 0) {
               this.a(awa.vK, 1.0F, 1.0F);
               this.cj = 20;
            }
         }
      }
   }

   private void gC() {
      if (this.ae.a(6) == 0) {
         double $$0 = this.dA() - (double)this.dq() * Math.sin((double)(this.aX * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         double $$1 = this.dC() + (double)this.dr() - 0.3;
         double $$2 = this.dG() + (double)this.dq() * Math.cos((double)(this.aX * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         this.dV().a(lm.a(lt.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fi() {
      return super.fi() || this.ch > 0 || this.ci > 0 || this.cj > 0;
   }

   @Override
   public boolean E(bum $$0) {
      return this.ci <= 0 && this.cj <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bvi $$0) {
      if (this.cj == 0) {
         if (this.ae.j() < 0.5) {
            this.ci = 40;
            this.a(awa.vJ, 1.0F, 1.0F);
            this.dV().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.T = true;
      }
   }

   private void gD() {
      if (this.bL()) {
         if (this.dV() instanceof ard $$0) {
            Predicate<bum> $$1 = $$0.O().b(dgf.c) ? bY : bZ;

            for (bvi $$3 : this.dV().a(bvi.class, this.cR().g(4.0), $$1)) {
               if (!($$3 instanceof clg)) {
                  $$3.a($$0, this.dW().b((bvi)this), 6.0F);
               }

               if (!($$3 instanceof coy)) {
                  this.b($$3);
               }
            }

            this.a(ebu.u);
         } else {
            for (bvi $$5 : this.dV().a(bvi.class, this.cR().g(4.0), ca)) {
               this.b($$5);
            }

            fbb $$6 = this.cR().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dV().a(lt.ad, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bum $$0) {
      double $$1 = $$0.dA() - this.dA();
      double $$2 = $$0.dG() - this.dG();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ch = 10;
         this.a(awa.vE, 1.0F, 1.0F);
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

   public int gB() {
      return this.cj;
   }

   @Override
   public boolean c(ard $$0, bum $$1) {
      this.ch = 10;
      $$0.a(this, (byte)4);
      this.a(awa.vE, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected avz u() {
      return awa.vD;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.vH;
   }

   @Override
   protected avz o_() {
      return awa.vG;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.vI, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dgm $$0) {
      return !$$0.d(this.cR());
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gs() {
      return false;
   }

   @Override
   protected faw gi() {
      faw $$0 = super.gi();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
