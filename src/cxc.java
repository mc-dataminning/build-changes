public class cxc extends csm {
   private static final int a = 20;

   public cxc(dez.d $$0) {
      super($$0);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, bii $$3) {
      if (!$$3.bS() && $$3 instanceof biy && !cnh.j((biy)$$3)) {
         $$3.a($$0.ag().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      csr.b($$1, $$2.c(), $$0);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$1 == ha.b && $$2.a(csn.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
