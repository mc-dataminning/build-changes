public class cie<T extends big & bit> extends cir {
   private final bik<T> a;
   private final int b;

   public cie(cir.a $$0, bik<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      if ($$0.B) {
         return bgp.c($$3);
      } else {
         big $$4 = $$1.cZ();
         if ($$1.bN() && $$4 instanceof bit $$5 && $$4.ag() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               ciw $$6 = new ciw(ciz.qh);
               $$6.c($$3.v());
               return bgp.a($$6);
            }

            return bgp.a($$3);
         }

         $$1.b(ape.c.b(this));
         return bgp.c($$3);
      }
   }
}
