import java.util.function.Predicate;
import javax.annotation.Nullable;

public class clr extends cpw {
   private static final Predicate<btz> bY = $$0 -> $$0.bM() && !($$0 instanceof clr) && ($$0.dX().ac().b(der.c) || !$$0.aq().equals(bug.d));
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

   public clr(bug<? extends clr> $$0, dev $$1) {
      super($$0, $$1);
      this.bN = 20;
      this.a(erv.v, 0.0F);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbn(this));
      this.bS.a(4, new ccd(this, 1.0, true));
      this.bS.a(5, new cdg(this, 0.4));
      this.bS.a(6, new ccb(this, coh.class, 6.0F));
      this.bS.a(10, new ccb(this, bux.class, 8.0F));
      this.bT.a(2, new cdl(this, cpw.class).a());
      this.bT.a(3, new cdm<>(this, coh.class, true));
      this.bT.a(4, new cdm<>(this, cno.class, true, $$0 -> !$$0.p_()));
      this.bT.a(4, new cdm<>(this, cgy.class, true));
   }

   @Override
   protected void W() {
      boolean $$0 = !(this.cY() instanceof bux) || this.cY().aq().a(axd.c);
      boolean $$1 = !(this.dl() instanceof cqh);
      this.bS.a(cbt.a.a, $$0);
      this.bS.a(cbt.a.c, $$0 && $$1);
      this.bS.a(cbt.a.b, $$0);
      this.bS.a(cbt.a.d, $$0);
   }

   public static bwc.a q() {
      return clm.gB().a(bwd.s, 100.0).a(bwd.v, 0.3).a(bwd.p, 0.75).a(bwd.c, 12.0).a(bwd.d, 1.5).a(bwd.m, 32.0).a(bwd.B, 1.0);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.cf);
      $$0.a("StunTick", this.cg);
      $$0.a("RoarTick", this.ch);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.cf = $$0.h("AttackTick");
      this.cg = $$0.h("StunTick");
      this.ch = $$0.h("RoarTick");
   }

   @Override
   public awj aj_() {
      return awk.ve;
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
            this.g(bwd.v).a(0.0);
         } else {
            double $$0 = this.m() != null ? 0.35 : 0.3;
            double $$1 = this.g(bwd.v).b();
            this.g(bwd.v).a(azj.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dX().ac().b(der.c)) {
            boolean $$2 = false;
            ezc $$3 = this.cS().g(0.2);

            for (jg $$4 : jg.b(azj.a($$3.a), azj.a($$3.b), azj.a($$3.c), azj.a($$3.d), azj.a($$3.e), azj.a($$3.f))) {
               dvd $$5 = this.dX().a_($$4);
               dhy $$6 = $$5.b();
               if ($$6 instanceof dmh) {
                  $$2 = this.dX().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aJ()) {
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
               this.a(awk.vj, 1.0F, 1.0F);
               this.ch = 20;
            }
         }
      }
   }

   private void gG() {
      if (this.af.a(6) == 0) {
         double $$0 = this.dC() - (double)this.ds() * Math.sin((double)(this.aU * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         double $$1 = this.dE() + (double)this.dt() - 0.3;
         double $$2 = this.dI() + (double)this.ds() * Math.cos((double)(this.aU * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         this.dX().a(lj.a(lq.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fk() {
      return super.fk() || this.cf > 0 || this.cg > 0 || this.ch > 0;
   }

   @Override
   public boolean G(btz $$0) {
      return this.cg <= 0 && this.ch <= 0 ? super.G($$0) : false;
   }

   @Override
   protected void e(buv $$0) {
      if (this.ch == 0) {
         if (this.af.j() < 0.5) {
            this.cg = 40;
            this.a(awk.vi, 1.0F, 1.0F);
            this.dX().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.c($$0);
         }

         $$0.U = true;
      }
   }

   private void gH() {
      if (this.bM()) {
         for (buv $$1 : this.dX().a(buv.class, this.cS().g(4.0), bY)) {
            if (!($$1 instanceof ckt)) {
               $$1.a(this.dY().b((buv)this), 6.0F);
            }

            this.c($$1);
         }

         ezh $$2 = this.cS().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.af.k() * 0.2;
            double $$5 = this.af.k() * 0.2;
            double $$6 = this.af.k() * 0.2;
            this.dX().a(lq.ab, $$2.d, $$2.e, $$2.f, $$4, $$5, $$6);
         }

         this.a(eaa.u);
      }
   }

   private void c(btz $$0) {
      double $$1 = $$0.dC() - this.dC();
      double $$2 = $$0.dI() - this.dI();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(awk.vd, 1.0F, 1.0F);
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
   public boolean E(btz $$0) {
      this.cf = 10;
      this.dX().a(this, (byte)4);
      this.a(awk.vd, 1.0F, 1.0F);
      return super.E($$0);
   }

   @Nullable
   @Override
   protected awj w() {
      return awk.vc;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.vg;
   }

   @Override
   protected awj o_() {
      return awk.vf;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.vh, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dey $$0) {
      return !$$0.d(this.cS());
   }

   @Override
   public void a(arm $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gw() {
      return false;
   }

   @Override
   protected ezc gl() {
      ezc $$0 = super.gl();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
