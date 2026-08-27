import com.google.common.collect.ImmutableMap;

public class bnt extends bnm<byx> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bnt() {
      super(ImmutableMap.of(bux.m, buy.b), 100);
   }

   protected boolean a(amp $$0, byx $$1) {
      return $$1.ap() == bmh.a;
   }

   protected boolean a(amp $$0, byx $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(amp $$0, byx $$1, long $$2) {
      if (!$$1.bd()) {
         $$1.b(bmh.i);
         this.e = 0;
      }
   }

   protected void c(amp $$0, byx $$1, long $$2) {
      $$1.b(bmh.a);
   }

   protected void d(amp $$0, byx $$1, long $$2) {
      this.e++;
   }
}
