import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpe extends cto {
   private static final Predicate<bwt> e = $$0 -> !($$0 instanceof cpe) && $$0.bJ();
   private static final Predicate<bwt> f = $$0 -> e.test($$0) && !$$0.an().equals(bxc.g);
   private static final Predicate<bxu> bI = $$0 -> !($$0 instanceof cpe) && $$0.bJ() && $$0.dg();
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

   public cpe(bxc<? extends cpe> $$0, djx $$1) {
      super($$0, $$1);
      this.bA = 20;
      this.a(eyf.v, 0.0F);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cek(this));
      this.bF.a(4, new cfa(this, 1.0, true));
      this.bF.a(5, new cgd(this, 0.4));
      this.bF.a(6, new cey(this, crx.class, 6.0F));
      this.bF.a(10, new cey(this, bxw.class, 8.0F));
      this.bG.a(2, new cgi(this, cto.class).a());
      this.bG.a(3, new cgj<>(this, crx.class, true));
      this.bG.a(4, new cgj<>(this, cre.class, true, ($$0, $$1) -> !$$0.n_()));
      this.bG.a(4, new cgj<>(this, cka.class, true));
   }

   @Override
   protected void V() {
      boolean $$0 = !(this.cW() instanceof bxw) || this.cW().an().a(axh.c);
      boolean $$1 = !(this.dk() instanceof cui);
      this.bF.a(ceq.a.a, $$0);
      this.bF.a(ceq.a.c, $$0 && $$1);
      this.bF.a(ceq.a.b, $$0);
      this.bF.a(ceq.a.d, $$0);
   }

   public static byz.a j() {
      return coz.gx().a(bza.s, 100.0).a(bza.v, 0.3).a(bza.p, 0.75).a(bza.c, 12.0).a(bza.d, 1.5).a(bza.m, 32.0).a(bza.B, 1.0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.bS);
      $$0.a("StunTick", this.bT);
      $$0.a("RoarTick", this.bU);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bS = $$0.b("AttackTick", 0);
      this.bT = $$0.b("StunTick", 0);
      this.bU = $$0.b("RoarTick", 0);
   }

   @Override
   public awo ai_() {
      return awp.vT;
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
            this.g(bza.v).a(0.0);
         } else {
            double $$0 = this.f() != null ? 0.35 : 0.3;
            double $$1 = this.g(bza.v).b();
            this.g(bza.v).a(azo.d(0.1, $$1, $$0));
         }

         if (this.dV() instanceof ars $$2 && this.P && $$2.O().c(djt.d)) {
            boolean $$3 = false;
            ffl $$4 = this.cR().g(0.2);

            for (iv $$5 : iv.b(azo.a($$4.a), azo.a($$4.b), azo.a($$4.c), azo.a($$4.d), azo.a($$4.e), azo.a($$4.f))) {
               ebe $$6 = $$2.a_($$5);
               dnc $$7 = $$6.b();
               if ($$7 instanceof drs) {
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
               this.a(awp.vY, 1.0F, 1.0F);
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
         this.dV().a(lr.a(ly.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fg() {
      return super.fg() || this.bS > 0 || this.bT > 0 || this.bU > 0;
   }

   @Override
   public boolean E(bwt $$0) {
      return this.bT <= 0 && this.bU <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void d(bxu $$0) {
      if (this.bU == 0) {
         if (this.ae.j() < 0.5) {
            this.bT = 40;
            this.a(awp.vX, 1.0F, 1.0F);
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
         if (this.dV() instanceof ars $$0) {
            Predicate<bwt> $$1 = $$0.O().c(djt.d) ? e : f;

            for (bxu $$3 : this.dV().a(bxu.class, this.cR().g(4.0), $$1)) {
               if (!($$3 instanceof cof)) {
                  $$3.a($$0, this.dW().b((bxu)this), 6.0F);
               }

               if (!($$3 instanceof crx)) {
                  this.b($$3);
               }
            }

            this.a(ege.u);
         } else {
            for (bxu $$5 : this.dV().a(bxu.class, this.cR().g(4.0), bI)) {
               this.b($$5);
            }

            ffq $$6 = this.cR().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dV().a(ly.ae, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bwt $$0) {
      double $$1 = $$0.dA() - this.dA();
      double $$2 = $$0.dG() - this.dG();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.i($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bS = 10;
         this.a(awp.vS, 1.0F, 1.0F);
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
   public boolean c(ars $$0, bwt $$1) {
      this.bS = 10;
      $$0.a(this, (byte)4);
      this.a(awp.vS, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected awo u() {
      return awp.vR;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.vV;
   }

   @Override
   protected awo l_() {
      return awp.vU;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.vW, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dka $$0) {
      return !$$0.d(this.cR());
   }

   @Override
   public void a(ars $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean t() {
      return false;
   }

   @Override
   protected ffl gm() {
      ffl $$0 = super.gm();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
