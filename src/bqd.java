import com.google.common.collect.ImmutableMap;

public class bqd extends bpw<cbl> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bqd() {
      super(ImmutableMap.of(bxh.m, bxi.b), 100);
   }

   protected boolean a(aov $$0, cbl $$1) {
      return $$1.ap() == bor.a;
   }

   protected boolean a(aov $$0, cbl $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aov $$0, cbl $$1, long $$2) {
      if (!$$1.bd()) {
         $$1.b(bor.i);
         this.e = 0;
      }
   }

   protected void c(aov $$0, cbl $$1, long $$2) {
      $$1.b(bor.a);
   }

   protected void d(aov $$0, cbl $$1, long $$2) {
      this.e++;
   }
}
