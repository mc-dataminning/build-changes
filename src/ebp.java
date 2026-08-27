public class ebp implements ebq {
   private final cpx b;

   public ebp(cpx $$0) {
      this.b = $$0;
   }

   @Override
   public void a(hc $$0, dfl $$1, gw $$2, gw $$3, int $$4, int $$5) {
      ebq.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(gw $$0, csx $$1, gw $$2) {
      dfl $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dfl $$0, gw $$1, csx $$2, gw $$3, boolean $$4) {
      ebq.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
