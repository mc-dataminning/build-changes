import javax.annotation.Nullable;

public class cmb extends cly {
   @Nullable
   private fei b;
   private int c;

   public cmb(clw $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.dY().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.dY().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.dY().i() - 0.5F) * 8.0F;
         this.a.dV().a(lx.v, this.a.dA() + (double)$$0, this.a.dC() + 2.0 + (double)$$1, this.a.dG() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(arq $$0) {
      this.c++;
      if (this.b == null) {
         iu $$1 = $$0.a(efy.a.e, ejd.a(this.a.j()));
         this.b = fei.c($$1);
      }

      double $$2 = this.b.c(this.a.dA(), this.a.dC(), this.a.dG());
      if (!($$2 < 100.0) && !($$2 > 22500.0) && !this.a.P && !this.a.Q) {
         this.a.d(1.0F);
      } else {
         this.a.d(0.0F);
      }
   }

   @Override
   public void c() {
      this.b = null;
      this.c = 0;
   }

   @Override
   public float e() {
      return 3.0F;
   }

   @Nullable
   @Override
   public fei f() {
      return this.b;
   }

   @Override
   public cmm<cmb> h() {
      return cmm.j;
   }
}
