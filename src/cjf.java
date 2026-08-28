import javax.annotation.Nullable;

public class cjf extends cjc {
   @Nullable
   private eyw b;
   private int c;

   public cjf(cja $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.dV().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.dV().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.dV().i() - 0.5F) * 8.0F;
         this.a.dS().a(lo.v, this.a.dx() + (double)$$0, this.a.dz() + 2.0 + (double)$$1, this.a.dD() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         jf $$0 = this.a.dS().a(eao.a.e, edt.a(this.a.q()));
         this.b = eyw.c($$0);
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
   public eyw g() {
      return this.b;
   }

   @Override
   public cjq<cjf> i() {
      return cjq.j;
   }
}
