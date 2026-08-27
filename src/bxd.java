import javax.annotation.Nullable;

public class bxd extends bxa {
   @Nullable
   private ehf b;
   private int c;

   public bxd(bwy $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.ee().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.ee().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.ee().i() - 0.5F) * 8.0F;
         this.a.dK().a(iw.w, this.a.dp() + (double)$$0, this.a.dr() + 2.0 + (double)$$1, this.a.dv() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         gv $$0 = this.a.dK().a(dkh.a.e, dnk.a(this.a.p()));
         this.b = ehf.c($$0);
      }

      double $$1 = this.b.c(this.a.dp(), this.a.dr(), this.a.dv());
      if (!($$1 < 100.0) && !($$1 > 22500.0) && !this.a.P && !this.a.Q) {
         this.a.c(1.0F);
      } else {
         this.a.c(0.0F);
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
   public ehf g() {
      return this.b;
   }

   @Override
   public bxo<bxd> i() {
      return bxo.j;
   }
}
