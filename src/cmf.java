public class cmf<T extends blu & bmh> extends cms {
   private final bly<T> a;
   private final int b;

   public cmf(cms.a $$0, bly<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      cmx $$3 = $$1.b($$2);
      if ($$0.B) {
         return bkb.c($$3);
      } else {
         blu $$4 = $$1.da();
         if ($$1.bO() && $$4 instanceof bmh $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               cmx $$6 = new cmx(cna.qS);
               $$6.c($$3.v());
               return bkb.a($$6);
            }

            return bkb.a($$3);
         }

         $$1.b(asb.c.b(this));
         return bkb.c($$3);
      }
   }
}
