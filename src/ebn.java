public class ebn implements ebo {
   private final cpv b;

   public ebn(cpv $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ha $$0, dfj $$1, gw $$2, gw $$3, int $$4, int $$5) {
      ebo.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(gw $$0, csv $$1, gw $$2) {
      dfj $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dfj $$0, gw $$1, csv $$2, gw $$3, boolean $$4) {
      ebo.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
