import javax.annotation.Nullable;

public class cfu extends cfr {
   @Nullable
   private etf b;
   private int c;

   public cfu(cfp $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.ej().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.ej().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.ej().i() - 0.5F) * 8.0F;
         this.a.dN().a(kw.v, this.a.ds() + (double)$$0, this.a.du() + 2.0 + (double)$$1, this.a.dy() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         im $$0 = this.a.dN().a(dvq.a.e, dyt.a(this.a.r()));
         this.b = etf.c($$0);
      }

      double $$1 = this.b.c(this.a.ds(), this.a.du(), this.a.dy());
      if (!($$1 < 100.0) && !($$1 > 22500.0) && !this.a.Q && !this.a.R) {
         this.a.t(1.0F);
      } else {
         this.a.t(0.0F);
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
   public etf g() {
      return this.b;
   }

   @Override
   public cgf<cfu> i() {
      return cgf.j;
   }
}
