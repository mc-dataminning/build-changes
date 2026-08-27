import javax.annotation.Nullable;

public class bxf extends bxc {
   @Nullable
   private ehe b;
   private int c;

   public bxf(bxa $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.ee().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.ee().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.ee().i() - 0.5F) * 8.0F;
         this.a.dK().a(iv.w, this.a.dp() + (double)$$0, this.a.dr() + 2.0 + (double)$$1, this.a.dv() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         gu $$0 = this.a.dK().a(dkj.a.e, dnm.a(this.a.p()));
         this.b = ehe.c($$0);
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
   public ehe g() {
      return this.b;
   }

   @Override
   public bxq<bxf> i() {
      return bxq.j;
   }
}
