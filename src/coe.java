import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class coe extends bwv implements byu {
   private static final akn<daa> c = akr.a(coe.class, akp.h);
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
   private bwv o;
   @Nullable
   private UUID p;
   public final float b;

   public coe(bxe<? extends coe> $$0, djz $$1) {
      super($$0, $$1);
      this.b = this.ae.i() * (float) Math.PI * 2.0F;
      this.w(this.ae.i() * 360.0F);
   }

   public coe(djz $$0, double $$1, double $$2, double $$3, daa $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.A.j() * 0.2 - 0.1, 0.2, $$0.A.j() * 0.2 - 0.1);
   }

   public coe(djz $$0, double $$1, double $$2, double $$3, daa $$4, double $$5, double $$6, double $$7) {
      this(bxe.ar, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private coe(coe $$0) {
      super($$0.an(), $$0.dV());
      this.a($$0.f().v());
      this.w($$0);
      this.k = $$0.k;
      this.b = $$0.b;
   }

   @Override
   public boolean bg() {
      return this.f().a(axo.bt);
   }

   @Nullable
   @Override
   public bwv q() {
      if (this.o != null && !this.o.dQ()) {
         return this.o;
      } else if (this.n != null && this.dV() instanceof aru $$0) {
         this.o = $$0.b(this.n);
         return this.o;
      } else {
         return null;
      }
   }

   @Override
   public void x(bwv $$0) {
      super.x($$0);
      if ($$0 instanceof coe $$1) {
         this.o = $$1.o;
      }
   }

   @Override
   protected bwv.c bf() {
      return bwv.c.a;
   }

   @Override
   protected void a(akr.a $$0) {
      $$0.a(c, daa.k);
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
         ffs $$0 = this.dy();
         if (this.bi() && this.b(axl.a) > 0.1F) {
            this.w();
         } else if (this.bv() && this.b(axl.b) > 0.1F) {
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
            this.a(bya.a, this.dy());
            this.aI();
            float $$1 = 0.98F;
            if (this.aH()) {
               $$1 = this.dV().a_(this.aP()).b().g() * 0.98F;
            }

            this.i(this.dy().d((double)$$1, 0.98, (double)$$1));
            if (this.aH()) {
               ffs $$2 = this.dy();
               if ($$2.e < 0.0) {
                  this.i($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = azq.a(this.K) != azq.a(this.dA()) || azq.a(this.L) != azq.a(this.dC()) || azq.a(this.M) != azq.a(this.dG());
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
      ffs $$1 = this.dy();
      this.n($$1.d * $$0, $$1.e + (double)($$1.e < 0.06F ? 5.0E-4F : 0.0F), $$1.f * $$0);
   }

   private void y() {
      if (this.z()) {
         for (coe $$1 : this.dV().a(coe.class, this.cR().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.z())) {
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
      daa $$0 = this.f();
      return this.bJ() && this.l != 32767 && this.k != -32768 && this.k < 6000 && $$0.M() < $$0.k();
   }

   private void a(coe $$0) {
      daa $$1 = this.f();
      daa $$2 = $$0.f();
      if (Objects.equals(this.p, $$0.p) && a($$1, $$2)) {
         if ($$2.M() < $$1.M()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(daa $$0, daa $$1) {
      return $$1.M() + $$0.M() > $$1.k() ? false : daa.c($$0, $$1);
   }

   public static daa a(daa $$0, daa $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.M(), $$1.M());
      daa $$4 = $$0.c($$0.M() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(coe $$0, daa $$1, daa $$2) {
      daa $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(coe $$0, daa $$1, coe $$2, daa $$3) {
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
   public final boolean b(bvk $$0) {
      return this.d($$0) ? false : this.f().a($$0);
   }

   @Override
   public final boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().c(djv.d) && $$1.d() instanceof bxy) {
         return false;
      } else if (!this.f().a($$1)) {
         return false;
      } else {
         this.bB();
         this.m = (int)((float)this.m - $$2);
         this.a(egg.o, $$1.d());
         if (this.m <= 0) {
            this.f().a(this);
            this.aq();
         }

         return true;
      }
   }

   @Override
   public boolean a(djs $$0) {
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
         ali<va> $$1 = this.dX().a(uo.a);
         $$0.a("Item", daa.b, $$1, this.f());
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
      ali<va> $$1 = this.dX().a(uo.a);
      this.a($$0.<daa>a("Item", daa.b, $$1).orElse(daa.k));
      if (this.f().f()) {
         this.aq();
      }
   }

   @Override
   public void a_(crz $$0) {
      if (!this.dV().C) {
         daa $$1 = this.f();
         czw $$2 = $$1.h();
         int $$3 = $$1.M();
         if (this.l == 0 && (this.p == null || this.p.equals($$0.cG())) && $$0.gj().g($$1)) {
            $$0.a(this, $$3);
            if ($$1.f()) {
               this.aq();
               $$1.e($$3);
            }

            $$0.a(axb.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public xc ai() {
      xc $$0 = this.ak();
      return $$0 != null ? $$0 : this.f().A();
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Nullable
   @Override
   public bwv b(eyq $$0) {
      bwv $$1 = super.b($$0);
      if (!this.dV().C && $$1 instanceof coe $$2) {
         $$2.y();
      }

      return $$1;
   }

   public daa f() {
      return this.ar().a(c);
   }

   public void a(daa $$0) {
      this.ar().a(c, $$0);
   }

   @Override
   public void a(akn<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.f().a((bwv)this);
      }
   }

   @Override
   public void b(@Nullable UUID $$0) {
      this.p = $$0;
   }

   public void b(bwv $$0) {
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

   public coe v() {
      return new coe(this);
   }

   @Override
   public aws dm() {
      return aws.i;
   }

   @Override
   public float dM() {
      return 180.0F - f((float)this.g() + 0.5F, this.b) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public byn a_(int $$0) {
      return $$0 == 0 ? byn.a(this::f, this::a) : super.a_($$0);
   }
}
