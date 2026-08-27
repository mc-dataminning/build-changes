import com.google.common.collect.ImmutableMap;

public class bod extends bnw<bzh> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bod() {
      super(ImmutableMap.of(bvh.m, bvi.b), 100);
   }

   protected boolean a(amz $$0, bzh $$1) {
      return $$1.ap() == bmr.a;
   }

   protected boolean a(amz $$0, bzh $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(amz $$0, bzh $$1, long $$2) {
      if (!$$1.bd()) {
         $$1.b(bmr.i);
         this.e = 0;
      }
   }

   protected void c(amz $$0, bzh $$1, long $$2) {
      $$1.b(bmr.a);
   }

   protected void d(amz $$0, bzh $$1, long $$2) {
      this.e++;
   }
}
