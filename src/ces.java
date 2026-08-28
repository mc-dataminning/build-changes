import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ces extends bsb {
   protected static final int cc = 6000;
   private int ca;
   @Nullable
   private UUID cb;

   protected ces(bsn<? extends ces> $$0, dcg $$1) {
      super($$0, $$1);
      this.a(epa.n, 16.0F);
      this.a(epa.o, -1.0F);
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
            this.dR().a(lj.Q, this.d(1.0), this.dz() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void f(bra $$0, float $$1) {
      this.gs();
      super.f($$0, $$1);
   }

   @Override
   public float a(ja $$0, dcj $$1) {
      return $$1.a_($$0.d()).a(dfk.i) ? 10.0F : $$1.w($$0);
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

   public static boolean b(bsn<? extends ces> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      boolean $$5 = btg.b($$2) || a($$1, $$3);
      return $$1.a_($$3.d()).a(avw.bW) && $$5;
   }

   protected static boolean a(dbj $$0, ja $$1) {
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
   protected int ei() {
      return 1 + this.dR().z.a(3);
   }

   public abstract boolean o(cud var1);

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if (this.o($$2)) {
         int $$3 = this.g();
         if (!this.dR().B && $$3 == 0 && this.go()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bqh.a;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bqh.a(this.dR().B);
         }

         if (this.dR().B) {
            return bqh.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(cml $$0, bqg $$1, cud $$2) {
      $$2.a(1, $$0);
   }

   public boolean go() {
      return this.ca <= 0;
   }

   public void g(@Nullable cml $$0) {
      this.ca = 600;
      if ($$0 != null) {
         this.cb = $$0.cB();
      }

      this.dR().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.ca = $$0;
   }

   public int gp() {
      return this.ca;
   }

   @Nullable
   public aqn gq() {
      if (this.cb == null) {
         return null;
      } else {
         cml $$0 = this.dR().b(this.cb);
         return $$0 instanceof aqn ? (aqn)$$0 : null;
      }
   }

   public boolean gr() {
      return this.ca > 0;
   }

   public void gs() {
      this.ca = 0;
   }

   public boolean a(ces $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gr() && $$0.gr();
      }
   }

   public void a(aqm $$0, ces $$1) {
      bsb $$2 = this.a($$0, (bsb)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dw(), this.dy(), this.dC(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(aqm $$0, ces $$1, @Nullable bsb $$2) {
      Optional.ofNullable(this.gq()).or(() -> Optional.ofNullable($$1.gq())).ifPresent($$2x -> {
         $$2x.a(avr.P);
         am.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gs();
      $$1.gs();
      $$0.a(this, (byte)18);
      if ($$0.ab().b(dcc.f)) {
         $$0.b(new bss($$0, this.dw(), this.dy(), this.dC(), this.dU().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ah.k() * 0.02;
            double $$3 = this.ah.k() * 0.02;
            double $$4 = this.ah.k() * 0.02;
            this.dR().a(lj.Q, this.d(1.0), this.dz() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
