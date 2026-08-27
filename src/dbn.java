public class dbn extends csu {
   protected static final ehx a = csm.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   protected dbn(dez.d $$0) {
      super($$0);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof akk && $$3 instanceof cdg) {
         $$1.a(new gu($$2), true, $$3);
      }
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return a;
   }

   @Override
   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      ead $$3 = $$1.b_($$2);
      ead $$4 = $$1.b_($$2.c());
      return ($$3.a() == eae.c || $$0.b() instanceof cwh) && $$4.a() == eae.a;
   }
}
