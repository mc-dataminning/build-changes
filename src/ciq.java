import java.util.EnumSet;
import javax.annotation.Nullable;

public class ciq extends cjx implements cji {
   public static final float b = 0.03F;
   boolean ck;
   protected final ccb c;
   protected final cby d;

   public ciq(bsb<? extends ciq> $$0, dca $$1) {
      super($$0, $$1);
      this.bY = new ciq.d(this);
      this.a(epv.j, 0.0F);
      this.c = new ccb(this, $$1);
      this.d = new cby(this, $$1);
   }

   public static btu.a r() {
      return cjx.gD().a(btv.v, 1.0);
   }

   @Override
   protected void t() {
      this.cb.a(1, new ciq.c(this, 1.0));
      this.cb.a(2, new ciq.f(this, 1.0, 40, 10.0F));
      this.cb.a(2, new ciq.a(this, 1.0, false));
      this.cb.a(5, new ciq.b(this, 1.0));
      this.cb.a(6, new ciq.e(this, 1.0, this.dU().A_()));
      this.cb.a(7, new cai(this, 1.0));
      this.cc.a(1, new cbd(this, ciq.class).a(cjz.class));
      this.cc.a(2, new cbe<>(this, cly.class, 10, true, false, this::j));
      this.cc.a(3, new cbe<>(this, clg.class, false));
      this.cc.a(3, new cbe<>(this, ceq.class, true));
      this.cc.a(3, new cbe<>(this, cfq.class, true, false));
      this.cc.a(5, new cbe<>(this, cff.class, 10, true, false, cff.ch));
   }

   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.d(bsc.b).d() && $$0.F_().i() < 0.03F) {
         this.a(bsc.b, new cuh(cuk.xC));
         this.f(bsc.b);
      }

      return $$3;
   }

   public static boolean a(bsb<ciq> $$0, dcp $$1, bss $$2, ir $$3, ayt $$4) {
      if (!$$1.b_($$3.d()).a(awj.a) && !bss.a($$2)) {
         return false;
      } else {
         ja<dcz> $$5 = $$1.t($$3);
         boolean $$6 = $$1.al() != bpx.a && (bss.b($$2) || a($$1, $$3, $$4)) && (bss.a($$2) || $$1.b_($$3).a(awj.a));
         if ($$6 && bss.a($$2)) {
            return true;
         } else {
            return $$5.a(awd.at) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dcb $$0, ir $$1) {
      return $$1.v() < $$0.A_() - 5;
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   protected avn u() {
      return this.bi() ? avo.hE : avo.hD;
   }

   @Override
   protected avn d(bqt $$0) {
      return this.bi() ? avo.hI : avo.hH;
   }

   @Override
   protected avn n_() {
      return this.bi() ? avo.hG : avo.hF;
   }

   @Override
   protected avn gy() {
      return avo.hK;
   }

   @Override
   protected avn aT() {
      return avo.hL;
   }

   @Override
   protected cuh gz() {
      return cuh.i;
   }

   @Override
   protected void a(ayt $$0, bpy $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bsc.a, new cuh(cuk.xA));
         } else {
            this.a(bsc.a, new cuh(cuk.ss));
         }
      }
   }

   @Override
   protected boolean b(cuh $$0, cuh $$1) {
      if ($$1.a(cuk.xC)) {
         return false;
      } else if ($$1.a(cuk.xA)) {
         return $$0.a(cuk.xA) ? $$0.m() < $$1.m() : false;
      } else {
         return $$0.a(cuk.xA) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gA() {
      return false;
   }

   @Override
   public boolean a(dcd $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bso $$0) {
      return $$0 != null ? !this.dU().R() || $$0.bi() : false;
   }

   @Override
   public boolean cH() {
      return !this.ch();
   }

   boolean gC() {
      if (this.ck) {
         return true;
      } else {
         bso $$0 = this.p();
         return $$0 != null && $$0.bi();
      }
   }

   @Override
   public void a(ewu $$0) {
      if (this.df() && this.bi() && this.gC()) {
         this.a(0.01F, $$0);
         this.a(bst.a, this.dx());
         this.g(this.dx().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bo() {
      if (!this.dU().C) {
         if (this.dg() && this.bi() && this.gC()) {
            this.ca = this.c;
            this.i(true);
         } else {
            this.ca = this.d;
            this.i(false);
         }
      }
   }

   @Override
   public boolean ci() {
      return this.ch();
   }

   protected boolean gB() {
      eps $$0 = this.J().j();
      if ($$0 != null) {
         ir $$1 = $$0.l();
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
   public void a(bso $$0, float $$1) {
      cnf $$2 = new cnf(this.dU(), this, new cuh(cuk.xA));
      double $$3 = $$0.dz() - this.dz();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dB();
      double $$5 = $$0.dF() - this.dF();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dU().al().a() * 4));
      this.a(avo.hJ, 1.0F, 1.0F / (this.et().i() * 0.4F + 0.8F));
      this.dU().b($$2);
   }

   public void w(boolean $$0) {
      this.ck = $$0;
   }

   static class a extends cba {
      private final ciq b;

      public a(ciq $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.j(this.b.p());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.p());
      }
   }

   static class b extends bzy {
      private final ciq g;

      public b(ciq $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dU().R() && this.g.bi() && this.g.dB() >= (double)(this.g.dU().A_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(dcd $$0, ir $$1) {
         ir $$2 = $$1.c();
         return $$0.u($$2) && $$0.u($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.ca = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends bzl {
      private final bsw a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dca f;

      public c(bsw $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dU();
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.R()) {
            return false;
         } else if (this.a.bi()) {
            return false;
         } else {
            ewu $$0 = this.h();
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
         return !this.a.J().l();
      }

      @Override
      public void c() {
         this.a.J().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private ewu h() {
         ayt $$0 = this.a.et();
         ir $$1 = this.a.du();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            ir $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dfe.al)) {
               return ewu.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends byo {
      private final ciq l;

      public d(ciq $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bso $$0 = this.l.p();
         if (this.l.gC() && this.l.bi()) {
            if ($$0 != null && $$0.dB() > this.l.dB() || this.l.ck) {
               this.l.g(this.l.dx().b(0.0, 0.002, 0.0));
            }

            if (this.k != byo.a.b || this.l.J().l()) {
               this.l.y(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dz();
            double $$2 = this.f - this.l.dB();
            double $$3 = this.g - this.l.dF();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(aym.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dK(), $$5, 90.0F));
            this.l.bj = this.l.dK();
            float $$6 = (float)(this.h * this.l.g(btv.r));
            float $$7 = aym.i(0.125F, this.l.fw(), $$6);
            this.l.y($$7);
            this.l.g(this.l.dx().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aE()) {
               this.l.g(this.l.dx().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bzl {
      private final ciq a;
      private final double b;
      private final int c;
      private boolean d;

      public e(ciq $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dU().R() && this.a.bi() && this.a.dB() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dB() < (double)(this.c - 1) && (this.a.J().l() || this.a.gB())) {
            ewu $$0 = cdi.a(this.a, 4, 8, new ewu(this.a.dz(), (double)(this.c - 1), this.a.dF()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.J().a($$0.c, $$0.d, $$0.e, this.b);
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

   static class f extends cak {
      private final ciq a;

      public f(cji $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (ciq)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.fg().a(cuk.xA);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bpz.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fK();
         this.a.v(false);
      }
   }
}
