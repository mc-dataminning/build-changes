import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cno extends crw {
   private static final Predicate<bvs> bE = $$0 -> !($$0 instanceof cno) && $$0.bK();
   private static final Predicate<bvs> bF = $$0 -> bE.test($$0) && !$$0.aq().equals(bwb.f);
   private static final Predicate<bwr> bG = $$0 -> !($$0 instanceof cno) && $$0.bK() && $$0.dg();
   private static final double bH = 0.3;
   private static final double bI = 0.35;
   private static final int bJ = 8356754;
   private static final float bK = 0.57254905F;
   private static final float bL = 0.5137255F;
   private static final float bM = 0.49803922F;
   public static final int a = 10;
   public static final int b = 40;
   private int bN;
   private int bO;
   private int bP;

   public cno(bwb<? extends cno> $$0, dhp $$1) {
      super($$0, $$1);
      this.bw = 20;
      this.a(evk.v, 0.0F);
   }

   @Override
   protected void D() {
      super.D();
      this.bB.a(0, new cdh(this));
      this.bB.a(4, new cdx(this, 1.0, true));
      this.bB.a(5, new cfa(this, 0.4));
      this.bB.a(6, new cdv(this, cqi.class, 6.0F));
      this.bB.a(10, new cdv(this, bwt.class, 8.0F));
      this.bC.a(2, new cff(this, crw.class).a());
      this.bC.a(3, new cfg<>(this, cqi.class, true));
      this.bC.a(4, new cfg<>(this, cpp.class, true, ($$0, $$1) -> !$$0.n_()));
      this.bC.a(4, new cfg<>(this, cis.class, true));
   }

   @Override
   protected void V() {
      boolean $$0 = !(this.cW() instanceof bwt) || this.cW().aq().a(axd.c);
      boolean $$1 = !(this.dk() instanceof csf);
      this.bB.a(cdn.a.a, $$0);
      this.bB.a(cdn.a.c, $$0 && $$1);
      this.bB.a(cdn.a.b, $$0);
      this.bB.a(cdn.a.d, $$0);
   }

   public static bxw.a j() {
      return cnj.gt().a(bxx.s, 100.0).a(bxx.v, 0.3).a(bxx.p, 0.75).a(bxx.c, 12.0).a(bxx.d, 1.5).a(bxx.m, 32.0).a(bxx.B, 1.0);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.bN);
      $$0.a("StunTick", this.bO);
      $$0.a("RoarTick", this.bP);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.bN = $$0.h("AttackTick");
      this.bO = $$0.h("StunTick");
      this.bP = $$0.h("RoarTick");
   }

   @Override
   public awj ad_() {
      return awk.vP;
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
            this.g(bxx.v).a(0.0);
         } else {
            double $$0 = this.f() != null ? 0.35 : 0.3;
            double $$1 = this.g(bxx.v).b();
            this.g(bxx.v).a(azk.d(0.1, $$1, $$0));
         }

         if (this.dV() instanceof arn $$2 && this.P && $$2.O().c(dhl.c)) {
            boolean $$3 = false;
            fcp $$4 = this.cR().g(0.2);

            for (jj $$5 : jj.b(azk.a($$4.a), azk.a($$4.b), azk.a($$4.c), azk.a($$4.d), azk.a($$4.e), azk.a($$4.f))) {
               dym $$6 = $$2.a_($$5);
               dku $$7 = $$6.b();
               if ($$7 instanceof dpi) {
                  $$3 = $$2.a($$5, true, this) || $$3;
               }
            }

            if (!$$3 && this.aJ()) {
               this.s();
            }
         }

         if (this.bP > 0) {
            this.bP--;
            if (this.bP == 10) {
               this.gz();
            }
         }

         if (this.bN > 0) {
            this.bN--;
         }

         if (this.bO > 0) {
            this.bO--;
            this.gy();
            if (this.bO == 0) {
               this.a(awk.vU, 1.0F, 1.0F);
               this.bP = 20;
            }
         }
      }
   }

   private void gy() {
      if (this.ae.a(6) == 0) {
         double $$0 = this.dA() - (double)this.dq() * Math.sin((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         double $$1 = this.dC() + (double)this.dr() - 0.3;
         double $$2 = this.dG() + (double)this.dq() * Math.cos((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         this.dV().a(lo.a(lv.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean ff() {
      return super.ff() || this.bN > 0 || this.bO > 0 || this.bP > 0;
   }

   @Override
   public boolean E(bvs $$0) {
      return this.bO <= 0 && this.bP <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bwr $$0) {
      if (this.bP == 0) {
         if (this.ae.j() < 0.5) {
            this.bO = 40;
            this.a(awk.vT, 1.0F, 1.0F);
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
         if (this.dV() instanceof arn $$0) {
            Predicate<bvs> $$1 = $$0.O().c(dhl.c) ? bE : bF;

            for (bwr $$3 : this.dV().a(bwr.class, this.cR().g(4.0), $$1)) {
               if (!($$3 instanceof cmq)) {
                  $$3.a($$0, this.dW().b((bwr)this), 6.0F);
               }

               if (!($$3 instanceof cqi)) {
                  this.b($$3);
               }
            }

            this.a(edm.u);
         } else {
            for (bwr $$5 : this.dV().a(bwr.class, this.cR().g(4.0), bG)) {
               this.b($$5);
            }

            fcu $$6 = this.cR().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dV().a(lv.ae, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bvs $$0) {
      double $$1 = $$0.dA() - this.dA();
      double $$2 = $$0.dG() - this.dG();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bN = 10;
         this.a(awk.vO, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.bO = 40;
      }

      super.b($$0);
   }

   public int m() {
      return this.bN;
   }

   public int q() {
      return this.bO;
   }

   public int gx() {
      return this.bP;
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
      this.bN = 10;
      $$0.a(this, (byte)4);
      this.a(awk.vO, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected awj u() {
      return awk.vN;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.vR;
   }

   @Override
   protected awj l_() {
      return awk.vQ;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.vS, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dhs $$0) {
      return !$$0.d(this.cR());
   }

   @Override
   public void a(arn $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }

   @Override
   protected fcp gi() {
      fcp $$0 = super.gi();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
