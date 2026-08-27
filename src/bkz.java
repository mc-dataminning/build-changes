import com.google.common.collect.ImmutableMap;

public class bkz extends bks<bwb> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bkz() {
      super(ImmutableMap.of(bsc.m, bsd.b), 100);
   }

   protected boolean a(akn $$0, bwb $$1) {
      return $$1.an() == bjn.a;
   }

   protected boolean a(akn $$0, bwb $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(akn $$0, bwb $$1, long $$2) {
      if (!$$1.bb()) {
         $$1.b(bjn.i);
         this.e = 0;
      }
   }

   protected void c(akn $$0, bwb $$1, long $$2) {
      $$1.b(bjn.a);
   }

   protected void d(akn $$0, bwb $$1, long $$2) {
      this.e++;
   }
}
