import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cir extends bsd implements btx {
   private static final ajp<cua> d = ajt.a(cir.class, ajr.h);
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
   private bsd m;
   @Nullable
   private UUID n;
   public final float c;

   public cir(bsj<? extends cir> $$0, dcd $$1) {
      super($$0, $$1);
      this.c = this.ah.i() * (float) Math.PI * 2.0F;
      this.s(this.ah.i() * 360.0F);
   }

   public cir(dcd $$0, double $$1, double $$2, double $$3, cua $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public cir(dcd $$0, double $$1, double $$2, double $$3, cua $$4, double $$5, double $$6, double $$7) {
      this(bsj.ag, $$0);
      this.a_($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private cir(cir $$0) {
      super($$0.ak(), $$0.dP());
      this.a($$0.p().s());
      this.v($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean bc() {
      return this.p().a(awd.bb);
   }

   @Nullable
   @Override
   public bsd s() {
      if (this.m != null && !this.m.dK()) {
         return this.m;
      } else if (this.l != null && this.dP() instanceof aqk $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void w(bsd $$0) {
      super.w($$0);
      if ($$0 instanceof cir $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected bsd.b bb() {
      return bsd.b.a;
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(d, cua.l);
   }

   @Override
   protected double aY() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.p().e()) {
         this.ao();
      } else {
         super.l();
         if (this.j > 0 && this.j != 32767) {
            this.j--;
         }

         this.L = this.du();
         this.M = this.dw();
         this.N = this.dA();
         evz $$0 = this.ds();
         if (this.be() && this.b(awa.a) > 0.1F) {
            this.D();
         } else if (this.bs() && this.b(awa.b) > 0.1F) {
            this.E();
         } else {
            this.ba();
         }

         if (this.dP().B) {
            this.ag = false;
         } else {
            this.ag = !this.dP().a(this, this.cK().h(1.0E-7));
            if (this.ag) {
               this.m(this.du(), (this.cK().b + this.cK().e) / 2.0, this.dA());
            }
         }

         if (!this.aE() || this.ds().i() > 1.0E-5F || (this.ai + this.al()) % 4 == 0) {
            this.a(btd.a, this.ds());
            float $$1 = 0.98F;
            if (this.aE()) {
               $$1 = this.dP().a_(this.aK()).b().h() * 0.98F;
            }

            this.h(this.ds().d((double)$$1, 0.98, (double)$$1));
            if (this.aE()) {
               evz $$2 = this.ds();
               if ($$2.d < 0.0) {
                  this.h($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = aye.a(this.L) != aye.a(this.du()) || aye.a(this.M) != aye.a(this.dw()) || aye.a(this.N) != aye.a(this.dA());
         int $$4 = $$3 ? 2 : 40;
         if (this.ai % $$4 == 0 && !this.dP().B && this.H()) {
            this.G();
         }

         if (this.i != -32768) {
            this.i++;
         }

         this.av = this.av | this.bl();
         if (!this.dP().B) {
            double $$5 = this.ds().d($$0).g();
            if ($$5 > 0.01) {
               this.av = true;
            }
         }

         if (!this.dP().B && this.i >= 6000) {
            this.ao();
         }
      }
   }

   @Override
   protected ja aK() {
      return this.e(0.999999F);
   }

   private void D() {
      evz $$0 = this.ds();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void E() {
      evz $$0 = this.ds();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void G() {
      if (this.H()) {
         for (cir $$1 : this.dP().a(cir.class, this.cK().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.H())) {
            if ($$1.H()) {
               this.a($$1);
               if (this.dK()) {
                  break;
               }
            }
         }
      }
   }

   private boolean H() {
      cua $$0 = this.p();
      return this.bD() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.H() < $$0.j();
   }

   private void a(cir $$0) {
      cua $$1 = this.p();
      cua $$2 = $$0.p();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.H() < $$1.H()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cua $$0, cua $$1) {
      return $$1.H() + $$0.H() > $$1.j() ? false : cua.c($$0, $$1);
   }

   public static cua a(cua $$0, cua $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.j(), $$2) - $$0.H(), $$1.H());
      cua $$4 = $$0.c($$0.H() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cir $$0, cua $$1, cua $$2) {
      cua $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cir $$0, cua $$1, cir $$2, cua $$3) {
      a($$0, $$1, $$3);
      $$0.j = Math.max($$0.j, $$2.j);
      $$0.i = Math.min($$0.i, $$2.i);
      if ($$3.e()) {
         $$2.ao();
      }
   }

   @Override
   public boolean bd() {
      return this.p().b(kn.w) || super.bd();
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.p().e() && this.p().a(cud.us) && $$0.a(avw.m)) {
         return false;
      } else if (!this.p().a($$0)) {
         return false;
      } else if (this.dP().B) {
         return true;
      } else {
         this.bv();
         this.k = (int)((float)this.k - $$1);
         this.a(dxa.o, $$0.d());
         if (this.k <= 0) {
            this.p().a(this);
            this.ao();
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
         $$0.a("Item", this.p().a(this.dR()));
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
         this.a(cua.a(this.dR(), (uu)$$1).orElse(cua.l));
      } else {
         this.a(cua.l);
      }

      if (this.p().e()) {
         this.ao();
      }
   }

   @Override
   public void b_(cmh $$0) {
      if (!this.dP().B) {
         cua $$1 = this.p();
         ctv $$2 = $$1.g();
         int $$3 = $$1.H();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.cz())) && $$0.fY().f($$1)) {
            $$0.a(this, $$3);
            if ($$1.e()) {
               this.ao();
               $$1.e($$3);
            }

            $$0.a(avp.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public wu af() {
      wu $$0 = this.ah();
      return (wu)($$0 != null ? $$0 : wu.c(this.p().t()));
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Nullable
   @Override
   public bsd b(aqk $$0) {
      bsd $$1 = super.b($$0);
      if (!this.dP().B && $$1 instanceof cir) {
         ((cir)$$1).G();
      }

      return $$1;
   }

   public cua p() {
      return this.ap().a(d);
   }

   public void a(cua $$0) {
      this.ap().a(d, $$0);
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.p().a((bsd)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void b(bsd $$0) {
      this.l = $$0.cz();
      this.m = $$0;
   }

   public int u() {
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
      return ((float)this.u() + $$0) / 20.0F + this.c;
   }

   public cir C() {
      return new cir(this);
   }

   @Override
   public avg de() {
      return avg.i;
   }

   @Override
   public float dG() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public btq a_(int $$0) {
      return $$0 == 0 ? btq.a(this::p, this::a) : super.a_($$0);
   }
}
