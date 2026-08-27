import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cas extends bkv implements bmi {
   private static final afs<clo> c = afv.a(cas.class, afu.h);
   private static final int d = 6000;
   private static final int e = 32767;
   private static final int f = -32768;
   private int g;
   private int h;
   private int i = 5;
   @Nullable
   private UUID j;
   @Nullable
   private bkv k;
   @Nullable
   private UUID l;
   public final float b;

   public cas(bkz<? extends cas> $$0, csf $$1) {
      super($$0, $$1);
      this.b = this.ag.i() * (float) Math.PI * 2.0F;
      this.r(this.ag.i() * 360.0F);
   }

   public cas(csf $$0, double $$1, double $$2, double $$3, clo $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public cas(csf $$0, double $$1, double $$2, double $$3, clo $$4, double $$5, double $$6, double $$7) {
      this(bkz.ad, $$0);
      this.a_($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private cas(cas $$0) {
      super($$0.ai(), $$0.dN());
      this.a($$0.q().p());
      this.v($$0);
      this.g = $$0.g;
      this.b = $$0.b;
   }

   @Override
   public boolean aX() {
      return this.q().a(ars.aB);
   }

   @Nullable
   @Override
   public bkv w() {
      if (this.k != null && !this.k.dI()) {
         return this.k;
      } else if (this.j != null && this.dN() instanceof ami $$0) {
         this.k = $$0.a(this.j);
         return this.k;
      } else {
         return null;
      }
   }

   @Override
   public void w(bkv $$0) {
      super.w($$0);
      if ($$0 instanceof cas $$1) {
         this.k = $$1.k;
      }
   }

   @Override
   protected bkv.b aW() {
      return bkv.b.a;
   }

   @Override
   protected void c_() {
      this.an().a(c, clo.b);
   }

   @Override
   public void l() {
      if (this.q().b()) {
         this.am();
      } else {
         super.l();
         if (this.h > 0 && this.h != 32767) {
            this.h--;
         }

         this.K = this.ds();
         this.L = this.du();
         this.M = this.dy();
         ejz $$0 = this.dq();
         float $$1 = this.cI() - 0.11111111F;
         if (this.aZ() && this.b(arp.a) > (double)$$1) {
            this.E();
         } else if (this.bn() && this.b(arp.b) > (double)$$1) {
            this.G();
         } else if (!this.aV()) {
            this.g(this.dq().b(0.0, -0.04, 0.0));
         }

         if (this.dN().B) {
            this.af = false;
         } else {
            this.af = !this.dN().a(this, this.cH().h(1.0E-7));
            if (this.af) {
               this.m(this.ds(), (this.cH().b + this.cH().e) / 2.0, this.dy());
            }
         }

         if (!this.aC() || this.dq().i() > 1.0E-5F || (this.ah + this.aj()) % 4 == 0) {
            this.a(blr.a, this.dq());
            float $$2 = 0.98F;
            if (this.aC()) {
               $$2 = this.dN().a_(this.aI()).b().i() * 0.98F;
            }

            this.g(this.dq().d((double)$$2, 0.98, (double)$$2));
            if (this.aC()) {
               ejz $$3 = this.dq();
               if ($$3.d < 0.0) {
                  this.g($$3.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$4 = atq.a(this.K) != atq.a(this.ds()) || atq.a(this.L) != atq.a(this.du()) || atq.a(this.M) != atq.a(this.dy());
         int $$5 = $$4 ? 2 : 40;
         if (this.ah % $$5 == 0 && !this.dN().B && this.I()) {
            this.H();
         }

         if (this.g != -32768) {
            this.g++;
         }

         this.au = this.au | this.bg();
         if (!this.dN().B) {
            double $$6 = this.dq().d($$0).g();
            if ($$6 > 0.01) {
               this.au = true;
            }
         }

         if (!this.dN().B && this.g >= 6000) {
            this.am();
         }
      }
   }

   @Override
   protected hx aI() {
      return this.d(0.999999F);
   }

   private void E() {
      ejz $$0 = this.dq();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void G() {
      ejz $$0 = this.dq();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void H() {
      if (this.I()) {
         for (cas $$1 : this.dN().a(cas.class, this.cH().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.I())) {
            if ($$1.I()) {
               this.a($$1);
               if (this.dI()) {
                  break;
               }
            }
         }
      }
   }

   private boolean I() {
      clo $$0 = this.q();
      return this.bx() && this.h != 32767 && this.g != -32768 && this.g < 6000 && $$0.L() < $$0.g();
   }

   private void a(cas $$0) {
      clo $$1 = this.q();
      clo $$2 = $$0.q();
      if (Objects.equals(this.l, $$0.l) && a($$1, $$2)) {
         if ($$2.L() < $$1.L()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(clo $$0, clo $$1) {
      if (!$$1.a($$0.d())) {
         return false;
      } else if ($$1.L() + $$0.L() > $$1.g()) {
         return false;
      } else {
         return $$1.u() ^ $$0.u() ? false : !$$1.u() || $$1.v().equals($$0.v());
      }
   }

   public static clo a(clo $$0, clo $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.g(), $$2) - $$0.L(), $$1.L());
      clo $$4 = $$0.c($$0.L() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cas $$0, clo $$1, clo $$2) {
      clo $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cas $$0, clo $$1, cas $$2, clo $$3) {
      a($$0, $$1, $$3);
      $$0.h = Math.max($$0.h, $$2.h);
      $$0.g = Math.min($$0.g, $$2.g);
      if ($$3.b()) {
         $$2.am();
      }
   }

   @Override
   public boolean aY() {
      return this.q().d().w() || super.aY();
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.q().b() && this.q().a(clr.uk) && $$0.a(arm.l)) {
         return false;
      } else if (!this.q().d().a($$0)) {
         return false;
      } else if (this.dN().B) {
         return true;
      } else {
         this.bq();
         this.i = (int)((float)this.i - $$1);
         this.a(dlx.o, $$0.d());
         if (this.i <= 0) {
            this.q().a(this);
            this.am();
         }

         return true;
      }
   }

   @Override
   public void b(sd $$0) {
      $$0.a("Health", (short)this.i);
      $$0.a("Age", (short)this.g);
      $$0.a("PickupDelay", (short)this.h);
      if (this.j != null) {
         $$0.a("Thrower", this.j);
      }

      if (this.l != null) {
         $$0.a("Owner", this.l);
      }

      if (!this.q().b()) {
         $$0.a("Item", this.q().b(new sd()));
      }
   }

   @Override
   public void a(sd $$0) {
      this.i = $$0.g("Health");
      this.g = $$0.g("Age");
      if ($$0.e("PickupDelay")) {
         this.h = $$0.g("PickupDelay");
      }

      if ($$0.b("Owner")) {
         this.l = $$0.a("Owner");
      }

      if ($$0.b("Thrower")) {
         this.j = $$0.a("Thrower");
         this.k = null;
      }

      sd $$1 = $$0.p("Item");
      this.a(clo.a($$1));
      if (this.q().b()) {
         this.am();
      }
   }

   @Override
   public void b_(cdz $$0) {
      if (!this.dN().B) {
         clo $$1 = this.q();
         clj $$2 = $$1.d();
         int $$3 = $$1.L();
         if (this.h == 0 && (this.l == null || this.l.equals($$0.cw())) && $$0.fT().e($$1)) {
            $$0.a(this, $$3);
            if ($$1.b()) {
               this.am();
               $$1.f($$3);
            }

            $$0.a(arf.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public uv ad() {
      uv $$0 = this.af();
      return (uv)($$0 != null ? $$0 : uv.c(this.q().q()));
   }

   @Override
   public boolean cq() {
      return false;
   }

   @Nullable
   @Override
   public bkv b(ami $$0) {
      bkv $$1 = super.b($$0);
      if (!this.dN().B && $$1 instanceof cas) {
         ((cas)$$1).H();
      }

      return $$1;
   }

   public clo q() {
      return this.an().b(c);
   }

   public void a(clo $$0) {
      this.an().b(c, $$0);
   }

   @Override
   public void a(afs<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.q().a((bkv)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.l = $$0;
   }

   public void a(bkv $$0) {
      this.j = $$0.cw();
      this.k = $$0;
   }

   public int s() {
      return this.g;
   }

   public void u() {
      this.h = 10;
   }

   public void x() {
      this.h = 0;
   }

   @Override
   public void y() {
      this.h = 32767;
   }

   public void b(int $$0) {
      this.h = $$0;
   }

   public boolean z() {
      return this.h > 0;
   }

   public void A() {
      this.g = -32768;
   }

   public void B() {
      this.g = -6000;
   }

   public void C() {
      this.y();
      this.g = 5999;
   }

   public float a(float $$0) {
      return ((float)this.s() + $$0) / 20.0F + this.b;
   }

   public cas D() {
      return new cas(this);
   }

   @Override
   public aqw dc() {
      return aqw.i;
   }

   @Override
   public float dE() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }
}
