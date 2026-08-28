import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class clu extends clt {
   private static final alc<cxp> e = alg.a(clu.class, ale.h);
   private static final alc<Integer> f = alg.a(clu.class, ale.b);
   public static final int d = 8;
   private static final float g = 0.0625F;
   private static final float h = 0.75F;
   private static final float i = 0.75F;
   private float j = 1.0F;
   private boolean k;

   public clu(bvr<? extends clu> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public clu(dhi $$0, jh $$1, jm $$2) {
      this(bvr.at, $$0, $$1, $$2);
   }

   public clu(bvr<? extends clu> $$0, dhi $$1, jh $$2, jm $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(e, cxp.j);
      $$0.a(f, 0);
   }

   @Override
   protected void a(jm $$0) {
      Validate.notNull($$0);
      this.c = $$0;
      if ($$0.o().d()) {
         this.w(0.0F);
         this.v((float)(this.c.e() * 90));
      } else {
         this.w((float)(-90 * $$0.f().a()));
         this.v(0.0F);
      }

      this.O = this.dO();
      this.N = this.dM();
      this.l();
   }

   @Override
   protected fbt a(jh $$0, jm $$1) {
      float $$2 = 0.46875F;
      fby $$3 = fby.b($$0).a($$1, -0.46875);
      jm.a $$4 = $$1.o();
      double $$5 = $$4 == jm.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jm.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jm.a.c ? 0.0625 : 0.75;
      return fbt.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean m() {
      if (this.k) {
         return true;
      } else if (!this.dW().g(this)) {
         return false;
      } else {
         dxv $$0 = this.dW().a_(this.a.a(this.c.g()));
         return $$0.e() || this.c.o().d() && dmq.n($$0) ? this.dW().a(this, this.cR(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bwk $$0, fby $$1) {
      if (!this.k) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.k) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public void c(ash $$0) {
      this.c(this.A());
      super.c($$0);
   }

   private boolean a(bua $$0) {
      return !$$0.a(axw.l) && !this.A().f();
   }

   private static boolean e(bua $$0) {
      return $$0.a(axw.d) || $$0.h();
   }

   @Override
   public boolean b(bua $$0) {
      return this.k && !e($$0) ? false : !this.d($$0);
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (!this.k) {
         if (this.d($$1)) {
            return false;
         } else if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(ecr.c, $$1.d());
            this.a(this.s(), 1.0F, 1.0F);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         return e($$1) && super.a($$0, $$1, $$2);
      }
   }

   public axe s() {
      return axf.nR;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(ash $$0, @Nullable bvk $$1) {
      this.a(this.t(), 1.0F, 1.0F);
      this.a($$0, $$1, true);
      this.a(ecr.c, $$1);
   }

   public axe t() {
      return axf.nP;
   }

   @Override
   public void z() {
      this.a(this.u(), 1.0F, 1.0F);
   }

   public axe u() {
      return axf.nQ;
   }

   private void a(ash $$0, @Nullable bvk $$1, boolean $$2) {
      if (!this.k) {
         cxp $$3 = this.A();
         this.b(cxp.j);
         if (!$$0.N().b(dhe.i)) {
            if ($$1 == null) {
               this.c($$3);
            }
         } else {
            if ($$1 instanceof cpx $$4 && $$4.fV()) {
               this.c($$3);
               return;
            }

            if ($$2) {
               this.a($$0, this.x());
            }

            if (!$$3.f()) {
               $$3 = $$3.v();
               this.c($$3);
               if (this.ae.i() < this.j) {
                  this.a($$0, $$3);
               }
            }
         }
      }
   }

   private void c(cxp $$0) {
      evp $$1 = this.a($$0);
      if ($$1 != null) {
         evr $$2 = cyc.a($$1, this.dW());
         if ($$2 != null) {
            $$2.a(this.a, this.ar());
         }
      }

      $$0.a(null);
   }

   public cxp A() {
      return this.au().a(e);
   }

   @Nullable
   public evp a(cxp $$0) {
      return $$0.a(ku.L);
   }

   public boolean B() {
      return this.A().b(ku.L);
   }

   public void b(cxp $$0) {
      this.a($$0, true);
   }

   public void a(cxp $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.au().a(e, $$0);
      if (!$$0.f()) {
         this.a(this.v(), 1.0F, 1.0F);
      }

      if ($$1 && this.a != null) {
         this.dW().c(this.a, dko.a);
      }
   }

   public axe v() {
      return axf.nO;
   }

   @Override
   public bwy a_(int $$0) {
      return $$0 == 0 ? bwy.a(this::A, this::b) : super.a_($$0);
   }

   @Override
   public void a(alc<?> $$0) {
      if ($$0.equals(e)) {
         this.d(this.A());
      }
   }

   private void d(cxp $$0) {
      if (!$$0.f() && $$0.H() != this) {
         $$0.a(this);
      }

      this.l();
   }

   public int C() {
      return this.au().a(f);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.au().a(f, $$0 % 8);
      if ($$1 && this.a != null) {
         this.dW().c(this.a, dko.a);
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (!this.A().f()) {
         $$0.a("Item", this.A().a(this.dY()));
         $$0.a("ItemRotation", (byte)this.C());
         $$0.a("ItemDropChance", this.j);
      }

      $$0.a("Facing", (byte)this.c.d());
      $$0.a("Invisible", this.cp());
      $$0.a("Fixed", this.k);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      cxp $$2;
      if ($$0.b("Item", 10)) {
         ux $$1 = $$0.p("Item");
         $$2 = cxp.a(this.dY(), (vu)$$1).orElse(cxp.j);
      } else {
         $$2 = cxp.j;
      }

      cxp $$4 = this.A();
      if (!$$4.f() && !cxp.a($$2, $$4)) {
         this.c($$4);
      }

      this.a($$2, false);
      if (!$$2.f()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.j = $$0.j("ItemDropChance");
         }
      }

      this.a(jm.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.k = $$0.q("Fixed");
   }

   @Override
   public btj a(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      boolean $$3 = !this.A().f();
      boolean $$4 = !$$2.f();
      if (this.k) {
         return btj.e;
      } else if (!$$0.dW().C) {
         if (!$$3) {
            if ($$4 && !this.dR()) {
               evr $$5 = cyc.b($$2, this.dW());
               if ($$5 != null && $$5.a(256)) {
                  return btj.d;
               } else {
                  this.b($$2);
                  this.a(ecr.c, $$0);
                  $$2.a(1, $$0);
                  return btj.a;
               }
            } else {
               return btj.e;
            }
         } else {
            this.a(this.w(), 1.0F, 1.0F);
            this.b(this.C() + 1);
            this.a(ecr.c, $$0);
            return btj.a;
         }
      } else {
         return (btj)(!$$3 && !$$4 ? btj.e : btj.a);
      }
   }

   public axe w() {
      return axf.nS;
   }

   public int D() {
      return this.A().f() ? 0 : this.C() % 8 + 1;
   }

   @Override
   public aac<acr> a(asf $$0) {
      return new acs(this, this.c.d(), this.p());
   }

   @Override
   public void a(acs $$0) {
      super.a($$0);
      this.a(jm.a($$0.p()));
   }

   @Override
   public cxp dJ() {
      cxp $$0 = this.A();
      return $$0.f() ? this.x() : $$0.v();
   }

   protected cxp x() {
      return new cxp(cxt.uS);
   }

   @Override
   public float dN() {
      jm $$0 = this.cO();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)bae.b(180 + $$0.e() * 90 + this.C() * 45 + $$1);
   }
}
