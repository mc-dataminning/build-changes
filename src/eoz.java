public class eoz implements epa {
   private final dbz b;

   public eoz(dbz $$0) {
      this.b = $$0;
   }

   @Override
   public void a(je $$0, dsd $$1, iz $$2, iz $$3, int $$4, int $$5) {
      epa.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(iz $$0, dfa $$1, iz $$2) {
      dsd $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dsd $$0, iz $$1, dfa $$2, iz $$3, boolean $$4) {
      epa.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
