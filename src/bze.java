import javax.annotation.Nullable;

public class bze extends bzb {
   @Nullable
   private eji b;
   private int c;

   public bze(byz $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.ef().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.ef().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.ef().i() - 0.5F) * 8.0F;
         this.a.dL().a(js.w, this.a.dq() + (double)$$0, this.a.ds() + 2.0 + (double)$$1, this.a.dw() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         ht $$0 = this.a.dL().a(dmf.a.e, dpi.a(this.a.s()));
         this.b = eji.c($$0);
      }

      double $$1 = this.b.c(this.a.dq(), this.a.ds(), this.a.dw());
      if (!($$1 < 100.0) && !($$1 > 22500.0) && !this.a.P && !this.a.Q) {
         this.a.c(1.0F);
      } else {
         this.a.c(0.0F);
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
   public eji g() {
      return this.b;
   }

   @Override
   public bzp<bze> i() {
      return bzp.j;
   }
}
