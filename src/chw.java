import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chw extends clx {
   private static final Predicate<bql> e = $$0 -> $$0.bB() && !($$0 instanceof chw);
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

   public chw(bqr<? extends chw> $$0, czu $$1) {
      super($$0, $$1);
      this.bN = 20;
      this.a(emi.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bxv(this));
      this.bS.a(4, new byl(this, 1.0, true));
      this.bS.a(5, new bzo(this, 0.4));
      this.bS.a(6, new byj(this, ckl.class, 6.0F));
      this.bS.a(10, new byj(this, brg.class, 8.0F));
      this.bT.a(2, new bzt(this, clx.class).a());
      this.bT.a(3, new bzu<>(this, ckl.class, true));
      this.bT.a(4, new bzu<>(this, cjt.class, true, $$0 -> !$$0.p_()));
      this.bT.a(4, new bzu<>(this, cdf.class, true));
   }

   @Override
   protected void R() {
      boolean $$0 = !(this.cO() instanceof brg) || this.cO().ai().a(avr.c);
      boolean $$1 = !(this.da() instanceof cmi);
      this.bS.a(byb.a.a, $$0);
      this.bS.a(byb.a.c, $$0 && $$1);
      this.bS.a(byb.a.b, $$0);
      this.bS.a(byb.a.d, $$0);
   }

   public static bsk.a r() {
      return chr.gv().a(bsl.q, 100.0).a(bsl.r, 0.3).a(bsl.n, 0.75).a(bsl.c, 12.0).a(bsl.d, 1.5).a(bsl.k, 32.0).a(bsl.v, 1.0);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.cf);
      $$0.a("StunTick", this.cg);
      $$0.a("RoarTick", this.ch);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.cf = $$0.h("AttackTick");
      this.cg = $$0.h("StunTick");
      this.ch = $$0.h("RoarTick");
   }

   @Override
   public auy ae_() {
      return auz.uQ;
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
            this.f(bsl.r).a(0.0);
         } else {
            double $$0 = this.p() != null ? 0.35 : 0.3;
            double $$1 = this.f(bsl.r).b();
            this.f(bsl.r).a(axw.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dN().aa().b(czq.c)) {
            boolean $$2 = false;
            eta $$3 = this.cI().g(0.2);

            for (im $$4 : im.b(axw.a($$3.a), axw.a($$3.b), axw.a($$3.c), axw.a($$3.d), axw.a($$3.e), axw.a($$3.f))) {
               dpy $$5 = this.dN().a_($$4);
               dcv $$6 = $$5.b();
               if ($$6 instanceof dhf) {
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
               this.a(auz.uV, 1.0F, 1.0F);
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
         this.dN().a(ko.a(kw.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fe() {
      return super.fe() || this.cf > 0 || this.cg > 0 || this.ch > 0;
   }

   @Override
   public boolean E(bql $$0) {
      return this.cg <= 0 && this.ch <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bre $$0) {
      if (this.ch == 0) {
         if (this.ah.j() < 0.5) {
            this.cg = 40;
            this.a(auz.uU, 1.0F, 1.0F);
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
         for (bre $$1 : this.dN().a(bre.class, this.cI().g(4.0), e)) {
            if (!($$1 instanceof cgy)) {
               $$1.a(this.dO().b((bre)this), 6.0F);
            }

            this.b($$1);
         }

         etf $$2 = this.cI().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ah.k() * 0.2;
            double $$5 = this.ah.k() * 0.2;
            double $$6 = this.ah.k() * 0.2;
            this.dN().a(kw.Y, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dur.u);
      }
   }

   private void b(bql $$0) {
      double $$1 = $$0.ds() - this.ds();
      double $$2 = $$0.dy() - this.dy();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(auz.uP, 1.0F, 1.0F);
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
   public boolean C(bql $$0) {
      this.cf = 10;
      this.dN().a(this, (byte)4);
      this.a(auz.uP, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected auy v() {
      return auz.uO;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.uS;
   }

   @Override
   protected auy o_() {
      return auz.uR;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.uT, 0.15F, 1.0F);
   }

   @Override
   public boolean a(czx $$0) {
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
   protected eta gi() {
      eta $$0 = super.gi();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
