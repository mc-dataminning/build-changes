public class cqe extends cre {
   private static final efb[] a = new efb[]{
      cpn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   public cqe(dca.d $$0) {
      super($$0);
   }

   @Override
   protected cml c() {
      return cgc.tl;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return a[this.g($$0)];
   }
}
