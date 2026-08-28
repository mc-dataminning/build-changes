import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cli extends cpm {
   private static final Predicate<btr> bY = $$0 -> $$0.bI() && !($$0 instanceof cli) && ($$0.dS().ac().b(def.c) || !$$0.ao().equals(bty.d));
   private static final double bZ = 0.3;
   private static final double ca = 0.35;
   private static final int cb = 8356754;
   private static final float cc = 0.57254905F;
   private static final float cd = 0.5137255F;
   private static final float ce = 0.49803922F;
   public static final int b = 10;
   public static final int c = 40;
   private int cf;
   private int cg;
   private int ch;

   public cli(bty<? extends cli> $$0, dej $$1) {
      super($$0, $$1);
      this.bN = 20;
      this.a(erk.v, 0.0F);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbe(this));
      this.bS.a(4, new cbu(this, 1.0, true));
      this.bS.a(5, new ccx(this, 0.4));
      this.bS.a(6, new cbs(this, cnx.class, 6.0F));
      this.bS.a(10, new cbs(this, bup.class, 8.0F));
      this.bT.a(2, new cdc(this, cpm.class).a());
      this.bT.a(3, new cdd<>(this, cnx.class, true));
      this.bT.a(4, new cdd<>(this, cnf.class, true, $$0 -> !$$0.p_()));
      this.bT.a(4, new cdd<>(this, cgp.class, true));
   }

   @Override
   protected void W() {
      boolean $$0 = !(this.cU() instanceof bup) || this.cU().ao().a(awz.c);
      boolean $$1 = !(this.dg() instanceof cpx);
      this.bS.a(cbk.a.a, $$0);
      this.bS.a(cbk.a.c, $$0 && $$1);
      this.bS.a(cbk.a.b, $$0);
      this.bS.a(cbk.a.d, $$0);
   }

   public static bvt.a q() {
      return cld.gu().a(bvu.s, 100.0).a(bvu.v, 0.3).a(bvu.p, 0.75).a(bvu.c, 12.0).a(bvu.d, 1.5).a(bvu.m, 32.0).a(bvu.B, 1.0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.cf);
      $$0.a("StunTick", this.cg);
      $$0.a("RoarTick", this.ch);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.cf = $$0.h("AttackTick");
      this.cg = $$0.h("StunTick");
      this.ch = $$0.h("RoarTick");
   }

   @Override
   public awf ai_() {
      return awg.vg;
   }

   @Override
   public int ae() {
      return 45;
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bI()) {
         if (this.ff()) {
            this.g(bvu.v).a(0.0);
         } else {
            double $$0 = this.m() != null ? 0.35 : 0.3;
            double $$1 = this.g(bvu.v).b();
            this.g(bvu.v).a(azf.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dS().ac().b(def.c)) {
            boolean $$2 = false;
            eyr $$3 = this.cO().g(0.2);

            for (jf $$4 : jf.b(azf.a($$3.a), azf.a($$3.b), azf.a($$3.c), azf.a($$3.d), azf.a($$3.e), azf.a($$3.f))) {
               dus $$5 = this.dS().a_($$4);
               dhm $$6 = $$5.b();
               if ($$6 instanceof dlw) {
                  $$2 = this.dS().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aH()) {
               this.v();
            }
         }

         if (this.ch > 0) {
            this.ch--;
            if (this.ch == 10) {
               this.gA();
            }
         }

         if (this.cf > 0) {
            this.cf--;
         }

         if (this.cg > 0) {
            this.cg--;
            this.gz();
            if (this.cg == 0) {
               this.a(awg.vl, 1.0F, 1.0F);
               this.ch = 20;
            }
         }
      }
   }

   private void gz() {
      if (this.af.a(6) == 0) {
         double $$0 = this.dx() - (double)this.dn() * Math.sin((double)(this.aT * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         double $$1 = this.dz() + (double)this.do() - 0.3;
         double $$2 = this.dD() + (double)this.dn() * Math.cos((double)(this.aT * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         this.dS().a(lh.a(lo.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean ff() {
      return super.ff() || this.cf > 0 || this.cg > 0 || this.ch > 0;
   }

   @Override
   public boolean G(btr $$0) {
      return this.cg <= 0 && this.ch <= 0 ? super.G($$0) : false;
   }

   @Override
   protected void e(bun $$0) {
      if (this.ch == 0) {
         if (this.af.j() < 0.5) {
            this.cg = 40;
            this.a(awg.vk, 1.0F, 1.0F);
            this.dS().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.c($$0);
         }

         $$0.U = true;
      }
   }

   private void gA() {
      if (this.bI()) {
         for (bun $$1 : this.dS().a(bun.class, this.cO().g(4.0), bY)) {
            if (!($$1 instanceof ckk)) {
               $$1.a(this.dT().b((bun)this), 6.0F);
            }

            this.c($$1);
         }

         eyw $$2 = this.cO().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.af.k() * 0.2;
            double $$5 = this.af.k() * 0.2;
            double $$6 = this.af.k() * 0.2;
            this.dS().a(lo.ab, $$2.d, $$2.e, $$2.f, $$4, $$5, $$6);
         }

         this.a(dzp.u);
      }
   }

   private void c(btr $$0) {
      double $$1 = $$0.dx() - this.dx();
      double $$2 = $$0.dD() - this.dD();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(awg.vf, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cg = 40;
      }

      super.b($$0);
   }

   public int t() {
      return this.cf;
   }

   public int go() {
      return this.cg;
   }

   public int gy() {
      return this.ch;
   }

   @Override
   public boolean E(btr $$0) {
      this.cf = 10;
      this.dS().a(this, (byte)4);
      this.a(awg.vf, 1.0F, 1.0F);
      return super.E($$0);
   }

   @Nullable
   @Override
   protected awf w() {
      return awg.ve;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.vi;
   }

   @Override
   protected awf o_() {
      return awg.vh;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.vj, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dem $$0) {
      return !$$0.d(this.cO());
   }

   @Override
   public void a(arj $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gp() {
      return false;
   }

   @Override
   protected eyr gg() {
      eyr $$0 = super.gg();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
