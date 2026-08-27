import javax.annotation.Nullable;

public class bxp extends bxc {
   private boolean b;
   @Nullable
   private eas c;
   @Nullable
   private ehe d;

   public bxp(bxa $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         gu $$0 = this.a.dK().a(dkj.a.f, dnm.a(this.a.p()));
         if (!$$0.a(this.a.di(), 10.0)) {
            this.a.fW().a(bxq.a);
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
      ehe $$1 = this.a.D(1.0F);
      int $$2 = this.a.r(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
      if (this.a.fX() != null && this.a.fX().e() > 0) {
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
            hz $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.ee().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new ehe((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public ehe g() {
      return this.d;
   }

   @Override
   public bxq<bxp> i() {
      return bxq.e;
   }
}
