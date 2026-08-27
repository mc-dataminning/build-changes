import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzi extends ccx {
   private static final Predicate<bil> e = $$0 -> $$0.bv() && !($$0 instanceof bzi);
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

   public bzi(bip<? extends bzi> $$0, cpq $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bJ = 20;
      this.a(eas.v, 0.0F);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpq(this));
      this.bO.a(4, new bqg(this, 1.0, true));
      this.bO.a(5, new brj(this, 0.4));
      this.bO.a(6, new bqe(this, cbp.class, 6.0F));
      this.bO.a(10, new bqe(this, bjd.class, 8.0F));
      this.bP.a(2, new bro(this, ccx.class).a());
      this.bP.a(3, new brp<>(this, cbp.class, true));
      this.bP.a(4, new brp<>(this, cax.class, true, $$0 -> !$$0.i_()));
      this.bP.a(4, new brp<>(this, buy.class, true));
   }

   @Override
   protected void O() {
      boolean $$0 = !(this.cN() instanceof bjd) || this.cN().ag().a(apr.b);
      boolean $$1 = !(this.cY() instanceof cdi);
      this.bO.a(bpw.a.a, $$0);
      this.bO.a(bpw.a.c, $$0 && $$1);
      this.bO.a(bpw.a.b, $$0);
      this.bO.a(bpw.a.d, $$0);
   }

   public static bkg.a p() {
      return bzd.gg().a(bkh.a, 100.0).a(bkh.d, 0.3).a(bkh.c, 0.75).a(bkh.f, 12.0).a(bkh.g, 1.5).a(bkh.b, 32.0);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ca);
      $$0.a("StunTick", this.cb);
      $$0.a("RoarTick", this.cc);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.ca = $$0.h("AttackTick");
      this.cb = $$0.h("StunTick");
      this.cc = $$0.h("RoarTick");
   }

   @Override
   public aoy X_() {
      return aoz.ts;
   }

   @Override
   public int X() {
      return 45;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, -0.0625F * $$2);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.bv()) {
         if (this.eW()) {
            this.a(bkh.d).a(0.0);
         } else {
            double $$0 = this.j() != null ? 0.35 : 0.3;
            double $$1 = this.a(bkh.d).b();
            this.a(bkh.d).a(ars.d(0.1, $$1, $$0));
         }

         if (this.P && this.dK().X().b(cpm.c)) {
            boolean $$2 = false;
            ehd $$3 = this.cG().g(0.2);

            for (gw $$4 : gw.b(ars.a($$3.a), ars.a($$3.b), ars.a($$3.c), ars.a($$3.d), ars.a($$3.e), ars.a($$3.f))) {
               dfe $$5 = this.dK().a_($$4);
               csq $$6 = $$5.b();
               if ($$6 instanceof cwx) {
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
               this.gm();
            }
         }

         if (this.ca > 0) {
            this.ca--;
         }

         if (this.cb > 0) {
            this.cb--;
            this.gl();
            if (this.cb == 0) {
               this.a(aoz.tx, 1.0F, 1.0F);
               this.cc = 20;
            }
         }
      }
   }

   private void gl() {
      if (this.ag.a(6) == 0) {
         double $$0 = this.dp() - (double)this.df() * Math.sin((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         double $$1 = this.dr() + (double)this.dg() - 0.3;
         double $$2 = this.dv() + (double)this.df() * Math.cos((double)(this.aU * (float) (Math.PI / 180.0))) + (this.ag.j() * 0.6 - 0.3);
         this.dK().a(ix.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean eW() {
      return super.eW() || this.ca > 0 || this.cb > 0 || this.cc > 0;
   }

   @Override
   public boolean E(bil $$0) {
      return this.cb <= 0 && this.cc <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bjb $$0) {
      if (this.cc == 0) {
         if (this.ag.j() < 0.5) {
            this.cb = 40;
            this.a(aoz.tw, 1.0F, 1.0F);
            this.dK().a(this, (byte)39);
            $$0.g((bil)this);
         } else {
            this.a($$0);
         }

         $$0.T = true;
      }
   }

   private void gm() {
      if (this.bv()) {
         for (bjb $$1 : this.dK().a(bjb.class, this.cG().g(4.0), e)) {
            if (!($$1 instanceof byl)) {
               $$1.a(this.dL().b((bjb)this), 6.0F);
            }

            this.a($$1);
         }

         ehi $$2 = this.cG().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dK().a(ix.W, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(djo.u);
      }
   }

   private void a(bil $$0) {
      double $$1 = $$0.dp() - this.dp();
      double $$2 = $$0.dv() - this.dv();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ca = 10;
         this.a(aoz.tr, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.cb = 40;
      }

      super.b($$0);
   }

   public int q() {
      return this.ca;
   }

   public int ga() {
      return this.cb;
   }

   public int gk() {
      return this.cc;
   }

   @Override
   public boolean C(bil $$0) {
      this.ca = 10;
      this.dK().a(this, (byte)4);
      this.a(aoz.tr, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected aoy r() {
      return aoz.tq;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.tu;
   }

   @Override
   protected aoy h_() {
      return aoz.tt;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.tv, 0.15F, 1.0F);
   }

   @Override
   public boolean a(cpt $$0) {
      return !$$0.d(this.cG());
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gb() {
      return false;
   }

   @Override
   protected ehd fT() {
      ehd $$0 = super.fT();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
