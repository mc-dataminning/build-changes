import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzn extends cdc {
   private static final Predicate<biq> e = $$0 -> $$0.bv() && !($$0 instanceof bzn);
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

   public bzn(biu<? extends bzn> $$0, cpv $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bJ = 20;
      this.a(eax.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bpv(this));
      this.bO.a(4, new bql(this, 1.0, true));
      this.bO.a(5, new bro(this, 0.4));
      this.bO.a(6, new bqj(this, cbu.class, 6.0F));
      this.bO.a(10, new bqj(this, bji.class, 8.0F));
      this.bP.a(2, new brt(this, cdc.class).a());
      this.bP.a(3, new bru<>(this, cbu.class, true));
      this.bP.a(4, new bru<>(this, cbc.class, true, $$0 -> !$$0.m_()));
      this.bP.a(4, new bru<>(this, bvd.class, true));
   }

   @Override
   protected void R() {
      boolean $$0 = !(this.cN() instanceof bji) || this.cN().ag().a(apw.b);
      boolean $$1 = !(this.cY() instanceof cdn);
      this.bO.a(bqb.a.a, $$0);
      this.bO.a(bqb.a.c, $$0 && $$1);
      this.bO.a(bqb.a.b, $$0);
      this.bO.a(bqb.a.d, $$0);
   }

   public static bkl.a s() {
      return bzi.gj().a(bkm.a, 100.0).a(bkm.d, 0.3).a(bkm.c, 0.75).a(bkm.f, 12.0).a(bkm.g, 1.5).a(bkm.b, 32.0);
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
   public apd ac_() {
      return ape.ts;
   }

   @Override
   public int Z() {
      return 45;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, -0.0625F * $$2);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.bv()) {
         if (this.eX()) {
            this.a(bkm.d).a(0.0);
         } else {
            double $$0 = this.q() != null ? 0.35 : 0.3;
            double $$1 = this.a(bkm.d).b();
            this.a(bkm.d).a(arx.d(0.1, $$1, $$0));
         }

         if (this.P && this.dL().X().b(cpr.c)) {
            boolean $$2 = false;
            ehi $$3 = this.cG().g(0.2);

            for (gw $$4 : gw.b(arx.a($$3.a), arx.a($$3.b), arx.a($$3.c), arx.a($$3.d), arx.a($$3.e), arx.a($$3.f))) {
               dfj $$5 = this.dL().a_($$4);
               csv $$6 = $$5.b();
               if ($$6 instanceof cxc) {
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
               this.a(ape.tx, 1.0F, 1.0F);
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
   public boolean E(biq $$0) {
      return this.cb <= 0 && this.cc <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bjg $$0) {
      if (this.cc == 0) {
         if (this.ag.j() < 0.5) {
            this.cb = 40;
            this.a(ape.tw, 1.0F, 1.0F);
            this.dL().a(this, (byte)39);
            $$0.g((biq)this);
         } else {
            this.a($$0);
         }

         $$0.T = true;
      }
   }

   private void gp() {
      if (this.bv()) {
         for (bjg $$1 : this.dL().a(bjg.class, this.cG().g(4.0), e)) {
            if (!($$1 instanceof byq)) {
               $$1.a(this.dM().b((bjg)this), 6.0F);
            }

            this.a($$1);
         }

         ehn $$2 = this.cG().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dL().a(ix.W, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(djt.u);
      }
   }

   private void a(biq $$0) {
      double $$1 = $$0.dq() - this.dq();
      double $$2 = $$0.dw() - this.dw();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ca = 10;
         this.a(ape.tr, 1.0F, 1.0F);
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
   public boolean C(biq $$0) {
      this.ca = 10;
      this.dL().a(this, (byte)4);
      this.a(ape.tr, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected apd w() {
      return ape.tq;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.tu;
   }

   @Override
   protected apd l_() {
      return ape.tt;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.tv, 0.15F, 1.0F);
   }

   @Override
   public boolean a(cpy $$0) {
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
   protected ehi fW() {
      ehi $$0 = super.fW();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
