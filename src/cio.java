import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cio extends bvq {
   protected static final int bI = 6000;
   private int bF;
   @Nullable
   private UUID bG;

   protected cio(bwj<? extends cio> $$0, dip $$1) {
      super($$0, $$1);
      this.a(ewm.n, 16.0F);
      this.a(ewm.o, -1.0F);
   }

   public static bye.a gv() {
      return bxb.E().a(byf.E, 10.0);
   }

   @Override
   protected void a(aro $$0) {
      if (this.g() != 0) {
         this.bF = 0;
      }

      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.g() != 0) {
         this.bF = 0;
      }

      if (this.bF > 0) {
         this.bF--;
         if (this.bF % 10 == 0) {
            double $$0 = this.ae.k() * 0.02;
            double $$1 = this.ae.k() * 0.02;
            double $$2 = this.ae.k() * 0.02;
            this.dV().a(lx.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(aro $$0, bup $$1, float $$2) {
      this.gB();
      super.b($$0, $$1, $$2);
   }

   @Override
   public float a(iu $$0, dis $$1) {
      return $$1.a_($$0.e()).a(dlw.i) ? 10.0F : $$1.x($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("InLove", this.bF);
      if (this.bG != null) {
         $$0.a("LoveCause", this.bG);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.bF = $$0.h("InLove");
      this.bG = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bwj<? extends cio> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      boolean $$5 = bwi.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(axa.bZ) && $$5;
   }

   protected static boolean a(dhs $$0, iu $$1) {
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
   protected int e(aro $$0) {
      return 1 + this.ae.a(3);
   }

   public abstract boolean k(cys var1);

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if (this.k($$2)) {
         int $$3 = this.g();
         if (!this.dV().C && $$3 == 0 && this.gx()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
            this.gw();
            return bty.b;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gw();
            return bty.a;
         }

         if (this.dV().C) {
            return bty.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gw() {
   }

   protected void a(cqs $$0, btx $$1, cys $$2) {
      int $$3 = $$2.M();
      dbz $$4 = $$2.a(kj.x);
      $$2.a(1, $$0);
      if ($$4 != null) {
         cys $$5 = $$4.a($$2, $$3, $$0.fU(), $$0::b);
         $$0.a($$1, $$5);
      }
   }

   public boolean gx() {
      return this.bF <= 0;
   }

   public void e(@Nullable cqs $$0) {
      this.bF = 600;
      if ($$0 != null) {
         this.bG = $$0.cG();
      }

      this.dV().a(this, (byte)18);
   }

   public void r(int $$0) {
      this.bF = $$0;
   }

   public int gy() {
      return this.bF;
   }

   @Nullable
   public arp gz() {
      if (this.bG == null) {
         return null;
      } else {
         cqs $$0 = this.dV().a(this.bG);
         return $$0 instanceof arp ? (arp)$$0 : null;
      }
   }

   public boolean gA() {
      return this.bF > 0;
   }

   public void gB() {
      this.bF = 0;
   }

   public boolean a(cio $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gA() && $$0.gA();
      }
   }

   public void a(aro $$0, cio $$1) {
      bvq $$2 = this.a($$0, (bvq)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dA(), this.dC(), this.dG(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(aro $$0, cio $$1, @Nullable bvq $$2) {
      Optional.ofNullable(this.gz()).or(() -> Optional.ofNullable($$1.gz())).ifPresent($$2x -> {
         $$2x.a(awv.P);
         ap.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gB();
      $$1.gB();
      $$0.a(this, (byte)18);
      if ($$0.O().c(dil.f)) {
         $$0.b(new bwo($$0, this.dA(), this.dC(), this.dG(), this.dY().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ae.k() * 0.02;
            double $$3 = this.ae.k() * 0.02;
            double $$4 = this.ae.k() * 0.02;
            this.dV().a(lx.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
