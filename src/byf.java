import com.google.common.collect.ImmutableMap;

public class byf extends bxy<cjq> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public byf() {
      super(ImmutableMap.of(cfj.m, cfk.b), 100);
   }

   protected boolean a(ash $$0, cjq $$1) {
      return $$1.aw() == bwr.a;
   }

   protected boolean a(ash $$0, cjq $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(ash $$0, cjq $$1, long $$2) {
      if (!$$1.bn()) {
         $$1.b(bwr.i);
         this.e = 0;
      }
   }

   protected void c(ash $$0, cjq $$1, long $$2) {
      $$1.b(bwr.a);
   }

   protected void d(ash $$0, cjq $$1, long $$2) {
      this.e++;
   }
}
