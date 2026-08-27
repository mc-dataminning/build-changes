import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjh extends cni {
   private static final Predicate<bru> e = $$0 -> $$0.bD() && !($$0 instanceof cjh);
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

   public cjh(bsa<? extends cjh> $$0, dax $$1) {
      super($$0, $$1);
      this.bN = 20;
      this.a(enl.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bzg(this));
      this.bS.a(4, new bzw(this, 1.0, true));
      this.bS.a(5, new caz(this, 0.4));
      this.bS.a(6, new bzu(this, clw.class, 6.0F));
      this.bS.a(10, new bzu(this, bsq.class, 8.0F));
      this.bT.a(2, new cbe(this, cni.class).a());
      this.bT.a(3, new cbf<>(this, clw.class, true));
      this.bT.a(4, new cbf<>(this, cle.class, true, $$0 -> !$$0.p_()));
      this.bT.a(4, new cbf<>(this, ceq.class, true));
   }

   @Override
   protected void R() {
      boolean $$0 = !(this.cQ() instanceof bsq) || this.cQ().ak().a(avz.c);
      boolean $$1 = !(this.dc() instanceof cnt);
      this.bS.a(bzm.a.a, $$0);
      this.bS.a(bzm.a.c, $$0 && $$1);
      this.bS.a(bzm.a.b, $$0);
      this.bS.a(bzm.a.d, $$0);
   }

   public static btv.a s() {
      return cjc.gv().a(btw.q, 100.0).a(btw.r, 0.3).a(btw.n, 0.75).a(btw.c, 12.0).a(btw.d, 1.5).a(btw.k, 32.0).a(btw.v, 1.0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.cf);
      $$0.a("StunTick", this.cg);
      $$0.a("RoarTick", this.ch);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.cf = $$0.h("AttackTick");
      this.cg = $$0.h("StunTick");
      this.ch = $$0.h("RoarTick");
   }

   @Override
   public avg ae_() {
      return avh.vc;
   }

   @Override
   public int aa() {
      return 45;
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bD()) {
         if (this.fg()) {
            this.f(btw.r).a(0.0);
         } else {
            double $$0 = this.p() != null ? 0.35 : 0.3;
            double $$1 = this.f(btw.r).b();
            this.f(btw.r).a(ayd.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dP().aa().b(dat.c)) {
            boolean $$2 = false;
            euf $$3 = this.cK().g(0.2);

            for (io $$4 : io.b(ayd.a($$3.a), ayd.a($$3.b), ayd.a($$3.c), ayd.a($$3.d), ayd.a($$3.e), ayd.a($$3.f))) {
               drb $$5 = this.dP().a_($$4);
               ddy $$6 = $$5.b();
               if ($$6 instanceof dii) {
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
               this.gB();
            }
         }

         if (this.cf > 0) {
            this.cf--;
         }

         if (this.cg > 0) {
            this.cg--;
            this.gA();
            if (this.cg == 0) {
               this.a(avh.vh, 1.0F, 1.0F);
               this.ch = 20;
            }
         }
      }
   }

   private void gA() {
      if (this.ah.a(6) == 0) {
         double $$0 = this.du() - (double)this.dj() * Math.sin((double)(this.aZ * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         double $$1 = this.dw() + (double)this.dk() - 0.3;
         double $$2 = this.dA() + (double)this.dj() * Math.cos((double)(this.aZ * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         this.dP().a(kq.a(ky.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fg() {
      return super.fg() || this.cf > 0 || this.cg > 0 || this.ch > 0;
   }

   @Override
   public boolean E(bru $$0) {
      return this.cg <= 0 && this.ch <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bso $$0) {
      if (this.ch == 0) {
         if (this.ah.j() < 0.5) {
            this.cg = 40;
            this.a(avh.vg, 1.0F, 1.0F);
            this.dP().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.U = true;
      }
   }

   private void gB() {
      if (this.bD()) {
         for (bso $$1 : this.dP().a(bso.class, this.cK().g(4.0), e)) {
            if (!($$1 instanceof cij)) {
               $$1.a(this.dQ().b((bso)this), 6.0F);
            }

            this.b($$1);
         }

         euk $$2 = this.cK().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ah.k() * 0.2;
            double $$5 = this.ah.k() * 0.2;
            double $$6 = this.ah.k() * 0.2;
            this.dP().a(ky.ab, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dvu.u);
      }
   }

   private void b(bru $$0) {
      double $$1 = $$0.du() - this.du();
      double $$2 = $$0.dA() - this.dA();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(avh.vb, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cg = 40;
      }

      super.b($$0);
   }

   public int u() {
      return this.cf;
   }

   public int gp() {
      return this.cg;
   }

   public int gz() {
      return this.ch;
   }

   @Override
   public boolean C(bru $$0) {
      this.cf = 10;
      this.dP().a(this, (byte)4);
      this.a(avh.vb, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected avg v() {
      return avh.va;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.ve;
   }

   @Override
   protected avg o_() {
      return avh.vd;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.vf, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dba $$0) {
      return !$$0.d(this.cK());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gq() {
      return false;
   }

   @Override
   protected euf gi() {
      euf $$0 = super.gi();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
