import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cel extends bof implements bpv {
   private static final aii<cpq> d = ail.a(cel.class, aik.h);
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
   private bof m;
   @Nullable
   private UUID n;
   public final float c;

   public cel(bol<? extends cel> $$0, cwe $$1) {
      super($$0, $$1);
      this.c = this.af.i() * (float) Math.PI * 2.0F;
      this.r(this.af.i() * 360.0F);
   }

   public cel(cwe $$0, double $$1, double $$2, double $$3, cpq $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public cel(cwe $$0, double $$1, double $$2, double $$3, cpq $$4, double $$5, double $$6, double $$7) {
      this(bol.af, $$0);
      this.a_($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private cel(cel $$0) {
      super($$0.ai(), $$0.dJ());
      this.a($$0.q().q());
      this.u($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean aX() {
      return this.q().a(aum.aB);
   }

   @Nullable
   @Override
   public bof w() {
      if (this.m != null && !this.m.dE()) {
         return this.m;
      } else if (this.l != null && this.dJ() instanceof apa $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void v(bof $$0) {
      super.v($$0);
      if ($$0 instanceof cel $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected bof.b aW() {
      return bof.b.a;
   }

   @Override
   protected void c_() {
      this.an().a(d, cpq.h);
   }

   @Override
   public void l() {
      if (this.q().b()) {
         this.am();
      } else {
         super.l();
         if (this.j > 0 && this.j != 32767) {
            this.j--;
         }

         this.J = this.do();
         this.K = this.dq();
         this.L = this.du();
         eov $$0 = this.dm();
         if (this.aZ() && this.b(auj.a) > 0.1F) {
            this.E();
         } else if (this.bn() && this.b(auj.b) > 0.1F) {
            this.G();
         } else if (!this.aV()) {
            this.g(this.dm().b(0.0, -0.04, 0.0));
         }

         if (this.dJ().B) {
            this.ae = false;
         } else {
            this.ae = !this.dJ().a(this, this.cE().h(1.0E-7));
            if (this.ae) {
               this.m(this.do(), (this.cE().b + this.cE().e) / 2.0, this.du());
            }
         }

         if (!this.aC() || this.dm().i() > 1.0E-5F || (this.ag + this.aj()) % 4 == 0) {
            this.a(bpc.a, this.dm());
            float $$1 = 0.98F;
            if (this.aC()) {
               $$1 = this.dJ().a_(this.aI()).b().h() * 0.98F;
            }

            this.g(this.dm().d((double)$$1, 0.98, (double)$$1));
            if (this.aC()) {
               eov $$2 = this.dm();
               if ($$2.d < 0.0) {
                  this.g($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = awm.a(this.J) != awm.a(this.do()) || awm.a(this.K) != awm.a(this.dq()) || awm.a(this.L) != awm.a(this.du());
         int $$4 = $$3 ? 2 : 40;
         if (this.ag % $$4 == 0 && !this.dJ().B && this.I()) {
            this.H();
         }

         if (this.i != -32768) {
            this.i++;
         }

         this.at = this.at | this.bg();
         if (!this.dJ().B) {
            double $$5 = this.dm().d($$0).g();
            if ($$5 > 0.01) {
               this.at = true;
            }
         }

         if (!this.dJ().B && this.i >= 6000) {
            this.am();
         }
      }
   }

   @Override
   protected ib aI() {
      return this.d(0.999999F);
   }

   private void E() {
      eov $$0 = this.dm();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void G() {
      eov $$0 = this.dm();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void H() {
      if (this.I()) {
         for (cel $$1 : this.dJ().a(cel.class, this.cE().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.I())) {
            if ($$1.I()) {
               this.a($$1);
               if (this.dE()) {
                  break;
               }
            }
         }
      }
   }

   private boolean I() {
      cpq $$0 = this.q();
      return this.bx() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.M() < $$0.g();
   }

   private void a(cel $$0) {
      cpq $$1 = this.q();
      cpq $$2 = $$0.q();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.M() < $$1.M()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cpq $$0, cpq $$1) {
      return $$1.M() + $$0.M() > $$1.g() ? false : cpq.c($$0, $$1);
   }

   public static cpq a(cpq $$0, cpq $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.g(), $$2) - $$0.M(), $$1.M());
      cpq $$4 = $$0.c($$0.M() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cel $$0, cpq $$1, cpq $$2) {
      cpq $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cel $$0, cpq $$1, cel $$2, cpq $$3) {
      a($$0, $$1, $$3);
      $$0.j = Math.max($$0.j, $$2.j);
      $$0.i = Math.min($$0.i, $$2.i);
      if ($$3.b()) {
         $$2.am();
      }
   }

   @Override
   public boolean aY() {
      return this.q().d().x() || super.aY();
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.q().b() && this.q().a(cpt.uo) && $$0.a(aug.m)) {
         return false;
      } else if (!this.q().d().a($$0)) {
         return false;
      } else if (this.dJ().B) {
         return true;
      } else {
         this.bq();
         this.k = (int)((float)this.k - $$1);
         this.a(dqr.o, $$0.d());
         if (this.k <= 0) {
            this.q().a(this);
            this.am();
         }

         return true;
      }
   }

   @Override
   public void b(sy $$0) {
      $$0.a("Health", (short)this.k);
      $$0.a("Age", (short)this.i);
      $$0.a("PickupDelay", (short)this.j);
      if (this.l != null) {
         $$0.a("Thrower", this.l);
      }

      if (this.n != null) {
         $$0.a("Owner", this.n);
      }

      if (!this.q().b()) {
         $$0.a("Item", this.q().b(new sy()));
      }
   }

   @Override
   public void a(sy $$0) {
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

      sy $$1 = $$0.p("Item");
      this.a(cpq.a($$1));
      if (this.q().b()) {
         this.am();
      }
   }

   @Override
   public void b_(cia $$0) {
      if (!this.dJ().B) {
         cpq $$1 = this.q();
         cpl $$2 = $$1.d();
         int $$3 = $$1.M();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.ct())) && $$0.fV().e($$1)) {
            $$0.a(this, $$3);
            if ($$1.b()) {
               this.am();
               $$1.f($$3);
            }

            $$0.a(atz.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public vs ad() {
      vs $$0 = this.af();
      return (vs)($$0 != null ? $$0 : vs.c(this.q().r()));
   }

   @Override
   public boolean cn() {
      return false;
   }

   @Nullable
   @Override
   public bof b(apa $$0) {
      bof $$1 = super.b($$0);
      if (!this.dJ().B && $$1 instanceof cel) {
         ((cel)$$1).H();
      }

      return $$1;
   }

   public cpq q() {
      return this.an().b(d);
   }

   public void a(cpq $$0) {
      this.an().b(d, $$0);
   }

   @Override
   public void a(aii<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.q().a((bof)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void a(bof $$0) {
      this.l = $$0.ct();
      this.m = $$0;
   }

   public int s() {
      return this.i;
   }

   public void u() {
      this.j = 10;
   }

   public void x() {
      this.j = 0;
   }

   @Override
   public void y() {
      this.j = 32767;
   }

   public void b(int $$0) {
      this.j = $$0;
   }

   public boolean z() {
      return this.j > 0;
   }

   public void A() {
      this.i = -32768;
   }

   public void B() {
      this.i = -6000;
   }

   public void C() {
      this.y();
      this.i = 5999;
   }

   public float a(float $$0) {
      return ((float)this.s() + $$0) / 20.0F + this.c;
   }

   public cel D() {
      return new cel(this);
   }

   @Override
   public atq cY() {
      return atq.i;
   }

   @Override
   public float dA() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }
}
