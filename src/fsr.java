public class fsr extends fup<buw, feq<buw>> {
   public fsr(ftj.a $$0) {
      super($$0, new feq<>($$0.a(fid.n)), 0.4F);
      this.a(new fwt(this, $$0.f()));
   }

   public aey a(buw $$0) {
      return $$0.gj();
   }

   protected void a(buw $$0, elr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(buw $$0, elr $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.E($$4);
      if ($$5 > 0.0F) {
         $$1.a(0.4F * $$5, 0.15F * $$5, 0.1F * $$5);
         $$1.a(a.f.rotationDegrees(ary.j($$5, 0.0F, 90.0F)));
         gw $$6 = $$0.dl();

         for (cbw $$8 : $$0.dL().a(cbw.class, new ehk($$6).c(2.0, 2.0, 2.0))) {
            if ($$8.fC()) {
               $$1.a(0.15F * $$5, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
