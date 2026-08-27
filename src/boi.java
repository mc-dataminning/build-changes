import com.google.common.collect.ImmutableMap;

public class boi extends bob<bzm> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public boi() {
      super(ImmutableMap.of(bvm.m, bvn.b), 100);
   }

   protected boolean a(and $$0, bzm $$1) {
      return $$1.ap() == bmw.a;
   }

   protected boolean a(and $$0, bzm $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(and $$0, bzm $$1, long $$2) {
      if (!$$1.bd()) {
         $$1.b(bmw.i);
         this.e = 0;
      }
   }

   protected void c(and $$0, bzm $$1, long $$2) {
      $$1.b(bmw.a);
   }

   protected void d(and $$0, bzm $$1, long $$2) {
      this.e++;
   }
}
