public class dbr extends csy {
   protected static final eib a = csq.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   protected dbr(dfd.d $$0) {
      super($$0);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof akn && $$3 instanceof cdi) {
         $$1.a(new gw($$2), true, $$3);
      }
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return a;
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      eah $$3 = $$1.b_($$2);
      eah $$4 = $$1.b_($$2.c());
      return ($$3.a() == eai.c || $$0.b() instanceof cwl) && $$4.a() == eai.a;
   }
}
