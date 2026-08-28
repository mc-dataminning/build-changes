import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class clb extends buk implements bwf {
   private static final ajx<cwp> c = akb.a(clb.class, ajz.h);
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
   private buk l;
   @Nullable
   private UUID m;
   public final float b;

   public clb(bur<? extends clb> $$0, dgi $$1) {
      super($$0, $$1);
      this.b = this.ae.i() * (float) Math.PI * 2.0F;
      this.v(this.ae.i() * 360.0F);
   }

   public clb(dgi $$0, double $$1, double $$2, double $$3, cwp $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.A.j() * 0.2 - 0.1, 0.2, $$0.A.j() * 0.2 - 0.1);
   }

   public clb(dgi $$0, double $$1, double $$2, double $$3, cwp $$4, double $$5, double $$6, double $$7) {
      this(bur.ar, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private clb(clb $$0) {
      super($$0.aq(), $$0.dW());
      this.a($$0.l().v());
      this.w($$0);
      this.h = $$0.h;
      this.b = $$0.b;
   }

   @Override
   public boolean bh() {
      return this.l().a(awy.br);
   }

   @Nullable
   @Override
   public buk p() {
      if (this.l != null && !this.l.dR()) {
         return this.l;
      } else if (this.k != null && this.dW() instanceof arc $$0) {
         this.l = $$0.a(this.k);
         return this.l;
      } else {
         return null;
      }
   }

   @Override
   public void x(buk $$0) {
      super.x($$0);
      if ($$0 instanceof clb $$1) {
         this.l = $$1.l;
      }
   }

   @Override
   protected buk.c bg() {
      return buk.c.a;
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(c, cwp.j);
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   @Override
   public void h() {
      if (this.l().f()) {
         this.at();
      } else {
         super.h();
         if (this.i > 0 && this.i != 32767) {
            this.i--;
         }

         this.K = this.dB();
         this.L = this.dD();
         this.M = this.dH();
         fba $$0 = this.dz();
         if (this.bj() && this.b(awv.a) > 0.1F) {
            this.A();
         } else if (this.bx() && this.b(awv.b) > 0.1F) {
            this.B();
         } else {
            this.bf();
         }

         if (this.dW().C) {
            this.ad = false;
         } else {
            this.ad = !this.dW().a(this, this.cR().h(1.0E-7));
            if (this.ad) {
               this.m(this.dB(), (this.cR().b + this.cR().e) / 2.0, this.dH());
            }
         }

         if (!this.aJ() || this.dz().j() > 1.0E-5F || (this.af + this.ar()) % 4 == 0) {
            this.a(bvk.a, this.dz());
            this.aK();
            float $$1 = 0.98F;
            if (this.aJ()) {
               $$1 = this.dW().a_(this.aQ()).b().g() * 0.98F;
            }

            this.h(this.dz().d((double)$$1, 0.98, (double)$$1));
            if (this.aJ()) {
               fba $$2 = this.dz();
               if ($$2.e < 0.0) {
                  this.h($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = ayz.a(this.K) != ayz.a(this.dB()) || ayz.a(this.L) != ayz.a(this.dD()) || ayz.a(this.M) != ayz.a(this.dH());
         int $$4 = $$3 ? 2 : 40;
         if (this.af % $$4 == 0 && !this.dW().C && this.D()) {
            this.C();
         }

         if (this.h != -32768) {
            this.h++;
         }

         this.ar = this.ar | this.bq();
         if (!this.dW().C) {
            double $$5 = this.dz().d($$0).h();
            if ($$5 > 0.01) {
               this.ar = true;
            }
         }

         if (!this.dW().C && this.h >= 6000) {
            this.at();
         }
      }
   }

   @Override
   public ji aQ() {
      return this.e(0.999999F);
   }

   private void A() {
      this.h(0.99F);
   }

   private void B() {
      this.h(0.95F);
   }

   private void h(double $$0) {
      fba $$1 = this.dz();
      this.n($$1.d * $$0, $$1.e + (double)($$1.e < 0.06F ? 5.0E-4F : 0.0F), $$1.f * $$0);
   }

   private void C() {
      if (this.D()) {
         for (clb $$1 : this.dW().a(clb.class, this.cR().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.D())) {
            if ($$1.D()) {
               this.a($$1);
               if (this.dR()) {
                  break;
               }
            }
         }
      }
   }

   private boolean D() {
      cwp $$0 = this.l();
      return this.bL() && this.i != 32767 && this.h != -32768 && this.h < 6000 && $$0.M() < $$0.k();
   }

   private void a(clb $$0) {
      cwp $$1 = this.l();
      cwp $$2 = $$0.l();
      if (Objects.equals(this.m, $$0.m) && a($$1, $$2)) {
         if ($$2.M() < $$1.M()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cwp $$0, cwp $$1) {
      return $$1.M() + $$0.M() > $$1.k() ? false : cwp.c($$0, $$1);
   }

   public static cwp a(cwp $$0, cwp $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.M(), $$1.M());
      cwp $$4 = $$0.c($$0.M() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(clb $$0, cwp $$1, cwp $$2) {
      cwp $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(clb $$0, cwp $$1, clb $$2, cwp $$3) {
      a($$0, $$1, $$3);
      $$0.i = Math.max($$0.i, $$2.i);
      $$0.h = Math.min($$0.h, $$2.h);
      if ($$3.f()) {
         $$2.at();
      }
   }

   @Override
   public boolean bi() {
      return !this.l().a(this.dX().a()) || super.bi();
   }

   @Override
   protected boolean aF() {
      return this.j <= 0 ? true : this.af % 10 == 0;
   }

   @Override
   public final boolean b(bta $$0) {
      return this.d($$0) ? false : this.l().a($$0);
   }

   @Override
   public final boolean a(arc $$0, bta $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().b(dge.c) && $$1.d() instanceof bvi) {
         return false;
      } else if (!this.l().a($$1)) {
         return false;
      } else {
         this.bD();
         this.j = (int)((float)this.j - $$2);
         this.a(ebt.o, $$1.d());
         if (this.j <= 0) {
            this.l().a(this);
            this.at();
         }

         return true;
      }
   }

   @Override
   public boolean a(dga $$0) {
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

      if (!this.l().f()) {
         $$0.a("Item", this.l().a(this.dY()));
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
         this.a(cwp.a(this.dY(), (un)$$1).orElse(cwp.j));
      } else {
         this.a(cwp.j);
      }

      if (this.l().f()) {
         this.at();
      }
   }

   @Override
   public void a_(cox $$0) {
      if (!this.dW().C) {
         cwp $$1 = this.l();
         cwl $$2 = $$1.h();
         int $$3 = $$1.M();
         if (this.i == 0 && (this.m == null || this.m.equals($$0.cG())) && $$0.gi().f($$1)) {
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
   public wo al() {
      wo $$0 = this.an();
      return $$0 != null ? $$0 : this.l().A();
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Nullable
   @Override
   public buk b(etz $$0) {
      buk $$1 = super.b($$0);
      if (!this.dW().C && $$1 instanceof clb $$2) {
         $$2.C();
      }

      return $$1;
   }

   public cwp l() {
      return this.au().a(c);
   }

   public void a(cwp $$0) {
      this.au().a(c, $$0);
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.l().a((buk)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.m = $$0;
   }

   public void b(buk $$0) {
      this.k = $$0.cG();
      this.l = $$0;
   }

   public int m() {
      return this.h;
   }

   public void s() {
      this.i = 10;
   }

   public void t() {
      this.i = 0;
   }

   public void u() {
      this.i = 32767;
   }

   public void b(int $$0) {
      this.i = $$0;
   }

   public boolean v() {
      return this.i > 0;
   }

   public void w() {
      this.h = -32768;
   }

   public void x() {
      this.h = -6000;
   }

   public void y() {
      this.u();
      this.h = 5999;
   }

   public static float f(float $$0, float $$1) {
      return $$0 / 20.0F + $$1;
   }

   public clb z() {
      return new clb(this);
   }

   @Override
   public awb dn() {
      return awb.i;
   }

   @Override
   public float dN() {
      return 180.0F - f((float)this.m() + 0.5F, this.b) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public bvy a_(int $$0) {
      return $$0 == 0 ? bvy.a(this::l, this::a) : super.a_($$0);
   }
}
