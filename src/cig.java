import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cig extends bvi {
   protected static final int bH = 6000;
   private int bE;
   @Nullable
   private UUID bF;

   protected cig(bwb<? extends cig> $$0, dhp $$1) {
      super($$0, $$1);
      this.a(evk.n, 16.0F);
      this.a(evk.o, -1.0F);
   }

   public static bxw.a gv() {
      return bwt.E().a(bxx.E, 10.0);
   }

   @Override
   protected void a(arn $$0) {
      if (this.g() != 0) {
         this.bE = 0;
      }

      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.g() != 0) {
         this.bE = 0;
      }

      if (this.bE > 0) {
         this.bE--;
         if (this.bE % 10 == 0) {
            double $$0 = this.ae.k() * 0.02;
            double $$1 = this.ae.k() * 0.02;
            double $$2 = this.ae.k() * 0.02;
            this.dV().a(lv.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(arn $$0, buh $$1, float $$2) {
      this.gB();
      super.b($$0, $$1, $$2);
   }

   @Override
   public float a(jj $$0, dhs $$1) {
      return $$1.a_($$0.e()).a(dkw.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("InLove", this.bE);
      if (this.bF != null) {
         $$0.a("LoveCause", this.bF);
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.bE = $$0.h("InLove");
      this.bF = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bwb<? extends cig> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      boolean $$5 = bwa.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(awz.bZ) && $$5;
   }

   protected static boolean a(dgs $$0, jj $$1) {
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
   protected int e(arn $$0) {
      return 1 + this.ae.a(3);
   }

   public abstract boolean k(cxy var1);

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if (this.k($$2)) {
         int $$3 = this.g();
         if (!this.dV().C && $$3 == 0 && this.gx()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
            this.gw();
            return btq.b;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gw();
            return btq.a;
         }

         if (this.dV().C) {
            return btq.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gw() {
   }

   protected void a(cqi $$0, btp $$1, cxy $$2) {
      int $$3 = $$2.M();
      dbb $$4 = $$2.a(kx.y);
      $$2.a(1, $$0);
      if ($$4 != null) {
         cxy $$5 = $$4.a($$2, $$3, $$0.fU(), $$0::b);
         $$0.a($$1, $$5);
      }
   }

   public boolean gx() {
      return this.bE <= 0;
   }

   public void e(@Nullable cqi $$0) {
      this.bE = 600;
      if ($$0 != null) {
         this.bF = $$0.cG();
      }

      this.dV().a(this, (byte)18);
   }

   public void r(int $$0) {
      this.bE = $$0;
   }

   public int gy() {
      return this.bE;
   }

   @Nullable
   public aro gz() {
      if (this.bF == null) {
         return null;
      } else {
         cqi $$0 = this.dV().a(this.bF);
         return $$0 instanceof aro ? (aro)$$0 : null;
      }
   }

   public boolean gA() {
      return this.bE > 0;
   }

   public void gB() {
      this.bE = 0;
   }

   public boolean a(cig $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gA() && $$0.gA();
      }
   }

   public void a(arn $$0, cig $$1) {
      bvi $$2 = this.a($$0, (bvi)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dA(), this.dC(), this.dG(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(arn $$0, cig $$1, @Nullable bvi $$2) {
      Optional.ofNullable(this.gz()).or(() -> Optional.ofNullable($$1.gz())).ifPresent($$2x -> {
         $$2x.a(awu.P);
         ap.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gB();
      $$1.gB();
      $$0.a(this, (byte)18);
      if ($$0.O().c(dhl.f)) {
         $$0.b(new bwg($$0, this.dA(), this.dC(), this.dG(), this.dY().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ae.k() * 0.02;
            double $$3 = this.ae.k() * 0.02;
            double $$4 = this.ae.k() * 0.02;
            this.dV().a(lv.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
