public class dbp extends czo implements dbn {
   private final dbn.a e;

   public dbp(dbn.a $$0, dey.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
