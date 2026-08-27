import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzp extends cde {
   private static final Predicate<bis> e = $$0 -> $$0.bv() && !($$0 instanceof bzp);
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

   public bzp(biw<? extends bzp> $$0, cpx $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bJ = 20;
      this.a(eaz.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bpx(this));
      this.bO.a(4, new bqn(this, 1.0, true));
      this.bO.a(5, new brq(this, 0.4));
      this.bO.a(6, new bql(this, cbw.class, 6.0F));
      this.bO.a(10, new bql(this, bjk.class, 8.0F));
      this.bP.a(2, new brv(this, cde.class).a());
      this.bP.a(3, new brw<>(this, cbw.class, true));
      this.bP.a(4, new brw<>(this, cbe.class, true, $$0 -> !$$0.m_()));
      this.bP.a(4, new brw<>(this, bvf.class, true));
   }

   @Override
   protected void R() {
      boolean $$0 = !(this.cN() instanceof bjk) || this.cN().ag().a(apx.b);
      boolean $$1 = !(this.cY() instanceof cdp);
      this.bO.a(bqd.a.a, $$0);
      this.bO.a(bqd.a.c, $$0 && $$1);
      this.bO.a(bqd.a.b, $$0);
      this.bO.a(bqd.a.d, $$0);
   }

   public static bkn.a s() {
      return bzk.gj().a(bko.a, 100.0).a(bko.d, 0.3).a(bko.c, 0.75).a(bko.f, 12.0).a(bko.g, 1.5).a(bko.b, 32.0);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ca);
      $$0.a("StunTick", this.cb);
      $$0.a("RoarTick", this.cc);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.ca = $$0.h("AttackTick");
      this.cb = $$0.h("StunTick");
      this.cc = $$0.h("RoarTick");
   }

   @Override
   public ape ac_() {
      return apf.ts;
   }

   @Override
   public int Z() {
      return 45;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, -0.0625F * $$2);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.bv()) {
         if (this.eX()) {
            this.a(bko.d).a(0.0);
         } else {
            double $$0 = this.q() != null ? 0.35 : 0.3;
            double $$1 = this.a(bko.d).b();
            this.a(bko.d).a(ary.d(0.1, $$1, $$0));
         }

         if (this.P && this.dL().X().b(cpt.c)) {
            boolean $$2 = false;
            ehk $$3 = this.cG().g(0.2);

            for (gw $$4 : gw.b(ary.a($$3.a), ary.a($$3.b), ary.a($$3.c), ary.a($$3.d), ary.a($$3.e), ary.a($$3.f))) {
               dfl $$5 = this.dL().a_($$4);
               csx $$6 = $$5.b();
               if ($$6 instanceof cxe) {
                  $$2 = this.dL().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aA()) {
               this.fa();
            }
         }

         if (this.cc > 0) {
            this.cc--;
            if (this.cc == 10) {
               this.gp();
            }
         }

         if (this.ca > 0) {
            this.ca--;
         }

         if (this.cb > 0) {
            this.cb--;
            this.go();
            if (this.cb == 0) {
               this.a(apf.tx, 1.0F, 1.0F);
               this.cc = 20;
            }
         }
      }
   }

   private void go() {
      if (this.ag.a(6) == 0) {
         double $$0 = this.dq() - (double)this.df() * Math.sin((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         double $$1 = this.ds() + (double)this.dg() - 0.3;
         double $$2 = this.dw() + (double)this.df() * Math.cos((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         this.dL().a(ix.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean eX() {
      return super.eX() || this.ca > 0 || this.cb > 0 || this.cc > 0;
   }

   @Override
   public boolean E(bis $$0) {
      return this.cb <= 0 && this.cc <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bji $$0) {
      if (this.cc == 0) {
         if (this.ag.j() < 0.5) {
            this.cb = 40;
            this.a(apf.tw, 1.0F, 1.0F);
            this.dL().a(this, (byte)39);
            $$0.g((bis)this);
         } else {
            this.a($$0);
         }

         $$0.T = true;
      }
   }

   private void gp() {
      if (this.bv()) {
         for (bji $$1 : this.dL().a(bji.class, this.cG().g(4.0), e)) {
            if (!($$1 instanceof bys)) {
               $$1.a(this.dM().b((bji)this), 6.0F);
            }

            this.a($$1);
         }

         ehp $$2 = this.cG().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dL().a(ix.W, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(djv.u);
      }
   }

   private void a(bis $$0) {
      double $$1 = $$0.dq() - this.dq();
      double $$2 = $$0.dw() - this.dw();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ca = 10;
         this.a(apf.tr, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cb = 40;
      }

      super.b($$0);
   }

   public int t() {
      return this.ca;
   }

   public int gd() {
      return this.cb;
   }

   public int gn() {
      return this.cc;
   }

   @Override
   public boolean C(bis $$0) {
      this.ca = 10;
      this.dL().a(this, (byte)4);
      this.a(apf.tr, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected ape w() {
      return apf.tq;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.tu;
   }

   @Override
   protected ape l_() {
      return apf.tt;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.tv, 0.15F, 1.0F);
   }

   @Override
   public boolean a(cqa $$0) {
      return !$$0.d(this.cG());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean ge() {
      return false;
   }

   @Override
   protected ehk fW() {
      ehk $$0 = super.fW();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
