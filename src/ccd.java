import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ccd extends bpp {
   protected static final int bZ = 6000;
   private int bX;
   @Nullable
   private UUID bY;

   protected ccd(bqb<? extends ccd> $$0, cyx $$1) {
      super($$0, $$1);
      this.a(elj.n, 16.0F);
      this.a(elj.o, -1.0F);
   }

   @Override
   protected void Y() {
      if (this.g() != 0) {
         this.bX = 0;
      }

      super.Y();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.g() != 0) {
         this.bX = 0;
      }

      if (this.bX > 0) {
         this.bX--;
         if (this.bX % 10 == 0) {
            double $$0 = this.ag.k() * 0.02;
            double $$1 = this.ag.k() * 0.02;
            double $$2 = this.ag.k() * 0.02;
            this.dM().a(kl.P, this.d(1.0), this.du() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bX = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(ib $$0, cza $$1) {
      return $$1.a_($$0.d()).a(dca.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("InLove", this.bX);
      if (this.bY != null) {
         $$0.a("LoveCause", this.bY);
      }
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.bX = $$0.h("InLove");
      this.bY = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bqb<? extends ccd> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      boolean $$5 = bqs.b($$2) || a($$1, $$3);
      return $$1.a_($$3.d()).a(avc.bQ) && $$5;
   }

   protected static boolean a(cya $$0, ib $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int O() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public int eg() {
      return 1 + this.dM().z.a(3);
   }

   public boolean o(crj $$0) {
      return $$0.a(crm.pv);
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if (this.o($$2)) {
         int $$3 = this.g();
         if (!this.dM().B && $$3 == 0 && this.go()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return boa.a;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return boa.a(this.dM().B);
         }

         if (this.dM().B) {
            return boa.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cjt $$0, bnz $$1, crj $$2) {
      $$2.a(1, $$0);
   }

   public boolean go() {
      return this.bX <= 0;
   }

   public void g(@Nullable cjt $$0) {
      this.bX = 600;
      if ($$0 != null) {
         this.bY = $$0.cw();
      }

      this.dM().a(this, (byte)18);
   }

   public void t(int $$0) {
      this.bX = $$0;
   }

   public int gp() {
      return this.bX;
   }

   @Nullable
   public apt gq() {
      if (this.bY == null) {
         return null;
      } else {
         cjt $$0 = this.dM().b(this.bY);
         return $$0 instanceof apt ? (apt)$$0 : null;
      }
   }

   public boolean gr() {
      return this.bX > 0;
   }

   public void gs() {
      this.bX = 0;
   }

   public boolean a(ccd $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gr() && $$0.gr();
      }
   }

   public void a(aps $$0, ccd $$1) {
      bpp $$2 = this.a($$0, (bpp)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dr(), this.dt(), this.dx(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(aps $$0, ccd $$1, @Nullable bpp $$2) {
      Optional.ofNullable(this.gq()).or(() -> Optional.ofNullable($$1.gq())).ifPresent($$2x -> {
         $$2x.a(auw.P);
         am.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gs();
      $$1.gs();
      $$0.a(this, (byte)18);
      if ($$0.aa().b(cyt.f)) {
         $$0.b(new bqe($$0, this.dr(), this.dt(), this.dx(), this.ei().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = this.ag.k() * 0.02;
            this.dM().a(kl.P, this.d(1.0), this.du() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
