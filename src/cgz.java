import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cgz extends bud {
   protected static final int cb = 6000;
   private int bY;
   @Nullable
   private UUID bZ;

   protected cgz(but<? extends cgz> $$0, dgj $$1) {
      super($$0, $$1);
      this.a(etr.n, 16.0F);
      this.a(etr.o, -1.0F);
   }

   public static bwp.a gx() {
      return bvk.F().a(bwq.E, 10.0);
   }

   @Override
   protected void a(ard $$0) {
      if (this.Y_() != 0) {
         this.bY = 0;
      }

      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.Y_() != 0) {
         this.bY = 0;
      }

      if (this.bY > 0) {
         this.bY--;
         if (this.bY % 10 == 0) {
            double $$0 = this.ae.k() * 0.02;
            double $$1 = this.ae.k() * 0.02;
            double $$2 = this.ae.k() * 0.02;
            this.dV().a(lt.R, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(ard $$0, btc $$1, float $$2) {
      this.gD();
      super.b($$0, $$1, $$2);
   }

   @Override
   public float a(ji $$0, dgm $$1) {
      return $$1.a_($$0.e()).a(djp.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("InLove", this.bY);
      if (this.bZ != null) {
         $$0.a("LoveCause", this.bZ);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.bY = $$0.h("InLove");
      this.bZ = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(but<? extends cgz> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      boolean $$5 = bus.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(awp.bY) && $$5;
   }

   protected static boolean a(dfl $$0, ji $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int T() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected int e(ard $$0) {
      return 1 + this.ae.a(3);
   }

   public abstract boolean j(cwq var1);

   @Override
   public bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      if (this.j($$2)) {
         int $$3 = this.Y_();
         if (!this.dV().C && $$3 == 0 && this.gz()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gy();
            return bsl.b;
         }

         if (this.e_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gy();
            return bsl.a;
         }

         if (this.dV().C) {
            return bsl.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gy() {
   }

   protected void a(coy $$0, bsk $$1, cwq $$2) {
      int $$3 = $$2.M();
      czw $$4 = $$2.a(kv.y);
      $$2.a(1, $$0);
      if ($$4 != null) {
         cwq $$5 = $$4.a($$2, $$3, $$0.fV(), $$0::b);
         $$0.a($$1, $$5);
      }
   }

   public boolean gz() {
      return this.bY <= 0;
   }

   public void f(@Nullable coy $$0) {
      this.bY = 600;
      if ($$0 != null) {
         this.bZ = $$0.cG();
      }

      this.dV().a(this, (byte)18);
   }

   public void r(int $$0) {
      this.bY = $$0;
   }

   public int gA() {
      return this.bY;
   }

   @Nullable
   public are gB() {
      if (this.bZ == null) {
         return null;
      } else {
         coy $$0 = this.dV().b(this.bZ);
         return $$0 instanceof are ? (are)$$0 : null;
      }
   }

   public boolean gC() {
      return this.bY > 0;
   }

   public void gD() {
      this.bY = 0;
   }

   public boolean a(cgz $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gC() && $$0.gC();
      }
   }

   public void a(ard $$0, cgz $$1) {
      bud $$2 = this.a($$0, (bud)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dA(), this.dC(), this.dG(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(ard $$0, cgz $$1, @Nullable bud $$2) {
      Optional.ofNullable(this.gB()).or(() -> Optional.ofNullable($$1.gB())).ifPresent($$2x -> {
         $$2x.a(awk.P);
         ap.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gD();
      $$1.gD();
      $$0.a(this, (byte)18);
      if ($$0.O().b(dgf.f)) {
         $$0.b(new buy($$0, this.dA(), this.dC(), this.dG(), this.dY().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ae.k() * 0.02;
            double $$3 = this.ae.k() * 0.02;
            double $$4 = this.ae.k() * 0.02;
            this.dV().a(lt.R, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
