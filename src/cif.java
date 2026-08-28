import javax.annotation.Nullable;

public class cif extends cic {
   @Nullable
   private exa b;
   private int c;

   public cif(cia $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.dS().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.dS().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.dS().i() - 0.5F) * 8.0F;
         this.a.dP().a(lm.v, this.a.du() + (double)$$0, this.a.dw() + 2.0 + (double)$$1, this.a.dA() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         jd $$0 = this.a.dP().a(dyy.a.e, ecc.a(this.a.s()));
         this.b = exa.c($$0);
      }

      double $$1 = this.b.c(this.a.du(), this.a.dw(), this.a.dA());
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
   public exa g() {
      return this.b;
   }

   @Override
   public ciq<cif> i() {
      return ciq.j;
   }
}
