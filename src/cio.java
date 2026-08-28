import javax.annotation.Nullable;

public class cio extends cib {
   private boolean b;
   @Nullable
   private eoh c;
   @Nullable
   private evp d;

   public cio(chz $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         iz $$0 = this.a.dP().a(dxs.a.f, eav.a(this.a.s()));
         if (!$$0.a(this.a.dn(), 10.0)) {
            this.a.gn().a(cip.a);
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
      evp $$1 = this.a.F(1.0F);
      int $$2 = this.a.r(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
      if (this.a.go() != null && this.a.go().e() > 0) {
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
            kd $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.el().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new evp((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public evp g() {
      return this.d;
   }

   @Override
   public cip<cio> i() {
      return cip.e;
   }
}
