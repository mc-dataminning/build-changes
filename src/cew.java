import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cew extends civ {
   private static final Predicate<bnq> e = $$0 -> $$0.bx() && !($$0 instanceof cew);
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

   public cew(bnw<? extends cew> $$0, cvr $$1) {
      super($$0, $$1);
      this.bJ = 20;
      this.a(ehh.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new buz(this));
      this.bO.a(4, new bvp(this, 1.0, true));
      this.bO.a(5, new bws(this, 0.4));
      this.bO.a(6, new bvn(this, chl.class, 6.0F));
      this.bO.a(10, new bvn(this, bok.class, 8.0F));
      this.bP.a(2, new bwx(this, civ.class).a());
      this.bP.a(3, new bwy<>(this, chl.class, true));
      this.bP.a(4, new bwy<>(this, cgt.class, true, $$0 -> !$$0.o_()));
      this.bP.a(4, new bwy<>(this, caj.class, true));
   }

   @Override
   protected void T() {
      boolean $$0 = !(this.cN() instanceof bok) || this.cN().ai().a(aud.c);
      boolean $$1 = !(this.cZ() instanceof cjg);
      this.bO.a(bvf.a.a, $$0);
      this.bO.a(bvf.a.c, $$0 && $$1);
      this.bO.a(bvf.a.b, $$0);
      this.bO.a(bvf.a.d, $$0);
   }

   public static bpo.a u() {
      return cer.gm().a(bpp.n, 100.0).a(bpp.o, 0.3).a(bpp.k, 0.75).a(bpp.c, 12.0).a(bpp.d, 1.5).a(bpp.i, 32.0).a(bpp.r, 1.0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ca);
      $$0.a("StunTick", this.cb);
      $$0.a("RoarTick", this.cc);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.ca = $$0.h("AttackTick");
      this.cb = $$0.h("StunTick");
      this.cc = $$0.h("RoarTick");
   }

   @Override
   public atk ag_() {
      return atl.uy;
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
            this.f(bpp.o).a(0.0);
         } else {
            double $$0 = this.q() != null ? 0.35 : 0.3;
            double $$1 = this.f(bpp.o).b();
            this.f(bpp.o).a(awi.d(0.1, $$1, $$0));
         }

         if (this.O && this.dM().Z().b(cvn.c)) {
            boolean $$2 = false;
            enu $$3 = this.cH().g(0.2);

            for (hz $$4 : hz.b(awi.a($$3.a), awi.a($$3.b), awi.a($$3.c), awi.a($$3.d), awi.a($$3.e), awi.a($$3.f))) {
               dlj $$5 = this.dM().a_($$4);
               cys $$6 = $$5.b();
               if ($$6 instanceof ddb) {
                  $$2 = this.dM().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aC()) {
               this.fb();
            }
         }

         if (this.cc > 0) {
            this.cc--;
            if (this.cc == 10) {
               this.gs();
            }
         }

         if (this.ca > 0) {
            this.ca--;
         }

         if (this.cb > 0) {
            this.cb--;
            this.gr();
            if (this.cb == 0) {
               this.a(atl.uD, 1.0F, 1.0F);
               this.cc = 20;
            }
         }
      }
   }

   private void gr() {
      if (this.af.a(6) == 0) {
         double $$0 = this.dr() - (double)this.dg() * Math.sin((double)(this.aU * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         double $$1 = this.dt() + (double)this.dh() - 0.3;
         double $$2 = this.dx() + (double)this.dg() * Math.cos((double)(this.aU * (float) (Math.PI / 180.0))) + (this.af.j() * 0.6 - 0.3);
         this.dM().a(jz.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean eY() {
      return super.eY() || this.ca > 0 || this.cb > 0 || this.cc > 0;
   }

   @Override
   public boolean D(bnq $$0) {
      return this.cb <= 0 && this.cc <= 0 ? super.D($$0) : false;
   }

   @Override
   protected void e(boi $$0) {
      if (this.cc == 0) {
         if (this.af.j() < 0.5) {
            this.cb = 40;
            this.a(atl.uC, 1.0F, 1.0F);
            this.dM().a(this, (byte)39);
            $$0.g((bnq)this);
         } else {
            this.a($$0);
         }

         $$0.S = true;
      }
   }

   private void gs() {
      if (this.bx()) {
         for (boi $$1 : this.dM().a(boi.class, this.cH().g(4.0), e)) {
            if (!($$1 instanceof cdz)) {
               $$1.a(this.dN().b((boi)this), 6.0F);
            }

            this.a($$1);
         }

         enz $$2 = this.cH().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.af.k() * 0.2;
            double $$5 = this.af.k() * 0.2;
            double $$6 = this.af.k() * 0.2;
            this.dM().a(jz.Y, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.b(dpw.u);
      }
   }

   private void a(bnq $$0) {
      double $$1 = $$0.dr() - this.dr();
      double $$2 = $$0.dx() - this.dx();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ca = 10;
         this.a(atl.ux, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cb = 40;
      }

      super.b($$0);
   }

   public int w() {
      return this.ca;
   }

   public int gg() {
      return this.cb;
   }

   public int gq() {
      return this.cc;
   }

   @Override
   public boolean B(bnq $$0) {
      this.ca = 10;
      this.dM().a(this, (byte)4);
      this.a(atl.ux, 1.0F, 1.0F);
      return super.B($$0);
   }

   @Nullable
   @Override
   protected atk y() {
      return atl.uw;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.uA;
   }

   @Override
   protected atk n_() {
      return atl.uz;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.uB, 0.15F, 1.0F);
   }

   @Override
   public boolean a(cvu $$0) {
      return !$$0.d(this.cH());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gh() {
      return false;
   }

   @Override
   protected enu fZ() {
      enu $$0 = super.fZ();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
