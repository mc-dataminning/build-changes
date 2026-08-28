import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class clw extends bva implements bwx {
   private static final ajx<cxh> c = akb.a(clw.class, ajz.h);
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
   private bva l;
   @Nullable
   private UUID m;
   public final float b;

   public clw(bvi<? extends clw> $$0, dgz $$1) {
      super($$0, $$1);
      this.b = this.ae.i() * (float) Math.PI * 2.0F;
      this.w(this.ae.i() * 360.0F);
   }

   public clw(dgz $$0, double $$1, double $$2, double $$3, cxh $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.A.j() * 0.2 - 0.1, 0.2, $$0.A.j() * 0.2 - 0.1);
   }

   public clw(dgz $$0, double $$1, double $$2, double $$3, cxh $$4, double $$5, double $$6, double $$7) {
      this(bvi.aq, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private clw(clw $$0) {
      super($$0.aq(), $$0.dU());
      this.a($$0.f().v());
      this.w($$0);
      this.h = $$0.h;
      this.b = $$0.b;
   }

   @Override
   public boolean bh() {
      return this.f().a(awy.br);
   }

   @Nullable
   @Override
   public bva q() {
      if (this.l != null && !this.l.dP()) {
         return this.l;
      } else if (this.k != null && this.dU() instanceof ard $$0) {
         this.l = $$0.b(this.k);
         return this.l;
      } else {
         return null;
      }
   }

   @Override
   public void x(bva $$0) {
      super.x($$0);
      if ($$0 instanceof clw $$1) {
         this.l = $$1.l;
      }
   }

   @Override
   protected bva.c bg() {
      return bva.c.a;
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(c, cxh.k);
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

         this.K = this.dz();
         this.L = this.dB();
         this.M = this.dF();
         fbx $$0 = this.dx();
         if (this.bj() && this.b(awv.a) > 0.1F) {
            this.w();
         } else if (this.bv() && this.b(awv.b) > 0.1F) {
            this.x();
         } else {
            this.bf();
         }

         if (this.dU().C) {
            this.ad = false;
         } else {
            this.ad = !this.dU().a(this, this.cQ().h(1.0E-7));
            if (this.ad) {
               this.m(this.dz(), (this.cQ().b + this.cQ().e) / 2.0, this.dF());
            }
         }

         if (!this.aJ() || this.dx().j() > 1.0E-5F || (this.af + this.ar()) % 4 == 0) {
            this.a(bwc.a, this.dx());
            this.aK();
            float $$1 = 0.98F;
            if (this.aJ()) {
               $$1 = this.dU().a_(this.aQ()).b().g() * 0.98F;
            }

            this.i(this.dx().d((double)$$1, 0.98, (double)$$1));
            if (this.aJ()) {
               fbx $$2 = this.dx();
               if ($$2.e < 0.0) {
                  this.i($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = ayz.a(this.K) != ayz.a(this.dz()) || ayz.a(this.L) != ayz.a(this.dB()) || ayz.a(this.M) != ayz.a(this.dF());
         int $$4 = $$3 ? 2 : 40;
         if (this.af % $$4 == 0 && !this.dU().C && this.z()) {
            this.y();
         }

         if (this.h != -32768) {
            this.h++;
         }

         this.ar = this.ar | this.bo();
         if (!this.dU().C) {
            double $$5 = this.dx().d($$0).h();
            if ($$5 > 0.01) {
               this.ar = true;
            }
         }

         if (!this.dU().C && this.h >= 6000) {
            this.at();
         }
      }
   }

   @Override
   public ji aQ() {
      return this.f(0.999999F);
   }

   private void w() {
      this.h(0.99F);
   }

   private void x() {
      this.h(0.95F);
   }

   private void h(double $$0) {
      fbx $$1 = this.dx();
      this.n($$1.d * $$0, $$1.e + (double)($$1.e < 0.06F ? 5.0E-4F : 0.0F), $$1.f * $$0);
   }

   private void y() {
      if (this.z()) {
         for (clw $$1 : this.dU().a(clw.class, this.cQ().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.z())) {
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
      cxh $$0 = this.f();
      return this.bJ() && this.i != 32767 && this.h != -32768 && this.h < 6000 && $$0.M() < $$0.k();
   }

   private void a(clw $$0) {
      cxh $$1 = this.f();
      cxh $$2 = $$0.f();
      if (Objects.equals(this.m, $$0.m) && a($$1, $$2)) {
         if ($$2.M() < $$1.M()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cxh $$0, cxh $$1) {
      return $$1.M() + $$0.M() > $$1.k() ? false : cxh.c($$0, $$1);
   }

   public static cxh a(cxh $$0, cxh $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.M(), $$1.M());
      cxh $$4 = $$0.c($$0.M() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(clw $$0, cxh $$1, cxh $$2) {
      cxh $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(clw $$0, cxh $$1, clw $$2, cxh $$3) {
      a($$0, $$1, $$3);
      $$0.i = Math.max($$0.i, $$2.i);
      $$0.h = Math.min($$0.h, $$2.h);
      if ($$3.f()) {
         $$2.at();
      }
   }

   @Override
   public boolean bi() {
      return !this.f().a(this.dV().a()) || super.bi();
   }

   @Override
   protected boolean aF() {
      return this.j <= 0 ? true : this.af % 10 == 0;
   }

   @Override
   public final boolean b(btp $$0) {
      return this.d($$0) ? false : this.f().a($$0);
   }

   @Override
   public final boolean a(ard $$0, btp $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().b(dgv.c) && $$1.d() instanceof bwa) {
         return false;
      } else if (!this.f().a($$1)) {
         return false;
      } else {
         this.bB();
         this.j = (int)((float)this.j - $$2);
         this.a(ecp.o, $$1.d());
         if (this.j <= 0) {
            this.f().a(this);
            this.at();
         }

         return true;
      }
   }

   @Override
   public boolean a(dgs $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void b(tq $$0) {
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
         $$0.a("Item", this.f().a(this.dW()));
      }
   }

   @Override
   public void a(tq $$0) {
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
         tq $$1 = $$0.p("Item");
         this.a(cxh.a(this.dW(), (un)$$1).orElse(cxh.k));
      } else {
         this.a(cxh.k);
      }

      if (this.f().f()) {
         this.at();
      }
   }

   @Override
   public void a_(cpr $$0) {
      if (!this.dU().C) {
         cxh $$1 = this.f();
         cxd $$2 = $$1.h();
         int $$3 = $$1.M();
         if (this.i == 0 && (this.m == null || this.m.equals($$0.cF())) && $$0.gl().f($$1)) {
            $$0.a(this, $$3);
            if ($$1.f()) {
               this.at();
               $$1.e($$3);
            }

            $$0.a(awk.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public wp al() {
      wp $$0 = this.an();
      return $$0 != null ? $$0 : this.f().A();
   }

   @Override
   public boolean cA() {
      return false;
   }

   @Nullable
   @Override
   public bva b(euw $$0) {
      bva $$1 = super.b($$0);
      if (!this.dU().C && $$1 instanceof clw $$2) {
         $$2.y();
      }

      return $$1;
   }

   public cxh f() {
      return this.au().a(c);
   }

   public void a(cxh $$0) {
      this.au().a(c, $$0);
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.f().a((bva)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.m = $$0;
   }

   public void b(bva $$0) {
      this.k = $$0.cF();
      this.l = $$0;
   }

   public int g() {
      return this.h;
   }

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

   public clw v() {
      return new clw(this);
   }

   @Override
   public awb dl() {
      return awb.i;
   }

   @Override
   public float dL() {
      return 180.0F - f((float)this.g() + 0.5F, this.b) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public bwq a_(int $$0) {
      return $$0 == 0 ? bwq.a(this::f, this::a) : super.a_($$0);
   }
}
