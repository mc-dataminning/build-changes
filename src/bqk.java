import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bqk extends cbd implements bpv {
   protected static final aim<Byte> bX = aiq.a(bqk.class, aio.a);
   protected static final aim<Optional<UUID>> bY = aiq.a(bqk.class, aio.q);
   private boolean ca;

   protected bqk(bpc<? extends bqk> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(bX, (byte)0);
      $$0.a(bY, Optional.empty());
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      $$0.a("Sitting", this.ca);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = ata.a(this.cL(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.b(true, false);
         } catch (Throwable var4) {
            this.b(false, true);
         }
      }

      this.ca = $$0.q("Sitting");
      this.x(this.ca);
   }

   @Override
   public boolean a(cis $$0) {
      return !this.gb();
   }

   protected void w(boolean $$0) {
      ka $$1 = kc.P;
      if (!$$0) {
         $$1 = kc.ac;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dM().a($$1, this.d(1.0), this.du() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 7) {
         this.w(true);
      } else if ($$0 == 6) {
         this.w(false);
      } else {
         super.b($$0);
      }
   }

   public boolean r() {
      return (this.an.a(bX) & 4) != 0;
   }

   public void b(boolean $$0, boolean $$1) {
      byte $$2 = this.an.a(bX);
      if ($$0) {
         this.an.a(bX, (byte)($$2 | 4));
      } else {
         this.an.a(bX, (byte)($$2 & -5));
      }

      if ($$1) {
         this.s();
      }
   }

   protected void s() {
   }

   public boolean y() {
      return (this.an.a(bX) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.an.a(bX);
      if ($$0) {
         this.an.a(bX, (byte)($$1 | 1));
      } else {
         this.an.a(bX, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID d() {
      return this.an.a(bY).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.an.a(bY, Optional.ofNullable($$0));
   }

   public void f(cis $$0) {
      this.b(true, true);
      this.b($$0.cw());
      if ($$0 instanceof apg) {
         am.y.a((apg)$$0, this);
      }
   }

   @Override
   public boolean c(bpo $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bpo $$0) {
      return $$0 == this.P_();
   }

   public boolean a(bpo $$0, bpo $$1) {
      return true;
   }

   @Override
   public eqq cg() {
      if (this.r()) {
         bpo $$0 = this.P_();
         if ($$0 != null) {
            return $$0.cg();
         }
      }

      return super.cg();
   }

   @Override
   public boolean s(bow $$0) {
      if (this.r()) {
         bpo $$1 = this.P_();
         if ($$0 == $$1) {
            return true;
         }

         if ($$1 != null) {
            return $$1.s($$0);
         }
      }

      return super.s($$0);
   }

   @Override
   public void a(bnv $$0) {
      if (!this.dM().B && this.dM().Z().b(cwv.n) && this.P_() instanceof apg) {
         this.P_().a(this.eM().a());
      }

      super.a($$0);
   }

   public boolean gn() {
      return this.ca;
   }

   public void y(boolean $$0) {
      this.ca = $$0;
   }
}
