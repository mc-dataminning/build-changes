import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cga extends bth {
   protected static final int cb = 6000;
   private int bY;
   @Nullable
   private UUID bZ;

   protected cga(btv<? extends cga> $$0, deg $$1) {
      super($$0, $$1);
      this.a(erg.n, 16.0F);
      this.a(erg.o, -1.0F);
   }

   public static bvq.a gu() {
      return bum.E().a(bvr.E, 10.0);
   }

   @Override
   protected void ad() {
      if (this.g() != 0) {
         this.bY = 0;
      }

      super.ad();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.g() != 0) {
         this.bY = 0;
      }

      if (this.bY > 0) {
         this.bY--;
         if (this.bY % 10 == 0) {
            double $$0 = this.af.k() * 0.02;
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            this.dS().a(ln.Q, this.d(1.0), this.dA() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void f(bsg $$0, float $$1) {
      this.gA();
      super.f($$0, $$1);
   }

   @Override
   public float a(je $$0, dej $$1) {
      return $$1.a_($$0.e()).a(dhl.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("InLove", this.bY);
      if (this.bZ != null) {
         $$0.a("LoveCause", this.bZ);
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.bY = $$0.h("InLove");
      this.bZ = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(btv<? extends cga> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      boolean $$5 = btu.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(awt.bX) && $$5;
   }

   protected static boolean a(ddi $$0, je $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int T() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected int ek() {
      return 1 + this.dS().z.a(3);
   }

   public abstract boolean n(cvp var1);

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if (this.n($$2)) {
         int $$3 = this.g();
         if (!this.dS().B && $$3 == 0 && this.gw()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gv();
            return brp.b;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gv();
            return brp.a;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gv() {
   }

   protected void a(cnu $$0, bro $$1, cvp $$2) {
      $$2.a(1, $$0);
   }

   public boolean gw() {
      return this.bY <= 0;
   }

   public void f(@Nullable cnu $$0) {
      this.bY = 600;
      if ($$0 != null) {
         this.bZ = $$0.cD();
      }

      this.dS().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.bY = $$0;
   }

   public int gx() {
      return this.bY;
   }

   @Nullable
   public ari gy() {
      if (this.bZ == null) {
         return null;
      } else {
         cnu $$0 = this.dS().b(this.bZ);
         return $$0 instanceof ari ? (ari)$$0 : null;
      }
   }

   public boolean gz() {
      return this.bY > 0;
   }

   public void gA() {
      this.bY = 0;
   }

   public boolean a(cga $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gz() && $$0.gz();
      }
   }

   public void a(arh $$0, cga $$1) {
      bth $$2 = this.a($$0, (bth)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dx(), this.dz(), this.dD(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(arh $$0, cga $$1, @Nullable bth $$2) {
      Optional.ofNullable(this.gy()).or(() -> Optional.ofNullable($$1.gy())).ifPresent($$2x -> {
         $$2x.a(awo.P);
         an.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gA();
      $$1.gA();
      $$0.a(this, (byte)18);
      if ($$0.ac().b(dec.f)) {
         $$0.b(new bua($$0, this.dx(), this.dz(), this.dD(), this.dV().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = this.af.k() * 0.02;
            this.dS().a(ln.Q, this.d(1.0), this.dA() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
