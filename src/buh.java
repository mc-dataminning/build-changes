import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class buh extends cfa implements bts {
   protected static final akg<Byte> bY = akk.a(buh.class, aki.a);
   protected static final akg<Optional<UUID>> bZ = akk.a(buh.class, aki.r);
   private boolean cb;

   protected buh(bsv<? extends buh> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bY, (byte)0);
      $$0.a(bZ, Optional.empty());
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      if (this.W_() != null) {
         $$0.a("Owner", this.W_());
      }

      $$0.a("Sitting", this.cb);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = auy.a(this.cO(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.b(true, false);
         } catch (Throwable var4) {
            this.b(false, true);
         }
      }

      this.cb = $$0.q("Sitting");
      this.x(this.cb);
   }

   @Override
   public boolean a(cms $$0) {
      return !this.gd();
   }

   protected void w(boolean $$0) {
      lh $$1 = lj.Q;
      if (!$$0) {
         $$1 = lj.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dP().a($$1, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$3, $$4, $$5);
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

   public boolean s() {
      return (this.ao.a(bY) & 4) != 0;
   }

   public void b(boolean $$0, boolean $$1) {
      byte $$2 = this.ao.a(bY);
      if ($$0) {
         this.ao.a(bY, (byte)($$2 | 4));
      } else {
         this.ao.a(bY, (byte)($$2 & -5));
      }

      if ($$1) {
         this.u();
      }
   }

   protected void u() {
   }

   public boolean y() {
      return (this.ao.a(bY) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.ao.a(bY);
      if ($$0) {
         this.ao.a(bY, (byte)($$1 | 1));
      } else {
         this.ao.a(bY, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID W_() {
      return this.ao.a(bZ).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.ao.a(bZ, Optional.ofNullable($$0));
   }

   public void f(cms $$0) {
      this.b(true, true);
      this.b($$0.cz());
      if ($$0 instanceof arc $$1) {
         am.y.a($$1, this);
      }
   }

   @Override
   public boolean c(btk $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(btk $$0) {
      return $$0 == this.P_();
   }

   public boolean a(btk $$0, btk $$1) {
      return true;
   }

   @Override
   public ewl cj() {
      if (this.s()) {
         btk $$0 = this.P_();
         if ($$0 != null) {
            return $$0.cj();
         }
      }

      return super.cj();
   }

   @Override
   public boolean s(bsp $$0) {
      if (this.s()) {
         btk $$1 = this.P_();
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
   public void a(bri $$0) {
      if (!this.dP().B && this.dP().ab().b(dbp.n) && this.P_() instanceof arc) {
         this.P_().a(this.eP().a());
      }

      super.a($$0);
   }

   public boolean gq() {
      return this.cb;
   }

   public void y(boolean $$0) {
      this.cb = $$0;
   }
}
