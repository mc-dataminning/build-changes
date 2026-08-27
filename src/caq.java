import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class caq extends cef {
   private static final Predicate<bjt> e = $$0 -> $$0.bv() && !($$0 instanceof caq);
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

   public caq(bjx<? extends caq> $$0, cqz $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bJ = 20;
      this.a(ebp.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqy(this));
      this.bO.a(4, new bro(this, 1.0, true));
      this.bO.a(5, new bsr(this, 0.4));
      this.bO.a(6, new brm(this, ccx.class, 6.0F));
      this.bO.a(10, new brm(this, bkl.class, 8.0F));
      this.bP.a(2, new bsw(this, cef.class).a());
      this.bP.a(3, new bsx<>(this, ccx.class, true));
      this.bP.a(4, new bsx<>(this, ccf.class, true, $$0 -> !$$0.n_()));
      this.bP.a(4, new bsx<>(this, bwg.class, true));
   }

   @Override
   protected void R() {
      boolean $$0 = !(this.cN() instanceof bkl) || this.cN().ag().a(aqv.c);
      boolean $$1 = !(this.cY() instanceof ceq);
      this.bO.a(bre.a.a, $$0);
      this.bO.a(bre.a.c, $$0 && $$1);
      this.bO.a(bre.a.b, $$0);
      this.bO.a(bre.a.d, $$0);
   }

   public static blo.a s() {
      return cal.gk().a(blp.l, 100.0).a(blp.m, 0.3).a(blp.i, 0.75).a(blp.c, 12.0).a(blp.d, 1.5).a(blp.g, 32.0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ca);
      $$0.a("StunTick", this.cb);
      $$0.a("RoarTick", this.cc);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.ca = $$0.h("AttackTick");
      this.cb = $$0.h("StunTick");
      this.cc = $$0.h("RoarTick");
   }

   @Override
   public aqc ad_() {
      return aqd.tu;
   }

   @Override
   public int Z() {
      return 45;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, -0.0625F * $$2);
   }

   @Override
   public void c_() {
      super.c_();
      if (this.bv()) {
         if (this.eX()) {
            this.a(blp.m).a(0.0);
         } else {
            double $$0 = this.q() != null ? 0.35 : 0.3;
            double $$1 = this.a(blp.m).b();
            this.a(blp.m).a(asy.d(0.1, $$1, $$0));
         }

         if (this.P && this.dL().X().b(cqv.c)) {
            boolean $$2 = false;
            eia $$3 = this.cG().g(0.2);

            for (ht $$4 : ht.b(asy.a($$3.a), asy.a($$3.b), asy.a($$3.c), asy.a($$3.d), asy.a($$3.e), asy.a($$3.f))) {
               dgb $$5 = this.dL().a_($$4);
               cua $$6 = $$5.b();
               if ($$6 instanceof cyi) {
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
               this.gq();
            }
         }

         if (this.ca > 0) {
            this.ca--;
         }

         if (this.cb > 0) {
            this.cb--;
            this.gp();
            if (this.cb == 0) {
               this.a(aqd.tz, 1.0F, 1.0F);
               this.cc = 20;
            }
         }
      }
   }

   private void gp() {
      if (this.ag.a(6) == 0) {
         double $$0 = this.dq() - (double)this.df() * Math.sin((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         double $$1 = this.ds() + (double)this.dg() - 0.3;
         double $$2 = this.dw() + (double)this.df() * Math.cos((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         this.dL().a(js.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean eX() {
      return super.eX() || this.ca > 0 || this.cb > 0 || this.cc > 0;
   }

   @Override
   public boolean E(bjt $$0) {
      return this.cb <= 0 && this.cc <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bkj $$0) {
      if (this.cc == 0) {
         if (this.ag.j() < 0.5) {
            this.cb = 40;
            this.a(aqd.ty, 1.0F, 1.0F);
            this.dL().a(this, (byte)39);
            $$0.g((bjt)this);
         } else {
            this.a($$0);
         }

         $$0.T = true;
      }
   }

   private void gq() {
      if (this.bv()) {
         for (bkj $$1 : this.dL().a(bkj.class, this.cG().g(4.0), e)) {
            if (!($$1 instanceof bzt)) {
               $$1.a(this.dM().b((bkj)this), 6.0F);
            }

            this.a($$1);
         }

         eif $$2 = this.cG().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dL().a(js.W, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dkl.u);
      }
   }

   private void a(bjt $$0) {
      double $$1 = $$0.dq() - this.dq();
      double $$2 = $$0.dw() - this.dw();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ca = 10;
         this.a(aqd.tt, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cb = 40;
      }

      super.b($$0);
   }

   public int t() {
      return this.ca;
   }

   public int ge() {
      return this.cb;
   }

   public int go() {
      return this.cc;
   }

   @Override
   public boolean C(bjt $$0) {
      this.ca = 10;
      this.dL().a(this, (byte)4);
      this.a(aqd.tt, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected aqc w() {
      return aqd.ts;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.tw;
   }

   @Override
   protected aqc m_() {
      return aqd.tv;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.tx, 0.15F, 1.0F);
   }

   @Override
   public boolean a(crc $$0) {
      return !$$0.d(this.cG());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gf() {
      return false;
   }

   @Override
   protected eia fX() {
      eia $$0 = super.fX();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
