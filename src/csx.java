public class csx<T extends bru & bsl> extends ctj {
   private final bsa<T> a;
   private final int b;

   public csx(ctj.a $$0, bsa<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      if ($$0.B) {
         return bpv.c($$3);
      } else {
         bru $$4 = $$1.dd();
         if ($$1.bR() && $$4 instanceof bsl $$5 && $$4.ak() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, bso.d($$2));
            if ($$3.e()) {
               cto $$6 = $$3.b(ctr.qV, 1);
               return bpv.a($$6);
            }

            return bpv.a($$3);
         }

         $$1.b(avr.c.b(this));
         return bpv.c($$3);
      }
   }
}
