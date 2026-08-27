public class cmg<T extends blv & bmi> extends cmt {
   private final blz<T> a;
   private final int b;

   public cmg(cmt.a $$0, blz<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      cmy $$3 = $$1.b($$2);
      if ($$0.B) {
         return bkc.c($$3);
      } else {
         blv $$4 = $$1.da();
         if ($$1.bO() && $$4 instanceof bmi $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               cmy $$6 = new cmy(cnb.qS);
               $$6.c($$3.v());
               return bkc.a($$6);
            }

            return bkc.a($$3);
         }

         $$1.b(asc.c.b(this));
         return bkc.c($$3);
      }
   }
}
