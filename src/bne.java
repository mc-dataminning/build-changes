import com.google.common.collect.ImmutableMap;

public class bne extends bmx<byg> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bne() {
      super(ImmutableMap.of(buh.m, bui.b), 100);
   }

   protected boolean a(ame $$0, byg $$1) {
      return $$1.ap() == bls.a;
   }

   protected boolean a(ame $$0, byg $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(ame $$0, byg $$1, long $$2) {
      if (!$$1.bd()) {
         $$1.b(bls.i);
         this.e = 0;
      }
   }

   protected void c(ame $$0, byg $$1, long $$2) {
      $$1.b(bls.a);
   }

   protected void d(ame $$0, byg $$1, long $$2) {
      this.e++;
   }
}
