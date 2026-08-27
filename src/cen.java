import javax.annotation.Nullable;

public class cen extends cea {
   private boolean b;
   @Nullable
   private ejd c;
   @Nullable
   private ept d;

   public cen(cdy $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         ib $$0 = this.a.dM().a(dso.a.f, dvr.a(this.a.r()));
         if (!$$0.a(this.a.dk(), 10.0)) {
            this.a.gk().a(ceo.a);
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
      ept $$1 = this.a.F(1.0F);
      int $$2 = this.a.r(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
      if (this.a.gl() != null && this.a.gl().e() > 0) {
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
            jg $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.ei().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new ept((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public ept g() {
      return this.d;
   }

   @Override
   public ceo<cen> i() {
      return ceo.e;
   }
}
