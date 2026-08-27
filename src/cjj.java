import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjj extends cnn {
   private static final Predicate<brv> e = $$0 -> $$0.bI() && !($$0 instanceof cjj);
   private static final double ch = 0.3;
   private static final double ci = 0.35;
   private static final int cj = 8356754;
   private static final float ck = 0.57254905F;
   private static final float cl = 0.5137255F;
   private static final float cm = 0.49803922F;
   private static final int cn = 10;
   public static final int b = 40;
   private int co;
   private int cp;
   private int cq;

   public cjj(bsb<? extends cjj> $$0, dca $$1) {
      super($$0, $$1);
      this.bW = 20;
      this.a(epv.v, 0.0F);
   }

   @Override
   protected void y() {
      super.y();
      this.cb.a(0, new bzf(this));
      this.cb.a(4, new bzv(this, 1.0, true));
      this.cb.a(5, new cay(this, 0.4));
      this.cb.a(6, new bzt(this, cly.class, 6.0F));
      this.cb.a(10, new bzt(this, bsq.class, 8.0F));
      this.cc.a(2, new cbd(this, cnn.class).a());
      this.cc.a(3, new cbe<>(this, cly.class, true));
      this.cc.a(4, new cbe<>(this, clg.class, true, $$0 -> !$$0.o_()));
      this.cc.a(4, new cbe<>(this, ceq.class, true));
   }

   @Override
   protected void R() {
      boolean $$0 = !(this.cV() instanceof bsq) || this.cV().ak().a(awh.c);
      boolean $$1 = !(this.dh() instanceof cny);
      this.cb.a(bzl.a.a, $$0);
      this.cb.a(bzl.a.c, $$0 && $$1);
      this.cb.a(bzl.a.b, $$0);
      this.cb.a(bzl.a.d, $$0);
   }

   public static btu.a r() {
      return cjd.gG().a(btv.q, 100.0).a(btv.r, 0.3).a(btv.n, 0.75).a(btv.c, 12.0).a(btv.d, 1.5).a(btv.k, 32.0).a(btv.v, 1.0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.co);
      $$0.a("StunTick", this.cp);
      $$0.a("RoarTick", this.cq);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.co = $$0.h("AttackTick");
      this.cp = $$0.h("StunTick");
      this.cq = $$0.h("RoarTick");
   }

   @Override
   public avn af_() {
      return avo.vA;
   }

   @Override
   public int aa() {
      return 45;
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bI()) {
         if (this.fp()) {
            this.f(btv.r).a(0.0);
         } else {
            double $$0 = this.p() != null ? 0.35 : 0.3;
            double $$1 = this.f(btv.r).b();
            this.f(btv.r).a(aym.d(0.1, $$1, $$0));
         }

         if (this.R && this.dU().ab().b(dbw.c)) {
            boolean $$2 = false;
            ewp $$3 = this.cP().g(0.2);

            for (ir $$4 : ir.b(aym.a($$3.a), aym.a($$3.b), aym.a($$3.c), aym.a($$3.d), aym.a($$3.e), aym.a($$3.f))) {
               dtc $$5 = this.dU().a_($$4);
               dfc $$6 = $$5.b();
               if ($$6 instanceof djq) {
                  $$2 = this.dU().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aE()) {
               this.fs();
            }
         }

         if (this.cq > 0) {
            this.cq--;
            if (this.cq == 10) {
               this.gK();
            }
         }

         if (this.co > 0) {
            this.co--;
         }

         if (this.cp > 0) {
            this.cp--;
            this.gJ();
            if (this.cp == 0) {
               this.a(avo.vF, 1.0F, 1.0F);
               this.cq = 20;
            }
         }
      }
   }

   private void gJ() {
      if (this.al.a(6) == 0) {
         double $$0 = this.dz() - (double)this.do() * Math.sin((double)(this.bj * (float) (Math.PI / 180.0))) + (this.al.j() * 0.6 - 0.3);
         double $$1 = this.dB() + (double)this.dp() - 0.3;
         double $$2 = this.dF() + (double)this.do() * Math.cos((double)(this.bj * (float) (Math.PI / 180.0))) + (this.al.j() * 0.6 - 0.3);
         this.dU().a(kt.a(lb.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fp() {
      return super.fp() || this.co > 0 || this.cp > 0 || this.cq > 0;
   }

   @Override
   public boolean E(brv $$0) {
      return this.cp <= 0 && this.cq <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bso $$0) {
      if (this.cq == 0) {
         if (this.al.j() < 0.5) {
            this.cp = 40;
            this.a(avo.vE, 1.0F, 1.0F);
            this.dU().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.V = true;
      }
   }

   private void gK() {
      if (this.bI()) {
         for (bso $$1 : this.dU().a(bso.class, this.cP().g(4.0), e)) {
            if (!($$1 instanceof cij)) {
               $$1.a(this.dX().b((bso)this), 6.0F);
            }

            this.b($$1);
         }

         ewu $$2 = this.cP().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.al.k() * 0.2;
            double $$5 = this.al.k() * 0.2;
            double $$6 = this.al.k() * 0.2;
            this.dU().a(lb.Z, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dxv.u);
      }
   }

   private void b(brv $$0) {
      double $$1 = $$0.dz() - this.dz();
      double $$2 = $$0.dF() - this.dF();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.co = 10;
         this.a(avo.vz, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cp = 40;
      }

      super.b($$0);
   }

   public int t() {
      return this.co;
   }

   public int gy() {
      return this.cp;
   }

   public int gI() {
      return this.cq;
   }

   @Override
   public boolean C(brv $$0) {
      this.co = 10;
      this.dU().a(this, (byte)4);
      this.a(avo.vz, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected avn u() {
      return avo.vy;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.vC;
   }

   @Override
   protected avn n_() {
      return avo.vB;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.vD, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dcd $$0) {
      return !$$0.d(this.cP());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gz() {
      return false;
   }

   @Override
   protected ewp gr() {
      ewp $$0 = super.gr();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
