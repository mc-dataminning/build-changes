public class ega implements egb {
   private final ctx b;

   public ega(ctx $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ic $$0, djp $$1, hx $$2, hx $$3, int $$4, int $$5) {
      egb.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(hx $$0, cwy $$1, hx $$2) {
      djp $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(djp $$0, hx $$1, cwy $$2, hx $$3, boolean $$4) {
      egb.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
