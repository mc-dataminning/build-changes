public class cva extends cvg {
   private static final int a = 40;

   public cva(cvg.a $$0) {
      super($$0);
   }

   @Override
   public cvl a(cvl $$0, dds $$1, buf $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof arh $$3) {
         an.A.a($$3, $$0);
         $$3.b(awn.c.b(this));
      }

      if (!$$1.B) {
         $$2.e(bss.s);
      }

      if ($$0.f()) {
         return new cvl(cvo.sm);
      } else {
         if ($$2 instanceof cnp $$4 && !$$4.fP()) {
            cvl $$5 = new cvl(cvo.sm);
            if (!$$4.gc().f($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int a(cvl $$0, buf $$1) {
      return 40;
   }

   @Override
   public cxh b(cvl $$0) {
      return cxh.c;
   }

   @Override
   public awc ao_() {
      return awd.mE;
   }

   @Override
   public awc ap_() {
      return awd.mE;
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      return cvn.a($$0, $$1, $$2);
   }
}
