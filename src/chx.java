import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class chx extends bvb {
   protected static final int cc = 6000;
   private int bZ;
   @Nullable
   private UUID ca;

   protected chx(bvr<? extends chx> $$0, dhi $$1) {
      super($$0, $$1);
      this.a(euo.n, 16.0F);
      this.a(euo.o, -1.0F);
   }

   public static bxn.a gt() {
      return bwi.C().a(bxo.E, 10.0);
   }

   @Override
   protected void a(ash $$0) {
      if (this.Z_() != 0) {
         this.bZ = 0;
      }

      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.Z_() != 0) {
         this.bZ = 0;
      }

      if (this.bZ > 0) {
         this.bZ--;
         if (this.bZ % 10 == 0) {
            double $$0 = this.ae.k() * 0.02;
            double $$1 = this.ae.k() * 0.02;
            double $$2 = this.ae.k() * 0.02;
            this.dW().a(ls.Q, this.d(1.0), this.dE() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(ash $$0, bua $$1, float $$2) {
      this.gz();
      super.b($$0, $$1, $$2);
   }

   @Override
   public float a(jh $$0, dhl $$1) {
      return $$1.a_($$0.e()).a(dko.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("InLove", this.bZ);
      if (this.ca != null) {
         $$0.a("LoveCause", this.ca);
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.bZ = $$0.h("InLove");
      this.ca = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bvr<? extends chx> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      boolean $$5 = bvq.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(axu.bY) && $$5;
   }

   protected static boolean a(dgk $$0, jh $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected int e(ash $$0) {
      return 1 + this.ae.a(3);
   }

   public abstract boolean j(cxp var1);

   @Override
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if (this.j($$2)) {
         int $$3 = this.Z_();
         if (!this.dW().C && $$3 == 0 && this.gv()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gu();
            return btj.b;
         }

         if (this.e_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gu();
            return btj.a;
         }

         if (this.dW().C) {
            return btj.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gu() {
   }

   protected void a(cpx $$0, bti $$1, cxp $$2) {
      int $$3 = $$2.L();
      dav $$4 = $$2.a(ku.y);
      $$2.a(1, $$0);
      if ($$4 != null) {
         cxp $$5 = $$4.a($$2, $$3, $$0.fV(), $$0::b);
         $$0.a($$1, $$5);
      }
   }

   public boolean gv() {
      return this.bZ <= 0;
   }

   public void f(@Nullable cpx $$0) {
      this.bZ = 600;
      if ($$0 != null) {
         this.ca = $$0.cG();
      }

      this.dW().a(this, (byte)18);
   }

   public void r(int $$0) {
      this.bZ = $$0;
   }

   public int gw() {
      return this.bZ;
   }

   @Nullable
   public asi gx() {
      if (this.ca == null) {
         return null;
      } else {
         cpx $$0 = this.dW().b(this.ca);
         return $$0 instanceof asi ? (asi)$$0 : null;
      }
   }

   public boolean gy() {
      return this.bZ > 0;
   }

   public void gz() {
      this.bZ = 0;
   }

   public boolean a(chx $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gy() && $$0.gy();
      }
   }

   public void a(ash $$0, chx $$1) {
      bvb $$2 = this.a($$0, (bvb)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dB(), this.dD(), this.dH(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(ash $$0, chx $$1, @Nullable bvb $$2) {
      Optional.ofNullable(this.gx()).or(() -> Optional.ofNullable($$1.gx())).ifPresent($$2x -> {
         $$2x.a(axp.P);
         ao.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gz();
      $$1.gz();
      $$0.a(this, (byte)18);
      if ($$0.N().b(dhe.f)) {
         $$0.b(new bvw($$0, this.dB(), this.dD(), this.dH(), this.dZ().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ae.k() * 0.02;
            double $$3 = this.ae.k() * 0.02;
            double $$4 = this.ae.k() * 0.02;
            this.dW().a(ls.Q, this.d(1.0), this.dE() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
