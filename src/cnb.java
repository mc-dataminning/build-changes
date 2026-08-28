import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnb extends crk {
   private static final Predicate<bvj> bZ = $$0 -> !($$0 instanceof cnb) && $$0.bL();
   private static final Predicate<bvj> ca = $$0 -> bZ.test($$0) && !$$0.aq().equals(bvq.f);
   private static final Predicate<bwf> cb = $$0 -> !($$0 instanceof cnb) && $$0.bL() && $$0.di();
   private static final double cc = 0.3;
   private static final double cd = 0.35;
   private static final int ce = 8356754;
   private static final float cf = 0.57254905F;
   private static final float cg = 0.5137255F;
   private static final float ch = 0.49803922F;
   public static final int a = 10;
   public static final int b = 40;
   private int ci;
   private int cj;
   private int ck;

   public cnb(bvq<? extends cnb> $$0, dhh $$1) {
      super($$0, $$1);
      this.bO = 20;
      this.a(eun.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccx(this));
      this.bT.a(3, new cck<>(this, coa.class, 8.0F, 1.0, 1.2));
      this.bT.a(4, new cdn(this, 1.0, true));
      this.bT.a(5, new ceq(this, 0.4));
      this.bT.a(6, new cdl(this, cpw.class, 6.0F));
      this.bT.a(10, new cdl(this, bwh.class, 8.0F));
      this.bU.a(2, new cev(this, crk.class).a());
      this.bU.a(3, new cew<>(this, cpw.class, true));
      this.bU.a(4, new cew<>(this, cpd.class, true, ($$0, $$1) -> !$$0.e_()));
      this.bU.a(4, new cew<>(this, cii.class, true));
   }

   @Override
   protected void T() {
      boolean $$0 = !(this.cX() instanceof bwh) || this.cX().aq().a(axy.c);
      boolean $$1 = !(this.dk() instanceof crt);
      this.bT.a(cdd.a.a, $$0);
      this.bT.a(cdd.a.c, $$0 && $$1);
      this.bT.a(cdd.a.b, $$0);
      this.bT.a(cdd.a.d, $$0);
   }

   public static bxm.a m() {
      return cmw.gr().a(bxn.s, 100.0).a(bxn.v, 0.3).a(bxn.p, 0.75).a(bxn.c, 12.0).a(bxn.d, 1.5).a(bxn.m, 32.0).a(bxn.B, 1.0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ci);
      $$0.a("StunTick", this.cj);
      $$0.a("RoarTick", this.ck);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.ci = $$0.h("AttackTick");
      this.cj = $$0.h("StunTick");
      this.ck = $$0.h("RoarTick");
   }

   @Override
   public axe ak_() {
      return axf.vz;
   }

   @Override
   public int aa() {
      return 45;
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bL()) {
         if (this.fg()) {
            this.g(bxn.v).a(0.0);
         } else {
            double $$0 = this.O_() != null ? 0.35 : 0.3;
            double $$1 = this.g(bxn.v).b();
            this.g(bxn.v).a(bae.d(0.1, $$1, $$0));
         }

         if (this.dV() instanceof ash $$2 && this.P && $$2.N().b(dhd.c)) {
            boolean $$3 = false;
            fbs $$4 = this.cR().g(0.2);

            for (jh $$5 : jh.b(bae.a($$4.a), bae.a($$4.b), bae.a($$4.c), bae.a($$4.d), bae.a($$4.e), bae.a($$4.f))) {
               dxu $$6 = $$2.a_($$5);
               dkl $$7 = $$6.b();
               if ($$7 instanceof dox) {
                  $$3 = $$2.a($$5, true, this) || $$3;
               }
            }

            if (!$$3 && this.aJ()) {
               this.s();
            }
         }

         if (this.ck > 0) {
            this.ck--;
            if (this.ck == 10) {
               this.gx();
            }
         }

         if (this.ci > 0) {
            this.ci--;
         }

         if (this.cj > 0) {
            this.cj--;
            this.gw();
            if (this.cj == 0) {
               this.a(axf.vE, 1.0F, 1.0F);
               this.ck = 20;
            }
         }
      }
   }

   private void gw() {
      if (this.ae.a(6) == 0) {
         double $$0 = this.dA() - (double)this.dq() * Math.sin((double)(this.aX * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         double $$1 = this.dC() + (double)this.dr() - 0.3;
         double $$2 = this.dG() + (double)this.dq() * Math.cos((double)(this.aX * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         this.dV().a(ll.a(ls.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fg() {
      return super.fg() || this.ci > 0 || this.cj > 0 || this.ck > 0;
   }

   @Override
   public boolean E(bvj $$0) {
      return this.cj <= 0 && this.ck <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bwf $$0) {
      if (this.ck == 0) {
         if (this.ae.j() < 0.5) {
            this.cj = 40;
            this.a(axf.vD, 1.0F, 1.0F);
            this.dV().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.T = true;
      }
   }

   private void gx() {
      if (this.bL()) {
         if (this.dV() instanceof ash $$0) {
            Predicate<bvj> $$1 = $$0.N().b(dhd.c) ? bZ : ca;

            for (bwf $$3 : this.dV().a(bwf.class, this.cR().g(4.0), $$1)) {
               if (!($$3 instanceof cmd)) {
                  $$3.a($$0, this.dW().b((bwf)this), 6.0F);
               }

               if (!($$3 instanceof cpw)) {
                  this.b($$3);
               }
            }

            this.a(ecq.u);
         } else {
            for (bwf $$5 : this.dV().a(bwf.class, this.cR().g(4.0), cb)) {
               this.b($$5);
            }

            fbx $$6 = this.cR().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dV().a(ls.ac, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bvj $$0) {
      double $$1 = $$0.dA() - this.dA();
      double $$2 = $$0.dG() - this.dG();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ci = 10;
         this.a(axf.vy, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cj = 40;
      }

      super.b($$0);
   }

   public int p() {
      return this.ci;
   }

   public int x() {
      return this.cj;
   }

   public int gv() {
      return this.ck;
   }

   @Override
   public boolean c(ash $$0, bvj $$1) {
      this.ci = 10;
      $$0.a(this, (byte)4);
      this.a(axf.vy, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected axe u() {
      return axf.vx;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.vB;
   }

   @Override
   protected axe o_() {
      return axf.vA;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.vC, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dhk $$0) {
      return !$$0.d(this.cR());
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gm() {
      return false;
   }

   @Override
   protected fbs gc() {
      fbs $$0 = super.gc();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
