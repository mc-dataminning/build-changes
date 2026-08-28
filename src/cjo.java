import javax.annotation.Nullable;

public class cjo extends cjl {
   @Nullable
   private ezh b;
   private int c;

   public cjo(cjj $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.ea().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.ea().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.ea().i() - 0.5F) * 8.0F;
         this.a.dX().a(lq.v, this.a.dC() + (double)$$0, this.a.dE() + 2.0 + (double)$$1, this.a.dI() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         jg $$0 = this.a.dX().a(eaz.a.e, eee.a(this.a.q()));
         this.b = ezh.c($$0);
      }

      double $$1 = this.b.c(this.a.dC(), this.a.dE(), this.a.dI());
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
   public ezh g() {
      return this.b;
   }

   @Override
   public cjz<cjo> i() {
      return cjz.j;
   }
}
