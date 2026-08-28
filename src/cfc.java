import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cfc extends bsk {
   protected static final int cd = 6000;
   private int ca;
   @Nullable
   private UUID cb;

   protected cfc(bsw<? extends cfc> $$0, dcu $$1) {
      super($$0, $$1);
      this.a(epp.n, 16.0F);
      this.a(epp.o, -1.0F);
   }

   @Override
   protected void Z() {
      if (this.g() != 0) {
         this.ca = 0;
      }

      super.Z();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.g() != 0) {
         this.ca = 0;
      }

      if (this.ca > 0) {
         this.ca--;
         if (this.ca % 10 == 0) {
            double $$0 = this.ah.k() * 0.02;
            double $$1 = this.ah.k() * 0.02;
            double $$2 = this.ah.k() * 0.02;
            this.dQ().a(lm.Q, this.d(1.0), this.dy() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void f(brj $$0, float $$1) {
      this.gv();
      super.f($$0, $$1);
   }

   @Override
   public float a(jd $$0, dcx $$1) {
      return $$1.a_($$0.d()).a(dfy.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("InLove", this.ca);
      if (this.cb != null) {
         $$0.a("LoveCause", this.cb);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.ca = $$0.h("InLove");
      this.cb = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bsw<? extends cfc> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      boolean $$5 = btp.b($$2) || a($$1, $$3);
      return $$1.a_($$3.d()).a(awd.bW) && $$5;
   }

   protected static boolean a(dbx $$0, jd $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int P() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected int eh() {
      return 1 + this.dQ().z.a(3);
   }

   public abstract boolean o(cuo var1);

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if (this.o($$2)) {
         int $$3 = this.g();
         if (!this.dQ().B && $$3 == 0 && this.gr()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bqq.a;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bqq.a(this.dQ().B);
         }

         if (this.dQ().B) {
            return bqq.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cmv $$0, bqp $$1, cuo $$2) {
      $$2.a(1, $$0);
   }

   public boolean gr() {
      return this.ca <= 0;
   }

   public void g(@Nullable cmv $$0) {
      this.ca = 600;
      if ($$0 != null) {
         this.cb = $$0.cA();
      }

      this.dQ().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.ca = $$0;
   }

   public int gs() {
      return this.ca;
   }

   @Nullable
   public aqu gt() {
      if (this.cb == null) {
         return null;
      } else {
         cmv $$0 = this.dQ().b(this.cb);
         return $$0 instanceof aqu ? (aqu)$$0 : null;
      }
   }

   public boolean gu() {
      return this.ca > 0;
   }

   public void gv() {
      this.ca = 0;
   }

   public boolean a(cfc $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gu() && $$0.gu();
      }
   }

   public void a(aqt $$0, cfc $$1) {
      bsk $$2 = this.a($$0, (bsk)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dv(), this.dx(), this.dB(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(aqt $$0, cfc $$1, @Nullable bsk $$2) {
      Optional.ofNullable(this.gt()).or(() -> Optional.ofNullable($$1.gt())).ifPresent($$2x -> {
         $$2x.a(avy.P);
         an.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gv();
      $$1.gv();
      $$0.a(this, (byte)18);
      if ($$0.ab().b(dcq.f)) {
         $$0.b(new btb($$0, this.dv(), this.dx(), this.dB(), this.dT().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ah.k() * 0.02;
            double $$3 = this.ah.k() * 0.02;
            double $$4 = this.ah.k() * 0.02;
            this.dQ().a(lm.Q, this.d(1.0), this.dy() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
