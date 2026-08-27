import javax.annotation.Nullable;

public class bxr extends bxe {
   private boolean b;
   @Nullable
   private eaw c;
   @Nullable
   private ehi d;

   public bxr(bxc $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         gw $$0 = this.a.dK().a(dkn.a.f, dnq.a(this.a.p()));
         if (!$$0.a(this.a.di(), 10.0)) {
            this.a.fX().a(bxs.a);
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
      int $$0 = this.a.t();
      ehi $$1 = this.a.D(1.0F);
      int $$2 = this.a.r(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
      if (this.a.fY() != null && this.a.fY().e() > 0) {
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
               $$1 = (double)((float)$$0.v() + this.a.ee().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new ehi((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public ehi g() {
      return this.d;
   }

   @Override
   public bxs<bxr> i() {
      return bxs.e;
   }
}
