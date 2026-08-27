public class frm extends fqd<car> {
   private final fko f;

   public frm(foy.a $$0) {
      super($$0, fed.bA);
      this.f = $$0.c();
   }

   protected void a(car $$0, float $$1, dcb $$2, eij $$3, fjx $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = apa.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(fko $$0, dcb $$1, eij $$2, fjx $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = fum.a(fum.a(1.0F), 10);
      } else {
         $$6 = fum.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
