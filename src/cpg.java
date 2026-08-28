import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpg extends ctq {
   private static final Predicate<bwv> e = $$0 -> !($$0 instanceof cpg) && $$0.bJ();
   private static final Predicate<bwv> f = $$0 -> e.test($$0) && !$$0.an().equals(bxe.g);
   private static final Predicate<bxw> bI = $$0 -> !($$0 instanceof cpg) && $$0.bJ() && $$0.dg();
   private static final double bJ = 0.3;
   private static final double bK = 0.35;
   private static final int bL = 8356754;
   private static final float bM = 0.57254905F;
   private static final float bN = 0.5137255F;
   private static final float bO = 0.49803922F;
   public static final int a = 10;
   public static final int b = 40;
   private static final int bP = 0;
   private static final int bQ = 0;
   private static final int bR = 0;
   private int bS = 0;
   private int bT = 0;
   private int bU = 0;

   public cpg(bxe<? extends cpg> $$0, djz $$1) {
      super($$0, $$1);
      this.bA = 20;
      this.a(eyh.v, 0.0F);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cem(this));
      this.bF.a(4, new cfc(this, 1.0, true));
      this.bF.a(5, new cgf(this, 0.4));
      this.bF.a(6, new cfa(this, crz.class, 6.0F));
      this.bF.a(10, new cfa(this, bxy.class, 8.0F));
      this.bG.a(2, new cgk(this, ctq.class).a());
      this.bG.a(3, new cgl<>(this, crz.class, true));
      this.bG.a(4, new cgl<>(this, crg.class, true, ($$0, $$1) -> !$$0.n_()));
      this.bG.a(4, new cgl<>(this, ckc.class, true));
   }

   @Override
   protected void V() {
      boolean $$0 = !(this.cW() instanceof bxy) || this.cW().an().a(axj.c);
      boolean $$1 = !(this.dk() instanceof cuk);
      this.bF.a(ces.a.a, $$0);
      this.bF.a(ces.a.c, $$0 && $$1);
      this.bF.a(ces.a.b, $$0);
      this.bF.a(ces.a.d, $$0);
   }

   public static bzb.a j() {
      return cpb.gx().a(bzc.s, 100.0).a(bzc.v, 0.3).a(bzc.p, 0.75).a(bzc.c, 12.0).a(bzc.d, 1.5).a(bzc.m, 32.0).a(bzc.B, 1.0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.bS);
      $$0.a("StunTick", this.bT);
      $$0.a("RoarTick", this.bU);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.bS = $$0.b("AttackTick", 0);
      this.bT = $$0.b("StunTick", 0);
      this.bU = $$0.b("RoarTick", 0);
   }

   @Override
   public awq ai_() {
      return awr.vT;
   }

   @Override
   public int af() {
      return 45;
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bJ()) {
         if (this.fg()) {
            this.g(bzc.v).a(0.0);
         } else {
            double $$0 = this.f() != null ? 0.35 : 0.3;
            double $$1 = this.g(bzc.v).b();
            this.g(bzc.v).a(azq.d(0.1, $$1, $$0));
         }

         if (this.dV() instanceof aru $$2 && this.P && $$2.O().c(djv.d)) {
            boolean $$3 = false;
            ffn $$4 = this.cR().g(0.2);

            for (iw $$5 : iw.b(azq.a($$4.a), azq.a($$4.b), azq.a($$4.c), azq.a($$4.d), azq.a($$4.e), azq.a($$4.f))) {
               ebg $$6 = $$2.a_($$5);
               dne $$7 = $$6.b();
               if ($$7 instanceof dru) {
                  $$3 = $$2.a($$5, true, this) || $$3;
               }
            }

            if (!$$3 && this.aH()) {
               this.s();
            }
         }

         if (this.bU > 0) {
            this.bU--;
            if (this.bU == 10) {
               this.gD();
            }
         }

         if (this.bS > 0) {
            this.bS--;
         }

         if (this.bT > 0) {
            this.bT--;
            this.gC();
            if (this.bT == 0) {
               this.a(awr.vY, 1.0F, 1.0F);
               this.bU = 20;
            }
         }
      }
   }

   private void gC() {
      if (this.ae.a(6) == 0) {
         double $$0 = this.dA() - (double)this.dq() * Math.sin((double)(this.aV * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         double $$1 = this.dC() + (double)this.dr() - 0.3;
         double $$2 = this.dG() + (double)this.dq() * Math.cos((double)(this.aV * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         this.dV().a(ls.a(lz.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fg() {
      return super.fg() || this.bS > 0 || this.bT > 0 || this.bU > 0;
   }

   @Override
   public boolean E(bwv $$0) {
      return this.bT <= 0 && this.bU <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void d(bxw $$0) {
      if (this.bU == 0) {
         if (this.ae.j() < 0.5) {
            this.bT = 40;
            this.a(awr.vX, 1.0F, 1.0F);
            this.dV().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.T = true;
      }
   }

   private void gD() {
      if (this.bJ()) {
         if (this.dV() instanceof aru $$0) {
            Predicate<bwv> $$1 = $$0.O().c(djv.d) ? e : f;

            for (bxw $$3 : this.dV().a(bxw.class, this.cR().g(4.0), $$1)) {
               if (!($$3 instanceof coh)) {
                  $$3.a($$0, this.dW().b((bxw)this), 6.0F);
               }

               if (!($$3 instanceof crz)) {
                  this.b($$3);
               }
            }

            this.a(egg.u);
         } else {
            for (bxw $$5 : this.dV().a(bxw.class, this.cR().g(4.0), bI)) {
               this.b($$5);
            }

            ffs $$6 = this.cR().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dV().a(lz.ae, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bwv $$0) {
      double $$1 = $$0.dA() - this.dA();
      double $$2 = $$0.dG() - this.dG();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.i($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bS = 10;
         this.a(awr.vS, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.bT = 40;
      }

      super.b($$0);
   }

   public int m() {
      return this.bS;
   }

   public int q() {
      return this.bT;
   }

   public int gB() {
      return this.bU;
   }

   @Override
   public boolean c(aru $$0, bwv $$1) {
      this.bS = 10;
      $$0.a(this, (byte)4);
      this.a(awr.vS, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected awq u() {
      return awr.vR;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.vV;
   }

   @Override
   protected awq l_() {
      return awr.vU;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.vW, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dkc $$0) {
      return !$$0.d(this.cR());
   }

   @Override
   public void a(aru $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }

   @Override
   protected ffn gm() {
      ffn $$0 = super.gm();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
