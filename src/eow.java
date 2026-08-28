public class eow implements eox {
   private final dbw b;

   public eow(dbw $$0) {
      this.b = $$0;
   }

   @Override
   public void a(je $$0, dsa $$1, iz $$2, iz $$3, int $$4, int $$5) {
      eox.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(iz $$0, dex $$1, iz $$2) {
      dsa $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dsa $$0, iz $$1, dex $$2, iz $$3, boolean $$4) {
      eox.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
