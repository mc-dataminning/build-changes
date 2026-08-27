public class cvc extends cuc {
   public cvc(cuc.a $$0) {
      super($$0);
   }

   public static cxl d() {
      return cxl.a().a(btv.c, new btt(e, "Weapon modifier", 10.0, btt.a.a), bsd.b).a(btv.e, new btt(f, "Weapon modifier", 2.0, btt.a.a), bsd.b).a();
   }

   public static dai h() {
      dai.a $$0 = new dai.a(dai.a);
      $$0.a(dag.q, 10);
      return $$0.b();
   }

   @Override
   public boolean a(dtc $$0, dca $$1, ir $$2, cly $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cuh $$0, bso $$1, bso $$2) {
      dca $$3 = $$2.dU();
      $$0.a(1, $$2, bsc.a);
      if ($$3.F_().i() < 0.3F) {
         cne $$4 = new cne($$3, $$2);
         $$4.a(cwr.a(cuk.xc, cws.F));
         $$4.a($$1, $$1.dM(), $$1.dK(), -1.0F, 0.0F, 0.0F);
         $$3.b($$4);
      }

      return true;
   }
}
