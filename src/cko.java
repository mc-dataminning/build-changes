import java.util.EnumSet;
import javax.annotation.Nullable;

public class cko extends clt implements cle {
   public static final float b = 0.03F;
   boolean cb;
   protected final cdx c;
   protected final cdu d;

   public cko(btv<? extends cko> $$0, deg $$1) {
      super($$0, $$1);
      this.bP = new cko.d(this);
      this.a(erg.j, 0.0F);
      this.c = new cdx(this, $$1);
      this.d = new cdu(this, $$1);
   }

   public static bvq.a q() {
      return clt.gs().a(bvr.B, 1.0);
   }

   @Override
   protected void t() {
      this.bS.a(1, new cko.c(this, 1.0));
      this.bS.a(2, new cko.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new cko.a(this, 1.0, false));
      this.bS.a(5, new cko.b(this, 1.0));
      this.bS.a(6, new cko.e(this, 1.0, this.dS().N()));
      this.bS.a(7, new cce(this, 1.0));
      this.bT.a(1, new ccz(this, cko.class).a(clv.class));
      this.bT.a(2, new cda<>(this, cnu.class, 10, true, false, this::j));
      this.bT.a(3, new cda<>(this, cnc.class, false));
      this.bT.a(3, new cda<>(this, cgm.class, true));
      this.bT.a(3, new cda<>(this, chm.class, true, false));
      this.bT.a(5, new cda<>(this, chb.class, 10, true, false, chb.bY));
   }

   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(btw.b).f() && $$0.C_().i() < 0.03F) {
         this.a(btw.b, new cvp(cvt.vV));
         this.f(btw.b);
      }

      return $$3;
   }

   public static boolean a(btv<cko> $$0, dew $$1, btu $$2, je $$3, azl $$4) {
      if (!$$1.b_($$3.e()).a(awz.a) && !btu.a($$2)) {
         return false;
      } else {
         jn<dfh> $$5 = $$1.t($$3);
         boolean $$6 = $$1.am() != brm.a && (btu.b($$2) || a($$1, $$3, $$4)) && (btu.a($$2) || $$1.b_($$3).a(awz.a));
         if ($$6 && btu.a($$2)) {
            return true;
         } else {
            return $$5.a(aws.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(deh $$0, je $$1) {
      return $$1.v() < $$0.N() - 5;
   }

   @Override
   protected awd w() {
      return this.bi() ? awe.hF : awe.hE;
   }

   @Override
   protected awd d(bsg $$0) {
      return this.bi() ? awe.hJ : awe.hI;
   }

   @Override
   protected awd n_() {
      return this.bi() ? awe.hH : awe.hG;
   }

   @Override
   protected awd y() {
      return awe.hL;
   }

   @Override
   protected awd aT() {
      return awe.hM;
   }

   @Override
   protected cvp gp() {
      return cvp.k;
   }

   @Override
   protected void a(azl $$0, brn $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(btw.a, new cvp(cvt.vU));
         } else {
            this.a(btw.a, new cvp(cvt.qW));
         }
      }
   }

   @Override
   protected boolean b(cvp $$0, cvp $$1) {
      if ($$1.a(cvt.vV)) {
         return false;
      } else if ($$1.a(cvt.vU)) {
         return $$0.a(cvt.vU) ? $$0.o() < $$1.o() : false;
      } else {
         return $$0.a(cvt.vU) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   public boolean a(dej $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable buk $$0) {
      return $$0 != null ? !this.dS().S() || $$0.bi() : false;
   }

   @Override
   public boolean cG() {
      return !this.ch();
   }

   boolean gy() {
      if (this.cb) {
         return true;
      } else {
         buk $$0 = this.m();
         return $$0 != null && $$0.bi();
      }
   }

   @Override
   public void a_(eys $$0) {
      if (this.de() && this.bi() && this.gy()) {
         this.a(0.01F, $$0);
         this.a(buo.a, this.dv());
         this.h(this.dv().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bo() {
      if (!this.dS().B) {
         if (this.df() && this.bi() && this.gy()) {
            this.bR = this.c;
            this.i(true);
         } else {
            this.bR = this.d;
            this.i(false);
         }
      }
   }

   @Override
   public boolean ci() {
      return this.ch();
   }

   protected boolean gr() {
      erd $$0 = this.P().k();
      if ($$0 != null) {
         je $$1 = $$0.l();
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
   public void a(buk $$0, float $$1) {
      cvp $$2 = this.eW();
      cvp $$3 = $$2.a(cvt.vU) ? $$2 : new cvp(cvt.vU);
      cpb $$4 = new cpb(this.dS(), this, $$3);
      double $$5 = $$0.dx() - this.dx();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dz();
      double $$7 = $$0.dD() - this.dD();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dS() instanceof arh $$9) {
         coo.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dS().am().a() * 4));
      }

      this.a(awe.hK, 1.0F, 1.0F / (this.dV().i() * 0.4F + 0.8F));
   }

   public void x(boolean $$0) {
      this.cb = $$0;
   }

   static class a extends ccw {
      private final cko b;

      public a(cko $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.m());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.j(this.b.m());
      }
   }

   static class b extends cbu {
      private final cko g;

      public b(cko $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dS().S() && this.g.bi() && this.g.dz() >= (double)(this.g.dS().N() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dej $$0, je $$1) {
         je $$2 = $$1.d();
         return $$0.u($$2) && $$0.u($$2.d()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.x(false);
         this.g.bR = this.g.d;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends cbh {
      private final bus a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final deg f;

      public c(bus $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dS();
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.S()) {
            return false;
         } else if (this.a.bi()) {
            return false;
         } else {
            eys $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.d;
               this.c = $$0.e;
               this.d = $$0.f;
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return !this.a.P().m();
      }

      @Override
      public void d() {
         this.a.P().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private eys h() {
         azl $$0 = this.a.dV();
         je $$1 = this.a.ds();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            je $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dhl.G)) {
               return eys.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cak {
      private final cko l;

      public d(cko $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         buk $$0 = this.l.m();
         if (this.l.gy() && this.l.bi()) {
            if ($$0 != null && $$0.dz() > this.l.dz() || this.l.cb) {
               this.l.h(this.l.dv().b(0.0, 0.002, 0.0));
            }

            if (this.k != cak.a.b || this.l.P().m()) {
               this.l.C(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dx();
            double $$2 = this.f - this.l.dz();
            double $$3 = this.g - this.l.dD();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azd.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.a(this.l.dI(), $$5, 90.0F));
            this.l.aT = this.l.dI();
            float $$6 = (float)(this.h * this.l.h(bvr.v));
            float $$7 = azd.h(0.125F, this.l.fm(), $$6);
            this.l.C($$7);
            this.l.h(this.l.dv().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aH()) {
               this.l.h(this.l.dv().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends cbh {
      private final cko a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cko $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dS().S() && this.a.bi() && this.a.dz() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dz() < (double)(this.c - 1) && (this.a.P().m() || this.a.gr())) {
            eys $$0 = cfe.a(this.a, 4, 8, new eys(this.a.dx(), (double)(this.c - 1), this.a.dD()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.P().a($$0.d, $$0.e, $$0.f, this.b);
         }
      }

      @Override
      public void d() {
         this.a.x(true);
         this.d = false;
      }

      @Override
      public void e() {
         this.a.x(false);
      }
   }

   static class f extends ccg {
      private final cko a;

      public f(cle $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cko)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.eW().a(cvt.vU);
      }

      @Override
      public void d() {
         super.d();
         this.a.w(true);
         this.a.c(bro.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fB();
         this.a.w(false);
      }
   }
}
