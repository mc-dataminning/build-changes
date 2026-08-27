import com.google.common.collect.ImmutableMap;

public class bqw extends bqp<cce> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bqw() {
      super(ImmutableMap.of(bya.m, byb.b), 100);
   }

   protected boolean a(apa $$0, cce $$1) {
      return $$1.ap() == bpi.a;
   }

   protected boolean a(apa $$0, cce $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(apa $$0, cce $$1, long $$2) {
      if (!$$1.bd()) {
         $$1.b(bpi.i);
         this.e = 0;
      }
   }

   protected void c(apa $$0, cce $$1, long $$2) {
      $$1.b(bpi.a);
   }

   protected void d(apa $$0, cce $$1, long $$2) {
      this.e++;
   }
}
