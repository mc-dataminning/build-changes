import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cno extends bwi implements byh {
   private static final akj<czk> c = akn.a(cno.class, akl.h);
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
   private bwi l;
   @Nullable
   private UUID m;
   public final float b;

   public cno(bwr<? extends cno> $$0, djh $$1) {
      super($$0, $$1);
      this.b = this.ae.i() * (float) Math.PI * 2.0F;
      this.w(this.ae.i() * 360.0F);
   }

   public cno(djh $$0, double $$1, double $$2, double $$3, czk $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.A.j() * 0.2 - 0.1, 0.2, $$0.A.j() * 0.2 - 0.1);
   }

   public cno(djh $$0, double $$1, double $$2, double $$3, czk $$4, double $$5, double $$6, double $$7) {
      this(bwr.aq, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private cno(cno $$0) {
      super($$0.an(), $$0.dU());
      this.a($$0.f().v());
      this.w($$0);
      this.h = $$0.h;
      this.b = $$0.b;
   }

   @Override
   public boolean bf() {
      return this.f().a(axk.bs);
   }

   @Nullable
   @Override
   public bwi q() {
      if (this.l != null && !this.l.dP()) {
         return this.l;
      } else if (this.k != null && this.dU() instanceof arq $$0) {
         this.l = $$0.b(this.k);
         return this.l;
      } else {
         return null;
      }
   }

   @Override
   public void x(bwi $$0) {
      super.x($$0);
      if ($$0 instanceof cno $$1) {
         this.l = $$1.l;
      }
   }

   @Override
   protected bwi.c be() {
      return bwi.c.a;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(c, czk.k);
   }

   @Override
   protected double bb() {
      return 0.04;
   }

   @Override
   public void h() {
      if (this.f().f()) {
         this.aq();
      } else {
         super.h();
         if (this.i > 0 && this.i != 32767) {
            this.i--;
         }

         this.K = this.dz();
         this.L = this.dB();
         this.M = this.dF();
         fex $$0 = this.dx();
         if (this.bh() && this.b(axh.a) > 0.1F) {
            this.w();
         } else if (this.bu() && this.b(axh.b) > 0.1F) {
            this.x();
         } else {
            this.bd();
         }

         if (this.dU().C) {
            this.ad = false;
         } else {
            this.ad = !this.dU().a(this, this.cQ().h(1.0E-7));
            if (this.ad) {
               this.l(this.dz(), (this.cQ().b + this.cQ().e) / 2.0, this.dF());
            }
         }

         if (!this.aH() || this.dx().j() > 1.0E-5F || (this.af + this.ao()) % 4 == 0) {
            this.a(bxn.a, this.dx());
            this.aI();
            float $$1 = 0.98F;
            if (this.aH()) {
               $$1 = this.dU().a_(this.aO()).b().g() * 0.98F;
            }

            this.i(this.dx().d((double)$$1, 0.98, (double)$$1));
            if (this.aH()) {
               fex $$2 = this.dx();
               if ($$2.e < 0.0) {
                  this.i($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = azm.a(this.K) != azm.a(this.dz()) || azm.a(this.L) != azm.a(this.dB()) || azm.a(this.M) != azm.a(this.dF());
         int $$4 = $$3 ? 2 : 40;
         if (this.af % $$4 == 0 && !this.dU().C && this.z()) {
            this.y();
         }

         if (this.h != -32768) {
            this.h++;
         }

         this.ar = this.ar | this.bn();
         if (!this.dU().C) {
            double $$5 = this.dx().d($$0).h();
            if ($$5 > 0.01) {
               this.ar = true;
            }
         }

         if (!this.dU().C && this.h >= 6000) {
            this.aq();
         }
      }
   }

   @Override
   public iv aO() {
      return this.f(0.999999F);
   }

   private void w() {
      this.h(0.99F);
   }

   private void x() {
      this.h(0.95F);
   }

   private void h(double $$0) {
      fex $$1 = this.dx();
      this.n($$1.d * $$0, $$1.e + (double)($$1.e < 0.06F ? 5.0E-4F : 0.0F), $$1.f * $$0);
   }

   private void y() {
      if (this.z()) {
         for (cno $$1 : this.dU().a(cno.class, this.cQ().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.z())) {
            if ($$1.z()) {
               this.a($$1);
               if (this.dP()) {
                  break;
               }
            }
         }
      }
   }

   private boolean z() {
      czk $$0 = this.f();
      return this.bI() && this.i != 32767 && this.h != -32768 && this.h < 6000 && $$0.M() < $$0.k();
   }

   private void a(cno $$0) {
      czk $$1 = this.f();
      czk $$2 = $$0.f();
      if (Objects.equals(this.m, $$0.m) && a($$1, $$2)) {
         if ($$2.M() < $$1.M()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(czk $$0, czk $$1) {
      return $$1.M() + $$0.M() > $$1.k() ? false : czk.c($$0, $$1);
   }

   public static czk a(czk $$0, czk $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.M(), $$1.M());
      czk $$4 = $$0.c($$0.M() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cno $$0, czk $$1, czk $$2) {
      czk $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cno $$0, czk $$1, cno $$2, czk $$3) {
      a($$0, $$1, $$3);
      $$0.i = Math.max($$0.i, $$2.i);
      $$0.h = Math.min($$0.h, $$2.h);
      if ($$3.f()) {
         $$2.aq();
      }
   }

   @Override
   public boolean bg() {
      return !this.f().a(this.dV().a()) || super.bg();
   }

   @Override
   protected boolean aD() {
      return this.j <= 0 ? true : this.af % 10 == 0;
   }

   @Override
   public final boolean b(bux $$0) {
      return this.d($$0) ? false : this.f().a($$0);
   }

   @Override
   public final boolean a(arq $$0, bux $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().c(djd.d) && $$1.d() instanceof bxl) {
         return false;
      } else if (!this.f().a($$1)) {
         return false;
      } else {
         this.bA();
         this.j = (int)((float)this.j - $$2);
         this.a(efo.o, $$1.d());
         if (this.j <= 0) {
            this.f().a(this);
            this.aq();
         }

         return true;
      }
   }

   @Override
   public boolean a(dja $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void b(tz $$0) {
      $$0.a("Health", (short)this.j);
      $$0.a("Age", (short)this.h);
      $$0.a("PickupDelay", (short)this.i);
      $$0.b("Thrower", jz.a, this.k);
      $$0.b("Owner", jz.a, this.m);
      if (!this.f().f()) {
         ale<uw> $$1 = this.dW().a(un.a);
         $$0.a("Item", czk.b, $$1, this.f());
      }
   }

   @Override
   public void a(tz $$0) {
      this.j = $$0.e("Health");
      this.h = $$0.e("Age");
      if ($$0.c("PickupDelay")) {
         this.i = $$0.e("PickupDelay");
      }

      this.m = $$0.<UUID>a("Owner", jz.a).orElse(null);
      this.k = $$0.<UUID>a("Thrower", jz.a).orElse(null);
      this.l = null;
      ale<uw> $$1 = this.dW().a(un.a);
      this.a($$0.<czk>a("Item", czk.b, $$1).orElse(czk.k));
      if (this.f().f()) {
         this.aq();
      }
   }

   @Override
   public void a_(crj $$0) {
      if (!this.dU().C) {
         czk $$1 = this.f();
         czg $$2 = $$1.h();
         int $$3 = $$1.M();
         if (this.i == 0 && (this.m == null || this.m.equals($$0.cF())) && $$0.gi().g($$1)) {
            $$0.a(this, $$3);
            if ($$1.f()) {
               this.aq();
               $$1.e($$3);
            }

            $$0.a(awx.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public wy ai() {
      wy $$0 = this.ak();
      return $$0 != null ? $$0 : this.f().A();
   }

   @Override
   public boolean cA() {
      return false;
   }

   @Nullable
   @Override
   public bwi b(exv $$0) {
      bwi $$1 = super.b($$0);
      if (!this.dU().C && $$1 instanceof cno $$2) {
         $$2.y();
      }

      return $$1;
   }

   public czk f() {
      return this.ar().a(c);
   }

   public void a(czk $$0) {
      this.ar().a(c, $$0);
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.f().a((bwi)this);
      }
   }

   @Override
   public void b(@Nullable UUID $$0) {
      this.m = $$0;
   }

   public void b(bwi $$0) {
      this.k = $$0.cF();
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

   public cno v() {
      return new cno(this);
   }

   @Override
   public awo dl() {
      return awo.i;
   }

   @Override
   public float dL() {
      return 180.0F - f((float)this.g() + 0.5F, this.b) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public bya a_(int $$0) {
      return $$0 == 0 ? bya.a(this::f, this::a) : super.a_($$0);
   }
}
