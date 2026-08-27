import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class byp extends bis implements bkf {
   private static final aeg<cjh> c = aej.a(byp.class, aei.h);
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

   public byp(biw<? extends byp> $$0, cpx $$1) {
      super($$0, $$1);
      this.b = this.ag.i() * (float) Math.PI * 2.0F;
      this.r(this.ag.i() * 360.0F);
   }

   public byp(cpx $$0, double $$1, double $$2, double $$3, cjh $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public byp(cpx $$0, double $$1, double $$2, double $$3, cjh $$4, double $$5, double $$6, double $$7) {
      this(biw.ad, $$0);
      this.e($$1, $$2, $$3);
      this.o($$5, $$6, $$7);
      this.a($$4);
   }

   private byp(byp $$0) {
      super($$0.ag(), $$0.dL());
      this.a($$0.q().p());
      this.v($$0);
      this.g = $$0.g;
      this.b = $$0.b;
   }

   @Override
   public boolean aV() {
      return this.q().a(aqc.aB);
   }

   @Nullable
   @Override
   public bis v() {
      return this.j != null && this.dL() instanceof aks $$0 ? $$0.a(this.j) : null;
   }

   @Override
   protected bis.b aU() {
      return bis.b.a;
   }

   @Override
   protected void a_() {
      this.al().a(c, cjh.b);
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
         ehp $$0 = this.do();
         float $$1 = this.cH() - 0.11111111F;
         if (this.aX() && this.b(apz.a) > (double)$$1) {
            this.E();
         } else if (this.bl() && this.b(apz.b) > (double)$$1) {
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
            this.a(bjo.a, this.do());
            float $$2 = 0.98F;
            if (this.aA()) {
               $$2 = this.dL().a_(this.aG()).b().h() * 0.98F;
            }

            this.f(this.do().d((double)$$2, 0.98, (double)$$2));
            if (this.aA()) {
               ehp $$3 = this.do();
               if ($$3.d < 0.0) {
                  this.f($$3.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$4 = ary.a(this.K) != ary.a(this.dq()) || ary.a(this.L) != ary.a(this.ds()) || ary.a(this.M) != ary.a(this.dw());
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
   protected gw aG() {
      return this.d(0.999999F);
   }

   private void E() {
      ehp $$0 = this.do();
      this.o($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void F() {
      ehp $$0 = this.do();
      this.o($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void G() {
      if (this.H()) {
         for (byp $$1 : this.dL().a(byp.class, this.cG().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.H())) {
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
      cjh $$0 = this.q();
      return this.bv() && this.h != 32767 && this.g != -32768 && this.g < 6000 && $$0.L() < $$0.g();
   }

   private void a(byp $$0) {
      cjh $$1 = this.q();
      cjh $$2 = $$0.q();
      if (Objects.equals(this.k, $$0.k) && a($$1, $$2)) {
         if ($$2.L() < $$1.L()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cjh $$0, cjh $$1) {
      if (!$$1.a($$0.d())) {
         return false;
      } else if ($$1.L() + $$0.L() > $$1.g()) {
         return false;
      } else {
         return $$1.u() ^ $$0.u() ? false : !$$1.u() || $$1.v().equals($$0.v());
      }
   }

   public static cjh a(cjh $$0, cjh $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.g(), $$2) - $$0.L(), $$1.L());
      cjh $$4 = $$0.c($$0.L() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(byp $$0, cjh $$1, cjh $$2) {
      cjh $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(byp $$0, cjh $$1, byp $$2, cjh $$3) {
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
   public boolean a(bhq $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.q().b() && this.q().a(cjk.ty) && $$0.a(apw.l)) {
         return false;
      } else if (!this.q().d().a($$0)) {
         return false;
      } else if (this.dL().B) {
         return true;
      } else {
         this.bo();
         this.i = (int)((float)this.i - $$1);
         this.a(djv.o, $$0.d());
         if (this.i <= 0) {
            this.q().a(this);
            this.ak();
         }

         return true;
      }
   }

   @Override
   public void b(qy $$0) {
      $$0.a("Health", (short)this.i);
      $$0.a("Age", (short)this.g);
      $$0.a("PickupDelay", (short)this.h);
      if (this.j != null) {
         $$0.a("Thrower", this.j);
      }

      if (this.k != null) {
         $$0.a("Owner", this.k);
      }

      if (!this.q().b()) {
         $$0.a("Item", this.q().b(new qy()));
      }
   }

   @Override
   public void a(qy $$0) {
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

      qy $$1 = $$0.p("Item");
      this.a(cjh.a($$1));
      if (this.q().b()) {
         this.ak();
      }
   }

   @Override
   public void b_(cbw $$0) {
      if (!this.dL().B) {
         cjh $$1 = this.q();
         cjc $$2 = $$1.d();
         int $$3 = $$1.L();
         if (this.h == 0 && (this.k == null || this.k.equals($$0.cv())) && $$0.fR().e($$1)) {
            $$0.a(this, $$3);
            if ($$1.b()) {
               this.ak();
               $$1.f($$3);
            }

            $$0.a(app.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public tn ab() {
      tn $$0 = this.ad();
      return (tn)($$0 != null ? $$0 : tn.c(this.q().q()));
   }

   @Override
   public boolean cp() {
      return false;
   }

   @Nullable
   @Override
   public bis b(aks $$0) {
      bis $$1 = super.b($$0);
      if (!this.dL().B && $$1 instanceof byp) {
         ((byp)$$1).G();
      }

      return $$1;
   }

   public cjh q() {
      return this.al().b(c);
   }

   public void a(cjh $$0) {
      this.al().b(c, $$0);
   }

   @Override
   public void a(aeg<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.q().a((bis)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.k = $$0;
   }

   public void c(@Nullable UUID $$0) {
      this.j = $$0;
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

   public byp C() {
      return new byp(this);
   }

   @Override
   public apg da() {
      return apg.i;
   }

   @Override
   public float dC() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }
}
