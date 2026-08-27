public class cfh<T extends bfj & bfw> extends cfu {
   private final bfn<T> a;
   private final int b;

   public cfh(cfu.a $$0, bfn<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      cfz $$3 = $$1.b($$2);
      if ($$0.B) {
         return bdy.c($$3);
      } else {
         bfj $$4 = $$1.cX();
         if ($$1.bM() && $$4 instanceof bfw $$5 && $$4.ae() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               cfz $$6 = new cfz(cgc.qh);
               $$6.c($$3.v());
               return bdy.a($$6);
            }

            return bdy.a($$3);
         }

         $$1.b(amr.c.b(this));
         return bdy.c($$3);
      }
   }
}
