public class czy extends csm {
   protected static final ehx a = csm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int b = 20;

   public czy(dez.d $$0) {
      super($$0);
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return a;
   }

   @Override
   public ehx b_(dfa $$0, cos $$1, gu $$2) {
      return ehu.b();
   }

   @Override
   public ehx b(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return ehu.b();
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

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   @Override
   public float b(dfa $$0, cos $$1, gu $$2) {
      return 0.2F;
   }
}
