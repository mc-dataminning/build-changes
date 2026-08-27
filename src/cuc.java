public class cuc extends csm {
   private static final tf a = tf.c("container.crafting");

   protected cuc(dez.d $$0) {
      super($$0);
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apg.an);
         return bgq.b;
      }
   }

   @Override
   public bgt b(dfa $$0, cpm $$1, gu $$2) {
      return new bgy(($$2x, $$3, $$4) -> new cet($$2x, $$3, cep.a($$1, $$2)), a);
   }
}
