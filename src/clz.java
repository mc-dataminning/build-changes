public class clz<T extends blp & bmc> extends cmm {
   private final blt<T> a;
   private final int b;

   public clz(cmm.a $$0, blt<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      if ($$0.B) {
         return bjw.c($$3);
      } else {
         blp $$4 = $$1.da();
         if ($$1.bO() && $$4 instanceof bmc $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               cmr $$6 = new cmr(cmu.qS);
               $$6.c($$3.v());
               return bjw.a($$6);
            }

            return bjw.a($$3);
         }

         $$1.b(arw.c.b(this));
         return bjw.c($$3);
      }
   }
}
