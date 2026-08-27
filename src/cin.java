public class cin<T extends biq & bjd> extends cja {
   private final biu<T> a;
   private final int b;

   public cin(cja.a $$0, biu<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      if ($$0.B) {
         return bgz.c($$3);
      } else {
         biq $$4 = $$1.cZ();
         if ($$1.bN() && $$4 instanceof bjd $$5 && $$4.ag() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               cjf $$6 = new cjf(cji.qh);
               $$6.c($$3.v());
               return bgz.a($$6);
            }

            return bgz.a($$3);
         }

         $$1.b(apo.c.b(this));
         return bgz.c($$3);
      }
   }
}
