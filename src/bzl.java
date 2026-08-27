public class bzl extends byu {
   private int f = 200;

   public bzl(bfn<? extends bzl> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public bzl(cmm $$0, bfz $$1) {
      super(bfn.aR, $$1, $$0);
   }

   public bzl(cmm $$0, double $$1, double $$2, double $$3) {
      super(bfn.aR, $$1, $$2, $$3, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.dI().B && !this.b) {
         this.dI().a(iv.N, this.dn(), this.dp(), this.dt(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected cfz p() {
      return new cfz(cgc.uv);
   }

   @Override
   protected void a(bfz $$0) {
      super.a($$0);
      bfa $$1 = new bfa(bfc.x, this.f, 0);
      $$0.b($$1, this.A());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }
}
