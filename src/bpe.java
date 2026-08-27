import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bpe extends bzx implements bop {
   protected static final aie<Byte> bT = aih.a(bpe.class, aig.a);
   protected static final aie<Optional<UUID>> bU = aih.a(bpe.class, aig.q);
   private boolean bW;

   protected bpe(bnw<? extends bpe> $$0, cvr $$1) {
      super($$0, $$1);
      this.w();
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bT, (byte)0);
      this.am.a(bU, Optional.empty());
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      $$0.a("Sitting", this.bW);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = asn.a(this.cL(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.x(true);
         } catch (Throwable var4) {
            this.x(false);
         }
      }

      this.bW = $$0.q("Sitting");
      this.y(this.bW);
   }

   @Override
   public boolean a(chl $$0) {
      return !this.fU();
   }

   protected void w(boolean $$0) {
      jx $$1 = jz.O;
      if (!$$0) {
         $$1 = jz.ab;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
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

   @Override
   public boolean u() {
      return (this.am.b(bT) & 4) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.b(bT);
      if ($$0) {
         this.am.b(bT, (byte)($$1 | 4));
      } else {
         this.am.b(bT, (byte)($$1 & -5));
      }

      this.w();
   }

   protected void w() {
   }

   public boolean A() {
      return (this.am.b(bT) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.am.b(bT);
      if ($$0) {
         this.am.b(bT, (byte)($$1 | 1));
      } else {
         this.am.b(bT, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID d() {
      return this.am.b(bU).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.am.b(bU, Optional.ofNullable($$0));
   }

   public void f(chl $$0) {
      this.x(true);
      this.b($$0.cw());
      if ($$0 instanceof aox) {
         am.y.a((aox)$$0, this);
      }
   }

   @Override
   public boolean c(boi $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(boi $$0) {
      return $$0 == this.R_();
   }

   public boolean a(boi $$0, boi $$1) {
      return true;
   }

   @Override
   public eoy cg() {
      if (this.u()) {
         boi $$0 = this.R_();
         if ($$0 != null) {
            return $$0.cg();
         }
      }

      return super.cg();
   }

   @Override
   public boolean r(bnq $$0) {
      if (this.u()) {
         boi $$1 = this.R_();
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
   public void a(bmp $$0) {
      if (!this.dM().B && this.dM().Z().b(cvn.n) && this.R_() instanceof aox) {
         this.R_().a(this.eL().a());
      }

      super.a($$0);
   }

   public boolean gg() {
      return this.bW;
   }

   public void z(boolean $$0) {
      this.bW = $$0;
   }
}
