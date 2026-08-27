public class dbq extends daf implements dbn {
   private final dbn.a F;

   public dbq(dbn.a $$0, dez $$1, dey.d $$2) {
      super($$1, $$2);
      this.F = $$0;
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dez $$0) {
      return dbn.c($$0.b()).isPresent();
   }

   public dbn.a g() {
      return this.F;
   }
}
