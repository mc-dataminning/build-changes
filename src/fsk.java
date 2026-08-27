public class fsk extends fui<bup, fej<bup>> {
   public fsk(ftc.a $$0) {
      super($$0, new fej<>($$0.a(fhw.n)), 0.4F);
      this.a(new fwm(this, $$0.f()));
   }

   public aeu a(bup $$0) {
      return $$0.gg();
   }

   protected void a(bup $$0, elk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(bup $$0, elk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.E($$4);
      if ($$5 > 0.0F) {
         $$1.a(0.4F * $$5, 0.15F * $$5, 0.1F * $$5);
         $$1.a(a.f.rotationDegrees(ars.j($$5, 0.0F, 90.0F)));
         gw $$6 = $$0.dk();

         for (cbp $$8 : $$0.dK().a(cbp.class, new ehd($$6).c(2.0, 2.0, 2.0))) {
            if ($$8.fB()) {
               $$1.a(0.15F * $$5, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
