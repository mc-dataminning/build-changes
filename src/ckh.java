import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class ckh extends btr implements bvl {
   private static final akh<cvs> d = akl.a(ckh.class, akj.h);
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
   private btr m;
   @Nullable
   private UUID n;
   public final float c;

   public ckh(bty<? extends ckh> $$0, dej $$1) {
      super($$0, $$1);
      this.c = this.af.i() * (float) Math.PI * 2.0F;
      this.v(this.af.i() * 360.0F);
   }

   public ckh(dej $$0, double $$1, double $$2, double $$3, cvs $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.z.j() * 0.2 - 0.1, 0.2, $$0.z.j() * 0.2 - 0.1);
   }

   public ckh(dej $$0, double $$1, double $$2, double $$3, cvs $$4, double $$5, double $$6, double $$7) {
      this(bty.ag, $$0);
      this.a_($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private ckh(ckh $$0) {
      super($$0.ao(), $$0.dS());
      this.a($$0.m().u());
      this.w($$0);
      this.i = $$0.i;
      this.c = $$0.c;
   }

   @Override
   public boolean bg() {
      return this.m().a(axe.bf);
   }

   @Nullable
   @Override
   public btr s() {
      if (this.m != null && !this.m.dN()) {
         return this.m;
      } else if (this.l != null && this.dS() instanceof arj $$0) {
         this.m = $$0.a(this.l);
         return this.m;
      } else {
         return null;
      }
   }

   @Override
   public void x(btr $$0) {
      super.x($$0);
      if ($$0 instanceof ckh $$1) {
         this.m = $$1.m;
      }
   }

   @Override
   protected btr.b bf() {
      return btr.b.a;
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(d, cvs.k);
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   @Override
   public void l() {
      if (this.m().f()) {
         this.as();
      } else {
         super.l();
         if (this.j > 0 && this.j != 32767) {
            this.j--;
         }

         this.L = this.dx();
         this.M = this.dz();
         this.N = this.dD();
         eyw $$0 = this.dv();
         if (this.bi() && this.b(axb.a) > 0.1F) {
            this.B();
         } else if (this.bw() && this.b(axb.b) > 0.1F) {
            this.C();
         } else {
            this.be();
         }

         if (this.dS().B) {
            this.ae = false;
         } else {
            this.ae = !this.dS().a(this, this.cO().h(1.0E-7));
            if (this.ae) {
               this.m(this.dx(), (this.cO().b + this.cO().e) / 2.0, this.dD());
            }
         }

         if (!this.aH() || this.dv().j() > 1.0E-5F || (this.ag + this.ap()) % 4 == 0) {
            this.a(bur.a, this.dv());
            if (!this.dS().x_()) {
               this.aI();
            }

            float $$1 = 0.98F;
            if (this.aH()) {
               $$1 = this.dS().a_(this.aO()).b().g() * 0.98F;
            }

            this.h(this.dv().d((double)$$1, 0.98, (double)$$1));
            if (this.aH()) {
               eyw $$2 = this.dv();
               if ($$2.e < 0.0) {
                  this.h($$2.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$3 = azf.a(this.L) != azf.a(this.dx()) || azf.a(this.M) != azf.a(this.dz()) || azf.a(this.N) != azf.a(this.dD());
         int $$4 = $$3 ? 2 : 40;
         if (this.ag % $$4 == 0 && !this.dS().B && this.E()) {
            this.D();
         }

         if (this.i != -32768) {
            this.i++;
         }

         this.as = this.as | this.bp();
         if (!this.dS().B) {
            double $$5 = this.dv().d($$0).h();
            if ($$5 > 0.01) {
               this.as = true;
            }
         }

         if (!this.dS().B && this.i >= 6000) {
            this.as();
         }
      }
   }

   @Override
   public jf aO() {
      return this.e(0.999999F);
   }

   private void B() {
      eyw $$0 = this.dv();
      this.n($$0.d * 0.99F, $$0.e + (double)($$0.e < 0.06F ? 5.0E-4F : 0.0F), $$0.f * 0.99F);
   }

   private void C() {
      eyw $$0 = this.dv();
      this.n($$0.d * 0.95F, $$0.e + (double)($$0.e < 0.06F ? 5.0E-4F : 0.0F), $$0.f * 0.95F);
   }

   private void D() {
      if (this.E()) {
         for (ckh $$1 : this.dS().a(ckh.class, this.cO().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.E())) {
            if ($$1.E()) {
               this.a($$1);
               if (this.dN()) {
                  break;
               }
            }
         }
      }
   }

   private boolean E() {
      cvs $$0 = this.m();
      return this.bI() && this.j != 32767 && this.i != -32768 && this.i < 6000 && $$0.K() < $$0.k();
   }

   private void a(ckh $$0) {
      cvs $$1 = this.m();
      cvs $$2 = $$0.m();
      if (Objects.equals(this.n, $$0.n) && a($$1, $$2)) {
         if ($$2.K() < $$1.K()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }
      }
   }

   public static boolean a(cvs $$0, cvs $$1) {
      return $$1.K() + $$0.K() > $$1.k() ? false : cvs.c($$0, $$1);
   }

   public static cvs a(cvs $$0, cvs $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.K(), $$1.K());
      cvs $$4 = $$0.c($$0.K() + $$3);
      $$1.h($$3);
      return $$4;
   }

   private static void a(ckh $$0, cvs $$1, cvs $$2) {
      cvs $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(ckh $$0, cvs $$1, ckh $$2, cvs $$3) {
      a($$0, $$1, $$3);
      $$0.j = Math.max($$0.j, $$2.j);
      $$0.i = Math.min($$0.i, $$2.i);
      if ($$3.f()) {
         $$2.as();
      }
   }

   @Override
   public boolean bh() {
      return this.m().b(ks.z) || super.bh();
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.dS().ac().b(def.c) && $$0.d() instanceof bup) {
         return false;
      } else if (!this.m().f() && this.m().a(cvw.uu) && $$0.a(awx.l)) {
         return false;
      } else if (!this.m().a($$0)) {
         return false;
      } else if (this.dS().B) {
         return true;
      } else {
         this.bA();
         this.k = (int)((float)this.k - $$1);
         this.a(dzp.o, $$0.d());
         if (this.k <= 0) {
            this.m().a(this);
            this.as();
         }

         return true;
      }
   }

   @Override
   public boolean a(deb $$0) {
      return $$0.g() ? super.a($$0) : true;
   }

   @Override
   public void b(ug $$0) {
      $$0.a("Health", (short)this.k);
      $$0.a("Age", (short)this.i);
      $$0.a("PickupDelay", (short)this.j);
      if (this.l != null) {
         $$0.a("Thrower", this.l);
      }

      if (this.n != null) {
         $$0.a("Owner", this.n);
      }

      if (!this.m().f()) {
         $$0.a("Item", this.m().a(this.dU()));
      }
   }

   @Override
   public void a(ug $$0) {
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
         ug $$1 = $$0.p("Item");
         this.a(cvs.a(this.dU(), (vd)$$1).orElse(cvs.k));
      } else {
         this.a(cvs.k);
      }

      if (this.m().f()) {
         this.as();
      }
   }

   @Override
   public void b_(cnx $$0) {
      if (!this.dS().B) {
         cvs $$1 = this.m();
         cvn $$2 = $$1.h();
         int $$3 = $$1.K();
         if (this.j == 0 && (this.n == null || this.n.equals($$0.cD())) && $$0.gd().f($$1)) {
            $$0.a(this, $$3);
            if ($$1.f()) {
               this.as();
               $$1.e($$3);
            }

            $$0.a(awq.e.b($$2), $$3);
            $$0.a(this);
         }
      }
   }

   @Override
   public xe aj() {
      xe $$0 = this.al();
      return (xe)($$0 != null ? $$0 : xe.c(this.m().v()));
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Nullable
   @Override
   public btr b(err $$0) {
      btr $$1 = super.b($$0);
      if (!this.dS().B && $$1 instanceof ckh $$2) {
         $$2.D();
      }

      return $$1;
   }

   public cvs m() {
      return this.at().a(d);
   }

   public void a(cvs $$0) {
      this.at().a(d, $$0);
   }

   @Override
   public void a(akh<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.m().a((btr)this);
      }
   }

   public void b(@Nullable UUID $$0) {
      this.n = $$0;
   }

   public void b(btr $$0) {
      this.l = $$0.cD();
      this.m = $$0;
   }

   public int o() {
      return this.i;
   }

   public void q() {
      this.j = 10;
   }

   public void t() {
      this.j = 0;
   }

   public void v() {
      this.j = 32767;
   }

   public void b(int $$0) {
      this.j = $$0;
   }

   public boolean w() {
      return this.j > 0;
   }

   @Override
   public void x() {
      this.i = -32768;
   }

   public void y() {
      this.i = -6000;
   }

   public void z() {
      this.v();
      this.i = 5999;
   }

   public static float e(float $$0, float $$1) {
      return $$0 / 20.0F + $$1;
   }

   public ckh A() {
      return new ckh(this);
   }

   @Override
   public awh di() {
      return awh.i;
   }

   @Override
   public float dJ() {
      return 180.0F - e((float)this.o() + 0.5F, this.c) / (float) (Math.PI * 2) * 360.0F;
   }

   @Override
   public bve a_(int $$0) {
      return $$0 == 0 ? bve.a(this::m, this::a) : super.a_($$0);
   }
}
