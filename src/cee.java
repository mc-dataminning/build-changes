import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cee extends brp {
   protected static final int cj = 6000;
   private int ch;
   @Nullable
   private UUID ci;

   protected cee(bsb<? extends cee> $$0, dca $$1) {
      super($$0, $$1);
      this.a(epv.n, 16.0F);
      this.a(epv.o, -1.0F);
   }

   @Override
   protected void Y() {
      if (this.g() != 0) {
         this.ch = 0;
      }

      super.Y();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.g() != 0) {
         this.ch = 0;
      }

      if (this.ch > 0) {
         this.ch--;
         if (this.ch % 10 == 0) {
            double $$0 = this.al.k() * 0.02;
            double $$1 = this.al.k() * 0.02;
            double $$2 = this.al.k() * 0.02;
            this.dU().a(lb.O, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.ch = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(ir $$0, dcd $$1) {
      return $$1.a_($$0.d()).a(awe.bZ) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("InLove", this.ch);
      if (this.ci != null) {
         $$0.a("LoveCause", this.ci);
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.ch = $$0.h("InLove");
      this.ci = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bsb<? extends cee> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      boolean $$5 = bss.b($$2) || a($$1, $$3);
      return $$1.a_($$3.d()).a(awe.bZ) && $$5;
   }

   protected static boolean a(dbd $$0, ir $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int O() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public int er() {
      return 1 + this.dU().A.a(3);
   }

   public abstract boolean o(cuh var1);

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if (this.o($$2)) {
         int $$3 = this.g();
         if (!this.dU().C && $$3 == 0 && this.gz()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bqa.a;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bqa.a(this.dU().C);
         }

         if (this.dU().C) {
            return bqa.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cly $$0, bpz $$1, cuh $$2) {
      $$2.a(1, $$0);
   }

   public boolean gz() {
      return this.ch <= 0;
   }

   public void g(@Nullable cly $$0) {
      this.ch = 600;
      if ($$0 != null) {
         this.ci = $$0.cE();
      }

      this.dU().a(this, (byte)18);
   }

   public void u(int $$0) {
      this.ch = $$0;
   }

   public int gA() {
      return this.ch;
   }

   @Nullable
   public aqu gB() {
      if (this.ci == null) {
         return null;
      } else {
         cly $$0 = this.dU().c(this.ci);
         return $$0 instanceof aqu ? (aqu)$$0 : null;
      }
   }

   public boolean gC() {
      return this.ch > 0;
   }

   public void gD() {
      this.ch = 0;
   }

   public boolean a(cee $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gC() && $$0.gC();
      }
   }

   public void a(aqt $$0, cee $$1) {
      brp $$2 = this.a($$0, (brp)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dz(), this.dB(), this.dF(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(aqt $$0, cee $$1, @Nullable brp $$2) {
      Optional.ofNullable(this.gB()).or(() -> Optional.ofNullable($$1.gB())).ifPresent($$2x -> {
         $$2x.a(avz.P);
         an.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gD();
      $$1.gD();
      $$0.a(this, (byte)18);
      if ($$0.ab().b(dbw.f)) {
         $$0.b(new bse($$0, this.dz(), this.dB(), this.dF(), this.et().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.al.k() * 0.02;
            double $$3 = this.al.k() * 0.02;
            double $$4 = this.al.k() * 0.02;
            this.dU().a(lb.O, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
