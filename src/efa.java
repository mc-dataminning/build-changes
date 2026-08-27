public class efa implements efb {
   private final csy b;

   public efa(csy $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ia $$0, dip $$1, hv $$2, hv $$3, int $$4, int $$5) {
      efb.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(hv $$0, cvz $$1, hv $$2) {
      dip $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dip $$0, hv $$1, cvz $$2, hv $$3, boolean $$4) {
      efb.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
