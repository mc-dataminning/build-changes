import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cgd extends bpv implements brm {
   private static final aiy<crj> d = ajc.a(cgd.class, aja.h);
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
   private bpv m;
   @Nullable
   private UUID n;
   public final float c;

   public cgd(bqb<? extends cgd> $$0, cyx $$1) {
      super($$0, $$1);
      this.c = this.ag.i() * (float) Math.PI * 2.0F;
      this.r(this.ag.i() * 360.0F);
   }

   public cgd(cyx $$0, double $$1, double $$2, double $$3, crj $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public cgd(cyx $$0, double $$1, double $$2, double $$3, crj $$4, double $$5, double $$6, double $$7) {
      this(bqb.ag, $$0);
      this.a_($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private cgd(cgd $$0) {
      super($$0.ai(), $$0.dM());
      this.a($$0.p().r());
      this.v($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean ba() {
      return this.p().a(avk.aB);
   }

   @Nullable
   @Override
   public bpv u() {
      if (this.m != null && !this.m.dH()) {
         return this.m;
      } else if (this.l != null && this.dM() instanceof aps $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void w(bpv $$0) {
      super.w($$0);
      if ($$0 instanceof cgd $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected bpv.b aZ() {
      return bpv.b.a;
   }

   @Override
   protected void a(ajc.a $$0) {
      $$0.a(d, crj.i);
   }

   @Override
   protected double aW() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.p().d()) {
         this.am();
      } else {
         super.l();
         if (this.j > 0 && this.j != 32767) {
            this.j--;
         }

         this.K = this.dr();
         this.L = this.dt();
         this.M = this.dx();
         esa $$0 = this.dp();
         if (this.bc() && this.b(avh.a) > 0.1F) {
            this.D();
         } else if (this.bq() && this.b(avh.b) > 0.1F) {
            this.E();
         } else {
            this.aY();
         }

         if (this.dM().B) {
            this.af = false;
         } else {
            this.af = !this.dM().a(this, this.cH().h(1.0E-7));
            if (this.af) {
               this.m(this.dr(), (this.cH().b + this.cH().e) / 2.0, this.dx());
            }
         }

         if (!this.aC() || this.dp().i() > 1.0E-5F || (this.ah + this.aj()) % 4 == 0) {
            this.a(bqt.a, this.dp());
            float $$1 = 0.98F;
            if (this.aC()) {
               $$1 = this.dM().a_(this.aI()).b().h() * 0.98F;
            }

            this.g(this.dp().d((double)$$1, 0.98, (double)$$1));
            if (this.aC()) {
               esa $$2 = this.dp();
               if ($$2.d < 0.0) {
                  this.g($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = axk.a(this.K) != axk.a(this.dr()) || axk.a(this.L) != axk.a(this.dt()) || axk.a(this.M) != axk.a(this.dx());
         int $$4 = $$3 ? 2 : 40;
         if (this.ah % $$4 == 0 && !this.dM().B && this.H()) {
            this.G();
         }

         if (this.i != -32768) {
            this.i++;
         }

         this.au = this.au | this.bj();
         if (!this.dM().B) {
            double $$5 = this.dp().d($$0).g();
            if ($$5 > 0.01) {
               this.au = true;
            }
         }

         if (!this.dM().B && this.i >= 6000) {
            this.am();
         }
      }
   }

   @Override
   protected ib aI() {
      return this.d(0.999999F);
   }

   private void D() {
      esa $$0 = this.dp();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void E() {
      esa $$0 = this.dp();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void G() {
      if (this.H()) {
         for (cgd $$1 : this.dM().a(cgd.class, this.cH().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.H())) {
            if ($$1.H()) {
               this.a($$1);
               if (this.dH()) {
                  break;
               }
            }
         }
      }
   }

   private boolean H() {
      crj $$0 = this.p();
      return this.bA() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.G() < $$0.i();
   }

   private void a(cgd $$0) {
      crj $$1 = this.p();
      crj $$2 = $$0.p();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.G() < $$1.G()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(crj $$0, crj $$1) {
      return $$1.G() + $$0.G() > $$1.i() ? false : crj.c($$0, $$1);
   }

   public static crj a(crj $$0, crj $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.i(), $$2) - $$0.G(), $$1.G());
      crj $$4 = $$0.c($$0.G() + $$3);
      $$1.g($$3);
      return $$4;
   }

   private static void a(cgd $$0, crj $$1, crj $$2) {
      crj $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cgd $$0, crj $$1, cgd $$2, crj $$3) {
      a($$0, $$1, $$3);
      $$0.j = Math.max($$0.j, $$2.j);
      $$0.i = Math.min($$0.i, $$2.i);
      if ($$3.d()) {
         $$2.am();
      }
   }

   @Override
   public boolean bb() {
      return this.p().f().A() || super.bb();
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.p().d() && this.p().a(crm.uq) && $$0.a(ave.m)) {
         return false;
      } else if (!this.p().f().a($$0)) {
         return false;
      } else if (this.dM().B) {
         return true;
      } else {
         this.bt();
         this.k = (int)((float)this.k - $$1);
         this.a(dts.o, $$0.d());
         if (this.k <= 0) {
            this.p().a(this);
            this.am();
         }

         return true;
      }
   }

   @Override
   public void b(tm $$0) {
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
         $$0.a("Item", this.p().a(this.dO()));
      }
   }

   @Override
   public void a(tm $$0) {
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
         tm $$1 = $$0.p("Item");
         this.a(crj.a(this.dO(), (uj)$$1).orElse(crj.i));
      } else {
         this.a(crj.i);
      }

      if (this.p().d()) {
         this.am();
      }
   }

   @Override
   public void b_(cjt $$0) {
      if (!this.dM().B) {
         crj $$1 = this.p();
         cre $$2 = $$1.f();
         int $$3 = $$1.G();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.cw())) && $$0.fZ().e($$1)) {
            $$0.a(this, $$3);
            if ($$1.d()) {
               this.am();
               $$1.e($$3);
            }

            $$0.a(auw.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public wg ad() {
      wg $$0 = this.af();
      return (wg)($$0 != null ? $$0 : wg.c(this.p().s()));
   }

   @Override
   public boolean cq() {
      return false;
   }

   @Nullable
   @Override
   public bpv b(aps $$0) {
      bpv $$1 = super.b($$0);
      if (!this.dM().B && $$1 instanceof cgd) {
         ((cgd)$$1).G();
      }

      return $$1;
   }

   public crj p() {
      return this.an().a(d);
   }

   public void a(crj $$0) {
      this.an().a(d, $$0);
   }

   @Override
   public void a(aiy<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.p().a((bpv)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void b(bpv $$0) {
      this.l = $$0.cw();
      this.m = $$0;
   }

   public int r() {
      return this.i;
   }

   public void v() {
      this.j = 10;
   }

   public void w() {
      this.j = 0;
   }

   @Override
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

   public cgd C() {
      return new cgd(this);
   }

   @Override
   public aun db() {
      return aun.i;
   }

   @Override
   public float dD() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }
}
