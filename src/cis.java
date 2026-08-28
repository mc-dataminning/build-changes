import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cis extends bvt {
   protected static final int bI = 6000;
   private int bF;
   @Nullable
   private UUID bG;

   protected cis(bwm<? extends cis> $$0, div $$1) {
      super($$0, $$1);
      this.a(ewx.n, 16.0F);
      this.a(ewx.o, -1.0F);
   }

   public static byh.a gv() {
      return bxe.E().a(byi.E, 10.0);
   }

   @Override
   protected void a(arq $$0) {
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
   protected void c(arq $$0, bus $$1, float $$2) {
      this.gB();
      super.c($$0, $$1, $$2);
   }

   @Override
   public float a(iu $$0, diy $$1) {
      return $$1.a_($$0.e()).a(dmc.i) ? 10.0F : $$1.x($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("InLove", this.bF);
      if (this.bG != null) {
         $$0.a("LoveCause", this.bG);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bF = $$0.h("InLove");
      this.bG = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bwm<? extends cis> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      boolean $$5 = bwl.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(axc.bZ) && $$5;
   }

   protected static boolean a(dhy $$0, iu $$1) {
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
   protected int e(arq $$0) {
      return 1 + this.ae.a(3);
   }

   public abstract boolean j(cyy var1);

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if (this.j($$2)) {
         int $$3 = this.g();
         if (!this.dV().C && $$3 == 0 && this.gx()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
            this.gw();
            return bub.b;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gw();
            return bub.a;
         }

         if (this.dV().C) {
            return bub.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gw() {
   }

   protected void a(cqy $$0, bua $$1, cyy $$2) {
      int $$3 = $$2.M();
      dcf $$4 = $$2.a(kj.x);
      $$2.a(1, $$0);
      if ($$4 != null) {
         cyy $$5 = $$4.a($$2, $$3, $$0.fU(), $$0::b);
         $$0.a($$1, $$5);
      }
   }

   public boolean gx() {
      return this.bF <= 0;
   }

   public void e(@Nullable cqy $$0) {
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
   public arr gz() {
      if (this.bG == null) {
         return null;
      } else {
         cqy $$0 = this.dV().a(this.bG);
         return $$0 instanceof arr ? (arr)$$0 : null;
      }
   }

   public boolean gA() {
      return this.bF > 0;
   }

   public void gB() {
      this.bF = 0;
   }

   public boolean a(cis $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gA() && $$0.gA();
      }
   }

   public void a(arq $$0, cis $$1) {
      bvt $$2 = this.a($$0, (bvt)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dA(), this.dC(), this.dG(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(arq $$0, cis $$1, @Nullable bvt $$2) {
      Optional.ofNullable(this.gz()).or(() -> Optional.ofNullable($$1.gz())).ifPresent($$2x -> {
         $$2x.a(awx.P);
         ap.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gB();
      $$1.gB();
      $$0.a(this, (byte)18);
      if ($$0.O().c(dir.f)) {
         $$0.b(new bwr($$0, this.dA(), this.dC(), this.dG(), this.dY().a(7) + 1));
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
