import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class civ extends bsh implements bub {
   private static final ajp<cud> d = ajt.a(civ.class, ajr.h);
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
   private bsh m;
   @Nullable
   private UUID n;
   public final float c;

   public civ(bsn<? extends civ> $$0, dcg $$1) {
      super($$0, $$1);
      this.c = this.ah.i() * (float) Math.PI * 2.0F;
      this.s(this.ah.i() * 360.0F);
   }

   public civ(dcg $$0, double $$1, double $$2, double $$3, cud $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public civ(dcg $$0, double $$1, double $$2, double $$3, cud $$4, double $$5, double $$6, double $$7) {
      this(bsn.ag, $$0);
      this.a_($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private civ(civ $$0) {
      super($$0.am(), $$0.dR());
      this.a($$0.p().s());
      this.v($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean be() {
      return this.p().a(awf.bb);
   }

   @Nullable
   @Override
   public bsh s() {
      if (this.m != null && !this.m.dM()) {
         return this.m;
      } else if (this.l != null && this.dR() instanceof aqm $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void w(bsh $$0) {
      super.w($$0);
      if ($$0 instanceof civ $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.a;
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(d, cud.l);
   }

   @Override
   protected double ba() {
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

         this.L = this.dw();
         this.M = this.dy();
         this.N = this.dC();
         ewh $$0 = this.du();
         if (this.bg() && this.b(awc.a) > 0.1F) {
            this.D();
         } else if (this.bu() && this.b(awc.b) > 0.1F) {
            this.E();
         } else {
            this.bc();
         }

         if (this.dR().B) {
            this.ag = false;
         } else {
            this.ag = !this.dR().a(this, this.cM().h(1.0E-7));
            if (this.ag) {
               this.m(this.dw(), (this.cM().b + this.cM().e) / 2.0, this.dC());
            }
         }

         if (!this.aG() || this.du().i() > 1.0E-5F || (this.ai + this.an()) % 4 == 0) {
            this.a(bth.a, this.du());
            float $$1 = 0.98F;
            if (this.aG()) {
               $$1 = this.dR().a_(this.aM()).b().h() * 0.98F;
            }

            this.j(this.du().d((double)$$1, 0.98, (double)$$1));
            if (this.aG()) {
               ewh $$2 = this.du();
               if ($$2.d < 0.0) {
                  this.j($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = ayg.a(this.L) != ayg.a(this.dw()) || ayg.a(this.M) != ayg.a(this.dy()) || ayg.a(this.N) != ayg.a(this.dC());
         int $$4 = $$3 ? 2 : 40;
         if (this.ai % $$4 == 0 && !this.dR().B && this.H()) {
            this.F();
         }

         if (this.i != -32768) {
            this.i++;
         }

         this.av = this.av | this.bn();
         if (!this.dR().B) {
            double $$5 = this.du().d($$0).g();
            if ($$5 > 0.01) {
               this.av = true;
            }
         }

         if (!this.dR().B && this.i >= 6000) {
            this.aq();
         }
      }
   }

   @Override
   public ja aM() {
      return this.e(0.999999F);
   }

   private void D() {
      ewh $$0 = this.du();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void E() {
      ewh $$0 = this.du();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void F() {
      if (this.H()) {
         for (civ $$1 : this.dR().a(civ.class, this.cM().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.H())) {
            if ($$1.H()) {
               this.a($$1);
               if (this.dM()) {
                  break;
               }
            }
         }
      }
   }

   private boolean H() {
      cud $$0 = this.p();
      return this.bF() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.H() < $$0.j();
   }

   private void a(civ $$0) {
      cud $$1 = this.p();
      cud $$2 = $$0.p();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.H() < $$1.H()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cud $$0, cud $$1) {
      return $$1.H() + $$0.H() > $$1.j() ? false : cud.c($$0, $$1);
   }

   public static cud a(cud $$0, cud $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.j(), $$2) - $$0.H(), $$1.H());
      cud $$4 = $$0.c($$0.H() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(civ $$0, cud $$1, cud $$2) {
      cud $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(civ $$0, cud $$1, civ $$2, cud $$3) {
      a($$0, $$1, $$3);
      $$0.j = Math.max($$0.j, $$2.j);
      $$0.i = Math.min($$0.i, $$2.i);
      if ($$3.e()) {
         $$2.aq();
      }
   }

   @Override
   public boolean bf() {
      return this.p().b(kn.w) || super.bf();
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.p().e() && this.p().a(cug.us) && $$0.a(avy.m)) {
         return false;
      } else if (!this.p().a($$0)) {
         return false;
      } else if (this.dR().B) {
         return true;
      } else {
         this.bx();
         this.k = (int)((float)this.k - $$1);
         this.a(dxh.o, $$0.d());
         if (this.k <= 0) {
            this.p().a(this);
            this.aq();
         }

         return true;
      }
   }

   @Override
   public void b(tx $$0) {
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
         $$0.a("Item", this.p().a(this.dT()));
      }
   }

   @Override
   public void a(tx $$0) {
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
         tx $$1 = $$0.p("Item");
         this.a(cud.a(this.dT(), (uu)$$1).orElse(cud.l));
      } else {
         this.a(cud.l);
      }

      if (this.p().e()) {
         this.aq();
      }
   }

   @Override
   public void b_(cml $$0) {
      if (!this.dR().B) {
         cud $$1 = this.p();
         cty $$2 = $$1.g();
         int $$3 = $$1.H();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.cB())) && $$0.ga().f($$1)) {
            $$0.a(this, $$3);
            if ($$1.e()) {
               this.aq();
               $$1.e($$3);
            }

            $$0.a(avr.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public wu ah() {
      wu $$0 = this.aj();
      return (wu)($$0 != null ? $$0 : wu.c(this.p().t()));
   }

   @Override
   public boolean cv() {
      return false;
   }

   @Nullable
   @Override
   public bsh a(bsh.a $$0) {
      bsh $$1 = super.a($$0);
      if (!this.dR().B && $$1 instanceof civ) {
         ((civ)$$1).F();
      }

      return $$1;
   }

   public cud p() {
      return this.ar().a(d);
   }

   public void a(cud $$0) {
      this.ar().a(d, $$0);
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.p().a((bsh)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void b(bsh $$0) {
      this.l = $$0.cB();
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

   @Override
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
      return ((float)this.t() + $$0) / 20.0F + this.c;
   }

   public civ C() {
      return new civ(this);
   }

   @Override
   public avi dg() {
      return avi.i;
   }

   @Override
   public float dI() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public btu a_(int $$0) {
      return $$0 == 0 ? btu.a(this::p, this::a) : super.a_($$0);
   }
}
