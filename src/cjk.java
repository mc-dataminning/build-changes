import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cjk extends bwj {
   protected static final int bL = 6000;
   private static final int bI = 0;
   private int bJ = 0;
   @Nullable
   private UUID bK;

   protected cjk(bxc<? extends cjk> $$0, djx $$1) {
      super($$0, $$1);
      this.a(eyf.n, 16.0F);
      this.a(eyf.o, -1.0F);
   }

   public static byz.a gz() {
      return bxw.E().a(bza.E, 10.0);
   }

   @Override
   protected void a(ars $$0) {
      if (this.g() != 0) {
         this.bJ = 0;
      }

      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.g() != 0) {
         this.bJ = 0;
      }

      if (this.bJ > 0) {
         this.bJ--;
         if (this.bJ % 10 == 0) {
            double $$0 = this.ae.k() * 0.02;
            double $$1 = this.ae.k() * 0.02;
            double $$2 = this.ae.k() * 0.02;
            this.dV().a(ly.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void c(ars $$0, bvi $$1, float $$2) {
      this.gF();
      super.c($$0, $$1, $$2);
   }

   @Override
   public float a(iv $$0, dka $$1) {
      return $$1.a_($$0.e()).a(dne.i) ? 10.0F : $$1.x($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("InLove", this.bJ);
      $$0.b("LoveCause", jz.a, this.bK);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bJ = $$0.b("InLove", 0);
      this.bK = $$0.<UUID>a("LoveCause", jz.a).orElse(null);
   }

   public static boolean b(bxc<? extends cjk> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      boolean $$5 = bxb.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(axe.ca) && $$5;
   }

   protected static boolean a(diy $$0, iv $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int S() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected int e(ars $$0) {
      return 1 + this.ae.a(3);
   }

   public abstract boolean i(czy var1);

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if (this.i($$2)) {
         int $$3 = this.g();
         if (!this.dV().C && $$3 == 0 && this.gB()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
            this.gA();
            return bur.b;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gA();
            return bur.a;
         }

         if (this.dV().C) {
            return bur.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gA() {
   }

   protected void a(crx $$0, buq $$1, czy $$2) {
      int $$3 = $$2.M();
      ddf $$4 = $$2.a(kk.x);
      $$2.a(1, $$0);
      if ($$4 != null) {
         czy $$5 = $$4.a($$2, $$3, $$0.fV(), $$0::b);
         $$0.a($$1, $$5);
      }
   }

   public boolean gB() {
      return this.bJ <= 0;
   }

   public void e(@Nullable crx $$0) {
      this.bJ = 600;
      if ($$0 != null) {
         this.bK = $$0.cG();
      }

      this.dV().a(this, (byte)18);
   }

   public void r(int $$0) {
      this.bJ = $$0;
   }

   public int gC() {
      return this.bJ;
   }

   @Nullable
   public art gD() {
      if (this.bK == null) {
         return null;
      } else {
         crx $$0 = this.dV().a(this.bK);
         return $$0 instanceof art ? (art)$$0 : null;
      }
   }

   public boolean gE() {
      return this.bJ > 0;
   }

   public void gF() {
      this.bJ = 0;
   }

   public boolean a(cjk $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gE() && $$0.gE();
      }
   }

   public void a(ars $$0, cjk $$1) {
      bwj $$2 = this.a($$0, (bwj)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dA(), this.dC(), this.dG(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(ars $$0, cjk $$1, @Nullable bwj $$2) {
      Optional.ofNullable(this.gD()).or(() -> Optional.ofNullable($$1.gD())).ifPresent($$2x -> {
         $$2x.a(awz.P);
         aq.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gF();
      $$1.gF();
      $$0.a(this, (byte)18);
      if ($$0.O().c(djt.g)) {
         $$0.b(new bxh($$0, this.dA(), this.dC(), this.dG(), this.dY().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ae.k() * 0.02;
            double $$3 = this.ae.k() * 0.02;
            double $$4 = this.ae.k() * 0.02;
            this.dV().a(ly.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
