public class cqs<T extends bpv & bql> extends cre {
   private final bqb<T> a;
   private final int b;

   public cqs(cre.a $$0, bqb<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      crj $$3 = $$1.b($$2);
      if ($$0.B) {
         return bob.c($$3);
      } else {
         bpv $$4 = $$1.da();
         if ($$1.bO() && $$4 instanceof bql $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, bqo.d($$2));
            if ($$3.d()) {
               crj $$6 = $$3.b(crm.qU, 1);
               return bob.a($$6);
            }

            return bob.a($$3);
         }

         $$1.b(auw.c.b(this));
         return bob.c($$3);
      }
   }
}
