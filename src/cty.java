public class cty<T extends bsu & btm> extends cuk {
   private final bta<T> a;
   private final int b;

   public cty(cuk.a $$0, bta<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      cup $$3 = $$1.b($$2);
      if ($$0.B) {
         return bqv.c($$3);
      } else {
         bsu $$4 = $$1.dd();
         if ($$1.bR() && $$4 instanceof btm $$5 && $$4.ak() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, btp.d($$2));
            if ($$3.e()) {
               cup $$6 = $$3.b(cus.qV, 1);
               return bqv.a($$6);
            }

            return bqv.a($$3);
         }

         $$1.b(awk.c.b(this));
         return bqv.c($$3);
      }
   }
}
