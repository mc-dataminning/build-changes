public class ebh implements ebi {
   private final cqb b;

   public ebh(cqb $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ha $$0, dfd $$1, gw $$2, gw $$3, int $$4, int $$5) {
      ebi.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(gw $$0, ctc $$1, gw $$2) {
      dfd $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dfd $$0, gw $$1, ctc $$2, gw $$3, boolean $$4) {
      ebi.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
