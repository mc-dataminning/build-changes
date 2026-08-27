import java.util.EnumSet;
import javax.annotation.Nullable;

public class byo extends bzt implements bze {
   public static final float b = 0.03F;
   boolean bX;
   protected final bsj c;
   protected final bsg d;

   public byo(bim<? extends byo> $$0, cpl $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bL = new byo.d(this);
      this.a(ean.j, 0.0F);
      this.c = new bsj(this, $$1);
      this.d = new bsg(this, $$1);
   }

   @Override
   protected void p() {
      this.bO.a(1, new byo.c(this, 1.0));
      this.bO.a(2, new byo.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new byo.a(this, 1.0, false));
      this.bO.a(5, new byo.b(this, 1.0));
      this.bO.a(6, new byo.e(this, 1.0, this.dK().t_()));
      this.bO.a(7, new bqq(this, 1.0));
      this.bP.a(1, new brl(this, byo.class).a(bzv.class));
      this.bP.a(2, new brm<>(this, cbm.class, 10, true, false, this::j));
      this.bP.a(3, new brm<>(this, cau.class, false));
      this.bP.a(3, new brm<>(this, buv.class, true));
      this.bP.a(3, new brm<>(this, bvq.class, true, false));
      this.bP.a(5, new brm<>(this, bvk.class, 10, true, false, bvk.bU));
   }

   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(bin.b).b() && $$0.y_().i() < 0.03F) {
         this.a(bin.b, new cix(cja.uX));
         this.e(bin.b);
      }

      return $$3;
   }

   public static boolean a(bim<byo> $$0, cqa $$1, bjc $$2, gu $$3, aru $$4) {
      if (!$$1.b_($$3.d()).a(apq.a)) {
         return false;
      } else {
         he<cqj> $$5 = $$1.s($$3);
         boolean $$6 = $$1.ai() != bgn.a && a($$1, $$3, $$4) && ($$2 == bjc.c || $$1.b_($$3).a(apq.a));
         return $$5.a(apk.ao) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
      }
   }

   private static boolean a(cpm $$0, gu $$1) {
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
   protected cix ga() {
      return cix.b;
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bin.a, new cix(cja.uV));
         } else {
            this.a(bin.a, new cix(cja.qh));
         }
      }
   }

   @Override
   protected boolean b(cix $$0, cix $$1) {
      if ($$1.a(cja.uX)) {
         return false;
      } else if ($$1.a(cja.uV)) {
         return $$0.a(cja.uV) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(cja.uV) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gb() {
      return false;
   }

   @Override
   public boolean a(cpo $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable biy $$0) {
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
         biy $$0 = this.j();
         return $$0 != null && $$0.aX();
      }
   }

   @Override
   public void h(ehd $$0) {
      if (this.cW() && this.aX() && this.gk()) {
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
      ear $$0 = this.H().j();
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
      ccq $$2 = new ccq(this.dK(), this, new cix(cja.uV));
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

   static class a extends bri {
      private final byo b;

      public a(byo $$0, double $$1, boolean $$2) {
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

   static class b extends bqg {
      private final byo g;

      public b(byo $$0, double $$1) {
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
      protected boolean a(cpo $$0, gu $$1) {
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

   static class c extends bpt {
      private final bjh a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cpl f;

      public c(bjh $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dK();
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.N()) {
            return false;
         } else if (this.a.aX()) {
            return false;
         } else {
            ehd $$0 = this.h();
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
      private ehd h() {
         aru $$0 = this.a.ee();
         gu $$1 = this.a.dk();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            gu $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(csm.G)) {
               return ehd.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bow {
      private final byo l;

      public d(byo $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         biy $$0 = this.l.j();
         if (this.l.gk() && this.l.aX()) {
            if ($$0 != null && $$0.dr() > this.l.dr() || this.l.bX) {
               this.l.f(this.l.dn().b(0.0, 0.002, 0.0));
            }

            if (this.k != bow.a.b || this.l.H().l()) {
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
            float $$6 = (float)(this.h * this.l.b(bke.d));
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

   static class e extends bpt {
      private final byo a;
      private final double b;
      private final int c;
      private boolean d;

      public e(byo $$0, double $$1, int $$2) {
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
            ehd $$0 = bto.a(this.a, 4, 8, new ehd(this.a.dp(), (double)(this.c - 1), this.a.dv()), (float) (Math.PI / 2));
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

   static class f extends bqs {
      private final byo a;

      public f(bze $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (byo)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eR().a(cja.uV);
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
