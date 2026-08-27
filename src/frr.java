public class frr extends ftp<bul, fdv<bul>> {
   public frr(fsj.a $$0) {
      super($$0, new fdv<>($$0.a(fhi.n)), 0.4F);
      this.a(new fvt(this, $$0.f()));
   }

   public aep a(bul $$0) {
      return $$0.gf();
   }

   protected void a(bul $$0, elh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(bul $$0, elh $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.E($$4);
      if ($$5 > 0.0F) {
         $$1.a(0.4F * $$5, 0.15F * $$5, 0.1F * $$5);
         $$1.a(a.f.rotationDegrees(aro.j($$5, 0.0F, 90.0F)));
         gv $$6 = $$0.dk();

         for (cbl $$8 : $$0.dK().a(cbl.class, new eha($$6).c(2.0, 2.0, 2.0))) {
            if ($$8.fB()) {
               $$1.a(0.15F * $$5, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
