import java.util.function.Predicate;
import javax.annotation.Nullable;

public class coq extends cta {
   private static final Predicate<bwi> bG = $$0 -> !($$0 instanceof coq) && $$0.bI();
   private static final Predicate<bwi> bH = $$0 -> bG.test($$0) && !$$0.an().equals(bwr.f);
   private static final Predicate<bxj> bI = $$0 -> !($$0 instanceof coq) && $$0.bI() && $$0.df();
   private static final double bJ = 0.3;
   private static final double bK = 0.35;
   private static final int bL = 8356754;
   private static final float bM = 0.57254905F;
   private static final float bN = 0.5137255F;
   private static final float bO = 0.49803922F;
   public static final int a = 10;
   public static final int b = 40;
   private int bP;
   private int bQ;
   private int bR;

   public coq(bwr<? extends coq> $$0, djh $$1) {
      super($$0, $$1);
      this.by = 20;
      this.a(exm.v, 0.0F);
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdz(this));
      this.bD.a(4, new cep(this, 1.0, true));
      this.bD.a(5, new cfs(this, 0.4));
      this.bD.a(6, new cen(this, crj.class, 6.0F));
      this.bD.a(10, new cen(this, bxl.class, 8.0F));
      this.bE.a(2, new cfx(this, cta.class).a());
      this.bE.a(3, new cfy<>(this, crj.class, true));
      this.bE.a(4, new cfy<>(this, cqq.class, true, ($$0, $$1) -> !$$0.n_()));
      this.bE.a(4, new cfy<>(this, cjp.class, true));
   }

   @Override
   protected void V() {
      boolean $$0 = !(this.cV() instanceof bxl) || this.cV().an().a(axf.c);
      boolean $$1 = !(this.dj() instanceof ctu);
      this.bD.a(cef.a.a, $$0);
      this.bD.a(cef.a.c, $$0 && $$1);
      this.bD.a(cef.a.b, $$0);
      this.bD.a(cef.a.d, $$0);
   }

   public static byo.a j() {
      return cok.gw().a(byp.s, 100.0).a(byp.v, 0.3).a(byp.p, 0.75).a(byp.c, 12.0).a(byp.d, 1.5).a(byp.m, 32.0).a(byp.B, 1.0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.bP);
      $$0.a("StunTick", this.bQ);
      $$0.a("RoarTick", this.bR);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bP = $$0.f("AttackTick");
      this.bQ = $$0.f("StunTick");
      this.bR = $$0.f("RoarTick");
   }

   @Override
   public awm ae_() {
      return awn.vT;
   }

   @Override
   public int af() {
      return 45;
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bI()) {
         if (this.ff()) {
            this.g(byp.v).a(0.0);
         } else {
            double $$0 = this.f() != null ? 0.35 : 0.3;
            double $$1 = this.g(byp.v).b();
            this.g(byp.v).a(azm.d(0.1, $$1, $$0));
         }

         if (this.dU() instanceof arq $$2 && this.P && $$2.O().c(djd.d)) {
            boolean $$3 = false;
            fes $$4 = this.cQ().g(0.2);

            for (iv $$5 : iv.b(azm.a($$4.a), azm.a($$4.b), azm.a($$4.c), azm.a($$4.d), azm.a($$4.e), azm.a($$4.f))) {
               eao $$6 = $$2.a_($$5);
               dmm $$7 = $$6.b();
               if ($$7 instanceof drc) {
                  $$3 = $$2.a($$5, true, this) || $$3;
               }
            }

            if (!$$3 && this.aH()) {
               this.s();
            }
         }

         if (this.bR > 0) {
            this.bR--;
            if (this.bR == 10) {
               this.gC();
            }
         }

         if (this.bP > 0) {
            this.bP--;
         }

         if (this.bQ > 0) {
            this.bQ--;
            this.gB();
            if (this.bQ == 0) {
               this.a(awn.vY, 1.0F, 1.0F);
               this.bR = 20;
            }
         }
      }
   }

   private void gB() {
      if (this.ae.a(6) == 0) {
         double $$0 = this.dz() - (double)this.dp() * Math.sin((double)(this.aV * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         double $$1 = this.dB() + (double)this.dq() - 0.3;
         double $$2 = this.dF() + (double)this.dp() * Math.cos((double)(this.aV * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         this.dU().a(lr.a(ly.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean ff() {
      return super.ff() || this.bP > 0 || this.bQ > 0 || this.bR > 0;
   }

   @Override
   public boolean E(bwi $$0) {
      return this.bQ <= 0 && this.bR <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void d(bxj $$0) {
      if (this.bR == 0) {
         if (this.ae.j() < 0.5) {
            this.bQ = 40;
            this.a(awn.vX, 1.0F, 1.0F);
            this.dU().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.T = true;
      }
   }

   private void gC() {
      if (this.bI()) {
         if (this.dU() instanceof arq $$0) {
            Predicate<bwi> $$1 = $$0.O().c(djd.d) ? bG : bH;

            for (bxj $$3 : this.dU().a(bxj.class, this.cQ().g(4.0), $$1)) {
               if (!($$3 instanceof cnr)) {
                  $$3.a($$0, this.dV().b((bxj)this), 6.0F);
               }

               if (!($$3 instanceof crj)) {
                  this.b($$3);
               }
            }

            this.a(efo.u);
         } else {
            for (bxj $$5 : this.dU().a(bxj.class, this.cQ().g(4.0), bI)) {
               this.b($$5);
            }

            fex $$6 = this.cQ().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dU().a(ly.ae, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bwi $$0) {
      double $$1 = $$0.dz() - this.dz();
      double $$2 = $$0.dF() - this.dF();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.i($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bP = 10;
         this.a(awn.vS, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.bQ = 40;
      }

      super.b($$0);
   }

   public int m() {
      return this.bP;
   }

   public int q() {
      return this.bQ;
   }

   public int gA() {
      return this.bR;
   }

   @Override
   public boolean c(arq $$0, bwi $$1) {
      this.bP = 10;
      $$0.a(this, (byte)4);
      this.a(awn.vS, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected awm u() {
      return awn.vR;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.vV;
   }

   @Override
   protected awm l_() {
      return awn.vU;
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(awn.vW, 0.15F, 1.0F);
   }

   @Override
   public boolean a(djk $$0) {
      return !$$0.d(this.cQ());
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }

   @Override
   protected fes gl() {
      fes $$0 = super.gl();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
