import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cgv extends bql implements bsc {
   private static final ajk<csd> d = ajo.a(cgv.class, ajm.h);
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
   private bql m;
   @Nullable
   private UUID n;
   public final float c;

   public cgv(bqr<? extends cgv> $$0, czu $$1) {
      super($$0, $$1);
      this.c = this.ah.i() * (float) Math.PI * 2.0F;
      this.r(this.ah.i() * 360.0F);
   }

   public cgv(czu $$0, double $$1, double $$2, double $$3, csd $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public cgv(czu $$0, double $$1, double $$2, double $$3, csd $$4, double $$5, double $$6, double $$7) {
      this(bqr.ag, $$0);
      this.a_($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private cgv(cgv $$0) {
      super($$0.ai(), $$0.dN());
      this.a($$0.p().r());
      this.v($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean ba() {
      return this.p().a(avw.aB);
   }

   @Nullable
   @Override
   public bql u() {
      if (this.m != null && !this.m.dI()) {
         return this.m;
      } else if (this.l != null && this.dN() instanceof aqe $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void w(bql $$0) {
      super.w($$0);
      if ($$0 instanceof cgv $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected bql.b aZ() {
      return bql.b.a;
   }

   @Override
   protected void a(ajo.a $$0) {
      $$0.a(d, csd.i);
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

         this.L = this.ds();
         this.M = this.du();
         this.N = this.dy();
         etf $$0 = this.dq();
         if (this.bc() && this.b(avt.a) > 0.1F) {
            this.D();
         } else if (this.bq() && this.b(avt.b) > 0.1F) {
            this.E();
         } else {
            this.aY();
         }

         if (this.dN().B) {
            this.ag = false;
         } else {
            this.ag = !this.dN().a(this, this.cI().h(1.0E-7));
            if (this.ag) {
               this.m(this.ds(), (this.cI().b + this.cI().e) / 2.0, this.dy());
            }
         }

         if (!this.aC() || this.dq().i() > 1.0E-5F || (this.ai + this.aj()) % 4 == 0) {
            this.a(brj.a, this.dq());
            float $$1 = 0.98F;
            if (this.aC()) {
               $$1 = this.dN().a_(this.aI()).b().h() * 0.98F;
            }

            this.g(this.dq().d((double)$$1, 0.98, (double)$$1));
            if (this.aC()) {
               etf $$2 = this.dq();
               if ($$2.d < 0.0) {
                  this.g($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = axw.a(this.L) != axw.a(this.ds()) || axw.a(this.M) != axw.a(this.du()) || axw.a(this.N) != axw.a(this.dy());
         int $$4 = $$3 ? 2 : 40;
         if (this.ai % $$4 == 0 && !this.dN().B && this.H()) {
            this.G();
         }

         if (this.i != -32768) {
            this.i++;
         }

         this.av = this.av | this.bj();
         if (!this.dN().B) {
            double $$5 = this.dq().d($$0).g();
            if ($$5 > 0.01) {
               this.av = true;
            }
         }

         if (!this.dN().B && this.i >= 6000) {
            this.am();
         }
      }
   }

   @Override
   protected im aI() {
      return this.d(0.999999F);
   }

   private void D() {
      etf $$0 = this.dq();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void E() {
      etf $$0 = this.dq();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void G() {
      if (this.H()) {
         for (cgv $$1 : this.dN().a(cgv.class, this.cI().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.H())) {
            if ($$1.H()) {
               this.a($$1);
               if (this.dI()) {
                  break;
               }
            }
         }
      }
   }

   private boolean H() {
      csd $$0 = this.p();
      return this.bB() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.G() < $$0.i();
   }

   private void a(cgv $$0) {
      csd $$1 = this.p();
      csd $$2 = $$0.p();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.G() < $$1.G()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(csd $$0, csd $$1) {
      return $$1.G() + $$0.G() > $$1.i() ? false : csd.c($$0, $$1);
   }

   public static csd a(csd $$0, csd $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.i(), $$2) - $$0.G(), $$1.G());
      csd $$4 = $$0.c($$0.G() + $$3);
      $$1.g($$3);
      return $$4;
   }

   private static void a(cgv $$0, csd $$1, csd $$2) {
      csd $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cgv $$0, csd $$1, cgv $$2, csd $$3) {
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
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.p().d() && this.p().a(csg.us) && $$0.a(avq.m)) {
         return false;
      } else if (!this.p().f().a($$0)) {
         return false;
      } else if (this.dN().B) {
         return true;
      } else {
         this.bt();
         this.k = (int)((float)this.k - $$1);
         this.a(dur.o, $$0.d());
         if (this.k <= 0) {
            this.p().a(this);
            this.am();
         }

         return true;
      }
   }

   @Override
   public void b(ty $$0) {
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
         $$0.a("Item", this.p().a(this.dP()));
      }
   }

   @Override
   public void a(ty $$0) {
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
         ty $$1 = $$0.p("Item");
         this.a(csd.a(this.dP(), (uv)$$1).orElse(csd.i));
      } else {
         this.a(csd.i);
      }

      if (this.p().d()) {
         this.am();
      }
   }

   @Override
   public void b_(ckl $$0) {
      if (!this.dN().B) {
         csd $$1 = this.p();
         cry $$2 = $$1.f();
         int $$3 = $$1.G();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.cx())) && $$0.ga().e($$1)) {
            $$0.a(this, $$3);
            if ($$1.d()) {
               this.am();
               $$1.e($$3);
            }

            $$0.a(avj.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public ws ad() {
      ws $$0 = this.af();
      return (ws)($$0 != null ? $$0 : ws.c(this.p().s()));
   }

   @Override
   public boolean cr() {
      return false;
   }

   @Nullable
   @Override
   public bql b(aqe $$0) {
      bql $$1 = super.b($$0);
      if (!this.dN().B && $$1 instanceof cgv) {
         ((cgv)$$1).G();
      }

      return $$1;
   }

   public csd p() {
      return this.an().a(d);
   }

   public void a(csd $$0) {
      this.an().a(d, $$0);
   }

   @Override
   public void a(ajk<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.p().a((bql)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void b(bql $$0) {
      this.l = $$0.cx();
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

   public cgv C() {
      return new cgv(this);
   }

   @Override
   public ava dc() {
      return ava.i;
   }

   @Override
   public float dE() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public brv a_(int $$0) {
      return $$0 == 0 ? new brv() {
         @Override
         public csd a() {
            return cgv.this.p();
         }

         @Override
         public boolean a(csd $$0) {
            cgv.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }
}
