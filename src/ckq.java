import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class ckq extends btz implements bvu {
   private static final akk<cvx> d = ako.a(ckq.class, akm.h);
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
   private btz m;
   @Nullable
   private UUID n;
   public final float c;

   public ckq(bug<? extends ckq> $$0, dev $$1) {
      super($$0, $$1);
      this.c = this.af.i() * (float) Math.PI * 2.0F;
      this.v(this.af.i() * 360.0F);
   }

   public ckq(dev $$0, double $$1, double $$2, double $$3, cvx $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.A.j() * 0.2 - 0.1, 0.2, $$0.A.j() * 0.2 - 0.1);
   }

   public ckq(dev $$0, double $$1, double $$2, double $$3, cvx $$4, double $$5, double $$6, double $$7) {
      this(bug.ag, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private ckq(ckq $$0) {
      super($$0.aq(), $$0.dX());
      this.a($$0.m().v());
      this.w($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean bi() {
      return this.m().a(axi.bo);
   }

   @Nullable
   @Override
   public btz s() {
      if (this.m != null && !this.m.dS()) {
         return this.m;
      } else if (this.l != null && this.dX() instanceof arm $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void x(btz $$0) {
      super.x($$0);
      if ($$0 instanceof ckq $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected btz.b bh() {
      return btz.b.a;
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(d, cvx.k);
   }

   @Override
   protected double be() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.m().f()) {
         this.au();
      } else {
         super.l();
         if (this.j > 0 && this.j != 32767) {
            this.j--;
         }

         this.L = this.dC();
         this.M = this.dE();
         this.N = this.dI();
         ezh $$0 = this.dA();
         if (this.bk() && this.b(axf.a) > 0.1F) {
            this.B();
         } else if (this.by() && this.b(axf.b) > 0.1F) {
            this.C();
         } else {
            this.bg();
         }

         if (this.dX().C) {
            this.ae = false;
         } else {
            this.ae = !this.dX().a(this, this.cS().h(1.0E-7));
            if (this.ae) {
               this.m(this.dC(), (this.cS().b + this.cS().e) / 2.0, this.dI());
            }
         }

         if (!this.aJ() || this.dA().j() > 1.0E-5F || (this.ag + this.ar()) % 4 == 0) {
            this.a(buz.a, this.dA());
            this.aK();
            float $$1 = 0.98F;
            if (this.aJ()) {
               $$1 = this.dX().a_(this.aQ()).b().g() * 0.98F;
            }

            this.h(this.dA().d((double)$$1, 0.98, (double)$$1));
            if (this.aJ()) {
               ezh $$2 = this.dA();
               if ($$2.e < 0.0) {
                  this.h($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = azj.a(this.L) != azj.a(this.dC()) || azj.a(this.M) != azj.a(this.dE()) || azj.a(this.N) != azj.a(this.dI());
         int $$4 = $$3 ? 2 : 40;
         if (this.ag % $$4 == 0 && !this.dX().C && this.E()) {
            this.D();
         }

         if (this.i != -32768) {
            this.i++;
         }

         this.as = this.as | this.br();
         if (!this.dX().C) {
            double $$5 = this.dA().d($$0).h();
            if ($$5 > 0.01) {
               this.as = true;
            }
         }

         if (!this.dX().C && this.i >= 6000) {
            this.au();
         }
      }
   }

   @Override
   public jg aQ() {
      return this.e(0.999999F);
   }

   private void B() {
      ezh $$0 = this.dA();
      this.n($$0.d * 0.99F, $$0.e + (double)($$0.e < 0.06F ? 5.0E-4F : 0.0F), $$0.f * 0.99F);
   }

   private void C() {
      ezh $$0 = this.dA();
      this.n($$0.d * 0.95F, $$0.e + (double)($$0.e < 0.06F ? 5.0E-4F : 0.0F), $$0.f * 0.95F);
   }

   private void D() {
      if (this.E()) {
         for (ckq $$1 : this.dX().a(ckq.class, this.cS().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.E())) {
            if ($$1.E()) {
               this.a($$1);
               if (this.dS()) {
                  break;
               }
            }
         }
      }
   }

   private boolean E() {
      cvx $$0 = this.m();
      return this.bM() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.L() < $$0.k();
   }

   private void a(ckq $$0) {
      cvx $$1 = this.m();
      cvx $$2 = $$0.m();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.L() < $$1.L()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cvx $$0, cvx $$1) {
      return $$1.L() + $$0.L() > $$1.k() ? false : cvx.c($$0, $$1);
   }

   public static cvx a(cvx $$0, cvx $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.L(), $$1.L());
      cvx $$4 = $$0.c($$0.L() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(ckq $$0, cvx $$1, cvx $$2) {
      cvx $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(ckq $$0, cvx $$1, ckq $$2, cvx $$3) {
      a($$0, $$1, $$3);
      $$0.j = Math.max($$0.j, $$2.j);
      $$0.i = Math.min($$0.i, $$2.i);
      if ($$3.f()) {
         $$2.au();
      }
   }

   @Override
   public boolean bj() {
      return this.m().b(kt.A) || super.bj();
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.dX().ac().b(der.c) && $$0.d() instanceof bux) {
         return false;
      } else if (!this.m().f() && this.m().a(cwb.uu) && $$0.a(axb.l)) {
         return false;
      } else if (!this.m().a($$0)) {
         return false;
      } else if (this.dX().C) {
         return true;
      } else {
         this.bE();
         this.k = (int)((float)this.k - $$1);
         this.a(eaa.o, $$0.d());
         if (this.k <= 0) {
            this.m().a(this);
            this.au();
         }

         return true;
      }
   }

   @Override
   public boolean a(den $$0) {
      return $$0.g() ? super.a($$0) : true;
   }

   @Override
   public void b(uj $$0) {
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
         $$0.a("Item", this.m().a(this.dZ()));
      }
   }

   @Override
   public void a(uj $$0) {
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
         uj $$1 = $$0.p("Item");
         this.a(cvx.a(this.dZ(), (vg)$$1).orElse(cvx.k));
      } else {
         this.a(cvx.k);
      }

      if (this.m().f()) {
         this.au();
      }
   }

   @Override
   public void b_(coh $$0) {
      if (!this.dX().C) {
         cvx $$1 = this.m();
         cvt $$2 = $$1.h();
         int $$3 = $$1.L();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.cH())) && $$0.gk().f($$1)) {
            $$0.a(this, $$3);
            if ($$1.f()) {
               this.au();
               $$1.e($$3);
            }

            $$0.a(awu.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public xh al() {
      xh $$0 = this.an();
      return $$0 != null ? $$0 : this.m().z();
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Nullable
   @Override
   public btz b(esc $$0) {
      btz $$1 = super.b($$0);
      if (!this.dX().C && $$1 instanceof ckq $$2) {
         $$2.D();
      }

      return $$1;
   }

   public cvx m() {
      return this.av().a(d);
   }

   public void a(cvx $$0) {
      this.av().a(d, $$0);
   }

   @Override
   public void a(akk<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.m().a((btz)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void b(btz $$0) {
      this.l = $$0.cH();
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

   public ckq A() {
      return new ckq(this);
   }

   @Override
   public awl dn() {
      return awl.i;
   }

   @Override
   public float dO() {
      return 180.0F - e((float)this.o() + 0.5F, this.c) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public bvn a_(int $$0) {
      return $$0 == 0 ? bvn.a(this::m, this::a) : super.a_($$0);
   }
}
