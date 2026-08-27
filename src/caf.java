import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class caf extends bki implements blv {
   private static final afm<clb> c = afp.a(caf.class, afo.h);
   private static final int d = 6000;
   private static final int e = 32767;
   private static final int f = -32768;
   private int g;
   private int h;
   private int i = 5;
   @Nullable
   private UUID j;
   @Nullable
   private bki k;
   @Nullable
   private UUID l;
   public final float b;

   public caf(bkm<? extends caf> $$0, crs $$1) {
      super($$0, $$1);
      this.b = this.ag.i() * (float) Math.PI * 2.0F;
      this.r(this.ag.i() * 360.0F);
   }

   public caf(crs $$0, double $$1, double $$2, double $$3, clb $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public caf(crs $$0, double $$1, double $$2, double $$3, clb $$4, double $$5, double $$6, double $$7) {
      this(bkm.ad, $$0);
      this.e($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private caf(caf $$0) {
      super($$0.ag(), $$0.dL());
      this.a($$0.q().p());
      this.v($$0);
      this.g = $$0.g;
      this.b = $$0.b;
   }

   @Override
   public boolean aV() {
      return this.q().a(ark.aB);
   }

   @Nullable
   @Override
   public bki v() {
      if (this.k != null && !this.k.dG()) {
         return this.k;
      } else if (this.j != null && this.dL() instanceof ama $$0) {
         this.k = $$0.a(this.j);
         return this.k;
      } else {
         return null;
      }
   }

   @Override
   public void w(bki $$0) {
      super.w($$0);
      if ($$0 instanceof caf $$1) {
         this.k = $$1.k;
      }
   }

   @Override
   protected bki.b aU() {
      return bki.b.a;
   }

   @Override
   protected void b_() {
      this.al().a(c, clb.b);
   }

   @Override
   public void l() {
      if (this.q().b()) {
         this.ak();
      } else {
         super.l();
         if (this.h > 0 && this.h != 32767) {
            this.h--;
         }

         this.K = this.dq();
         this.L = this.ds();
         this.M = this.dw();
         eji $$0 = this.do();
         float $$1 = this.cH() - 0.11111111F;
         if (this.aX() && this.b(arh.a) > (double)$$1) {
            this.E();
         } else if (this.bl() && this.b(arh.b) > (double)$$1) {
            this.F();
         } else if (!this.aT()) {
            this.f(this.do().b(0.0, -0.04, 0.0));
         }

         if (this.dL().B) {
            this.af = false;
         } else {
            this.af = !this.dL().a(this, this.cG().h(1.0E-7));
            if (this.af) {
               this.m(this.dq(), (this.cG().b + this.cG().e) / 2.0, this.dw());
            }
         }

         if (!this.aA() || this.do().i() > 1.0E-5F || (this.ah + this.ah()) % 4 == 0) {
            this.a(ble.a, this.do());
            float $$2 = 0.98F;
            if (this.aA()) {
               $$2 = this.dL().a_(this.aG()).b().i() * 0.98F;
            }

            this.f(this.do().d((double)$$2, 0.98, (double)$$2));
            if (this.aA()) {
               eji $$3 = this.do();
               if ($$3.d < 0.0) {
                  this.f($$3.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$4 = ati.a(this.K) != ati.a(this.dq()) || ati.a(this.L) != ati.a(this.ds()) || ati.a(this.M) != ati.a(this.dw());
         int $$5 = $$4 ? 2 : 40;
         if (this.ah % $$5 == 0 && !this.dL().B && this.H()) {
            this.G();
         }

         if (this.g != -32768) {
            this.g++;
         }

         this.au = this.au | this.be();
         if (!this.dL().B) {
            double $$6 = this.do().d($$0).g();
            if ($$6 > 0.01) {
               this.au = true;
            }
         }

         if (!this.dL().B && this.g >= 6000) {
            this.ak();
         }
      }
   }

   @Override
   protected ht aG() {
      return this.d(0.999999F);
   }

   private void E() {
      eji $$0 = this.do();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void F() {
      eji $$0 = this.do();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void G() {
      if (this.H()) {
         for (caf $$1 : this.dL().a(caf.class, this.cG().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.H())) {
            if ($$1.H()) {
               this.a($$1);
               if (this.dG()) {
                  break;
               }
            }
         }
      }
   }

   private boolean H() {
      clb $$0 = this.q();
      return this.bv() && this.h != 32767 && this.g != -32768 && this.g < 6000 && $$0.L() < $$0.g();
   }

   private void a(caf $$0) {
      clb $$1 = this.q();
      clb $$2 = $$0.q();
      if (Objects.equals(this.l, $$0.l) && a($$1, $$2)) {
         if ($$2.L() < $$1.L()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(clb $$0, clb $$1) {
      if (!$$1.a($$0.d())) {
         return false;
      } else if ($$1.L() + $$0.L() > $$1.g()) {
         return false;
      } else {
         return $$1.u() ^ $$0.u() ? false : !$$1.u() || $$1.v().equals($$0.v());
      }
   }

   public static clb a(clb $$0, clb $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.g(), $$2) - $$0.L(), $$1.L());
      clb $$4 = $$0.c($$0.L() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(caf $$0, clb $$1, clb $$2) {
      clb $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(caf $$0, clb $$1, caf $$2, clb $$3) {
      a($$0, $$1, $$3);
      $$0.h = Math.max($$0.h, $$2.h);
      $$0.g = Math.min($$0.g, $$2.g);
      if ($$3.b()) {
         $$2.ak();
      }
   }

   @Override
   public boolean aW() {
      return this.q().d().w() || super.aW();
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.q().b() && this.q().a(cle.tz) && $$0.a(are.l)) {
         return false;
      } else if (!this.q().d().a($$0)) {
         return false;
      } else if (this.dL().B) {
         return true;
      } else {
         this.bo();
         this.i = (int)((float)this.i - $$1);
         this.a(dlg.o, $$0.d());
         if (this.i <= 0) {
            this.q().a(this);
            this.ak();
         }

         return true;
      }
   }

   @Override
   public void b(rz $$0) {
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
         $$0.a("Item", this.q().b(new rz()));
      }
   }

   @Override
   public void a(rz $$0) {
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

      rz $$1 = $$0.p("Item");
      this.a(clb.a($$1));
      if (this.q().b()) {
         this.ak();
      }
   }

   @Override
   public void b_(cdm $$0) {
      if (!this.dL().B) {
         clb $$1 = this.q();
         ckw $$2 = $$1.d();
         int $$3 = $$1.L();
         if (this.h == 0 && (this.l == null || this.l.equals($$0.cv())) && $$0.fS().e($$1)) {
            $$0.a(this, $$3);
            if ($$1.b()) {
               this.ak();
               $$1.f($$3);
            }

            $$0.a(aqx.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public ur ab() {
      ur $$0 = this.ad();
      return (ur)($$0 != null ? $$0 : ur.c(this.q().q()));
   }

   @Override
   public boolean cp() {
      return false;
   }

   @Nullable
   @Override
   public bki b(ama $$0) {
      bki $$1 = super.b($$0);
      if (!this.dL().B && $$1 instanceof caf) {
         ((caf)$$1).G();
      }

      return $$1;
   }

   public clb q() {
      return this.al().b(c);
   }

   public void a(clb $$0) {
      this.al().b(c, $$0);
   }

   @Override
   public void a(afm<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.q().a((bki)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.l = $$0;
   }

   public void a(bki $$0) {
      this.j = $$0.cv();
      this.k = $$0;
   }

   public int s() {
      return this.g;
   }

   public void t() {
      this.h = 10;
   }

   public void w() {
      this.h = 0;
   }

   public void x() {
      this.h = 32767;
   }

   public void b(int $$0) {
      this.h = $$0;
   }

   public boolean y() {
      return this.h > 0;
   }

   @Override
   public void z() {
      this.g = -32768;
   }

   @Override
   public void A() {
      this.g = -6000;
   }

   public void B() {
      this.x();
      this.g = 5999;
   }

   public float a(float $$0) {
      return ((float)this.s() + $$0) / 20.0F + this.b;
   }

   public caf C() {
      return new caf(this);
   }

   @Override
   public aqo da() {
      return aqo.i;
   }

   @Override
   public float dC() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }
}
