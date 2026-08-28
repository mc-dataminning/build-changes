import java.util.function.Predicate;
import javax.annotation.Nullable;

public class coi extends cst {
   private static final Predicate<bwf> bG = $$0 -> !($$0 instanceof coi) && $$0.bK();
   private static final Predicate<bwf> bH = $$0 -> bG.test($$0) && !$$0.aq().equals(bwo.f);
   private static final Predicate<bxe> bI = $$0 -> !($$0 instanceof coi) && $$0.bK() && $$0.dg();
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

   public coi(bwo<? extends coi> $$0, dja $$1) {
      super($$0, $$1);
      this.by = 20;
      this.a(exf.v, 0.0F);
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdu(this));
      this.bD.a(4, new cek(this, 1.0, true));
      this.bD.a(5, new cfn(this, 0.4));
      this.bD.a(6, new cei(this, crc.class, 6.0F));
      this.bD.a(10, new cei(this, bxg.class, 8.0F));
      this.bE.a(2, new cfs(this, cst.class).a());
      this.bE.a(3, new cft<>(this, crc.class, true));
      this.bE.a(4, new cft<>(this, cqj.class, true, ($$0, $$1) -> !$$0.n_()));
      this.bE.a(4, new cft<>(this, cjk.class, true));
   }

   @Override
   protected void V() {
      boolean $$0 = !(this.cW() instanceof bxg) || this.cW().aq().a(axf.c);
      boolean $$1 = !(this.dk() instanceof ctn);
      this.bD.a(cea.a.a, $$0);
      this.bD.a(cea.a.c, $$0 && $$1);
      this.bD.a(cea.a.b, $$0);
      this.bD.a(cea.a.d, $$0);
   }

   public static byj.a j() {
      return cod.gu().a(byk.s, 100.0).a(byk.v, 0.3).a(byk.p, 0.75).a(byk.c, 12.0).a(byk.d, 1.5).a(byk.m, 32.0).a(byk.B, 1.0);
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
      this.bP = $$0.h("AttackTick");
      this.bQ = $$0.h("StunTick");
      this.bR = $$0.h("RoarTick");
   }

   @Override
   public awm ae_() {
      return awn.vT;
   }

   @Override
   public int ad() {
      return 45;
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bK()) {
         if (this.fg()) {
            this.g(byk.v).a(0.0);
         } else {
            double $$0 = this.f() != null ? 0.35 : 0.3;
            double $$1 = this.g(byk.v).b();
            this.g(byk.v).a(azm.d(0.1, $$1, $$0));
         }

         if (this.dV() instanceof arq $$2 && this.P && $$2.O().c(diw.d)) {
            boolean $$3 = false;
            fel $$4 = this.cR().g(0.2);

            for (iu $$5 : iu.b(azm.a($$4.a), azm.a($$4.b), azm.a($$4.c), azm.a($$4.d), azm.a($$4.e), azm.a($$4.f))) {
               eah $$6 = $$2.a_($$5);
               dmf $$7 = $$6.b();
               if ($$7 instanceof dqv) {
                  $$3 = $$2.a($$5, true, this) || $$3;
               }
            }

            if (!$$3 && this.aJ()) {
               this.s();
            }
         }

         if (this.bR > 0) {
            this.bR--;
            if (this.bR == 10) {
               this.gA();
            }
         }

         if (this.bP > 0) {
            this.bP--;
         }

         if (this.bQ > 0) {
            this.bQ--;
            this.gz();
            if (this.bQ == 0) {
               this.a(awn.vY, 1.0F, 1.0F);
               this.bR = 20;
            }
         }
      }
   }

   private void gz() {
      if (this.ae.a(6) == 0) {
         double $$0 = this.dA() - (double)this.dq() * Math.sin((double)(this.aV * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         double $$1 = this.dC() + (double)this.dr() - 0.3;
         double $$2 = this.dG() + (double)this.dq() * Math.cos((double)(this.aV * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         this.dV().a(lq.a(lx.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fg() {
      return super.fg() || this.bP > 0 || this.bQ > 0 || this.bR > 0;
   }

   @Override
   public boolean E(bwf $$0) {
      return this.bQ <= 0 && this.bR <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void d(bxe $$0) {
      if (this.bR == 0) {
         if (this.ae.j() < 0.5) {
            this.bQ = 40;
            this.a(awn.vX, 1.0F, 1.0F);
            this.dV().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.T = true;
      }
   }

   private void gA() {
      if (this.bK()) {
         if (this.dV() instanceof arq $$0) {
            Predicate<bwf> $$1 = $$0.O().c(diw.d) ? bG : bH;

            for (bxe $$3 : this.dV().a(bxe.class, this.cR().g(4.0), $$1)) {
               if (!($$3 instanceof cnk)) {
                  $$3.a($$0, this.dW().b((bxe)this), 6.0F);
               }

               if (!($$3 instanceof crc)) {
                  this.b($$3);
               }
            }

            this.a(efh.u);
         } else {
            for (bxe $$5 : this.dV().a(bxe.class, this.cR().g(4.0), bI)) {
               this.b($$5);
            }

            feq $$6 = this.cR().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dV().a(lx.ae, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bwf $$0) {
      double $$1 = $$0.dA() - this.dA();
      double $$2 = $$0.dG() - this.dG();
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

   public int gy() {
      return this.bR;
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
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
   protected awm e(buu $$0) {
      return awn.vV;
   }

   @Override
   protected awm l_() {
      return awn.vU;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.vW, 0.15F, 1.0F);
   }

   @Override
   public boolean a(djd $$0) {
      return !$$0.d(this.cR());
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }

   @Override
   protected fel gj() {
      fel $$0 = super.gj();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
