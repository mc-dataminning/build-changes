public class edh implements edi {
   private final crs b;

   public edh(crs $$0) {
      this.b = $$0;
   }

   @Override
   public void a(hx $$0, dgw $$1, ht $$2, ht $$3, int $$4, int $$5) {
      edi.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(ht $$0, cut $$1, ht $$2) {
      dgw $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dgw $$0, ht $$1, cut $$2, ht $$3, boolean $$4) {
      edi.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
