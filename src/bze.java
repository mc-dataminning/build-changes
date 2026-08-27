import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bze extends cct {
   private static final Predicate<big> e = $$0 -> $$0.bv() && !($$0 instanceof bze);
   private static final double bT = 0.3;
   private static final double bU = 0.35;
   private static final int bV = 8356754;
   private static final double bW = 0.5725490196078431;
   private static final double bX = 0.5137254901960784;
   private static final double bY = 0.4980392156862745;
   private static final int bZ = 10;
   public static final int b = 40;
   private int ca;
   private int cb;
   private int cc;

   public bze(bik<? extends bze> $$0, cpk $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bJ = 20;
      this.a(eam.v, 0.0F);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpm(this));
      this.bO.a(4, new bze.a());
      this.bO.a(5, new brf(this, 0.4));
      this.bO.a(6, new bqa(this, cbl.class, 6.0F));
      this.bO.a(10, new bqa(this, biy.class, 8.0F));
      this.bP.a(2, new brk(this, cct.class).a());
      this.bP.a(3, new brl<>(this, cbl.class, true));
      this.bP.a(4, new brl<>(this, cat.class, true, $$0 -> !$$0.i_()));
      this.bP.a(4, new brl<>(this, buu.class, true));
   }

   @Override
   protected void O() {
      boolean $$0 = !(this.cN() instanceof biy) || this.cN().ag().a(apm.b);
      boolean $$1 = !(this.cY() instanceof cde);
      this.bO.a(bps.a.a, $$0);
      this.bO.a(bps.a.c, $$0 && $$1);
      this.bO.a(bps.a.b, $$0);
      this.bO.a(bps.a.d, $$0);
   }

   public static bkc.a p() {
      return byz.gf().a(bkd.a, 100.0).a(bkd.d, 0.3).a(bkd.c, 0.75).a(bkd.f, 12.0).a(bkd.g, 1.5).a(bkd.b, 32.0);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ca);
      $$0.a("StunTick", this.cb);
      $$0.a("RoarTick", this.cc);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.ca = $$0.h("AttackTick");
      this.cb = $$0.h("StunTick");
      this.cc = $$0.h("RoarTick");
   }

   @Override
   public aot Y_() {
      return aou.ts;
   }

   @Override
   public int X() {
      return 45;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, -0.0625F * $$2);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.bv()) {
         if (this.eW()) {
            this.a(bkd.d).a(0.0);
         } else {
            double $$0 = this.j() != null ? 0.35 : 0.3;
            double $$1 = this.a(bkd.d).b();
            this.a(bkd.d).a(aro.d(0.1, $$1, $$0));
         }

         if (this.P && this.dK().X().b(cpg.c)) {
            boolean $$2 = false;
            eha $$3 = this.cG().g(0.2);

            for (gv $$4 : gv.b(aro.a($$3.a), aro.a($$3.b), aro.a($$3.c), aro.a($$3.d), aro.a($$3.e), aro.a($$3.f))) {
               dey $$5 = this.dK().a_($$4);
               csk $$6 = $$5.b();
               if ($$6 instanceof cwr) {
                  $$2 = this.dK().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aA()) {
               this.eZ();
            }
         }

         if (this.cc > 0) {
            this.cc--;
            if (this.cc == 10) {
               this.gl();
            }
         }

         if (this.ca > 0) {
            this.ca--;
         }

         if (this.cb > 0) {
            this.cb--;
            this.gk();
            if (this.cb == 0) {
               this.a(aou.tx, 1.0F, 1.0F);
               this.cc = 20;
            }
         }
      }
   }

   private void gk() {
      if (this.ag.a(6) == 0) {
         double $$0 = this.dp() - (double)this.df() * Math.sin((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         double $$1 = this.dr() + (double)this.dg() - 0.3;
         double $$2 = this.dv() + (double)this.df() * Math.cos((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         this.dK().a(iw.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean eW() {
      return super.eW() || this.ca > 0 || this.cb > 0 || this.cc > 0;
   }

   @Override
   public boolean E(big $$0) {
      return this.cb <= 0 && this.cc <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(biw $$0) {
      if (this.cc == 0) {
         if (this.ag.j() < 0.5) {
            this.cb = 40;
            this.a(aou.tw, 1.0F, 1.0F);
            this.dK().a(this, (byte)39);
            $$0.g((big)this);
         } else {
            this.a($$0);
         }

         $$0.T = true;
      }
   }

   private void gl() {
      if (this.bv()) {
         for (biw $$1 : this.dK().a(biw.class, this.cG().g(4.0), e)) {
            if (!($$1 instanceof byh)) {
               $$1.a(this.dL().b((biw)this), 6.0F);
            }

            this.a($$1);
         }

         ehf $$2 = this.cG().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dK().a(iw.W, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dji.u);
      }
   }

   private void a(big $$0) {
      double $$1 = $$0.dp() - this.dp();
      double $$2 = $$0.dv() - this.dv();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ca = 10;
         this.a(aou.tr, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cb = 40;
      }

      super.b($$0);
   }

   public int q() {
      return this.ca;
   }

   public int fZ() {
      return this.cb;
   }

   public int gj() {
      return this.cc;
   }

   @Override
   public boolean C(big $$0) {
      this.ca = 10;
      this.dK().a(this, (byte)4);
      this.a(aou.tr, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected aot r() {
      return aou.tq;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.tu;
   }

   @Override
   protected aot h_() {
      return aou.tt;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.tv, 0.15F, 1.0F);
   }

   @Override
   public boolean a(cpn $$0) {
      return !$$0.d(this.cG());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean ga() {
      return false;
   }

   class a extends bqc {
      public a() {
         super(bze.this, 1.0, true);
      }

      @Override
      protected double a(biw $$0) {
         float $$1 = bze.this.df() - 0.1F;
         return (double)($$1 * 2.0F * $$1 * 2.0F + $$0.df());
      }
   }
}
