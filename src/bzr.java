import javax.annotation.Nullable;

public class bzr extends bzo {
   @Nullable
   private ejz b;
   private int c;

   public bzr(bzm $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.eh().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.eh().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.eh().i() - 0.5F) * 8.0F;
         this.a.dN().a(jw.w, this.a.ds() + (double)$$0, this.a.du() + 2.0 + (double)$$1, this.a.dy() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         hx $$0 = this.a.dN().a(dmw.a.e, dpz.a(this.a.u()));
         this.b = ejz.c($$0);
      }

      double $$1 = this.b.c(this.a.ds(), this.a.du(), this.a.dy());
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
   public ejz g() {
      return this.b;
   }

   @Override
   public cac<bzr> i() {
      return cac.j;
   }
}
