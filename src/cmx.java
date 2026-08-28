import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmx extends crf {
   private static final Predicate<bva> bF = $$0 -> !($$0 instanceof cmx) && $$0.bJ();
   private static final Predicate<bva> bG = $$0 -> bF.test($$0) && !$$0.aq().equals(bvi.f);
   private static final Predicate<bvy> bH = $$0 -> !($$0 instanceof cmx) && $$0.bJ() && $$0.df();
   private static final double bI = 0.3;
   private static final double bJ = 0.35;
   private static final int bK = 8356754;
   private static final float bL = 0.57254905F;
   private static final float bM = 0.5137255F;
   private static final float bN = 0.49803922F;
   public static final int a = 10;
   public static final int b = 40;
   private int bO;
   private int bP;
   private int bQ;

   public cmx(bvi<? extends cmx> $$0, dgz $$1) {
      super($$0, $$1);
      this.bx = 20;
      this.a(eun.v, 0.0F);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new ccq(this));
      this.bC.a(4, new cdg(this, 1.0, true));
      this.bC.a(5, new cej(this, 0.4));
      this.bC.a(6, new cde(this, cpr.class, 6.0F));
      this.bC.a(10, new cde(this, bwa.class, 8.0F));
      this.bD.a(2, new ceo(this, crf.class).a());
      this.bD.a(3, new cep<>(this, cpr.class, true));
      this.bD.a(4, new cep<>(this, coy.class, true, ($$0, $$1) -> !$$0.n_()));
      this.bD.a(4, new cep<>(this, cib.class, true));
   }

   @Override
   protected void V() {
      boolean $$0 = !(this.cV() instanceof bwa) || this.cV().aq().a(awt.c);
      boolean $$1 = !(this.dj() instanceof cro);
      this.bC.a(ccw.a.a, $$0);
      this.bC.a(ccw.a.c, $$0 && $$1);
      this.bC.a(ccw.a.b, $$0);
      this.bC.a(ccw.a.d, $$0);
   }

   public static bxf.a j() {
      return cms.gv().a(bxg.s, 100.0).a(bxg.v, 0.3).a(bxg.p, 0.75).a(bxg.c, 12.0).a(bxg.d, 1.5).a(bxg.m, 32.0).a(bxg.B, 1.0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.bO);
      $$0.a("StunTick", this.bP);
      $$0.a("RoarTick", this.bQ);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.bO = $$0.h("AttackTick");
      this.bP = $$0.h("StunTick");
      this.bQ = $$0.h("RoarTick");
   }

   @Override
   public avz ah_() {
      return awa.vP;
   }

   @Override
   public int ad() {
      return 45;
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bJ()) {
         if (this.fi()) {
            this.g(bxg.v).a(0.0);
         } else {
            double $$0 = this.f() != null ? 0.35 : 0.3;
            double $$1 = this.g(bxg.v).b();
            this.g(bxg.v).a(ayz.d(0.1, $$1, $$0));
         }

         if (this.dU() instanceof ard $$2 && this.P && $$2.O().b(dgv.c)) {
            boolean $$3 = false;
            fbs $$4 = this.cQ().g(0.2);

            for (ji $$5 : ji.b(ayz.a($$4.a), ayz.a($$4.b), ayz.a($$4.c), ayz.a($$4.d), ayz.a($$4.e), ayz.a($$4.f))) {
               dxq $$6 = $$2.a_($$5);
               dke $$7 = $$6.b();
               if ($$7 instanceof dos) {
                  $$3 = $$2.a($$5, true, this) || $$3;
               }
            }

            if (!$$3 && this.aJ()) {
               this.s();
            }
         }

         if (this.bQ > 0) {
            this.bQ--;
            if (this.bQ == 10) {
               this.gB();
            }
         }

         if (this.bO > 0) {
            this.bO--;
         }

         if (this.bP > 0) {
            this.bP--;
            this.gA();
            if (this.bP == 0) {
               this.a(awa.vU, 1.0F, 1.0F);
               this.bQ = 20;
            }
         }
      }
   }

   private void gA() {
      if (this.ae.a(6) == 0) {
         double $$0 = this.dz() - (double)this.dp() * Math.sin((double)(this.aV * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         double $$1 = this.dB() + (double)this.dq() - 0.3;
         double $$2 = this.dF() + (double)this.dp() * Math.cos((double)(this.aV * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         this.dU().a(lm.a(lt.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fi() {
      return super.fi() || this.bO > 0 || this.bP > 0 || this.bQ > 0;
   }

   @Override
   public boolean E(bva $$0) {
      return this.bP <= 0 && this.bQ <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bvy $$0) {
      if (this.bQ == 0) {
         if (this.ae.j() < 0.5) {
            this.bP = 40;
            this.a(awa.vT, 1.0F, 1.0F);
            this.dU().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.T = true;
      }
   }

   private void gB() {
      if (this.bJ()) {
         if (this.dU() instanceof ard $$0) {
            Predicate<bva> $$1 = $$0.O().b(dgv.c) ? bF : bG;

            for (bvy $$3 : this.dU().a(bvy.class, this.cQ().g(4.0), $$1)) {
               if (!($$3 instanceof clz)) {
                  $$3.a($$0, this.dV().b((bvy)this), 6.0F);
               }

               if (!($$3 instanceof cpr)) {
                  this.b($$3);
               }
            }

            this.a(ecp.u);
         } else {
            for (bvy $$5 : this.dU().a(bvy.class, this.cQ().g(4.0), bH)) {
               this.b($$5);
            }

            fbx $$6 = this.cQ().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dU().a(lt.ae, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bva $$0) {
      double $$1 = $$0.dz() - this.dz();
      double $$2 = $$0.dF() - this.dF();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bO = 10;
         this.a(awa.vO, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.bP = 40;
      }

      super.b($$0);
   }

   public int m() {
      return this.bO;
   }

   public int q() {
      return this.bP;
   }

   public int gz() {
      return this.bQ;
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      this.bO = 10;
      $$0.a(this, (byte)4);
      this.a(awa.vO, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected avz u() {
      return awa.vN;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.vR;
   }

   @Override
   protected avz l_() {
      return awa.vQ;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.vS, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dhc $$0) {
      return !$$0.d(this.cQ());
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }

   @Override
   protected fbs gk() {
      fbs $$0 = super.gk();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
