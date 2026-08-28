import javax.annotation.Nullable;

public class cjc extends ciz {
   @Nullable
   private eys b;
   private int c;

   public cjc(cix $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.dV().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.dV().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.dV().i() - 0.5F) * 8.0F;
         this.a.dS().a(ln.v, this.a.dx() + (double)$$0, this.a.dz() + 2.0 + (double)$$1, this.a.dD() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         je $$0 = this.a.dS().a(eak.a.e, edp.a(this.a.q()));
         this.b = eys.c($$0);
      }

      double $$1 = this.b.c(this.a.dx(), this.a.dz(), this.a.dD());
      if (!($$1 < 100.0) && !($$1 > 22500.0) && !this.a.Q && !this.a.R) {
         this.a.x(1.0F);
      } else {
         this.a.x(0.0F);
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
   public eys g() {
      return this.b;
   }

   @Override
   public cjn<cjc> i() {
      return cjn.j;
   }
}
