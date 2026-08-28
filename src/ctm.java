public class ctm<T extends bsh & bsz> extends cty {
   private final bsn<T> a;
   private final int b;

   public ctm(cty.a $$0, bsn<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      if ($$0.B) {
         return bqi.c($$3);
      } else {
         bsh $$4 = $$1.df();
         if ($$1.bT() && $$4 instanceof bsz $$5 && $$4.am() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, btc.d($$2));
            if ($$3.e()) {
               cud $$6 = $$3.b(cug.qV, 1);
               return bqi.a($$6);
            }

            return bqi.a($$3);
         }

         $$1.b(avr.c.b(this));
         return bqi.c($$3);
      }
   }
}
