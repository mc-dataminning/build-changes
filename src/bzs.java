import com.google.common.collect.ImmutableMap;

public class bzs extends bzl<clh> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bzs() {
      super(ImmutableMap.of(cgw.n, cgx.b), 100);
   }

   protected boolean a(ars $$0, clh $$1) {
      return $$1.at() == byg.a;
   }

   protected boolean a(ars $$0, clh $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(ars $$0, clh $$1, long $$2) {
      if (!$$1.bl()) {
         $$1.b(byg.i);
         this.e = 0;
      }
   }

   protected void c(ars $$0, clh $$1, long $$2) {
      $$1.b(byg.a);
   }

   protected void d(ars $$0, clh $$1, long $$2) {
      this.e++;
   }
}
