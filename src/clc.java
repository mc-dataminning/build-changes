import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class clc extends bul implements bwg {
   private static final akm<cwm> c = akq.a(clc.class, ako.h);
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
   private bul l;
   @Nullable
   private UUID m;
   public final float b;

   public clc(bus<? extends clc> $$0, dfm $$1) {
      super($$0, $$1);
      this.b = this.ae.i() * (float) Math.PI * 2.0F;
      this.v(this.ae.i() * 360.0F);
   }

   public clc(dfm $$0, double $$1, double $$2, double $$3, cwm $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.A.j() * 0.2 - 0.1, 0.2, $$0.A.j() * 0.2 - 0.1);
   }

   public clc(dfm $$0, double $$1, double $$2, double $$3, cwm $$4, double $$5, double $$6, double $$7) {
      this(bus.ap, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private clc(clc $$0) {
      super($$0.aq(), $$0.dV());
      this.a($$0.j().v());
      this.w($$0);
      this.h = $$0.h;
      this.b = $$0.b;
   }

   @Override
   public boolean bh() {
      return this.j().a(axl.bs);
   }

   @Nullable
   @Override
   public bul p() {
      if (this.l != null && !this.l.dQ()) {
         return this.l;
      } else if (this.k != null && this.dV() instanceof arp $$0) {
         this.l = $$0.a(this.k);
         return this.l;
      } else {
         return null;
      }
   }

   @Override
   public void x(bul $$0) {
      super.x($$0);
      if ($$0 instanceof clc $$1) {
         this.l = $$1.l;
      }
   }

   @Override
   protected bul.b bg() {
      return bul.b.a;
   }

   @Override
   protected void a(akq.a $$0) {
      $$0.a(c, cwm.k);
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   @Override
   public void h() {
      if (this.j().f()) {
         this.at();
      } else {
         super.h();
         if (this.i > 0 && this.i != 32767) {
            this.i--;
         }

         this.K = this.dA();
         this.L = this.dC();
         this.M = this.dG();
         ezy $$0 = this.dy();
         if (this.bj() && this.b(axi.a) > 0.1F) {
            this.y();
         } else if (this.bx() && this.b(axi.b) > 0.1F) {
            this.z();
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
            this.a(bvl.a, this.dy());
            this.aK();
            float $$1 = 0.98F;
            if (this.aJ()) {
               $$1 = this.dV().a_(this.aQ()).b().g() * 0.98F;
            }

            this.h(this.dy().d((double)$$1, 0.98, (double)$$1));
            if (this.aJ()) {
               ezy $$2 = this.dy();
               if ($$2.e < 0.0) {
                  this.h($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = azm.a(this.K) != azm.a(this.dA()) || azm.a(this.L) != azm.a(this.dC()) || azm.a(this.M) != azm.a(this.dG());
         int $$4 = $$3 ? 2 : 40;
         if (this.af % $$4 == 0 && !this.dV().C && this.B()) {
            this.A();
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
   public jh aQ() {
      return this.e(0.999999F);
   }

   private void y() {
      this.h(0.99F);
   }

   private void z() {
      this.h(0.95F);
   }

   private void h(double $$0) {
      ezy $$1 = this.dy();
      this.n($$1.d * $$0, $$1.e + (double)($$1.e < 0.06F ? 5.0E-4F : 0.0F), $$1.f * $$0);
   }

   private void A() {
      if (this.B()) {
         for (clc $$1 : this.dV().a(clc.class, this.cR().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.B())) {
            if ($$1.B()) {
               this.a($$1);
               if (this.dQ()) {
                  break;
               }
            }
         }
      }
   }

   private boolean B() {
      cwm $$0 = this.j();
      return this.bL() && this.i != 32767 && this.h != -32768 && this.h < 6000 && $$0.L() < $$0.k();
   }

   private void a(clc $$0) {
      cwm $$1 = this.j();
      cwm $$2 = $$0.j();
      if (Objects.equals(this.m, $$0.m) && a($$1, $$2)) {
         if ($$2.L() < $$1.L()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cwm $$0, cwm $$1) {
      return $$1.L() + $$0.L() > $$1.k() ? false : cwm.c($$0, $$1);
   }

   public static cwm a(cwm $$0, cwm $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.L(), $$1.L());
      cwm $$4 = $$0.c($$0.L() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(clc $$0, cwm $$1, cwm $$2) {
      cwm $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(clc $$0, cwm $$1, clc $$2, cwm $$3) {
      a($$0, $$1, $$3);
      $$0.i = Math.max($$0.i, $$2.i);
      $$0.h = Math.min($$0.h, $$2.h);
      if ($$3.f()) {
         $$2.at();
      }
   }

   @Override
   public boolean bi() {
      return !this.j().a(this.dW().a()) || super.bi();
   }

   @Override
   protected boolean aF() {
      return this.j <= 0 ? true : this.af % 10 == 0;
   }

   @Override
   public final boolean b(btb $$0) {
      return this.d($$0) ? false : this.j().a($$0);
   }

   @Override
   public final boolean a(arp $$0, btb $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.N().b(dfi.c) && $$1.d() instanceof bvj) {
         return false;
      } else if (!this.j().a($$1)) {
         return false;
      } else {
         this.bD();
         this.j = (int)((float)this.j - $$2);
         this.a(ear.o, $$1.d());
         if (this.j <= 0) {
            this.j().a(this);
            this.at();
         }

         return true;
      }
   }

   @Override
   public boolean a(dfe $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void b(ul $$0) {
      $$0.a("Health", (short)this.j);
      $$0.a("Age", (short)this.h);
      $$0.a("PickupDelay", (short)this.i);
      if (this.k != null) {
         $$0.a("Thrower", this.k);
      }

      if (this.m != null) {
         $$0.a("Owner", this.m);
      }

      if (!this.j().f()) {
         $$0.a("Item", this.j().a(this.dX()));
      }
   }

   @Override
   public void a(ul $$0) {
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
         ul $$1 = $$0.p("Item");
         this.a(cwm.a(this.dX(), (vi)$$1).orElse(cwm.k));
      } else {
         this.a(cwm.k);
      }

      if (this.j().f()) {
         this.at();
      }
   }

   @Override
   public void a_(cou $$0) {
      if (!this.dV().C) {
         cwm $$1 = this.j();
         cwi $$2 = $$1.h();
         int $$3 = $$1.L();
         if (this.i == 0 && (this.m == null || this.m.equals($$0.cG())) && $$0.gg().f($$1)) {
            $$0.a(this, $$3);
            if ($$1.f()) {
               this.at();
               $$1.e($$3);
            }

            $$0.a(awx.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public xj al() {
      xj $$0 = this.an();
      return $$0 != null ? $$0 : this.j().z();
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Nullable
   @Override
   public bul b(est $$0) {
      bul $$1 = super.b($$0);
      if (!this.dV().C && $$1 instanceof clc $$2) {
         $$2.A();
      }

      return $$1;
   }

   public cwm j() {
      return this.au().a(c);
   }

   public void a(cwm $$0) {
      this.au().a(c, $$0);
   }

   @Override
   public void a(akm<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.j().a((bul)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.m = $$0;
   }

   public void b(bul $$0) {
      this.k = $$0.cG();
      this.l = $$0;
   }

   public int l() {
      return this.h;
   }

   public void n() {
      this.i = 10;
   }

   public void q() {
      this.i = 0;
   }

   public void s() {
      this.i = 32767;
   }

   public void b(int $$0) {
      this.i = $$0;
   }

   public boolean t() {
      return this.i > 0;
   }

   public void u() {
      this.h = -32768;
   }

   public void v() {
      this.h = -6000;
   }

   public void w() {
      this.s();
      this.h = 5999;
   }

   public static float e(float $$0, float $$1) {
      return $$0 / 20.0F + $$1;
   }

   public clc x() {
      return new clc(this);
   }

   @Override
   public awo dm() {
      return awo.i;
   }

   @Override
   public float dM() {
      return 180.0F - e((float)this.l() + 0.5F, this.b) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public bvz a_(int $$0) {
      return $$0 == 0 ? bvz.a(this::j, this::a) : super.a_($$0);
   }
}
