public class cip<T extends bis & bjf> extends cjc {
   private final biw<T> a;
   private final int b;

   public cip(cjc.a $$0, biw<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      if ($$0.B) {
         return bhb.c($$3);
      } else {
         bis $$4 = $$1.cZ();
         if ($$1.bN() && $$4 instanceof bjf $$5 && $$4.ag() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               cjh $$6 = new cjh(cjk.qh);
               $$6.c($$3.v());
               return bhb.a($$6);
            }

            return bhb.a($$3);
         }

         $$1.b(app.c.b(this));
         return bhb.c($$3);
      }
   }
}
