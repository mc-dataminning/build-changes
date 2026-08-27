import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cdw extends bnq implements bpg {
   private static final aie<cpd> d = aih.a(cdw.class, aig.h);
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
   private bnq m;
   @Nullable
   private UUID n;
   public final float c;

   public cdw(bnw<? extends cdw> $$0, cvr $$1) {
      super($$0, $$1);
      this.c = this.af.i() * (float) Math.PI * 2.0F;
      this.r(this.af.i() * 360.0F);
   }

   public cdw(cvr $$0, double $$1, double $$2, double $$3, cpd $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public cdw(cvr $$0, double $$1, double $$2, double $$3, cpd $$4, double $$5, double $$6, double $$7) {
      this(bnw.af, $$0);
      this.a_($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private cdw(cdw $$0) {
      super($$0.ai(), $$0.dM());
      this.a($$0.q().q());
      this.u($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean aX() {
      return this.q().a(aui.aB);
   }

   @Nullable
   @Override
   public bnq w() {
      if (this.m != null && !this.m.dH()) {
         return this.m;
      } else if (this.l != null && this.dM() instanceof aow $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void v(bnq $$0) {
      super.v($$0);
      if ($$0 instanceof cdw $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected bnq.b aW() {
      return bnq.b.a;
   }

   @Override
   protected void c_() {
      this.an().a(d, cpd.h);
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

         this.J = this.dr();
         this.K = this.dt();
         this.L = this.dx();
         enz $$0 = this.dp();
         if (this.aZ() && this.b(auf.a) > 0.1F) {
            this.E();
         } else if (this.bn() && this.b(auf.b) > 0.1F) {
            this.G();
         } else if (!this.aV()) {
            this.g(this.dp().b(0.0, -0.04, 0.0));
         }

         if (this.dM().B) {
            this.ae = false;
         } else {
            this.ae = !this.dM().a(this, this.cH().h(1.0E-7));
            if (this.ae) {
               this.m(this.dr(), (this.cH().b + this.cH().e) / 2.0, this.dx());
            }
         }

         if (!this.aC() || this.dp().i() > 1.0E-5F || (this.ag + this.aj()) % 4 == 0) {
            this.a(bon.a, this.dp());
            float $$1 = 0.98F;
            if (this.aC()) {
               $$1 = this.dM().a_(this.aI()).b().i() * 0.98F;
            }

            this.g(this.dp().d((double)$$1, 0.98, (double)$$1));
            if (this.aC()) {
               enz $$2 = this.dp();
               if ($$2.d < 0.0) {
                  this.g($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = awi.a(this.J) != awi.a(this.dr()) || awi.a(this.K) != awi.a(this.dt()) || awi.a(this.L) != awi.a(this.dx());
         int $$4 = $$3 ? 2 : 40;
         if (this.ag % $$4 == 0 && !this.dM().B && this.I()) {
            this.H();
         }

         if (this.i != -32768) {
            this.i++;
         }

         this.at = this.at | this.bg();
         if (!this.dM().B) {
            double $$5 = this.dp().d($$0).g();
            if ($$5 > 0.01) {
               this.at = true;
            }
         }

         if (!this.dM().B && this.i >= 6000) {
            this.am();
         }
      }
   }

   @Override
   protected hz aI() {
      return this.d(0.999999F);
   }

   private void E() {
      enz $$0 = this.dp();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void G() {
      enz $$0 = this.dp();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void H() {
      if (this.I()) {
         for (cdw $$1 : this.dM().a(cdw.class, this.cH().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.I())) {
            if ($$1.I()) {
               this.a($$1);
               if (this.dH()) {
                  break;
               }
            }
         }
      }
   }

   private boolean I() {
      cpd $$0 = this.q();
      return this.bx() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.M() < $$0.g();
   }

   private void a(cdw $$0) {
      cpd $$1 = this.q();
      cpd $$2 = $$0.q();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.M() < $$1.M()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cpd $$0, cpd $$1) {
      if (!$$1.a($$0.d())) {
         return false;
      } else if ($$1.M() + $$0.M() > $$1.g()) {
         return false;
      } else {
         return $$1.v() ^ $$0.v() ? false : !$$1.v() || $$1.w().equals($$0.w());
      }
   }

   public static cpd a(cpd $$0, cpd $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.g(), $$2) - $$0.M(), $$1.M());
      cpd $$4 = $$0.c($$0.M() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cdw $$0, cpd $$1, cpd $$2) {
      cpd $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cdw $$0, cpd $$1, cdw $$2, cpd $$3) {
      a($$0, $$1, $$3);
      $$0.j = Math.max($$0.j, $$2.j);
      $$0.i = Math.min($$0.i, $$2.i);
      if ($$3.b()) {
         $$2.am();
      }
   }

   @Override
   public boolean aY() {
      return this.q().d().v() || super.aY();
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.q().b() && this.q().a(cpg.uo) && $$0.a(auc.m)) {
         return false;
      } else if (!this.q().d().a($$0)) {
         return false;
      } else if (this.dM().B) {
         return true;
      } else {
         this.bq();
         this.k = (int)((float)this.k - $$1);
         this.a(dpw.o, $$0.d());
         if (this.k <= 0) {
            this.q().a(this);
            this.am();
         }

         return true;
      }
   }

   @Override
   public void b(sw $$0) {
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
         $$0.a("Item", this.q().b(new sw()));
      }
   }

   @Override
   public void a(sw $$0) {
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

      sw $$1 = $$0.p("Item");
      this.a(cpd.a($$1));
      if (this.q().b()) {
         this.am();
      }
   }

   @Override
   public void b_(chl $$0) {
      if (!this.dM().B) {
         cpd $$1 = this.q();
         coy $$2 = $$1.d();
         int $$3 = $$1.M();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.cw())) && $$0.fT().e($$1)) {
            $$0.a(this, $$3);
            if ($$1.b()) {
               this.am();
               $$1.f($$3);
            }

            $$0.a(atv.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public vq ad() {
      vq $$0 = this.af();
      return (vq)($$0 != null ? $$0 : vq.c(this.q().r()));
   }

   @Override
   public boolean cq() {
      return false;
   }

   @Nullable
   @Override
   public bnq b(aow $$0) {
      bnq $$1 = super.b($$0);
      if (!this.dM().B && $$1 instanceof cdw) {
         ((cdw)$$1).H();
      }

      return $$1;
   }

   public cpd q() {
      return this.an().b(d);
   }

   public void a(cpd $$0) {
      this.an().b(d, $$0);
   }

   @Override
   public void a(aie<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.q().a((bnq)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void a(bnq $$0) {
      this.l = $$0.cw();
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

   public cdw D() {
      return new cdw(this);
   }

   @Override
   public atm db() {
      return atm.i;
   }

   @Override
   public float dD() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }
}
