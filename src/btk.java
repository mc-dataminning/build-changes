import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class btk extends cee implements bsv {
   protected static final ajy<Byte> ch = akc.a(btk.class, aka.a);
   protected static final ajy<Optional<UUID>> ci = akc.a(btk.class, aka.r);
   private boolean ck;

   protected btk(bsb<? extends btk> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ch, (byte)0);
      $$0.a(ci, Optional.empty());
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.X_() != null) {
         $$0.a("Owner", this.X_());
      }

      $$0.a("Sitting", this.ck);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = aup.a(this.cT(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.b(true, false);
         } catch (Throwable var4) {
            this.b(false, true);
         }
      }

      this.ck = $$0.q("Sitting");
      this.x(this.ck);
   }

   @Override
   public boolean a(cly $$0) {
      return !this.gl();
   }

   protected void w(boolean $$0) {
      kz $$1 = lb.O;
      if (!$$0) {
         $$1 = lb.ac;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.al.k() * 0.02;
         double $$4 = this.al.k() * 0.02;
         double $$5 = this.al.k() * 0.02;
         this.dU().a($$1, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
      return (this.as.a(ch) & 4) != 0;
   }

   public void b(boolean $$0, boolean $$1) {
      byte $$2 = this.as.a(ch);
      if ($$0) {
         this.as.a(ch, (byte)($$2 | 4));
      } else {
         this.as.a(ch, (byte)($$2 & -5));
      }

      if ($$1) {
         this.t();
      }
   }

   protected void t() {
   }

   public boolean x() {
      return (this.as.a(ch) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.as.a(ch);
      if ($$0) {
         this.as.a(ch, (byte)($$1 | 1));
      } else {
         this.as.a(ch, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID X_() {
      return this.as.a(ci).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.as.a(ci, Optional.ofNullable($$0));
   }

   public void f(cly $$0) {
      this.b(true, true);
      this.b($$0.cE());
      if ($$0 instanceof aqu $$1) {
         an.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bso $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bso $$0) {
      return $$0 == this.Q_();
   }

   public boolean a(bso $$0, bso $$1) {
      return true;
   }

   @Override
   public ext co() {
      if (this.r()) {
         bso $$0 = this.Q_();
         if ($$0 != null) {
            return $$0.co();
         }
      }

      return super.co();
   }

   @Override
   public boolean s(brv $$0) {
      if (this.r()) {
         bso $$1 = this.Q_();
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
   public void a(bqt $$0) {
      if (!this.dU().C && this.dU().ab().b(dbw.n) && this.Q_() instanceof aqu) {
         this.Q_().a(this.eX().a());
      }

      super.a($$0);
   }

   public boolean gy() {
      return this.ck;
   }

   public void y(boolean $$0) {
      this.ck = $$0;
   }
}
