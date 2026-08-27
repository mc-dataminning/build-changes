public class cmp<T extends blw & bml> extends cnb {
   private final bmc<T> a;
   private final int b;

   public cmp(cnb.a $$0, bmc<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      if ($$0.B) {
         return bkd.c($$3);
      } else {
         blw $$4 = $$1.da();
         if ($$1.bO() && $$4 instanceof bml $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               cng $$6 = new cng(cnj.qU);
               $$6.c($$3.v());
               return bkd.a($$6);
            }

            return bkd.a($$3);
         }

         $$1.b(asd.c.b(this));
         return bkd.c($$3);
      }
   }
}
