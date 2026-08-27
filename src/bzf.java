import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzf extends ccu {
   private static final Predicate<bii> e = $$0 -> $$0.bv() && !($$0 instanceof bzf);
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

   public bzf(bim<? extends bzf> $$0, cpl $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bJ = 20;
      this.a(ean.v, 0.0F);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpn(this));
      this.bO.a(4, new bqd(this, 1.0, true));
      this.bO.a(5, new brg(this, 0.4));
      this.bO.a(6, new bqb(this, cbm.class, 6.0F));
      this.bO.a(10, new bqb(this, bja.class, 8.0F));
      this.bP.a(2, new brl(this, ccu.class).a());
      this.bP.a(3, new brm<>(this, cbm.class, true));
      this.bP.a(4, new brm<>(this, cau.class, true, $$0 -> !$$0.i_()));
      this.bP.a(4, new brm<>(this, buv.class, true));
   }

   @Override
   protected void O() {
      boolean $$0 = !(this.cN() instanceof bja) || this.cN().ag().a(apo.b);
      boolean $$1 = !(this.cY() instanceof cdf);
      this.bO.a(bpt.a.a, $$0);
      this.bO.a(bpt.a.c, $$0 && $$1);
      this.bO.a(bpt.a.b, $$0);
      this.bO.a(bpt.a.d, $$0);
   }

   public static bkd.a p() {
      return bza.gg().a(bke.a, 100.0).a(bke.d, 0.3).a(bke.c, 0.75).a(bke.f, 12.0).a(bke.g, 1.5).a(bke.b, 32.0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ca);
      $$0.a("StunTick", this.cb);
      $$0.a("RoarTick", this.cc);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.ca = $$0.h("AttackTick");
      this.cb = $$0.h("StunTick");
      this.cc = $$0.h("RoarTick");
   }

   @Override
   public aov X_() {
      return aow.ts;
   }

   @Override
   public int X() {
      return 45;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, -0.0625F * $$2);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.bv()) {
         if (this.eW()) {
            this.a(bke.d).a(0.0);
         } else {
            double $$0 = this.j() != null ? 0.35 : 0.3;
            double $$1 = this.a(bke.d).b();
            this.a(bke.d).a(arp.d(0.1, $$1, $$0));
         }

         if (this.P && this.dK().X().b(cph.c)) {
            boolean $$2 = false;
            egy $$3 = this.cG().g(0.2);

            for (gu $$4 : gu.b(arp.a($$3.a), arp.a($$3.b), arp.a($$3.c), arp.a($$3.d), arp.a($$3.e), arp.a($$3.f))) {
               dez $$5 = this.dK().a_($$4);
               csl $$6 = $$5.b();
               if ($$6 instanceof cws) {
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
               this.a(aow.tx, 1.0F, 1.0F);
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
         this.dK().a(iv.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   protected boolean eW() {
      return super.eW() || this.ca > 0 || this.cb > 0 || this.cc > 0;
   }

   @Override
   public boolean E(bii $$0) {
      return this.cb <= 0 && this.cc <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(biy $$0) {
      if (this.cc == 0) {
         if (this.ag.j() < 0.5) {
            this.cb = 40;
            this.a(aow.tw, 1.0F, 1.0F);
            this.dK().a(this, (byte)39);
            $$0.g((bii)this);
         } else {
            this.a($$0);
         }

         $$0.T = true;
      }
   }

   private void gm() {
      if (this.bv()) {
         for (biy $$1 : this.dK().a(biy.class, this.cG().g(4.0), e)) {
            if (!($$1 instanceof byi)) {
               $$1.a(this.dL().b((biy)this), 6.0F);
            }

            this.a($$1);
         }

         ehd $$2 = this.cG().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ag.k() * 0.2;
            double $$5 = this.ag.k() * 0.2;
            double $$6 = this.ag.k() * 0.2;
            this.dK().a(iv.W, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(djj.u);
      }
   }

   private void a(bii $$0) {
      double $$1 = $$0.dp() - this.dp();
      double $$2 = $$0.dv() - this.dv();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ca = 10;
         this.a(aow.tr, 1.0F, 1.0F);
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
   public boolean C(bii $$0) {
      this.ca = 10;
      this.dK().a(this, (byte)4);
      this.a(aow.tr, 1.0F, 1.0F);
      return super.C($$0);
   }

   @Nullable
   @Override
   protected aov r() {
      return aow.tq;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.tu;
   }

   @Override
   protected aov h_() {
      return aow.tt;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(aow.tv, 0.15F, 1.0F);
   }

   @Override
   public boolean a(cpo $$0) {
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
   protected egy fT() {
      egy $$0 = super.fT();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
