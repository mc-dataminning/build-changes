import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cfe extends bsl {
   protected static final int cd = 6000;
   private int ca;
   @Nullable
   private UUID cb;

   protected cfe(bsx<? extends cfe> $$0, dcw $$1) {
      super($$0, $$1);
      this.a(ept.n, 16.0F);
      this.a(ept.o, -1.0F);
   }

   @Override
   protected void ab() {
      if (this.g() != 0) {
         this.ca = 0;
      }

      super.ab();
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
            this.dP().a(lm.Q, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void f(brk $$0, float $$1) {
      this.gu();
      super.f($$0, $$1);
   }

   @Override
   public float a(jd $$0, dcz $$1) {
      return $$1.a_($$0.e()).a(dga.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("InLove", this.ca);
      if (this.cb != null) {
         $$0.a("LoveCause", this.cb);
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.ca = $$0.h("InLove");
      this.cb = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bsx<? extends cfe> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      boolean $$5 = btr.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(awe.bW) && $$5;
   }

   protected static boolean a(dbz $$0, jd $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int R() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected int eh() {
      return 1 + this.dP().z.a(3);
   }

   public abstract boolean o(cuq var1);

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if (this.o($$2)) {
         int $$3 = this.g();
         if (!this.dP().B && $$3 == 0 && this.gq()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            return bqr.a;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bqr.a(this.dP().B);
         }

         if (this.dP().B) {
            return bqr.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cmx $$0, bqq $$1, cuq $$2) {
      $$2.a(1, $$0);
   }

   public boolean gq() {
      return this.ca <= 0;
   }

   public void f(@Nullable cmx $$0) {
      this.ca = 600;
      if ($$0 != null) {
         this.cb = $$0.cA();
      }

      this.dP().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.ca = $$0;
   }

   public int gr() {
      return this.ca;
   }

   @Nullable
   public aqv gs() {
      if (this.cb == null) {
         return null;
      } else {
         cmx $$0 = this.dP().b(this.cb);
         return $$0 instanceof aqv ? (aqv)$$0 : null;
      }
   }

   public boolean gt() {
      return this.ca > 0;
   }

   public void gu() {
      this.ca = 0;
   }

   public boolean a(cfe $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gt() && $$0.gt();
      }
   }

   public void a(aqu $$0, cfe $$1) {
      bsl $$2 = this.a($$0, (bsl)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.du(), this.dw(), this.dA(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(aqu $$0, cfe $$1, @Nullable bsl $$2) {
      Optional.ofNullable(this.gs()).or(() -> Optional.ofNullable($$1.gs())).ifPresent($$2x -> {
         $$2x.a(avz.P);
         an.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gu();
      $$1.gu();
      $$0.a(this, (byte)18);
      if ($$0.ab().b(dcs.f)) {
         $$0.b(new btc($$0, this.du(), this.dw(), this.dA(), this.dS().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ah.k() * 0.02;
            double $$3 = this.ah.k() * 0.02;
            double $$4 = this.ah.k() * 0.02;
            this.dP().a(lm.Q, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
