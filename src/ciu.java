import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ciu extends bvv {
   protected static final int bJ = 6000;
   private int bG;
   @Nullable
   private UUID bH;

   protected ciu(bwo<? extends ciu> $$0, dja $$1) {
      super($$0, $$1);
      this.a(exf.n, 16.0F);
      this.a(exf.o, -1.0F);
   }

   public static byj.a gw() {
      return bxg.E().a(byk.E, 10.0);
   }

   @Override
   protected void a(arq $$0) {
      if (this.g() != 0) {
         this.bG = 0;
      }

      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.g() != 0) {
         this.bG = 0;
      }

      if (this.bG > 0) {
         this.bG--;
         if (this.bG % 10 == 0) {
            double $$0 = this.ae.k() * 0.02;
            double $$1 = this.ae.k() * 0.02;
            double $$2 = this.ae.k() * 0.02;
            this.dV().a(lx.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void c(arq $$0, buu $$1, float $$2) {
      this.gC();
      super.c($$0, $$1, $$2);
   }

   @Override
   public float a(iu $$0, djd $$1) {
      return $$1.a_($$0.e()).a(dmh.i) ? 10.0F : $$1.x($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("InLove", this.bG);
      if (this.bH != null) {
         $$0.a("LoveCause", this.bH);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bG = $$0.h("InLove");
      this.bH = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bwo<? extends ciu> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      boolean $$5 = bwn.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(axc.ca) && $$5;
   }

   protected static boolean a(did $$0, iu $$1) {
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

   public abstract boolean i(czd var1);

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if (this.i($$2)) {
         int $$3 = this.g();
         if (!this.dV().C && $$3 == 0 && this.gy()) {
            this.a($$0, $$1, $$2);
            this.e($$0);
            this.gx();
            return bud.b;
         }

         if (this.n_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gx();
            return bud.a;
         }

         if (this.dV().C) {
            return bud.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gx() {
   }

   protected void a(crc $$0, buc $$1, czd $$2) {
      int $$3 = $$2.M();
      dck $$4 = $$2.a(kj.x);
      $$2.a(1, $$0);
      if ($$4 != null) {
         czd $$5 = $$4.a($$2, $$3, $$0.fV(), $$0::b);
         $$0.a($$1, $$5);
      }
   }

   public boolean gy() {
      return this.bG <= 0;
   }

   public void e(@Nullable crc $$0) {
      this.bG = 600;
      if ($$0 != null) {
         this.bH = $$0.cG();
      }

      this.dV().a(this, (byte)18);
   }

   public void r(int $$0) {
      this.bG = $$0;
   }

   public int gz() {
      return this.bG;
   }

   @Nullable
   public arr gA() {
      if (this.bH == null) {
         return null;
      } else {
         crc $$0 = this.dV().a(this.bH);
         return $$0 instanceof arr ? (arr)$$0 : null;
      }
   }

   public boolean gB() {
      return this.bG > 0;
   }

   public void gC() {
      this.bG = 0;
   }

   public boolean a(ciu $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gB() && $$0.gB();
      }
   }

   public void a(arq $$0, ciu $$1) {
      bvv $$2 = this.a($$0, (bvv)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dA(), this.dC(), this.dG(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(arq $$0, ciu $$1, @Nullable bvv $$2) {
      Optional.ofNullable(this.gA()).or(() -> Optional.ofNullable($$1.gA())).ifPresent($$2x -> {
         $$2x.a(awx.P);
         ap.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gC();
      $$1.gC();
      $$0.a(this, (byte)18);
      if ($$0.O().c(diw.g)) {
         $$0.b(new bwt($$0, this.dA(), this.dC(), this.dG(), this.dY().a(7) + 1));
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
