public class cjr<T extends bjt & bkg> extends cke {
   private final bjx<T> a;
   private final int b;

   public cjr(cke.a $$0, bjx<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      if ($$0.B) {
         return bic.c($$3);
      } else {
         bjt $$4 = $$1.cZ();
         if ($$1.bN() && $$4 instanceof bkg $$5 && $$4.ag() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               ckj $$6 = new ckj(ckm.qh);
               $$6.c($$3.v());
               return bic.a($$6);
            }

            return bic.a($$3);
         }

         $$1.b(aqn.c.b(this));
         return bic.c($$3);
      }
   }
}
