import javax.annotation.Nullable;

public class cad extends caa {
   @Nullable
   private elb b;
   private int c;

   public cad(bzy $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.eg().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.eg().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.eg().i() - 0.5F) * 8.0F;
         this.a.dM().a(jv.w, this.a.dr() + (double)$$0, this.a.dt() + 2.0 + (double)$$1, this.a.dx() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         hv $$0 = this.a.dM().a(dny.a.e, drb.a(this.a.u()));
         this.b = elb.c($$0);
      }

      double $$1 = this.b.c(this.a.dr(), this.a.dt(), this.a.dx());
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
   public elb g() {
      return this.b;
   }

   @Override
   public cao<cad> i() {
      return cao.j;
   }
}
