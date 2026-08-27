import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bpt extends cam implements bpe {
   protected static final aii<Byte> bV = ail.a(bpt.class, aik.a);
   protected static final aii<Optional<UUID>> bW = ail.a(bpt.class, aik.q);
   private boolean bY;

   protected bpt(bol<? extends bpt> $$0, cwe $$1) {
      super($$0, $$1);
      this.w();
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bV, (byte)0);
      this.am.a(bW, Optional.empty());
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      $$0.a("Sitting", this.bY);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = asr.a(this.cI(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.x(true);
         } catch (Throwable var4) {
            this.x(false);
         }
      }

      this.bY = $$0.q("Sitting");
      this.y(this.bY);
   }

   @Override
   public boolean a(cia $$0) {
      return !this.fZ();
   }

   protected void w(boolean $$0) {
      jz $$1 = kb.O;
      if (!$$0) {
         $$1 = kb.ab;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dJ().a($$1, this.d(1.0), this.dr() + 0.5, this.g(1.0), $$3, $$4, $$5);
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

   @Override
   public boolean u() {
      return (this.am.b(bV) & 4) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.b(bV);
      if ($$0) {
         this.am.b(bV, (byte)($$1 | 4));
      } else {
         this.am.b(bV, (byte)($$1 & -5));
      }

      this.w();
   }

   protected void w() {
   }

   public boolean A() {
      return (this.am.b(bV) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.am.b(bV);
      if ($$0) {
         this.am.b(bV, (byte)($$1 | 1));
      } else {
         this.am.b(bV, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID d() {
      return this.am.b(bW).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.am.b(bW, Optional.ofNullable($$0));
   }

   public void f(cia $$0) {
      this.x(true);
      this.b($$0.ct());
      if ($$0 instanceof apb) {
         am.y.a((apb)$$0, this);
      }
   }

   @Override
   public boolean c(box $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(box $$0) {
      return $$0 == this.R_();
   }

   public boolean a(box $$0, box $$1) {
      return true;
   }

   @Override
   public epu cd() {
      if (this.u()) {
         box $$0 = this.R_();
         if ($$0 != null) {
            return $$0.cd();
         }
      }

      return super.cd();
   }

   @Override
   public boolean r(bof $$0) {
      if (this.u()) {
         box $$1 = this.R_();
         if ($$0 == $$1) {
            return true;
         }

         if ($$1 != null) {
            return $$1.r($$0);
         }
      }

      return super.r($$0);
   }

   @Override
   public void a(bne $$0) {
      if (!this.dJ().B && this.dJ().Z().b(cwa.n) && this.R_() instanceof apb) {
         this.R_().a(this.eJ().a());
      }

      super.a($$0);
   }

   public boolean gl() {
      return this.bY;
   }

   public void z(boolean $$0) {
      this.bY = $$0;
   }
}
