public class eox implements eoy {
   private final dbx b;

   public eox(dbx $$0) {
      this.b = $$0;
   }

   @Override
   public void a(je $$0, dsb $$1, iz $$2, iz $$3, int $$4, int $$5) {
      eoy.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(iz $$0, dey $$1, iz $$2) {
      dsb $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dsb $$0, iz $$1, dey $$2, iz $$3, boolean $$4) {
      eoy.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
