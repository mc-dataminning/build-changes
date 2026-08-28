import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cer extends bsa {
   protected static final int cc = 6000;
   private int ca;
   @Nullable
   private UUID cb;

   protected cer(bsm<? extends cer> $$0, dcf $$1) {
      super($$0, $$1);
      this.a(eoy.n, 16.0F);
      this.a(eoy.o, -1.0F);
   }

   @Override
   protected void Z() {
      if (this.g() != 0) {
         this.ca = 0;
      }

      super.Z();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.g() != 0) {
         this.ca = 0;
      }

      if (this.ca > 0) {
         this.ca--;
         if (this.ca % 10 == 0) {
            double $$0 = this.ah.k() * 0.02;
            double $$1 = this.ah.k() * 0.02;
            double $$2 = this.ah.k() * 0.02;
            this.dQ().a(lj.Q, this.d(1.0), this.dy() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void f(bqz $$0, float $$1) {
      this.gt();
      super.f($$0, $$1);
   }

   @Override
   public float a(ja $$0, dci $$1) {
      return $$1.a_($$0.d()).a(dfj.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("InLove", this.ca);
      if (this.cb != null) {
         $$0.a("LoveCause", this.cb);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.ca = $$0.h("InLove");
      this.cb = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bsm<? extends cer> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      boolean $$5 = btf.b($$2) || a($$1, $$3);
      return $$1.a_($$3.d()).a(avw.bW) && $$5;
   }

   protected static boolean a(dbi $$0, ja $$1) {
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

   public abstract boolean o(cuc var1);

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if (this.o($$2)) {
         int $$3 = this.g();
         if (!this.dQ().B && $$3 == 0 && this.gp()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bqg.a;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bqg.a(this.dQ().B);
         }

         if (this.dQ().B) {
            return bqg.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cmk $$0, bqf $$1, cuc $$2) {
      $$2.a(1, $$0);
   }

   public boolean gp() {
      return this.ca <= 0;
   }

   public void g(@Nullable cmk $$0) {
      this.ca = 600;
      if ($$0 != null) {
         this.cb = $$0.cA();
      }

      this.dQ().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.ca = $$0;
   }

   public int gq() {
      return this.ca;
   }

   @Nullable
   public aqn gr() {
      if (this.cb == null) {
         return null;
      } else {
         cmk $$0 = this.dQ().b(this.cb);
         return $$0 instanceof aqn ? (aqn)$$0 : null;
      }
   }

   public boolean gs() {
      return this.ca > 0;
   }

   public void gt() {
      this.ca = 0;
   }

   public boolean a(cer $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gs() && $$0.gs();
      }
   }

   public void a(aqm $$0, cer $$1) {
      bsa $$2 = this.a($$0, (bsa)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dv(), this.dx(), this.dB(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(aqm $$0, cer $$1, @Nullable bsa $$2) {
      Optional.ofNullable(this.gr()).or(() -> Optional.ofNullable($$1.gr())).ifPresent($$2x -> {
         $$2x.a(avr.P);
         am.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gt();
      $$1.gt();
      $$0.a(this, (byte)18);
      if ($$0.ab().b(dcb.f)) {
         $$0.b(new bsr($$0, this.dv(), this.dx(), this.dB(), this.dT().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ah.k() * 0.02;
            double $$3 = this.ah.k() * 0.02;
            double $$4 = this.ah.k() * 0.02;
            this.dQ().a(lj.Q, this.d(1.0), this.dy() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
