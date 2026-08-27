import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdb extends cgz {
   private static final Predicate<blw> e = $$0 -> $$0.bx() && !($$0 instanceof cdb);
   private static final double bU = 0.3;
   private static final double bV = 0.35;
   private static final int bW = 8356754;
   private static final double bX = 0.5725490196078431;
   private static final double bY = 0.5137254901960784;
   private static final double bZ = 0.4980392156862745;
   private static final int ca = 10;
   public static final int b = 40;
   private int cb;
   private int cc;
   private int cd;

   public cdb(bmc<? extends cdb> $$0, ctx $$1) {
      super($$0, $$1);
      this.bK = 20;
      this.a(efk.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bte(this));
      this.bP.a(4, new btu(this, 1.0, true));
      this.bP.a(5, new bux(this, 0.4));
      this.bP.a(6, new bts(this, cfq.class, 6.0F));
      this.bP.a(10, new bts(this, bmq.class, 8.0F));
      this.bQ.a(2, new bvc(this, cgz.class).a());
      this.bQ.a(3, new bvd<>(this, cfq.class, true));
      this.bQ.a(4, new bvd<>(this, cey.class, true, $$0 -> !$$0.o_()));
      this.bQ.a(4, new bvd<>(this, byo.class, true));
   }

   @Override
   protected void T() {
      boolean $$0 = !(this.cN() instanceof bmq) || this.cN().ai().a(asl.c);
      boolean $$1 = !(this.cZ() instanceof chk);
      this.bP.a(btk.a.a, $$0);
      this.bP.a(btk.a.c, $$0 && $$1);
      this.bP.a(btk.a.b, $$0);
      this.bP.a(btk.a.d, $$0);
   }

   public static bnt.a u() {
      return ccw.gl().a(bnu.n, 100.0).a(bnu.o, 0.3).a(bnu.k, 0.75).a(bnu.c, 12.0).a(bnu.d, 1.5).a(bnu.i, 32.0).a(bnu.r, 1.0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.cb);
      $$0.a("StunTick", this.cc);
      $$0.a("RoarTick", this.cd);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.cb = $$0.h("AttackTick");
      this.cc = $$0.h("StunTick");
      this.cd = $$0.h("RoarTick");
   }

   @Override
   public ars ag_() {
      return art.ux;
   }

   @Override
   public int fH() {
      return 45;
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx()) {
         if (this.eY()) {
            this.f(bnu.o).a(0.0);
         } else {
            double $$0 = this.q() != null ? 0.35 : 0.3;
            double $$1 = this.f(bnu.o).b();
            this.f(bnu.o).a(aup.d(0.1, $$1, $$0));
         }

         if (this.P && this.dL().Z().b(ctt.c)) {
            boolean $$2 = false;
            elx $$3 = this.cH().g(0.2);

            for (hx $$4 : hx.b(aup.a($$3.a), aup.a($$3.b), aup.a($$3.c), aup.a($$3.d), aup.a($$3.e), aup.a($$3.f))) {
               djp $$5 = this.dL().a_($$4);
               cwy $$6 = $$5.b();
               if ($$6 instanceof dbh) {
                  $$2 = this.dL().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aC()) {
               this.fb();
            }
         }

         if (this.cd > 0) {
            this.cd--;
            if (this.cd == 10) {
               this.gr();
            }
         }

         if (this.cb > 0) {
            this.cb--;
         }

         if (this.cc > 0) {
            this.cc--;
            this.gq();
            if (this.cc == 0) {
               this.a(art.uC, 1.0F, 1.0F);
               this.cd = 20;
            }
         }
      }
   }

   private void gq() {
      if (this.ag.a(6) == 0) {
         double $$0 = this.dq() - (double)this.dg() * Math.sin((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         double $$1 = this.ds() + (double)this.dh() - 0.3;
         double $$2 = this.dw() + (double)this.dg() * Math.cos((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         this.dL().a(jx.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean eY() {
      return super.eY() || this.cb > 0 || this.cc > 0 || this.cd > 0;
   }

   @Override
   public boolean D(blw $$0) {
      return this.cc <= 0 && this.cd <= 0 ? super.D($$0) : false;
   }

   @Override
   protected void e(bmo $$0) {
      if (this.cd == 0) {
         if (this.ag.j() < 0.5) {
            this.cc = 40;
            this.a(art.uB, 1.0F, 1.0F);
            this.dL().a(this, (byte)39);
            $$0.g((blw)this);
         } else {
            this.a($$0);
         }

         $$0.T = true;
      }
   }

   private void gr() {
      if (this.bx()) {
         for (bmo $$1 : this.dL().a(bmo.class, this.cH().g(4.0), e)) {
            if (!($$1 instanceof cce)) {
               $$1.a(this.dM().b((bmo)this), 6.0F);
            }

            this.a($$1);
         }

         emc $$2 = this.cH().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dL().a(jx.Y, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.b(dnz.u);
      }
   }

   private void a(blw $$0) {
      double $$1 = $$0.dq() - this.dq();
      double $$2 = $$0.dw() - this.dw();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cb = 10;
         this.a(art.uw, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cc = 40;
      }

      super.b($$0);
   }

   public int w() {
      return this.cb;
   }

   public int gf() {
      return this.cc;
   }

   public int gp() {
      return this.cd;
   }

   @Override
   public boolean B(blw $$0) {
      this.cb = 10;
      this.dL().a(this, (byte)4);
      this.a(art.uw, 1.0F, 1.0F);
      return super.B($$0);
   }

   @Nullable
   @Override
   protected ars y() {
      return art.uv;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.uz;
   }

   @Override
   protected ars n_() {
      return art.uy;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.uA, 0.15F, 1.0F);
   }

   @Override
   public boolean a(cua $$0) {
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
   protected elx fY() {
      elx $$0 = super.fY();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
