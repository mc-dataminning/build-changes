import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bng extends bxy implements bmt {
   protected static final agm<Byte> bT = agp.a(bng.class, ago.a);
   protected static final agm<Optional<UUID>> bU = agp.a(bng.class, ago.q);
   private boolean bW;

   protected bng(blz<? extends bng> $$0, ctp $$1) {
      super($$0, $$1);
      this.w();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bT, (byte)0);
      this.an.a(bU, Optional.empty());
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      $$0.a("Sitting", this.bW);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = aqu.a(this.cL(), $$2);
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
   public boolean a(cfi $$0) {
      return !this.fS();
   }

   protected void w(boolean $$0) {
      jv $$1 = jx.O;
      if (!$$0) {
         $$1 = jx.ab;
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

   @Override
   public boolean u() {
      return (this.an.b(bT) & 4) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.an.b(bT);
      if ($$0) {
         this.an.b(bT, (byte)($$1 | 4));
      } else {
         this.an.b(bT, (byte)($$1 & -5));
      }

      this.w();
   }

   protected void w() {
   }

   public boolean A() {
      return (this.an.b(bT) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.an.b(bT);
      if ($$0) {
         this.an.b(bT, (byte)($$1 | 1));
      } else {
         this.an.b(bT, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID d() {
      return this.an.b(bU).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   public void f(cfi $$0) {
      this.x(true);
      this.b($$0.cw());
      if ($$0 instanceof ane) {
         am.y.a((ane)$$0, this);
      }
   }

   @Override
   public boolean c(bml $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bml $$0) {
      return $$0 == this.R_();
   }

   public boolean a(bml $$0, bml $$1) {
      return true;
   }

   @Override
   public ems cg() {
      if (this.u()) {
         bml $$0 = this.R_();
         if ($$0 != null) {
            return $$0.cg();
         }
      }

      return super.cg();
   }

   @Override
   public boolean s(blv $$0) {
      if (this.u()) {
         bml $$1 = this.R_();
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
   public void a(bkt $$0) {
      if (!this.dM().B && this.dM().Z().b(ctl.n) && this.R_() instanceof ane) {
         this.R_().a(this.eK().a());
      }

      super.a($$0);
   }

   public boolean ge() {
      return this.bW;
   }

   public void z(boolean $$0) {
      this.bW = $$0;
   }
}
