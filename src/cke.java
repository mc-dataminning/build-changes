import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cke extends bto implements bvi {
   private static final akg<cvp> d = akk.a(cke.class, aki.h);
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
   private bto m;
   @Nullable
   private UUID n;
   public final float c;

   public cke(btv<? extends cke> $$0, deg $$1) {
      super($$0, $$1);
      this.c = this.af.i() * (float) Math.PI * 2.0F;
      this.v(this.af.i() * 360.0F);
   }

   public cke(deg $$0, double $$1, double $$2, double $$3, cvp $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public cke(deg $$0, double $$1, double $$2, double $$3, cvp $$4, double $$5, double $$6, double $$7) {
      this(btv.ag, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private cke(cke $$0) {
      super($$0.ao(), $$0.dS());
      this.a($$0.m().u());
      this.w($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean bg() {
      return this.m().a(axc.bf);
   }

   @Nullable
   @Override
   public bto s() {
      if (this.m != null && !this.m.dN()) {
         return this.m;
      } else if (this.l != null && this.dS() instanceof arh $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void x(bto $$0) {
      super.x($$0);
      if ($$0 instanceof cke $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected bto.b bf() {
      return bto.b.a;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(d, cvp.k);
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.m().f()) {
         this.as();
      } else {
         super.l();
         if (this.j > 0 && this.j != 32767) {
            this.j--;
         }

         this.L = this.dx();
         this.M = this.dz();
         this.N = this.dD();
         eys $$0 = this.dv();
         if (this.bi() && this.b(awz.a) > 0.1F) {
            this.B();
         } else if (this.bw() && this.b(awz.b) > 0.1F) {
            this.C();
         } else {
            this.be();
         }

         if (this.dS().B) {
            this.ae = false;
         } else {
            this.ae = !this.dS().a(this, this.cO().h(1.0E-7));
            if (this.ae) {
               this.m(this.dx(), (this.cO().b + this.cO().e) / 2.0, this.dD());
            }
         }

         if (!this.aH() || this.dv().j() > 1.0E-5F || (this.ag + this.ap()) % 4 == 0) {
            this.a(buo.a, this.dv());
            if (!this.dS().w_()) {
               this.aI();
            }

            float $$1 = 0.98F;
            if (this.aH()) {
               $$1 = this.dS().a_(this.aO()).b().h() * 0.98F;
            }

            this.h(this.dv().d((double)$$1, 0.98, (double)$$1));
            if (this.aH()) {
               eys $$2 = this.dv();
               if ($$2.e < 0.0) {
                  this.h($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = azd.a(this.L) != azd.a(this.dx()) || azd.a(this.M) != azd.a(this.dz()) || azd.a(this.N) != azd.a(this.dD());
         int $$4 = $$3 ? 2 : 40;
         if (this.ag % $$4 == 0 && !this.dS().B && this.E()) {
            this.D();
         }

         if (this.i != -32768) {
            this.i++;
         }

         this.as = this.as | this.bp();
         if (!this.dS().B) {
            double $$5 = this.dv().d($$0).h();
            if ($$5 > 0.01) {
               this.as = true;
            }
         }

         if (!this.dS().B && this.i >= 6000) {
            this.as();
         }
      }
   }

   @Override
   public je aO() {
      return this.e(0.999999F);
   }

   private void B() {
      eys $$0 = this.dv();
      this.n($$0.d * 0.99F, $$0.e + (double)($$0.e < 0.06F ? 5.0E-4F : 0.0F), $$0.f * 0.99F);
   }

   private void C() {
      eys $$0 = this.dv();
      this.n($$0.d * 0.95F, $$0.e + (double)($$0.e < 0.06F ? 5.0E-4F : 0.0F), $$0.f * 0.95F);
   }

   private void D() {
      if (this.E()) {
         for (cke $$1 : this.dS().a(cke.class, this.cO().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.E())) {
            if ($$1.E()) {
               this.a($$1);
               if (this.dN()) {
                  break;
               }
            }
         }
      }
   }

   private boolean E() {
      cvp $$0 = this.m();
      return this.bI() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.J() < $$0.k();
   }

   private void a(cke $$0) {
      cvp $$1 = this.m();
      cvp $$2 = $$0.m();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.J() < $$1.J()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cvp $$0, cvp $$1) {
      return $$1.J() + $$0.J() > $$1.k() ? false : cvp.c($$0, $$1);
   }

   public static cvp a(cvp $$0, cvp $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.J(), $$1.J());
      cvp $$4 = $$0.c($$0.J() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cke $$0, cvp $$1, cvp $$2) {
      cvp $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cke $$0, cvp $$1, cke $$2, cvp $$3) {
      a($$0, $$1, $$3);
      $$0.j = Math.max($$0.j, $$2.j);
      $$0.i = Math.min($$0.i, $$2.i);
      if ($$3.f()) {
         $$2.as();
      }
   }

   @Override
   public boolean bh() {
      return this.m().b(kr.z) || super.bh();
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.dS().ac().b(dec.c) && $$0.d() instanceof bum) {
         return false;
      } else if (!this.m().f() && this.m().a(cvt.uu) && $$0.a(awv.l)) {
         return false;
      } else if (!this.m().a($$0)) {
         return false;
      } else if (this.dS().B) {
         return true;
      } else {
         this.bA();
         this.k = (int)((float)this.k - $$1);
         this.a(dzl.o, $$0.d());
         if (this.k <= 0) {
            this.m().a(this);
            this.as();
         }

         return true;
      }
   }

   @Override
   public boolean a(ddy $$0) {
      return $$0.g() ? super.a($$0) : true;
   }

   @Override
   public void b(uf $$0) {
      $$0.a("Health", (short)this.k);
      $$0.a("Age", (short)this.i);
      $$0.a("PickupDelay", (short)this.j);
      if (this.l != null) {
         $$0.a("Thrower", this.l);
      }

      if (this.n != null) {
         $$0.a("Owner", this.n);
      }

      if (!this.m().f()) {
         $$0.a("Item", this.m().a(this.dU()));
      }
   }

   @Override
   public void a(uf $$0) {
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
         uf $$1 = $$0.p("Item");
         this.a(cvp.a(this.dU(), (vc)$$1).orElse(cvp.k));
      } else {
         this.a(cvp.k);
      }

      if (this.m().f()) {
         this.as();
      }
   }

   @Override
   public void b_(cnu $$0) {
      if (!this.dS().B) {
         cvp $$1 = this.m();
         cvk $$2 = $$1.h();
         int $$3 = $$1.J();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.cD())) && $$0.gc().f($$1)) {
            $$0.a(this, $$3);
            if ($$1.f()) {
               this.as();
               $$1.e($$3);
            }

            $$0.a(awo.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public xd aj() {
      xd $$0 = this.al();
      return (xd)($$0 != null ? $$0 : xd.c(this.m().v()));
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Nullable
   @Override
   public bto b(ern $$0) {
      bto $$1 = super.b($$0);
      if (!this.dS().B && $$1 instanceof cke $$2) {
         $$2.D();
      }

      return $$1;
   }

   public cvp m() {
      return this.at().a(d);
   }

   public void a(cvp $$0) {
      this.at().a(d, $$0);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.m().a((bto)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void b(bto $$0) {
      this.l = $$0.cD();
      this.m = $$0;
   }

   public int o() {
      return this.i;
   }

   public void q() {
      this.j = 10;
   }

   public void t() {
      this.j = 0;
   }

   public void v() {
      this.j = 32767;
   }

   public void b(int $$0) {
      this.j = $$0;
   }

   public boolean w() {
      return this.j > 0;
   }

   @Override
   public void x() {
      this.i = -32768;
   }

   public void y() {
      this.i = -6000;
   }

   public void z() {
      this.v();
      this.i = 5999;
   }

   public static float e(float $$0, float $$1) {
      return $$0 / 20.0F + $$1;
   }

   public cke A() {
      return new cke(this);
   }

   @Override
   public awf di() {
      return awf.i;
   }

   @Override
   public float dJ() {
      return 180.0F - e((float)this.o() + 0.5F, this.c) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public bvb a_(int $$0) {
      return $$0 == 0 ? bvb.a(this::m, this::a) : super.a_($$0);
   }
}
