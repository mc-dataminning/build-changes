import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpp extends ctz {
   private static final Predicate<bxe> e = $$0 -> !($$0 instanceof cpp) && $$0.bJ();
   private static final Predicate<bxe> f = $$0 -> e.test($$0) && !$$0.an().equals(bxn.g);
   private static final Predicate<byf> bI = $$0 -> !($$0 instanceof cpp) && $$0.bJ() && $$0.dg();
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

   public cpp(bxn<? extends cpp> $$0, dkj $$1) {
      super($$0, $$1);
      this.bA = 20;
      this.a(eyr.v, 0.0F);
   }

   @Override
   protected void C() {
      super.C();
      this.bF.a(0, new cev(this));
      this.bF.a(4, new cfl(this, 1.0, true));
      this.bF.a(5, new cgo(this, 0.4));
      this.bF.a(6, new cfj(this, csi.class, 6.0F));
      this.bF.a(10, new cfj(this, byh.class, 8.0F));
      this.bG.a(2, new cgt(this, ctz.class).a());
      this.bG.a(3, new cgu<>(this, csi.class, true));
      this.bG.a(4, new cgu<>(this, crp.class, true, ($$0, $$1) -> !$$0.e_()));
      this.bG.a(4, new cgu<>(this, ckl.class, true));
   }

   @Override
   protected void U() {
      boolean $$0 = !(this.cW() instanceof byh) || this.cW().an().a(axq.c);
      boolean $$1 = !(this.dk() instanceof cut);
      this.bF.a(cfb.a.a, $$0);
      this.bF.a(cfb.a.c, $$0 && $$1);
      this.bF.a(cfb.a.b, $$0);
      this.bF.a(cfb.a.d, $$0);
   }

   public static bzk.a m() {
      return cpk.gA().a(bzl.s, 100.0).a(bzl.v, 0.3).a(bzl.p, 0.75).a(bzl.c, 12.0).a(bzl.d, 1.5).a(bzl.m, 32.0).a(bzl.B, 1.0);
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
   public awx af_() {
      return awy.vT;
   }

   @Override
   public int ae() {
      return 45;
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bJ()) {
         if (this.fg()) {
            this.g(bzl.v).a(0.0);
         } else {
            double $$0 = this.e() != null ? 0.35 : 0.3;
            double $$1 = this.g(bzl.v).b();
            this.g(bzl.v).a(azz.d(0.1, $$1, $$0));
         }

         if (this.dV() instanceof asb $$2 && this.P && $$2.O().c(dkf.d)) {
            boolean $$3 = false;
            ffx $$4 = this.cR().g(0.2);

            for (iw $$5 : iw.b(azz.a($$4.a), azz.a($$4.b), azz.a($$4.c), azz.a($$4.d), azz.a($$4.e), azz.a($$4.f))) {
               ebq $$6 = $$2.a_($$5);
               dno $$7 = $$6.b();
               if ($$7 instanceof dse) {
                  $$3 = $$2.a($$5, true, this) || $$3;
               }
            }

            if (!$$3 && this.aH()) {
               this.r();
            }
         }

         if (this.bU > 0) {
            this.bU--;
            if (this.bU == 10) {
               this.gG();
            }
         }

         if (this.bS > 0) {
            this.bS--;
         }

         if (this.bT > 0) {
            this.bT--;
            this.gF();
            if (this.bT == 0) {
               this.a(awy.vY, 1.0F, 1.0F);
               this.bU = 20;
            }
         }
      }
   }

   private void gF() {
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
   public boolean E(bxe $$0) {
      return this.bT <= 0 && this.bU <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void d(byf $$0) {
      if (this.bU == 0) {
         if (this.ae.j() < 0.5) {
            this.bT = 40;
            this.a(awy.vX, 1.0F, 1.0F);
            this.dV().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.T = true;
      }
   }

   private void gG() {
      if (this.bJ()) {
         if (this.dV() instanceof asb $$0) {
            Predicate<bxe> $$1 = $$0.O().c(dkf.d) ? e : f;

            for (byf $$3 : this.dV().a(byf.class, this.cR().g(4.0), $$1)) {
               if (!($$3 instanceof cor)) {
                  $$3.a($$0, this.dW().b((byf)this), 6.0F);
               }

               if (!($$3 instanceof csi)) {
                  this.b($$3);
               }
            }

            this.a(egq.u);
         } else {
            for (byf $$5 : this.dV().a(byf.class, this.cR().g(4.0), bI)) {
               this.b($$5);
            }

            fgc $$6 = this.cR().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dV().a(lz.ae, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bxe $$0) {
      double $$1 = $$0.dA() - this.dA();
      double $$2 = $$0.dG() - this.dG();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.i($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bS = 10;
         this.a(awy.vS, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.bT = 40;
      }

      super.b($$0);
   }

   public int p() {
      return this.bS;
   }

   public int gu() {
      return this.bT;
   }

   public int gE() {
      return this.bU;
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
      this.bS = 10;
      $$0.a(this, (byte)4);
      this.a(awy.vS, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected awx s() {
      return awy.vR;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.vV;
   }

   @Override
   protected awx j_() {
      return awy.vU;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.vW, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dkm $$0) {
      return !$$0.d(this.cR());
   }

   @Override
   public void a(asb $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gv() {
      return false;
   }

   @Override
   protected ffx gm() {
      ffx $$0 = super.gm();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
