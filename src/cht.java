import javax.annotation.Nullable;

public class cht extends chq {
   @Nullable
   private ewh b;
   private int c;

   public cht(cho $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.dU().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.dU().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.dU().i() - 0.5F) * 8.0F;
         this.a.dR().a(lj.v, this.a.dw() + (double)$$0, this.a.dy() + 2.0 + (double)$$1, this.a.dC() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         ja $$0 = this.a.dR().a(dyg.a.e, ebk.a(this.a.s()));
         this.b = ewh.c($$0);
      }

      double $$1 = this.b.c(this.a.dw(), this.a.dy(), this.a.dC());
      if (!($$1 < 100.0) && !($$1 > 22500.0) && !this.a.Q && !this.a.R) {
         this.a.u(1.0F);
      } else {
         this.a.u(0.0F);
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
   public ewh g() {
      return this.b;
   }

   @Override
   public cie<cht> i() {
      return cie.j;
   }
}
