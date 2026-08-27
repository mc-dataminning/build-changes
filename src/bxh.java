import javax.annotation.Nullable;

public class bxh extends bxe {
   @Nullable
   private ehi b;
   private int c;

   public bxh(bxc $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.ee().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.ee().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.ee().i() - 0.5F) * 8.0F;
         this.a.dK().a(ix.w, this.a.dp() + (double)$$0, this.a.dr() + 2.0 + (double)$$1, this.a.dv() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         gw $$0 = this.a.dK().a(dkn.a.e, dnq.a(this.a.p()));
         this.b = ehi.c($$0);
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
   public ehi g() {
      return this.b;
   }

   @Override
   public bxs<bxh> i() {
      return bxs.j;
   }
}
