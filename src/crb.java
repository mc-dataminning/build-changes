public class crb<T extends bqa & bqq> extends crn {
   private final bqg<T> a;
   private final int b;

   public crb(crn.a $$0, bqg<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      if ($$0.B) {
         return bog.c($$3);
      } else {
         bqa $$4 = $$1.da();
         if ($$1.bO() && $$4 instanceof bqq $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, bqt.d($$2));
            if ($$3.d()) {
               crs $$6 = $$3.b(crv.qU, 1);
               return bog.a($$6);
            }

            return bog.a($$3);
         }

         $$1.b(auz.c.b(this));
         return bog.c($$3);
      }
   }
}
