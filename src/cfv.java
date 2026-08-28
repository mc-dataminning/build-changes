import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cfv extends btc {
   protected static final int cc = 6000;
   private int bZ;
   @Nullable
   private UUID ca;

   protected cfv(btq<? extends cfv> $$0, dds $$1) {
      super($$0, $$1);
      this.a(eqs.n, 16.0F);
      this.a(eqs.o, -1.0F);
   }

   public static bvl.a gt() {
      return buh.E().a(bvm.E, 10.0);
   }

   @Override
   protected void ad() {
      if (this.g() != 0) {
         this.bZ = 0;
      }

      super.ad();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.g() != 0) {
         this.bZ = 0;
      }

      if (this.bZ > 0) {
         this.bZ--;
         if (this.bZ % 10 == 0) {
            double $$0 = this.af.k() * 0.02;
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            this.dS().a(ln.Q, this.d(1.0), this.dA() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void f(bsb $$0, float $$1) {
      this.gz();
      super.f($$0, $$1);
   }

   @Override
   public float a(je $$0, ddv $$1) {
      return $$1.a_($$0.e()).a(dgx.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("InLove", this.bZ);
      if (this.ca != null) {
         $$0.a("LoveCause", this.ca);
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.bZ = $$0.h("InLove");
      this.ca = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(btq<? extends cfv> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      boolean $$5 = btp.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(aws.bX) && $$5;
   }

   protected static boolean a(dcu $$0, je $$1) {
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

   public abstract boolean p(cvl var1);

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if (this.p($$2)) {
         int $$3 = this.g();
         if (!this.dS().B && $$3 == 0 && this.gv()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gu();
            return brk.b;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gu();
            return brk.a;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gu() {
   }

   protected void a(cnp $$0, brj $$1, cvl $$2) {
      $$2.a(1, $$0);
   }

   public boolean gv() {
      return this.bZ <= 0;
   }

   public void f(@Nullable cnp $$0) {
      this.bZ = 600;
      if ($$0 != null) {
         this.ca = $$0.cD();
      }

      this.dS().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.bZ = $$0;
   }

   public int gw() {
      return this.bZ;
   }

   @Nullable
   public arh gx() {
      if (this.ca == null) {
         return null;
      } else {
         cnp $$0 = this.dS().b(this.ca);
         return $$0 instanceof arh ? (arh)$$0 : null;
      }
   }

   public boolean gy() {
      return this.bZ > 0;
   }

   public void gz() {
      this.bZ = 0;
   }

   public boolean a(cfv $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gy() && $$0.gy();
      }
   }

   public void a(arg $$0, cfv $$1) {
      btc $$2 = this.a($$0, (btc)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dx(), this.dz(), this.dD(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(arg $$0, cfv $$1, @Nullable btc $$2) {
      Optional.ofNullable(this.gx()).or(() -> Optional.ofNullable($$1.gx())).ifPresent($$2x -> {
         $$2x.a(awn.P);
         an.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gz();
      $$1.gz();
      $$0.a(this, (byte)18);
      if ($$0.ac().b(ddo.f)) {
         $$0.b(new btv($$0, this.dx(), this.dz(), this.dD(), this.dV().a(7) + 1));
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
