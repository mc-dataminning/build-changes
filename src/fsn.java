public class fsn extends ftg<brt, fba<brt>> {
   private final fjt a;

   public fsn(fqt<brt, fba<brt>> $$0, fjt $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eij $$0, fjx $$1, int $$2, brt $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fh() == bft.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = apa.e($$3.dA()) / 60.0F;
      if ($$3.dA() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      cfz $$14 = $$10 ? $$3.eO() : $$3.eP();
      this.a.a($$3, $$14, cfw.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
