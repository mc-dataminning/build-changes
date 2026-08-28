import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class buj extends cfc implements btt {
   public static final int ca = 144;
   private static final int ce = 2;
   private static final int cf = 3;
   private static final int cg = 1;
   protected static final ajv<Byte> cb = ajz.a(buj.class, ajx.a);
   protected static final ajv<Optional<UUID>> cc = ajz.a(buj.class, ajx.r);
   private boolean ch;

   protected buj(bsw<? extends buj> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cb, (byte)0);
      $$0.a(cc, Optional.empty());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.W_() != null) {
         $$0.a("Owner", this.W_());
      }

      $$0.a("Sitting", this.ch);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = aup.a(this.cP(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.b(true, false);
         } catch (Throwable var4) {
            this.b(false, true);
         }
      }

      this.ch = $$0.q("Sitting");
      this.x(this.ch);
   }

   @Override
   public boolean a(cmv $$0) {
      return !this.fY();
   }

   protected void w(boolean $$0) {
      lk $$1 = lm.Q;
      if (!$$0) {
         $$1 = lm.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dQ().a($$1, this.d(1.0), this.dy() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
      return (this.ao.a(cb) & 4) != 0;
   }

   public void b(boolean $$0, boolean $$1) {
      byte $$2 = this.ao.a(cb);
      if ($$0) {
         this.ao.a(cb, (byte)($$2 | 4));
      } else {
         this.ao.a(cb, (byte)($$2 & -5));
      }

      if ($$1) {
         this.t();
      }
   }

   protected void t() {
   }

   public boolean x() {
      return (this.ao.a(cb) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.ao.a(cb);
      if ($$0) {
         this.ao.a(cb, (byte)($$1 | 1));
      } else {
         this.ao.a(cb, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID W_() {
      return this.ao.a(cc).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.ao.a(cc, Optional.ofNullable($$0));
   }

   public void f(cmv $$0) {
      this.b(true, true);
      this.b($$0.cA());
      if ($$0 instanceof aqu $$1) {
         an.y.a($$1, this);
      }
   }

   @Override
   public boolean c(btl $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(btl $$0) {
      return $$0 == this.P_();
   }

   public boolean a(btl $$0, btl $$1) {
      return true;
   }

   @Override
   public exv ck() {
      if (this.s()) {
         btl $$0 = this.P_();
         if ($$0 != null) {
            return $$0.ck();
         }
      }

      return super.ck();
   }

   @Override
   public boolean s(bsq $$0) {
      if (this.s()) {
         btl $$1 = this.P_();
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
   public void a(brj $$0) {
      if (!this.dQ().B && this.dQ().ab().b(dcq.n) && this.P_() instanceof aqu) {
         this.P_().a(this.eM().a());
      }

      super.a($$0);
   }

   public boolean gm() {
      return this.ch;
   }

   public void y(boolean $$0) {
      this.ch = $$0;
   }

   public void gn() {
      btl $$0 = this.P_();
      if ($$0 != null) {
         this.g($$0.dq());
      }
   }

   public boolean go() {
      btl $$0 = this.P_();
      return $$0 != null && this.g(this.P_()) >= 144.0;
   }

   private void g(jd $$0) {
      for (int $$1 = 0; $$1 < 10; $$1++) {
         int $$2 = this.ah.a(-3, 3);
         int $$3 = this.ah.a(-3, 3);
         if (Math.abs($$2) >= 2 || Math.abs($$3) >= 2) {
            int $$4 = this.ah.a(-1, 1);
            if (this.a($$0.u() + $$2, $$0.v() + $$4, $$0.w() + $$3)) {
               return;
            }
         }
      }
   }

   private boolean a(int $$0, int $$1, int $$2) {
      if (!this.h(new jd($$0, $$1, $$2))) {
         return false;
      } else {
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dG(), this.dI());
         this.bT.n();
         return true;
      }
   }

   private boolean h(jd $$0) {
      epp $$1 = epu.b(this, $$0);
      if ($$1 != epp.c) {
         return false;
      } else {
         dta $$2 = this.dQ().a_($$0.d());
         if (!this.gq() && $$2.b() instanceof dkg) {
            return false;
         } else {
            jd $$3 = $$0.b(this.dq());
            return this.dQ().a(this, this.cL().a($$3));
         }
      }
   }

   public final boolean gp() {
      return this.gm() || this.bS() || this.fZ() || this.P_() != null && this.P_().N_();
   }

   protected boolean gq() {
      return false;
   }

   public class a extends cbd {
      public a(final double param3, final awt<brl> buj.this) {
         super(buj.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(buj.this, $$1);
      }

      @Override
      public void a() {
         if (!buj.this.gp() && buj.this.go()) {
            buj.this.gn();
         }

         super.a();
      }
   }
}
