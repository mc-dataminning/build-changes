import java.util.EnumSet;
import javax.annotation.Nullable;

public class byr extends bzw implements bzh {
   public static final float b = 0.03F;
   boolean bX;
   protected final bsm c;
   protected final bsj d;

   public byr(bip<? extends byr> $$0, cpq $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bL = new byr.d(this);
      this.a(eas.j, 0.0F);
      this.c = new bsm(this, $$1);
      this.d = new bsj(this, $$1);
   }

   @Override
   protected void p() {
      this.bO.a(1, new byr.c(this, 1.0));
      this.bO.a(2, new byr.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new byr.a(this, 1.0, false));
      this.bO.a(5, new byr.b(this, 1.0));
      this.bO.a(6, new byr.e(this, 1.0, this.dK().t_()));
      this.bO.a(7, new bqt(this, 1.0));
      this.bP.a(1, new bro(this, byr.class).a(bzy.class));
      this.bP.a(2, new brp<>(this, cbp.class, 10, true, false, this::j));
      this.bP.a(3, new brp<>(this, cax.class, false));
      this.bP.a(3, new brp<>(this, buy.class, true));
      this.bP.a(3, new brp<>(this, bvt.class, true, false));
      this.bP.a(5, new brp<>(this, bvn.class, 10, true, false, bvn.bU));
   }

   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(biq.b).b() && $$0.y_().i() < 0.03F) {
         this.a(biq.b, new cja(cjd.uX));
         this.e(biq.b);
      }

      return $$3;
   }

   public static boolean a(bip<byr> $$0, cqf $$1, bjf $$2, gw $$3, arx $$4) {
      if (!$$1.b_($$3.d()).a(apt.a)) {
         return false;
      } else {
         hg<cqo> $$5 = $$1.s($$3);
         boolean $$6 = $$1.ai() != bgq.a && a($$1, $$3, $$4) && ($$2 == bjf.c || $$1.b_($$3).a(apt.a));
         return $$5.a(apn.ao) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
      }
   }

   private static boolean a(cpr $$0, gw $$1) {
      return $$1.v() < $$0.t_() - 5;
   }

   @Override
   protected boolean q() {
      return false;
   }

   @Override
   protected aoy r() {
      return this.aX() ? aoz.gx : aoz.gw;
   }

   @Override
   protected aoy d(bhj $$0) {
      return this.aX() ? aoz.gB : aoz.gA;
   }

   @Override
   protected aoy h_() {
      return this.aX() ? aoz.gz : aoz.gy;
   }

   @Override
   protected aoy t() {
      return aoz.gD;
   }

   @Override
   protected aoy aL() {
      return aoz.gE;
   }

   @Override
   protected cja ga() {
      return cja.b;
   }

   @Override
   protected void a(arx $$0, bgr $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(biq.a, new cja(cjd.uV));
         } else {
            this.a(biq.a, new cja(cjd.qh));
         }
      }
   }

   @Override
   protected boolean b(cja $$0, cja $$1) {
      if ($$1.a(cjd.uX)) {
         return false;
      } else if ($$1.a(cjd.uV)) {
         return $$0.a(cjd.uV) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(cjd.uV) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gb() {
      return false;
   }

   @Override
   public boolean a(cpt $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bjb $$0) {
      return $$0 != null ? !this.dK().N() || $$0.aX() : false;
   }

   @Override
   public boolean cy() {
      return !this.bY();
   }

   boolean gk() {
      if (this.bX) {
         return true;
      } else {
         bjb $$0 = this.j();
         return $$0 != null && $$0.aX();
      }
   }

   @Override
   public void h(ehi $$0) {
      if (this.cW() && this.aX() && this.gk()) {
         this.a(0.01F, $$0);
         this.a(bjh.a, this.dn());
         this.f(this.dn().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   public void bd() {
      if (!this.dK().B) {
         if (this.cX() && this.aX() && this.gk()) {
            this.bN = this.c;
            this.h(true);
         } else {
            this.bN = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean bZ() {
      return this.bY();
   }

   protected boolean gc() {
      eaw $$0 = this.H().j();
      if ($$0 != null) {
         gw $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.i((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(bjb $$0, float $$1) {
      cct $$2 = new cct(this.dK(), this, new cja(cjd.uV));
      double $$3 = $$0.dp() - this.dp();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dr();
      double $$5 = $$0.dv() - this.dv();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dK().ai().a() * 4));
      this.a(aoz.gC, 1.0F, 1.0F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$2);
   }

   public void w(boolean $$0) {
      this.bX = $$0;
   }

   static class a extends brl {
      private final byr b;

      public a(byr $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.j(this.b.j());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.j());
      }
   }

   static class b extends bqj {
      private final byr g;

      public b(byr $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dK().N() && this.g.aX() && this.g.dr() >= (double)(this.g.dK().t_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(cpt $$0, gw $$1) {
         gw $$2 = $$1.c();
         return $$0.t($$2) && $$0.t($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bN = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends bpw {
      private final bjk a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cpq f;

      public c(bjk $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dK();
         this.a(EnumSet.of(bpw.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.N()) {
            return false;
         } else if (this.a.aX()) {
            return false;
         } else {
            ehi $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.c;
               this.c = $$0.d;
               this.d = $$0.e;
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return !this.a.H().l();
      }

      @Override
      public void c() {
         this.a.H().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private ehi h() {
         arx $$0 = this.a.ee();
         gw $$1 = this.a.dk();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            gw $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(csr.G)) {
               return ehi.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends boz {
      private final byr l;

      public d(byr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bjb $$0 = this.l.j();
         if (this.l.gk() && this.l.aX()) {
            if ($$0 != null && $$0.dr() > this.l.dr() || this.l.bX) {
               this.l.f(this.l.dn().b(0.0, 0.002, 0.0));
            }

            if (this.k != boz.a.b || this.l.H().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dp();
            double $$2 = this.f - this.l.dr();
            double $$3 = this.g - this.l.dv();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ars.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dA(), $$5, 90.0F));
            this.l.aU = this.l.dA();
            float $$6 = (float)(this.h * this.l.b(bkh.d));
            float $$7 = ars.i(0.125F, this.l.fd(), $$6);
            this.l.w($$7);
            this.l.f(this.l.dn().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aA()) {
               this.l.f(this.l.dn().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bpw {
      private final byr a;
      private final double b;
      private final int c;
      private boolean d;

      public e(byr $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dK().N() && this.a.aX() && this.a.dr() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dr() < (double)(this.c - 1) && (this.a.H().l() || this.a.gc())) {
            ehi $$0 = btr.a(this.a, 4, 8, new ehi(this.a.dp(), (double)(this.c - 1), this.a.dv()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.H().a($$0.c, $$0.d, $$0.e, this.b);
         }
      }

      @Override
      public void c() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void d() {
         this.a.w(false);
      }
   }

   static class f extends bqv {
      private final byr a;

      public f(bzh $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (byr)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eR().a(cjd.uV);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bgs.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fr();
         this.a.v(false);
      }
   }
}
