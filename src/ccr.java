import javax.annotation.Nullable;

public class ccr extends cco {
   @Nullable
   private ens b;
   private int c;

   public ccr(ccm $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.eh().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.eh().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.eh().i() - 0.5F) * 8.0F;
         this.a.dM().a(jz.w, this.a.dr() + (double)$$0, this.a.dt() + 2.0 + (double)$$1, this.a.dx() + (double)$$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c() {
      this.c++;
      if (this.b == null) {
         hz $$0 = this.a.dM().a(dqo.a.e, dtr.a(this.a.u()));
         this.b = ens.c($$0);
      }

      double $$1 = this.b.c(this.a.dr(), this.a.dt(), this.a.dx());
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
   public ens g() {
      return this.b;
   }

   @Override
   public cdc<ccr> i() {
      return cdc.j;
   }
}
