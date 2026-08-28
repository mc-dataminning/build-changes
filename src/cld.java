import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class cld extends bum implements bwh {
   private static final ajy<cwq> c = akc.a(cld.class, aka.h);
   private static final float d = 0.1F;
   public static final float a = 0.2125F;
   private static final int e = 6000;
   private static final int f = 32767;
   private static final int g = -32768;
   private int h;
   private int i;
   private int j = 5;
   @Nullable
   private UUID k;
   @Nullable
   private bum l;
   @Nullable
   private UUID m;
   public final float b;

   public cld(but<? extends cld> $$0, dgj $$1) {
      super($$0, $$1);
      this.b = this.ae.i() * (float) Math.PI * 2.0F;
      this.v(this.ae.i() * 360.0F);
   }

   public cld(dgj $$0, double $$1, double $$2, double $$3, cwq $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.A.j() * 0.2 - 0.1, 0.2, $$0.A.j() * 0.2 - 0.1);
   }

   public cld(dgj $$0, double $$1, double $$2, double $$3, cwq $$4, double $$5, double $$6, double $$7) {
      this(but.aq, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private cld(cld $$0) {
      super($$0.aq(), $$0.dV());
      this.a($$0.l().v());
      this.w($$0);
      this.h = $$0.h;
      this.b = $$0.b;
   }

   @Override
   public boolean bh() {
      return this.l().a(awy.br);
   }

   @Nullable
   @Override
   public bum p() {
      if (this.l != null && !this.l.dQ()) {
         return this.l;
      } else if (this.k != null && this.dV() instanceof ard $$0) {
         this.l = $$0.a(this.k);
         return this.l;
      } else {
         return null;
      }
   }

   @Override
   public void x(bum $$0) {
      super.x($$0);
      if ($$0 instanceof cld $$1) {
         this.l = $$1.l;
      }
   }

   @Override
   protected bum.c bg() {
      return bum.c.a;
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(c, cwq.j);
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   @Override
   public void h() {
      if (this.l().f()) {
         this.at();
      } else {
         super.h();
         if (this.i > 0 && this.i != 32767) {
            this.i--;
         }

         this.K = this.dA();
         this.L = this.dC();
         this.M = this.dG();
         fbb $$0 = this.dy();
         if (this.bj() && this.b(awv.a) > 0.1F) {
            this.A();
         } else if (this.bx() && this.b(awv.b) > 0.1F) {
            this.B();
         } else {
            this.bf();
         }

         if (this.dV().C) {
            this.ad = false;
         } else {
            this.ad = !this.dV().a(this, this.cR().h(1.0E-7));
            if (this.ad) {
               this.m(this.dA(), (this.cR().b + this.cR().e) / 2.0, this.dG());
            }
         }

         if (!this.aJ() || this.dy().j() > 1.0E-5F || (this.af + this.ar()) % 4 == 0) {
            this.a(bvm.a, this.dy());
            this.aK();
            float $$1 = 0.98F;
            if (this.aJ()) {
               $$1 = this.dV().a_(this.aQ()).b().g() * 0.98F;
            }

            this.i(this.dy().d((double)$$1, 0.98, (double)$$1));
            if (this.aJ()) {
               fbb $$2 = this.dy();
               if ($$2.e < 0.0) {
                  this.i($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = ayz.a(this.K) != ayz.a(this.dA()) || ayz.a(this.L) != ayz.a(this.dC()) || ayz.a(this.M) != ayz.a(this.dG());
         int $$4 = $$3 ? 2 : 40;
         if (this.af % $$4 == 0 && !this.dV().C && this.D()) {
            this.C();
         }

         if (this.h != -32768) {
            this.h++;
         }

         this.ar = this.ar | this.bq();
         if (!this.dV().C) {
            double $$5 = this.dy().d($$0).h();
            if ($$5 > 0.01) {
               this.ar = true;
            }
         }

         if (!this.dV().C && this.h >= 6000) {
            this.at();
         }
      }
   }

   @Override
   public ji aQ() {
      return this.e(0.999999F);
   }

   private void A() {
      this.h(0.99F);
   }

   private void B() {
      this.h(0.95F);
   }

   private void h(double $$0) {
      fbb $$1 = this.dy();
      this.n($$1.d * $$0, $$1.e + (double)($$1.e < 0.06F ? 5.0E-4F : 0.0F), $$1.f * $$0);
   }

   private void C() {
      if (this.D()) {
         for (cld $$1 : this.dV().a(cld.class, this.cR().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.D())) {
            if ($$1.D()) {
               this.a($$1);
               if (this.dQ()) {
                  break;
               }
            }
         }
      }
   }

   private boolean D() {
      cwq $$0 = this.l();
      return this.bL() && this.i != 32767 && this.h != -32768 && this.h < 6000 && $$0.M() < $$0.k();
   }

   private void a(cld $$0) {
      cwq $$1 = this.l();
      cwq $$2 = $$0.l();
      if (Objects.equals(this.m, $$0.m) && a($$1, $$2)) {
         if ($$2.M() < $$1.M()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cwq $$0, cwq $$1) {
      return $$1.M() + $$0.M() > $$1.k() ? false : cwq.c($$0, $$1);
   }

   public static cwq a(cwq $$0, cwq $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.M(), $$1.M());
      cwq $$4 = $$0.c($$0.M() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(cld $$0, cwq $$1, cwq $$2) {
      cwq $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(cld $$0, cwq $$1, cld $$2, cwq $$3) {
      a($$0, $$1, $$3);
      $$0.i = Math.max($$0.i, $$2.i);
      $$0.h = Math.min($$0.h, $$2.h);
      if ($$3.f()) {
         $$2.at();
      }
   }

   @Override
   public boolean bi() {
      return !this.l().a(this.dW().a()) || super.bi();
   }

   @Override
   protected boolean aF() {
      return this.j <= 0 ? true : this.af % 10 == 0;
   }

   @Override
   public final boolean b(btc $$0) {
      return this.d($$0) ? false : this.l().a($$0);
   }

   @Override
   public final boolean a(ard $$0, btc $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().b(dgf.c) && $$1.d() instanceof bvk) {
         return false;
      } else if (!this.l().a($$1)) {
         return false;
      } else {
         this.bD();
         this.j = (int)((float)this.j - $$2);
         this.a(ebu.o, $$1.d());
         if (this.j <= 0) {
            this.l().a(this);
            this.at();
         }

         return true;
      }
   }

   @Override
   public boolean a(dgb $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void b(tq $$0) {
      $$0.a("Health", (short)this.j);
      $$0.a("Age", (short)this.h);
      $$0.a("PickupDelay", (short)this.i);
      if (this.k != null) {
         $$0.a("Thrower", this.k);
      }

      if (this.m != null) {
         $$0.a("Owner", this.m);
      }

      if (!this.l().f()) {
         $$0.a("Item", this.l().a(this.dX()));
      }
   }

   @Override
   public void a(tq $$0) {
      this.j = $$0.g("Health");
      this.h = $$0.g("Age");
      if ($$0.e("PickupDelay")) {
         this.i = $$0.g("PickupDelay");
      }

      if ($$0.b("Owner")) {
         this.m = $$0.a("Owner");
      }

      if ($$0.b("Thrower")) {
         this.k = $$0.a("Thrower");
         this.l = null;
      }

      if ($$0.b("Item", 10)) {
         tq $$1 = $$0.p("Item");
         this.a(cwq.a(this.dX(), (un)$$1).orElse(cwq.j));
      } else {
         this.a(cwq.j);
      }

      if (this.l().f()) {
         this.at();
      }
   }

   @Override
   public void a_(coy $$0) {
      if (!this.dV().C) {
         cwq $$1 = this.l();
         cwm $$2 = $$1.h();
         int $$3 = $$1.M();
         if (this.i == 0 && (this.m == null || this.m.equals($$0.cG())) && $$0.gi().f($$1)) {
            $$0.a(this, $$3);
            if ($$1.f()) {
               this.at();
               $$1.e($$3);
            }

            $$0.a(awk.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public wp al() {
      wp $$0 = this.an();
      return $$0 != null ? $$0 : this.l().A();
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Nullable
   @Override
   public bum b(eua $$0) {
      bum $$1 = super.b($$0);
      if (!this.dV().C && $$1 instanceof cld $$2) {
         $$2.C();
      }

      return $$1;
   }

   public cwq l() {
      return this.au().a(c);
   }

   public void a(cwq $$0) {
      this.au().a(c, $$0);
   }

   @Override
   public void a(ajy<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.l().a((bum)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.m = $$0;
   }

   public void b(bum $$0) {
      this.k = $$0.cG();
      this.l = $$0;
   }

   public int m() {
      return this.h;
   }

   public void s() {
      this.i = 10;
   }

   public void t() {
      this.i = 0;
   }

   public void u() {
      this.i = 32767;
   }

   public void b(int $$0) {
      this.i = $$0;
   }

   public boolean v() {
      return this.i > 0;
   }

   public void w() {
      this.h = -32768;
   }

   public void x() {
      this.h = -6000;
   }

   public void y() {
      this.u();
      this.h = 5999;
   }

   public static float f(float $$0, float $$1) {
      return $$0 / 20.0F + $$1;
   }

   public cld z() {
      return new cld(this);
   }

   @Override
   public awb dm() {
      return awb.i;
   }

   @Override
   public float dM() {
      return 180.0F - f((float)this.m() + 0.5F, this.b) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public bwa a_(int $$0) {
      return $$0 == 0 ? bwa.a(this::l, this::a) : super.a_($$0);
   }
}
