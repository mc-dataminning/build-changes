import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckk extends col {
   private static final Predicate<bsw> e = $$0 -> $$0.bD() && !($$0 instanceof ckk);
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

   public ckk(btc<? extends ckk> $$0, dca $$1) {
      super($$0, $$1);
      this.bN = 20;
      this.a(eoo.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new caj(this));
      this.bS.a(4, new caz(this, 1.0, true));
      this.bS.a(5, new ccc(this, 0.4));
      this.bS.a(6, new cax(this, cmz.class, 6.0F));
      this.bS.a(10, new cax(this, btt.class, 8.0F));
      this.bT.a(2, new cch(this, col.class).a());
      this.bT.a(3, new cci<>(this, cmz.class, true));
      this.bT.a(4, new cci<>(this, cmh.class, true, $$0 -> !$$0.p_()));
      this.bT.a(4, new cci<>(this, cft.class, true));
   }

   @Override
   protected void S() {
      boolean $$0 = !(this.cQ() instanceof btt) || this.cQ().ak().a(awt.c);
      boolean $$1 = !(this.dc() instanceof cox);
      this.bS.a(cap.a.a, $$0);
      this.bS.a(cap.a.c, $$0 && $$1);
      this.bS.a(cap.a.b, $$0);
      this.bS.a(cap.a.d, $$0);
   }

   public static buy.a s() {
      return ckf.gw().a(buz.q, 100.0).a(buz.r, 0.3).a(buz.n, 0.75).a(buz.c, 12.0).a(buz.d, 1.5).a(buz.k, 32.0).a(buz.v, 1.0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.cf);
      $$0.a("StunTick", this.cg);
      $$0.a("RoarTick", this.ch);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.cf = $$0.h("AttackTick");
      this.cg = $$0.h("StunTick");
      this.ch = $$0.h("RoarTick");
   }

   @Override
   public avz ae_() {
      return awa.vc;
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
            this.f(buz.r).a(0.0);
         } else {
            double $$0 = this.p() != null ? 0.35 : 0.3;
            double $$1 = this.f(buz.r).b();
            this.f(buz.r).a(ayz.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dP().ab().b(dbw.c)) {
            boolean $$2 = false;
            evo $$3 = this.cK().g(0.2);

            for (iz $$4 : iz.b(ayz.a($$3.a), ayz.a($$3.b), ayz.a($$3.c), ayz.a($$3.d), ayz.a($$3.e), ayz.a($$3.f))) {
               dse $$5 = this.dP().a_($$4);
               dfb $$6 = $$5.b();
               if ($$6 instanceof djl) {
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
               this.a(awa.vh, 1.0F, 1.0F);
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
         this.dP().a(lb.a(li.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fg() {
      return super.fg() || this.cf > 0 || this.cg > 0 || this.ch > 0;
   }

   @Override
   public boolean E(bsw $$0) {
      return this.cg <= 0 && this.ch <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(btr $$0) {
      if (this.ch == 0) {
         if (this.ah.j() < 0.5) {
            this.cg = 40;
            this.a(awa.vg, 1.0F, 1.0F);
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
         for (btr $$1 : this.dP().a(btr.class, this.cK().g(4.0), e)) {
            if (!($$1 instanceof cjm)) {
               $$1.a(this.dQ().b((btr)this), 6.0F);
            }

            this.b($$1);
         }

         evt $$2 = this.cK().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ah.k() * 0.2;
            double $$5 = this.ah.k() * 0.2;
            double $$6 = this.ah.k() * 0.2;
            this.dP().a(li.ab, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dwx.u);
      }
   }

   private void b(bsw $$0) {
      double $$1 = $$0.du() - this.du();
      double $$2 = $$0.dA() - this.dA();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(awa.vb, 1.0F, 1.0F);
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
   public boolean C(bsw $$0) {
      this.cf = 10;
      this.dP().a(this, (byte)4);
      this.a(awa.vb, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected avz v() {
      return awa.va;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.ve;
   }

   @Override
   protected avz o_() {
      return awa.vd;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(awa.vf, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dcd $$0) {
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
   protected evo gj() {
      evo $$0 = super.gj();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
