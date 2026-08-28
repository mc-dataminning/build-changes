import com.google.common.collect.ImmutableMap;

public class bxi extends bxb<cit> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bxi() {
      super(ImmutableMap.of(cem.m, cen.b), 100);
   }

   protected boolean a(ard $$0, cit $$1) {
      return $$1.aw() == bvu.a;
   }

   protected boolean a(ard $$0, cit $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(ard $$0, cit $$1, long $$2) {
      if (!$$1.bn()) {
         $$1.b(bvu.i);
         this.e = 0;
      }
   }

   protected void c(ard $$0, cit $$1, long $$2) {
      $$1.b(bvu.a);
   }

   protected void d(ard $$0, cit $$1, long $$2) {
      this.e++;
   }
}
