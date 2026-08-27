public class ctm extends cum {
   private static final eig[] a = new eig[]{
      csv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   public ctm(dfi.d $$0) {
      super($$0);
   }

   @Override
   protected cpu c() {
      return cji.tl;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return a[this.g($$0)];
   }
}
