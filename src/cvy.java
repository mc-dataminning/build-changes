public class cvy extends cvg {
   private static final int a = 32;

   public cvy(cvg.a $$0) {
      super($$0);
   }

   @Override
   public cvl a(cvl $$0, dds $$1, buf $$2) {
      if ($$2 instanceof arh $$3) {
         an.A.a($$3, $$0);
         $$3.b(awn.c.b(this));
      }

      if (!$$1.B) {
         $$2.ew();
      }

      if ($$2 instanceof cnp $$4) {
         return cvn.a($$0, $$4, new cvl(cvo.qz), false);
      } else {
         $$0.a(1, $$2);
         return $$0;
      }
   }

   @Override
   public int a(cvl $$0, buf $$1) {
      return 32;
   }

   @Override
   public cxh b(cvl $$0) {
      return cxh.c;
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      return cvn.a($$0, $$1, $$2);
   }
}
