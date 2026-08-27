import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cis extends cmt {
   private static final Predicate<brh> e = $$0 -> $$0.bB() && !($$0 instanceof cis);
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

   public cis(brn<? extends cis> $$0, dad $$1) {
      super($$0, $$1);
      this.bN = 20;
      this.a(emr.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new byr(this));
      this.bS.a(4, new bzh(this, 1.0, true));
      this.bS.a(5, new cak(this, 0.4));
      this.bS.a(6, new bzf(this, clh.class, 6.0F));
      this.bS.a(10, new bzf(this, bsc.class, 8.0F));
      this.bT.a(2, new cap(this, cmt.class).a());
      this.bT.a(3, new caq<>(this, clh.class, true));
      this.bT.a(4, new caq<>(this, ckp.class, true, $$0 -> !$$0.p_()));
      this.bT.a(4, new caq<>(this, ceb.class, true));
   }

   @Override
   protected void R() {
      boolean $$0 = !(this.cO() instanceof bsc) || this.cO().ai().a(avu.c);
      boolean $$1 = !(this.da() instanceof cne);
      this.bS.a(byx.a.a, $$0);
      this.bS.a(byx.a.c, $$0 && $$1);
      this.bS.a(byx.a.b, $$0);
      this.bS.a(byx.a.d, $$0);
   }

   public static btg.a r() {
      return cin.gv().a(bth.q, 100.0).a(bth.r, 0.3).a(bth.n, 0.75).a(bth.c, 12.0).a(bth.d, 1.5).a(bth.k, 32.0).a(bth.v, 1.0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.cf);
      $$0.a("StunTick", this.cg);
      $$0.a("RoarTick", this.ch);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.cf = $$0.h("AttackTick");
      this.cg = $$0.h("StunTick");
      this.ch = $$0.h("RoarTick");
   }

   @Override
   public avb ae_() {
      return avc.uR;
   }

   @Override
   public int aa() {
      return 45;
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bB()) {
         if (this.fe()) {
            this.f(bth.r).a(0.0);
         } else {
            double $$0 = this.p() != null ? 0.35 : 0.3;
            double $$1 = this.f(bth.r).b();
            this.f(bth.r).a(axz.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dN().aa().b(czz.c)) {
            boolean $$2 = false;
            etk $$3 = this.cI().g(0.2);

            for (in $$4 : in.b(axz.a($$3.a), axz.a($$3.b), axz.a($$3.c), axz.a($$3.d), axz.a($$3.e), axz.a($$3.f))) {
               dqh $$5 = this.dN().a_($$4);
               dde $$6 = $$5.b();
               if ($$6 instanceof dho) {
                  $$2 = this.dN().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aC()) {
               this.fh();
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
               this.a(avc.uW, 1.0F, 1.0F);
               this.ch = 20;
            }
         }
      }
   }

   private void gA() {
      if (this.ah.a(6) == 0) {
         double $$0 = this.ds() - (double)this.dh() * Math.sin((double)(this.aZ * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         double $$1 = this.du() + (double)this.di() - 0.3;
         double $$2 = this.dy() + (double)this.dh() * Math.cos((double)(this.aZ * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         this.dN().a(kp.a(kx.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fe() {
      return super.fe() || this.cf > 0 || this.cg > 0 || this.ch > 0;
   }

   @Override
   public boolean E(brh $$0) {
      return this.cg <= 0 && this.ch <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bsa $$0) {
      if (this.ch == 0) {
         if (this.ah.j() < 0.5) {
            this.cg = 40;
            this.a(avc.uV, 1.0F, 1.0F);
            this.dN().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.U = true;
      }
   }

   private void gB() {
      if (this.bB()) {
         for (bsa $$1 : this.dN().a(bsa.class, this.cI().g(4.0), e)) {
            if (!($$1 instanceof chu)) {
               $$1.a(this.dO().b((bsa)this), 6.0F);
            }

            this.b($$1);
         }

         etp $$2 = this.cI().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ah.k() * 0.2;
            double $$5 = this.ah.k() * 0.2;
            double $$6 = this.ah.k() * 0.2;
            this.dN().a(kx.Y, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dva.u);
      }
   }

   private void b(brh $$0) {
      double $$1 = $$0.ds() - this.ds();
      double $$2 = $$0.dy() - this.dy();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(avc.uQ, 1.0F, 1.0F);
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
   public boolean C(brh $$0) {
      this.cf = 10;
      this.dN().a(this, (byte)4);
      this.a(avc.uQ, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected avb v() {
      return avc.uP;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.uT;
   }

   @Override
   protected avb o_() {
      return avc.uS;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.uU, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dag $$0) {
      return !$$0.d(this.cI());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gq() {
      return false;
   }

   @Override
   protected etk gi() {
      etk $$0 = super.gi();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
