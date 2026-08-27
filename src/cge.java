import javax.annotation.Nullable;

public class cge extends cfr {
   private boolean b;
   @Nullable
   private emf c;
   @Nullable
   private etf d;

   public cge(cfp $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         im $$0 = this.a.dN().a(dvq.a.f, dyt.a(this.a.r()));
         if (!$$0.a(this.a.dl(), 10.0)) {
            this.a.gm().a(cgf.a);
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
      etf $$1 = this.a.F(1.0F);
      int $$2 = this.a.r(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
      if (this.a.gn() != null && this.a.gn().e() > 0) {
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
            jq $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.ej().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new etf((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public etf g() {
      return this.d;
   }

   @Override
   public cgf<cge> i() {
      return cgf.e;
   }
}
