import com.google.common.collect.ImmutableMap;

public class byg extends bxz<cjr> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public byg() {
      super(ImmutableMap.of(cfk.m, cfl.b), 100);
   }

   protected boolean a(ash $$0, cjr $$1) {
      return $$1.aw() == bws.a;
   }

   protected boolean a(ash $$0, cjr $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(ash $$0, cjr $$1, long $$2) {
      if (!$$1.bn()) {
         $$1.b(bws.i);
         this.e = 0;
      }
   }

   protected void c(ash $$0, cjr $$1, long $$2) {
      $$1.b(bws.a);
   }

   protected void d(ash $$0, cjr $$1, long $$2) {
      this.e++;
   }
}
