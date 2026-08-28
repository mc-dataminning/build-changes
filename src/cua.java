public class cua<T extends bsw & bto> extends cum {
   private final btc<T> a;
   private final int b;

   public cua(cum.a $$0, btc<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      cur $$3 = $$1.b($$2);
      if ($$0.B) {
         return bqx.c($$3);
      } else {
         bsw $$4 = $$1.dd();
         if ($$1.bR() && $$4 instanceof bto $$5 && $$4.ak() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, btr.d($$2));
            if ($$3.e()) {
               cur $$6 = $$3.b(cuu.qV, 1);
               return bqx.a($$6);
            }

            return bqx.a($$3);
         }

         $$1.b(awk.c.b(this));
         return bqx.c($$3);
      }
   }
}
