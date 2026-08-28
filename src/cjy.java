import javax.annotation.Nullable;

public class cjy extends cjv {
   @Nullable
   private fay b;
   private int c;

   public cjy(cjt $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.dZ().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.dZ().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.dZ().i() - 0.5F) * 8.0F;
         this.a.dW().a(lt.v, this.a.dB() + (double)$$0, this.a.dD() + 2.0 + (double)$$1, this.a.dH() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(arc $$0) {
      this.c++;
      if (this.b == null) {
         ji $$1 = $$0.a(ecq.a.e, efv.a(this.a.m()));
         this.b = fay.c($$1);
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
   public fay f() {
      return this.b;
   }

   @Override
   public ckj<cjy> h() {
      return ckj.j;
   }
}
