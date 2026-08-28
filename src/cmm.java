import javax.annotation.Nullable;

public class cmm extends cmj {
   @Nullable
   private fex b;
   private int c;

   public cmm(cmh $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.dX().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.dX().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.dX().i() - 0.5F) * 8.0F;
         this.a.dU().a(ly.v, this.a.dz() + (double)$$0, this.a.dB() + 2.0 + (double)$$1, this.a.dF() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(arq $$0) {
      this.c++;
      if (this.b == null) {
         iv $$1 = $$0.a(egn.a.e, ejs.a(this.a.j()));
         this.b = fex.c($$1);
      }

      double $$2 = this.b.c(this.a.dz(), this.a.dB(), this.a.dF());
      if (!($$2 < 100.0) && !($$2 > 22500.0) && !this.a.P && !this.a.Q) {
         this.a.d(1.0F);
      } else {
         this.a.d(0.0F);
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
   public fex f() {
      return this.b;
   }

   @Override
   public cmx<cmm> h() {
      return cmx.j;
   }
}
