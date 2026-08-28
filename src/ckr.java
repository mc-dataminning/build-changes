import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckr extends clw implements clh {
   public static final float b = 0.03F;
   boolean cb;
   protected final cea c;
   protected final cdx d;

   public ckr(bty<? extends ckr> $$0, dej $$1) {
      super($$0, $$1);
      this.bP = new ckr.d(this);
      this.a(erk.j, 0.0F);
      this.c = new cea(this, $$1);
      this.d = new cdx(this, $$1);
   }

   public static bvt.a q() {
      return clw.gr().a(bvu.B, 1.0);
   }

   @Override
   protected void t() {
      this.bS.a(1, new ckr.c(this, 1.0));
      this.bS.a(2, new ckr.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new ckr.a(this, 1.0, false));
      this.bS.a(5, new ckr.b(this, 1.0));
      this.bS.a(6, new ckr.e(this, 1.0, this.dS().N()));
      this.bS.a(7, new cch(this, 1.0));
      this.bT.a(1, new cdc(this, ckr.class).a(cly.class));
      this.bT.a(2, new cdd<>(this, cnx.class, 10, true, false, this::j));
      this.bT.a(3, new cdd<>(this, cnf.class, false));
      this.bT.a(3, new cdd<>(this, cgp.class, true));
      this.bT.a(3, new cdd<>(this, chp.class, true, false));
      this.bT.a(5, new cdd<>(this, che.class, 10, true, false, che.bY));
   }

   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(btz.b).f() && $$0.D_().i() < 0.03F) {
         this.a(btz.b, new cvs(cvw.vV));
         this.f(btz.b);
      }

      return $$3;
   }

   public static boolean a(bty<ckr> $$0, dez $$1, btx $$2, jf $$3, azn $$4) {
      if (!$$1.b_($$3.e()).a(axb.a) && !btx.a($$2)) {
         return false;
      } else {
         jo<dfk> $$5 = $$1.t($$3);
         boolean $$6 = $$1.am() != brp.a && (btx.b($$2) || a($$1, $$3, $$4)) && (btx.a($$2) || $$1.b_($$3).a(axb.a));
         if ($$6 && btx.a($$2)) {
            return true;
         } else {
            return $$5.a(awu.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dek $$0, jf $$1) {
      return $$1.v() < $$0.N() - 5;
   }

   @Override
   protected awf w() {
      return this.bi() ? awg.hF : awg.hE;
   }

   @Override
   protected awf d(bsj $$0) {
      return this.bi() ? awg.hJ : awg.hI;
   }

   @Override
   protected awf o_() {
      return this.bi() ? awg.hH : awg.hG;
   }

   @Override
   protected awf y() {
      return awg.hL;
   }

   @Override
   protected awf aT() {
      return awg.hM;
   }

   @Override
   protected cvs go() {
      return cvs.k;
   }

   @Override
   protected void a(azn $$0, brq $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(btz.a, new cvs(cvw.vU));
         } else {
            this.a(btz.a, new cvs(cvw.qW));
         }
      }
   }

   @Override
   protected boolean b(cvs $$0, cvs $$1) {
      if ($$1.a(cvw.vV)) {
         return false;
      } else if ($$1.a(cvw.vU)) {
         return $$0.a(cvw.vU) ? $$0.o() < $$1.o() : false;
      } else {
         return $$0.a(cvw.vU) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(dem $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bun $$0) {
      return $$0 != null ? !this.dS().S() || $$0.bi() : false;
   }

   @Override
   public boolean cG() {
      return !this.ch();
   }

   boolean gx() {
      if (this.cb) {
         return true;
      } else {
         bun $$0 = this.m();
         return $$0 != null && $$0.bi();
      }
   }

   @Override
   public void a_(eyw $$0) {
      if (this.de() && this.bn() && this.gx()) {
         this.a(0.01F, $$0);
         this.a(bur.a, this.dv());
         this.h(this.dv().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bo() {
      if (!this.dS().B) {
         if (this.df() && this.bn() && this.gx()) {
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

   protected boolean gq() {
      erh $$0 = this.P().k();
      if ($$0 != null) {
         jf $$1 = $$0.l();
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
   public void a(bun $$0, float $$1) {
      cvs $$2 = this.eW();
      cvs $$3 = $$2.a(cvw.vU) ? $$2 : new cvs(cvw.vU);
      cpe $$4 = new cpe(this.dS(), this, $$3);
      double $$5 = $$0.dx() - this.dx();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dz();
      double $$7 = $$0.dD() - this.dD();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dS() instanceof arj $$9) {
         cor.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dS().am().a() * 4));
      }

      this.a(awg.hK, 1.0F, 1.0F / (this.dV().i() * 0.4F + 0.8F));
   }

   public void x(boolean $$0) {
      this.cb = $$0;
   }

   static class a extends ccz {
      private final ckr b;

      public a(ckr $$0, double $$1, boolean $$2) {
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

   static class b extends cbx {
      private final ckr g;

      public b(ckr $$0, double $$1) {
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
      protected boolean a(dem $$0, jf $$1) {
         jf $$2 = $$1.d();
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

   static class c extends cbk {
      private final buv a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dej f;

      public c(buv $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dS();
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.S()) {
            return false;
         } else if (this.a.bi()) {
            return false;
         } else {
            eyw $$0 = this.h();
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
      private eyw h() {
         azn $$0 = this.a.dV();
         jf $$1 = this.a.ds();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            jf $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dho.G)) {
               return eyw.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends can {
      private final ckr l;

      public d(ckr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bun $$0 = this.l.m();
         if (this.l.gx() && this.l.bi()) {
            if ($$0 != null && $$0.dz() > this.l.dz() || this.l.cb) {
               this.l.h(this.l.dv().b(0.0, 0.002, 0.0));
            }

            if (this.k != can.a.b || this.l.P().m()) {
               this.l.C(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dx();
            double $$2 = this.f - this.l.dz();
            double $$3 = this.g - this.l.dD();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azf.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.a(this.l.dI(), $$5, 90.0F));
            this.l.aT = this.l.dI();
            float $$6 = (float)(this.h * this.l.h(bvu.v));
            float $$7 = azf.h(0.125F, this.l.fm(), $$6);
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

   static class e extends cbk {
      private final ckr a;
      private final double b;
      private final int c;
      private boolean d;

      public e(ckr $$0, double $$1, int $$2) {
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
            eyw $$0 = cfh.a(this.a, 4, 8, new eyw(this.a.dx(), (double)(this.c - 1), this.a.dD()), (float) (Math.PI / 2));
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

   static class f extends ccj {
      private final ckr a;

      public f(clh $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (ckr)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.eW().a(cvw.vU);
      }

      @Override
      public void d() {
         super.d();
         this.a.w(true);
         this.a.c(brr.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fB();
         this.a.w(false);
      }
   }
}
