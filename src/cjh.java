import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cjh extends bsr implements bun {
   private static final ajw<cuq> d = aka.a(cjh.class, ajy.h);
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
   private bsr m;
   @Nullable
   private UUID n;
   public final float c;

   public cjh(bsx<? extends cjh> $$0, dcw $$1) {
      super($$0, $$1);
      this.c = this.ah.i() * (float) Math.PI * 2.0F;
      this.t(this.ah.i() * 360.0F);
   }

   public cjh(dcw $$0, double $$1, double $$2, double $$3, cuq $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public cjh(dcw $$0, double $$1, double $$2, double $$3, cuq $$4, double $$5, double $$6, double $$7) {
      this(bsx.ag, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private cjh(cjh $$0) {
      super($$0.am(), $$0.dO());
      this.a($$0.p().s());
      this.v($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean bd() {
      return this.p().a(awn.ba);
   }

   @Nullable
   @Override
   public bsr s() {
      if (this.m != null && !this.m.dJ()) {
         return this.m;
      } else if (this.l != null && this.dO() instanceof aqu $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void w(bsr $$0) {
      super.w($$0);
      if ($$0 instanceof cjh $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.a;
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(d, cuq.l);
   }

   @Override
   protected double aZ() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.p().e()) {
         this.aq();
      } else {
         super.l();
         if (this.j > 0 && this.j != 32767) {
            this.j--;
         }

         this.L = this.dt();
         this.M = this.dv();
         this.N = this.dz();
         exc $$0 = this.dr();
         if (this.bf() && this.b(awk.a) > 0.1F) {
            this.D();
         } else if (this.bt() && this.b(awk.b) > 0.1F) {
            this.E();
         } else {
            this.bb();
         }

         if (this.dO().B) {
            this.ag = false;
         } else {
            this.ag = !this.dO().a(this, this.cK().h(1.0E-7));
            if (this.ag) {
               this.m(this.dt(), (this.cK().b + this.cK().e) / 2.0, this.dz());
            }
         }

         if (!this.aF() || this.dr().i() > 1.0E-5F || (this.ai + this.an()) % 4 == 0) {
            this.a(bts.a, this.dr());
            float $$1 = 0.98F;
            if (this.aF()) {
               $$1 = this.dO().a_(this.aL()).b().h() * 0.98F;
            }

            this.i(this.dr().d((double)$$1, 0.98, (double)$$1));
            if (this.aF()) {
               exc $$2 = this.dr();
               if ($$2.d < 0.0) {
                  this.i($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = ayo.a(this.L) != ayo.a(this.dt()) || ayo.a(this.M) != ayo.a(this.dv()) || ayo.a(this.N) != ayo.a(this.dz());
         int $$4 = $$3 ? 2 : 40;
         if (this.ai % $$4 == 0 && !this.dO().B && this.H()) {
            this.F();
         }

         if (this.i != -32768) {
            this.i++;
         }

         this.av = this.av | this.bm();
         if (!this.dO().B) {
            double $$5 = this.dr().d($$0).g();
            if ($$5 > 0.01) {
               this.av = true;
            }
         }

         if (!this.dO().B && this.i >= 6000) {
            this.aq();
         }
      }
   }

   @Override
   public jd aL() {
      return this.e(0.999999F);
   }

   private void D() {
      exc $$0 = this.dr();
      this.n($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void E() {
      exc $$0 = this.dr();
      this.n($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void F() {
      if (this.H()) {
         for (cjh $$1 : this.dO().a(cjh.class, this.cK().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.H())) {
            if ($$1.H()) {
               this.a($$1);
               if (this.dJ()) {
                  break;
               }
            }
         }
      }
   }

   private boolean H() {
      cuq $$0 = this.p();
      return this.bE() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.H() < $$0.j();
   }

   private void a(cjh $$0) {
      cuq $$1 = this.p();
      cuq $$2 = $$0.p();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.H() < $$1.H()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cuq $$0, cuq $$1) {
      return $$1.H() + $$0.H() > $$1.j() ? false : cuq.c($$0, $$1);
   }

   public static cuq a(cuq $$0, cuq $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.j(), $$2) - $$0.H(), $$1.H());
      cuq $$4 = $$0.c($$0.H() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cjh $$0, cuq $$1, cuq $$2) {
      cuq $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cjh $$0, cuq $$1, cjh $$2, cuq $$3) {
      a($$0, $$1, $$3);
      $$0.j = Math.max($$0.j, $$2.j);
      $$0.i = Math.min($$0.i, $$2.i);
      if ($$3.e()) {
         $$2.aq();
      }
   }

   @Override
   public boolean be() {
      return this.p().b(kq.w) || super.be();
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.p().e() && this.p().a(cut.us) && $$0.a(awg.l)) {
         return false;
      } else if (!this.p().a($$0)) {
         return false;
      } else if (this.dO().B) {
         return true;
      } else {
         this.bw();
         this.k = (int)((float)this.k - $$1);
         this.a(dxz.o, $$0.d());
         if (this.k <= 0) {
            this.p().a(this);
            this.aq();
         }

         return true;
      }
   }

   @Override
   public void b(ub $$0) {
      $$0.a("Health", (short)this.k);
      $$0.a("Age", (short)this.i);
      $$0.a("PickupDelay", (short)this.j);
      if (this.l != null) {
         $$0.a("Thrower", this.l);
      }

      if (this.n != null) {
         $$0.a("Owner", this.n);
      }

      if (!this.p().e()) {
         $$0.a("Item", this.p().a(this.dQ()));
      }
   }

   @Override
   public void a(ub $$0) {
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
         ub $$1 = $$0.p("Item");
         this.a(cuq.a(this.dQ(), (uy)$$1).orElse(cuq.l));
      } else {
         this.a(cuq.l);
      }

      if (this.p().e()) {
         this.aq();
      }
   }

   @Override
   public void b_(cmx $$0) {
      if (!this.dO().B) {
         cuq $$1 = this.p();
         cul $$2 = $$1.g();
         int $$3 = $$1.H();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.cz())) && $$0.fY().f($$1)) {
            $$0.a(this, $$3);
            if ($$1.e()) {
               this.aq();
               $$1.e($$3);
            }

            $$0.a(avz.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public wz ah() {
      wz $$0 = this.aj();
      return (wz)($$0 != null ? $$0 : wz.c(this.p().t()));
   }

   @Override
   public boolean cu() {
      return false;
   }

   @Nullable
   @Override
   public bsr a(eqc $$0) {
      bsr $$1 = super.a($$0);
      if (!this.dO().B && $$1 instanceof cjh $$2) {
         $$2.F();
      }

      return $$1;
   }

   public cuq p() {
      return this.ar().a(d);
   }

   public void a(cuq $$0) {
      this.ar().a(d, $$0);
   }

   @Override
   public void a(ajw<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.p().a((bsr)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void b(bsr $$0) {
      this.l = $$0.cz();
      this.m = $$0;
   }

   public int t() {
      return this.i;
   }

   @Override
   public void v() {
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
      return ((float)this.t() + $$0) / 20.0F + this.c;
   }

   public cjh C() {
      return new cjh(this);
   }

   @Override
   public avq de() {
      return avq.i;
   }

   @Override
   public float dF() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public bug a_(int $$0) {
      return $$0 == 0 ? bug.a(this::p, this::a) : super.a_($$0);
   }
}
