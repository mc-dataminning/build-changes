public class cig<T extends bii & biv> extends cit {
   private final bim<T> a;
   private final int b;

   public cig(cit.a $$0, bim<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
      if ($$0.B) {
         return bgr.c($$3);
      } else {
         bii $$4 = $$1.cZ();
         if ($$1.bN() && $$4 instanceof biv $$5 && $$4.ag() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               ciy $$6 = new ciy(cjb.qh);
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
