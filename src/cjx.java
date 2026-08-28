import javax.annotation.Nullable;

public class cjx extends cju {
   @Nullable
   private ezr b;
   private int c;

   public cjx(cjs $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.eb().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.eb().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.eb().i() - 0.5F) * 8.0F;
         this.a.dY().a(ls.v, this.a.dD() + (double)$$0, this.a.dF() + 2.0 + (double)$$1, this.a.dJ() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         jh $$0 = this.a.dY().a(ebj.a.e, eeo.a(this.a.q()));
         this.b = ezr.c($$0);
      }

      double $$1 = this.b.c(this.a.dD(), this.a.dF(), this.a.dJ());
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
   public ezr g() {
      return this.b;
   }

   @Override
   public cki<cjx> i() {
      return cki.j;
   }
}
