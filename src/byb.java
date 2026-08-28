import com.google.common.collect.ImmutableMap;

public class byb extends bxu<cjm> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public byb() {
      super(ImmutableMap.of(cff.m, cfg.b), 100);
   }

   protected boolean a(ash $$0, cjm $$1) {
      return $$1.aw() == bwn.a;
   }

   protected boolean a(ash $$0, cjm $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(ash $$0, cjm $$1, long $$2) {
      if (!$$1.bn()) {
         $$1.b(bwn.i);
         this.e = 0;
      }
   }

   protected void c(ash $$0, cjm $$1, long $$2) {
      $$1.b(bwn.a);
   }

   protected void d(ash $$0, cjm $$1, long $$2) {
      this.e++;
   }
}
