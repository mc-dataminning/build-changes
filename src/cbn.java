import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbn extends cfc {
   private static final Predicate<bkq> e = $$0 -> $$0.bx() && !($$0 instanceof cbn);
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

   public cbn(bku<? extends cbn> $$0, csa $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bJ = 20;
      this.a(edd.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new brv(this));
      this.bO.a(4, new bsl(this, 1.0, true));
      this.bO.a(5, new bto(this, 0.4));
      this.bO.a(6, new bsj(this, cdu.class, 6.0F));
      this.bO.a(10, new bsj(this, bli.class, 8.0F));
      this.bP.a(2, new btt(this, cfc.class).a());
      this.bP.a(3, new btu<>(this, cdu.class, true));
      this.bP.a(4, new btu<>(this, cdc.class, true, $$0 -> !$$0.n_()));
      this.bP.a(4, new btu<>(this, bxd.class, true));
   }

   @Override
   protected void T() {
      boolean $$0 = !(this.cO() instanceof bli) || this.cO().ai().a(arj.c);
      boolean $$1 = !(this.da() instanceof cfn);
      this.bO.a(bsb.a.a, $$0);
      this.bO.a(bsb.a.c, $$0 && $$1);
      this.bO.a(bsb.a.b, $$0);
      this.bO.a(bsb.a.d, $$0);
   }

   public static bml.a u() {
      return cbi.gl().a(bmm.l, 100.0).a(bmm.m, 0.3).a(bmm.i, 0.75).a(bmm.c, 12.0).a(bmm.d, 1.5).a(bmm.g, 32.0);
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
   public aqq ae_() {
      return aqr.tN;
   }

   @Override
   public int ab() {
      return 45;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, -0.0625F * $$2);
   }

   @Override
   public void c_() {
      super.c_();
      if (this.bx()) {
         if (this.eZ()) {
            this.a(bmm.m).a(0.0);
         } else {
            double $$0 = this.q() != null ? 0.35 : 0.3;
            double $$1 = this.a(bmm.m).b();
            this.a(bmm.m).a(atm.d(0.1, $$1, $$0));
         }

         if (this.P && this.dN().Y().b(crw.c)) {
            boolean $$2 = false;
            ejp $$3 = this.cH().g(0.2);

            for (ht $$4 : ht.b(atm.a($$3.a), atm.a($$3.b), atm.a($$3.c), atm.a($$3.d), atm.a($$3.e), atm.a($$3.f))) {
               dhi $$5 = this.dN().a_($$4);
               cva $$6 = $$5.b();
               if ($$6 instanceof czj) {
                  $$2 = this.dN().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aC()) {
               this.fc();
            }
         }

         if (this.cc > 0) {
            this.cc--;
            if (this.cc == 10) {
               this.gr();
            }
         }

         if (this.ca > 0) {
            this.ca--;
         }

         if (this.cb > 0) {
            this.cb--;
            this.gq();
            if (this.cb == 0) {
               this.a(aqr.tS, 1.0F, 1.0F);
               this.cc = 20;
            }
         }
      }
   }

   private void gq() {
      if (this.ag.a(6) == 0) {
         double $$0 = this.ds() - (double)this.dh() * Math.sin((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         double $$1 = this.du() + (double)this.di() - 0.3;
         double $$2 = this.dy() + (double)this.dh() * Math.cos((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         this.dN().a(js.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean eZ() {
      return super.eZ() || this.ca > 0 || this.cb > 0 || this.cc > 0;
   }

   @Override
   public boolean E(bkq $$0) {
      return this.cb <= 0 && this.cc <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(blg $$0) {
      if (this.cc == 0) {
         if (this.ag.j() < 0.5) {
            this.cb = 40;
            this.a(aqr.tR, 1.0F, 1.0F);
            this.dN().a(this, (byte)39);
            $$0.g((bkq)this);
         } else {
            this.a($$0);
         }

         $$0.T = true;
      }
   }

   private void gr() {
      if (this.bx()) {
         for (blg $$1 : this.dN().a(blg.class, this.cH().g(4.0), e)) {
            if (!($$1 instanceof caq)) {
               $$1.a(this.dO().b((blg)this), 6.0F);
            }

            this.a($$1);
         }

         eju $$2 = this.cH().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dN().a(js.W, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dls.u);
      }
   }

   private void a(bkq $$0) {
      double $$1 = $$0.ds() - this.ds();
      double $$2 = $$0.dy() - this.dy();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ca = 10;
         this.a(aqr.tM, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cb = 40;
      }

      super.b($$0);
   }

   public int w() {
      return this.ca;
   }

   public int gf() {
      return this.cb;
   }

   public int gp() {
      return this.cc;
   }

   @Override
   public boolean C(bkq $$0) {
      this.ca = 10;
      this.dN().a(this, (byte)4);
      this.a(aqr.tM, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected aqq y() {
      return aqr.tL;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.tP;
   }

   @Override
   protected aqq m_() {
      return aqr.tO;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.tQ, 0.15F, 1.0F);
   }

   @Override
   public boolean a(csd $$0) {
      return !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gg() {
      return false;
   }

   @Override
   protected ejp fY() {
      ejp $$0 = super.fY();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
