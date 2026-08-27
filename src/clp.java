public class clp<T extends blf & bls> extends cmc {
   private final blj<T> a;
   private final int b;

   public clp(cmc.a $$0, blj<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      if ($$0.B) {
         return bjm.c($$3);
      } else {
         blf $$4 = $$1.da();
         if ($$1.bO() && $$4 instanceof bls $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               cmh $$6 = new cmh(cmk.qS);
               $$6.c($$3.v());
               return bjm.a($$6);
            }

            return bjm.a($$3);
         }

         $$1.b(arm.c.b(this));
         return bjm.c($$3);
      }
   }
}
