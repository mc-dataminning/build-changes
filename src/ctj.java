public class ctj<T extends bsd & bsv> extends ctv {
   private final bsj<T> a;
   private final int b;

   public ctj(ctv.a $$0, bsj<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      if ($$0.B) {
         return bqe.c($$3);
      } else {
         bsd $$4 = $$1.dd();
         if ($$1.bR() && $$4 instanceof bsv $$5 && $$4.ak() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, bsy.d($$2));
            if ($$3.e()) {
               cua $$6 = $$3.b(cud.qV, 1);
               return bqe.a($$6);
            }

            return bqe.a($$3);
         }

         $$1.b(avp.c.b(this));
         return bqe.c($$3);
      }
   }
}
