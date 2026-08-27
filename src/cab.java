import javax.annotation.Nullable;

public class cab extends bzo {
   private boolean b;
   @Nullable
   private edm c;
   @Nullable
   private ejz d;

   public cab(bzm $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         hx $$0 = this.a.dN().a(dmw.a.f, dpz.a(this.a.u()));
         if (!$$0.a(this.a.dl(), 10.0)) {
            this.a.gc().a(cac.a);
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
      int $$0 = this.a.A();
      ejz $$1 = this.a.D(1.0F);
      int $$2 = this.a.r(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
      if (this.a.gd() != null && this.a.gd().e() > 0) {
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
            ja $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.eh().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new ejz((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public ejz g() {
      return this.d;
   }

   @Override
   public cac<cab> i() {
      return cac.e;
   }
}
