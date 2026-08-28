import javax.annotation.Nullable;

public class chs extends chp {
   @Nullable
   private ewf b;
   private int c;

   public chs(chn $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.dT().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.dT().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.dT().i() - 0.5F) * 8.0F;
         this.a.dQ().a(lj.v, this.a.dv() + (double)$$0, this.a.dx() + 2.0 + (double)$$1, this.a.dB() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         ja $$0 = this.a.dQ().a(dyf.a.e, ebj.a(this.a.s()));
         this.b = ewf.c($$0);
      }

      double $$1 = this.b.c(this.a.dv(), this.a.dx(), this.a.dB());
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
   public ewf g() {
      return this.b;
   }

   @Override
   public cid<chs> i() {
      return cid.j;
   }
}
