import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cny extends csi {
   private static final Predicate<bwa> bF = $$0 -> !($$0 instanceof cny) && $$0.bK();
   private static final Predicate<bwa> bG = $$0 -> bF.test($$0) && !$$0.aq().equals(bwj.f);
   private static final Predicate<bwz> bH = $$0 -> !($$0 instanceof cny) && $$0.bK() && $$0.dg();
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

   public cny(bwj<? extends cny> $$0, dip $$1) {
      super($$0, $$1);
      this.bx = 20;
      this.a(ewm.v, 0.0F);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cdp(this));
      this.bC.a(4, new cef(this, 1.0, true));
      this.bC.a(5, new cfi(this, 0.4));
      this.bC.a(6, new ced(this, cqs.class, 6.0F));
      this.bC.a(10, new ced(this, bxb.class, 8.0F));
      this.bD.a(2, new cfn(this, csi.class).a());
      this.bD.a(3, new cfo<>(this, cqs.class, true));
      this.bD.a(4, new cfo<>(this, cpz.class, true, ($$0, $$1) -> !$$0.n_()));
      this.bD.a(4, new cfo<>(this, cja.class, true));
   }

   @Override
   protected void V() {
      boolean $$0 = !(this.cW() instanceof bxb) || this.cW().aq().a(axd.c);
      boolean $$1 = !(this.dk() instanceof ctc);
      this.bC.a(cdv.a.a, $$0);
      this.bC.a(cdv.a.c, $$0 && $$1);
      this.bC.a(cdv.a.b, $$0);
      this.bC.a(cdv.a.d, $$0);
   }

   public static bye.a j() {
      return cnt.gt().a(byf.s, 100.0).a(byf.v, 0.3).a(byf.p, 0.75).a(byf.c, 12.0).a(byf.d, 1.5).a(byf.m, 32.0).a(byf.B, 1.0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.bO);
      $$0.a("StunTick", this.bP);
      $$0.a("RoarTick", this.bQ);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.bO = $$0.h("AttackTick");
      this.bP = $$0.h("StunTick");
      this.bQ = $$0.h("RoarTick");
   }

   @Override
   public awk ad_() {
      return awl.vP;
   }

   @Override
   public int ad() {
      return 45;
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bK()) {
         if (this.ff()) {
            this.g(byf.v).a(0.0);
         } else {
            double $$0 = this.f() != null ? 0.35 : 0.3;
            double $$1 = this.g(byf.v).b();
            this.g(byf.v).a(azk.d(0.1, $$1, $$0));
         }

         if (this.dV() instanceof aro $$2 && this.P && $$2.O().c(dil.c)) {
            boolean $$3 = false;
            fdr $$4 = this.cR().g(0.2);

            for (iu $$5 : iu.b(azk.a($$4.a), azk.a($$4.b), azk.a($$4.c), azk.a($$4.d), azk.a($$4.e), azk.a($$4.f))) {
               dzo $$6 = $$2.a_($$5);
               dlu $$7 = $$6.b();
               if ($$7 instanceof dqi) {
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
               this.gz();
            }
         }

         if (this.bO > 0) {
            this.bO--;
         }

         if (this.bP > 0) {
            this.bP--;
            this.gy();
            if (this.bP == 0) {
               this.a(awl.vU, 1.0F, 1.0F);
               this.bQ = 20;
            }
         }
      }
   }

   private void gy() {
      if (this.ae.a(6) == 0) {
         double $$0 = this.dA() - (double)this.dq() * Math.sin((double)(this.aV * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         double $$1 = this.dC() + (double)this.dr() - 0.3;
         double $$2 = this.dG() + (double)this.dq() * Math.cos((double)(this.aV * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         this.dV().a(lq.a(lx.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean ff() {
      return super.ff() || this.bO > 0 || this.bP > 0 || this.bQ > 0;
   }

   @Override
   public boolean E(bwa $$0) {
      return this.bP <= 0 && this.bQ <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void d(bwz $$0) {
      if (this.bQ == 0) {
         if (this.ae.j() < 0.5) {
            this.bP = 40;
            this.a(awl.vT, 1.0F, 1.0F);
            this.dV().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.T = true;
      }
   }

   private void gz() {
      if (this.bK()) {
         if (this.dV() instanceof aro $$0) {
            Predicate<bwa> $$1 = $$0.O().c(dil.c) ? bF : bG;

            for (bwz $$3 : this.dV().a(bwz.class, this.cR().g(4.0), $$1)) {
               if (!($$3 instanceof cna)) {
                  $$3.a($$0, this.dW().b((bwz)this), 6.0F);
               }

               if (!($$3 instanceof cqs)) {
                  this.b($$3);
               }
            }

            this.a(eeo.u);
         } else {
            for (bwz $$5 : this.dV().a(bwz.class, this.cR().g(4.0), bH)) {
               this.b($$5);
            }

            fdw $$6 = this.cR().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dV().a(lx.ae, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bwa $$0) {
      double $$1 = $$0.dA() - this.dA();
      double $$2 = $$0.dG() - this.dG();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bO = 10;
         this.a(awl.vO, 1.0F, 1.0F);
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

   public int gx() {
      return this.bQ;
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
      this.bO = 10;
      $$0.a(this, (byte)4);
      this.a(awl.vO, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected awk u() {
      return awl.vN;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.vR;
   }

   @Override
   protected awk l_() {
      return awl.vQ;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.vS, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dis $$0) {
      return !$$0.d(this.cR());
   }

   @Override
   public void a(aro $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }

   @Override
   protected fdr gi() {
      fdr $$0 = super.gi();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
