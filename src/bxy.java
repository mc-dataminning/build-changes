import javax.annotation.Nullable;

public class bxy extends bxl {
   private boolean b;
   @Nullable
   private ebd c;
   @Nullable
   private ehp d;

   public bxy(bxj $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         gw $$0 = this.a.dL().a(dku.a.f, dnx.a(this.a.s()));
         if (!$$0.a(this.a.dj(), 10.0)) {
            this.a.ga().a(bxz.a);
         }
      } else {
         this.b = false;
         this.j();
      }
   }

   @Override
   public void d() {
      this.b = true;
      this.c = null;
      this.d = null;
   }

   private void j() {
      int $$0 = this.a.y();
      ehp $$1 = this.a.D(1.0F);
      int $$2 = this.a.r(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
      if (this.a.gb() != null && this.a.gb().e() > 0) {
         $$2 %= 12;
         if ($$2 < 0) {
            $$2 += 12;
         }
      } else {
         $$2 -= 12;
         $$2 &= 7;
         $$2 += 12;
      }

      this.c = this.a.a($$0, $$2, null);
      this.k();
   }

   private void k() {
      if (this.c != null) {
         this.c.a();
         if (!this.c.c()) {
            ib $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.ef().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new ehp((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public ehp g() {
      return this.d;
   }

   @Override
   public bxz<bxy> i() {
      return bxz.e;
   }
}
