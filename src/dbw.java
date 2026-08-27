public class dbw extends ctd {
   protected static final eig a = csv.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   protected dbw(dfi.d $$0) {
      super($$0);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof akr && $$3 instanceof cdn) {
         $$1.a(new gw($$2), true, $$3);
      }
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return a;
   }

   @Override
   protected boolean d(dfj $$0, cpb $$1, gw $$2) {
      eam $$3 = $$1.b_($$2);
      eam $$4 = $$1.b_($$2.c());
      return ($$3.a() == ean.c || $$0.b() instanceof cwq) && $$4.a() == ean.a;
   }
}
