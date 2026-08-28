import javax.annotation.Nullable;

public class ckz extends ckw {
   @Nullable
   private fby b;
   private int c;

   public ckz(cku $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.dZ().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.dZ().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.dZ().i() - 0.5F) * 8.0F;
         this.a.dW().a(ls.v, this.a.dB() + (double)$$0, this.a.dD() + 2.0 + (double)$$1, this.a.dH() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(ash $$0) {
      this.c++;
      if (this.b == null) {
         jh $$1 = $$0.a(edq.a.e, egv.a(this.a.m()));
         this.b = fby.c($$1);
      }

      double $$2 = this.b.c(this.a.dB(), this.a.dD(), this.a.dH());
      if (!($$2 < 100.0) && !($$2 > 22500.0) && !this.a.P && !this.a.Q) {
         this.a.x(1.0F);
      } else {
         this.a.x(0.0F);
      }
   }

   @Override
   public void c() {
      this.b = null;
      this.c = 0;
   }

   @Override
   public float e() {
      return 3.0F;
   }

   @Nullable
   @Override
   public fby f() {
      return this.b;
   }

   @Override
   public clk<ckz> h() {
      return clk.j;
   }
}
