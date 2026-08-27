public class frw extends ftu<bun, fdz<bun>> {
   public frw(fso.a $$0) {
      super($$0, new fdz<>($$0.a(fhm.n)), 0.4F);
      this.a(new fvy(this, $$0.f()));
   }

   public aer a(bun $$0) {
      return $$0.gf();
   }

   protected void a(bun $$0, elg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(bun $$0, elg $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.E($$4);
      if ($$5 > 0.0F) {
         $$1.a(0.4F * $$5, 0.15F * $$5, 0.1F * $$5);
         $$1.a(a.f.rotationDegrees(arp.j($$5, 0.0F, 90.0F)));
         gu $$6 = $$0.dk();

         for (cbn $$8 : $$0.dK().a(cbn.class, new egz($$6).c(2.0, 2.0, 2.0))) {
            if ($$8.fB()) {
               $$1.a(0.15F * $$5, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
