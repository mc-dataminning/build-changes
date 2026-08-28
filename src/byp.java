import com.google.common.collect.ImmutableMap;

public class byp extends byi<ckd> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public byp() {
      super(ImmutableMap.of(cft.n, cfu.b), 100);
   }

   protected boolean a(arn $$0, ckd $$1) {
      return $$1.aw() == bxd.a;
   }

   protected boolean a(arn $$0, ckd $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arn $$0, ckd $$1, long $$2) {
      if (!$$1.bm()) {
         $$1.b(bxd.i);
         this.e = 0;
      }
   }

   protected void c(arn $$0, ckd $$1, long $$2) {
      $$1.b(bxd.a);
   }

   protected void d(arn $$0, ckd $$1, long $$2) {
      this.e++;
   }
}
