public class cqb extends cqh {
   private static final int a = 40;

   public cqb(cqh.a $$0) {
      super($$0);
   }

   @Override
   public cqm a(cqm $$0, cxb $$1, bpp $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof apg $$3) {
         am.A.a($$3, $$0);
         $$3.b(aui.c.b(this));
      }

      if (!$$1.B) {
         $$2.e(bom.s);
      }

      if ($$0.b()) {
         return new cqm(cqp.sk);
      } else {
         if ($$2 instanceof ciu $$4 && !$$4.fM()) {
            cqm $$5 = new cqm(cqp.sk);
            if (!$$4.fZ().e($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(cqm $$0) {
      return 40;
   }

   @Override
   public csf c(cqm $$0) {
      return csf.c;
   }

   @Override
   public atx an_() {
      return aty.mm;
   }

   @Override
   public atx ao_() {
      return aty.mm;
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      return cqo.a($$0, $$1, $$2);
   }
}
