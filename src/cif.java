public class cif<T extends bii & biv> extends cis {
   private final bim<T> a;
   private final int b;

   public cif(cis.a $$0, bim<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      cix $$3 = $$1.b($$2);
      if ($$0.B) {
         return bgr.c($$3);
      } else {
         bii $$4 = $$1.cZ();
         if ($$1.bN() && $$4 instanceof biv $$5 && $$4.ag() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               cix $$6 = new cix(cja.qh);
               $$6.c($$3.v());
               return bgr.a($$6);
            }

            return bgr.a($$3);
         }

         $$1.b(apg.c.b(this));
         return bgr.c($$3);
      }
   }
}
