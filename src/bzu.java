import com.google.common.collect.ImmutableMap;

public class bzu extends bzn<clj> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bzu() {
      super(ImmutableMap.of(cgy.n, cgz.b), 100);
   }

   protected boolean a(aru $$0, clj $$1) {
      return $$1.at() == byi.a;
   }

   protected boolean a(aru $$0, clj $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aru $$0, clj $$1, long $$2) {
      if (!$$1.bl()) {
         $$1.b(byi.i);
         this.e = 0;
      }
   }

   protected void c(aru $$0, clj $$1, long $$2) {
      $$1.b(byi.a);
   }

   protected void d(aru $$0, clj $$1, long $$2) {
      this.e++;
   }
}
