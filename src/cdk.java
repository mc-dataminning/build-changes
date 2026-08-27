import javax.annotation.Nullable;

public class cdk extends cdh {
   @Nullable
   private eov b;
   private int c;

   public cdk(cdf $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.ef().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.ef().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.ef().i() - 0.5F) * 8.0F;
         this.a.dJ().a(kb.w, this.a.do() + (double)$$0, this.a.dq() + 2.0 + (double)$$1, this.a.du() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         ib $$0 = this.a.dJ().a(drq.a.e, dut.a(this.a.u()));
         this.b = eov.c($$0);
      }

      double $$1 = this.b.c(this.a.do(), this.a.dq(), this.a.du());
      if (!($$1 < 100.0) && !($$1 > 22500.0) && !this.a.O && !this.a.P) {
         this.a.t(1.0F);
      } else {
         this.a.t(0.0F);
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
   public eov g() {
      return this.b;
   }

   @Override
   public cdv<cdk> i() {
      return cdv.j;
   }
}
