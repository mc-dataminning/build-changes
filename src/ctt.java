public class ctt<T extends bsp & bth> extends cuf {
   private final bsv<T> a;
   private final int b;

   public ctt(cuf.a $$0, bsv<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      if ($$0.B) {
         return bqq.c($$3);
      } else {
         bsp $$4 = $$1.dd();
         if ($$1.bR() && $$4 instanceof bth $$5 && $$4.ak() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, btk.d($$2));
            if ($$3.e()) {
               cuk $$6 = $$3.b(cun.qV, 1);
               return bqq.a($$6);
            }

            return bqq.a($$3);
         }

         $$1.b(awg.c.b(this));
         return bqq.c($$3);
      }
   }
}
