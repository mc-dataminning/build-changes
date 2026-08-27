import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cig extends brv implements btm {
   private static final ajy<cuh> d = akc.a(cig.class, aka.h);
   private static final float e = 0.1F;
   public static final float b = 0.2125F;
   private static final int f = 6000;
   private static final int g = 32767;
   private static final int h = -32768;
   private int i;
   private int j;
   private int k = 5;
   @Nullable
   private UUID l;
   @Nullable
   private brv m;
   @Nullable
   private UUID n;
   public final float c;

   public cig(bsb<? extends cig> $$0, dca $$1) {
      super($$0, $$1);
      this.c = this.al.i() * (float) Math.PI * 2.0F;
      this.r(this.al.i() * 360.0F);
   }

   public cig(dca $$0, double $$1, double $$2, double $$3, cuh $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.A.j() * 0.2 - 0.1, 0.2, $$0.A.j() * 0.2 - 0.1);
   }

   public cig(dca $$0, double $$1, double $$2, double $$3, cuh $$4, double $$5, double $$6, double $$7) {
      this(bsb.ai, $$0);
      this.a_($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private cig(cig $$0) {
      super($$0.ak(), $$0.dU());
      this.a($$0.p().r());
      this.v($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean bg() {
      return this.p().a(awm.bc);
   }

   @Nullable
   @Override
   public brv t() {
      if (this.m != null && !this.m.dP()) {
         return this.m;
      } else if (this.l != null && this.dU() instanceof aqt $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void w(brv $$0) {
      super.w($$0);
      if ($$0 instanceof cig $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected brv.c bf() {
      return brv.c.a;
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(d, cuh.i);
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.p().d()) {
         this.ao();
      } else {
         super.l();
         if (this.j > 0 && this.j != 32767) {
            this.j--;
         }

         this.M = this.dz();
         this.N = this.dB();
         this.O = this.dF();
         ewu $$0 = this.dx();
         if (this.bi() && this.b(awj.a) > 0.1F) {
            this.D();
         } else if (this.bx() && this.b(awj.b) > 0.1F) {
            this.E();
         } else {
            this.be();
         }

         if (this.dU().C) {
            this.ah = false;
         } else {
            this.ah = !this.dU().b(this, this.cP().h(1.0E-7));
            if (this.ah) {
               this.m(this.dz(), (this.cP().b + this.cP().e) / 2.0, this.dF());
            }
         }

         if (!this.aE() || this.dx().i() > 1.0E-5F || (this.am + this.al()) % 4 == 0) {
            this.a(bst.a, this.dx());
            float $$1 = 0.98F;
            if (this.aE()) {
               $$1 = this.dU().a_(this.aN()).b().h() * 0.98F;
               dri $$2 = this.p().a(ke.am);
               if ($$2 != null) {
                  $$1 = $$2.a($$1);
               }
            }

            this.g(this.dx().d((double)$$1, 0.98, (double)$$1));
            if (this.aE()) {
               ewu $$3 = this.dx();
               if ($$3.d < 0.0) {
                  this.g($$3.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$4 = aym.a(this.M) != aym.a(this.dz()) || aym.a(this.N) != aym.a(this.dB()) || aym.a(this.O) != aym.a(this.dF());
         int $$5 = $$4 ? 2 : 40;
         if (this.am % $$5 == 0 && !this.dU().C && this.G()) {
            this.F();
         }

         if (this.i != -32768) {
            this.i++;
         }

         this.az = this.az | this.bp();
         if (!this.dU().C) {
            double $$6 = this.dx().d($$0).g();
            if ($$6 > 0.01) {
               this.az = true;
            }
         }

         if (!this.dU().C && this.i >= 6000) {
            this.ao();
         }
      }
   }

   @Override
   protected ir aN() {
      return this.d(0.999999F);
   }

   private void D() {
      ewu $$0 = this.dx();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void E() {
      ewu $$0 = this.dx();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
      if (this.p().a(cuk.vK)) {
         this.o($$0.c + ((double)this.al.i() - 0.5) * 0.21, $$0.d + (double)this.al.i() * 0.1337, $$0.e + ((double)this.al.i() - 0.5) * 0.21);
      }
   }

   private void F() {
      if (this.G()) {
         for (cig $$1 : this.dU().a(cig.class, this.cP().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.G())) {
            if ($$1.G()) {
               this.a($$1);
               if (this.dP()) {
                  break;
               }
            }
         }
      }
   }

   private boolean G() {
      cuh $$0 = this.p();
      return this.bI() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.G() < $$0.i();
   }

   private void a(cig $$0) {
      cuh $$1 = this.p();
      cuh $$2 = $$0.p();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.G() < $$1.G()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cuh $$0, cuh $$1) {
      return $$1.G() + $$0.G() > $$1.i() ? false : cuh.c($$0, $$1);
   }

   public static cuh a(cuh $$0, cuh $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.i(), $$2) - $$0.G(), $$1.G());
      cuh $$4 = $$0.c($$0.G() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cig $$0, cuh $$1, cuh $$2) {
      cuh $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cig $$0, cuh $$1, cig $$2, cuh $$3) {
      a($$0, $$1, $$3);
      $$0.j = Math.max($$0.j, $$2.j);
      $$0.i = Math.min($$0.i, $$2.i);
      if ($$3.d()) {
         $$2.ao();
      }
   }

   @Override
   public boolean bh() {
      return this.p().b(ke.u) || super.bh();
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         cuh $$2 = this.p();
         if (!$$2.d() && $$2.a(cuk.wd) && $$0.a(awg.m)) {
            return false;
         } else if (!$$2.a($$0)) {
            return false;
         } else if (this.dU().C) {
            return true;
         } else if ($$2.a(awm.aN) && $$0.a(bqw.d)) {
            this.a($$2.a(cuk.vK, 1));

            for (int $$3 = 0; $$3 < $$2.G() - 1; $$3++) {
               cig $$4 = new cig(this);
               $$4.p().e(1);
               this.dU().b($$4);
            }

            return true;
         } else {
            this.bA();
            this.k = (int)((float)this.k - $$1);
            this.a(dxv.o, $$0.d());
            if (this.k <= 0) {
               $$2.a(this);
               this.ao();
            }

            return true;
         }
      }
   }

   @Override
   public void b(uk $$0) {
      $$0.a("Health", (short)this.k);
      $$0.a("Age", (short)this.i);
      $$0.a("PickupDelay", (short)this.j);
      if (this.l != null) {
         $$0.a("Thrower", this.l);
      }

      if (this.n != null) {
         $$0.a("Owner", this.n);
      }

      if (!this.p().d()) {
         $$0.a("Item", this.p().a(this.dY()));
      }
   }

   @Override
   public void a(uk $$0) {
      this.k = $$0.g("Health");
      this.i = $$0.g("Age");
      if ($$0.e("PickupDelay")) {
         this.j = $$0.g("PickupDelay");
      }

      if ($$0.b("Owner")) {
         this.n = $$0.a("Owner");
      }

      if ($$0.b("Thrower")) {
         this.l = $$0.a("Thrower");
         this.m = null;
      }

      if ($$0.b("Item", 10)) {
         uk $$1 = $$0.p("Item");
         this.a(cuh.a(this.dY(), (vh)$$1).orElse(cuh.i));
      } else {
         this.a(cuh.i);
      }

      if (this.p().d()) {
         this.ao();
      }
   }

   @Override
   public void b_(cly $$0) {
      if (!this.dU().C) {
         cuh $$1 = this.p();
         cuc $$2 = $$1.f();
         int $$3 = $$1.G();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.cE())) && $$0.gl().f($$1)) {
            $$0.a(this, $$3);
            if ($$1.d()) {
               this.ao();
               $$1.e($$3);
            }

            $$0.a(avz.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public xe af() {
      xe $$0 = this.ah();
      return (xe)($$0 != null ? $$0 : xe.c(this.p().s()));
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Nullable
   @Override
   public brv b(aqt $$0, boolean $$1) {
      brv $$2 = super.b($$0, $$1);
      if (!this.dU().C && $$2 instanceof cig) {
         ((cig)$$2).F();
      }

      return $$2;
   }

   public cuh p() {
      return this.ap().a(d);
   }

   public void a(cuh $$0) {
      this.ap().a(d, $$0);
   }

   @Override
   public void a(ajy<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.p().a((brv)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void b(brv $$0) {
      this.l = $$0.cE();
      this.m = $$0;
   }

   public int r() {
      return this.i;
   }

   public void u() {
      this.j = 10;
   }

   public void w() {
      this.j = 0;
   }

   public void x() {
      this.j = 32767;
   }

   public void b(int $$0) {
      this.j = $$0;
   }

   public boolean y() {
      return this.j > 0;
   }

   @Override
   public void z() {
      this.i = -32768;
   }

   public void A() {
      this.i = -6000;
   }

   public void B() {
      this.x();
      this.i = 5999;
   }

   public float a(float $$0) {
      return ((float)this.r() + $$0) / 20.0F + this.c;
   }

   public cig C() {
      return new cig(this);
   }

   @Override
   public avq dj() {
      return avq.i;
   }

   @Override
   public float dL() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public btf a_(int $$0) {
      return $$0 == 0 ? new btf() {
         @Override
         public cuh a() {
            return cig.this.p();
         }

         @Override
         public boolean a(cuh $$0) {
            cig.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }
}
