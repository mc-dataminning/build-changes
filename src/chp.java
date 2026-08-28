import javax.annotation.Nullable;

public class chp extends chm {
   @Nullable
   private evz b;
   private int c;

   public chp(chk $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.dS().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.dS().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.dS().i() - 0.5F) * 8.0F;
         this.a.dP().a(lj.v, this.a.du() + (double)$$0, this.a.dw() + 2.0 + (double)$$1, this.a.dA() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         ja $$0 = this.a.dP().a(dxz.a.e, ebd.a(this.a.s()));
         this.b = evz.c($$0);
      }

      double $$1 = this.b.c(this.a.du(), this.a.dw(), this.a.dA());
      if (!($$1 < 100.0) && !($$1 > 22500.0) && !this.a.Q && !this.a.R) {
         this.a.u(1.0F);
      } else {
         this.a.u(0.0F);
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
   public evz g() {
      return this.b;
   }

   @Override
   public cia<chp> i() {
      return cia.j;
   }
}
