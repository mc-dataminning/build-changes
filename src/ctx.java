public class ctx<T extends bsq & bti> extends cuj {
   private final bsw<T> a;
   private final int b;

   public ctx(cuj.a $$0, bsw<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      if ($$0.B) {
         return bqr.c($$3);
      } else {
         bsq $$4 = $$1.de();
         if ($$1.bS() && $$4 instanceof bti $$5 && $$4.am() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, btl.d($$2));
            if ($$3.e()) {
               cuo $$6 = $$3.b(cur.qV, 1);
               return bqr.a($$6);
            }

            return bqr.a($$3);
         }

         $$1.b(avy.c.b(this));
         return bqr.c($$3);
      }
   }
}
