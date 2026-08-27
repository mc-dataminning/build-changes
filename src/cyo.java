public class cyo extends cpv {
   protected static final efb a = cpn.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   protected cyo(dca.d $$0) {
      super($$0);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aif && $$3 instanceof cah) {
         $$1.a(new gu($$2), true, $$3);
      }
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return a;
   }

   @Override
   protected boolean d(dcb $$0, cls $$1, gu $$2) {
      dxe $$3 = $$1.b_($$2);
      dxe $$4 = $$1.b_($$2.c());
      return ($$3.a() == dxf.c || $$0.b() instanceof cti) && $$4.a() == dxf.a;
   }
}
