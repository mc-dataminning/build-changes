import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bnj extends byc implements bmw {
   protected static final agn<Byte> bU = agq.a(bnj.class, agp.a);
   protected static final agn<Optional<UUID>> bV = agq.a(bnj.class, agp.q);
   private boolean bX;

   protected bnj(bmc<? extends bnj> $$0, ctx $$1) {
      super($$0, $$1);
      this.w();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, (byte)0);
      this.an.a(bV, Optional.empty());
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      $$0.a("Sitting", this.bX);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = aqv.a(this.cL(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.x(true);
         } catch (Throwable var4) {
            this.x(false);
         }
      }

      this.bX = $$0.q("Sitting");
      this.y(this.bX);
   }

   @Override
   public boolean a(cfq $$0) {
      return !this.fT();
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
         this.dL().a($$1, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
      return (this.an.b(bU) & 4) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.an.b(bU);
      if ($$0) {
         this.an.b(bU, (byte)($$1 | 4));
      } else {
         this.an.b(bU, (byte)($$1 & -5));
      }

      this.w();
   }

   protected void w() {
   }

   public boolean A() {
      return (this.an.b(bU) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.an.b(bU);
      if ($$0) {
         this.an.b(bU, (byte)($$1 | 1));
      } else {
         this.an.b(bU, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID d() {
      return this.an.b(bV).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.an.b(bV, Optional.ofNullable($$0));
   }

   public void f(cfq $$0) {
      this.x(true);
      this.b($$0.cw());
      if ($$0 instanceof anf) {
         am.y.a((anf)$$0, this);
      }
   }

   @Override
   public boolean c(bmo $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bmo $$0) {
      return $$0 == this.R_();
   }

   public boolean a(bmo $$0, bmo $$1) {
      return true;
   }

   @Override
   public enb cg() {
      if (this.u()) {
         bmo $$0 = this.R_();
         if ($$0 != null) {
            return $$0.cg();
         }
      }

      return super.cg();
   }

   @Override
   public boolean r(blw $$0) {
      if (this.u()) {
         bmo $$1 = this.R_();
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
   public void a(bkv $$0) {
      if (!this.dL().B && this.dL().Z().b(ctt.n) && this.R_() instanceof anf) {
         this.R_().a(this.eK().a());
      }

      super.a($$0);
   }

   public boolean gf() {
      return this.bX;
   }

   public void z(boolean $$0) {
      this.bX = $$0;
   }
}
