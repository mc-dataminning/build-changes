import com.google.common.collect.ImmutableMap;

public class boj extends boc<bzn> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public boj() {
      super(ImmutableMap.of(bvn.m, bvo.b), 100);
   }

   protected boolean a(and $$0, bzn $$1) {
      return $$1.ap() == bmx.a;
   }

   protected boolean a(and $$0, bzn $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(and $$0, bzn $$1, long $$2) {
      if (!$$1.bd()) {
         $$1.b(bmx.i);
         this.e = 0;
      }
   }

   protected void c(and $$0, bzn $$1, long $$2) {
      $$1.b(bmx.a);
   }

   protected void d(and $$0, bzn $$1, long $$2) {
      this.e++;
   }
}
