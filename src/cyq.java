public class cyq extends cpn implements cyp {
   private final cyp.a d;

   public cyq(cyp.a $$0, dca.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dcb $$0) {
      return cyp.c($$0.b()).isPresent();
   }

   public cyp.a g() {
      return this.d;
   }
}
