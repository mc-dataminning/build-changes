public class ctl<T extends bsg & bsy> extends ctx {
   private final bsm<T> a;
   private final int b;

   public ctl(ctx.a $$0, bsm<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      if ($$0.B) {
         return bqh.c($$3);
      } else {
         bsg $$4 = $$1.de();
         if ($$1.bS() && $$4 instanceof bsy $$5 && $$4.al() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, btb.d($$2));
            if ($$3.e()) {
               cuc $$6 = $$3.b(cuf.qV, 1);
               return bqh.a($$6);
            }

            return bqh.a($$3);
         }

         $$1.b(avr.c.b(this));
         return bqh.c($$3);
      }
   }
}
