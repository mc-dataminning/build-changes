public class dbm extends cst {
   protected static final ehw a = csl.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   protected dbm(dey.d $$0) {
      super($$0);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof akk && $$3 instanceof cdf) {
         $$1.a(new gu($$2), true, $$3);
      }
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return a;
   }

   @Override
   protected boolean d(dez $$0, cor $$1, gu $$2) {
      eac $$3 = $$1.b_($$2);
      eac $$4 = $$1.b_($$2.c());
      return ($$3.a() == ead.c || $$0.b() instanceof cwg) && $$4.a() == ead.a;
   }
}
