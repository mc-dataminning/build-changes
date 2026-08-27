public class frn extends fox<bvi> {
   private final fko a;

   public frn(foy.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.a = $$0.c();
   }

   public void a(bvi $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.5F, 0.0F);
      int $$6 = $$0.k();
      if ((float)$$6 - $$2 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$2 + 1.0F) / 10.0F;
         $$7 = apa.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      $$3.a(a.d.rotationDegrees(-90.0F));
      $$3.a(-0.5F, -0.5F, 0.5F);
      $$3.a(a.d.rotationDegrees(90.0F));
      frm.a(this.a, cpo.ck.n(), $$3, $$4, $$5, $$6 / 5 % 2 == 0);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public acq a(bvi $$0) {
      return fuu.e;
   }
}
