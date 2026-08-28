import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmx extends crg {
   private static final Predicate<bvf> bZ = $$0 -> !($$0 instanceof cmx) && $$0.bL();
   private static final Predicate<bvf> ca = $$0 -> bZ.test($$0) && !$$0.aq().equals(bvm.f);
   private static final Predicate<bwb> cb = $$0 -> !($$0 instanceof cmx) && $$0.bL() && $$0.di();
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

   public cmx(bvm<? extends cmx> $$0, dha $$1) {
      super($$0, $$1);
      this.bO = 20;
      this.a(eug.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new cct(this));
      this.bT.a(3, new ccg<>(this, cnw.class, 8.0F, 1.0, 1.2));
      this.bT.a(4, new cdj(this, 1.0, true));
      this.bT.a(5, new cem(this, 0.4));
      this.bT.a(6, new cdh(this, cps.class, 6.0F));
      this.bT.a(10, new cdh(this, bwd.class, 8.0F));
      this.bU.a(2, new cer(this, crg.class).a());
      this.bU.a(3, new ces<>(this, cps.class, true));
      this.bU.a(4, new ces<>(this, coz.class, true, ($$0, $$1) -> !$$0.e_()));
      this.bU.a(4, new ces<>(this, cie.class, true));
   }

   @Override
   protected void T() {
      boolean $$0 = !(this.cX() instanceof bwd) || this.cX().aq().a(axy.c);
      boolean $$1 = !(this.dk() instanceof crp);
      this.bT.a(ccz.a.a, $$0);
      this.bT.a(ccz.a.c, $$0 && $$1);
      this.bT.a(ccz.a.b, $$0);
      this.bT.a(ccz.a.d, $$0);
   }

   public static bxi.a m() {
      return cms.gr().a(bxj.s, 100.0).a(bxj.v, 0.3).a(bxj.p, 0.75).a(bxj.c, 12.0).a(bxj.d, 1.5).a(bxj.m, 32.0).a(bxj.B, 1.0);
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
      return axf.vy;
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
            this.g(bxj.v).a(0.0);
         } else {
            double $$0 = this.O_() != null ? 0.35 : 0.3;
            double $$1 = this.g(bxj.v).b();
            this.g(bxj.v).a(bae.d(0.1, $$1, $$0));
         }

         if (this.dV() instanceof ash $$2 && this.P && $$2.N().b(dgw.c)) {
            boolean $$3 = false;
            fbn $$4 = this.cR().g(0.2);

            for (jh $$5 : jh.b(bae.a($$4.a), bae.a($$4.b), bae.a($$4.c), bae.a($$4.d), bae.a($$4.e), bae.a($$4.f))) {
               dxn $$6 = $$2.a_($$5);
               dke $$7 = $$6.b();
               if ($$7 instanceof doq) {
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
               this.a(axf.vD, 1.0F, 1.0F);
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
   public boolean E(bvf $$0) {
      return this.cj <= 0 && this.ck <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bwb $$0) {
      if (this.ck == 0) {
         if (this.ae.j() < 0.5) {
            this.cj = 40;
            this.a(axf.vC, 1.0F, 1.0F);
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
            Predicate<bvf> $$1 = $$0.N().b(dgw.c) ? bZ : ca;

            for (bwb $$3 : this.dV().a(bwb.class, this.cR().g(4.0), $$1)) {
               if (!($$3 instanceof clz)) {
                  $$3.a($$0, this.dW().b((bwb)this), 6.0F);
               }

               if (!($$3 instanceof cps)) {
                  this.b($$3);
               }
            }

            this.a(ecj.u);
         } else {
            for (bwb $$5 : this.dV().a(bwb.class, this.cR().g(4.0), cb)) {
               this.b($$5);
            }

            fbs $$6 = this.cR().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dV().a(ls.ac, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bvf $$0) {
      double $$1 = $$0.dA() - this.dA();
      double $$2 = $$0.dG() - this.dG();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ci = 10;
         this.a(axf.vx, 1.0F, 1.0F);
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
   public boolean c(ash $$0, bvf $$1) {
      this.ci = 10;
      $$0.a(this, (byte)4);
      this.a(axf.vx, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected axe u() {
      return axf.vw;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.vA;
   }

   @Override
   protected axe o_() {
      return axf.vz;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.vB, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dhd $$0) {
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
   protected fbn gc() {
      fbn $$0 = super.gc();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
