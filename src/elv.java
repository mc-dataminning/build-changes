public class elv implements elw {
   private final cyx b;

   public elv(cyx $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ih $$0, doz $$1, ib $$2, ib $$3, int $$4, int $$5) {
      elw.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(ib $$0, dby $$1, ib $$2) {
      doz $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(doz $$0, ib $$1, dby $$2, ib $$3, boolean $$4) {
      elw.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
