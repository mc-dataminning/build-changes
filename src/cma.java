import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cma extends cqf {
   private static final Predicate<bui> bY = $$0 -> $$0.bN() && !($$0 instanceof cma) && ($$0.dY().ac().b(dfb.c) || !$$0.ar().equals(bup.d));
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

   public cma(bup<? extends cma> $$0, dff $$1) {
      super($$0, $$1);
      this.bN = 20;
      this.a(esf.v, 0.0F);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbw(this));
      this.bS.a(4, new ccm(this, 1.0, true));
      this.bS.a(5, new cdp(this, 0.4));
      this.bS.a(6, new cck(this, cor.class, 6.0F));
      this.bS.a(10, new cck(this, bvg.class, 8.0F));
      this.bT.a(2, new cdu(this, cqf.class).a());
      this.bT.a(3, new cdv<>(this, cor.class, true));
      this.bT.a(4, new cdv<>(this, cnx.class, true, $$0 -> !$$0.p_()));
      this.bT.a(4, new cdv<>(this, chh.class, true));
   }

   @Override
   protected void W() {
      boolean $$0 = !(this.cZ() instanceof bvg) || this.cZ().ar().a(axh.c);
      boolean $$1 = !(this.dm() instanceof cqq);
      this.bS.a(ccc.a.a, $$0);
      this.bS.a(ccc.a.c, $$0 && $$1);
      this.bS.a(ccc.a.b, $$0);
      this.bS.a(ccc.a.d, $$0);
   }

   public static bwl.a q() {
      return clv.gB().a(bwm.s, 100.0).a(bwm.v, 0.3).a(bwm.p, 0.75).a(bwm.c, 12.0).a(bwm.d, 1.5).a(bwm.m, 32.0).a(bwm.B, 1.0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.cf);
      $$0.a("StunTick", this.cg);
      $$0.a("RoarTick", this.ch);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.cf = $$0.h("AttackTick");
      this.cg = $$0.h("StunTick");
      this.ch = $$0.h("RoarTick");
   }

   @Override
   public awn aj_() {
      return awo.ve;
   }

   @Override
   public int ae() {
      return 45;
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bN()) {
         if (this.fl()) {
            this.g(bwm.v).a(0.0);
         } else {
            double $$0 = this.m() != null ? 0.35 : 0.3;
            double $$1 = this.g(bwm.v).b();
            this.g(bwm.v).a(azn.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dY().ac().b(dfb.c)) {
            boolean $$2 = false;
            ezm $$3 = this.cT().g(0.2);

            for (jh $$4 : jh.b(azn.a($$3.a), azn.a($$3.b), azn.a($$3.c), azn.a($$3.d), azn.a($$3.e), azn.a($$3.f))) {
               dvo $$5 = this.dY().a_($$4);
               dij $$6 = $$5.b();
               if ($$6 instanceof dms) {
                  $$2 = this.dY().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aL()) {
               this.v();
            }
         }

         if (this.ch > 0) {
            this.ch--;
            if (this.ch == 10) {
               this.gH();
            }
         }

         if (this.cf > 0) {
            this.cf--;
         }

         if (this.cg > 0) {
            this.cg--;
            this.gG();
            if (this.cg == 0) {
               this.a(awo.vj, 1.0F, 1.0F);
               this.ch = 20;
            }
         }
      }
   }

   private void gG() {
      if (this.af.a(6) == 0) {
         double $$0 = this.dD() - (double)this.dt() * Math.sin((double)(this.aX * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         double $$1 = this.dF() + (double)this.du() - 0.3;
         double $$2 = this.dJ() + (double)this.dt() * Math.cos((double)(this.aX * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         this.dY().a(ll.a(ls.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fl() {
      return super.fl() || this.cf > 0 || this.cg > 0 || this.ch > 0;
   }

   @Override
   public boolean G(bui $$0) {
      return this.cg <= 0 && this.ch <= 0 ? super.G($$0) : false;
   }

   @Override
   protected void e(bve $$0) {
      if (this.ch == 0) {
         if (this.af.j() < 0.5) {
            this.cg = 40;
            this.a(awo.vi, 1.0F, 1.0F);
            this.dY().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.c($$0);
         }

         $$0.U = true;
      }
   }

   private void gH() {
      if (this.bN()) {
         for (bve $$1 : this.dY().a(bve.class, this.cT().g(4.0), bY)) {
            if (!($$1 instanceof clc)) {
               $$1.a(this.dZ().b((bve)this), 6.0F);
            }

            this.c($$1);
         }

         ezr $$2 = this.cT().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.af.k() * 0.2;
            double $$5 = this.af.k() * 0.2;
            double $$6 = this.af.k() * 0.2;
            this.dY().a(ls.ab, $$2.d, $$2.e, $$2.f, $$4, $$5, $$6);
         }

         this.a(eak.u);
      }
   }

   private void c(bui $$0) {
      double $$1 = $$0.dD() - this.dD();
      double $$2 = $$0.dJ() - this.dJ();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(awo.vd, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cg = 40;
      }

      super.b($$0);
   }

   public int t() {
      return this.cf;
   }

   public int gv() {
      return this.cg;
   }

   public int gF() {
      return this.ch;
   }

   @Override
   public boolean E(bui $$0) {
      this.cf = 10;
      this.dY().a(this, (byte)4);
      this.a(awo.vd, 1.0F, 1.0F);
      return super.E($$0);
   }

   @Nullable
   @Override
   protected awn w() {
      return awo.vc;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.vg;
   }

   @Override
   protected awn o_() {
      return awo.vf;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.vh, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dfi $$0) {
      return !$$0.d(this.cT());
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gw() {
      return false;
   }

   @Override
   protected ezm gl() {
      ezm $$0 = super.gl();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
