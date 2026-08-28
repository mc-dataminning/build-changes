import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckd extends coe {
   private static final Predicate<bsp> e = $$0 -> $$0.bD() && !($$0 instanceof ckd);
   private static final double bY = 0.3;
   private static final double bZ = 0.35;
   private static final int ca = 8356754;
   private static final float cb = 0.57254905F;
   private static final float cc = 0.5137255F;
   private static final float cd = 0.49803922F;
   private static final int ce = 10;
   public static final int b = 40;
   private int cf;
   private int cg;
   private int ch;

   public ckd(bsv<? extends ckd> $$0, dbt $$1) {
      super($$0, $$1);
      this.bN = 20;
      this.a(eoh.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cac(this));
      this.bS.a(4, new cas(this, 1.0, true));
      this.bS.a(5, new cbv(this, 0.4));
      this.bS.a(6, new caq(this, cms.class, 6.0F));
      this.bS.a(10, new caq(this, btm.class, 8.0F));
      this.bT.a(2, new cca(this, coe.class).a());
      this.bT.a(3, new ccb<>(this, cms.class, true));
      this.bT.a(4, new ccb<>(this, cma.class, true, $$0 -> !$$0.p_()));
      this.bT.a(4, new ccb<>(this, cfm.class, true));
   }

   @Override
   protected void S() {
      boolean $$0 = !(this.cQ() instanceof btm) || this.cQ().ak().a(awp.c);
      boolean $$1 = !(this.dc() instanceof coq);
      this.bS.a(cai.a.a, $$0);
      this.bS.a(cai.a.c, $$0 && $$1);
      this.bS.a(cai.a.b, $$0);
      this.bS.a(cai.a.d, $$0);
   }

   public static bur.a s() {
      return cjy.gw().a(bus.q, 100.0).a(bus.r, 0.3).a(bus.n, 0.75).a(bus.c, 12.0).a(bus.d, 1.5).a(bus.k, 32.0).a(bus.v, 1.0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.cf);
      $$0.a("StunTick", this.cg);
      $$0.a("RoarTick", this.ch);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.cf = $$0.h("AttackTick");
      this.cg = $$0.h("StunTick");
      this.ch = $$0.h("RoarTick");
   }

   @Override
   public avv ae_() {
      return avw.vc;
   }

   @Override
   public int ab() {
      return 45;
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bD()) {
         if (this.fg()) {
            this.f(bus.r).a(0.0);
         } else {
            double $$0 = this.p() != null ? 0.35 : 0.3;
            double $$1 = this.f(bus.r).b();
            this.f(bus.r).a(ayu.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dP().ab().b(dbp.c)) {
            boolean $$2 = false;
            evh $$3 = this.cK().g(0.2);

            for (iz $$4 : iz.b(ayu.a($$3.a), ayu.a($$3.b), ayu.a($$3.c), ayu.a($$3.d), ayu.a($$3.e), ayu.a($$3.f))) {
               drx $$5 = this.dP().a_($$4);
               deu $$6 = $$5.b();
               if ($$6 instanceof dje) {
                  $$2 = this.dP().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aE()) {
               this.fj();
            }
         }

         if (this.ch > 0) {
            this.ch--;
            if (this.ch == 10) {
               this.gC();
            }
         }

         if (this.cf > 0) {
            this.cf--;
         }

         if (this.cg > 0) {
            this.cg--;
            this.gB();
            if (this.cg == 0) {
               this.a(avw.vh, 1.0F, 1.0F);
               this.ch = 20;
            }
         }
      }
   }

   private void gB() {
      if (this.ah.a(6) == 0) {
         double $$0 = this.du() - (double)this.dj() * Math.sin((double)(this.aY * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         double $$1 = this.dw() + (double)this.dk() - 0.3;
         double $$2 = this.dA() + (double)this.dj() * Math.cos((double)(this.aY * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         this.dP().a(lb.a(lj.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fg() {
      return super.fg() || this.cf > 0 || this.cg > 0 || this.ch > 0;
   }

   @Override
   public boolean E(bsp $$0) {
      return this.cg <= 0 && this.ch <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(btk $$0) {
      if (this.ch == 0) {
         if (this.ah.j() < 0.5) {
            this.cg = 40;
            this.a(avw.vg, 1.0F, 1.0F);
            this.dP().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.U = true;
      }
   }

   private void gC() {
      if (this.bD()) {
         for (btk $$1 : this.dP().a(btk.class, this.cK().g(4.0), e)) {
            if (!($$1 instanceof cjf)) {
               $$1.a(this.dQ().b((btk)this), 6.0F);
            }

            this.b($$1);
         }

         evm $$2 = this.cK().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ah.k() * 0.2;
            double $$5 = this.ah.k() * 0.2;
            double $$6 = this.ah.k() * 0.2;
            this.dP().a(lj.ab, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dwq.u);
      }
   }

   private void b(bsp $$0) {
      double $$1 = $$0.du() - this.du();
      double $$2 = $$0.dA() - this.dA();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(avw.vb, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cg = 40;
      }

      super.b($$0);
   }

   public int u() {
      return this.cf;
   }

   public int gq() {
      return this.cg;
   }

   public int gA() {
      return this.ch;
   }

   @Override
   public boolean C(bsp $$0) {
      this.cf = 10;
      this.dP().a(this, (byte)4);
      this.a(avw.vb, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected avv v() {
      return avw.va;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.ve;
   }

   @Override
   protected avv o_() {
      return avw.vd;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.vf, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dbw $$0) {
      return !$$0.d(this.cK());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gr() {
      return false;
   }

   @Override
   protected evh gj() {
      evh $$0 = super.gj();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
