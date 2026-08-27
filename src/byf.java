import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class byf extends bii implements bjv {
   private static final adz<cix> c = aec.a(byf.class, aeb.h);
   private static final int d = 6000;
   private static final int e = 32767;
   private static final int f = -32768;
   private int g;
   private int h;
   private int i = 5;
   @Nullable
   private UUID j;
   @Nullable
   private UUID k;
   public final float b;

   public byf(bim<? extends byf> $$0, cpl $$1) {
      super($$0, $$1);
      this.b = this.ag.i() * (float) Math.PI * 2.0F;
      this.r(this.ag.i() * 360.0F);
   }

   public byf(cpl $$0, double $$1, double $$2, double $$3, cix $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public byf(cpl $$0, double $$1, double $$2, double $$3, cix $$4, double $$5, double $$6, double $$7) {
      this(bim.ad, $$0);
      this.e($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private byf(byf $$0) {
      super($$0.ag(), $$0.dK());
      this.a($$0.j().p());
      this.v($$0);
      this.g = $$0.g;
      this.b = $$0.b;
   }

   @Override
   public boolean aV() {
      return this.j().a(apt.aB);
   }

   @Nullable
   @Override
   public bii v() {
      return this.j != null && this.dK() instanceof akk $$0 ? $$0.a(this.j) : null;
   }

   @Override
   protected bii.b aU() {
      return bii.b.a;
   }

   @Override
   protected void a_() {
      this.al().a(c, cix.b);
   }

   @Override
   public void l() {
      if (this.j().b()) {
         this.ak();
      } else {
         super.l();
         if (this.h > 0 && this.h != 32767) {
            this.h--;
         }

         this.K = this.dp();
         this.L = this.dr();
         this.M = this.dv();
         ehd $$0 = this.dn();
         float $$1 = this.cH() - 0.11111111F;
         if (this.aX() && this.b(apq.a) > (double)$$1) {
            this.y();
         } else if (this.bl() && this.b(apq.b) > (double)$$1) {
            this.z();
         } else if (!this.aT()) {
            this.f(this.dn().b(0.0, -0.04, 0.0));
         }

         if (this.dK().B) {
            this.af = false;
         } else {
            this.af = !this.dK().a(this, this.cG().h(1.0E-7));
            if (this.af) {
               this.m(this.dp(), (this.cG().b + this.cG().e) / 2.0, this.dv());
            }
         }

         if (!this.aA() || this.dn().i() > 1.0E-5F || (this.ah + this.ah()) % 4 == 0) {
            this.a(bje.a, this.dn());
            float $$2 = 0.98F;
            if (this.aA()) {
               $$2 = this.dK().a_(this.aG()).b().h() * 0.98F;
            }

            this.f(this.dn().d((double)$$2, 0.98, (double)$$2));
            if (this.aA()) {
               ehd $$3 = this.dn();
               if ($$3.d < 0.0) {
                  this.f($$3.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$4 = arp.a(this.K) != arp.a(this.dp()) || arp.a(this.L) != arp.a(this.dr()) || arp.a(this.M) != arp.a(this.dv());
         int $$5 = $$4 ? 2 : 40;
         if (this.ah % $$5 == 0 && !this.dK().B && this.B()) {
            this.A();
         }

         if (this.g != -32768) {
            this.g++;
         }

         this.au = this.au | this.be();
         if (!this.dK().B) {
            double $$6 = this.dn().d($$0).g();
            if ($$6 > 0.01) {
               this.au = true;
            }
         }

         if (!this.dK().B && this.g >= 6000) {
            this.ak();
         }
      }
   }

   @Override
   protected gu aG() {
      return this.d(0.999999F);
   }

   private void y() {
      ehd $$0 = this.dn();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void z() {
      ehd $$0 = this.dn();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void A() {
      if (this.B()) {
         for (byf $$1 : this.dK().a(byf.class, this.cG().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.B())) {
            if ($$1.B()) {
               this.a($$1);
               if (this.dF()) {
                  break;
               }
            }
         }
      }
   }

   private boolean B() {
      cix $$0 = this.j();
      return this.bv() && this.h != 32767 && this.g != -32768 && this.g < 6000 && $$0.L() < $$0.g();
   }

   private void a(byf $$0) {
      cix $$1 = this.j();
      cix $$2 = $$0.j();
      if (Objects.equals(this.k, $$0.k) && a($$1, $$2)) {
         if ($$2.L() < $$1.L()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cix $$0, cix $$1) {
      if (!$$1.a($$0.d())) {
         return false;
      } else if ($$1.L() + $$0.L() > $$1.g()) {
         return false;
      } else {
         return $$1.u() ^ $$0.u() ? false : !$$1.u() || $$1.v().equals($$0.v());
      }
   }

   public static cix a(cix $$0, cix $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.g(), $$2) - $$0.L(), $$1.L());
      cix $$4 = $$0.c($$0.L() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(byf $$0, cix $$1, cix $$2) {
      cix $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(byf $$0, cix $$1, byf $$2, cix $$3) {
      a($$0, $$1, $$3);
      $$0.h = Math.max($$0.h, $$2.h);
      $$0.g = Math.min($$0.g, $$2.g);
      if ($$3.b()) {
         $$2.ak();
      }
   }

   @Override
   public boolean aW() {
      return this.j().d().w() || super.aW();
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.j().b() && this.j().a(cja.ty) && $$0.a(apn.l)) {
         return false;
      } else if (!this.j().d().a($$0)) {
         return false;
      } else if (this.dK().B) {
         return true;
      } else {
         this.bo();
         this.i = (int)((float)this.i - $$1);
         this.a(djj.o, $$0.d());
         if (this.i <= 0) {
            this.j().a(this);
            this.ak();
         }

         return true;
      }
   }

   @Override
   public void b(qr $$0) {
      $$0.a("Health", (short)this.i);
      $$0.a("Age", (short)this.g);
      $$0.a("PickupDelay", (short)this.h);
      if (this.j != null) {
         $$0.a("Thrower", this.j);
      }

      if (this.k != null) {
         $$0.a("Owner", this.k);
      }

      if (!this.j().b()) {
         $$0.a("Item", this.j().b(new qr()));
      }
   }

   @Override
   public void a(qr $$0) {
      this.i = $$0.g("Health");
      this.g = $$0.g("Age");
      if ($$0.e("PickupDelay")) {
         this.h = $$0.g("PickupDelay");
      }

      if ($$0.b("Owner")) {
         this.k = $$0.a("Owner");
      }

      if ($$0.b("Thrower")) {
         this.j = $$0.a("Thrower");
      }

      qr $$1 = $$0.p("Item");
      this.a(cix.a($$1));
      if (this.j().b()) {
         this.ak();
      }
   }

   @Override
   public void b_(cbm $$0) {
      if (!this.dK().B) {
         cix $$1 = this.j();
         cis $$2 = $$1.d();
         int $$3 = $$1.L();
         if (this.h == 0 && (this.k == null || this.k.equals($$0.cv())) && $$0.fQ().e($$1)) {
            $$0.a(this, $$3);
            if ($$1.b()) {
               this.ak();
               $$1.f($$3);
            }

            $$0.a(apg.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public tf ab() {
      tf $$0 = this.ad();
      return (tf)($$0 != null ? $$0 : tf.c(this.j().q()));
   }

   @Override
   public boolean cp() {
      return false;
   }

   @Nullable
   @Override
   public bii b(akk $$0) {
      bii $$1 = super.b($$0);
      if (!this.dK().B && $$1 instanceof byf) {
         ((byf)$$1).A();
      }

      return $$1;
   }

   public cix j() {
      return this.al().b(c);
   }

   public void a(cix $$0) {
      this.al().b(c, $$0);
   }

   @Override
   public void a(adz<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.j().a((bii)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.k = $$0;
   }

   public void c(@Nullable UUID $$0) {
      this.j = $$0;
   }

   public int m() {
      return this.g;
   }

   public void o() {
      this.h = 10;
   }

   public void p() {
      this.h = 0;
   }

   public void q() {
      this.h = 32767;
   }

   public void b(int $$0) {
      this.h = $$0;
   }

   public boolean r() {
      return this.h > 0;
   }

   @Override
   public void s() {
      this.g = -32768;
   }

   public void t() {
      this.g = -6000;
   }

   public void w() {
      this.q();
      this.g = 5999;
   }

   public float a(float $$0) {
      return ((float)this.m() + $$0) / 20.0F + this.b;
   }

   public byf x() {
      return new byf(this);
   }

   @Override
   public aox da() {
      return aox.i;
   }

   @Override
   public float dB() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }
}
