import com.google.common.collect.ImmutableMap;

public class bvk extends bvd<cgu> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bvk() {
      super(ImmutableMap.of(cco.m, ccp.b), 100);
   }

   protected boolean a(arb $$0, cgu $$1) {
      return $$1.ar() == btw.a;
   }

   protected boolean a(arb $$0, cgu $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arb $$0, cgu $$1, long $$2) {
      if (!$$1.bi()) {
         $$1.b(btw.i);
         this.e = 0;
      }
   }

   protected void c(arb $$0, cgu $$1, long $$2) {
      $$1.b(btw.a);
   }

   protected void d(arb $$0, cgu $$1, long $$2) {
      this.e++;
   }
}
