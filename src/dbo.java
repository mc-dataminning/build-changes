public class dbo extends csl implements dbn {
   private final dbn.a d;

   public dbo(dbn.a $$0, dey.d $$1) {
      super($$1);
      this.d = $$0;
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
      return this.d;
   }
}
