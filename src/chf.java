import javax.annotation.Nullable;

public class chf extends chc {
   @Nullable
   private ewu b;
   private int c;

   public chf(cha $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.et().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.et().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.et().i() - 0.5F) * 8.0F;
         this.a.dU().a(lb.v, this.a.dz() + (double)$$0, this.a.dB() + 2.0 + (double)$$1, this.a.dF() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         ir $$0 = this.a.dU().a(dyu.a.e, ebz.a(this.a.r()));
         this.b = ewu.c($$0);
      }

      double $$1 = this.b.c(this.a.dz(), this.a.dB(), this.a.dF());
      if (!($$1 < 100.0) && !($$1 > 22500.0) && !this.a.R && !this.a.S) {
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
   public ewu g() {
      return this.b;
   }

   @Override
   public chq<chf> i() {
      return chq.j;
   }
}
