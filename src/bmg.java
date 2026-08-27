import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bmg extends bww implements blt {
   protected static final afs<Byte> bT = afv.a(bmg.class, afu.a);
   protected static final afs<Optional<UUID>> bU = afv.a(bmg.class, afu.q);
   private boolean bW;

   protected bmg(bkz<? extends bmg> $$0, csf $$1) {
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
   public void b(sd $$0) {
      super.b($$0);
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      $$0.a("Sitting", this.bW);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = apx.a(this.cL(), $$2);
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
   public boolean a(cdz $$0) {
      return !this.fT();
   }

   protected void w(boolean $$0) {
      ju $$1 = jw.M;
      if (!$$0) {
         $$1 = jw.Z;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dN().a($$1, this.d(1.0), this.dv() + 0.5, this.g(1.0), $$3, $$4, $$5);
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

   public void f(cdz $$0) {
      this.x(true);
      this.b($$0.cw());
      if ($$0 instanceof amj) {
         al.x.a((amj)$$0, this);
      }
   }

   @Override
   public boolean c(bll $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bll $$0) {
      return $$0 == this.R_();
   }

   public boolean a(bll $$0, bll $$1) {
      return true;
   }

   @Override
   public ekw cg() {
      if (this.u()) {
         bll $$0 = this.R_();
         if ($$0 != null) {
            return $$0.cg();
         }
      }

      return super.cg();
   }

   @Override
   public boolean s(bkv $$0) {
      if (this.u()) {
         bll $$1 = this.R_();
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
   public void a(bjt $$0) {
      if (!this.dN().B && this.dN().Y().b(csb.n) && this.R_() instanceof amj) {
         this.R_().a(this.eL().a());
      }

      super.a($$0);
   }

   public boolean gf() {
      return this.bW;
   }

   public void z(boolean $$0) {
      this.bW = $$0;
   }
}
