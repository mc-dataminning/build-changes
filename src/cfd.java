import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cfd extends bow implements bqm {
   private static final aim<cqk> d = aiq.a(cfd.class, aio.h);
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
   private bow m;
   @Nullable
   private UUID n;
   public final float c;

   public cfd(bpc<? extends cfd> $$0, cwz $$1) {
      super($$0, $$1);
      this.c = this.ag.i() * (float) Math.PI * 2.0F;
      this.r(this.ag.i() * 360.0F);
   }

   public cfd(cwz $$0, double $$1, double $$2, double $$3, cqk $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public cfd(cwz $$0, double $$1, double $$2, double $$3, cqk $$4, double $$5, double $$6, double $$7) {
      this(bpc.ag, $$0);
      this.a_($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private cfd(cfd $$0) {
      super($$0.ai(), $$0.dM());
      this.a($$0.p().q());
      this.v($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean ba() {
      return this.p().a(auv.aB);
   }

   @Nullable
   @Override
   public bow af_() {
      if (this.m != null && !this.m.dH()) {
         return this.m;
      } else if (this.l != null && this.dM() instanceof apf $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void w(bow $$0) {
      super.w($$0);
      if ($$0 instanceof cfd $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected bow.b aZ() {
      return bow.b.a;
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(d, cqk.h);
   }

   @Override
   protected double aW() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.p().b()) {
         this.am();
      } else {
         super.l();
         if (this.j > 0 && this.j != 32767) {
            this.j--;
         }

         this.K = this.dr();
         this.L = this.dt();
         this.M = this.dx();
         epr $$0 = this.dp();
         if (this.bc() && this.b(aus.a) > 0.1F) {
            this.D();
         } else if (this.bq() && this.b(aus.b) > 0.1F) {
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
            this.a(bpt.a, this.dp());
            float $$1 = 0.98F;
            if (this.aC()) {
               $$1 = this.dM().a_(this.aI()).b().h() * 0.98F;
            }

            this.g(this.dp().d((double)$$1, 0.98, (double)$$1));
            if (this.aC()) {
               epr $$2 = this.dp();
               if ($$2.d < 0.0) {
                  this.g($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = aww.a(this.K) != aww.a(this.dr()) || aww.a(this.L) != aww.a(this.dt()) || aww.a(this.M) != aww.a(this.dx());
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
      epr $$0 = this.dp();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void E() {
      epr $$0 = this.dp();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void G() {
      if (this.H()) {
         for (cfd $$1 : this.dM().a(cfd.class, this.cH().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.H())) {
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
      cqk $$0 = this.p();
      return this.bA() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.M() < $$0.g();
   }

   private void a(cfd $$0) {
      cqk $$1 = this.p();
      cqk $$2 = $$0.p();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.M() < $$1.M()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cqk $$0, cqk $$1) {
      return $$1.M() + $$0.M() > $$1.g() ? false : cqk.c($$0, $$1);
   }

   public static cqk a(cqk $$0, cqk $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.g(), $$2) - $$0.M(), $$1.M());
      cqk $$4 = $$0.c($$0.M() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cfd $$0, cqk $$1, cqk $$2) {
      cqk $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cfd $$0, cqk $$1, cfd $$2, cqk $$3) {
      a($$0, $$1, $$3);
      $$0.j = Math.max($$0.j, $$2.j);
      $$0.i = Math.min($$0.i, $$2.i);
      if ($$3.b()) {
         $$2.am();
      }
   }

   @Override
   public boolean bb() {
      return this.p().d().x() || super.bb();
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.p().b() && this.p().a(cqn.up) && $$0.a(aup.m)) {
         return false;
      } else if (!this.p().d().a($$0)) {
         return false;
      } else if (this.dM().B) {
         return true;
      } else {
         this.bt();
         this.k = (int)((float)this.k - $$1);
         this.a(drn.o, $$0.d());
         if (this.k <= 0) {
            this.p().a(this);
            this.am();
         }

         return true;
      }
   }

   @Override
   public void b(ta $$0) {
      $$0.a("Health", (short)this.k);
      $$0.a("Age", (short)this.i);
      $$0.a("PickupDelay", (short)this.j);
      if (this.l != null) {
         $$0.a("Thrower", this.l);
      }

      if (this.n != null) {
         $$0.a("Owner", this.n);
      }

      if (!this.p().b()) {
         $$0.a("Item", this.p().b(new ta()));
      }
   }

   @Override
   public void a(ta $$0) {
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

      ta $$1 = $$0.p("Item");
      this.a(cqk.a($$1));
      if (this.p().b()) {
         this.am();
      }
   }

   @Override
   public void b_(cis $$0) {
      if (!this.dM().B) {
         cqk $$1 = this.p();
         cqf $$2 = $$1.d();
         int $$3 = $$1.M();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.cw())) && $$0.fZ().e($$1)) {
            $$0.a(this, $$3);
            if ($$1.b()) {
               this.am();
               $$1.f($$3);
            }

            $$0.a(aui.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public vu ad() {
      vu $$0 = this.af();
      return (vu)($$0 != null ? $$0 : vu.c(this.p().r()));
   }

   @Override
   public boolean cq() {
      return false;
   }

   @Nullable
   @Override
   public bow b(apf $$0) {
      bow $$1 = super.b($$0);
      if (!this.dM().B && $$1 instanceof cfd) {
         ((cfd)$$1).G();
      }

      return $$1;
   }

   public cqk p() {
      return this.an().a(d);
   }

   public void a(cqk $$0) {
      this.an().a(d, $$0);
   }

   @Override
   public void a(aim<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.p().a((bow)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void b(bow $$0) {
      this.l = $$0.cw();
      this.m = $$0;
   }

   public int r() {
      return this.i;
   }

   public void s() {
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

   @Override
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

   public cfd C() {
      return new cfd(this);
   }

   @Override
   public atz db() {
      return atz.i;
   }

   @Override
   public float dD() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }
}
