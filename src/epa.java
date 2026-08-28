public class epa implements epb {
   private final dca b;

   public epa(dca $$0) {
      this.b = $$0;
   }

   @Override
   public void a(je $$0, dse $$1, iz $$2, iz $$3, int $$4, int $$5) {
      epb.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(iz $$0, dfb $$1, iz $$2) {
      dse $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dse $$0, iz $$1, dfb $$2, iz $$3, boolean $$4) {
      epb.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
