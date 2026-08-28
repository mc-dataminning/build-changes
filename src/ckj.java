import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckj extends clo implements ckz {
   public static final float b = 0.03F;
   boolean cc;
   protected final cds c;
   protected final cdp d;

   public ckj(btq<? extends ckj> $$0, dds $$1) {
      super($$0, $$1);
      this.bQ = new ckj.d(this);
      this.a(eqs.j, 0.0F);
      this.c = new cds(this, $$1);
      this.d = new cdp(this, $$1);
   }

   public static bvl.a q() {
      return clo.gr().a(bvm.B, 1.0);
   }

   @Override
   protected void t() {
      this.bT.a(1, new ckj.c(this, 1.0));
      this.bT.a(2, new ckj.f(this, 1.0, 40, 10.0F));
      this.bT.a(2, new ckj.a(this, 1.0, false));
      this.bT.a(5, new ckj.b(this, 1.0));
      this.bT.a(6, new ckj.e(this, 1.0, this.dS().N()));
      this.bT.a(7, new cbz(this, 1.0));
      this.bU.a(1, new ccu(this, ckj.class).a(clq.class));
      this.bU.a(2, new ccv<>(this, cnp.class, 10, true, false, this::j));
      this.bU.a(3, new ccv<>(this, cmx.class, false));
      this.bU.a(3, new ccv<>(this, cgh.class, true));
      this.bU.a(3, new ccv<>(this, chh.class, true, false));
      this.bU.a(5, new ccv<>(this, cgw.class, 10, true, false, cgw.bZ));
   }

   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(btr.b).f() && $$0.C_().i() < 0.03F) {
         this.a(btr.b, new cvl(cvo.vV));
         this.f(btr.b);
      }

      return $$3;
   }

   public static boolean a(btq<ckj> $$0, dei $$1, btp $$2, je $$3, azk $$4) {
      if (!$$1.b_($$3.e()).a(awy.a) && !btp.a($$2)) {
         return false;
      } else {
         jn<det> $$5 = $$1.t($$3);
         boolean $$6 = $$1.am() != brh.a && (btp.b($$2) || a($$1, $$3, $$4)) && (btp.a($$2) || $$1.b_($$3).a(awy.a));
         if ($$6 && btp.a($$2)) {
            return true;
         } else {
            return $$5.a(awr.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(ddt $$0, je $$1) {
      return $$1.v() < $$0.N() - 5;
   }

   @Override
   protected awc w() {
      return this.bi() ? awd.hF : awd.hE;
   }

   @Override
   protected awc d(bsb $$0) {
      return this.bi() ? awd.hJ : awd.hI;
   }

   @Override
   protected awc n_() {
      return this.bi() ? awd.hH : awd.hG;
   }

   @Override
   protected awc y() {
      return awd.hL;
   }

   @Override
   protected awc aT() {
      return awd.hM;
   }

   @Override
   protected cvl go() {
      return cvl.k;
   }

   @Override
   protected void a(azk $$0, bri $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(btr.a, new cvl(cvo.vU));
         } else {
            this.a(btr.a, new cvl(cvo.qW));
         }
      }
   }

   @Override
   protected boolean b(cvl $$0, cvl $$1) {
      if ($$1.a(cvo.vV)) {
         return false;
      } else if ($$1.a(cvo.vU)) {
         return $$0.a(cvo.vU) ? $$0.o() < $$1.o() : false;
      } else {
         return $$0.a(cvo.vU) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(ddv $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable buf $$0) {
      return $$0 != null ? !this.dS().S() || $$0.bi() : false;
   }

   @Override
   public boolean cG() {
      return !this.ch();
   }

   boolean gx() {
      if (this.cc) {
         return true;
      } else {
         buf $$0 = this.m();
         return $$0 != null && $$0.bi();
      }
   }

   @Override
   public void a_(eye $$0) {
      if (this.de() && this.bi() && this.gx()) {
         this.a(0.01F, $$0);
         this.a(buj.a, this.dv());
         this.h(this.dv().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bo() {
      if (!this.dS().B) {
         if (this.df() && this.bi() && this.gx()) {
            this.bS = this.c;
            this.i(true);
         } else {
            this.bS = this.d;
            this.i(false);
         }
      }
   }

   @Override
   public boolean ci() {
      return this.ch();
   }

   protected boolean gq() {
      eqp $$0 = this.P().k();
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
   public void a(buf $$0, float $$1) {
      cvl $$2 = this.eW();
      cvl $$3 = $$2.a(cvo.vU) ? $$2 : new cvl(cvo.vU);
      cow $$4 = new cow(this.dS(), this, $$3);
      double $$5 = $$0.dx() - this.dx();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dz();
      double $$7 = $$0.dD() - this.dD();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dS() instanceof arg $$9) {
         coi.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dS().am().a() * 4));
      }

      this.a(awd.hK, 1.0F, 1.0F / (this.dV().i() * 0.4F + 0.8F));
   }

   public void x(boolean $$0) {
      this.cc = $$0;
   }

   static class a extends ccr {
      private final ckj b;

      public a(ckj $$0, double $$1, boolean $$2) {
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

   static class b extends cbp {
      private final ckj g;

      public b(ckj $$0, double $$1) {
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
      protected boolean a(ddv $$0, je $$1) {
         je $$2 = $$1.d();
         return $$0.u($$2) && $$0.u($$2.d()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.x(false);
         this.g.bS = this.g.d;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends cbc {
      private final bun a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dds f;

      public c(bun $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dS();
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.S()) {
            return false;
         } else if (this.a.bi()) {
            return false;
         } else {
            eye $$0 = this.h();
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
      private eye h() {
         azk $$0 = this.a.dV();
         je $$1 = this.a.ds();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            je $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dgx.G)) {
               return eye.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends caf {
      private final ckj l;

      public d(ckj $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         buf $$0 = this.l.m();
         if (this.l.gx() && this.l.bi()) {
            if ($$0 != null && $$0.dz() > this.l.dz() || this.l.cc) {
               this.l.h(this.l.dv().b(0.0, 0.002, 0.0));
            }

            if (this.k != caf.a.b || this.l.P().m()) {
               this.l.C(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dx();
            double $$2 = this.f - this.l.dz();
            double $$3 = this.g - this.l.dD();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azc.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.a(this.l.dI(), $$5, 90.0F));
            this.l.aU = this.l.dI();
            float $$6 = (float)(this.h * this.l.h(bvm.v));
            float $$7 = azc.h(0.125F, this.l.fm(), $$6);
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

   static class e extends cbc {
      private final ckj a;
      private final double b;
      private final int c;
      private boolean d;

      public e(ckj $$0, double $$1, int $$2) {
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
         if (this.a.dz() < (double)(this.c - 1) && (this.a.P().m() || this.a.gq())) {
            eye $$0 = cez.a(this.a, 4, 8, new eye(this.a.dx(), (double)(this.c - 1), this.a.dD()), (float) (Math.PI / 2));
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

   static class f extends ccb {
      private final ckj a;

      public f(ckz $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (ckj)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.eW().a(cvo.vU);
      }

      @Override
      public void d() {
         super.d();
         this.a.w(true);
         this.a.c(brj.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fB();
         this.a.w(false);
      }
   }
}
