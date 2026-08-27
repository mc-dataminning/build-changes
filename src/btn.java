import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class btn extends ceg implements bsy {
   protected static final ajs<Byte> bY = ajw.a(btn.class, aju.a);
   protected static final ajs<Optional<UUID>> bZ = ajw.a(btn.class, aju.r);
   private boolean cb;

   protected btn(bsc<? extends btn> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(bY, (byte)0);
      $$0.a(bZ, Optional.empty());
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      if (this.W_() != null) {
         $$0.a("Owner", this.W_());
      }

      $$0.a("Sitting", this.cb);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = auj.a(this.cO(), $$2);
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
   public boolean a(cly $$0) {
      return !this.gc();
   }

   protected void w(boolean $$0) {
      kw $$1 = ky.Q;
      if (!$$0) {
         $$1 = ky.ae;
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

   public void f(cly $$0) {
      this.b(true, true);
      this.b($$0.cz());
      if ($$0 instanceof aqo $$1) {
         am.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bsq $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bsq $$0) {
      return $$0 == this.P_();
   }

   public boolean a(bsq $$0, bsq $$1) {
      return true;
   }

   @Override
   public evl cj() {
      if (this.s()) {
         bsq $$0 = this.P_();
         if ($$0 != null) {
            return $$0.cj();
         }
      }

      return super.cj();
   }

   @Override
   public boolean s(brw $$0) {
      if (this.s()) {
         bsq $$1 = this.P_();
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
   public void a(bqp $$0) {
      if (!this.dP().B && this.dP().aa().b(dav.n) && this.P_() instanceof aqo) {
         this.P_().a(this.eP().a());
      }

      super.a($$0);
   }

   public boolean gp() {
      return this.cb;
   }

   public void y(boolean $$0) {
      this.cb = $$0;
   }
}
