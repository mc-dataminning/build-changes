import javax.annotation.Nullable;

public class cif extends cic {
   @Nullable
   private exc b;
   private int c;

   public cif(cia $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.dR().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.dR().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.dR().i() - 0.5F) * 8.0F;
         this.a.dO().a(lm.v, this.a.dt() + (double)$$0, this.a.dv() + 2.0 + (double)$$1, this.a.dz() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         jd $$0 = this.a.dO().a(dyy.a.e, ecd.a(this.a.s()));
         this.b = exc.c($$0);
      }

      double $$1 = this.b.c(this.a.dt(), this.a.dv(), this.a.dz());
      if (!($$1 < 100.0) && !($$1 > 22500.0) && !this.a.Q && !this.a.R) {
         this.a.v(1.0F);
      } else {
         this.a.v(0.0F);
      }
   }

   @Override
   public void d() {
      this.b = null;
      this.c = 0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public exc g() {
      return this.b;
   }

   @Override
   public ciq<cif> i() {
      return ciq.j;
   }
}
