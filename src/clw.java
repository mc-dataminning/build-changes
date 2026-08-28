import java.util.function.Predicate;
import javax.annotation.Nullable;

public class clw extends cqb {
   private static final Predicate<bue> bY = $$0 -> $$0.bM() && !($$0 instanceof clw) && ($$0.dX().ac().b(dex.c) || !$$0.ar().equals(bul.d));
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

   public clw(bul<? extends clw> $$0, dfb $$1) {
      super($$0, $$1);
      this.bN = 20;
      this.a(esb.v, 0.0F);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbs(this));
      this.bS.a(4, new cci(this, 1.0, true));
      this.bS.a(5, new cdl(this, 0.4));
      this.bS.a(6, new ccg(this, com.class, 6.0F));
      this.bS.a(10, new ccg(this, bvc.class, 8.0F));
      this.bT.a(2, new cdq(this, cqb.class).a());
      this.bT.a(3, new cdr<>(this, com.class, true));
      this.bT.a(4, new cdr<>(this, cnt.class, true, $$0 -> !$$0.p_()));
      this.bT.a(4, new cdr<>(this, chd.class, true));
   }

   @Override
   protected void W() {
      boolean $$0 = !(this.cY() instanceof bvc) || this.cY().ar().a(axe.c);
      boolean $$1 = !(this.dl() instanceof cqm);
      this.bS.a(cby.a.a, $$0);
      this.bS.a(cby.a.c, $$0 && $$1);
      this.bS.a(cby.a.b, $$0);
      this.bS.a(cby.a.d, $$0);
   }

   public static bwh.a q() {
      return clr.gA().a(bwi.s, 100.0).a(bwi.v, 0.3).a(bwi.p, 0.75).a(bwi.c, 12.0).a(bwi.d, 1.5).a(bwi.m, 32.0).a(bwi.B, 1.0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.cf);
      $$0.a("StunTick", this.cg);
      $$0.a("RoarTick", this.ch);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.cf = $$0.h("AttackTick");
      this.cg = $$0.h("StunTick");
      this.ch = $$0.h("RoarTick");
   }

   @Override
   public awk aj_() {
      return awl.ve;
   }

   @Override
   public int ae() {
      return 45;
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bM()) {
         if (this.fk()) {
            this.g(bwi.v).a(0.0);
         } else {
            double $$0 = this.m() != null ? 0.35 : 0.3;
            double $$1 = this.g(bwi.v).b();
            this.g(bwi.v).a(azk.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dX().ac().b(dex.c)) {
            boolean $$2 = false;
            ezi $$3 = this.cS().g(0.2);

            for (jh $$4 : jh.b(azk.a($$3.a), azk.a($$3.b), azk.a($$3.c), azk.a($$3.d), azk.a($$3.e), azk.a($$3.f))) {
               dvj $$5 = this.dX().a_($$4);
               die $$6 = $$5.b();
               if ($$6 instanceof dmn) {
                  $$2 = this.dX().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aK()) {
               this.v();
            }
         }

         if (this.ch > 0) {
            this.ch--;
            if (this.ch == 10) {
               this.gG();
            }
         }

         if (this.cf > 0) {
            this.cf--;
         }

         if (this.cg > 0) {
            this.cg--;
            this.gF();
            if (this.cg == 0) {
               this.a(awl.vj, 1.0F, 1.0F);
               this.ch = 20;
            }
         }
      }
   }

   private void gF() {
      if (this.af.a(6) == 0) {
         double $$0 = this.dC() - (double)this.ds() * Math.sin((double)(this.aX * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         double $$1 = this.dE() + (double)this.dt() - 0.3;
         double $$2 = this.dI() + (double)this.ds() * Math.cos((double)(this.aX * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         this.dX().a(lk.a(lr.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fk() {
      return super.fk() || this.cf > 0 || this.cg > 0 || this.ch > 0;
   }

   @Override
   public boolean G(bue $$0) {
      return this.cg <= 0 && this.ch <= 0 ? super.G($$0) : false;
   }

   @Override
   protected void e(bva $$0) {
      if (this.ch == 0) {
         if (this.af.j() < 0.5) {
            this.cg = 40;
            this.a(awl.vi, 1.0F, 1.0F);
            this.dX().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.c($$0);
         }

         $$0.U = true;
      }
   }

   private void gG() {
      if (this.bM()) {
         for (bva $$1 : this.dX().a(bva.class, this.cS().g(4.0), bY)) {
            if (!($$1 instanceof cky)) {
               $$1.a(this.dY().b((bva)this), 6.0F);
            }

            this.c($$1);
         }

         ezn $$2 = this.cS().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.af.k() * 0.2;
            double $$5 = this.af.k() * 0.2;
            double $$6 = this.af.k() * 0.2;
            this.dX().a(lr.ab, $$2.d, $$2.e, $$2.f, $$4, $$5, $$6);
         }

         this.a(eag.u);
      }
   }

   private void c(bue $$0) {
      double $$1 = $$0.dC() - this.dC();
      double $$2 = $$0.dI() - this.dI();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(awl.vd, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cg = 40;
      }

      super.b($$0);
   }

   public int t() {
      return this.cf;
   }

   public int gu() {
      return this.cg;
   }

   public int gE() {
      return this.ch;
   }

   @Override
   public boolean E(bue $$0) {
      this.cf = 10;
      this.dX().a(this, (byte)4);
      this.a(awl.vd, 1.0F, 1.0F);
      return super.E($$0);
   }

   @Nullable
   @Override
   protected awk w() {
      return awl.vc;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.vg;
   }

   @Override
   protected awk o_() {
      return awl.vf;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.vh, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dfe $$0) {
      return !$$0.d(this.cS());
   }

   @Override
   public void a(arn $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gv() {
      return false;
   }

   @Override
   protected ezi gk() {
      ezi $$0 = super.gk();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
