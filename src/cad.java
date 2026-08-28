import com.google.common.collect.ImmutableMap;

public class cad extends bzw<cls> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public cad() {
      super(ImmutableMap.of(chh.n, chi.b), 100);
   }

   protected boolean a(asb $$0, cls $$1) {
      return $$1.at() == byr.a;
   }

   protected boolean a(asb $$0, cls $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(asb $$0, cls $$1, long $$2) {
      if (!$$1.bl()) {
         $$1.b(byr.i);
         this.e = 0;
      }
   }

   protected void c(asb $$0, cls $$1, long $$2) {
      $$1.b(byr.a);
   }

   protected void d(asb $$0, cls $$1, long $$2) {
      this.e++;
   }
}
