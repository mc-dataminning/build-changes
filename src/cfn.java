public class cfn extends cfu {
   private static final int a = 40;

   public cfn(cfu.a $$0) {
      super($$0);
   }

   @Override
   public cfz a(cfz $$0, cmm $$1, bfz $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof aig $$3) {
         ai.z.a($$3, $$0);
         $$3.b(amr.c.b(this));
      }

      if (!$$1.B) {
         $$2.d(bfc.s);
      }

      if ($$0.b()) {
         return new cfz(cgc.rw);
      } else {
         if ($$2 instanceof byo && !((byo)$$2).fO().d) {
            cfz $$4 = new cfz(cgc.rw);
            byo $$5 = (byo)$$2;
            if (!$$5.fN().e($$4)) {
               $$5.a($$4, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(cfz $$0) {
      return 40;
   }

   @Override
   public chs c(cfz $$0) {
      return chs.c;
   }

   @Override
   public amg af_() {
      return amh.lb;
   }

   @Override
   public amg ag_() {
      return amh.lb;
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      return cgb.a($$0, $$1, $$2);
   }
}
