import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzt extends cdi {
   private static final Predicate<biw> e = $$0 -> $$0.bv() && !($$0 instanceof bzt);
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

   public bzt(bja<? extends bzt> $$0, cqb $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bJ = 20;
      this.a(ear.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqb(this));
      this.bO.a(4, new bqr(this, 1.0, true));
      this.bO.a(5, new bru(this, 0.4));
      this.bO.a(6, new bqp(this, cca.class, 6.0F));
      this.bO.a(10, new bqp(this, bjo.class, 8.0F));
      this.bP.a(2, new brz(this, cdi.class).a());
      this.bP.a(3, new bsa<>(this, cca.class, true));
      this.bP.a(4, new bsa<>(this, cbi.class, true, $$0 -> !$$0.m_()));
      this.bP.a(4, new bsa<>(this, bvj.class, true));
   }

   @Override
   protected void R() {
      boolean $$0 = !(this.cN() instanceof bjo) || this.cN().ag().a(apy.c);
      boolean $$1 = !(this.cY() instanceof cdt);
      this.bO.a(bqh.a.a, $$0);
      this.bO.a(bqh.a.c, $$0 && $$1);
      this.bO.a(bqh.a.b, $$0);
      this.bO.a(bqh.a.d, $$0);
   }

   public static bkr.a s() {
      return bzo.gk().a(bks.l, 100.0).a(bks.m, 0.3).a(bks.i, 0.75).a(bks.c, 12.0).a(bks.d, 1.5).a(bks.g, 32.0);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ca);
      $$0.a("StunTick", this.cb);
      $$0.a("RoarTick", this.cc);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.ca = $$0.h("AttackTick");
      this.cb = $$0.h("StunTick");
      this.cc = $$0.h("RoarTick");
   }

   @Override
   public apf ac_() {
      return apg.ts;
   }

   @Override
   public int Z() {
      return 45;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, -0.0625F * $$2);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.bv()) {
         if (this.eX()) {
            this.a(bks.m).a(0.0);
         } else {
            double $$0 = this.q() != null ? 0.35 : 0.3;
            double $$1 = this.a(bks.m).b();
            this.a(bks.m).a(asb.d(0.1, $$1, $$0));
         }

         if (this.P && this.dL().X().b(cpx.c)) {
            boolean $$2 = false;
            ehc $$3 = this.cG().g(0.2);

            for (gw $$4 : gw.b(asb.a($$3.a), asb.a($$3.b), asb.a($$3.c), asb.a($$3.d), asb.a($$3.e), asb.a($$3.f))) {
               dfd $$5 = this.dL().a_($$4);
               ctc $$6 = $$5.b();
               if ($$6 instanceof cxk) {
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
               this.a(apg.tx, 1.0F, 1.0F);
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
         this.dL().a(iv.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean eX() {
      return super.eX() || this.ca > 0 || this.cb > 0 || this.cc > 0;
   }

   @Override
   public boolean E(biw $$0) {
      return this.cb <= 0 && this.cc <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bjm $$0) {
      if (this.cc == 0) {
         if (this.ag.j() < 0.5) {
            this.cb = 40;
            this.a(apg.tw, 1.0F, 1.0F);
            this.dL().a(this, (byte)39);
            $$0.g((biw)this);
         } else {
            this.a($$0);
         }

         $$0.T = true;
      }
   }

   private void gq() {
      if (this.bv()) {
         for (bjm $$1 : this.dL().a(bjm.class, this.cG().g(4.0), e)) {
            if (!($$1 instanceof byw)) {
               $$1.a(this.dM().b((bjm)this), 6.0F);
            }

            this.a($$1);
         }

         ehh $$2 = this.cG().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dL().a(iv.W, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(djn.u);
      }
   }

   private void a(biw $$0) {
      double $$1 = $$0.dq() - this.dq();
      double $$2 = $$0.dw() - this.dw();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ca = 10;
         this.a(apg.tr, 1.0F, 1.0F);
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
   public boolean C(biw $$0) {
      this.ca = 10;
      this.dL().a(this, (byte)4);
      this.a(apg.tr, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected apf w() {
      return apg.tq;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.tu;
   }

   @Override
   protected apf l_() {
      return apg.tt;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.tv, 0.15F, 1.0F);
   }

   @Override
   public boolean a(cqe $$0) {
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
   protected ehc fX() {
      ehc $$0 = super.fX();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
