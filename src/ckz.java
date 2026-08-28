import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class ckz extends bui implements bwd {
   private static final ako<cwf> d = aks.a(ckz.class, akq.h);
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
   private bui m;
   @Nullable
   private UUID n;
   public final float c;

   public ckz(bup<? extends ckz> $$0, dff $$1) {
      super($$0, $$1);
      this.c = this.af.i() * (float) Math.PI * 2.0F;
      this.v(this.af.i() * 360.0F);
   }

   public ckz(dff $$0, double $$1, double $$2, double $$3, cwf $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.A.j() * 0.2 - 0.1, 0.2, $$0.A.j() * 0.2 - 0.1);
   }

   public ckz(dff $$0, double $$1, double $$2, double $$3, cwf $$4, double $$5, double $$6, double $$7) {
      this(bup.ag, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private ckz(ckz $$0) {
      super($$0.ar(), $$0.dY());
      this.a($$0.m().v());
      this.w($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean bj() {
      return this.m().a(axm.bs);
   }

   @Nullable
   @Override
   public bui s() {
      if (this.m != null && !this.m.dT()) {
         return this.m;
      } else if (this.l != null && this.dY() instanceof arq $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void x(bui $$0) {
      super.x($$0);
      if ($$0 instanceof ckz $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected bui.b bi() {
      return bui.b.a;
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(d, cwf.k);
   }

   @Override
   protected double bf() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.m().f()) {
         this.av();
      } else {
         super.l();
         if (this.j > 0 && this.j != 32767) {
            this.j--;
         }

         this.L = this.dD();
         this.M = this.dF();
         this.N = this.dJ();
         ezr $$0 = this.dB();
         if (this.bl() && this.b(axj.a) > 0.1F) {
            this.B();
         } else if (this.bz() && this.b(axj.b) > 0.1F) {
            this.C();
         } else {
            this.bh();
         }

         if (this.dY().C) {
            this.ae = false;
         } else {
            this.ae = !this.dY().a(this, this.cT().h(1.0E-7));
            if (this.ae) {
               this.m(this.dD(), (this.cT().b + this.cT().e) / 2.0, this.dJ());
            }
         }

         if (!this.aL() || this.dB().j() > 1.0E-5F || (this.ag + this.as()) % 4 == 0) {
            this.a(bvi.a, this.dB());
            this.aM();
            float $$1 = 0.98F;
            if (this.aL()) {
               $$1 = this.dY().a_(this.aS()).b().g() * 0.98F;
            }

            this.h(this.dB().d((double)$$1, 0.98, (double)$$1));
            if (this.aL()) {
               ezr $$2 = this.dB();
               if ($$2.e < 0.0) {
                  this.h($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = azn.a(this.L) != azn.a(this.dD()) || azn.a(this.M) != azn.a(this.dF()) || azn.a(this.N) != azn.a(this.dJ());
         int $$4 = $$3 ? 2 : 40;
         if (this.ag % $$4 == 0 && !this.dY().C && this.E()) {
            this.D();
         }

         if (this.i != -32768) {
            this.i++;
         }

         this.as = this.as | this.bs();
         if (!this.dY().C) {
            double $$5 = this.dB().d($$0).h();
            if ($$5 > 0.01) {
               this.as = true;
            }
         }

         if (!this.dY().C && this.i >= 6000) {
            this.av();
         }
      }
   }

   @Override
   public jh aS() {
      return this.e(0.999999F);
   }

   private void B() {
      ezr $$0 = this.dB();
      this.n($$0.d * 0.99F, $$0.e + (double)($$0.e < 0.06F ? 5.0E-4F : 0.0F), $$0.f * 0.99F);
   }

   private void C() {
      ezr $$0 = this.dB();
      this.n($$0.d * 0.95F, $$0.e + (double)($$0.e < 0.06F ? 5.0E-4F : 0.0F), $$0.f * 0.95F);
   }

   private void D() {
      if (this.E()) {
         for (ckz $$1 : this.dY().a(ckz.class, this.cT().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.E())) {
            if ($$1.E()) {
               this.a($$1);
               if (this.dT()) {
                  break;
               }
            }
         }
      }
   }

   private boolean E() {
      cwf $$0 = this.m();
      return this.bN() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.L() < $$0.k();
   }

   private void a(ckz $$0) {
      cwf $$1 = this.m();
      cwf $$2 = $$0.m();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.L() < $$1.L()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cwf $$0, cwf $$1) {
      return $$1.L() + $$0.L() > $$1.k() ? false : cwf.c($$0, $$1);
   }

   public static cwf a(cwf $$0, cwf $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.L(), $$1.L());
      cwf $$4 = $$0.c($$0.L() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(ckz $$0, cwf $$1, cwf $$2) {
      cwf $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(ckz $$0, cwf $$1, ckz $$2, cwf $$3) {
      a($$0, $$1, $$3);
      $$0.j = Math.max($$0.j, $$2.j);
      $$0.i = Math.min($$0.i, $$2.i);
      if ($$3.f()) {
         $$2.av();
      }
   }

   @Override
   public boolean bk() {
      return !this.m().a(this.dZ().a()) || super.bk();
   }

   @Override
   protected boolean aH() {
      return this.k <= 0 ? true : this.ag % 10 == 0;
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.dY().ac().b(dfb.c) && $$0.d() instanceof bvg) {
         return false;
      } else if (!this.m().a($$0)) {
         return false;
      } else if (this.dY().C) {
         return true;
      } else {
         this.bF();
         this.k = (int)((float)this.k - $$1);
         this.a(eak.o, $$0.d());
         if (this.k <= 0) {
            this.m().a(this);
            this.av();
         }

         return true;
      }
   }

   @Override
   public boolean a(dex $$0) {
      return $$0.g() ? super.a($$0) : true;
   }

   @Override
   public void b(un $$0) {
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
         $$0.a("Item", this.m().a(this.ea()));
      }
   }

   @Override
   public void a(un $$0) {
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
         un $$1 = $$0.p("Item");
         this.a(cwf.a(this.ea(), (vk)$$1).orElse(cwf.k));
      } else {
         this.a(cwf.k);
      }

      if (this.m().f()) {
         this.av();
      }
   }

   @Override
   public void b_(cor $$0) {
      if (!this.dY().C) {
         cwf $$1 = this.m();
         cwb $$2 = $$1.h();
         int $$3 = $$1.L();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.cI())) && $$0.gl().f($$1)) {
            $$0.a(this, $$3);
            if ($$1.f()) {
               this.av();
               $$1.e($$3);
            }

            $$0.a(awy.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public xl am() {
      xl $$0 = this.ao();
      return $$0 != null ? $$0 : this.m().z();
   }

   @Override
   public boolean cD() {
      return false;
   }

   @Nullable
   @Override
   public bui b(esm $$0) {
      bui $$1 = super.b($$0);
      if (!this.dY().C && $$1 instanceof ckz $$2) {
         $$2.D();
      }

      return $$1;
   }

   public cwf m() {
      return this.aw().a(d);
   }

   public void a(cwf $$0) {
      this.aw().a(d, $$0);
   }

   @Override
   public void a(ako<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.m().a((bui)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void b(bui $$0) {
      this.l = $$0.cI();
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

   public ckz A() {
      return new ckz(this);
   }

   @Override
   public awp do() {
      return awp.i;
   }

   @Override
   public float dP() {
      return 180.0F - e((float)this.o() + 0.5F, this.c) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public bvw a_(int $$0) {
      return $$0 == 0 ? bvw.a(this::m, this::a) : super.a_($$0);
   }
}
