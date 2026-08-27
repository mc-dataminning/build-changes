import java.util.EnumSet;
import javax.annotation.Nullable;

public class byp extends bzu implements bzf {
   public static final float b = 0.03F;
   boolean bX;
   protected final bsk c;
   protected final bsh d;

   public byp(bim<? extends byp> $$0, cpm $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bL = new byp.d(this);
      this.a(eao.j, 0.0F);
      this.c = new bsk(this, $$1);
      this.d = new bsh(this, $$1);
   }

   @Override
   protected void p() {
      this.bO.a(1, new byp.c(this, 1.0));
      this.bO.a(2, new byp.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new byp.a(this, 1.0, false));
      this.bO.a(5, new byp.b(this, 1.0));
      this.bO.a(6, new byp.e(this, 1.0, this.dK().t_()));
      this.bO.a(7, new bqr(this, 1.0));
      this.bP.a(1, new brm(this, byp.class).a(bzw.class));
      this.bP.a(2, new brn<>(this, cbn.class, 10, true, false, this::l));
      this.bP.a(3, new brn<>(this, cav.class, false));
      this.bP.a(3, new brn<>(this, buw.class, true));
      this.bP.a(3, new brn<>(this, bvr.class, true, false));
      this.bP.a(5, new brn<>(this, bvl.class, 10, true, false, bvl.bU));
   }

   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(bin.b).b() && $$0.y_().i() < 0.03F) {
         this.a(bin.b, new ciy(cjb.uX));
         this.e(bin.b);
      }

      return $$3;
   }

   public static boolean a(bim<byp> $$0, cqb $$1, bjc $$2, gu $$3, aru $$4) {
      if (!$$1.b_($$3.d()).a(apq.a)) {
         return false;
      } else {
         he<cqk> $$5 = $$1.s($$3);
         boolean $$6 = $$1.ai() != bgn.a && a($$1, $$3, $$4) && ($$2 == bjc.c || $$1.b_($$3).a(apq.a));
         return $$5.a(apk.ao) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
      }
   }

   private static boolean a(cpn $$0, gu $$1) {
      return $$1.v() < $$0.t_() - 5;
   }

   @Override
   protected boolean q() {
      return false;
   }

   @Override
   protected aov r() {
      return this.aX() ? aow.gx : aow.gw;
   }

   @Override
   protected aov d(bhg $$0) {
      return this.aX() ? aow.gB : aow.gA;
   }

   @Override
   protected aov h_() {
      return this.aX() ? aow.gz : aow.gy;
   }

   @Override
   protected aov t() {
      return aow.gD;
   }

   @Override
   protected aov aL() {
      return aow.gE;
   }

   @Override
   protected ciy fZ() {
      return ciy.b;
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bin.a, new ciy(cjb.uV));
         } else {
            this.a(bin.a, new ciy(cjb.qh));
         }
      }
   }

   @Override
   protected boolean b(ciy $$0, ciy $$1) {
      if ($$1.a(cjb.uX)) {
         return false;
      } else if ($$1.a(cjb.uV)) {
         return $$0.a(cjb.uV) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(cjb.uV) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean ga() {
      return false;
   }

   @Override
   public boolean a(cpp $$0) {
      return $$0.f(this);
   }

   public boolean l(@Nullable biy $$0) {
      return $$0 != null ? !this.dK().N() || $$0.aX() : false;
   }

   @Override
   public boolean cy() {
      return !this.bY();
   }

   boolean gj() {
      if (this.bX) {
         return true;
      } else {
         biy $$0 = this.j();
         return $$0 != null && $$0.aX();
      }
   }

   @Override
   public void h(ehe $$0) {
      if (this.cW() && this.aX() && this.gj()) {
         this.a(0.01F, $$0);
         this.a(bje.a, this.dn());
         this.f(this.dn().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   public void bd() {
      if (!this.dK().B) {
         if (this.cX() && this.aX() && this.gj()) {
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

   protected boolean gb() {
      eas $$0 = this.H().j();
      if ($$0 != null) {
         gu $$1 = $$0.l();
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
   public void a(biy $$0, float $$1) {
      ccr $$2 = new ccr(this.dK(), this, new ciy(cjb.uV));
      double $$3 = $$0.dp() - this.dp();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dr();
      double $$5 = $$0.dv() - this.dv();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dK().ai().a() * 4));
      this.a(aow.gC, 1.0F, 1.0F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$2);
   }

   public void w(boolean $$0) {
      this.bX = $$0;
   }

   static class a extends brj {
      private final byp b;

      public a(byp $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.l(this.b.j());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.l(this.b.j());
      }
   }

   static class b extends bqh {
      private final byp g;

      public b(byp $$0, double $$1) {
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
      protected boolean a(cpp $$0, gu $$1) {
         gu $$2 = $$1.c();
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

   static class c extends bpu {
      private final bjh a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cpm f;

      public c(bjh $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dK();
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.N()) {
            return false;
         } else if (this.a.aX()) {
            return false;
         } else {
            ehe $$0 = this.h();
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
      private ehe h() {
         aru $$0 = this.a.ee();
         gu $$1 = this.a.dk();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            gu $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(csn.G)) {
               return ehe.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends box {
      private final byp l;

      public d(byp $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         biy $$0 = this.l.j();
         if (this.l.gj() && this.l.aX()) {
            if ($$0 != null && $$0.dr() > this.l.dr() || this.l.bX) {
               this.l.f(this.l.dn().b(0.0, 0.002, 0.0));
            }

            if (this.k != box.a.b || this.l.H().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dp();
            double $$2 = this.f - this.l.dr();
            double $$3 = this.g - this.l.dv();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(arp.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dA(), $$5, 90.0F));
            this.l.aU = this.l.dA();
            float $$6 = (float)(this.h * this.l.b(bkf.d));
            float $$7 = arp.i(0.125F, this.l.fd(), $$6);
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

   static class e extends bpu {
      private final byp a;
      private final double b;
      private final int c;
      private boolean d;

      public e(byp $$0, double $$1, int $$2) {
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
         if (this.a.dr() < (double)(this.c - 1) && (this.a.H().l() || this.a.gb())) {
            ehe $$0 = btp.a(this.a, 4, 8, new ehe(this.a.dp(), (double)(this.c - 1), this.a.dv()), (float) (Math.PI / 2));
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

   static class f extends bqt {
      private final byp a;

      public f(bzf $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (byp)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eR().a(cjb.uV);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bgp.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fr();
         this.a.v(false);
      }
   }
}
