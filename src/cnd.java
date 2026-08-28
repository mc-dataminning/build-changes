import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cnd extends bwd implements bya {
   private static final akj<cyy> c = akn.a(cnd.class, akl.h);
   private static final float d = 0.1F;
   public static final float a = 0.2125F;
   private static final int e = 6000;
   private static final int f = 32767;
   private static final int g = -32768;
   private int h;
   private int i;
   private int j = 5;
   @Nullable
   private UUID k;
   @Nullable
   private bwd l;
   @Nullable
   private UUID m;
   public final float b;

   public cnd(bwm<? extends cnd> $$0, div $$1) {
      super($$0, $$1);
      this.b = this.ae.i() * (float) Math.PI * 2.0F;
      this.w(this.ae.i() * 360.0F);
   }

   public cnd(div $$0, double $$1, double $$2, double $$3, cyy $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.A.j() * 0.2 - 0.1, 0.2, $$0.A.j() * 0.2 - 0.1);
   }

   public cnd(div $$0, double $$1, double $$2, double $$3, cyy $$4, double $$5, double $$6, double $$7) {
      this(bwm.aq, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private cnd(cnd $$0) {
      super($$0.aq(), $$0.dV());
      this.a($$0.f().v());
      this.w($$0);
      this.h = $$0.h;
      this.b = $$0.b;
   }

   @Override
   public boolean bh() {
      return this.f().a(axk.br);
   }

   @Nullable
   @Override
   public bwd q() {
      if (this.l != null && !this.l.dQ()) {
         return this.l;
      } else if (this.k != null && this.dV() instanceof arq $$0) {
         this.l = $$0.b(this.k);
         return this.l;
      } else {
         return null;
      }
   }

   @Override
   public void x(bwd $$0) {
      super.x($$0);
      if ($$0 instanceof cnd $$1) {
         this.l = $$1.l;
      }
   }

   @Override
   protected bwd.d bg() {
      return bwd.d.a;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(c, cyy.k);
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   @Override
   public void h() {
      if (this.f().f()) {
         this.at();
      } else {
         super.h();
         if (this.i > 0 && this.i != 32767) {
            this.i--;
         }

         this.K = this.dA();
         this.L = this.dC();
         this.M = this.dG();
         fei $$0 = this.dy();
         if (this.bj() && this.b(axh.a) > 0.1F) {
            this.w();
         } else if (this.bw() && this.b(axh.b) > 0.1F) {
            this.x();
         } else {
            this.bf();
         }

         if (this.dV().C) {
            this.ad = false;
         } else {
            this.ad = !this.dV().a(this, this.cR().h(1.0E-7));
            if (this.ad) {
               this.m(this.dA(), (this.cR().b + this.cR().e) / 2.0, this.dG());
            }
         }

         if (!this.aJ() || this.dy().j() > 1.0E-5F || (this.af + this.ar()) % 4 == 0) {
            this.a(bxg.a, this.dy());
            this.aK();
            float $$1 = 0.98F;
            if (this.aJ()) {
               $$1 = this.dV().a_(this.aQ()).b().g() * 0.98F;
            }

            this.i(this.dy().d((double)$$1, 0.98, (double)$$1));
            if (this.aJ()) {
               fei $$2 = this.dy();
               if ($$2.e < 0.0) {
                  this.i($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = azm.a(this.K) != azm.a(this.dA()) || azm.a(this.L) != azm.a(this.dC()) || azm.a(this.M) != azm.a(this.dG());
         int $$4 = $$3 ? 2 : 40;
         if (this.af % $$4 == 0 && !this.dV().C && this.z()) {
            this.y();
         }

         if (this.h != -32768) {
            this.h++;
         }

         this.ar = this.ar | this.bp();
         if (!this.dV().C) {
            double $$5 = this.dy().d($$0).h();
            if ($$5 > 0.01) {
               this.ar = true;
            }
         }

         if (!this.dV().C && this.h >= 6000) {
            this.at();
         }
      }
   }

   @Override
   public iu aQ() {
      return this.f(0.999999F);
   }

   private void w() {
      this.h(0.99F);
   }

   private void x() {
      this.h(0.95F);
   }

   private void h(double $$0) {
      fei $$1 = this.dy();
      this.n($$1.d * $$0, $$1.e + (double)($$1.e < 0.06F ? 5.0E-4F : 0.0F), $$1.f * $$0);
   }

   private void y() {
      if (this.z()) {
         for (cnd $$1 : this.dV().a(cnd.class, this.cR().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.z())) {
            if ($$1.z()) {
               this.a($$1);
               if (this.dQ()) {
                  break;
               }
            }
         }
      }
   }

   private boolean z() {
      cyy $$0 = this.f();
      return this.bK() && this.i != 32767 && this.h != -32768 && this.h < 6000 && $$0.M() < $$0.k();
   }

   private void a(cnd $$0) {
      cyy $$1 = this.f();
      cyy $$2 = $$0.f();
      if (Objects.equals(this.m, $$0.m) && a($$1, $$2)) {
         if ($$2.M() < $$1.M()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cyy $$0, cyy $$1) {
      return $$1.M() + $$0.M() > $$1.k() ? false : cyy.c($$0, $$1);
   }

   public static cyy a(cyy $$0, cyy $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.M(), $$1.M());
      cyy $$4 = $$0.c($$0.M() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cnd $$0, cyy $$1, cyy $$2) {
      cyy $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cnd $$0, cyy $$1, cnd $$2, cyy $$3) {
      a($$0, $$1, $$3);
      $$0.i = Math.max($$0.i, $$2.i);
      $$0.h = Math.min($$0.h, $$2.h);
      if ($$3.f()) {
         $$2.at();
      }
   }

   @Override
   public boolean bi() {
      return !this.f().a(this.dW().a()) || super.bi();
   }

   @Override
   protected boolean aF() {
      return this.j <= 0 ? true : this.af % 10 == 0;
   }

   @Override
   public final boolean b(bus $$0) {
      return this.d($$0) ? false : this.f().a($$0);
   }

   @Override
   public final boolean a(arq $$0, bus $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().c(dir.c) && $$1.d() instanceof bxe) {
         return false;
      } else if (!this.f().a($$1)) {
         return false;
      } else {
         this.bC();
         this.j = (int)((float)this.j - $$2);
         this.a(eez.o, $$1.d());
         if (this.j <= 0) {
            this.f().a(this);
            this.at();
         }

         return true;
      }
   }

   @Override
   public boolean a(dio $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void b(tz $$0) {
      $$0.a("Health", (short)this.j);
      $$0.a("Age", (short)this.h);
      $$0.a("PickupDelay", (short)this.i);
      if (this.k != null) {
         $$0.a("Thrower", this.k);
      }

      if (this.m != null) {
         $$0.a("Owner", this.m);
      }

      if (!this.f().f()) {
         $$0.a("Item", this.f().a(this.dX()));
      }
   }

   @Override
   public void a(tz $$0) {
      this.j = $$0.g("Health");
      this.h = $$0.g("Age");
      if ($$0.e("PickupDelay")) {
         this.i = $$0.g("PickupDelay");
      }

      if ($$0.b("Owner")) {
         this.m = $$0.a("Owner");
      }

      if ($$0.b("Thrower")) {
         this.k = $$0.a("Thrower");
         this.l = null;
      }

      if ($$0.b("Item", 10)) {
         tz $$1 = $$0.p("Item");
         this.a(cyy.a(this.dX(), (uw)$$1).orElse(cyy.k));
      } else {
         this.a(cyy.k);
      }

      if (this.f().f()) {
         this.at();
      }
   }

   @Override
   public void a_(cqy $$0) {
      if (!this.dV().C) {
         cyy $$1 = this.f();
         cyu $$2 = $$1.h();
         int $$3 = $$1.M();
         if (this.i == 0 && (this.m == null || this.m.equals($$0.cG())) && $$0.gi().f($$1)) {
            $$0.a(this, $$3);
            if ($$1.f()) {
               this.at();
               $$1.e($$3);
            }

            $$0.a(awx.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public wy al() {
      wy $$0 = this.an();
      return $$0 != null ? $$0 : this.f().A();
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Nullable
   @Override
   public bwd b(exg $$0) {
      bwd $$1 = super.b($$0);
      if (!this.dV().C && $$1 instanceof cnd $$2) {
         $$2.y();
      }

      return $$1;
   }

   public cyy f() {
      return this.au().a(c);
   }

   public void a(cyy $$0) {
      this.au().a(c, $$0);
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.f().a((bwd)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.m = $$0;
   }

   public void b(bwd $$0) {
      this.k = $$0.cG();
      this.l = $$0;
   }

   public int g() {
      return this.h;
   }

   @Override
   public void j() {
      this.i = 10;
   }

   public void m() {
      this.i = 0;
   }

   public void n() {
      this.i = 32767;
   }

   public void b(int $$0) {
      this.i = $$0;
   }

   public boolean o() {
      return this.i > 0;
   }

   public void s() {
      this.h = -32768;
   }

   public void t() {
      this.h = -6000;
   }

   public void u() {
      this.n();
      this.h = 5999;
   }

   public static float f(float $$0, float $$1) {
      return $$0 / 20.0F + $$1;
   }

   public cnd v() {
      return new cnd(this);
   }

   @Override
   public awo dm() {
      return awo.i;
   }

   @Override
   public float dM() {
      return 180.0F - f((float)this.g() + 0.5F, this.b) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public bxt a_(int $$0) {
      return $$0 == 0 ? bxt.a(this::f, this::a) : super.a_($$0);
   }
}
