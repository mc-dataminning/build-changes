import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbf extends ceu {
   private static final Predicate<bki> e = $$0 -> $$0.bv() && !($$0 instanceof cbf);
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

   public cbf(bkm<? extends cbf> $$0, crs $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bJ = 20;
      this.a(ecr.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new brn(this));
      this.bO.a(4, new bsd(this, 1.0, true));
      this.bO.a(5, new btg(this, 0.4));
      this.bO.a(6, new bsb(this, cdm.class, 6.0F));
      this.bO.a(10, new bsb(this, bla.class, 8.0F));
      this.bP.a(2, new btl(this, ceu.class).a());
      this.bP.a(3, new btm<>(this, cdm.class, true));
      this.bP.a(4, new btm<>(this, ccu.class, true, $$0 -> !$$0.n_()));
      this.bP.a(4, new btm<>(this, bwv.class, true));
   }

   @Override
   protected void R() {
      boolean $$0 = !(this.cN() instanceof bla) || this.cN().ag().a(arf.c);
      boolean $$1 = !(this.cY() instanceof cff);
      this.bO.a(brt.a.a, $$0);
      this.bO.a(brt.a.c, $$0 && $$1);
      this.bO.a(brt.a.b, $$0);
      this.bO.a(brt.a.d, $$0);
   }

   public static bmd.a s() {
      return cba.gk().a(bme.l, 100.0).a(bme.m, 0.3).a(bme.i, 0.75).a(bme.c, 12.0).a(bme.d, 1.5).a(bme.g, 32.0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ca);
      $$0.a("StunTick", this.cb);
      $$0.a("RoarTick", this.cc);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.ca = $$0.h("AttackTick");
      this.cb = $$0.h("StunTick");
      this.cc = $$0.h("RoarTick");
   }

   @Override
   public aqm ad_() {
      return aqn.tw;
   }

   @Override
   public int Z() {
      return 45;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, -0.0625F * $$2);
   }

   @Override
   public void c_() {
      super.c_();
      if (this.bv()) {
         if (this.eX()) {
            this.a(bme.m).a(0.0);
         } else {
            double $$0 = this.q() != null ? 0.35 : 0.3;
            double $$1 = this.a(bme.m).b();
            this.a(bme.m).a(ati.d(0.1, $$1, $$0));
         }

         if (this.P && this.dL().X().b(cro.c)) {
            boolean $$2 = false;
            ejd $$3 = this.cG().g(0.2);

            for (ht $$4 : ht.b(ati.a($$3.a), ati.a($$3.b), ati.a($$3.c), ati.a($$3.d), ati.a($$3.e), ati.a($$3.f))) {
               dgw $$5 = this.dL().a_($$4);
               cut $$6 = $$5.b();
               if ($$6 instanceof czc) {
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
               this.a(aqn.tB, 1.0F, 1.0F);
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
   public boolean E(bki $$0) {
      return this.cb <= 0 && this.cc <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bky $$0) {
      if (this.cc == 0) {
         if (this.ag.j() < 0.5) {
            this.cb = 40;
            this.a(aqn.tA, 1.0F, 1.0F);
            this.dL().a(this, (byte)39);
            $$0.g((bki)this);
         } else {
            this.a($$0);
         }

         $$0.T = true;
      }
   }

   private void gq() {
      if (this.bv()) {
         for (bky $$1 : this.dL().a(bky.class, this.cG().g(4.0), e)) {
            if (!($$1 instanceof cai)) {
               $$1.a(this.dM().b((bky)this), 6.0F);
            }

            this.a($$1);
         }

         eji $$2 = this.cG().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dL().a(js.W, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dlg.u);
      }
   }

   private void a(bki $$0) {
      double $$1 = $$0.dq() - this.dq();
      double $$2 = $$0.dw() - this.dw();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ca = 10;
         this.a(aqn.tv, 1.0F, 1.0F);
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
   public boolean C(bki $$0) {
      this.ca = 10;
      this.dL().a(this, (byte)4);
      this.a(aqn.tv, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected aqm w() {
      return aqn.tu;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.ty;
   }

   @Override
   protected aqm m_() {
      return aqn.tx;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.tz, 0.15F, 1.0F);
   }

   @Override
   public boolean a(crv $$0) {
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
   protected ejd fX() {
      ejd $$0 = super.fX();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
