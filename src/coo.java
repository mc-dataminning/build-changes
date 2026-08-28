import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class coo extends bxe implements bzd {
   private static final aku<dak> c = aky.a(coo.class, akw.h);
   private static final float d = 0.1F;
   public static final float a = 0.2125F;
   private static final int e = 6000;
   private static final int f = 32767;
   private static final int g = -32768;
   private static final int h = 5;
   private static final short i = 0;
   private static final short j = 0;
   private int k = 0;
   private int l = 0;
   private int m = 5;
   @Nullable
   private UUID n;
   @Nullable
   private bxe o;
   @Nullable
   private UUID p;
   public final float b;

   public coo(bxn<? extends coo> $$0, dkj $$1) {
      super($$0, $$1);
      this.b = this.ae.i() * (float) Math.PI * 2.0F;
      this.w(this.ae.i() * 360.0F);
   }

   public coo(dkj $$0, double $$1, double $$2, double $$3, dak $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.A.j() * 0.2 - 0.1, 0.2, $$0.A.j() * 0.2 - 0.1);
   }

   public coo(dkj $$0, double $$1, double $$2, double $$3, dak $$4, double $$5, double $$6, double $$7) {
      this(bxn.ar, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private coo(coo $$0) {
      super($$0.an(), $$0.dV());
      this.a($$0.f().v());
      this.w($$0);
      this.k = $$0.k;
      this.b = $$0.b;
   }

   @Override
   public boolean bg() {
      return this.f().a(axv.bt);
   }

   @Nullable
   @Override
   public bxe q() {
      if (this.o != null && !this.o.dQ()) {
         return this.o;
      } else if (this.n != null && this.dV() instanceof asb $$0) {
         this.o = $$0.b(this.n);
         return this.o;
      } else {
         return null;
      }
   }

   @Override
   public void x(bxe $$0) {
      super.x($$0);
      if ($$0 instanceof coo $$1) {
         this.o = $$1.o;
      }
   }

   @Override
   protected bxe.c bf() {
      return bxe.c.a;
   }

   @Override
   protected void a(aky.a $$0) {
      $$0.a(c, dak.l);
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   @Override
   public void h() {
      if (this.f().f()) {
         this.aq();
      } else {
         super.h();
         if (this.l > 0 && this.l != 32767) {
            this.l--;
         }

         this.K = this.dA();
         this.L = this.dC();
         this.M = this.dG();
         fgc $$0 = this.dy();
         if (this.bi() && this.b(axs.a) > 0.1F) {
            this.w();
         } else if (this.bv() && this.b(axs.b) > 0.1F) {
            this.x();
         } else {
            this.be();
         }

         if (this.dV().C) {
            this.ad = false;
         } else {
            this.ad = !this.dV().a(this, this.cR().h(1.0E-7));
            if (this.ad) {
               this.l(this.dA(), (this.cR().b + this.cR().e) / 2.0, this.dG());
            }
         }

         if (!this.aH() || this.dy().j() > 1.0E-5F || (this.af + this.ao()) % 4 == 0) {
            this.a(byj.a, this.dy());
            this.aI();
            float $$1 = 0.98F;
            if (this.aH()) {
               $$1 = this.dV().a_(this.aP()).b().g() * 0.98F;
            }

            this.i(this.dy().d((double)$$1, 0.98, (double)$$1));
            if (this.aH()) {
               fgc $$2 = this.dy();
               if ($$2.e < 0.0) {
                  this.i($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = azz.a(this.K) != azz.a(this.dA()) || azz.a(this.L) != azz.a(this.dC()) || azz.a(this.M) != azz.a(this.dG());
         int $$4 = $$3 ? 2 : 40;
         if (this.af % $$4 == 0 && !this.dV().C && this.z()) {
            this.y();
         }

         if (this.k != -32768) {
            this.k++;
         }

         this.ar = this.ar | this.bo();
         if (!this.dV().C) {
            double $$5 = this.dy().d($$0).h();
            if ($$5 > 0.01) {
               this.ar = true;
            }
         }

         if (!this.dV().C && this.k >= 6000) {
            this.aq();
         }
      }
   }

   @Override
   public iw aP() {
      return this.f(0.999999F);
   }

   private void w() {
      this.h(0.99F);
   }

   private void x() {
      this.h(0.95F);
   }

   private void h(double $$0) {
      fgc $$1 = this.dy();
      this.n($$1.d * $$0, $$1.e + (double)($$1.e < 0.06F ? 5.0E-4F : 0.0F), $$1.f * $$0);
   }

   private void y() {
      if (this.z()) {
         for (coo $$1 : this.dV().a(coo.class, this.cR().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.z())) {
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
      dak $$0 = this.f();
      return this.bJ() && this.l != 32767 && this.k != -32768 && this.k < 6000 && $$0.M() < $$0.k();
   }

   private void a(coo $$0) {
      dak $$1 = this.f();
      dak $$2 = $$0.f();
      if (Objects.equals(this.p, $$0.p) && a($$1, $$2)) {
         if ($$2.M() < $$1.M()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(dak $$0, dak $$1) {
      return $$1.M() + $$0.M() > $$1.k() ? false : dak.c($$0, $$1);
   }

   public static dak a(dak $$0, dak $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.M(), $$1.M());
      dak $$4 = $$0.c($$0.M() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(coo $$0, dak $$1, dak $$2) {
      dak $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(coo $$0, dak $$1, coo $$2, dak $$3) {
      a($$0, $$1, $$3);
      $$0.l = Math.max($$0.l, $$2.l);
      $$0.k = Math.min($$0.k, $$2.k);
      if ($$3.f()) {
         $$2.aq();
      }
   }

   @Override
   public boolean bh() {
      return !this.f().a(this.dW().a()) || super.bh();
   }

   @Override
   protected boolean aD() {
      return this.m <= 0 ? true : this.af % 10 == 0;
   }

   @Override
   public final boolean b(bvt $$0) {
      return this.d($$0) ? false : this.f().a($$0);
   }

   @Override
   public final boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().c(dkf.d) && $$1.d() instanceof byh) {
         return false;
      } else if (!this.f().a($$1)) {
         return false;
      } else {
         this.bB();
         this.m = (int)((float)this.m - $$2);
         this.a(egq.o, $$1.d());
         if (this.m <= 0) {
            this.f().a(this);
            this.aq();
         }

         return true;
      }
   }

   @Override
   public boolean a(dkc $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void b(ua $$0) {
      $$0.a("Health", (short)this.m);
      $$0.a("Age", (short)this.k);
      $$0.a("PickupDelay", (short)this.l);
      $$0.b("Thrower", ka.a, this.n);
      $$0.b("Owner", ka.a, this.p);
      if (!this.f().f()) {
         alp<va> $$1 = this.dX().a(uo.a);
         $$0.a("Item", dak.b, $$1, this.f());
      }
   }

   @Override
   public void a(ua $$0) {
      this.m = $$0.b("Health", (short)5);
      this.k = $$0.b("Age", (short)0);
      this.l = $$0.b("PickupDelay", (short)0);
      this.p = $$0.<UUID>a("Owner", ka.a).orElse(null);
      this.n = $$0.<UUID>a("Thrower", ka.a).orElse(null);
      this.o = null;
      alp<va> $$1 = this.dX().a(uo.a);
      this.a($$0.<dak>a("Item", dak.b, $$1).orElse(dak.l));
      if (this.f().f()) {
         this.aq();
      }
   }

   @Override
   public void a_(csi $$0) {
      if (!this.dV().C) {
         dak $$1 = this.f();
         dag $$2 = $$1.h();
         int $$3 = $$1.M();
         if (this.l == 0 && (this.p == null || this.p.equals($$0.cG())) && $$0.gj().g($$1)) {
            $$0.a(this, $$3);
            if ($$1.f()) {
               this.aq();
               $$1.e($$3);
            }

            $$0.a(axi.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public xg ai() {
      xg $$0 = this.ak();
      return $$0 != null ? $$0 : this.f().A();
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Nullable
   @Override
   public bxe b(eza $$0) {
      bxe $$1 = super.b($$0);
      if (!this.dV().C && $$1 instanceof coo $$2) {
         $$2.y();
      }

      return $$1;
   }

   public dak f() {
      return this.ar().a(c);
   }

   public void a(dak $$0) {
      this.ar().a(c, $$0);
   }

   @Override
   public void a(aku<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.f().a((bxe)this);
      }
   }

   @Override
   public void b(@Nullable UUID $$0) {
      this.p = $$0;
   }

   public void b(bxe $$0) {
      this.n = $$0.cG();
      this.o = $$0;
   }

   public int g() {
      return this.k;
   }

   @Override
   public void j() {
      this.l = 10;
   }

   public void m() {
      this.l = 0;
   }

   public void n() {
      this.l = 32767;
   }

   public void b(int $$0) {
      this.l = $$0;
   }

   public boolean o() {
      return this.l > 0;
   }

   public void s() {
      this.k = -32768;
   }

   public void t() {
      this.k = -6000;
   }

   public void u() {
      this.n();
      this.k = 5999;
   }

   public static float f(float $$0, float $$1) {
      return $$0 / 20.0F + $$1;
   }

   public coo v() {
      return new coo(this);
   }

   @Override
   public awz dm() {
      return awz.i;
   }

   @Override
   public float dM() {
      return 180.0F - f((float)this.g() + 0.5F, this.b) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public byw a_(int $$0) {
      return $$0 == 0 ? byw.a(this::f, this::a) : super.a_($$0);
   }
}
