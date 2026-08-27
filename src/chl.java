import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chl extends clm {
   private static final Predicate<bqa> e = $$0 -> $$0.bA() && !($$0 instanceof chl);
   private static final double bX = 0.3;
   private static final double bY = 0.35;
   private static final int bZ = 8356754;
   private static final double ca = 0.5725490196078431;
   private static final double cb = 0.5137254901960784;
   private static final double cc = 0.4980392156862745;
   private static final int cd = 10;
   public static final int b = 40;
   private int ce;
   private int cf;
   private int cg;

   public chl(bqg<? extends chl> $$0, czg $$1) {
      super($$0, $$1);
      this.bM = 20;
      this.a(els.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bxk(this));
      this.bR.a(4, new bya(this, 1.0, true));
      this.bR.a(5, new bzd(this, 0.4));
      this.bR.a(6, new bxy(this, cka.class, 6.0F));
      this.bR.a(10, new bxy(this, bqv.class, 8.0F));
      this.bS.a(2, new bzi(this, clm.class).a());
      this.bS.a(3, new bzj<>(this, cka.class, true));
      this.bS.a(4, new bzj<>(this, cji.class, true, $$0 -> !$$0.p_()));
      this.bS.a(4, new bzj<>(this, ccu.class, true));
   }

   @Override
   protected void R() {
      boolean $$0 = !(this.cN() instanceof bqv) || this.cN().ai().a(avh.c);
      boolean $$1 = !(this.cZ() instanceof clx);
      this.bR.a(bxq.a.a, $$0);
      this.bR.a(bxq.a.c, $$0 && $$1);
      this.bR.a(bxq.a.b, $$0);
      this.bR.a(bxq.a.d, $$0);
   }

   public static brz.a r() {
      return chg.gt().a(bsa.q, 100.0).a(bsa.r, 0.3).a(bsa.n, 0.75).a(bsa.c, 12.0).a(bsa.d, 1.5).a(bsa.k, 32.0).a(bsa.v, 1.0);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ce);
      $$0.a("StunTick", this.cf);
      $$0.a("RoarTick", this.cg);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.ce = $$0.h("AttackTick");
      this.cf = $$0.h("StunTick");
      this.cg = $$0.h("RoarTick");
   }

   @Override
   public aun ae_() {
      return auo.uJ;
   }

   @Override
   public int aa() {
      return 45;
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bA()) {
         if (this.fd()) {
            this.f(bsa.r).a(0.0);
         } else {
            double $$0 = this.p() != null ? 0.35 : 0.3;
            double $$1 = this.f(bsa.r).b();
            this.f(bsa.r).a(axm.d(0.1, $$1, $$0));
         }

         if (this.P && this.dM().aa().b(czc.c)) {
            boolean $$2 = false;
            ese $$3 = this.cH().g(0.2);

            for (id $$4 : id.b(axm.a($$3.a), axm.a($$3.b), axm.a($$3.c), axm.a($$3.d), axm.a($$3.e), axm.a($$3.f))) {
               dpi $$5 = this.dM().a_($$4);
               dch $$6 = $$5.b();
               if ($$6 instanceof dgq) {
                  $$2 = this.dM().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aC()) {
               this.fg();
            }
         }

         if (this.cg > 0) {
            this.cg--;
            if (this.cg == 10) {
               this.gz();
            }
         }

         if (this.ce > 0) {
            this.ce--;
         }

         if (this.cf > 0) {
            this.cf--;
            this.gy();
            if (this.cf == 0) {
               this.a(auo.uO, 1.0F, 1.0F);
               this.cg = 20;
            }
         }
      }
   }

   private void gy() {
      if (this.ag.a(6) == 0) {
         double $$0 = this.dr() - (double)this.dg() * Math.sin((double)(this.aX * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         double $$1 = this.dt() + (double)this.dh() - 0.3;
         double $$2 = this.dx() + (double)this.dg() * Math.cos((double)(this.aX * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         this.dM().a(kn.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean fd() {
      return super.fd() || this.ce > 0 || this.cf > 0 || this.cg > 0;
   }

   @Override
   public boolean E(bqa $$0) {
      return this.cf <= 0 && this.cg <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bqt $$0) {
      if (this.cg == 0) {
         if (this.ag.j() < 0.5) {
            this.cf = 40;
            this.a(auo.uN, 1.0F, 1.0F);
            this.dM().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.T = true;
      }
   }

   private void gz() {
      if (this.bA()) {
         for (bqt $$1 : this.dM().a(bqt.class, this.cH().g(4.0), e)) {
            if (!($$1 instanceof cgn)) {
               $$1.a(this.dN().b((bqt)this), 6.0F);
            }

            this.b($$1);
         }

         esj $$2 = this.cH().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dM().a(kn.Z, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dub.u);
      }
   }

   private void b(bqa $$0) {
      double $$1 = $$0.dr() - this.dr();
      double $$2 = $$0.dx() - this.dx();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ce = 10;
         this.a(auo.uI, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cf = 40;
      }

      super.b($$0);
   }

   public int u() {
      return this.ce;
   }

   public int gn() {
      return this.cf;
   }

   public int gx() {
      return this.cg;
   }

   @Override
   public boolean C(bqa $$0) {
      this.ce = 10;
      this.dM().a(this, (byte)4);
      this.a(auo.uI, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected aun v() {
      return auo.uH;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.uL;
   }

   @Override
   protected aun o_() {
      return auo.uK;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.uM, 0.15F, 1.0F);
   }

   @Override
   public boolean a(czj $$0) {
      return !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean go() {
      return false;
   }

   @Override
   protected ese gg() {
      ese $$0 = super.gg();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
